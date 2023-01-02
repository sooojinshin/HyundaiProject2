package com.chysk5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chysk5.domain.PriceRankDTO;
import com.chysk5.domain.RegResellProductDTO;
import com.chysk5.domain.ResellPriceDTO;
import com.chysk5.domain.ResellProductDTO;

public interface ResellMapper {
	
	public ResellProductDTO getMyResellProduct(String pro_opt_id);
	public List<ResellPriceDTO> getPriceList(String pro_opt_id);
	public int register(RegResellProductDTO regResellProductDTO);
	public int getMyRank(@Param("pro_opt_id") String pro_opt_id, @Param("re_price") String re_price);
}