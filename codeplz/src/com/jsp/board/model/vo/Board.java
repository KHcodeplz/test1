package com.jsp.board.model.vo;

import java.sql.Date;

public class Board {
	
	private int board_index;
	private int board_category_index;
	private String board_tags;
	private String board_title;
	private String board_content;
	private String board_file;
	private int board_hits;
	private String board_writer;
	private Date board_inserted_date;
	private Date board_modified_date;
	private int board_is_deleted;
	private int board_elapsed_date;
	
	public Board() {
		super();
	}

	public Board(int board_index, int board_category_index, String board_tags, String board_title, String board_content,
			String board_file, int board_hits, String board_writer, Date board_inserted_date, Date board_modified_date,
			int board_is_deleted, int board_elapsed_date) {
		super();
		this.board_index = board_index;
		this.board_category_index = board_category_index;
		this.board_tags = board_tags;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_file = board_file;
		this.board_hits = board_hits;
		this.board_writer = board_writer;
		this.board_inserted_date = board_inserted_date;
		this.board_modified_date = board_modified_date;
		this.board_is_deleted = board_is_deleted;
		this.board_elapsed_date = board_elapsed_date;
	}

	public int getBoard_index() {
		return board_index;
	}

	public void setBoard_index(int board_index) {
		this.board_index = board_index;
	}

	public int getBoard_category_index() {
		return board_category_index;
	}

	public void setBoard_category_index(int board_category_index) {
		this.board_category_index = board_category_index;
	}

	public String getBoard_tags() {
		return board_tags;
	}

	public void setBoard_tags(String board_tags) {
		this.board_tags = board_tags;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBoard_file() {
		return board_file;
	}

	public void setBoard_file(String board_file) {
		this.board_file = board_file;
	}

	public int getBoard_hits() {
		return board_hits;
	}

	public void setBoard_hits(int board_hits) {
		this.board_hits = board_hits;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public Date getBoard_inserted_date() {
		return board_inserted_date;
	}

	public void setBoard_inserted_date(Date board_inserted_date) {
		this.board_inserted_date = board_inserted_date;
	}

	public Date getBoard_modified_date() {
		return board_modified_date;
	}

	public void setBoard_modified_date(Date board_modified_date) {
		this.board_modified_date = board_modified_date;
	}

	public int getBoard_is_deleted() {
		return board_is_deleted;
	}

	public void setBoard_is_deleted(int board_is_deleted) {
		this.board_is_deleted = board_is_deleted;
	}
	
	public int getBoard_elapsed_date() {
		return board_elapsed_date;
	}
	
	public void setBoard_elapsed_date(int board_elapsed_date) {
		this.board_elapsed_date = board_elapsed_date;
	}

	@Override
	public String toString() {
		return "Board [board_index=" + board_index + ", board_category_index=" + board_category_index + ", board_tags="
				+ board_tags + ", board_title=" + board_title + ", board_content=" + board_content + ", board_file="
				+ board_file + ", board_hits=" + board_hits + ", board_writer=" + board_writer
				+ ", board_inserted_date=" + board_inserted_date + ", board_modified_date=" + board_modified_date
				+ ", board_is_deleted=" + board_is_deleted + ", board_elapsed_date=" + board_elapsed_date + "]";
	}

	

}
