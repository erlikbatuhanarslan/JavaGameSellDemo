package Business.Abstract;

import Entities.Campaign;

import java.util.List;

public interface CampaignService {
    void add(Campaign campaign);

    void update(Campaign campaign, int id);

    void delete(int id);

    List<Campaign> get();
}