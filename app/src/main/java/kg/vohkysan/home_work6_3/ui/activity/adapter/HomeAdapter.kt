package kg.vohkysan.home_work6_3.ui.activity.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.vohkysan.home_work6_3.ui.fragments.calculate.CalculateFragment
import kg.vohkysan.home_work6_3.ui.fragments.counter.CounterFragment
import kg.vohkysan.home_work6_3.ui.fragments.history.HistoryFragment

//попытался сделать с фрагментом не получилось, надо разобраться
class HomeAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CalculateFragment()
            1 -> CounterFragment()
            2 -> HistoryFragment()
            else -> CalculateFragment()
        }
    }
}