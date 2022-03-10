package agency.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="classHotel")
public class ClassHotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "class")
    private String classHotel;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH},
            mappedBy = "classHotel")
    private List<Hotel> hotel;

    public ClassHotel() {
    }

    public ClassHotel(String classHotel) {
        this.classHotel = classHotel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassHotel() {
        return classHotel;
    }

    public void setClassHotel(String classHotel) {
        this.classHotel = classHotel;
    }

    public List<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }
}
