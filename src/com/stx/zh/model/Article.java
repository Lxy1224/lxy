package com.stx.zh.model;

public class Article {
	private int a_no;
	private String a_title;
	private String a_label;
	private String a_picture1;
	private String a_content;
	private int a_comnum;
	/**
	 * @return the a_no
	 */
	public Article(){
		
	}
	public int getA_no() {
		return a_no;
	}
	/**
	 * @param a_no the a_no to set
	 */
	public void setA_no(int a_no) {
		this.a_no = a_no;
	}
	/**
	 * @return the a_title
	 */
	public String getA_title() {
		return a_title;
	}
	/**
	 * @param a_title the a_title to set
	 */
	public void setA_title(String a_title) {
		this.a_title = a_title;
	}
	/**
	 * @return the a_label
	 */
	public String getA_label() {
		return a_label;
	}
	/**
	 * @param a_label the a_label to set
	 */
	public void setA_label(String a_label) {
		this.a_label = a_label;
	}
	/**
	 * @return the a_picture1
	 */
	public String getA_picture1() {
		return a_picture1;
	}
	/**
	 * @param a_picture1 the a_picture1 to set
	 */
	public void setA_picture1(String a_picture1) {
		this.a_picture1 = a_picture1;
	}
	/**
	 * @return the a_content
	 */
	public String getA_content() {
		return a_content;
	}
	/**
	 * @param a_content the a_content to set
	 */
	public void setA_content(String a_content) {
		this.a_content = a_content;
	}

	public Article(int a_no, String a_title, String a_label, String a_picture1, String a_content, int a_comnum) {
		super();
		this.a_no = a_no;
		this.a_title = a_title;
		this.a_label = a_label;
		this.a_picture1 = a_picture1;
		this.a_content = a_content;
		this.a_comnum = a_comnum;
	}
	/**
	 * @return the a_comnum
	 */
	public int getA_comnum() {
		return a_comnum;
	}
	/**
	 * @param a_comnum the a_comnum to set
	 */
	public void setA_comnum(int a_comnum) {
		this.a_comnum = a_comnum;
	}
	public Article(String a_title, String a_label, String a_content) {
		super();
		this.a_title = a_title;
		this.a_label = a_label;
		this.a_content = a_content;
	}
	public Article(int a_no, String a_title, String a_label, String a_content) {
		super();
		this.a_no = a_no;
		this.a_title = a_title;
		this.a_label = a_label;
		this.a_content = a_content;
	}
	public Article(int a_no, String a_title, String a_label, String a_content, int a_comnum) {
		super();
		this.a_no = a_no;
		this.a_title = a_title;
		this.a_label = a_label;
		this.a_content = a_content;
		this.a_comnum = a_comnum;
	}
	
}
