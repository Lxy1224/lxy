package com.stx.zh.model;

public class Travel {
	private int t_no;
	private String t_label;
	private String t_title;
	private String t_picture1;
	private String t_content;
	private int t_comnum;
	public Travel(){
		
	}
	private int u_id;
	/**
	 * @return the t_no
	 */
	public int getT_no() {
		return t_no;
	}
	/**
	 * @param t_no the t_no to set
	 */
	public void setT_no(int t_no) {
		this.t_no = t_no;
	}
	/**
	 * @return the t_label
	 */
	public String getT_label() {
		return t_label;
	}
	/**
	 * @param t_label the t_label to set
	 */
	public void setT_label(String t_label) {
		this.t_label = t_label;
	}
	/**
	 * @return the t_title
	 */
	public String getT_title() {
		return t_title;
	}
	/**
	 * @param t_title the t_title to set
	 */
	public void setT_title(String t_title) {
		this.t_title = t_title;
	}
	/**
	 * @return the t_picture1
	 */
	public String getT_picture1() {
		return t_picture1;
	}
	/**
	 * @param t_picture1 the t_picture1 to set
	 */
	public void setT_picture1(String t_picture1) {
		this.t_picture1 = t_picture1;
	}
	/**
	 * @return the t_content
	 */
	public String getT_content() {
		return t_content;
	}
	/**
	 * @param t_content the t_content to set
	 */
	public void setT_content(String t_content) {
		this.t_content = t_content;
	}
	/**
	 * @return the t_comnum
	 */
	public int getT_comnum() {
		return t_comnum;
	}
	/**
	 * @param t_comnum the t_comnum to set
	 */
	public void setT_comnum(int t_comnum) {
		this.t_comnum = t_comnum;
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
	public Travel(int t_no, String t_label, String t_title, String t_picture1, String t_content, int t_comnum,
			int u_id) {
		super();
		this.t_no = t_no;
		this.t_label = t_label;
		this.t_title = t_title;
		this.t_picture1 = t_picture1;
		this.t_content = t_content;
		this.t_comnum = t_comnum;
		this.u_id = u_id;
	}
	
}
