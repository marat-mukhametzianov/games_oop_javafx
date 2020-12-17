package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new IllegalStateException(String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }
        int currentX = position.getX();
        int currentY = position.getY();
        int destX = dest.getX();
        int destY = dest.getY();
        int size = Math.abs(currentX - destX);
        Cell[] result = new Cell[size];
        int deltaX = destX > currentX ? 1 : -1;
        int deltaY = destY > currentY ? 1 : -1;
        for (int i = 0; i < size; i++) {
            result[i] = Cell.findBy(currentX + deltaX, currentY + deltaY);
            currentX = currentX + deltaX;
            currentY = currentY + deltaY;
        }
        return result;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean result = true;
        int sourceX = source.getX();
        int sourceY = source.getY();
        int destX = dest.getX();
        int destY = dest.getY();
        if (Math.abs(sourceX - destX) != Math.abs(sourceY - destY)) {
            result = false;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
