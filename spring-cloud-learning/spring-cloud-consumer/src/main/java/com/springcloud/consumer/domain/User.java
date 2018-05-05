package com.springcloud.consumer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //工具包 lombok
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String username;

    private Integer age;
    

}