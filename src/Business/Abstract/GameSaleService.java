package Business.Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameSaleService {
    void sale(Game game, Customer customer);

    void sale(Game game, Customer customer, Campaign campaign);

}
