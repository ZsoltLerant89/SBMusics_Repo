package pti.sb_musics_mvc.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	

}
