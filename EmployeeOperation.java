package demo.jdbcDemo1;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeOperation {
JdbcTemplate jdbcTemplate;

void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	
	this.jdbcTemplate = jdbcTemplate;
}
int insert(employee emp) {
	
	String email=emp.getEmail();
	String id=emp.getId();
	String name=emp.getName();
	String salary=emp.getSalary();
	String query="insert into employee values('"+email+"','"+id+"','"+name+"','"+salary+"')";
	int result=jdbcTemplate.update(query);
	return result;
	
}
}
