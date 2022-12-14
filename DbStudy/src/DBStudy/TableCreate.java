package DBStudy;

public class TableCreate {
	public TableCreate() {
		// TODO Auto-generated constructor stub

		DbManager db = new DbManager();

		db.setData("CREATE TABLE IF NOT EXISTS `dbstudy`.`user` (\r\n" + "  `u_no` INT(11) NOT NULL,\r\n"
				+ "  `u_name` VARCHAR(15) NULL,\r\n" + "  `u_id` VARCHAR(15) NULL,\r\n"
				+ "  `u_pw` VARCHAR(11) NULL,\r\n" + "  `u_birth` VARCHAR(15) NULL,\r\n"
				+ "  `division` INT(11) NULL,\r\n" + "  `t_no` INT(11) NULL,\r\n" + "  PRIMARY KEY (`u_no`))\r\n" + "");

	}
}
