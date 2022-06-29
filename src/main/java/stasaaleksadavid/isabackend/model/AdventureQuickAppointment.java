package stasaaleksadavid.isabackend.model;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Adventure_Quick_Appointments")
public class AdventureQuickAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Instructor_ID")
    private long instructorId;

    @Column(name = "Adventure_ID")
    private long adventureId;

    @Column(name = "Location")
    private String location;

    @Column(name = "Starting_Date")
    private LocalDate startingDate;

    @Column(name = "Ending_Date")
    private LocalDate endingDate;

    @Column(name = "Numer_Of_People")
    private int numberOfPeople ;

    @Column(name = "Additional_Services")
    private String additionalServices;

    @Column(name = "Price")
    private double price;

    public AdventureQuickAppointment() {
    }

    public AdventureQuickAppointment(long instructorId, long adventureId, String location, LocalDate startingDate, LocalDate endingDate, int numberOfPeople, String additionalServices, double price) {
        super();
        this.instructorId = instructorId;
        this.adventureId = adventureId;
        this.location = location;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.numberOfPeople = numberOfPeople;
        this.additionalServices = additionalServices;
        this.price = price;
    }

    public long getAdventureId() {
        return adventureId;
    }

    public void setAdventureId(long adventureId) {
        this.adventureId = adventureId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(long instructorId) {
        this.instructorId = instructorId;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(String additionalServices) {
        this.additionalServices = additionalServices;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
