package com.zhang.vhr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Adjustsalary implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Integer eid;

      /**
     * 调薪日期
     */
      @TableField("asDate")
    private LocalDate asDate;

      /**
     * 调前薪资
     */
      @TableField("beforeSalary")
    private Integer beforeSalary;

      /**
     * 调后薪资
     */
      @TableField("afterSalary")
    private Integer afterSalary;

      /**
     * 调薪原因
     */
      private String reason;

      /**
     * 备注
     */
      private String remark;


}
