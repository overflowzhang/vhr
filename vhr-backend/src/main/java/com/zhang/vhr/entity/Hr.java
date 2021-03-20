package com.zhang.vhr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Hr implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * hrID
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 姓名
     */
      private String name;

      /**
     * 手机号码
     */
      private String phone;

      /**
     * 住宅电话
     */
      private String telephone;

      /**
     * 联系地址
     */
      private String address;

    private Boolean enabled;

      /**
     * 用户名
     */
      private String username;

      /**
     * 密码
     */
      private String password;

    private String userface;

    private String remark;


}
