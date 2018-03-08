package org.dateplanner.service;

import org.dateplanner.dao.LikeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
	
	@Autowired
	LikeDAO likeDAO;
	
	public int selectCount(int boardNo){ return likeDAO.selectCount(boardNo); }
	public int userCheck(int boardNo, int userNo){ return likeDAO.userCheck(boardNo, userNo); }
	public void insertLike(int boardNo, int userNO){ likeDAO.insertLike(boardNo, userNO); }
	public void deleteLike(int boardNo){ likeDAO.deleteLike(boardNo); }

}
