package board.dao;

import java.util.HashMap;
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
	
	public void boardWrite(BoardDTO dto) {
		template.insert("BoardMapper.boardWrite",dto);
	}
	
	public BoardDTO boardRetrieve(int num){
		readCntUpdate(num);
		return template.selectOne("BoardMapper.boardRetrieve",num);
	}
	//글 조회수증가
	private void readCntUpdate(int num) {
		template.update("BoardMapper.readCntUpdate",num);
	}
	
	public void boardUpdate(BoardDTO dto) {
		template.update("BoardMapper.boardUpdate",dto);
	}
	
	public List<BoardDTO> boardSearch(HashMap<String,String> map){
		return template.selectList("BoardMapper.boardSearch",map);
	}
	
	public void boardDelete(int num) {
		template.delete("BoardMapper.boardDelete",num);
	}
	
	
}
