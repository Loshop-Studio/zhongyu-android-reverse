package com.alibaba.sdk.android.logger.p057b;

import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.ILoggerWithControl;
import com.alibaba.sdk.android.logger.LogLevel;
import java.util.ArrayList;

/* renamed from: com.alibaba.sdk.android.logger.b.e */
/* loaded from: classes3.dex */
public class C5607e implements ILogger {

    /* renamed from: a */
    private static final ILogger f4084a = new C5606d();

    /* renamed from: b */
    private ILogger f4085b = f4084a;

    /* renamed from: c */
    private ArrayList<ILogger> f4086c = new ArrayList<>();

    /* renamed from: d */
    private C5604b f4087d;

    public C5607e(C5604b c5604b) {
        this.f4087d = c5604b;
    }

    /* renamed from: a */
    public void m3551a(ILogger iLogger) {
        if (iLogger == null) {
            this.f4085b = f4084a;
        } else {
            this.f4085b = iLogger;
        }
    }

    /* renamed from: b */
    public void m3553b(ILogger iLogger) {
        if (iLogger != null) {
            this.f4086c.add(iLogger);
        }
    }

    /* renamed from: c */
    public void m3554c(ILogger iLogger) {
        if (iLogger != null) {
            this.f4086c.remove(iLogger);
        }
    }

    @Override // com.alibaba.sdk.android.logger.ILogger
    public void print(LogLevel logLevel, String str, String str2) {
        if (m3550a(this.f4085b, logLevel)) {
            try {
                this.f4085b.print(logLevel, str, str2);
            } catch (Throwable unused) {
            }
        }
        try {
            ArrayList<ILogger> arrayList = this.f4086c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                ILogger iLogger = arrayList.get(i10);
                i10++;
                ILogger iLogger2 = iLogger;
                if (m3550a(iLogger2, logLevel)) {
                    try {
                        iLogger2.print(logLevel, str, str2);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    private boolean m3550a(ILogger iLogger, LogLevel logLevel) {
        if (iLogger == null || !(iLogger instanceof ILoggerWithControl)) {
            return this.f4087d.m3549b(logLevel);
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
    public boolean m3552a(LogLevel logLevel) {
        if (m3550a(this.f4085b, logLevel)) {
            return true;
        }
        try {
            ArrayList<ILogger> arrayList = this.f4086c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                ILogger iLogger = arrayList.get(i10);
                i10++;
                if (m3550a(iLogger, logLevel)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
