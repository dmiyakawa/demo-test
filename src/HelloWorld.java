import java.io.PrintStream;

/**
 * Hello Worldと表示するクラス
 */
public class HelloWorld {
	/**
	 * Hello Worldと表示する
	 */
	public static void main(String args[]) {
		printText("Hello World");
	}
	
	/**
	 * 引数に指定されたテキストを標準出力に表示する。
	 * 
	 * @param text 表示するテキスト本体
	 */
	public static void printText(String text) {
		printTextToStream(text, System.out);
	}
	
	/**
	 * "text"に指定されたテキストを"stream"に表示する。
	 * 表示には{@code PrintStream#println()} を用いる。
	 * 
	 * @param text 表示するテキスト本体
	 * @param stream テキストを
	 */
	public static void printTextToStream(String text, PrintStream stream) {
		stream.println(text);
	}
}
