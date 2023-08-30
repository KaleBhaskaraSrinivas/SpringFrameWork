package base.models;

public class Doctor {
	private int doctorid;
	private String fullname;
	private String specializationname;
	private String qualification;
	private byte experience;

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public byte getExperience() {
		return experience;
	}

	public void setExperience(byte experience) {
		this.experience = experience;
	}

	public String getSpecializationname() {
		return specializationname;
	}

	public void setSpecializationname(String specializationname) {
		this.specializationname = specializationname;
	}

}
