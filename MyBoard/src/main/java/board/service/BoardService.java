package board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import board.dto.PageDTO;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO dao;
	
	public PageDTO boardList(int curPage, HashMap<String,String> map){
		return dao.boardList(curPage, map);
	}

	public void boardWrite(BoardDTO dto) {
		dao.boardWrite(dto);
	}
	
	public BoardDTO boardRetrieve(int num) {
		return dao.boardRetrieve(num);
	}
	
	public void boardUpdate(BoardDTO dto) {
		dao.boardUpdate(dto);
	}
	
	public List<BoardDTO> boardSearch(HashMap<String,String> map){
		return dao.boardSearch(map);
	}
	
	public void boardDelete(int num) {
		dao.boardDelete(num);
	}
	
	
}
