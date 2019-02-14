package practice14;

import practice14.common.JavaCourse;

public class Main {

	public static void main(String[] args) {
		JavaCourse course = new JavaCourse();

		System.out.println(course.getCourseName());

		for(int i =0; i < course.getCourseUnit().length ; i++){
			System.out.println(course.getCourseUnit()[i]);
		}

	}

}
