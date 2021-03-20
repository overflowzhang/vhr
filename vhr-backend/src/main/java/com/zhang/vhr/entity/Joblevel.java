package com.zhang.vhr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
    public class Joblevel implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 职称名称
     */
      private String name;

    @TableField("titleLevel")
    private String titleLevel;

    @TableField("createDate")
    private LocalDateTime createDate;

    private Boolean enabled;


}
