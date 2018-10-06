import java.awt.*;
import java.time.Period;
import java.util.Scanner;


public class Task3_5{

    public static abstract class Piece{

        int x, y;
        abstract boolean isLegalMove(Point position1, Point position2);
    }

    public static class King extends Piece{
        public King(){
            x = 1;
            y = 1;
        }

        public King(int ux, int uy){
            x = ux;
            y = uy;
        }

        public King(Point point){
            x  = (int) point.getX();
            y = (int) point.getY();
        }
        public boolean isLegalMove(Point position1, Point position2){
            if(position1.getX() > 8 || position1.getX() < 1
                    || position1.getY() < 1 || position1.getY() > 8
                    || position2.getY() < 1 || position2.getY() > 8
                    || position2.getX() < 1 || position2.getX() > 8)
                return false;
            if(Math.abs(position1.getX() - position2.getX()) <= 1
                    && Math.abs(position1.getY() - position2.getY()) <= 1)
                return true;
            return false;
        }
    }

    public static class Rook extends Piece{
        public Rook(){
            x = 1;
            y = 1;
        }

        public Rook(int ux, int uy){
            x = ux;
            y = uy;
        }

        public Rook(Point point){
            x  = (int) point.getX();
            y = (int) point.getY();
        }
        public boolean isLegalMove(Point position1, Point position2){
            if(position1.getX() > 8 || position1.getX() < 1
                    || position1.getY() < 1 || position1.getY() > 8
                    || position2.getY() < 1 || position2.getY() > 8
                    || position2.getX() < 1 || position2.getX() > 8)
                return false;
            if(position1.getY() == position2.getY() || position1.getX() == position2.getX())
                return true;
            return false;
        }
    }

    public static class Bishop extends Piece{
        public Bishop(){
            x = 1;
            y = 1;
        }

        public Bishop(int ux, int uy){
            x = ux;
            y = uy;
        }

        public Bishop(Point point){
            x  = (int) point.getX();
            y = (int) point.getY();
        }
        public boolean isLegalMove(Point position1, Point position2){
            if(position1.getX() > 8 || position1.getX() < 1
                    || position1.getY() < 1 || position1.getY() > 8
                    || position2.getY() < 1 || position2.getY() > 8
                    || position2.getX() < 1 || position2.getX() > 8)
                return false;
            if(Math.abs(position1.getY() - position2.getY()) == Math.abs(position1.getX() - position2.getX()))
                return true;
            return false;
        }
    }

    public static class Knight extends Piece{

        public Knight(){
            x = 1;
            y = 1;
        }

        public Knight(int ux, int uy){
            x = ux;
            y = uy;
        }

        public Knight(Point point){
            x  = (int) point.getX();
            y = (int) point.getY();
        }

        public boolean isLegalMove(Point position1, Point position2){
            if(position1.getX() > 8 || position1.getX() < 1
                    || position1.getY() < 1 || position1.getY() > 8
                    || position2.getY() < 1 || position2.getY() > 8
                    || position2.getX() < 1 || position2.getX() > 8)
                return false;
            if(Math.abs(position1.getY() - position2.getY()) == 1 && Math.abs(position1.getX() - position2.getX()) == 2)
                return true;

            else if(Math.abs(position1.getY() - position2.getY()) == 2 && Math.abs(position1.getX() - position2.getX()) == 1)
                return true;

            return false;
        }
    }

    public static void main(String[] args){
        Point point = new Point();
        Point point2 = new Point();
        int x1,y1;
        int x2,y2;
        Scanner scan = new Scanner(System.in);
        x1 = scan.nextInt();
        y1 = scan.nextInt();

        x2 = scan.nextInt();
        y2 = scan.nextInt();

        point.setLocation(x1,y1);

        point2.setLocation(x2, y2);
    }
}