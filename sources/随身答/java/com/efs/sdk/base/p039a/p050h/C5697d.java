package com.efs.sdk.base.p039a.p050h;

import android.util.Log;
import com.efs.sdk.base.p039a.p044d.C5661a;

/* renamed from: com.efs.sdk.base.a.h.d */
/* loaded from: classes3.dex */
public final class C5697d {
    /* renamed from: a */
    public static void m4181a(String str, String str2) {
        if (C5661a.m4097a().f4647f) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m4183b(String str, String str2, Throwable th) {
        if (C5661a.m4097a().f4647f) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static void m4182a(String str, String str2, Throwable th) {
        if (C5661a.m4097a().f4647f) {
            if (th == null) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, th);
            }
        }
    }
}
