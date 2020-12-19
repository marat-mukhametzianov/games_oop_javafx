package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A8);
        assertThat(bishopBlack.position(), is(Cell.A8));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A8);
        Figure bishopBlack1 = bishopBlack.copy(Cell.A1);
        assertThat(bishopBlack1.position(), is(Cell.A1));
    }

    @Test
    public void testWay() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = new Cell[0];
        way = bishopBlack.way(Cell.G5);
        Cell[] test = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertTrue(Arrays.equals(test, way));
    }

    @Test
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertFalse(bishopBlack.isDiagonal(bishopBlack.position(), Cell.E4));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void isNotDiagonalFirstWay() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
         bishopBlack.way(Cell.E5);
    }
}