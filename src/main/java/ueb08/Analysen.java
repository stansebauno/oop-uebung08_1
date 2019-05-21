package ueb08;

import org.apache.commons.lang3.tuple.Pair;

import java.io.IOException;
import java.util.*;




class Analysen {


	/**
	 * Wie viele Tore fallen durchschnittlich in jedem Spiel?
	 */
	static double torstatistikenToreProSpiel() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		double Tore = 0;
		double totalgames = 0;
		for(Spiel s: bl.spiele)
		{ Tore +=  s.getToreGast()+ s.getToreHeim();
			totalgames++;}
		double averagegoals = Tore / totalgames;
		return averagegoals;
	}

	/**
	 * Wie viele Tore fallen durchschnittlich in einem Spiel der 1. Liga?
	 */
	static double torstatustikenToreProErstligaspiel() throws IOException {

		Bundesliga bl = Bundesliga.loadFromResource();
		double Tore = 0;
		double totalgames = 0;
		for(Spiel s: bl.spiele)
		{ if(s.getGast() <= 18 && s.getHeim() <= 18){
			Tore +=  s.getToreGast()+ s.getToreHeim();
			totalgames++;}}
		double averagegoals = Tore / totalgames;
		return averagegoals;

	}

	/**
	 * Wie viele Tore fallen durchschnittlich an einem Spieltag der 2. Liga?
	 */
	static double torstatistikenToreProSpieltag2teLiga() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		double Gesamttore = 0;
		for(Spiel s: bl.spiele) {
			if (s.getGast() > 18 && s.getGast() <= 36 && s.getHeim() > 18 && s.getHeim() <= 36) {
				 Gesamttore += s.getToreHeim() + s.getToreGast();
			}
		}
		return Gesamttore/32;
	}

	/**
	 * Stimmt es, dass in den Nachmittagsspielen (15:30:00) im Schnitt mehr Tore fallen, wie in den Abendspielen?
	 */
	static boolean torstatistikenToreNachmittagsAbends() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();

		int ToreNachmittag = 0;
		int ToreAbends = 0;

		return false;
	}

	/**
	 * Stimmt es, dass Vereine der 3. Liga zuhause im Schnitt mehr Tore schießen als auswärts?
	 */
	static boolean torstatistikenToreDaheim() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		return false;
	}

	/**
	 * Wie viele Tore hat der FC Bayern München (Verein 1) erzielt?
	 */
	static int vereineToreVerein1erzielt() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		return 0;
	}

	/**
	 * Wie viele Tore hat der FC Schalke 04 (Verein 2) erhalten?
	 */
	static int vereineToreVerein2erhalten() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		return 0;
	}

	/**
	 * Wie viele Punkte hat der 1. FC Nürnberg (Verein 20)?
	 * Ein Sieg zählt 3 Punkte, ein Unentschieden 1, eine Niederlage 0 Punkte.
	 */
	static int vereineToreVerein20punkte() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		return 0;
	}

	/**
	 * Was ist das Torverhältnis des VfL Bochum (Verein 26)?
	 */
	static int vereineTorverhaeltnis26() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		return 0;
	}

	/**
	 * Hilfsklasse.
	 */
	static class VereinTore {
		String verein;
		int tore;

		public VereinTore(String v, int t) {
			this.verein = v;
			this.tore = t;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (!(o instanceof VereinTore))
				return false;
			VereinTore that = (VereinTore) o;
			return tore == that.tore && verein.equals(that.verein);
		}
	}


	/**
	 * Welche drei Vereine haben die meisten Tore zuhause geschossen, und wie viele?
	 */
	static List<VereinTore> vereineMeisteToreZuhause() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		return null;
	}

	/**
	 * Welcher Verein hat die wenigsten Tore auswärts geschossen, und wie viele?
	 */
	static VereinTore vereineWenigsteToreAuswaerts() throws IOException {
		Bundesliga bl = Bundesliga.loadFromResource();
		return null;
	}

}