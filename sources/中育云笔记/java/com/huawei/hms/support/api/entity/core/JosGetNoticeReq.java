package com.huawei.hms.support.api.entity.core;

import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class JosGetNoticeReq extends JosBaseReq {
    public static final int NOTICE_TYPE_CONN = 0;
    public static final int NOTICE_TYPE_SIGN = 1;

    @InterfaceC9271a
    private int noticeType;

    private static <T> T get(T t10) {
        return t10;
    }

    public int getNoticeType() {
        return ((Integer) get(Integer.valueOf(this.noticeType))).intValue();
    }

    public void setNoticeType(int i10) {
        this.noticeType = i10;
    }
}
