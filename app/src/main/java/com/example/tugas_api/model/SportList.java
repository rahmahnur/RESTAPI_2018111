package com.example.tugas_api.model;

import java.util.List;

public class SportList{
	private List<SportsItem> sports;

	public void setSports(List<SportsItem> sports){
		this.sports = sports;
	}

	public List<SportsItem> getSports(){
		return sports;
	}

	@Override
 	public String toString(){
		return 
			"SportList{" + 
			"sports = '" + sports + '\'' + 
			"}";
		}
}