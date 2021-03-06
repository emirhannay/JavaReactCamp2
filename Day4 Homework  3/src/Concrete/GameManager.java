package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {
	
	@Override
	public void sellGame(Game game, Player player) {
		System.out.println(game.get_sellingPrice() + " fiyatındaki " + game.get_name() + " oyunu "
				+ player.get_firstName() + " adlı kullanıcıya satılmıştır.");
	}

	@Override
	public void sellGame(Game game, Player player, Campaign campaign) {
	
		System.out.println(campaign.get_name() + " uygulandı.");
		System.out.println( ( game.get_sellingPrice() - ( (game.get_sellingPrice() * campaign.get_discountRate()) / 100 ) )  + " fiyatındaki " + game.get_name() + " oyunu "
				+ player.get_firstName() + " adlı kullanıcıya satılmıştır.");
	}

	@Override
	public void addGame(Game game) {
		System.out.println(game.get_name() + " eklenmiştir.");

	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.get_name() + " silinmiştir.");


	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.get_name() + " güncellenmiştir.");


	}

}
