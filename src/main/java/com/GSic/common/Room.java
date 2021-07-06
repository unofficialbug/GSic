package com.GSic.common;

import java.io.*;
import java.util.*;

public class Room{
	private Vector<Person> members;
	private String createdTime;
	private Person owner;
	private final String password;
	private String state;
	private String name;
	private byte[] roomIcon;


	public Room(Person owner, String name ,String state, byte[] roomIcon){
		members = new Vector<>();
		this.owner = owner;
		members.add(this.owner);
		this.state = state;
		this.name = name;
		this.roomIcon = roomIcon;
		createdTime = Time. getTime();
		password = Long.toString(Time.getMilli()) + owner.getUserName();
	}


	public void setOwner(Person newOwner){
		this.owner =  newOwner;
	}
	public void setState(String state){
		this.state =  state;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setIcon(byte[] roomIcon){
		this.roomIcon = roomIcon;
	}


	public byte[] getRoomIcon(){
		return roomIcon;
	}
	public String getName(){
		return name;
	}
	public String getCreatedTime(){
		return createdTime;
	}
	public String getPassword(){
		return password;
	} 
	public String getState(){
		return state;
	}
	public Person getOwner(){
		return owner;
	}
	public Vector<Person> getMembers(){
		return members;
	}

	public void addMember(Person newMember){
		members.add(newMember);
	}
	public void removeMember(Person member){
		if(members.contais(member)){
			members.remove(member);
		}
	}
	public String toString(){
		return name + "\t\t owner: " + owner.getUserName() +"\t\t"+
		createdTime + "\nmembers: "+members.size();
	}

}