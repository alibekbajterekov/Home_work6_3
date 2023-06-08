package kg.vohkysan.home_work6_3.ui.fragments.calculate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.vohkysan.home_work6_3.databinding.FragmentCalculateBinding
import kg.vohkysan.home_work6_3.ui.activity.HomeViewModel

class CalculateFragment : Fragment() {
    private lateinit var binding: FragmentCalculateBinding
    private var viewModel = HomeViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCalculateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initListeners()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]
    }

    private fun initListeners() {
        with(binding) {
            btnIncrement.setOnClickListener {
                viewModel.increment()
            }
            btnDecrement.setOnClickListener {
                viewModel.decrement()
            }
        }
    }
}