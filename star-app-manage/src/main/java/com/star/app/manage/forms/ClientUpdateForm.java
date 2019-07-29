package com.star.app.manage.forms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "ClientUpdateForm", description = "客户端升级信息")
@Data
public class ClientUpdateForm {

    @ApiModelProperty("升级类型")
    private int updateType;
    @ApiModelProperty("客户端类型")
    private int clientType;
    @ApiModelProperty("客户端唯一编码")
    private int clientCode;
    @ApiModelProperty("客户端版本")
    private int clientVersion;
    @ApiModelProperty("应用程序项目名称")
    private String engineeringName;

}
