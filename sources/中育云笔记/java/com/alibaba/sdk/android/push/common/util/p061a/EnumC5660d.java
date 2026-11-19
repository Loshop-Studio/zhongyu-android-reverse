package com.alibaba.sdk.android.push.common.util.p061a;

import com.taobao.sophix.PatchStatus;

/* renamed from: com.alibaba.sdk.android.push.common.util.a.d */
/* loaded from: classes3.dex */
public enum EnumC5660d {
    UNKNOWN_TYPE(0, "unknown"),
    CONFIG(100, "config"),
    BIND_ACCOUNT(PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX, "Bind account"),
    UNBIND_ACCOUNT(106, "Unbind account"),
    BIND_TAG_TO_DEVICE(101, "Bind tag to device"),
    BIND_TAG_TO_ACCOUNT(102, "Bind tag to account"),
    BIND_TAG_TO_ALIAS(103, "Bind tag to alias"),
    BIND_ALIAS(104, "Add alias to device"),
    UNBIND_TAG_TO_DEVICE(1101, "Unbind tag from device"),
    UNBIND_TAG_TO_ACCOUNT(1102, "Unbind tag from account"),
    UNBIND_TAG_TO_ALIAS(1103, "Unbind tag from alias"),
    UNBIND_ALIAS(1104, "Remove alias"),
    LIST_TAGS(1201, "List tags of device"),
    LIST_ALIASES(1202, "List aliases of device"),
    TURN_OFF_PUSH(1203, "Turn off push"),
    TURN_ON_PUSH(1204, "Turn on push"),
    CHECK_PUSH_STATUS(1205, "Check push status"),
    BIND_PHONE_NUMBER(1206, "bind phone number to devices"),
    UNBIND_PHONE_NUMBER(1207, "unbind phone number to devices"),
    ON_APP_START(1208, "on app start");


    /* renamed from: u */
    private final int f4299u;

    EnumC5660d(int i10, String str) {
        this.f4299u = i10;
    }

    /* renamed from: b */
    public static int m3635b() {
        return 100;
    }

    /* renamed from: a */
    public int m3636a() {
        return this.f4299u;
    }
}
