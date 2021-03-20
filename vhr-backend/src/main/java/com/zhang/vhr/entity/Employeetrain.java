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
    public class Employeetrain implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 员工编号
     */
      private Integer eid;

      /**
     * 培训日期
     */
      @TableField("trainDate")
    private LocalDate trainDate;

      /**
     * 培训内容
     */
      @TableField("trainContent")
    private String trainContent;

      /**
     * 备注
     */
      private String remark;


}
