package com.taobao.sophix.p089a;

import com.taobao.accs.common.Constants;
import com.taobao.sophix.SophixManager;

/* renamed from: com.taobao.sophix.a.d */
/* loaded from: classes5.dex */
public class C7716d {

    /* renamed from: a */
    private String f13310a = SophixManager.VERSION;

    /* renamed from: b */
    private boolean f13311b;

    /* renamed from: c */
    private boolean f13312c;

    /* renamed from: d */
    private boolean f13313d;

    /* renamed from: e */
    private boolean f13314e;

    public C7716d() {
    }

    public String toString() {
        return "version:" + this.f13310a + "\u0000hot:" + this.f13314e + "\u0000dex:" + this.f13311b + "\u0000" + Constants.SEND_TYPE_RES + ":" + this.f13312c + "\u0000so:" + this.f13313d;
    }

    public C7716d(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f13311b = z10;
        this.f13312c = z11;
        this.f13313d = z12;
        this.f13314e = z13;
    }
}
