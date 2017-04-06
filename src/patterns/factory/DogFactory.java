package patterns.factory;

public class DogFactory {

	public static Dog getDog(String criteria)
	  {
	    if ( criteria.equals("small") )
	      return new Poodle();
	    else if ( criteria.equals("big") )
	      return new RottWeiler();
	    else if ( criteria.equals("working") )
	      return new SiberianHusky();

	    return null;
	  }
	}
	

