package topshelf.shared.geo;

public enum Boundary {

	/**
	 * street or route name
	 */
	street,
	
	/**
	 * ex: Midtown, East Village
	 */
	neighborhood,
	
	/**
	 * can be a NYC borough, or an LA beach
	 */
	sublocality,
	
	/**
	 * City
	 */
	city,
	
	/**
	 * County, which is sometimes also the City
	 */
	// can't do County bc sometimes multiple cities fall in a county (expected)
	// but other times multiple references of one city fall under numerous counties
	// ie NYC - that throws the hierarchy WAY off: eg we can't drill down from the
	// city of NYC to its boroughs bc it's already under a single county that
	// represents its borough.  so let's skip it until we need to be this smart.
	//
	//	county,

	/**
	 * ex: New York
	 */
	state,
	
	/**
	 * ex: United States
	 */
	country
}