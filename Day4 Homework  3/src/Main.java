import java.time.LocalDate;

import Concrete.GameManager;
import Concrete.ManualCheckManager;
import Concrete.OtherCheckManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		//System.out.println(player1.get_firstName());
		Player player2 = new Player(1,"Emirhan","Ay","12554865984",LocalDate.of(2001, 03, 22));
		Game game = new Game(1,"Call Of Duty", "Call of Duty is a first-person shooter video game", 350 );
		Campaign campaign = new Campaign(1,"Yaz Kampanyasý", 54);
				
		
		
		PlayerManager manager = new PlayerManager(new ManualCheckManager());
		manager.add(player2);
		System.out.println("-----------------------");
		manager.delete(player2);
		System.out.println("-----------------------");
		manager.update(player2);
		System.out.println("-----------------------");
		GameManager gameManager = new GameManager();
		gameManager.addGame(game);
		System.out.println("-----------------------");
		gameManager.sellGame(game, player2);
		System.out.println("-----------------------");
		gameManager.sellGame(game, player2, campaign);
		System.out.println("-----------------------");
		gameManager.deleteGame(game);
		System.out.println("-----------------------");
		gameManager.updateGame(game);

	}

}
