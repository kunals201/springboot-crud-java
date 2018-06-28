#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("student")
public class Student {

	@PrimaryKey
	private String id;
	private String name;
	private String marks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Student(String id, String name, String marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks= marks;
	}
}
