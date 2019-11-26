package com.stx.zh.model;

public class Story {
	private int s_no;
	private String s_title;
	private String s_label;
	private String s_picture1;
	private String s_picture2;
	private String s_picture3;
	private String s_content;
	public Story(){
		
	}
	public Story(int s_no, String s_title, String s_label, String s_picture1, String s_picture2, String s_picture3,
			String s_content) {
		super();
		this.s_no = s_no;
		this.s_title = s_title;
		this.s_label = s_label;
		this.s_picture1 = s_picture1;
		this.s_picture2 = s_picture2;
		this.s_picture3 = s_picture3;
		this.s_content = s_content;
	}
	/**
	 * @return the s_no
	 */
	public int getS_no() {
		return s_no;
	}
	/**
	 * @param s_no the s_no to set
	 */
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	/**
	 * @return the s_title
	 */
	public String getS_title() {
		return s_title;
	}
	/**
	 * @param s_title the s_title to set
	 */
	public void setS_title(String s_title) {
		this.s_title = s_title;
	}
	/**
	 * @return the s_label
	 */
	public String getS_label() {
		return s_label;
	}
	/**
	 * @param s_label the s_label to set
	 */
	public void setS_label(String s_label) {
		this.s_label = s_label;
	}
	/**
	 * @return the s_picture1
	 */
	public String getS_picture1() {
		return s_picture1;
	}
	/**
	 * @param s_picture1 the s_picture1 to set
	 */
	public void setS_picture1(String s_picture1) {
		this.s_picture1 = s_picture1;
	}
	/**
	 * @return the s_picture2
	 */
	public String getS_picture2() {
		return s_picture2;
	}
	/**
	 * @param s_picture2 the s_picture2 to set
	 */
	public void setS_picture2(String s_picture2) {
		this.s_picture2 = s_picture2;
	}
	/**
	 * @return the s_picture3
	 */
	public String getS_picture3() {
		return s_picture3;
	}
	/**
	 * @param s_picture3 the s_picture3 to set
	 */
	public void setS_picture3(String s_picture3) {
		this.s_picture3 = s_picture3;
	}
	/**
	 * @return the s_content
	 */
	public String getS_content() {
		return s_content;
	}
	/**
	 * @param s_content the s_content to set
	 */
	public void setS_content(String s_content) {
		this.s_content = s_content;
	}
	
}
