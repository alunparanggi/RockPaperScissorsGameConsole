package utils

class InputController {

    /**
     * this function is for finding the winner.
     * it depends on the player's hero
     * - same hero = DRAW
     * - gunting x batu = batu
     * - gunting x kertas = gunting
     * - kertas x batu = kertas
     */
    fun getTheWinner(firstPlayerHero: String, secondPlayerHero: String): String{
        val firstPlayer = "Pemain 1"
        val secondPlayer = "Pemain 2"
        println("Hasil :")
        if (firstPlayerHero == "gunting" && secondPlayerHero == "kertas") {
            return "$firstPlayer MENANG!"
        } else if (firstPlayerHero == "batu" && secondPlayerHero == "gunting") {
            return "$firstPlayer MENANG!"
        } else if (firstPlayerHero == "kertas" && secondPlayerHero == "batu") {
            return "$firstPlayer MENANG!"
        } else if (firstPlayerHero == "gunting" && secondPlayerHero == "batu") {
            return "$secondPlayer MENANG!"
        } else if (firstPlayerHero == "batu" && secondPlayerHero == "kertas") {
            return "$secondPlayer MENANG!"
        } else if (firstPlayerHero == "kertas" && secondPlayerHero == "gunting") {
            return "$secondPlayer MENANG!"
        }

        return "DRAW!"
    }

    /**
     * this function is for getting valid hero from users.
     * users need to input one of the following heroes :
     * - gunting
     * - batu
     * - kertas
     */
    fun getValidHero(): String{
        var input = readLine()?.lowercase().orEmpty()
        while (input != "batu" && input != "gunting" && input != "kertas"){
            println("Pilihan tidak tersedia, silakan ulangi!")
            input = readLine()?.lowercase().orEmpty()
        }
        return input
    }

    /**
     * ask the users if they want to play again
     * y or yes for playing once more
     * n or no for end the game
     */
    fun isPlayAgain(input:String): Boolean{
        var i = input.lowercase()
        while (i != "y" && i != "yes" && i != "n" && i != "no") {
            println("Pilihan tidak tersedia, silakan ulangi!")
            i = readLine()?.lowercase().orEmpty()
        }

        when(i){
            "y" -> return true
            "yes" -> return true
            "n" -> return false
            "no" -> return false
        }
        return false
    }

}