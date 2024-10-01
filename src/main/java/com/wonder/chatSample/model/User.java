package com.wonder.chatSample.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
@ApiModel(value="sn_user对象", description="用户管理表")
public class User{

    @TableId(value ="id", type = IdType.AUTO)
    int id;
    @TableField(value = "name")
    String name;
    @TableField(value = "pwd")
    String pwd;
}
