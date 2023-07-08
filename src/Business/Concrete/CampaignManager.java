package Business.Concrete;

import Business.Abstract.CampaignService;
import DataAccess.Abstract.CampaignDao;
import Entities.Campaign;

import java.util.List;

public class CampaignManager implements CampaignService {
    CampaignDao campaignDao;


    public CampaignManager(CampaignDao campaignDao) {

        this.campaignDao = campaignDao;
    }

    @Override
    public void add(Campaign campaign) {
        campaignDao.add(campaign);

    }

    @Override
    public void update(Campaign campaign, int id) {
        campaignDao.update(campaign, id);

    }

    @Override
    public void delete(int id) {
        campaignDao.delete(id);

    }

    @Override
    public List<Campaign> get() {

        return null;
    }

}