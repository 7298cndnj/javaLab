package verify.exam10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample03 {

	public static void main(String[] args) {
		//List에 저장되어 있는 Member 중에서 직업이 "개발자"인 사람만 별도의 List에 수집하려고 합니다.
		//빈칸에 알맞은 코드를 작성해 보세요.
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		List<Member> developers = list.stream()
				.filter(m->m.getJob()=="개발자")
				.collect(Collectors.toList());
				developers.stream().forEach(m -> System.out.println(m.getName()));
				}

	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}
	}

// 실행 결과
// 홍길동
// 신용권
}


