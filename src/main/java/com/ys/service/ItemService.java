package com.ys.service;

import com.ys.po.ItemCustom;
import com.ys.po.ItemQueryVo;

import java.util.List;

/**
 * <p>Title:com.ys.service</p>
 * <p>Description: </p>
 *
 * @author y
 * @version V1.0
 * @date 2016/12/13 16:56
 */
public interface ItemService {
    /**
     * 查询商品列表
     * @param itemQueryVo
     * @return
     * @throws Exception
     */
    public List<ItemCustom> findItemList(ItemQueryVo itemQueryVo) throws Exception;
}
