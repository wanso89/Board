package board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO dao;
	
	public List<BoardDTO> boardList(){
		return dao.boardList();
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
}
