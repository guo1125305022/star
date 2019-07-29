package com.star.app.manage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.star.app.manage.dao.StarBaseClientDeviceDao;
import com.star.app.manage.entity.StarBaseClientDeviceEntity;
import com.star.app.manage.service.StarBaseClientDeviceService;
import org.springframework.stereotype.Service;

@Service
public class StarBaseClientDeviceServiceImpl extends ServiceImpl<StarBaseClientDeviceDao, StarBaseClientDeviceEntity> implements StarBaseClientDeviceService {
    /**
     * 根据客户端设备唯一编码查询设备信息
     *
     * @param deviceCode 设备唯一编码
     * @return
     */
    @Override
    public StarBaseClientDeviceEntity getByDeviceCode(String deviceCode) {
        LambdaQueryWrapper<StarBaseClientDeviceEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(StarBaseClientDeviceEntity::getDeviceCode, deviceCode);
        return getOne(lambdaQueryWrapper);
    }
}
