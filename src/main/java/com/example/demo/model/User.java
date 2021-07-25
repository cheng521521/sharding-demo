package com.example.demo.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author cpx
 * @Description
 * @date 2021/7/25
 */
@Data
@AllArgsConstructor
@TableName("t_user")
public class User {

    @TableField("user_id")
    private Integer userId;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
