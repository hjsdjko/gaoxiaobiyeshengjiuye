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
 * 就业晋升信息
 *
 * @author 
 * @email
 */
@TableName("jinsheng")
public class JinshengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JinshengEntity() {

	}

	public JinshengEntity(T t) {
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
     * 公司名称
     */
    @ColumnInfo(comment="公司名称",type="varchar(200)")
    @TableField(value = "jinsheng_name")

    private String jinshengName;


    /**
     * 具体时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="具体时间",type="timestamp")
    @TableField(value = "jinsheng_time")

    private Date jinshengTime;


    /**
     * 相关情况
     */
    @ColumnInfo(comment="相关情况",type="text")
    @TableField(value = "jinsheng_text")

    private String jinshengText;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="记录时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：公司名称
	 */
    public String getJinshengName() {
        return jinshengName;
    }
    /**
	 * 设置：公司名称
	 */

    public void setJinshengName(String jinshengName) {
        this.jinshengName = jinshengName;
    }
    /**
	 * 获取：具体时间
	 */
    public Date getJinshengTime() {
        return jinshengTime;
    }
    /**
	 * 设置：具体时间
	 */

    public void setJinshengTime(Date jinshengTime) {
        this.jinshengTime = jinshengTime;
    }
    /**
	 * 获取：相关情况
	 */
    public String getJinshengText() {
        return jinshengText;
    }
    /**
	 * 设置：相关情况
	 */

    public void setJinshengText(String jinshengText) {
        this.jinshengText = jinshengText;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jinsheng{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", jinshengName=" + jinshengName +
            ", jinshengTime=" + DateUtil.convertString(jinshengTime,"yyyy-MM-dd") +
            ", jinshengText=" + jinshengText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
