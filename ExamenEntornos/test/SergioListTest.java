import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.gqm.entornos.examen.sergio.SergioList;

class SergioListTest {
	
	@ParameterizedTest
	@MethodSource("firstHalf")
	void should_return_first_half(SergioList sl, String[] result) {
		String[] half = sl.firstHalf();
		
		assertArrayEquals(half, result);
	}
	
	static Stream<Arguments> firstHalf(){
		String[] test1 = {"prueba1"};
		String[] test2 = {"prueba1", "prueba2", "prueba3", "prueba4", "prueba5"};
		String[] test3 = {"prueba1", "prueba2", "prueba3"};
		return Stream.of(
				Arguments.of(new SergioList(test1), new String[]{"prueba1"}),
				Arguments.of(new SergioList(test2), new String[]{"prueba1", "prueba2"}),
				Arguments.of(new SergioList(test3), new String[]{"prueba1"}));
	}
	
	
	@ParameterizedTest
	@MethodSource("lengthStream")
	void should_return_length(SergioList sl, int result) {
		int length = sl.length();
		
		assertEquals(length, result);
	}
	
	static Stream<Arguments> lengthStream(){
		String[] test1 = {"prueba1"};
		String[] test2 = {"prueba1", "prueba2", "prueba3", "prueba4", "prueba5"};
		String[] test3 = {"prueba1", "prueba2", "prueba3"};
		return Stream.of(
				Arguments.of(new SergioList(test1), 1),
				Arguments.of(new SergioList(test2), 5),
				Arguments.of(new SergioList(test3), 3));
	}

}
