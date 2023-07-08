package Business.Concrete;

import Business.Abstract.GameService;
import DataAccess.Abstract.GameDao;
import Entities.Game;

import java.util.List;

public class GameManager implements GameService {
    GameDao gameDao;

    public GameManager(GameDao gameDao) {

        this.gameDao = gameDao;
    }

    @Override
    public void add(Game game) {
        gameDao.add(game);

    }

    @Override
    public void update(Game game, int id) {
        gameDao.update(game, id);

    }

    @Override
    public void delete(int id) {
        gameDao.delete(id);

    }

    @Override
    public List<Game> get() {

        return null;
    }


}