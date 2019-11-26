package com.stx.zh.model;

public class Route {
	private int r_no;
	private String  r_label;
	private String r_title;
	private String r_picture1;
	private String r_content;
	private int u_id;
	/**
	 * @return the r_no
	 */
	public int getR_no() {
		return r_no;
	}
	/**
	 * @param r_no the r_no to set
	 */
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	/**
	 * @return the r_label
	 */
	public String getR_label() {
		return r_label;
	}
	/**
	 * @param r_label the r_label to set
	 */
	public void setR_label(String r_label) {
		this.r_label = r_label;
	}
	/**
	 * @return the r_title
	 */
	public String getR_title() {
		return r_title;
	}
	/**
	 * @param r_title the r_title to set
	 */
	public void setR_title(String r_title) {
		this.r_title = r_title;
	}
	/**
	 * @return the r_picture1
	 */
	public String getR_picture1() {
		return r_picture1;
	}
	/**
	 * @param r_picture1 the r_picture1 to set
	 */
	public void setR_picture1(String r_picture1) {
		this.r_picture1 = r_picture1;
	}
	/**
	 * @return the r_content
	 */
	public String getR_content() {
		return r_content;
	}
	/**
	 * @param r_content the r_content to set
	 */
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	/**
	 * @return the u_id
	 */
	public int getU_id() {
		return u_id;
	}
	/**
	 * @param u_id the u_id to set
	 */
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public Route(int r_no, String r_label, String r_title, String r_picture1, String r_content, int u_id) {
		super();
		this.r_no = r_no;
		this.r_label = r_label;
		this.r_title = r_title;
		this.r_picture1 = r_picture1;
		this.r_content = r_content;
		this.u_id = u_id;
	}
	public Route(){
		
	}
}
