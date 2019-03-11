import javafx.util.converter.NumberStringConverter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Homework10 {


    public static void main(String[] args) {

        HashMap<String, List> deck = new HashMap<String, List>();

        ArrayList<Integer> listOfValues = new ArrayList();

//            HashMap<String, List> deck = new HashMap<>();
            ArrayList<  Integer> cardValues = new ArrayList<>();
            String[]suits = {"Hearts", "Clubs", "Diamonds", "Spades;"};
            for (String suit : suits) {
                deck.put(suit, cardValues);
            }
            for (Integer i = 1; i < 14; i++) {
                cardValues.add(i);
            }
            for (Map.Entry<String, List> suit : deck.entrySet()){
                for (Object card : suit.getValue()){
                    System.out.println((suit.getKey() + " - " + card));


                }

            }
        }


    }
