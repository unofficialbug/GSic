package com.GSic.common;

import java.io.*;
import java.util.*;
public class Person implements Serializable {
	private String username;
	private String name;
	private String password;
    private String iusername;
    private final RecoverOptions option;
	private final String passRecover;
	private Room currentRoom;
	private byte[] profileImage;
	public Profile(String userName, String password,String name,RecoverOptions option,
		String passRecover,byte[] profileImage){
		this.username =  userName;
    	this.name = name;
		this.password =  password;
		this.option = option;
		this.passRecover = passRecover;
    	this.profileImage = profileImage;
    	iusername = username;
	}
	public void setNewProfilepic(byte[] chosenprofile){
      profileImage = chosenprofile;
    }
     public void setNewPassword(String newPassword){
    	this.password = newPassword;
    }
    public void setName(String name) {
        this.name = name;
    }


    public byte[] getProfilepic(){
      return profileImage;
    }
    public RecoverOptions getRecoverOption(){
      return option;
    }
     public String getPassRecover(){
      return passRecover;
    }
    public String getUserName() {
        return username;
    }
    public String getName(){
    	return name;
    }
    public String getPassword() {
        return password;
    }

    public void joinRoom(Room room){
    	currentRoom = room;
    }
    public void leaveRoom(){
    	currentRoom = null;
    }


    public String toString(){
    	inf = username;
    	if(currentRoom !=null){
    		inf = inf + currentRoom.getName();
    	}
    	return inf; 
    }
    public Profile authenticate(String username,String password){
      if(this.username.equals(username) && this.password.equals(password)) 
        return this;
      else
        return null;
    }
} 