package com.efs.sdk.base.p020a.p031h;

import android.util.Log;
import com.efs.sdk.base.p020a.p025d.C2921a;

/* renamed from: com.efs.sdk.base.a.h.d */
/* loaded from: classes2.dex */
public final class C2957d {
    /* renamed from: a */
    public static void m2212a(String str, String str2) {
        if (C2921a.m2128a().f1043f) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m2214b(String str, String str2, Throwable th) {
        if (C2921a.m2128a().f1043f) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static void m2213a(String str, String str2, Throwable th) {
        if (C2921a.m2128a().f1043f) {
            if (th == null) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, th);
            }
        }
    }
}
