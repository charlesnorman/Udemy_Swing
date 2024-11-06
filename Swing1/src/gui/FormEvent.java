package gui;

import java.util.EventObject;

public class FormEvent extends EventObject{
	
	private String name;
	private String occupation;
	private int ageCategory;
	private String empCat;
	private String taxID;
	private boolean usCitizen;
	private String gender;

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public void setEmpCat(String empCat) {
		this.empCat = empCat;
	}
	
	public String getEmpCat()
	{
		return empCat;
	}

	public FormEvent(Object source) {
		super(source);
	}
	
	public int getAgeCategory() {
		return ageCategory;
	}
	
	public String getEmploymentCategory() {
		return empCat;
	}

	public FormEvent(Object source, String name, String occupation, int ageCat, String empCat,
			String taxID, boolean usCitizen, String gender) {
		super(source);

		this.name = name;
		this.occupation = occupation;
		this.ageCategory = ageCat;
		this.empCat = empCat;
		this.taxID = taxID;
		this.usCitizen = usCitizen;
		this.gender = gender;
	}

	public String getTaxID() {
		return taxID;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

}
