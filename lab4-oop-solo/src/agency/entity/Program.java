package agency.entity;

import javax.persistence.*;

@Entity
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @OneToMany(cascade = {CascadeType.ALL},
//    mappedBy = "program")
//    private int program_number;

    @Column
    private String description;

    public Program() {
    }

    public Program(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getProgram_number() {
//        return program_number;
//    }
//
//    public void setProgram_number(int program_number) {
//        this.program_number = program_number;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
