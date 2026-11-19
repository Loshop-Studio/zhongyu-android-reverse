package com.alibaba.sdk.android.push.common.util.p061a;

import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.common.global.C5654c;

/* renamed from: com.alibaba.sdk.android.push.common.util.a.b */
/* loaded from: classes3.dex */
public class C5658b {

    /* renamed from: a */
    public String f4269a;

    /* renamed from: b */
    public int f4270b;

    /* renamed from: c */
    public ErrorCode f4271c;

    /* renamed from: d */
    public EnumC5660d f4272d;

    public C5658b() {
        this.f4271c = C5654c.f4242a;
        this.f4269a = "";
        this.f4270b = 0;
        this.f4272d = EnumC5660d.UNKNOWN_TYPE;
    }

    public C5658b(int i10) {
        this.f4271c = C5654c.f4242a;
        for (EnumC5660d enumC5660d : EnumC5660d.values()) {
            if (enumC5660d.m3636a() == i10) {
                this.f4272d = enumC5660d;
            }
        }
        this.f4269a = "";
        this.f4270b = 0;
    }
}
