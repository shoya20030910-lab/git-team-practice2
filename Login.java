//ログイン機能のコード

import java.util.Scanner;
public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate() {
        // ここでは簡単な認証ロジックを使用していますが、実際のアプリケーションではデータベースなどを使用することが一般的です。
        return "admin".equals(username) && "password".equals(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ユーザー名を入力してください: ");
        String username = scanner.nextLine();

        System.out.print("パスワードを入力してください: ");
        String password = scanner.nextLine();

        Login login = new Login(username, password);

        if (login.authenticate()) {
            System.out.println("ログイン成功！");
        } else {
            System.out.println("ログイン失敗。ユーザー名またはパスワードが正しくありません。");
        }

        scanner.close();
    }
}