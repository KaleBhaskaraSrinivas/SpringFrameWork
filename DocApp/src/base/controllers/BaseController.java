package base.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import base.daos.DoctorDetailsDAO;
import base.daos.UserDAO;
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
			model.addAttribute("doctorsData", doctorddal.getAllDoctorsInfo());
			return "Doctors";
		} else {
			return "wrongCred";
		}
	}

	@RequestMapping(value = "/doctorDetails", method = RequestMethod.GET)
	public String doctorDetails(@RequestParam("doctorid") int doctorid, Model model) {
		model.addAttribute("doctor", doctorddal.getDoctorInfoById(doctorid));
		System.out.println(doctorid);
		return "DoctorDetails";
	}

	@RequestMapping(value = "/doctorCalendar", method = RequestMethod.GET)
	public String doctorCalender(@RequestParam("doctorid") int doctorid, Model model) {
		model.addAttribute("doctorSchedule", doctorddal.getAppointmentScheduleById(doctorid));
		System.out.println(doctorid);
		return "DoctorCalendar";
	}

	@RequestMapping(value = "/getDoctorSchedule", method = RequestMethod.GET)
	public String doctorSchedule(@RequestParam("doctorid") int doctorid, Model model) {
		model.addAttribute("doctorSchedule", doctorddal.getAppointmentScheduleById(doctorid));
		System.out.println(doctorid);
		return "DoctorCalendar";
	}

}
