package base.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.jdbc.core.RowMapper;

import base.models.AppointmentSchedule;

public class AppointmentScheduleMapper implements RowMapper<AppointmentSchedule> {

	@Override
	public AppointmentSchedule mapRow(ResultSet resultSet, int i) throws SQLException {
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		AppointmentSchedule appointment = new AppointmentSchedule();
		appointment.setSlotdoctorid(resultSet.getInt("slotdoctorid"));
		appointment.setSlotid(resultSet.getInt("slotid"));
		appointment.setSlotfrom(LocalTime.parse(resultSet.getString("slotfrom"), timeFormatter));
		appointment.setSlotto(LocalTime.parse(resultSet.getString("slotto"), timeFormatter));
		appointment.setSlotdate(LocalDate.parse(resultSet.getString("slotdate"), dateFormatter));
		appointment.setSlotstatus(resultSet.getString("slotstatus"));
		return appointment;
	}
}