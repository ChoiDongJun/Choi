package com.board.DAO;

import java.sql.SQLException;

public interface BoardDAO {
   void insert(int board) throws SQLException;
   
   void delete(String board) throws SQLException;
}
