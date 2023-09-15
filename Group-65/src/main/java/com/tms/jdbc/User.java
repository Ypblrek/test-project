package com.tms.jdbc;

import lombok.Data;

@Data //Getter, Setter, RequiredArgsConstructor, ToString, EqualsAndHashCode, Value
public class User {
    private Long id;
    private String username;
    private  Boolean isAdult;
    private  Integer age;
}
