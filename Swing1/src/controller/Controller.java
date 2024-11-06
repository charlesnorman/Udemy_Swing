package controller;

import java.util.List;

import gui.FormEvent;
import model.AgeCategory;
import model.Database;
import model.EmploymentCategory;
import model.Gender;
import model.Person;

public class Controller {
	Database db = new Database();
	
	public List<Person> getPeople(){
		return db.getPeople();
	}

	public void addPerson(FormEvent ev) {
		String name = ev.getName();
		String occupation = ev.getOccupation();
		int ageCatId = ev.getAgeCategory();
		String empCat = ev.getEmpCat();
		boolean isUs = ev.isUsCitizen();
		String taxId = ev.getTaxID();
		String gender = ev.getGender();

		AgeCategory ageCategory = null;

		switch (ageCatId) {
		case 0:
			ageCategory = AgeCategory.child;
			break;
		case 1:
			ageCategory = AgeCategory.adult;
			break;
		case 2:
			ageCategory = AgeCategory.senior;
			break;
		}

		EmploymentCategory empCategory;
		empCategory = EmploymentCategory.employed;

		if (empCat.equals("employed")) {
			empCategory = EmploymentCategory.employed;
		} else if (empCat.equals("self-employed")) {
			empCategory = EmploymentCategory.selfEmployed;
		} else {
			empCategory = EmploymentCategory.other;
			System.err.println(empCat); 
		}
		
		Gender genderCat;
		
		if(gender.equals("male"))
		{
			genderCat = Gender.male;
		} else {
			genderCat = Gender.female;
		}
		Person person = new Person(name, occupation, ageCategory, empCategory, gender, isUs, genderCat);

		db.addPerson(person);
	}

}
