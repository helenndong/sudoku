public class main {

    public static void main(String[] args) {

        SudokuSolver sudokuSolver = new SudokuSolver();

//        int[][] board = {
//                {0, 0, 3, 0, 0, 9, 0, 2, 0},
//                {0, 0, 0, 0, 0, 0, 0, 7, 0},
//                {0, 4, 2, 0, 7, 5, 8, 0, 0},
//                {8, 0, 0, 7, 0, 0, 0, 5, 0},
//                {0, 0, 0, 3, 4, 0, 1, 0, 6},
//                {0, 9, 6, 0, 0, 2, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 9, 3, 0},
//                {0, 5, 7, 0, 6, 0, 0, 0, 8},
//                {1, 0, 0, 4, 8, 0, 0, 0, 5}
//        };

        int[][] board = sudokuSolver.getUserInputBoard();

        sudokuSolver.printBoard(board);
        System.out.println();

        if (sudokuSolver.solveBoard(board)) {
            System.out.println("Solved successfully!");
        }
        else {
            System.out.println("Unsolvable board");
        }

        sudokuSolver.printBoard(board);

    }
}
