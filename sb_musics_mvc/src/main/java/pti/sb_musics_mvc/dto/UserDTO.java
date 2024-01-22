package pti.sb_musics_mvc.dto;

import java.util.ArrayList;

public class UserDTO {

	private int id;
	private String name;
	private ArrayList<Integer> borrowedMusicIds;
	
	
	public UserDTO(int id, String name, ArrayList<Integer> borrowedMusicIds) {
		super();
		this.id = id;
		this.name = name;
		this.borrowedMusicIds = borrowedMusicIds;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getBorrowedMusicIds() {
		return borrowedMusicIds;
	}

	public void setBorrowedMusicIds(ArrayList<Integer> borrowedMusicIds) {
		this.borrowedMusicIds = borrowedMusicIds;
	}


	@Override
	public String toString() {
		return "UserDTO [id = " + id + ", name = " + name + ", borrowedMusicIds = " + borrowedMusicIds + "]";
	}
	
	
	
	
	
	
	
}
