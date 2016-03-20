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
* 1 : [2. Java基礎知識](http://www.techscore.com/tech/Java/JavaIntro/2/)より
* 2 : [3. 変数](http://www.techscore.com/tech/Java/JavaIntro/3/)より
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
