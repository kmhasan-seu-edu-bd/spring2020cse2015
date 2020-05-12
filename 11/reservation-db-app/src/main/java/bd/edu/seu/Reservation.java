package bd.edu.seu;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private String name;
    private LocalDate fromDate;
    private LocalDate toDate;

    public Reservation(int id, String name, LocalDate fromDate, LocalDate toDate) {
        this.id = id;
        this.name = name;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
