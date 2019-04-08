package uniba.jp.kointest01

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // Simple Presenter Factory
    factory { MySimplePresenter(get()) }

    viewModel { MainActivityViewModel(get()) }
}