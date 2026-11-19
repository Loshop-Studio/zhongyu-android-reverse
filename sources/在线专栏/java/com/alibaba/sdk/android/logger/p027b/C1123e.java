package com.alibaba.sdk.android.logger.p027b;

import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.ILoggerWithControl;
import com.alibaba.sdk.android.logger.LogLevel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.alibaba.sdk.android.logger.b.e */
/* loaded from: classes.dex */
public class C1123e implements ILogger {

    /* renamed from: a */
    private static final ILogger f6565a = new C1122d();

    /* renamed from: b */
    private ILogger f6566b = f6565a;

    /* renamed from: c */
    private ArrayList<ILogger> f6567c = new ArrayList<>();

    /* renamed from: d */
    private C1120b f6568d;

    public C1123e(C1120b c1120b) {
        this.f6568d = c1120b;
    }

    /* renamed from: a */
    private boolean m5100a(ILogger iLogger, LogLevel logLevel) {
        if (iLogger == null || !(iLogger instanceof ILoggerWithControl)) {
            return this.f6568d.m5099b(logLevel);
        }
        try {
            if (((ILoggerWithControl) iLogger).isEnabled()) {
                return ((ILoggerWithControl) iLogger).isPrint(logLevel);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void m5101a(ILogger iLogger) {
        if (iLogger == null) {
            iLogger = f6565a;
        }
        this.f6566b = iLogger;
    }

    /* renamed from: a */
    public boolean m5102a(LogLevel logLevel) {
        if (m5100a(this.f6566b, logLevel)) {
            return true;
        }
        try {
            Iterator<ILogger> it = this.f6567c.iterator();
            while (it.hasNext()) {
                if (m5100a(it.next(), logLevel)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public void m5103b(ILogger iLogger) {
        if (iLogger != null) {
            this.f6567c.add(iLogger);
        }
    }

    /* renamed from: c */
    public void m5104c(ILogger iLogger) {
        if (iLogger != null) {
            this.f6567c.remove(iLogger);
        }
    }

    @Override // com.alibaba.sdk.android.logger.ILogger
    public void print(LogLevel logLevel, String str, String str2) {
        if (m5100a(this.f6566b, logLevel)) {
            try {
                this.f6566b.print(logLevel, str, str2);
            } catch (Throwable unused) {
            }
        }
        try {
            Iterator<ILogger> it = this.f6567c.iterator();
            while (it.hasNext()) {
                ILogger next = it.next();
                if (m5100a(next, logLevel)) {
                    try {
                        next.print(logLevel, str, str2);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
