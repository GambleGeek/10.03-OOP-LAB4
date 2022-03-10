package agency.DAO;

import agency.entity.Client;
import org.hibernate.Session;

import java.util.List;

public class ClientDAO implements DAO<Client>{

    @Override
    public Client get(int id) {
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            Client client = session.get(Client.class, id);
            session.getTransaction().commit();
            return client;
        } finally {
            session.close();
        }
    }

    @Override
    public void getAll() {
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            List<Client> clients = session.createQuery("from Client")
                    .getResultList();
            for(Client c: clients) {
                System.out.println(c.toString());
            }
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    @Override
    public void save(Client client) {
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
            System.out.println("Client was saved!");
        } finally {
            session.close();
        }
    }

    @Override
    public void edit(int id, Client client) {
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            String sql = String.format("update Client set name='%s', tel_number=%d, address='%s', client_number=%d where id=%d",
                    client.getName(), client.getTel_number(), client.getAddress(), client.getClient_number(), client.getId());
            session.createQuery(sql).executeUpdate();
            session.getTransaction().commit();
            System.out.println("Client was edited!");
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void editByName(String name, Client object) {

    }

    @Override
    public void editByClientNumber(int client_number, Client client) {
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
//            String sql = String.format("update Employee set passport_number=%d, name='%s', address='%s' where id=%d",
//                    client.getPassport_number(), employee.getName(), employee.getAddress(), id);
            String sql = String.format("update Client set name='%s', tel_number=%d, address='%s' where client_number=%d",
                    client.getName(), client.getTel_number(), client.getAddress(), client.getClient_number());
            session.createQuery(sql).executeUpdate();
            session.getTransaction().commit();
            System.out.println("Client was edited!");
        } finally {
            session.close();
        }
    }

//    public void delete(int id) {
//        Session session = DAO.buildSessionFactory().getCurrentSession();
//        try {
//            session.beginTransaction();
//            Client employee = session.get(Employee.class, id);
//            session.delete(employee);
//            session.getTransaction().commit();
//            System.out.println("Worker was deleted!");
//        } finally {
//            session.close();
//        }
//    }
}
