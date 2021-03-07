package com.company.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.company.entity.PreciousStone;
import com.company.entity.SemiPreciousStone;
import com.company.entity.interfaces.IStone;
import com.company.interfaces.IDB;

public class StoneController {
	private IDB idb;
	public StoneController(IDB idb) {
		this.idb = idb;
	}
	public List<IStone> getStones() {

		 Connection con = null;
	        try {
	            con = idb.getConnection();
	            String sql = "SELECT * FROM stones";
	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery(sql);
	            List<IStone> stones = new LinkedList<>();
	            IStone stone = null;
	            while (rs.next()) {
	            	if(rs.getString("stone_type").equals("precious")) {
	            		stone = new PreciousStone(rs.getInt("stone_id"), rs.getString("stone_name"), 
	            				rs.getString("stone_type"), rs.getInt("stone_price"), rs.getInt("necklace_id"), rs.getDouble("stone_weight"));
	            	} else if(rs.getString("stone_type").equals("semiPrecious")) {
	            		stone = new SemiPreciousStone(rs.getInt("stone_id"), rs.getString("stone_name"), 
	            				rs.getString("stone_type"), rs.getInt("stone_price"), rs.getInt("necklace_id"), rs.getDouble("stone_weight"));
	            	}
	                stones.add(stone);
	            }

	            return stones;
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException throwables) {
	                throwables.printStackTrace();
	            }
	        }
	        return null;
	    }
}
