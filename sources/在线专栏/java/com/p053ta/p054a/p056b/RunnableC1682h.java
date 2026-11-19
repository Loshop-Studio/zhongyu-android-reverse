package com.p053ta.p054a.p056b;

import android.content.Context;
import android.text.TextUtils;
import com.p053ta.p054a.p055a.C1673a;
import com.p053ta.p054a.p055a.C1674b;
import com.p053ta.p054a.p057c.C1686d;
import com.p053ta.p054a.p057c.C1688f;
import com.p053ta.utdid2.device.C1695a;
import com.p053ta.utdid2.device.C1699e;

/* renamed from: com.ta.a.b.h */
/* loaded from: classes.dex */
public class RunnableC1682h implements Runnable {

    /* renamed from: a */
    private static volatile boolean f7441a = false;
    private Context mContext;

    public RunnableC1682h(Context context) {
        this.mContext = context;
    }

    /* renamed from: a */
    private void m5747a() {
        C1688f.m5774e();
        if (C1686d.m5762b(this.mContext) && !f7441a) {
            f7441a = true;
            try {
                m5749b();
            } catch (Throwable unused) {
            }
            f7441a = false;
        }
    }

    /* renamed from: b */
    private void m5749b() {
        C1688f.m5774e();
        String strM5750e = m5750e();
        if (TextUtils.isEmpty(strM5750e)) {
            C1688f.m5770a("postData is empty", new Object[0]);
        } else if (m5748a(strM5750e)) {
            C1688f.m5770a("", "upload success");
        } else {
            C1688f.m5770a("", "upload fail");
        }
    }

    /* renamed from: e */
    private String m5750e() {
        String strM5792m = C1695a.m5788a().m5792m();
        if (TextUtils.isEmpty(strM5792m)) {
            return null;
        }
        String strM5736a = C1673a.m5736a(strM5792m);
        if (C1688f.m5771a()) {
            C1688f.m5773b("", strM5736a);
        }
        return C1674b.m5738b(strM5736a);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m5747a();
        } catch (Throwable th) {
            C1688f.m5769a("", th, new Object[0]);
        }
    }

    /* renamed from: a */
    private boolean m5748a(String str) throws Throwable {
        C1675a c1675aM5740a = C1676b.m5740a("https://mpush-api.aliyun.com/v2.0/a/audid/req/", str, true);
        if (c1675aM5740a == null) {
            return false;
        }
        return C1699e.m5809a(c1675aM5740a);
    }
}
