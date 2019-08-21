package lab2;

public class StudentTest {

	public static void main(String[] args) {
		Student mfa = new Student();
		mfa.setId(152392326);
		mfa.setName("Md. Faisal Ahmed");
		mfa.setCgpa((float) 3.5);
		System.out.println(mfa);
		
		Student riad = new Student();
		riad.setId(151382337);
		riad.setName("Md. Riad Miah");
		riad.setCgpa((float) 2.7);
		System.out.println(riad);

	}

}
