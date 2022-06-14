package sociallogin.sociallogin.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sociallogin.sociallogin.domain.Users;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String email;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Users toEntity(){
        return Users.builder()
                .email(email)
                .password(password)
                .build();
    }

    @Builder
    public UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
