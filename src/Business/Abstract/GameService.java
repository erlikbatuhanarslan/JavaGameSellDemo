package Business.Abstract;

import Entities.Game;

import java.util.List;

public interface GameService {
    void add(Game game);

    void update(Game game, int id);

    void delete(int id);

    List<Game> get();

}