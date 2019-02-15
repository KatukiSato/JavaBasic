package practice14;

import practice14.common.DBCourse;

public class Main {

	public static void main(String[] args) {
		DBCourse course = new DBCourse();

		System.out.println(course.getCourseName());

		for(int i =0; i < course.getCourseUnit().length ; i++){
			System.out.println(course.getCourseUnit()[i]);
		}

	}

}
