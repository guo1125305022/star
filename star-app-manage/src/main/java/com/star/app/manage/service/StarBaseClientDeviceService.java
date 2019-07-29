package com.star.app.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.star.app.manage.entity.StarBaseClientDeviceEntity;

public interface StarBaseClientDeviceService extends IService<StarBaseClientDeviceEntity> {
    /**
     * 根据客户端设备唯一编码查询设备信息
     *
     * @param deviceCode 设备唯一编码
     * @return
     */
    StarBaseClientDeviceEntity getByDeviceCode(String deviceCode);

}
