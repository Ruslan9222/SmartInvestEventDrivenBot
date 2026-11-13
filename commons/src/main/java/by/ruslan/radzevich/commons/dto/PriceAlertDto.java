package by.ruslan.radzevich.commons.dto;

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
public class PriceAlertDto {

    private String id;
    private String userId;
    private String coinId;
    private BigDecimal targetPrice;
    private String direction;
    private String currency;
    private boolean active;
    private Instant createdAt;
}
