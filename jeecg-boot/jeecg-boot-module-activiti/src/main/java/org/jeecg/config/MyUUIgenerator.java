package org.jeecg.config;

import cn.hutool.core.util.IdUtil;
import org.activiti.engine.impl.cfg.IdGenerator;

import java.util.UUID;

/**
 * @program: jeecg-boot-parent
 * @package: org.jeecg.config
 * @description:
 * @author: miaochen
 * @create: 2020-11-28 17:06
 * @copyright: CopyRight (c) 2020
 * @version: 1.0.0
 * @modified: miaochen
 **/
public class MyUUIgenerator implements IdGenerator {
    @Override
    public String getNextId() {
        String uuid="act-"+ IdUtil.randomUUID();
        return uuid;
    }
}
