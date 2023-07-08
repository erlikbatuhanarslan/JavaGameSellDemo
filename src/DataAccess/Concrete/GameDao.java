package DataAccess.Concrete;

import Entities.Game;

import java.util.List;

public class GameDao implements DataAccess.Abstract.GameDao {

    @Override
    public void add(Game game) {
        System.out.println("Veri Tabanına Yeni Oyun Eklendi " + game.getGameName());

    }

    @Override
    public void update(Game game, int id) {
        System.out.println("Veri Tabanında " + id +"li" + game.getGameName() + "güncellendi" );

    }

    @Override
    public void delete(int id) {
        System.out.println("Veri Tabanından silindi " + id );

    }

    @Override
    public List<Game> get() {


        return null;
    }
}
