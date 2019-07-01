package de.scoreboard.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import de.scoreboard.listener.ScoreboardJoin;
import de.scoreboard.utils.OnlinePlayer;

public class Scoreboards extends JavaPlugin {
	
	public static Scoreboard board;
	public static Objective obj;
	
	public static Scoreboards plugin;
	
	public void onEnable() {
		scoreboard();
		plugin = this;
		
		
		Bukkit.getPluginManager().registerEvents(new ScoreboardJoin(), this);
		
		

	}
	
	private void scoreboard() {
		
		board = Bukkit.getScoreboardManager().getMainScoreboard();
		obj = board.registerNewObjective("totde", "dummenJ");
		
		
		Team Admin = board.registerNewTeam("000Admin||||");
		Team Dev = board.registerNewTeam("002Dev||||");
		Team MBuilder = board.registerNewTeam("003MBuilder||||");
	 	Team Builder = board.registerNewTeam("004Builder||||");
		Team Azubi = board.registerNewTeam("005Azubi||||");
		Team Mod = board.registerNewTeam("006Mod||||");
		Team Sup = board.registerNewTeam("007Sup||||");
		Team Freund = board.registerNewTeam("008Freund||||");
		Team YT = board.registerNewTeam("009YT||||");
		Team Champ = board.registerNewTeam("0010Champ||||");
		Team Drache = board.registerNewTeam("0011Drache||||");
		Team Titan = board.registerNewTeam("0012Titan||||");
		Team You = board.registerNewTeam("0013You||||");
		Team Legende = board.registerNewTeam("0014Legende||||");
		Team Ultra = board.registerNewTeam("0015Ultra||||");
		Team Premium = board.registerNewTeam("0016Premium||||");
		Team Spieler = board.registerNewTeam("0017Spieler||||");
		
		Admin.setPrefix("�a[Admin]");
		Dev.setPrefix("�b[Dev]");
		MBuilder.setPrefix("�2[MBuilder]");
		Builder.setPrefix("�a[Builder]");
		Azubi.setPrefix("�d[Azubi]");
		Mod.setPrefix("�3[Mod]");
		Sup.setPrefix("�2[Sup]");
		Freund.setPrefix("�c[Freund]");
		YT.setPrefix("�5[YT�4+�5]");
		Champ.setPrefix("�e[Champ]");
		Drache.setPrefix("�4[Drache]");
		Titan.setPrefix("�9[Titan]");
		You.setPrefix("�5[YT]");
		Legende.setPrefix("�c[Legende]");
		Ultra.setPrefix("�b[Ultra]");
		Premium.setPrefix("�6[Premium]");
		Spieler.setPrefix("�7[Spieler]");
		
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName("�6�lEnderGamesMC.de");
		obj.getScore("�6�lRang").setScore(5);
		obj.getScore("�c�l" + ScoreboardJoin.prefix).setScore(4);
		obj.getScore("�1�l ").setScore(3);
		obj.getScore("�6�lOnline:").setScore(2);
		obj.getScore("�d�l" + OnlinePlayer.playersOnline + "�b�l/�c�l" + Bukkit.getMaxPlayers()).setScore(1);
		
	}

	public static Scoreboards getPlugin() {
		return plugin;
	}
	
}