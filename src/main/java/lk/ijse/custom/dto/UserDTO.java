package lk.ijse.custom.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class UserDTO implements Serializable {
    private String name;
    private String email;
    private Integer contact;
}
