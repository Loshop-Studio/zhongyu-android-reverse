package com.taobao.accs.utl;

import com.alibaba.sdk.android.logger.LogLevel;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.utl.b */
/* loaded from: classes5.dex */
/* synthetic */ class C7676b {

    /* renamed from: a */
    static final /* synthetic */ int[] f13226a;

    /* renamed from: b */
    static final /* synthetic */ int[] f13227b;

    static {
        int[] iArr = new int[ALog.Level.values().length];
        f13227b = iArr;
        try {
            iArr[ALog.Level.D.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13227b[ALog.Level.V.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13227b[ALog.Level.I.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f13227b[ALog.Level.W.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f13227b[ALog.Level.E.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f13227b[ALog.Level.L.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[LogLevel.values().length];
        f13226a = iArr2;
        try {
            iArr2[LogLevel.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f13226a[LogLevel.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f13226a[LogLevel.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f13226a[LogLevel.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
