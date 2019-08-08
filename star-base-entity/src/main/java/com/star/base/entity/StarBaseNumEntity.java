package com.star.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("基本实体")
public class StarBaseNumEntity {
    @TableId(type = IdType.AUTO)
    private Long id;
}
