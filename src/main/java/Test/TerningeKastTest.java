package Test;

import game.TerningeKast;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerningeKastTest {

    @Test
    public void throwTheDie() {
        TerningeKast tk = new TerningeKast();
        tk.throwTheDie();
        int result = tk.getDieValue();
        Assert.assertTrue(result>=1 && result<=6);
    }

    @Test
    void getDieValue() {
        TerningeKast tk1 = new TerningeKast();
        int result = tk1.getDieValue();
        Assert.assertEquals(result,0);
    }
}