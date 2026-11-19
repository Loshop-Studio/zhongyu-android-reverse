package com.alibaba.sdk.android.logger.p057b;

import android.util.Log;
import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.alibaba.sdk.android.logger.b.d */
/* loaded from: classes3.dex */
public class C5606d implements ILogger {

    /* renamed from: com.alibaba.sdk.android.logger.b.d$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4083a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f4083a = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4083a[LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4083a[LogLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4083a[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.alibaba.sdk.android.logger.ILogger
    public void print(LogLevel logLevel, String str, String str2) {
        String strSubstring;
        if (str2.length() > 4000) {
            strSubstring = str2.substring(4000);
            str2 = str2.substring(0, 4000);
        } else {
            strSubstring = null;
        }
        int i10 = AnonymousClass1.f4083a[logLevel.ordinal()];
        if (i10 == 2) {
            Log.i(str, str2);
        } else if (i10 == 3) {
            Log.w(str, str2);
        } else if (i10 == 4) {
            Log.e(str, str2);
        }
        if (strSubstring != null) {
            print(logLevel, str, strSubstring);
        }
    }
}
