package com.alibaba.sdk.android.push.common.util.p031a;

import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.common.global.C1163c;

/* renamed from: com.alibaba.sdk.android.push.common.util.a.b */
/* loaded from: classes.dex */
public class C1167b {

    /* renamed from: a */
    public String f6745a;

    /* renamed from: b */
    public int f6746b;

    /* renamed from: c */
    public ErrorCode f6747c;

    /* renamed from: d */
    public EnumC1169d f6748d;

    public C1167b() {
        this.f6747c = C1163c.f6718a;
        this.f6745a = "";
        this.f6746b = 0;
        this.f6748d = EnumC1169d.UNKNOWN_TYPE;
    }

    public C1167b(int i4) {
        this.f6747c = C1163c.f6718a;
        for (EnumC1169d enumC1169d : EnumC1169d.values()) {
            if (enumC1169d.m5185a() == i4) {
                this.f6748d = enumC1169d;
            }
        }
        this.f6745a = "";
        this.f6746b = 0;
    }
}
