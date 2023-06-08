package kg.vohkysan.home_work6_3.ui.fragments.counter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.vohkysan.home_work6_3.databinding.FragmentCounterBinding
import kg.vohkysan.home_work6_3.ui.activity.HomeViewModel

class CounterFragment : Fragment() {
    private lateinit var binding: FragmentCounterBinding
    private var viewModel = HomeViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCounterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initViews()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]
    }

    private fun initViews() {
        viewModel.counterMutableLiveData.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }
    }
}