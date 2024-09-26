package kadai5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class animal {

    public static void main(String[] args) {
        // Q1: dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        dog dog1 = new dog(); // 名前「犬」をデフォルトとして設定
        System.out.println("動物の名前: " + dog1.getAnimalName());
        
        // Q2: dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        dog dog2 = new dog(3); // 動物の数を3に設定
        System.out.println("動物の数: " + dog2.getAnimalCount());
        
        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        Date currentDate = new Date();
        String formattedDate = formatter.format(currentDate);
        System.out.println("現在の日時: " + formattedDate);
    }
}
