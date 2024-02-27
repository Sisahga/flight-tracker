package _flight_tracker_boot.flighttracker;

enum AircraftState {
    AIRPORT, IN_TRANSIT
}

public class Aircraft {
    protected String aircraftState;

    public Aircraft() {
    }

    public Aircraft(String aircraftState) {
        this.aircraftState = aircraftState;
    }
}
