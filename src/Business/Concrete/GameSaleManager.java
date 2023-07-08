package Business.Concrete;

import Business.Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameSaleManager implements GameSaleService {

    @Override
    public void sale(Game game, Customer customer) {
        System.out.println(game.getGameName() + "/tOyun satışı yapıldı"+ "Satış yapan oyuncu : " + customer.getFirstName());

    }

    @Override
    public void sale(Game game, Customer customer, Campaign campaign) {
        System.out.println(game.getGameName() + "/t Oyun satışı yapıldı"+ "Satış yapan oyuncu : " + customer.getFirstName() + "Kampanya Oranı : " + campaign.getDiscount() );

    }
}
