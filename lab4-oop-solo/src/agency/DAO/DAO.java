package agency.DAO;

import agency.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface DAO<T> {

    public T get(int id);
    public void getAll();
    public void save(T object);
    public void edit(int id, T object);
    public void delete(int id);
    public void editByName(String name, T object);
    public void editByClientNumber(int client_number, T object);

    static SessionFactory buildSessionFactory(){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Contract.class)
                .addAnnotatedClass(Tour.class)
                .addAnnotatedClass(TourType.class)
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(Program.class)
                .addAnnotatedClass(TourTask.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Position.class)

                .buildSessionFactory();
        return factory;
    }
}
