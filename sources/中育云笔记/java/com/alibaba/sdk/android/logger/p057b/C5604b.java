package com.alibaba.sdk.android.logger.p057b;

import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.alibaba.sdk.android.logger.b.b */
/* loaded from: classes3.dex */
public class C5604b {

    /* renamed from: a */
    private static final LogLevel f4079a = LogLevel.WARN;

    /* renamed from: b */
    private boolean f4080b = true;

    /* renamed from: c */
    private LogLevel f4081c = f4079a;

    /* renamed from: a */
    public void m3547a(LogLevel logLevel) {
        this.f4081c = logLevel;
    }

    /* renamed from: b */
    public boolean m3549b(LogLevel logLevel) {
        return this.f4080b && logLevel.ordinal() >= this.f4081c.ordinal();
    }

    /* renamed from: a */
    public void m3548a(boolean z10) {
        this.f4080b = z10;
    }
}
