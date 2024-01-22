package pti.sb_musics_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pti.sb_musics_mvc.dto.UserDTO;
import pti.sb_musics_mvc.service.AppService;

@Controller
public class AppController {

	private AppService service;
	
	@Autowired
	public AppController (AppService service)
	{
		super();
		this.service = service;
	}
	
	@GetMapping("/user")
	public String showUser(Model model,@RequestParam("userid") int userId)
	{
		UserDTO dto = service.getUserById(userId);
		
		model.addAttribute("user", dto);
		
		return "index.html";
	}
}
