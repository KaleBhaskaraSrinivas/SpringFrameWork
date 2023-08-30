package base.daos;

import java.util.List;

import base.models.Doctor;

public interface DoctorDetailsDAO {
	public List<Doctor> getAllDoctorsInfo();

	public Doctor getDoctorInfoById(int id);

}
