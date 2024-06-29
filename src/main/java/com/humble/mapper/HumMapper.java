package com.humble.mapper;

import com.humble.pojo.Hum;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Humbleb11
 */
@Mapper
public interface HumMapper {
    //查询所有人
    @Select("SELECT * FROM valorant")
    List<Hum> list();
//根据Id查询
    @Select("SELECT * FROM valorant WHERE id = #{id}")
    Hum getById(Integer id);
    //新增人员
    @Select("INSERT INTO valorant(name,rank1,capacity) VALUES(#{name},#{rank1},#{capacity})")
    void insert(Hum hum);
    //删除人员
    @Delete("DELETE FROM valorant WHERE id = #{id}")
    void delete(Integer id);
    //修改人员
    void update(Hum hum);
}