package dev.bahodir.unsplashapiretrofit.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import dev.bahodir.unsplashapiretrofit.R
import dev.bahodir.unsplashapiretrofit.databinding.FragmentImageBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ImageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ImageFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param: String? = null
    //private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param = it.getString(ARG_PARAM1)
            //param2 = it.getString(ARG_PARAM2)
        }
    }
    private var _binding: FragmentImageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentImageBinding.inflate(inflater, container, false)
        Picasso.get().load(param).into(binding.imageInfo)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ImageFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param: String) =
            ImageFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param)
                    //putString(ARG_PARAM2, param2)
                }
            }
    }
}