import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatePriceTest {

    @Test
    public void shouldReturnFullPriceInNominalCaseSingle() {
        assertThat(PriceCalculator.calculatePrice(Formula.SINGLE))
            .isEqualTo(Formula.SINGLE.getPrice());
    }

    @Test
    public void shouldReturnFullPriceInNominalCaseTwin() {
        assertThat(PriceCalculator.calculatePrice(Formula.TWIN))
            .isEqualTo(Formula.TWIN.getPrice());
    }
}
