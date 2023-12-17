package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author almost
 * @date 2023/12/10 13:27
 */

@Mapper
public interface CategoryMapper {
    @Insert("insert into category (type, name, sort, status,create_time, update_time, create_user, update_user) " +
            "values " +
            "(#{type},#{name},#{sort},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser})")
    void save(Category category);

    Page<Category> getPageQuery(CategoryPageQueryDTO categoryPageQueryDTO);


    void deleteById(Long id);


    void update(Category category);

    List<Category> getList();
}
