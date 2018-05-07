import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatePriceTest {


    @Test
    public void shouldReturnFullPriceInNominalCaseSingle() {
        assertThat(PriceCalculator.calculatePrice(Formula.SINGLE))
            .isEqualTo(PriceCalculator.SINGLE_FULL_PRICE);
    }

    @Test
    public void shouldReturnFullPriceInNominalCaseTwin() {
        assertThat(PriceCalculator.calculatePrice(Formula.TWIN))
            .isEqualTo(PriceCalculator.TWIN_FULL_PRICE);
    }
}
