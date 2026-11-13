package by.ruslan.radzevich.commons.dto;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WatchlistItemDto {

    private Long id;
    private String userId;
    private String coinId;
    private Instant addedAt;
}
