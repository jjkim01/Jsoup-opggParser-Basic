/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opggparse;

import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author jaejin
 */
public class parse {
    public static void Parse(String userName) throws IOException {
    ArrayList<String> info = new ArrayList<>();
    Document doc = Jsoup.connect("http://www.op.gg/summoner/userName=" + userName).get();
    
    Element name = doc.select("div.Information span.Name").first();
    Element recentPlaytime = doc.select("div.TimeStamp").first();
    Element gameType = doc.select("div.GameType").first();
    Element champ = doc.select("div.ChampionImage a img").first();
    Element kill = doc.select("div.Gameitem.Lose div.Content div.KDA div.KDA span.Kill").first();
    Element death = doc.select("div.Gameitem.Lose div.Content div.KDA span.Death").first();
    Element assist = doc.select("div.Gameitem.Lose div.Content div.KDA span.Assist").first();
    Element res = doc.select("div.GameResult").first();
    
    info.add("플레이어 : " + name.text());
    info.add("최근 플레이 : " + recentPlaytime.text());
    info.add("게임종류 : " + gameType.text());
    info.add("챔피언 : " + champ.attr("alt"));
    info.add("킬 : " + kill.text());
    info.add("뎃 : " + death.text());
    info.add("어시 : " + assist.text());
    info.add("결과 : " + res.text());
    
    for(String s: info) {
        System.out.println(s);
    }
    }
}