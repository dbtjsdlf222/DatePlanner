package org.dateplanner.dao;

import java.util.List;

import org.dateplanner.vo.Comment;

public interface CommentDAO {

	public void insert(Comment comment);
	public void update(String content, String no);
	public List<Comment> select(int boardNo);
	public void delete(int no);
	
}
