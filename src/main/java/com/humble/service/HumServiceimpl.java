package com.humble.service;

import com.humble.mapper.HumMapper;
import com.humble.pojo.Hum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Humbleb11
 */
@Slf4j
@Service
public class HumServiceimpl implements HumService {
@Autowired
    private HumMapper humMapper;

    @Override
    //查询所有人
    public List<Hum> list() {
        return humMapper.list();
    }
//根据Id查询
    @Override
    public Hum getById(Integer id) {
        return humMapper.getById(id);
    }
    //新增人员
    @Override
    public void save(Hum hum) {
        humMapper.insert(hum);

    }
    //删除人员
    @Override
    public void delete(Integer id) {
        humMapper.delete(id);
    }
    //修改人员
    @Override
    public void update(Hum hum) {
        humMapper.update(hum);
    }
}
