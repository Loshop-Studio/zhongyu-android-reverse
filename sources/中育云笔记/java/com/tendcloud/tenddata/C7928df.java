package com.tendcloud.tenddata;

import android.util.EventLogTags;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.tendcloud.tenddata.df */
/* loaded from: classes5.dex */
public final class C7928df {

    /* renamed from: a */
    private static byte[] f14689a = new byte[0];

    /* renamed from: b */
    private static volatile int f14690b;

    /* renamed from: c */
    private static volatile IvParameterSpec f14691c;

    /* renamed from: d */
    private static volatile byte[] f14692d;

    /* renamed from: e */
    private static volatile SecretKey f14693e;

    static {
        synchronized (EventLogTags.class) {
            try {
                if (f14690b == 0) {
                    f14690b = C7932dj.m11713a();
                }
                if (f14691c == null) {
                    f14691c = C7930dh.m11697a();
                }
                if (f14692d == null) {
                    f14692d = C7930dh.m11700b();
                }
                if (f14693e == null) {
                    f14693e = C7930dh.m11696a(String.valueOf(f14690b).toCharArray(), f14692d);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private C7928df() {
    }

    /* renamed from: a */
    public static byte[] m11689a(byte[] bArr) {
        try {
            return C7930dh.m11699a(bArr, f14693e, f14691c);
        } catch (Throwable unused) {
            return f14689a;
        }
    }

    /* renamed from: b */
    public static byte[] m11690b(byte[] bArr) {
        try {
            return C7930dh.m11701b(bArr, f14693e, f14691c);
        } catch (Throwable unused) {
            return f14689a;
        }
    }
}
