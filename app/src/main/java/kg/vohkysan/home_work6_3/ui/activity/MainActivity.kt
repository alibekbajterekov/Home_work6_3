package kg.vohkysan.home_work6_3.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.vohkysan.home_work6_3.databinding.ActivityMainBinding
import kg.vohkysan.home_work6_3.ui.activity.adapter.HomeAdapter

//    - Добавить ViewPager из 3 фрагментов в MainActivity
//
//    - 1 фрагмент кнопки ‘+’ и ‘-’, при нажатии вызывать соответствующие методы у ViewModel и выполнять необходимую логику
//
//    - 2 фрагмент отображает текущее значение LiveData счетчика
//
//    - 3 фрагмент отображает список выполненных операций (просто список строковых значений, который наблюдаются у ViewModel-a)
//
//    - Для всех задач использовать один ViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = HomeAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        with(binding){
            viewPager.adapter = adapter
        }
    }
}