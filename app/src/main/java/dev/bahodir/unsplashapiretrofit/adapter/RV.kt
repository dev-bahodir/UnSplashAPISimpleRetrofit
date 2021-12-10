package dev.bahodir.unsplashapiretrofit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.bahodir.unsplashapiretrofit.databinding.RvLayoutBinding
import dev.bahodir.unsplashapiretrofit.user.Result
import dev.bahodir.unsplashapiretrofit.user.UnSplashAPIUser

class RV(var listener: OnTouchListener) : ListAdapter<Result, RV.VH>(DU()) {

    interface OnTouchListener {
        fun imageClick(url: String, position: Int, view: View)
    }

    inner class VH(var binding: RvLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(result: Result, position: Int) {
            Picasso.get().load(result.urls.regular).into(binding.imageForRv)

            binding.imageForRv.setOnClickListener {
                listener.imageClick(result.urls.regular, position, it)
            }
        }
    }

    class DU : DiffUtil.ItemCallback<Result>() {
        override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
                return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: Result,
            newItem: Result
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(RvLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(getItem(position), position)
    }
}