package com.taotao.service;

import com.taotao.entity.TbItem;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
	TaotaoResult addItem(TbItem item, String desc);
}
