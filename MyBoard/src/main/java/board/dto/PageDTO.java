package board.dto;

import java.util.List;

public class PageDTO {

	private List<BoardDTO> boardList;
	private int curPage;
	private int totalCount;
	private int perPage=3;
	
	private String searchName;
	private String searchValue;
	
	public List<BoardDTO> getBoardList() {
		return boardList;
	}
	public void setBoardList(List<BoardDTO> boardList) {
		this.boardList = boardList;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	
}
