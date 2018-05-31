package com.chapter14;

import lombok.Data;
import lombok.ToString;

/**
 * @author:lucky date:2018/5/30
 * time:22:20
 */
@Data
@ToString
public class User {
    private String username;
    private String password;
    private String email;
}
