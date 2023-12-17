package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author almost
 * @date 2023/12/12 22:38
 */

@Mapper
public interface dishFlavorMapper {

     void insertBatch(List<DishFlavor> flavors);

     void deleteByDishId(Long dishId);

     void updateByFlavor(List<DishFlavor> dishFlavors);
     
}
