package we.app.sdb;

import java.util.ArrayList;
import java.util.List;

public class student_db_map {
	List<Object> stu_list=new ArrayList<Object>();
	public String name;
	public String mark1;
	public String mark2;

public void create()
{
	stu_list.add(name);
	stu_list.add(mark1);
	stu_list.add(mark2);
}
	public List<Object> show()
	{
		return stu_list;
	}

}
