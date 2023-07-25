package study.july.two;

public class Main {

	public static void main(String[] args) {
		Database database = new JdbcDatabase();
		
		database.find();
		database.save();
		database.delete();
		
		Database databaseV2 = new MybatisDatabase();
		
		databaseV2.find();
		databaseV2.save();
		databaseV2.delete();
		

	}

}
