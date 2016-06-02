package test;

import java.util.ArrayList;
import java.util.Collections;

public class SortObjectsTest {
	private String standardNumber;
	private String locationName;
	private String license;
	private String locChangedFlag;
	private String title;

	public SortObjectsTest(String standardNumber, String locationName,
			String license, String locChangedFlag, String title) {
		super();
		this.standardNumber = standardNumber;
		this.locationName = locationName;
		this.license = license;
		this.locChangedFlag = locChangedFlag;
		this.title = title;
	}

	public String getLocChangedFlag() {
		return locChangedFlag;
	}

	public void setLocChangedFlag(String locChangedFlag) {
		this.locChangedFlag = locChangedFlag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStandardNumber() {
		return standardNumber;
	}

	public void setStandardNumber(String standardNumber) {
		this.standardNumber = standardNumber;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

		public static void setLocChangegRequiredFlag(ArrayList<SortObjectsTest> list) {
		// ArrayList<SortObjectsTest> tempList = new
		// ArrayList<SortObjectsTest>();
		list.get(0).setLocChangedFlag("TRUE");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				break;
			}
			if (list.get(i + 1).getLocationName()
					.equalsIgnoreCase(list.get(i).getLocationName())) {
				continue;
			} else {
				list.get(i + 1).setLocChangedFlag("TRUE");
			}
		}

	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SortObjectsTest> tempList = new ArrayList<SortObjectsTest>();

		SortObjectsTest obj1 = new SortObjectsTest("123", "united states",
				"ACL", "false", "title1");
		SortObjectsTest obj2 = new SortObjectsTest("423", "nederlands", "BCL",
				"false", "title2");
		SortObjectsTest obj3 = new SortObjectsTest("623", "canada", "DFE",
				"false", "title3");
		SortObjectsTest obj4 = new SortObjectsTest("723", "philippines",
				"EFGD", "false", "title4");
		SortObjectsTest obj5 = new SortObjectsTest("723", "america", "GFRD",
				"false", "title5");
		SortObjectsTest obj6 = new SortObjectsTest("555523", "japan", "ZASW",
				"false", "title6");
		SortObjectsTest obj7 = new SortObjectsTest("1233455", "china", "RKP",
				"false", "title7");
		SortObjectsTest obj8 = new SortObjectsTest("653w", "germany", "LMC",
				"false", "title8");
		SortObjectsTest obj9 = new SortObjectsTest("988", "united kingdom",
				"OPUE", "false", "title9");
		SortObjectsTest obj10 = new SortObjectsTest("01234", "france", "NAC",
				"false", "title10");
		SortObjectsTest obj11 = new SortObjectsTest("17484", "mumbai", "MACl",
				"false", "title11");
		SortObjectsTest obj12 = new SortObjectsTest("17484", "nederlands",
				"MACl", "false", "title11");
		SortObjectsTest obj13 = new SortObjectsTest("17484", "mumbai", "MACl",
				"false", "title11");
		SortObjectsTest obj14 = new SortObjectsTest("17484", "china", "MACl",
				"false", "title11");
		SortObjectsTest obj15 = new SortObjectsTest("17484", "united states",
				"MACl", "false", "title11");
		SortObjectsTest obj16 = new SortObjectsTest("17484", "united states",
				"MACl", "false", "title11");
		SortObjectsTest obj17 = new SortObjectsTest("17484", "united states",
				"MACl", "false", "title11");
		SortObjectsTest obj18 = new SortObjectsTest("17484", "germany", "MACl",
				"false", "title11");
		SortObjectsTest obj19 = new SortObjectsTest("17484", "mumbai", "MACl",
				"false", "title11");

		tempList.add(obj1);
		tempList.add(obj2);
		tempList.add(obj3);
		tempList.add(obj4);
		tempList.add(obj5);
		tempList.add(obj6);
		tempList.add(obj7);
		tempList.add(obj8);
		tempList.add(obj9);
		tempList.add(obj10);
		tempList.add(obj11);
		tempList.add(obj12);
		tempList.add(obj13);
		tempList.add(obj14);
		tempList.add(obj15);
		tempList.add(obj16);
		tempList.add(obj17);
		tempList.add(obj18);
		tempList.add(obj18);
		tempList.add(obj19);
		Collections.sort(tempList, new ComparatorTest());
		SortObjectsTest.setLocChangegRequiredFlag(tempList);
		for (SortObjectsTest obj : tempList) {
			System.out.println(obj.getLocationName() + ":" + obj.getLicense()
					+ ":" + obj.getStandardNumber() + ":" + obj.title + ":"
					+ obj.getLocChangedFlag());
		}

	}

}
