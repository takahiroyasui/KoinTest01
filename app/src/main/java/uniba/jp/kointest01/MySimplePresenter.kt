package uniba.jp.kointest01


class MySimplePresenter(private val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from $this"

}