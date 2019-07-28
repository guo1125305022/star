package com.star.app.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.star.app.manage.entity.StarBaseApplicationEntity;

public interface StarBaseApplicationService extends IService<StarBaseApplicationEntity> {
    /**
     * 根据项目工程名称获取应用程序信息
     *
     * @param engineeringName 应用程序工程名称
     * @return
     */
    StarBaseApplicationEntity getByEngineeringName(String engineeringName);
}
