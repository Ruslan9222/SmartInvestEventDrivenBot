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
public class UserDto {

    private String id;
    private Long telegramUserId;
    private Long chatId;
    private String username;
    private String firstName;
    private String lastName;
    private Instant createdAt;
    private Instant lastActivityAt;
}
