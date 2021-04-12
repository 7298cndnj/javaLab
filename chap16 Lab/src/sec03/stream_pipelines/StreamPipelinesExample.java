package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)
		);
		
		double ageAvg =   list.stream()
	/*			//중간처리
			.filter(new Predicate<Member>() {
				@Override
				public boolean test(Member m) {
					// TODO Auto-generated method stub
					return false;
				}
				
			})*/
			.filter(m -> m.getSex()==Member.MALE)
		/*	.mapToInt(new ToIntFunction<Member>() {
				@Override
				public int applyAsInt(Member m) {
					// TODO Auto-generated method stub
					return 0;
				}
			})*/
			//람다식
			//.mapToInt(m->m.getAge())
			//매개 변수의 메소드 참조
			.mapToInt(Member :: getAge)
			.average()
			.getAsDouble();
		
		System.out.println("남자 평균 나이: " + ageAvg);
	}
}


