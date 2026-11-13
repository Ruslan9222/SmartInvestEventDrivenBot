package by.ruslan.radzevich.commons.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoinPriceDto {

    private String id;
    private String symbol;
    private String name;
    private BigDecimal price;
    private String currency;
    private BigDecimal marketCap;
    private BigDecimal volume24h;
    private BigDecimal priceChange24h;
    private BigDecimal priceChangePercentage24h;
    private String lastUpdated;
}
