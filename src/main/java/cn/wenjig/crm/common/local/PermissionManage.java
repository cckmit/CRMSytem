package cn.wenjig.crm.common.local;

import cn.wenjig.crm.service.PermissionService;
import cn.wenjig.crm.service.impl.PermissionServiceImpl;

public enum PermissionManage {

    RUNTIME;

    private PermissionService permissionService;

    PermissionManage() {
        permissionService = (PermissionService) SpringUtil.getBean(PermissionServiceImpl.class);
    }

    public PermissionService getPermissionService() {
        return permissionService;
    }
}
