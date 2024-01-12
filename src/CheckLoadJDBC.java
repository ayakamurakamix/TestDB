import java.lang.reflect.InvocationTargetException;

public class CheckLoadJDBC {

	public static void main(String[] args) throws
	InstantiationException,IllegalAccessException{
		// TODO 自動生成されたメソッド・スタブ
		String msg="";
		
		try {
			Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
			msg="ドライバのロードに成功しました";
		}catch(ClassNotFoundException e) {
			msg="ドライバのロードに失敗しました1";
		} catch (IllegalArgumentException e) {
			// TODO 自動生成された catch ブロック
			msg="ドライバのロードに失敗しました2";
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自動生成された catch ブロック
			msg="ドライバのロードに失敗しました3";
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自動生成された catch ブロック
			msg="ドライバのロードに失敗しました4";
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自動生成された catch ブロック
			msg="ドライバのロードに失敗しました5";
			e.printStackTrace();
		}
		System.out.println(msg);

	}

}
