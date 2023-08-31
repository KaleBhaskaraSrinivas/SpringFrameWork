package base.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentSchedule {

	private int slotid;
	private int slotdoctorid;
	private LocalDate slotdate;
	private LocalTime slotfrom;
	private LocalTime slotto;
	private String slotstatus;

	public int getSlotid() {
		return slotid;
	}

	public void setSlotid(int slotid) {
		this.slotid = slotid;
	}

	public int getSlotdoctorid() {
		return slotdoctorid;
	}

	public void setSlotdoctorid(int slotdoctorid) {
		this.slotdoctorid = slotdoctorid;
	}

	public LocalDate getSlotdate() {
		return slotdate;
	}

	public void setSlotdate(LocalDate slotdate) {
		this.slotdate = slotdate;
	}

	public LocalTime getSlotfrom() {
		return slotfrom;
	}

	public void setSlotfrom(LocalTime slotfrom) {
		this.slotfrom = slotfrom;
	}

	public LocalTime getSlotto() {
		return slotto;
	}

	public void setSlotto(LocalTime slotto) {
		this.slotto = slotto;
	}

	public String getSlotstatus() {
		return slotstatus;
	}

	public void setSlotstatus(String slotstatus) {
		this.slotstatus = slotstatus;
	}

}
