package dev.bahodir.unsplashapiretrofit.fragment.fragmentforvp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import dev.bahodir.unsplashapiretrofit.R
import dev.bahodir.unsplashapiretrofit.adapter.RV
import dev.bahodir.unsplashapiretrofit.databinding.FragmentAnimalsBinding
import dev.bahodir.unsplashapiretrofit.databinding.FragmentPeopleBinding
import dev.bahodir.unsplashapiretrofit.retrofit.APIClient
import dev.bahodir.unsplashapiretrofit.retrofit.Animals
import dev.bahodir.unsplashapiretrofit.retrofit.Wallpapers
import dev.bahodir.unsplashapiretrofit.user.UnSplashAPIUser
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AnimalsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AnimalsFragment : Fragment() {
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

    private var _binding: FragmentAnimalsBinding? = null
    private val binding get() = _binding!!
    private lateinit var rv: RV

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAnimalsBinding.inflate(inflater, container, false)

        rv = RV(object : RV.OnTouchListener {
            override fun imageClick(url: String, position: Int, view: View) {
                val bundle = Bundle()
                bundle.putString("param", url)
                findNavController().navigate(R.id.action_mainFragment_to_imageFragment,bundle)
            }

        })
        binding.rv.adapter = rv


        APIClient.getRetrofit().create(Animals::class.java)
            .getAnimals().enqueue(object : Callback<UnSplashAPIUser> {
                override fun onResponse(
                    call: Call<UnSplashAPIUser>,
                    response: Response<UnSplashAPIUser>,
                ) {
                    if (response.isSuccessful) {
                        rv.submitList(response.body()?.results)
                    }
                    else {
                        Toast.makeText(requireContext(), "error", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<UnSplashAPIUser>, t: Throwable) {

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
         * @return A new instance of fragment AnimalsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AnimalsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}