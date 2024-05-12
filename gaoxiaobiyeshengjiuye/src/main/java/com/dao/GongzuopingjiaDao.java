package com.dao;

import com.entity.GongzuopingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuopingjiaView;

/**
 * 工作评价 Dao 接口
 *
 * @author 
 */
public interface GongzuopingjiaDao extends BaseMapper<GongzuopingjiaEntity> {

   List<GongzuopingjiaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
