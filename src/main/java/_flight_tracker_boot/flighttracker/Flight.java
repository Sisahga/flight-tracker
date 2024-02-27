package _flight_tracker_boot.flighttracker;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

enum FlightType {
    NON_PRIVATE_FLIGHT, PRIVATE_FLIGHT
}

@Document(collection = "flights")
public class Flight {
    @Id
    protected long flightNumber;
    protected Aircraft aircraft;
    protected Airport source;
    protected Airport destination;
    protected String scheduledDepartureTime;
    protected String actualDepartureTime;
    protected String scheduledArrivalTime;
    protected String estimatedArrivalTime;
    protected FlightType flightType;

    public Flight() {
    }

    public Flight(Aircraft aircraft, Airport source, Airport destination, long flightNumber,
            String scheduledDepartureTime, String actualDepartureTime, String scheduledArrivalTime,
            String estimatedArrivalTime, FlightType flightType) {
        this.aircraft = aircraft;
        this.source = source;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.scheduledDepartureTime = scheduledDepartureTime;
        this.actualDepartureTime = actualDepartureTime;
        this.scheduledArrivalTime = scheduledArrivalTime;
        this.estimatedArrivalTime = estimatedArrivalTime;
        this.flightType = flightType;
    }
}