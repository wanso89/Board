package board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.BoardDTO;
import board.dto.PageDTO;

@Repository
public class BoardDAO {

	@Autowired
	SqlSessionTemplate template;
	
	public PageDTO boardList(int curPage, HashMap<String,String> map){
		PageDTO pDTO = new PageDTO();
		int start = (curPage-1) * pDTO.getPerPage();
		int end = pDTO.getPerPage();
		int totalCount=0;
		
		List<BoardDTO> boardList = template.selectList("BoardMapper.boardList",map,
										new RowBounds(start, end));
		
		pDTO.setBoardList(boardList);
		pDTO.setCurPage(curPage);
		
		if(map.get("searchValue") == null) {
			totalCount = totalCount();
		} else {
			totalCount = totalSearchCount(map);
		}
		
		pDTO.setTotalCount(totalCount);
		pDTO.setSearchName(map.get("searchName"));
		pDTO.setSearchValue(map.get("searchValue"));	
		
		return pDTO;
		
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
	
	private int totalCount() {
		return template.selectOne("BoardMapper.totalCount");
	}
	
	private int totalSearchCount(HashMap<String,String> map) {
		return template.selectOne("BoardMapper.totalSearchCount",map);
	}
	
}
