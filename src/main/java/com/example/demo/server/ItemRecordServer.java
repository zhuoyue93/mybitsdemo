package com.example.demo.server;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.entity.ItemRecord;
import com.example.demo.entity.User;
import com.example.demo.mapper.ItemRecordMapper;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

public class ItemRecordServer {
    @Resource
    private ItemRecordMapper itemRecordMapper;

    /**
     * 查询记录
     * @param user user
     * @return  List<ItemRecord>
     */
    @RequestMapping("/records")
    public List<ItemRecord> queryRecord(User user) {
        return itemRecordMapper.selectList(Wrappers.<ItemRecord>lambdaQuery().eq(ItemRecord::getUserid,user.getName()));
    }


    /**
     * 购买
     * @param itemRecord itemRecord
     * @return ItemRecord
     */
    @RequestMapping("/buy")
    public ItemRecord Buy(ItemRecord itemRecord) {
        itemRecordMapper.insert(itemRecord);
        return itemRecordMapper.selectOne(Wrappers.<ItemRecord>lambdaQuery().eq(ItemRecord::getUserid,itemRecord.getId()));
    }
}
