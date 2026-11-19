package com.alibaba.sdk.android.oss.model;

import com.taobao.accs.AccsClientConfig;

/* loaded from: classes.dex */
public enum ObjectPermission {
    Private("private"),
    PublicRead("public-read"),
    PublicReadWrite("public-read-write"),
    Default(AccsClientConfig.DEFAULT_CONFIG_TAG),
    Unknown("");

    private String permissionString;

    ObjectPermission(String str) {
        this.permissionString = str;
    }

    public static ObjectPermission parsePermission(String str) {
        ObjectPermission[] objectPermissionArr = {Private, PublicRead, PublicReadWrite, Default};
        for (int i4 = 0; i4 < 4; i4++) {
            ObjectPermission objectPermission = objectPermissionArr[i4];
            if (objectPermission.permissionString.equals(str)) {
                return objectPermission;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.permissionString;
    }
}
