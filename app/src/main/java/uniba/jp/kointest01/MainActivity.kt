package uniba.jp.kointest01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import timber.log.Timber
import uniba.jp.kointest01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        val viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val viewModel: MainActivityViewModel by viewModel()

        binding.viewModel = viewModel
        lifecycle.addObserver(viewModel)

        val firstPresenter: MySimplePresenter by inject()

        binding.button1.setOnClickListener {
            Timber.d(firstPresenter.sayHello())
            Timber.d(viewModel.onClick())
        }
    }
}
