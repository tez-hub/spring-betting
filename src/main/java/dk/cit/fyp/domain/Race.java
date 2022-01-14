package dk.cit.fyp.domain;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Race entity.
 * 
 * @author Anonymous
 *
 */
public class Race {
	
	private int raceID;
	@NotEmpty
	private String time;
	private Date date;
	@NotEmpty
	@Pattern(regexp="^[A-Za-z]*$")
	private String track;
	private int places;
	private double terms;
	@Min(1)
	private int runners;
	private Horse winner;
	private int winnerID;
	private List<Horse> placedHorses;
	private List<Integer> placedHorseIDs;
	private List<Horse> allHorses;
	private boolean settled;
	
	public int getRaceID() {
		return raceID;
	}
	
	public void setRaceID(int raceID) {
		this.raceID = raceID;
	}
	
	public String  getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTrack() {
		return track;
	}
	
	public void setTrack(String track) {
		this.track = track;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	public double getTerms() {
		return terms;
	}

	public void setTerms(double terms) {
		this.terms = terms;
	}

	public int getRunners() {
		return runners;
	}

	public void setRunners(int runners) {
		this.runners = runners;
	}

	public Horse getWinner() {
		return winner;
	}

	public void setWinner(Horse winner) {
		this.winner = winner;
	}

	public List<Horse> getPlacedHorses() {
		return placedHorses;
	}

	public void setPlacedHorses(List<Horse> placedHorses) {
		this.placedHorses = placedHorses;
	}

	public int getWinnerID() {
		return winnerID;
	}

	public void setWinnerID(int winnerID) {
		this.winnerID = winnerID;
	}

	public List<Integer> getPlacedHorseIDs() {
		return placedHorseIDs;
	}

	public void setPlacedHorseIDs(List<Integer> placedHorseIDs) {
		this.placedHorseIDs = placedHorseIDs;
	}

	public List<Horse> getAllHorses() {
		return allHorses;
	}

	public void setAllHorses(List<Horse> allHorses) {
		this.allHorses = allHorses;
	}

	public boolean isSettled() {
		return settled;
	}

	public void setSettled(boolean settled) {
		this.settled = settled;
	}
	
	@Override
	public String toString() {
		return "Race [raceID=" + raceID + ", time=" + time + ", date=" + date + ", track=" + track + ", places="
				+ places + ", terms=" + terms + ", runners=" + runners + ", winner=" + winner + ", winnerID=" + winnerID
				+ ", placedHorses=" + placedHorses + ", placedHorseIDs=" + placedHorseIDs + ", allHorses=" + allHorses
				+ ", settled=" + settled + "]";
	}
}
