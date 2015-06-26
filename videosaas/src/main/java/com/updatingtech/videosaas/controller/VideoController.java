package com.updatingtech.videosaas.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.updatingtech.videosaas.service.*;
import com.updatingtech.videosaas.constant.*;

@Controller
@RequestMapping("/video")
public class VideoController {
	
	private static final Logger log = Logger.getLogger(VideoController.class);
	
	@Autowired(required=true)
	private VideoService videoService;
	
	@RequestMapping(value="/controller", method=RequestMethod.GET)
	public String getVideoModel(ModelMap modelMap){
		log.info("This is the service controller");
		String videoModel = videoService.getVideoModel(Constant.VIDEO_NAME);
		modelMap.addAttribute(Constant.VIDEO, videoModel);
		System.out.print("video variable laf gi day: "+Constant.VIDEO+"\n");
		return Constant.VIDEO;
	}
	
	public void setVideoService(VideoService videoService) {
		this.videoService = videoService;
	}
	
}
