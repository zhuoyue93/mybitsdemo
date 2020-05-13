package com.example.demo.server;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.entity.Item;
import com.example.demo.entity.ItemInfo;
import com.example.demo.mapper.ItemInfoMapper;
import com.example.demo.mapper.ItemMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/item")
public class ItemServer {
    @Resource
    private ItemMapper itemMapper;

    @Resource
    private ItemInfoMapper itemInfoMapper;



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
     * 根据pk查看详情
     * @param item item
     * @return ItemInfo
     */
    @RequestMapping("/info")
    public List<ItemInfo> getInformation(Item item) {
        return itemInfoMapper.selectList(Wrappers.<ItemInfo>lambdaQuery().eq(ItemInfo::getPkItem, item.getId()));
    }
}
