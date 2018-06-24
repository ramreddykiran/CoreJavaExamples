package string.examples;

public class StringReplace {
	
	public static void main(String[] args) {
		String s1 = "{\"description\":\"POETautomatedPerfTestforNDCandODCwith25kcontainersoneachDC\",\"dcSettings\":[{\"nodeId\":\"07\",\"flowName\":\"PopupConfiguration\",\"durationInMinute\":150,\"numContainers\":25000,\"percentageGiftWrap\":0,\"percentageFromAsrs\":0,\"percentageMultis\":70,\"avgUnitsPerMultisContainer\":3,\"maxUnitsPerMultisOrder\":5,\"avgPriority\":2,\"avgDaysToInHomeDate\":7,\"itemIdPoolSize\":250,\"percentOfItemIdPoolToUsePerOrder\":5,\"arePicksContainerComplete\":true},{\"nodeId\":\"04\",\"flowName\":\"ASRSandBombayConfiguration\",\"durationInMinutes\":150,\"numContainers\":25000,\"percentageGiftWrap\":0,\"percentageFromAsrs\":50,\"percentageMultis\":70,\"avgUnitsPerMultisContainer\":3,\"maxUnitsPerMultisOrder\":5,\"avgPriority\":2,\"avgDaysToInHomeDate\":7,\"itemIdPoolSize\":250,\"percentOfItemIdPoolToUsePerOrder\":5,\"arePicksContainerComplete\":false}]}";
		String s2 = s1.replaceAll("\\{", "{\n").replaceAll("}", "\n}")
				.replaceAll("\\[", "[\n").replaceAll("]", "\n]").replaceAll(",", ",\n");
		System.out.println(s2);
		/*String test = "{Hello[sq(how-are.you ?)";
	    String outputText = test.replaceAll("[{()-. ]+", "\n");

	    System.out.println(outputText);*/
		
		
	
	}

}
