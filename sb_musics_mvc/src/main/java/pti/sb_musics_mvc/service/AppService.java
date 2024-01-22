package pti.sb_musics_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pti.sb_musics_mvc.db.Database;
import pti.sb_musics_mvc.dto.UserDTO;
import pti.sb_musics_mvc.model.User;

@Service
public class AppService {
	
	private Database db;
	
	@Autowired
	public AppService(Database db) {
		super();
		this.db = db;
	}


	public UserDTO getUserById(int userId) {
		
		UserDTO dto = null;	
		
		User user = db.getUserById(userId);
		
		dto = new UserDTO(
				user.getId(),
				user.getName(),
				user.getBorrowedMusicIds()
				);
		
		return dto;
	}

}
