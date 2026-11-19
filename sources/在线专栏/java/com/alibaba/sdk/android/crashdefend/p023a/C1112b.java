package com.alibaba.sdk.android.crashdefend.p023a;

import com.alibaba.sdk.android.crashdefend.CrashDefendCallback;
import com.alibaba.sdk.android.crashdefend.p025c.C1115b;

/* renamed from: com.alibaba.sdk.android.crashdefend.a.b */
/* loaded from: classes.dex */
public class C1112b implements Cloneable {

    /* renamed from: a */
    public String f6538a;

    /* renamed from: b */
    public String f6539b;

    /* renamed from: c */
    public int f6540c;

    /* renamed from: d */
    public int f6541d;

    /* renamed from: e */
    public int f6542e;

    /* renamed from: f */
    public long f6543f;

    /* renamed from: g */
    public long f6544g;

    /* renamed from: h */
    public int f6545h = 0;

    /* renamed from: i */
    public long f6546i = 0;

    /* renamed from: j */
    public volatile boolean f6547j = false;

    /* renamed from: k */
    public CrashDefendCallback f6548k = null;

    public Object clone() {
        try {
            return (C1112b) super.clone();
        } catch (CloneNotSupportedException e4) {
            C1115b.m5081a("CrashSDK", "clone fail: ", e4);
            return null;
        }
    }
}
