package com.boot.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ItemDAO;
import com.boot.dto.ItemDTO;

@Service
public class ItemWriteService implements ItemService {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void write(HashMap<String, String> param) {
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		dao.write(param);		
	}

	@Override
	public ArrayList<ItemDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
