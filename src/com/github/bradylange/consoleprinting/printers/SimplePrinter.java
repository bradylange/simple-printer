/*
 * Developer: Brady Lange
 * Course: CSIS 161 - Programming I
 * Institution: University of Wisconsin-River Falls
 * Class: SimplePrinter
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.consoleprinting.printers;

/**
 * <p>
 *		Prints information about River Falls, Wisconsin such as its location 
 *		and population size. Contains the {@link #main} method which 
 *		instantiates and sets up the program.
 * </p>
 *
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/"
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/08/2019
 * @since  1.0, 09/24/2016
 */
public class SimplePrinter {
	/**
	 * Instantiates and sets up the program.
	 * 
	 * @param args  the array of command line arguments to be passed
	 * 
	 * @version  1.0.1, 11/30/2019
	 * @since  1.0, 09/24/2016
	 */
	public static void main(String[] args) {
		// Local variables for printing
		String city = "River Falls";                              // City name
		String state = "Wisconsin";                               // State name
		String countyOne = "Pierce";                              // First county name
		String countyTwo = "St. Croix";                           // Second county name
		int censusYear = 2010;                                    // United States population census year
		int population = 15000;                                   // Population size
		String cenBureau = "Census Bureau";                       // Census Bureau String
		double ttlArea = 6.60;                                    // Total area (land + water)
		double landArea = 6.52;                                   // Total land area
		double waterArea = 0.08;                                  // Total water area
		String river = "Kinnickinnic";                            // River name
		String uwrf = "University of Wisconsin-River Falls";      // University name
		int sect = 2;                                             // Total sections
    		
		System.out.println("************************************************");
		System.out.println("Simple Console Printing:");
		System.out.println("************************************************");
		System.out.println(city + ", " + state + ":\n");          // Print city's and state's name
		System.out.println(city + " is a city in " + countyOne
		                   + " and " + countyTwo
				               + " counties in the "
				               + "U.S. state of " + state
				               + ". As of the census of");            // Print city's county name
		System.out.println(censusYear + ", there were "
		                   + population + " people.\n");          // Print city's population size
		System.out.println("According to the United States "
		                   + cenBureau + ", the city has a "
		                   + "total area of " + ttlArea
		                   + " square miles, of which,");         // Print city's area
		System.out.println(landArea + " square miles is "
				           + "land and " + waterArea
		                   + " square miles is water.\n");        // Print city's land/water area
		System.out.println(city + " lies on the banks of the "
		                   + river + " River, The South Fork "
		                   + "of the " + river + " River runs");  // Print city's bodies of water
		System.out.println("through the city, dividing the "
				               + "campus of the " + uwrf + " into "
				               + sect + " sections.");                // Print city's natural borders
	}
}