package agency;

import agency.DAO.ClientDAO;
import agency.entity.Client;

public class Test2 {
    public static void main(String[] args) {
//        PositionDAO positionDAO = new PositionDAO();
//
//        Position position = new Position("Sales");
//        positionDAO.save(position);

        ClientDAO clientDAO = new ClientDAO();

        Client client = clientDAO.get(1);
        client.setName("Salmoorbek");
        clientDAO.edit(1, client);
        clientDAO.getAll();

//        Position position1 = new Position("Pilot");
//        positionDAO.edit("HR", position1);

//        positionDAO.delete(3);
    }
}
