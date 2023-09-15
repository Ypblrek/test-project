package model;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class User {                //POJO- Plane old java object
//    @Null  // пройдет если в поле null
//    @NotNull   // пройдет если в поле ne null
//    @Min(5)    // не меньше 5
//    @Max(10)    // не больше 10
//    @Digits(integer = 1, fraction = 10)
    private Integer id;  //null


//    @NotEmpty    //  в строке что-то есть
//    @NotBlank     //  в строке что-то есть и не пустая
    @Pattern(regexp = "[A-Z][A-z]*")
    private String firstName;
    private String secondName;
//
//    @Pattern(regexp = "[A-z]{5}")
    private String login;

    private String password;

//    @NegativeOrZero
//    @Negative
//    @Positive
//    @PositiveOrZero
    @Min(18)
    @Max(120)
    private  Integer age;

//
    @Email
    private String email;
//
//
//    @AssertFalse   // false
//    @AssertTrue  // true
    private  Boolean isDeleted;
//
//    @Future
//    @Past
//    @FutureOrPresent
    private Date registrationDate;
}
