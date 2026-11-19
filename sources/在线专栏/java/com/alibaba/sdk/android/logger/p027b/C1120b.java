package com.alibaba.sdk.android.logger.p027b;

import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.alibaba.sdk.android.logger.b.b */
/* loaded from: classes.dex */
public class C1120b {

    /* renamed from: a */
    private static final LogLevel f6560a = LogLevel.WARN;

    /* renamed from: b */
    private boolean f6561b = true;

    /* renamed from: c */
    private LogLevel f6562c = f6560a;

    /* renamed from: a */
    public void m5097a(LogLevel logLevel) {
        this.f6562c = logLevel;
    }

    /* renamed from: a */
    public void m5098a(boolean z3) {
        this.f6561b = z3;
    }

    /* renamed from: b */
    public boolean m5099b(LogLevel logLevel) {
        return this.f6561b && logLevel.ordinal() >= this.f6562c.ordinal();
    }
}
