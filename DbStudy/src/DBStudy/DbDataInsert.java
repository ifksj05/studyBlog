package DBStudy;

public class DbDataInsert {
	public DbDataInsert() {
		// TODO Auto-generated constructor stub
		DbManager db = new DbManager();

		db.setData(
				"INSERT INTO `dbstudy`.`user` (`u_no`, `u_name`, `u_id`, `u_pw`, `u_birth`, `division`, `t_no`) VALUES ('1', '김성재', 'a', 'abc213', '1999-09-09', '1', '0');\r\n"
						+ "INSERT INTO `dbstudy`.`user` (`u_no`, `u_name`, `u_id`, `u_pw`, `u_birth`, `division`, `t_no`) VALUES ('2', '김준우', 'b', 'www33', '1999-01-01', '2', '1');\r\n"
						+ "INSERT INTO `dbstudy`.`user` (`u_no`, `u_name`, `u_id`, `u_pw`, `u_birth`, `division`, `t_no`) VALUES ('3', '박힘찬', 'c', 'qwer11', '2000-01-03', '1', '2');\r\n"
						+ "INSERT INTO `dbstudy`.`user` (`u_no`, `u_name`, `u_id`, `u_pw`, `u_birth`, `division`, `t_no`) VALUES ('4', '이재훈', 'd', 'www33', '2001-03-16', '1', '3');\r\n"
						+ "");

	}
}
