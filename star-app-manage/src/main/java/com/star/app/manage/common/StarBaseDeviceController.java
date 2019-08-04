package com.star.app.manage.common;

import com.star.app.manage.entity.StarBaseClientDeviceEntity;
import com.star.app.manage.forms.ClientUpdateForm;
import com.start.common.Result;
import org.springframework.web.bind.annotation.RequestBody;

public interface StarBaseDeviceController {

    /**
     * 注册客户端设备
     * @param entity 客户端设备信息
     * @return
     */
    Result registerClientDevice(@RequestBody StarBaseClientDeviceEntity entity);
}
