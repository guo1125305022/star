package com.star.app.manage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.star.base.entity.StarBaseNumEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@TableName("base_app_version")
@ApiModel
@Data
public class StarBaseAppVersionEntity extends StarBaseNumEntity {
    @ApiModelProperty("应用程序Id")
    private Long appId;
    @ApiModelProperty("应用程序版本")
    private Long appVersion;
    @ApiModelProperty("应用程序版本名称")
    private String appVersionName;
    @ApiModelProperty("应用程序版本类型")
    private Long appVersionType;
    @ApiModelProperty("应用程序升级描述")
    private String updateDescribe;
    @ApiModelProperty(value = "当前版本状态",notes = "0 允许下载 -1不允许下载")
    private int state;
    @ApiModelProperty("应用程序下载地址")
    private String url;
    @ApiModelProperty(value = "应用更新等级",notes = "-1强制更新 0 正常（可忽略更新）")
    private int updateLevel;


}
