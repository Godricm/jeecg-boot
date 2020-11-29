package org.jeecg.modules.activiti.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: jeecg-boot-parent
 * @package: org.jeecg.module.activiti.entity
 * @description:
 * @author: miaochen
 * @create: 2020-11-28 16:23
 * @copyright: CopyRight (c) 2020
 * @version: 1.0.0
 * @modified: miaochen
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Assignee {

    private String username;

    private Boolean isExecutor;
}
