package com.nbcb.mapper;

import com.nbcb.pojo.ShopUserMoneyLog;
import com.nbcb.pojo.ShopUserMoneyLogExample;
import com.nbcb.pojo.ShopUserMoneyLogKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ShopUserMoneyLogMapper {
    long countByExample(ShopUserMoneyLogExample example);

    int deleteByExample(ShopUserMoneyLogExample example);

    int deleteByPrimaryKey(ShopUserMoneyLogKey key);

    int insert(ShopUserMoneyLog record);

    int insertSelective(ShopUserMoneyLog record);

    List<ShopUserMoneyLog> selectByExample(ShopUserMoneyLogExample example);

    ShopUserMoneyLog selectByPrimaryKey(ShopUserMoneyLogKey key);

    int updateByExampleSelective(@Param("record") ShopUserMoneyLog record, @Param("example") ShopUserMoneyLogExample example);

    int updateByExample(@Param("record") ShopUserMoneyLog record, @Param("example") ShopUserMoneyLogExample example);

    int updateByPrimaryKeySelective(ShopUserMoneyLog record);

    int updateByPrimaryKey(ShopUserMoneyLog record);
}