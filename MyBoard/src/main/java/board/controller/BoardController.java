package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDTO;
import board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService service;
	
	//글 전체목록 확인
	@RequestMapping("/boardList")
	public ModelAndView boardList(){
		List<BoardDTO> boardList = service.boardList();
		return new ModelAndView("boardList","boardList",boardList);
	}
	
	
}
