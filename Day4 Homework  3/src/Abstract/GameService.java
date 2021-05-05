package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameService {
	void sellGame(Game game ,Player player);
	void sellGame(Game game ,Player player, Campaign campaign);
	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);

}
