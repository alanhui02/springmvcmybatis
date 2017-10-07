package com.ys.service;

import com.ys.mapperdao.ItemsMapperCustom;
import com.ys.po.ItemCustom;
import com.ys.po.ItemQueryVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>Title:com.ys.service</p>
 * <p>Description: </p>
 *
 * @author y
 * @version V1.0
 * @date 2016/12/13 16:57
 */
public class ItemServiceImpl implements ItemService {

    //mapper
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    @Override
    public List<ItemCustom> findItemList(ItemQueryVo itemQueryVo) throws Exception {
        return itemsMapperCustom.findItemList(itemQueryVo);
    }
}
