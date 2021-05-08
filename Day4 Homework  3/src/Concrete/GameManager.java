package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {
	
	@Override
	public void sellGame(Game game, Player player) {
		System.out.println(game.get_sellingPrice() + " fiyatýndaki " + game.get_name() + " oyunu "
				+ player.get_firstName() + " adlý kullanýcýya satýlmýþtýr.");
	}

	@Override
	public void sellGame(Game game, Player player, Campaign campaign) {
	
		System.out.println(campaign.get_name() + " uygulandý.");
		System.out.println( ( game.get_sellingPrice() - ( (game.get_sellingPrice() * campaign.get_discountRate()) / 100 ) )  + " fiyatýndaki " + game.get_name() + " oyunu "
				+ player.get_firstName() + " adlý kullanýcýya satýlmýþtýr.");
	}

	@Override
	public void addGame(Game game) {
		System.out.println(game.get_name() + " eklenmiþtir.");

	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.get_name() + " silinmiþtir.");


	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.get_name() + " güncellenmiþtir.");


	}

}
