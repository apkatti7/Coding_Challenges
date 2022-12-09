package interview_coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Waptofind_Concat_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

	Collections.reverse(list1);
	System.out.println(list1);
		Stream<Integer> fullList = Stream.concat(list1.stream(), list2.stream());
		List<Integer> allelements = fullList.collect(Collectors.toList());
		// Set<Integer> allelements = fullList.collect(Collectors.toSet());
		System.out.println(allelements);

		Set<Integer> uniqueElements = allelements.stream().collect(Collectors.toSet());
		System.out.println(uniqueElements);

		Integer min = uniqueElements.stream().min((x1, x2) -> x1 - x2).get();
		System.out.println(min);

		Integer max = uniqueElements.stream().max((x1, x2) -> x1 - x2).get();
		System.out.println(max);
	}

}
