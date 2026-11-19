package com.tendcloud.tenddata;

import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.tendcloud.tenddata.fu */
/* loaded from: classes5.dex */
public enum EnumC7997fu {
    WIFI(UtilityImpl.NET_TYPE_WIFI),
    CELLULAR("cellular"),
    BLUETOOTH("bluetooth");


    /* renamed from: d */
    private String f14986d;

    EnumC7997fu(String str) {
        this.f14986d = str;
    }

    /* renamed from: a */
    public String m12006a() {
        return this.f14986d;
    }
}
