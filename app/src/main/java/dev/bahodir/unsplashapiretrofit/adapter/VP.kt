package dev.bahodir.unsplashapiretrofit.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import dev.bahodir.unsplashapiretrofit.fragment.ImageFragment
import dev.bahodir.unsplashapiretrofit.fragment.fragmentforvp.*

class VP(var fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            WallpapersFragment()
        else if (position == 1)
            NatureFragment()
        else if (position == 2)
            PeopleFragment()
        else if (position == 3)
            FashionFragment()
        else if (position == 4)
            TechnologyFragment()
        else
            AnimalsFragment()
    }
}