package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.tendcloud.tenddata.u */
/* loaded from: classes5.dex */
public final class C8016u {

    /* renamed from: a */
    static final String f15108a = "events";

    /* renamed from: b */
    static final String f15109b = "config.";

    /* renamed from: c */
    static final String f15110c = "hybrid";

    /* renamed from: d */
    private static volatile C8016u f15111d;

    /* renamed from: e */
    private C8013q f15112e;

    /* renamed from: f */
    private Handler f15113f;

    static {
        try {
            m12091a();
        } catch (Throwable unused) {
        }
    }

    private C8016u() {
    }

    /* renamed from: a */
    public static C8016u m12091a() {
        if (f15111d == null) {
            synchronized (C8016u.class) {
                try {
                    if (f15111d == null) {
                        f15111d = new C8016u();
                    }
                } finally {
                }
            }
        }
        return f15111d;
    }

    /* renamed from: b */
    public void m12093b() {
        try {
            if (C8022zz.f15144e != null) {
                Context context = C7843ab.f14307g;
                this.f15112e = C8013q.m12073a(context, C7843ab.m11027a(context, AbstractC7841a.UNIVERSAL), C8022zz.f15144e);
                C8020y.m12122a().m12129d().obtainMessage(6).sendToTarget();
            }
        } catch (Throwable unused) {
        }
    }

    public void connectWebSocket(String str) {
        m12091a().f15113f.sendMessage(m12091a().f15113f.obtainMessage(1, str));
    }

    /* renamed from: a */
    public void m12092a(Handler handler) {
        this.f15113f = handler;
    }
}
