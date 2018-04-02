package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.BoardDTO;

@Repository
public class BoardDAO {

	@Autowired
	SqlSessionTemplate template;
	
	public List<BoardDTO> boardList(){
		return template.selectList("BoardMapper.boardList");
	}
}
