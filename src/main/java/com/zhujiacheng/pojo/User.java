package com.zhujiacheng.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhujiacheng
 * @since 2020-10-15
 */
@Data
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("id")
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("pid")
    private Integer pid;

    @TableField("age")
    private Integer age;

}
