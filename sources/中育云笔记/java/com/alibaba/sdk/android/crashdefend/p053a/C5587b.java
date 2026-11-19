package com.alibaba.sdk.android.crashdefend.p053a;

import com.alibaba.sdk.android.crashdefend.CrashDefendCallback;
import com.alibaba.sdk.android.crashdefend.p055c.C5590b;

/* renamed from: com.alibaba.sdk.android.crashdefend.a.b */
/* loaded from: classes3.dex */
public class C5587b implements Cloneable {

    /* renamed from: a */
    public String f4023a;

    /* renamed from: b */
    public String f4024b;

    /* renamed from: c */
    public int f4025c;

    /* renamed from: d */
    public int f4026d;

    /* renamed from: e */
    public int f4027e;

    /* renamed from: f */
    public long f4028f;

    /* renamed from: g */
    public long f4029g;

    /* renamed from: h */
    public int f4030h = 0;

    /* renamed from: i */
    public long f4031i = 0;

    /* renamed from: j */
    public volatile boolean f4032j = false;

    /* renamed from: k */
    public CrashDefendCallback f4033k = null;

    public Object clone() {
        try {
            return (C5587b) super.clone();
        } catch (CloneNotSupportedException e10) {
            C5590b.m3482a("CrashSDK", "clone fail: ", e10);
            return null;
        }
    }
}
