class Controller(private val callback: Callback) {

    fun banding(nilai: String, nilai2: String){
        val a = "gunting"
        val b = "kertas"
        val c = "batu"
        val d = "kamu"
        when (nilai + nilai2) {
        a + a, b + b, c + c -> {
            print("Draw")
        }
    }

    when (nilai + nilai2) {
        a + b, b + c, c + a -> {
            print(" $d Menang")
        }
    }

    when (nilai + nilai2) {
        a + c, b + a, c + b -> {
            print(" $d Kalah")
        }
    }
}
}