package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//글 쓰기
	@RequestMapping("/boardWrite")
	public ModelAndView boardWrite(BoardDTO dto) {
		service.boardWrite(dto);
		return new ModelAndView("redirect:boardList");
	}
	
	//글 자세히보기
	@RequestMapping("/boardRetrieve")
	public ModelAndView boardRetrieve(@RequestParam int num) {
		BoardDTO dto = service.boardRetrieve(num);
		return new ModelAndView("boardRetrieve","boardList",dto);
	}
	
	//글 수정하기
	@RequestMapping("/boardUpdate")
	public ModelAndView boardUpdate(BoardDTO dto) {
		service.boardUpdate(dto);
		return new ModelAndView("redirect:boardList");
	}
	
}
