package finaltest.dao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AllDAO connection = new AllDAO();
			System.out.println("ProDB: " + connection.isPro("aaa", "1234","jiwon"));
	}

}
