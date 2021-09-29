import org.junit.Assert;
import org.junit.Test;

public class GradeTEst {

	@Test
	public void printGradeTests(){
		//given
		Grade gradeObject = new Grade();
		int grade = 99;
		String expected = "A";

		//when
		String actual = gradeObject.printGrade(grade);

		//then
		Assert.assertEquals("A", actual);

	}
}
