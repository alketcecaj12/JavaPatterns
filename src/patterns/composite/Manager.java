package patterns.composite;

class Manager {
	   Manager mgr;
	   Employee[] ely;
	   String dept;
	  
	   Manager(Manager mgr,Employee[] e, String d ) {
	       this(e, d);
	       this.mgr = mgr;
	   }
	   
	   Manager(Employee[] e, String d) {
	       ely = e;
	       dept =d;
	   }
	   String getDept() {
	       return dept;
	   }
	   Manager getManager() {
	       return mgr;
	   }
	   Employee[] getEmployee() {
	       return ely;
	   }
	   public String toString() {
	       return dept + " manager";
	   }
	}