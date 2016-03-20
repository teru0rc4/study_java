# java チュートリアルメモ
勉強したこと・することのメモ。
適宜更新する。

#### みたとこ
* [TECHSCORE Java入門](http://www.techscore.com/tech/Java/JavaIntro/index/)
* [JavaDrive](http://www.javadrive.jp/start/)
* [一番かんたんなjava入門](http://nobuo-create.net/java-beginner-3/)

#### 各フォルダの内容について
[TECHSCORE Java入門](http://www.techscore.com/tech/Java/JavaIntro/index/)を、上からばーっと勉強したことまとめ
##### JavaDrive
~~今後ここ以外で勉強するかは不明~~
* 2 : [2. Java基礎知識](http://www.techscore.com/tech/Java/JavaIntro/2/)より

* 3 : [3. 変数](http://www.techscore.com/tech/Java/JavaIntro/3/)より
  * intとcharを + で繋いで出力すると不思議なことに
  ``` java
  class sample01{
    public static void main(String[] args) {
      int a = 10;
      char b = 'a';
      System.out.println(b + a); // 107
    }
  }
  ```
  * float型に3.14を入れようとしたら、「精度が低下している可能性」というエラーが出たので、double採用
    * floatはどこで使えばいいんだろう…

* 4 : [4. クラス](http://www.techscore.com/tech/Java/JavaIntro/4/)より
  * クラス修飾子のpublicは、1ファイルに1つだけ
  * そして、publicクラスのクラスメイトファイル名は同じでなければいけない
  * クラスの要素(メンバ)には、フィールドまたはメソッドが存在する
  ``` java
  [クラス修飾子] class クラス名 {
    フィールドまたはメソッドの宣言
  }
  ```

* 5 : [5. フィールド](http://www.techscore.com/tech/Java/JavaIntro/5/)より
  * クラスのメンバの一つ
  * クラス変数orインスタンス変数のことっぽい
    * >モノの持つ属性であるフィールドは、Java のプログラム上ではクラス変数もしくはインスタンス変数として表現することができます
    * ?????
  * クラス変数 : クラスに属する変数、アプリケーション内で共通
  * インスタンス変数 : インスタンスに属する変数、インスタンスごとに異なる
    * >インスタンスはクラスを基にして生成される個々の事物（ここでは人）で、 それぞれが固有の名前と年齢を持っています
    * ???????
  ``` java
  public class Human {
    private String name = null; // インスタンス変数
    private int age = -1; // インスタンス変数
    private static int NUM_EYE = 2; // クラス変数
  }
  ```
  * 変わりうるものはインスタンス変数として宣言する
  * 初期値を入れておくことも可能
    * この段階では、まだ枠組みができただけで、どんな人なのかは決まっていない
    * それはインスタンスを生成して、そこに記述するらしい
    * 一人ひとり異なるインスタンス変数を持つことで、個人を定義(っぽく)できる
  * 修飾子に static を付けることで、クラス変数を定義する
  * すべてのインスタンスで共通・共有するのものをクラス変数として宣言する
    * 一方で「人は目を2つ持つ」というのは、人が変わっても変わらないこと
    * どんなインスタンスでも変わらない
    * 今回のような定数的な使い方なら、final修飾子でも構わない
  * 同じ値を持つのではなく、一つの変数をすべてのインスタンスが共通して使っているらしい
    * なので変更すると、他の場所でも全部変更される
