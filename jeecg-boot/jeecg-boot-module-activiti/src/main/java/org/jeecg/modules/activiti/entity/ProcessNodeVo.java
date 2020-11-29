package org.jeecg.modules.activiti.entity;

import lombok.Data;
import org.jeecg.common.system.vo.LoginUser;

import java.util.List;

/**
 * @program: jeecg-boot-parent
 * @package: org.jeecg.module.activiti.entity
 * @description: 节点
 * @author: miaochen
 * @create: 2020-11-28 16:27
 * @copyright: CopyRight (c) 2020
 * @version: 1.0.0
 * @modified: miaochen
 **/
@Data
public class ProcessNodeVo {

    /**节点id*/
    private String id;
    /**流程定义id*/
    private String procDefId;
    /**节点名*/
    private String title;
    /**节点类型 0开始 1用户任务 2结束 3排他网关 4并行网关*/
    private Integer type;
    /**关联角色*/
    private List<Role> roles;
    /**关联用户*/
    private List<LoginUser> users;
    /**关联部门*/
    private List<Department> departments;
    /**选操作人的部门负责人*/
    private Boolean chooseDepHeader = false;
    /**选操作人*/
    private Boolean chooseSponsor = false;
    /**节点展开 前端所需*/
    private Boolean expand = true;
}
