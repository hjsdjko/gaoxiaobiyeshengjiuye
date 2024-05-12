package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 面试申请
 *
 * @author 
 * @email
 */
@TableName("mianshishenqing")
public class MianshishenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MianshishenqingEntity() {

	}

	public MianshishenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 招聘
     */
    @ColumnInfo(comment="招聘",type="int(11)")
    @TableField(value = "zhaopin_id")

    private Integer zhaopinId;


    /**
     * 面试时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="面试时间",type="timestamp")
    @TableField(value = "mianshishenqing_time")

    private Date mianshishenqingTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "mianshishenqing_yesno_types")

    private Integer mianshishenqingYesnoTypes;


    /**
     * 投递回复
     */
    @ColumnInfo(comment="投递回复",type="text")
    @TableField(value = "mianshishenqing_yesno_text")

    private String mianshishenqingYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：招聘
	 */
    public Integer getZhaopinId() {
        return zhaopinId;
    }
    /**
	 * 设置：招聘
	 */

    public void setZhaopinId(Integer zhaopinId) {
        this.zhaopinId = zhaopinId;
    }
    /**
	 * 获取：面试时间
	 */
    public Date getMianshishenqingTime() {
        return mianshishenqingTime;
    }
    /**
	 * 设置：面试时间
	 */

    public void setMianshishenqingTime(Date mianshishenqingTime) {
        this.mianshishenqingTime = mianshishenqingTime;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getMianshishenqingYesnoTypes() {
        return mianshishenqingYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setMianshishenqingYesnoTypes(Integer mianshishenqingYesnoTypes) {
        this.mianshishenqingYesnoTypes = mianshishenqingYesnoTypes;
    }
    /**
	 * 获取：投递回复
	 */
    public String getMianshishenqingYesnoText() {
        return mianshishenqingYesnoText;
    }
    /**
	 * 设置：投递回复
	 */

    public void setMianshishenqingYesnoText(String mianshishenqingYesnoText) {
        this.mianshishenqingYesnoText = mianshishenqingYesnoText;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Mianshishenqing{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", zhaopinId=" + zhaopinId +
            ", mianshishenqingTime=" + DateUtil.convertString(mianshishenqingTime,"yyyy-MM-dd") +
            ", mianshishenqingYesnoTypes=" + mianshishenqingYesnoTypes +
            ", mianshishenqingYesnoText=" + mianshishenqingYesnoText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
