import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Dice dice;
    Deque<Player> playerList = new LinkedList<>();
    Player winner;
    Game(){
        initialiseGameConfig();
    }


    public void initialiseGameConfig(){
        board= new Board(10, 5,4);
        dice = new Dice(1);
        winner = null;
        addPlayers();

    }


    public void addPlayers(){
        Player p1 = new Player("p1",0);
        Player p2 = new Player("p2",0);
        playerList.add(p1);
        playerList.add(p2);
    }
    public void startGame(){


        while(winner==null){
            Player playerTurn = findPlayerTurn();

            System.out.println("player turn is:" + playerTurn.playerId + " current position is: " + playerTurn.position);


            int diceNumbers = dice.rollDice();

            int playerNewPosition = playerTurn.position + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.position = playerNewPosition;

            System.out.println("player turn is:" + playerTurn.playerId + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= board.cells.length * board.cells.length-1){

                winner = playerTurn;
            }



        }

    }

    private int jumpCheck(int playerNewPosition) {
        if(playerNewPosition > board.cells.length * board.cells.length-1 ){
            return playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;

    }

    private Player findPlayerTurn() {
        Player playerTurns = playerList.removeFirst();
        playerList.addLast(playerTurns);
        return playerTurns;

    }
}
