public class TwoCrystalBalls {

    public static int two_crystal_balls(boolean[] breaks) {
        int jmpAmount = (int) Math.floor(Math.sqrt(breaks.length));

        int i = jmpAmount;
        for (; i < breaks.length; i += jmpAmount) {
            if (breaks[i]) {
                break;
            }
        }

        i -= jmpAmount;

        for (int j = 0; i < breaks.length; ++j, ++i) {
            if (breaks[i]) {
                return i;
            }
        }

        return -1;
    }
}
