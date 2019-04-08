package uniba.jp.kointest01


interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImpl : HelloRepository {
    override fun giveHello() = "Hello Koin"
}