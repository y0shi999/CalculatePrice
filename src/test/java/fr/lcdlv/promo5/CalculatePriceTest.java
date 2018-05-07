package fr.lcdlv.promo5;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculatePriceTest {

    @Test
    public void shouldReturnFullPriceInNominalCaseSingle() {
        assertThat(Price.of(Formula.SINGLE))
            .isEqualTo(Formula.SINGLE.getNominalPrice());
    }

    @Test
    public void shouldReturnFullPriceInNominalCaseTwin() {
        assertThat(Price.of(Formula.TWIN))
            .isEqualTo(Formula.TWIN.getNominalPrice());
    }

    @Test
    @Parameters(
        {"SINGLE, 570",
            "TWIN, 470"})
    public void shouldReturnDecreasedPriceInLateCheckIn(Formula formula, int expectedPrice) {
        assertThat(Price.of(new Booking(formula, "Friday")))
            .isEqualTo(expectedPrice);
    }

}
