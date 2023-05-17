
import java.util.concurrent.ThreadLocalRandom;
public class Board {

    Cell[][] cells;

    public Board(int size, int snake, int ladder){

        cells = new Cell[size][size];

        for(int i=0;i<size;i++) {
            for(int j=0; j<size;j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
        addSnakesLadders(cells, snake, ladder);

    }



    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }

    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders){

        while(numberOfSnakes > 0) {

            int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(snakeTail >= snakeHead) {
                continue;
            }

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numberOfSnakes--;
        }

        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderStart >= ladderEnd) {
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            numberOfLadders--;
        }

    }





}
