package com.star.app.manage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.star.app.manage.dao.StarBaseApplicationDao;
import com.star.app.manage.entity.StarBaseApplicationEntity;
import com.star.app.manage.service.StarBaseApplicationService;
import org.springframework.stereotype.Service;

@Service
public class StarBaseApplicationServiceImpl extends ServiceImpl<StarBaseApplicationDao, StarBaseApplicationEntity> implements StarBaseApplicationService {
    /**
     * 根据项目工程名称获取应用程序信息
     *
     * @param engineeringName 应用程序工程名称
     * @return
     */
    @Override
    public StarBaseApplicationEntity getByEngineeringName(String engineeringName) {
        LambdaQueryWrapper<StarBaseApplicationEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(StarBaseApplicationEntity::getEngineeringName, engineeringName);
        return getOne(lambdaQueryWrapper);
    }
}
