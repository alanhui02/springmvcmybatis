package com.ys.controller;

import com.ys.po.ItemCustom;
import com.ys.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *
 * <p>Title:com.ys.controller</p>
 * <p>Description: </p>
 *
 * @author y
 * @version V1.0
 * @date 2016/12/13 17:17
 */

@Controller
public class ItemsController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/queryItem")
    public ModelAndView queryItem() throws Exception {
        //调用service,查询
        List<ItemCustom> itemList = itemService.findItemList(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",itemList);
        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }
}
