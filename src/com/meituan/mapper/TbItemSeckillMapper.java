package com.meituan.mapper;

import com.meituan.pojo.TbItemSeckill;
import com.meituan.pojo.TbItemSeckillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemSeckillMapper {
    long countByExample(TbItemSeckillExample example);

    int deleteByExample(TbItemSeckillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemSeckill record);

    int insertSelective(TbItemSeckill record);

    List<TbItemSeckill> selectByExample(TbItemSeckillExample example);

    TbItemSeckill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItemSeckill record, @Param("example") TbItemSeckillExample example);

    int updateByExample(@Param("record") TbItemSeckill record, @Param("example") TbItemSeckillExample example);

    int updateByPrimaryKeySelective(TbItemSeckill record);

    int updateByPrimaryKey(TbItemSeckill record);
}