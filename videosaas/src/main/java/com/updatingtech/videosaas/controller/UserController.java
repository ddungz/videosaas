package com.updatingtech.videosaas.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.updatingtech.videosaas.model.VideoResponse;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger log = Logger.getLogger(UserController.class);
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public @ResponseBody VideoResponse getVideoModel(ModelMap modelMap){
		VideoResponse video = new VideoResponse();
		video.setStatus(true);
		video.setMessage("Register successfully.");
		video.setData("adadsda");
		return video;
		
	}

}
