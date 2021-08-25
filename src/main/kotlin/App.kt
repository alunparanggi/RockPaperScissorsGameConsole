import model.PlayerModel
import utils.AppContract
import utils.InputController

class App: AppContract {

    private val firstPlayer = PlayerModel()
    private val secondPlayer = PlayerModel()
    private val inputController = InputController()

    companion object{
        //static method
        @JvmStatic
        fun main(args: Array<String>){
            App().start()
        }
    }

    override fun start() {
        do {
            printHeader()

            //get first player's hero
            printMenu(1)
            firstPlayer.hero = inputController.getValidHero()

            //get second player's hero
            printMenu(2)
            secondPlayer.hero = inputController.getValidHero()

            //print the winner
            val theWinner = inputController.getTheWinner(firstPlayer.hero, secondPlayer.hero)
            println(theWinner)

            println("Main lagi? (y/n)")
            val input = readLine().orEmpty()
        }while (inputController.isPlayAgain(input))
    }

    override fun printHeader() {
        fun printBorder(){
            repeat(26){
                print("=")
            }
            println("")
        }
        printBorder()
        println("GAME SUIT TERMINAL VERSION")
        printBorder()
    }

    override fun printMenu(player: Int) {
        print("Pemain $player | masukan pilihan (gunting/batu/kertas) : ")
    }
}