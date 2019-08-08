package com.star.app.manage.controller;

import com.star.app.manage.common.StarBaseAppController;
import com.star.app.manage.forms.ClientUpdateForm;
import com.start.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "应用程序版本升级检查")
@RequestMapping("/starAppVersion/")
@RestController
public class StarAppVersionController implements StarBaseAppController {

    @ApiOperation("应用检查升级")
    @PostMapping("updateClientDeviceApp")
    @Override
    public Result updateClientDeviceApp(@RequestBody  ClientUpdateForm form) {
        return null;
    }
}
