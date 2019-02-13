/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	private int StudentId;
	private String StudentName;
	private String CompanyName;
	private String ClassName;
	private String Mail;
	private String Password;
	/** 受講生ID */
	public  int getStudentId(){
		return StudentId;
	}

	public void setStudentId(int studentId) {
		this.StudentId = studentId;
	}

	/** 受講生氏名 */
	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}

	/** 会社名 */
	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		this.CompanyName = companyName;
	}

	/** 教室名 */
	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		this. ClassName = className;
	}

	/** メールアドレス */
	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		this. Mail = mail;
	}

	/** パスワード */
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this. Password = password;
	}
}

