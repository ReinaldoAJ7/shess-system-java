package application;

import boardgame.Position;
import entities.Board;

public class Program {
    public static void main(String[] args) {
        System.out.println("helo world" );
        Board board = new Board(16,16);
        System.out.println(board);
    }
}
