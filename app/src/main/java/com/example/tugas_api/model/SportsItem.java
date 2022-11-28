package com.example.tugas_api.model;

public class SportsItem{
	private String idSport;
	private String strFormat;
	private String strSport;
	private String strSportIconGreen;
	private String strSportThumb;
	private String strSportDescription;

	public void setIdSport(String idSport){
		this.idSport = idSport;
	}

	public String getIdSport(){
		return idSport;
	}

	public void setStrFormat(String strFormat){
		this.strFormat = strFormat;
	}

	public String getStrFormat(){
		return strFormat;
	}

	public void setStrSport(String strSport){
		this.strSport = strSport;
	}

	public String getStrSport(){
		return strSport;
	}

	public void setStrSportIconGreen(String strSportIconGreen){
		this.strSportIconGreen = strSportIconGreen;
	}

	public String getStrSportIconGreen(){
		return strSportIconGreen;
	}

	public void setStrSportThumb(String strSportThumb){
		this.strSportThumb = strSportThumb;
	}

	public String getStrSportThumb(){
		return strSportThumb;
	}

	public void setStrSportDescription(String strSportDescription){
		this.strSportDescription = strSportDescription;
	}

	public String getStrSportDescription(){
		return strSportDescription;
	}

	@Override
 	public String toString(){
		return 
			"SportsItem{" + 
			"idSport = '" + idSport + '\'' + 
			",strFormat = '" + strFormat + '\'' + 
			",strSport = '" + strSport + '\'' + 
			",strSportIconGreen = '" + strSportIconGreen + '\'' + 
			",strSportThumb = '" + strSportThumb + '\'' + 
			",strSportDescription = '" + strSportDescription + '\'' + 
			"}";
		}
}
