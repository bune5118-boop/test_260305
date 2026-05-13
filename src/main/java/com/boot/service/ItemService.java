package com.boot.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.ui.Model;

import com.boot.dto.ItemDTO;

public interface ItemService {
	public void write(HashMap<String, String> param);
	public ArrayList<ItemDTO> list();
}
