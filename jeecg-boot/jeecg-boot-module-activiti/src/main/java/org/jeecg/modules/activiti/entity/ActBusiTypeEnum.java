package org.jeecg.modules.activiti.entity;

/**
 * @program: jeecg-boot-parent
 * @package: org.jeecg.module.activiti.entity
 * @description: 流程业务字典
 * @author: miaochen
 * @create: 2020-11-28 16:18
 * @copyright: CopyRight (c) 2020
 * @version: 1.0.0
 * @modified: miaochen
 **/
public interface ActBusiTypeEnum {
    /**用章类型*/
    String type_yz = "A01A03A01";
    /**印章管理*/
    String type_yz_yzgl = "A01A03A01A03";
    /**印章借用*/
    String type_yz_yzjy = "A01A03A01A02";
    /**印章使用*/
    String type_yz_yzsy = "A01A03A01A01";
    /**业务接待*/
    String type_ywjd = "A01A03A02A01";
}
