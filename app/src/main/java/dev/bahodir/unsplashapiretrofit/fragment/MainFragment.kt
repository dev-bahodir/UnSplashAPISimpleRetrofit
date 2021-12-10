package dev.bahodir.unsplashapiretrofit.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import dev.bahodir.unsplashapiretrofit.R
import dev.bahodir.unsplashapiretrofit.adapter.VP
import dev.bahodir.unsplashapiretrofit.databinding.BackLayoutBinding
import dev.bahodir.unsplashapiretrofit.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var vp: VP

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        vp = VP(requireActivity())
        binding.vpMain.adapter = vp

        val array = arrayOf("Wallpapers","Nature", "People", "Fashion", "Technology", "Animals")

        TabLayoutMediator(binding.tabMode, binding.vpMain) {tab, position ->
            var bind = BackLayoutBinding.inflate(layoutInflater)
            tab.customView = bind.root
            bind.tabText.text = array[position]

            if (position == 0) {
                bind.tabBack.visibility = View.VISIBLE
                bind.tabText.setTextColor(Color.WHITE)
            }
            else {
                bind.tabBack.visibility = View.INVISIBLE
                bind.tabText.setTextColor(Color.parseColor("#688ABA"))
            }
        }.attach()

        binding.tabMode.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                var bind = BackLayoutBinding.bind(tab?.customView!!)
                bind.tabBack.visibility = View.VISIBLE
                bind.tabText.setTextColor(Color.WHITE)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                var bind = BackLayoutBinding.bind(tab?.customView!!)
                bind.tabBack.visibility = View.INVISIBLE
                bind.tabText.setTextColor(Color.parseColor("#688ABA"))
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

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
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}