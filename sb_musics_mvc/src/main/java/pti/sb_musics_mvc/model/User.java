package pti.sb_musics_mvc.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	
	@Column(name = "name")
	private String name;
	
	@Transient
	private ArrayList<Integer> borrowedMusicIds;
	

	public User() {
		this.borrowedMusicIds = new ArrayList<>();
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

	public void addMusicId(int musicId)
	{
		this.borrowedMusicIds.add(musicId);
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", borrowedMusicIds=" + borrowedMusicIds + "]";
	}


}
