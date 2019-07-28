package com.star.app.manage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.star.app.manage.dao.StarBaseApplicationDao;
import com.star.app.manage.entity.StarBaseApplicationEntity;
import com.star.app.manage.service.StarBaseApplicationService;
import org.springframework.stereotype.Service;

@Service
public class StarBaseApplicationServiceImpl extends ServiceImpl<StarBaseApplicationDao, StarBaseApplicationEntity> implements StarBaseApplicationService {
}
