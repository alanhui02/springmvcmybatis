package com.ys.po;

/**
 * <p>Title:com.ys.po</p>
 * <p>Description: </p>
 *
 * @author y
 * @version V1.0
 * @date 2016/12/13 16:41
 */
public class ItemQueryVo {
    //添加商品的信息
    private Items items;

    //系统扩展性
    private ItemCustom itemCustom;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemCustom getItemCustom() {
        return itemCustom;
    }

    public void setItemCustom(ItemCustom itemCustom) {
        this.itemCustom = itemCustom;
    }
}
