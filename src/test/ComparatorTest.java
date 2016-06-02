package test;

import java.util.Comparator;

/**
 * @author agrawals
 * date 28/07/2015
 */
public class ComparatorTest implements Comparator{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		SortObjectsTest obj1 = (SortObjectsTest) o1;
		SortObjectsTest obj2 = (SortObjectsTest) o2;
		
		//sorting by locationName in ascending order
		//return obj1.getLocationName().compareTo(obj2.getLocationName());
		
		//sorting by locationName in descending order
		return obj2.getLocationName().compareTo(obj1.getLocationName());
		
		
	}

	
}
