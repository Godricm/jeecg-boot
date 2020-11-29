package org.jeecg.modules.activiti.entity;

import lombok.Data;

/**
 * @program: jeecg-boot-parent
 * @package: org.jeecg.module.activiti.entity
 * @description:
 * @author: miaochen
 * @create: 2020-11-28 16:28
 * @copyright: CopyRight (c) 2020
 * @version: 1.0.0
 * @modified: miaochen
 **/
@Data
public class Role {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 备注
     */
    private String description;
}
