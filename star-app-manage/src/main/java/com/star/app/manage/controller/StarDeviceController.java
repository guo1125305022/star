package com.star.app.manage.controller;

import com.star.app.manage.common.StarBaseDeviceController;
import com.star.app.manage.entity.StarBaseClientDeviceEntity;
import com.star.app.manage.service.StarBaseClientDeviceService;
import com.start.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "客户端设备管理")
@RequestMapping("/starDevice/")
@RestController
public class StarDeviceController implements StarBaseDeviceController {

    @Autowired
    private StarBaseClientDeviceService starBaseClientDeviceService;

    @PostMapping("registerClientDevice")
    @ApiOperation("注册客户端设备")
    @Override
    public Result registerClientDevice(StarBaseClientDeviceEntity entity) {
        return Result.ok(starBaseClientDeviceService.registerClientDevice(entity));
    }
}
