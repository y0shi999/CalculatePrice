package fr.lcdlv.promo5;

import fr.lcdlv.promo5.Booking;
import fr.lcdlv.promo5.Formula;
import fr.lcdlv.promo5.Price;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
    public void shouldReturnDecreasedPriceInLateCheckIn() {
        assertThat(Price.of(new Booking(Formula.SINGLE, "Friday")))
            .isEqualTo(570);
    }
}
