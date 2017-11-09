package com.board.DAO;

import java.sql.SQLException;

public interface BoardDAO {
   void insert(String board) throws SQLException;
}
