package com.zhang.vhr.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghe
 * @since 2021-03-20
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class MailSendLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("msgId")
    private String msgId;

    @TableField("empId")
    private Integer empId;

      /**
     * 0发送中，1发送成功，2发送失败
     */
      private Integer status;

    @TableField("routeKey")
    private String routeKey;

    private String exchange;

      /**
     * 重试次数
     */
      private Integer count;

      /**
     * 第一次重试时间
     */
      @TableField("tryTime")
    private LocalDate tryTime;

    @TableField("createTime")
    private LocalDate createTime;

    @TableField("updateTime")
    private LocalDate updateTime;


}
