package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {
	
	@Override
	public void sellGame(Game game, Player player) {
		System.out.println(game.get_sellingPrice() + " fiyat�ndaki " + game.get_name() + " oyunu "
				+ player.get_firstName() + " adl� kullan�c�ya sat�lm��t�r.");
	}

	@Override
	public void sellGame(Game game, Player player, Campaign campaign) {
	
		System.out.println(campaign.get_name() + " uyguland�.");
		System.out.println( ( game.get_sellingPrice() - ( (game.get_sellingPrice() * campaign.get_discountRate()) / 100 ) )  + " fiyat�ndaki " + game.get_name() + " oyunu "
				+ player.get_firstName() + " adl� kullan�c�ya sat�lm��t�r.");
	}

	@Override
	public void addGame(Game game) {
		System.out.println(game.get_name() + " eklenmi�tir.");

	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.get_name() + " silinmi�tir.");


	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.get_name() + " g�ncellenmi�tir.");


	}

}
