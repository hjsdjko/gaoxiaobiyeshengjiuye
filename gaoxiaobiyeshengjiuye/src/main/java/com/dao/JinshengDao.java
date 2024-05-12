package com.dao;

import com.entity.JinshengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JinshengView;

/**
 * 就业晋升信息 Dao 接口
 *
 * @author 
 */
public interface JinshengDao extends BaseMapper<JinshengEntity> {

   List<JinshengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
