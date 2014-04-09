package lab1;

public class DenisLaw {
	private String name;
	private String position;
	private String friend[];
	public DenisLaw() {
		name = "Denis Law";
		position = "RB";
		friend = new String[]{"Sol Campbell","Kenny Miller","CWilliam Gallas"};
	}
	public DenisLaw (int a) {
		
	}
	public String getName(){			
		return name;		
	}
	public String getPosition(){			
		return position;		
	}
	public String[] getFriend(){			
		return friend;		
	}
	
	
	}
