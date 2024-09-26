package kadai5;

public class dog {
    // Q1: 動物の名前を保持するフィールドを定義
    private String animalName;

    // Q2: 動物の数を保持するフィールドを定義
    private int animalCount;

    // Q3: 動物の名前に「犬」を代入するコンストラクタを作成
    public dog() {
        this.animalName = "犬";
    }

    // Q4: 動物の数を引数として受け取り、代入するコンストラクタを作成
    public dog(int count) {
        this.animalName = "犬"; // デフォルトで「犬」を設定
        this.animalCount = count;
    }

    // animalNameを取得するゲッターメソッド
    public String getAnimalName() {
        return animalName;
    }

    // animalCountを取得するゲッターメソッド
    public int getAnimalCount() {
        return animalCount;
    }
}
