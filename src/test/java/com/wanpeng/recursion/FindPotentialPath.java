package com.wanpeng.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wanpeng on 23/02/2017.
 */
public class FindPotentialPath {


    // number of potential path from [0][0] to [m] [n]
    // only travel down and travel right
    @Test
    public void test() {

        assertEquals(2,findPath(new Coordinate(1, 1)));
        assertEquals(20, findPath(new Coordinate(3, 3)));
    }

    public static class Coordinate {
        int x, y;

        static int numberOfPotentialPath = 0;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private int findPath(Coordinate coordinate) {

        if (coordinate.getX() == 0 && coordinate.getY() == 0) {
            return 1;
        }

        if (coordinate.getX() < 0 || coordinate.getY() < 0) {
            return 0;
        }

        if (coordinate.getY() == 0) {
            return findPath(new FindPotentialPath.Coordinate(coordinate.getX() - 1, coordinate.getY()));
        }

        if (coordinate.getX() == 0) {
            return findPath(new FindPotentialPath.Coordinate(coordinate.getX(), coordinate.getY() - 1));
        }

        return findPath(new FindPotentialPath.Coordinate(coordinate.getX() - 1, coordinate.getY())) + findPath(new FindPotentialPath.Coordinate(coordinate.getX(), coordinate.getY() - 1));

    }

}
