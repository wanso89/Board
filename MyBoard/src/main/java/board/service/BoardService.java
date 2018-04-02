package board.service;

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
}
