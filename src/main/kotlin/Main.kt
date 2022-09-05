
fun main(args: Array<String>) {
    var Pilih = arrayOf("Batu", "Gunting", "Kertas")
        println("Permainan Sederhana Pilih Salah Satu")
        println("====================================")
    for (item  in Pilih)
        println(item)

    println("====================================")

        print("Kamu Memilih :")
        val nilai = readLine()!!.trim().lowercase()

        print("Dia Memilih :")
        val nilai2 = readLine()!!.trim().lowercase()
        val controller = Controller(object : Callback{
            override fun tampilkanHasil(result: String) {
                print(result)


            }
        })
    controller.banding(nilai, nilai2)






}