package com.alibaba.sdk.android.push.p064e;

import androidx.lifecycle.CoroutineLiveDataKt;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.alibaba.sdk.android.push.e.f */
/* loaded from: classes3.dex */
public class C5671f {

    /* renamed from: a */
    private final ConcurrentHashMap<Integer, a> f4337a = new ConcurrentHashMap<>();

    /* renamed from: com.alibaba.sdk.android.push.e.f$a */
    public static class a {

        /* renamed from: a */
        private final String f4338a;

        /* renamed from: b */
        private final String f4339b;

        /* renamed from: c */
        private final long f4340c;

        public a(String str, String str2, long j10) {
            this.f4338a = str;
            this.f4339b = str2;
            this.f4340c = j10;
        }

        /* renamed from: a */
        public String m3677a() {
            return this.f4339b;
        }

        /* renamed from: b */
        public long m3678b() {
            return this.f4340c;
        }
    }

    /* renamed from: a */
    public a m3675a(int i10) {
        a aVar = this.f4337a.get(Integer.valueOf(i10));
        if (aVar == null || m3674a(aVar.m3678b(), System.currentTimeMillis())) {
            return null;
        }
        return aVar;
    }

    /* renamed from: a */
    public void m3676a(int i10, String str) {
        a aVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return;
                    } else {
                        aVar = new a(String.valueOf(4), str, jCurrentTimeMillis);
                    }
                } else {
                    aVar = new a(String.valueOf(3), str, jCurrentTimeMillis);
                }
            } else {
                aVar = new a(String.valueOf(2), str, jCurrentTimeMillis);
            }
        } else {
            aVar = new a(String.valueOf(1), str, jCurrentTimeMillis);
        }
        this.f4337a.put(Integer.valueOf(i11), aVar);
    }

    /* renamed from: a */
    private boolean m3674a(long j10, long j11) {
        return j11 - j10 >= CoroutineLiveDataKt.DEFAULT_TIMEOUT;
    }
}
