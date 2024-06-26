package net.multylands.greenfilter.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static String replace(String text) {
        return text.replace("ⓐ", "a")
                .replace("ⓑ", "b")
                .replace("ⓒ", "c")
                .replace("ⓓ", "d")
                .replace("ⓔ", "e")
                .replace("ⓕ", "f")
                .replace("ⓖ", "g")
                .replace("ⓗ", "h")
                .replace("ⓘ", "i")
                .replace("ⓙ", "j")
                .replace("ⓚ", "k")
                .replace("ⓛ", "l")
                .replace("ⓜ", "m")
                .replace("ⓝ", "n")
                .replace("ⓞ", "o")
                .replace("ⓟ", "p")
                .replace("ⓠ", "q")
                .replace("ⓡ", "r")
                .replace("ⓢ", "s")
                .replace("ⓣ", "t")
                .replace("ⓤ", "u")
                .replace("ⓥ", "v")
                .replace("ⓦ", "w")
                .replace("ⓧ", "x")
                .replace("ⓨ", "y")
                .replace("Ⓐ", "a")
                .replace("Ⓑ", "b")
                .replace("Ⓒ", "c")
                .replace("Ⓓ", "d")
                .replace("Ⓔ", "e")
                .replace("Ⓕ", "f")
                .replace("Ⓖ", "g")
                .replace("Ⓗ", "h")
                .replace("Ⓘ", "i")
                .replace("Ⓙ", "j")
                .replace("Ⓚ", "k")
                .replace("Ⓛ", "l")
                .replace("Ⓜ", "m")
                .replace("Ⓝ", "n")
                .replace("Ⓞ", "o")
                .replace("Ⓟ", "p")
                .replace("Ⓠ", "q")
                .replace("Ⓡ", "r")
                .replace("Ⓢ", "s")
                .replace("Ⓣ", "t")
                .replace("Ⓤ", "u")
                .replace("Ⓥ", "v")
                .replace("Ⓦ", "w")
                .replace("Ⓧ", "x")
                .replace("Ⓨ", "y")
                .replace("Ⓩ", "z")
                .replace("ა", "a")
                .replace("ბ", "b")
                .replace("გ", "g")
                .replace("დ", "d")
                .replace("ე", "e")
                .replace("ვ", "v")
                .replace("ზ", "z")
                .replace("თ", "t")
                .replace("ი", "i")
                .replace("კ", "k")
                .replace("ლ", "l")
                .replace("მ", "m")
                .replace("ნ", "n")
                .replace("ო", "o")
                .replace("პ", "p")
                .replace("ჟ", "j")
                .replace("რ", "r")
                .replace("ს", "s")
                .replace("ტ", "t")
                .replace("უ", "u")
                .replace("ფ", "f")
                .replace("ქ", "q")
                .replace("ღ", "r")
                .replace("ყ", "y")
                .replace("შ", "sh")
                .replace("ჩ", "ch")
                .replace("ც", "c")
                .replace("ძ", "z")
                .replace("წ", "w")
                .replace("ჭ", "w")
                .replace("ხ", "x")
                .replace("ჯ", "j")
                .replace("ჰ", "h")
                .replaceAll("[^A-Za-z., აბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩⒶⒷⒸⒹⒺⒻⒼⒽⒾⒿⓀⓁⓂⓃⓄⓅⓆⓇⓈⓉⓊⓋⓌⓍⓎⓏ]", "");
    }
    public static List<String> replacePlaceholdersList(List<String> oldList, String playerName, String reason) {
        List<String> newList = new ArrayList<>();
        for (String command : oldList) {
            newList.add(command.replace("%player%", playerName).replace("%reason%", reason));
        }
        return newList;
    }
    public static String replacePlaceholders(String text, String playerName, String reason) {
            return text.replace("%player%", playerName).replace("%reason%", reason);
    }
    public static String replacePlayer(String text, String playerName) {
        return text.replace("%player%", playerName);
    }
}
