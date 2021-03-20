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
    public class Employeeec implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 员工编号
     */
      private Integer eid;

      /**
     * 奖罚日期
     */
      @TableField("ecDate")
    private LocalDate ecDate;

      /**
     * 奖罚原因
     */
      @TableField("ecReason")
    private String ecReason;

      /**
     * 奖罚分
     */
      @TableField("ecPoint")
    private Integer ecPoint;

      /**
     * 奖罚类别，0：奖，1：罚
     */
      @TableField("ecType")
    private Integer ecType;

      /**
     * 备注
     */
      private String remark;


}
