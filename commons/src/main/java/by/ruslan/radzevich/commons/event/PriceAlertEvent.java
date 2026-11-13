package by.ruslan.radzevich.commons.event;

import java.math.BigDecimal;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceAlertEvent {
    private String alertId;
    private String userId;
    private String coinId;
    private BigDecimal targetPrice;
    private BigDecimal currentPrice;
    private String currency;
    private String direction;
    @Builder.Default
    private Instant triggeredAt = Instant.now();
}
