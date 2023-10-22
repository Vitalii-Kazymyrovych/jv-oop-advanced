package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int randomColorIndex = random.nextInt(Color.values().length);
        return Color.values()[randomColorIndex];
    }
}