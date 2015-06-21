package com.updatingtech.videosaas.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.updatingtech.videosaas.model.User;
import com.updatingtech.videosaas.model.VideoResponse;
import com.updatingtech.videosaas.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController{
	private static final Logger log = Logger.getLogger(UserController.class);
	
	@Autowired(required=true)
	private UserService userService;
		
	@RequestMapping(value="/register",  method = RequestMethod.POST, headers = "Content-Type=application/x-www-form-urlencoded")
	public @ResponseBody VideoResponse getVideoModel(HttpServletRequest req, HttpServletResponse res){
		JSONObject userObject = null;
		String userName = "";
		String email = "";
		String password = "";
		int userLevel;
		String age = "";
		Date  createdDate = null;
		Date  updatedDate = null;
		int classId;
		int bankId;
		User  user = new User();
		VideoResponse video = new VideoResponse();
		try {
			userObject = new JSONObject(req.getParameter("userObject"));
			userName = userObject.getString("username");
			email = userObject.getString("email");
			password = userObject.getString("password");
			userLevel = userObject.getInt("userlevel");
			age = userObject.getString("age");
//			createdDate = userObject.get
			classId  = userObject.getInt("classid");
			bankId  = userObject.getInt("bankid");
			
			//assign to user object to register
			user.setUserName(userName);
			user.setEmail(email);
			user.setPassword(password);
			user.setUserLevel(userLevel);
			user.setAge(age);
			user.setCreatedDate(createdDate);
			user.setUpdatedDate(updatedDate);
			user.setClassId(classId);
			user.setBankId(bankId);		
			//register 
			this.userService.addUser(user);			
			video.setStatus(true);
			video.setMessage("Register successfully.");
			video.setData("");
			
		} catch(JSONException e) {
			video.setStatus(false);
			video.setMessage("Server has some error.");
			video.setData("");
		}		
		return video;
		
	}

}
