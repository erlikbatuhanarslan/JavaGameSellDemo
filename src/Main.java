import Business.Abstract.CampaignService;
import Business.Abstract.CustomerService;
import Business.Abstract.GameSaleService;
import Business.Concrete.CampaignManager;
import Business.Concrete.CustomerManager;
import Business.Concrete.GameSaleManager;
import Core.MernisValidation.MernisValidationManagerAdapter;
import DataAccess.Concrete.CampaignDao;
import DataAccess.Concrete.CustomerDao;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerManager(new CustomerDao(),new MernisValidationManagerAdapter());
        Customer customer1 = new Customer(1,"Batuhan","Arslan","******@gmail.com","*******","pantehonizm","***********",2001-01-01);
        CustomerService.add(customer1);

        CampaignService campaignService= new CampaignManager(new CampaignDao());
        Campaign campaign = new Campaign(1,"Oyunİndirimi", 0.50);
        campaignService.add(campaign);

        GameSaleService gameSaleService = new GameSaleManager();
        Game game = new Game(1,"God Of War", 1500 );
        gameSaleService.sale(game, customer1);
        game.setGamePrice(750);
        gameSaleService.sale(game, customer1, campaign);



    }
}