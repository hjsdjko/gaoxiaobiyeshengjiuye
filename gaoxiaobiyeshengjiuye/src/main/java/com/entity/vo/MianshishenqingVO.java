package com.entity.vo;

import com.entity.MianshishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 面试申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("mianshishenqing")
public class MianshishenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 招聘
     */

    @TableField(value = "zhaopin_id")
    private Integer zhaopinId;


    /**
     * 面试时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "mianshishenqing_time")
    private Date mianshishenqingTime;


    /**
     * 申请状态
     */

    @TableField(value = "mianshishenqing_yesno_types")
    private Integer mianshishenqingYesnoTypes;


    /**
     * 投递回复
     */

    @TableField(value = "mianshishenqing_yesno_text")
    private String mianshishenqingYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：招聘
	 */
    public Integer getZhaopinId() {
        return zhaopinId;
    }


    /**
	 * 获取：招聘
	 */

    public void setZhaopinId(Integer zhaopinId) {
        this.zhaopinId = zhaopinId;
    }
    /**
	 * 设置：面试时间
	 */
    public Date getMianshishenqingTime() {
        return mianshishenqingTime;
    }


    /**
	 * 获取：面试时间
	 */

    public void setMianshishenqingTime(Date mianshishenqingTime) {
        this.mianshishenqingTime = mianshishenqingTime;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getMianshishenqingYesnoTypes() {
        return mianshishenqingYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setMianshishenqingYesnoTypes(Integer mianshishenqingYesnoTypes) {
        this.mianshishenqingYesnoTypes = mianshishenqingYesnoTypes;
    }
    /**
	 * 设置：投递回复
	 */
    public String getMianshishenqingYesnoText() {
        return mianshishenqingYesnoText;
    }


    /**
	 * 获取：投递回复
	 */

    public void setMianshishenqingYesnoText(String mianshishenqingYesnoText) {
        this.mianshishenqingYesnoText = mianshishenqingYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
