package air.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classAvia")
public class ClassAvia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(cascade = {CascadeType.ALL},
    mappedBy = "classAvia")
    private List<AviaTicket> aviaTickets;

    @Column(name = "class")
    private String classAvia;

    public ClassAvia() {
    }

    public ClassAvia(String classAvia) {
        this.classAvia = classAvia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<AviaTicket> getAviaTickets() {
        return aviaTickets;
    }

    public void setAviaTickets(List<AviaTicket> aviaTickets) {
        this.aviaTickets = aviaTickets;
    }

    public String getClassAvia() {
        return classAvia;
    }

    public void setClassAvia(String classAvia) {
        this.classAvia = classAvia;
    }
}
