package com.star.app.manage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.star.base.entity.StarBaseNumEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "StarBaseClientDeviceEntity", description = "客户端设备")
@TableName("base_client_device")
@Data
public class StarBaseClientDeviceEntity extends StarBaseNumEntity {

    @ApiModelProperty("设备类型id")
    private Long deviceTyepId;
    @ApiModelProperty("设备唯一识别码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;
    @ApiModelProperty("厂商")
    private String manufacturer;
    @ApiModelProperty("其他信息")
    private String otherInfo;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("修改时间")
    private Date updateTime;
    @ApiModelProperty("设备状态")
    private int state;
    @ApiModelProperty("系统类型")
    private String osType;
    @ApiModelProperty("系统版本")
    private String osVersion;


}
