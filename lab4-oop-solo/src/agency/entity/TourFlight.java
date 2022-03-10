package agency.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class TourFlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int flight_number;

    @Column
    private String air_company;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "tour_number")
    private Tour tour;

    @Column
    private Date departure_date;

    @Column
    private Date departure_time;

    @Column
    private String arrival_city;

    @Column
    private String departure_city;

    @Column
    private String direction;

    public TourFlight() {
    }

    public TourFlight(int flight_number, String air_company, Date departure_date, Date departure_time, String arrival_city, String departure_city, String direction) {
        this.flight_number = flight_number;
        this.air_company = air_company;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.arrival_city = arrival_city;
        this.departure_city = departure_city;
        this.direction = direction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getAir_company() {
        return air_company;
    }

    public void setAir_company(String air_company) {
        this.air_company = air_company;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Date departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    public String getDeparture_city() {
        return departure_city;
    }

    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
