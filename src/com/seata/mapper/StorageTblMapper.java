package com.seata.mapper;

import com.seata.pojo.StorageTbl;
import com.seata.pojo.StorageTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageTblMapper {
    long countByExample(StorageTblExample example);

    int deleteByExample(StorageTblExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StorageTbl record);

    int insertSelective(StorageTbl record);

    List<StorageTbl> selectByExample(StorageTblExample example);

    StorageTbl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StorageTbl record, @Param("example") StorageTblExample example);

    int updateByExample(@Param("record") StorageTbl record, @Param("example") StorageTblExample example);

    int updateByPrimaryKeySelective(StorageTbl record);

    int updateByPrimaryKey(StorageTbl record);
}