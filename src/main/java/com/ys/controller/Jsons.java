package com.ys.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ys.po.ItemCustom;

@Controller
public class Jsons {
	@RequestMapping("/responseJson")
	@ResponseBody
	public ItemCustom responseJson(ItemCustom itemCustom) {
		System.out.println(itemCustom);
		return itemCustom;
	}

	@RequestMapping("/requestJson")
	@ResponseBody
	public  ItemCustom requestJson(@RequestBody ItemCustom itemsCustom) {
		System.out.println(itemsCustom+"xxxxxxxxx");
		// @ResponseBody将itemsCustom转成json输出
		return itemsCustom;
	}
	
	@RequestMapping("/listCus")
	@ResponseBody
	public List<ItemCustom> listCus (){
		List<ItemCustom> itemCustoms = new ArrayList<>();
		ItemCustom custom = new ItemCustom();
		custom.setCreatetime(new Date());
		custom.setName("大家好");
		
		ItemCustom custom2 = new ItemCustom();
		custom2.setCreatetime(new Date());
		custom2.setName("大家好");
		custom2.setPrice(22.22F);
		itemCustoms.add(custom);
		itemCustoms.add(custom2);
		return itemCustoms;
	}
}
