package chatDemo;

public class Group implements Comparable<Group>
{
	Student student1;
	Student student2;

	public Group(Student student1, Student student2)
	{
		this.student1 = student1;
		this.student2 = student2;
	}

	public String groupChat()
	{
		String chat = student1.responses.get(0) + student2.responses.get(0)
				+ student1.responses.get(1) + student2.responses.get(1)
				+ student1.responses.get(2) + student2.responses.get(2)
				+ student1.responses.get(3) + student2.responses.get(3);
		return chat;
	}

	@Override
	public int compareTo(Group o)
	{
		if (o == null)
		{
			return -1;
		}
		if (this.student1.firstName.compareTo(o.student1.firstName) == 0)
			return 0;
		else if (this.student1.firstName.compareTo(o.student1.firstName) > 0)
			return 1;
		else
			return -1;

	}

}
