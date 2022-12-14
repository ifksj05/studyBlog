package DBStudy;

public class DbCreate {
	public DbCreate() {
		// TODO Auto-generated constructor stub

		DbManager db = new DbManager();

		db.setData("DROP SCHEMA IF EXISTS `dbstudy` ;\r\n" + "\r\n"
				+ "CREATE SCHEMA IF NOT EXISTS `dbstudy` DEFAULT CHARACTER SET utf8 ;");

	}
}
