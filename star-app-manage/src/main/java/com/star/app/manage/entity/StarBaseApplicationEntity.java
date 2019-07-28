package com.star.app.manage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.star.base.entity.StarBaseNumEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@TableName("base_application")
@ApiModel(value = "StarBaseApplicationEntity", description = "应用程序")
public class StarBaseApplicationEntity extends StarBaseNumEntity {

    @ApiModelProperty("应用程序名称")
    private String name;

    @ApiModelProperty("应用程序工程名称")
    private String engineeringName;

    @ApiModelProperty("研发机构")
    private String developmentDept;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "应用程序状态", notes = "0 正常 -1 禁用")
    private int state;

    @ApiModelProperty(value = "删除标记", notes = "0正常 -1 删除")
    private int deleteFlag;
}
