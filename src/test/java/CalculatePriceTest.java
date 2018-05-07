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
        assertThat(Price.of(Formula.SINGLE, "Friday"))
            .isEqualTo(570);
    }
}
