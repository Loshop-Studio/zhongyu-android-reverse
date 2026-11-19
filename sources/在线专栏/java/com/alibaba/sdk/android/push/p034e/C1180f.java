package com.alibaba.sdk.android.push.p034e;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.alibaba.sdk.android.push.e.f */
/* loaded from: classes.dex */
public class C1180f {

    /* renamed from: a */
    private final ConcurrentHashMap<Integer, a> f6813a = new ConcurrentHashMap<>();

    /* renamed from: com.alibaba.sdk.android.push.e.f$a */
    static class a {

        /* renamed from: a */
        private final String f6814a;

        /* renamed from: b */
        private final String f6815b;

        /* renamed from: c */
        private final long f6816c;

        public a(String str, String str2, long j4) {
            this.f6814a = str;
            this.f6815b = str2;
            this.f6816c = j4;
        }

        /* renamed from: a */
        public String m5226a() {
            return this.f6815b;
        }

        /* renamed from: b */
        public long m5227b() {
            return this.f6816c;
        }
    }

    /* renamed from: a */
    private boolean m5223a(long j4, long j5) {
        return j5 - j4 >= 5000;
    }

    /* renamed from: a */
    public a m5224a(int i4) {
        a aVar = this.f6813a.get(Integer.valueOf(i4));
        if (aVar == null || m5223a(aVar.m5227b(), System.currentTimeMillis())) {
            return null;
        }
        return aVar;
    }

    /* renamed from: a */
    public void m5225a(int i4, String str) {
        a aVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                i5 = 3;
                if (i4 != 3) {
                    i5 = 4;
                    if (i4 != 4) {
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
        this.f6813a.put(Integer.valueOf(i5), aVar);
    }
}
