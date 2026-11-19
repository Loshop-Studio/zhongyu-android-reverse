package com.taobao.accs.utl;

import com.alibaba.sdk.android.logger.LogLevel;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.utl.b */
/* loaded from: classes.dex */
/* synthetic */ class C1779b {

    /* renamed from: a */
    static final /* synthetic */ int[] f7828a;

    /* renamed from: b */
    static final /* synthetic */ int[] f7829b;

    static {
        int[] iArr = new int[ALog.Level.values().length];
        f7829b = iArr;
        try {
            iArr[ALog.Level.D.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7829b[ALog.Level.V.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7829b[ALog.Level.I.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7829b[ALog.Level.W.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f7829b[ALog.Level.E.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7829b[ALog.Level.L.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[LogLevel.values().length];
        f7828a = iArr2;
        try {
            iArr2[LogLevel.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f7828a[LogLevel.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f7828a[LogLevel.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f7828a[LogLevel.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
