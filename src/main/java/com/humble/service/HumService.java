package com.humble.service;

import com.humble.pojo.Hum;

import java.util.List;

/**
 * @author Humbleb11
 */
public interface HumService {
   //查询所有人
    List<Hum> list();
//根据Id查询
    Hum getById(Integer id);
    //新增人员
    void save(Hum hum);
    //删除人员
    void delete(Integer id);
    //修改人员
    void update(Hum hum);
}
