package com.updatingtech.videosaas.daoImpl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.updatingtech.videosaas.dao.VideoDao;

@Repository
public class VideoDaoImpl implements VideoDao {
	
	private static final Logger log = Logger.getLogger(VideoDaoImpl.class);
	
	@Override
	public String getVideoModel(String videoModel) {
		log.info("This is video model");
		return videoModel;
	}
}
