import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatePriceTest {

    @Test
    public void shouldReturnFullPriceInNominalCaseSingle() {
        Assertions.assertThat(PriceCalculator.calculatePrice("Single"))
            .isEqualTo(PriceCalculator.SINGLE_FULL_PRICE);
    }
}
