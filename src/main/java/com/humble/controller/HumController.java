package com.humble.controller;
import com.humble.pojo.Result;
import com.humble.pojo.Hum;
import com.humble.service.HumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/Hum")
public class HumController {
    @Autowired
    private HumService humService;
    //查询所有人
    @GetMapping
    public Result list(){
        log.info("查询所有人");
        List<Hum> humList = humService.list();
        return Result.success(humList);
    }
    //根据Id查询
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("查询Id为{}", id);
        Hum hum = humService.getById(id);
        return Result.success(hum);
    }
    //新增人员
    @PostMapping
    public Result save(@RequestBody Hum hum){
        log.info("新增人员{}", hum);
        humService.save(hum);
        return Result.success();
    }
    //删除人员
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除Id为{}", id);
        humService.delete(id);
        return Result.success();
    }
    //修改人员
    @PutMapping("/{id}")
    public Result update( @RequestBody Hum hum){
        log.info("修改人员{}",  hum);
        humService.update(hum);
        return Result.success();
    }
}