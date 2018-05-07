package fr.lcdlv.promo5;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculatePriceTest {

    @Test
    @Parameters(
        {
            "SINGLE, 610",
            "TWIN, 510"
        })
    public void shouldReturnFulPriceInNominalCase(Formula formula, int expectedPrice) {

        assertThat(new Booking(formula, new CheckIn("Thursday"), new CheckOut("Sunday", 15)).getPrice())
            .isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 570",
            "TWIN, 470"
        })
    public void shouldReturnDecreasedPriceInLateCheckIn(Formula formula, int expectedPrice) {
        assertThat(Price.of(new Booking(formula, new CheckIn("Friday"), new CheckOut("Sunday", 15))))
            .isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 570",
            "TWIN, 470"
        })
    public void shouldReturnDecreasedPriceInEarlyCheckOut(Formula formula, int expectedPrice) {

        assertThat(new Booking(formula, new CheckIn("Thursday"), new CheckOut("Sunday", 11)).getPrice())
            .isEqualTo(expectedPrice);
    }


}
