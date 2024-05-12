package com.entity.vo;

import com.entity.JinshengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 就业晋升信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jinsheng")
public class JinshengVO implements Serializable {
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
     * 公司名称
     */

    @TableField(value = "jinsheng_name")
    private String jinshengName;


    /**
     * 具体时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jinsheng_time")
    private Date jinshengTime;


    /**
     * 相关情况
     */

    @TableField(value = "jinsheng_text")
    private String jinshengText;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：公司名称
	 */
    public String getJinshengName() {
        return jinshengName;
    }


    /**
	 * 获取：公司名称
	 */

    public void setJinshengName(String jinshengName) {
        this.jinshengName = jinshengName;
    }
    /**
	 * 设置：具体时间
	 */
    public Date getJinshengTime() {
        return jinshengTime;
    }


    /**
	 * 获取：具体时间
	 */

    public void setJinshengTime(Date jinshengTime) {
        this.jinshengTime = jinshengTime;
    }
    /**
	 * 设置：相关情况
	 */
    public String getJinshengText() {
        return jinshengText;
    }


    /**
	 * 获取：相关情况
	 */

    public void setJinshengText(String jinshengText) {
        this.jinshengText = jinshengText;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
