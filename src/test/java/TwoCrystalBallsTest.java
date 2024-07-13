import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoCrystalBallsTest {

    @Test
    void twoCrystalBalls(){

        int idx = (int) Math.floor(Math.random() * 10000);
        boolean[] data = new boolean[10000];

        Arrays.fill(data, false);

        for (int i = idx; i < 10000; i++) {
            data[i] = true;
        }

        boolean[] array = new boolean[821];
        Arrays.fill(array, false);
        assertEquals(TwoCrystalBalls.two_crystal_balls(data), idx);
        assertEquals(TwoCrystalBalls.two_crystal_balls(array), -1);
    }
}
