package com.chapter3;

import lombok.Data;
import lombok.ToString;

/**
 * @author:lucky date:2018/5/29
 * time:17:01
 */

/**
 * 自动装配,    一种是byType，一种是根据name
 */
@Data
@ToString
public class Parent {
    private String name;
    private Child child;
}
