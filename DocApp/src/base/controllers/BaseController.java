package base.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import base.daos.DoctorDetailsDAO;
import base.daos.UserDAO;
import base.models.Doctor;
import base.models.User;
import base.models.UserCred;

@Controller
public class BaseController {

	UserDAO userdal;
	DoctorDetailsDAO doctorddal;

	@Autowired
	public BaseController(UserDAO u, DoctorDetailsDAO dd) {
		userdal = u;
		doctorddal = dd;
	}

	@RequestMapping(value = "/verifyLogin", method = RequestMethod.POST)
	public String home(UserCred userCred, Model model) {
		String password = userCred.getPassword();
		User user = userdal.getUserById(userCred.getUsername());
		if (password.equals(user.getuPass())) {
			return "Doctors";
		} else {
			return "wrongCred";
		}
	}

	@RequestMapping(value = "/getDoctorsList", method = RequestMethod.GET)
	@ResponseBody
	public List<Doctor> last() {
		return (ArrayList<Doctor>) doctorddal.getAllDoctorsInfo();
	}

	@RequestMapping(value = "/doctorCalendar", method = RequestMethod.GET)
	public String doctorCalender(@RequestParam("doctorid") int doctorid, Model model) {
		System.out.println(doctorid);
		return "DoctorCalendar";
	}

}
