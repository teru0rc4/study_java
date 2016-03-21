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
* [7. 継承](http://www.techscore.com/tech/Java/JavaIntro/7/)と[8. インスタンスの生成](http://www.techscore.com/tech/Java/JavaIntro/8/)は色々書いてあるのでしっかり読むべきるｎ

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


* 6 : [6. メソッド](http://www.techscore.com/tech/Java/JavaIntro/6/)より
  * クラスのメンバの一つ
  * クラス内に関数的なものを書く
  * メソッド内の変数はインスタンス変数と同じものも使用できる
    * インスタンス変数を扱いたいとき
      * 同じ名前の変数が無ければ、thisはいらない(付けてもよい)
      * ある時は、thisを付けて区別して扱う
  * 同じ名前で引数の数や変数型の異なるメソッドを定義できる、「オーバーローディング」を使える
  ``` java
  public String getName() { // OK
    ...
  }
  public String getName(int a, boolean b) { //OK
    ...
  }
  public String getName(boolean b, int a) { //OK
    ...
  }
  public String getName(int c, boolean b) { // NG 引数名が違うだけなのでコンパイルエラーが起きる
    ...
  }
  ```
* 7 : [7. 継承](http://www.techscore.com/tech/Java/JavaIntro/7/)より
  * 既存のclassの内容に追加する形で新しいclassを作ることができる ―> 継承
  ``` java
  public class Student extends Human {
    private String school = null;
    public String getSchool() {
      return school;
    }
    public void setSchool(String school) {
      this.school = school;
    }
    public String toString() {
      return "名前は" + name + "さんです。年は" + age + "歳です。学校は" + school + "です。";
    }
  }
```
  * extends Humanで、humanのメンバーをまるまる引き継いでstudentクラスを定義できる
    * この時、継承元のHumanをスーパークラス、継承先のクラスをサブクラスという
  * メンバ(フィールド、メソッド)にアクセス修飾子を付けて、継承や取り扱いを制限する
    * なので今回の例題では、メンバにpublicを付加してやる必要がある
  |修飾子      |意味                                                |
  |:----------|:---------------------------------------------------|
  |public	    |どのクラスからもアクセス可能                           |
  |protected	|サブクラスおよび同一パッケージのクラスからのみアクセス可能|
  |修飾子なし 	|同一パッケージのクラスからのみアクセス可能              |
  |private  	|同一クラスからのみアクセス可能                         |
  * 継承の際にメソッドの上書きをする「オーバーライド」ができる
    * 同じ名前で引数の数や変数型の異なるメソッドを定義できる、「オーバーローディング」とは微妙に違うので注意
  * オーバーライドには以下のような条件がある
    * オーバーライドする側とオーバーライドされる側の戻り値の型、メソッド名、引数の型、引数の数、引数の並び順が同じであること。
    * アクセスレベルが元のメソッドよりも緩くなっていないこと。
    * オーバーライド元のメソッドが投げる例外以外の例外を、オーバーライド先のメソッドが投げていないこと。（ただし、元のメソッドの投げる例外を限定したものであればよい。）
    * オーバーライド元のメソッドに修飾子 final がついていないこと。
    * スーパークラスで abstract として定義されているメソッドはオーバーライドするか、サブクラス自身を abstract にしなければならない。
  * 今回の問題では、インスタンスがprivateになっている
    * これをpublic、protectedに書き換えることでもできるが、アクセス制御の意味がなくなってしまう
  * そこで、値の格納、取り出しそれぞれのメソッドが実装されていることから、メソッドを介してフィールドを見れるよう、toStringを改善する
    * この時メソッドにfinal修飾子を付けないようにすること
  ``` java
  public String toString() {
    return "名前は" + getName() + "さんです。年は" + getAge() + "歳です。学校は" + school + "です。";
  }
  ```
* 8 : [8. インスタンスの生成](http://www.techscore.com/tech/Java/JavaIntro/8/)より
  * メソッドの一種に「コンストラクタ」というものがある
    * メソッドの一種である。
    * コンストラクタの名前はクラス名と同一でなければならず、返り値も指定しない（voidも書かない）。
    * メンバではない。
      * したがって継承されず、オーバーライドもできない。
      * オーバーロードはできるよ
    * クラス内で宣言されなくても、コンパイラから暗黙的に提供される。
    * インスタンスを生成するときや、他のコンストラクタからの呼び出し、＋演算子による文字列変換でのみ呼び出され、メソッド呼び出し式で直接呼び出すことは出来ない。
  * これどう活躍してるんや…

  * インスタンスの生成はmew演算子を使う
  * この時の引数の数や方で、コンストラクタが呼び出されるとか

* 9 : [9. 入出力とパッケージ](http://www.techscore.com/tech/Java/JavaIntro/9/)より
