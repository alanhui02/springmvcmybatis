package com.ys.mapperdao;

import com.ys.po.ItemCustom;
import com.ys.po.ItemQueryVo;

import java.util.List;

/**
 * <p>Title:com.ys.mapperdao</p>
 * <p>Description: </p>
 *
 * @author y
 * @version V1.0
 * @date 2016/12/13 16:48
 */
public interface ItemsMapperCustom {
    //商品查询列表
    public List<ItemCustom> findItemList(ItemQueryVo itemQueryVo) throws Exception;

}
