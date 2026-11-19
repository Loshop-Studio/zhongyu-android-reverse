package com.p074ta.p075a.p077b;

import android.content.Context;
import android.text.TextUtils;
import com.p074ta.p075a.p076a.C7570a;
import com.p074ta.p075a.p076a.C7571b;
import com.p074ta.p075a.p078c.C7583d;
import com.p074ta.p075a.p078c.C7585f;
import com.p074ta.utdid2.device.C7592a;
import com.p074ta.utdid2.device.C7596e;

/* renamed from: com.ta.a.b.h */
/* loaded from: classes5.dex */
public class RunnableC7579h implements Runnable {

    /* renamed from: a */
    private static volatile boolean f12839a = false;
    private Context mContext;

    public RunnableC7579h(Context context) {
        this.mContext = context;
    }

    /* renamed from: a */
    private void m9773a() {
        C7585f.m9800e();
        if (C7583d.m9788b(this.mContext) && !f12839a) {
            f12839a = true;
            try {
                m9775b();
                f12839a = false;
            } catch (Throwable unused) {
                f12839a = false;
            }
        }
    }

    /* renamed from: b */
    private void m9775b() {
        C7585f.m9800e();
        String strM9776e = m9776e();
        if (TextUtils.isEmpty(strM9776e)) {
            C7585f.m9796a("postData is empty", new Object[0]);
        } else if (m9774a(strM9776e)) {
            C7585f.m9796a("", "upload success");
        } else {
            C7585f.m9796a("", "upload fail");
        }
    }

    /* renamed from: e */
    private String m9776e() {
        String strM9818m = C7592a.m9814a().m9818m();
        if (TextUtils.isEmpty(strM9818m)) {
            return null;
        }
        String strM9762a = C7570a.m9762a(strM9818m);
        if (C7585f.m9797a()) {
            C7585f.m9799b("", strM9762a);
        }
        return C7571b.m9764b(strM9762a);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m9773a();
        } catch (Throwable th) {
            C7585f.m9795a("", th, new Object[0]);
        }
    }

    /* renamed from: a */
    private boolean m9774a(String str) throws Throwable {
        C7572a c7572aM9766a = C7573b.m9766a("https://mpush-api.aliyun.com/v2.0/a/audid/req/", str, true);
        if (c7572aM9766a == null) {
            return false;
        }
        return C7596e.m9835a(c7572aM9766a);
    }
}
