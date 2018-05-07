package fr.lcdlv.promo5;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculatePriceTest {

    private CheckIn nominalCheckIn;
    private CheckOut nominalCheckOut;
    private CheckIn lateCheckIn;
    private CheckOut earlyCheckOut;

    @Before
    public void setUp() throws Exception {
        nominalCheckIn = new CheckIn("Thursday");
        nominalCheckOut = new CheckOut("Sunday", 15);
        lateCheckIn = new CheckIn("Friday");
        earlyCheckOut = new CheckOut("Sunday", 11);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 610",
            "TWIN, 510"
        })
    public void shouldReturnFulPriceInNominalCase(Formula formula, int expectedPrice) {

        assertThat(new Booking(formula, nominalCheckIn, nominalCheckOut).getPrice())
            .isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 570",
            "TWIN, 470"
        })
    public void shouldReturnDecreasedPriceInLateCheckIn(Formula formula, int expectedPrice) {
        assertThat(new Booking(formula, lateCheckIn, nominalCheckOut).getPrice())
            .isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 570",
            "TWIN, 470"
        })
    public void shouldReturnDecreasedPriceInEarlyCheckOut(Formula formula, int expectedPrice) {
        assertThat(new Booking(formula, nominalCheckIn, earlyCheckOut).getPrice())
            .isEqualTo(expectedPrice);
    }


}
