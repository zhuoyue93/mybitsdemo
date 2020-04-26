package com.example.demo.server;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.entity.Item;
import com.example.demo.mapper.ItemMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemServer {
    @Resource
    private ItemMapper itemMapper;



    /**
     * 列表查看
     * @param item item
     * @return List<Item>
     */
    @GetMapping("/list")
    public List<Item> shopping(Item item) {
        return itemMapper.selectList(Wrappers.<Item>lambdaQuery());
    }

    /**
     * 查看详情
     * @param item item
     * @return Item
     */
    @RequestMapping("/infor")
    public Item getInformation(Item item) {
        return itemMapper.selectOne(Wrappers.<Item>lambdaQuery().eq(Item::getId,item.getId()));
    }
}
