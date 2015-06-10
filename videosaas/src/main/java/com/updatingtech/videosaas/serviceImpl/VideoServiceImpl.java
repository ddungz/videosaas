package com.updatingtech.videosaas.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.updatingtech.videosaas.dao.VideoDao;
import com.updatingtech.videosaas.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired(required=true)
	private VideoDao videoDao;
	
	@Override
	public void insert() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void delete() {
		
	}

	@Override
	public String getVideoModel(String videoModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
