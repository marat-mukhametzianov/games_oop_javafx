package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test
    public void testMove() throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
//        BishopBlack bishopBlackGiven = new BishopBlack(Cell.A1);
//        BishopBlack theOther = new BishopBlack(Cell.A2);
//        Logic logic = new Logic();
//        logic.add(bishopBlackGiven);
//        logic.add(theOther);
//        logic.move(Cell.A1, Cell.C3);
//        assertTrue(logic.fi);
    }
}