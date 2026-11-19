package com.efs.sdk.base.p035a.p046h;

import android.util.Log;
import com.efs.sdk.base.p035a.p040d.C1293a;

/* renamed from: com.efs.sdk.base.a.h.d */
/* loaded from: classes.dex */
public final class C1329d {
    /* renamed from: a */
    public static void m5571a(String str, String str2) {
        if (C1293a.m5487a().f7013f) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m5573b(String str, String str2, Throwable th) {
        if (C1293a.m5487a().f7013f) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static void m5572a(String str, String str2, Throwable th) {
        if (C1293a.m5487a().f7013f) {
            if (th == null) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, th);
            }
        }
    }
}
