package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureArea {

    public IsoscelesTrapezoid(int sideA, int sideB, int height) {
        super(sideA, sideB, height);
    }

    @Override
    public double getArea() {
        return ((getSideA() + getSideB()) / 2) * getHeight();
    }
}