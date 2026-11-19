package com.p074ta.utdid2.device;

import android.content.Context;
import android.text.TextUtils;
import com.p074ta.p075a.C7569a;
import com.p074ta.p075a.p077b.C7576e;
import com.p074ta.p075a.p077b.RunnableC7579h;
import com.p074ta.p075a.p078c.C7582c;
import com.p074ta.p075a.p078c.C7585f;

/* renamed from: com.ta.utdid2.device.a */
/* loaded from: classes5.dex */
public class C7592a {

    /* renamed from: a */
    private static final C7592a f12864a = new C7592a();

    /* renamed from: c */
    private static long f12865c = 3000;

    /* renamed from: d */
    private String f12866d = "";

    private C7592a() {
    }

    /* renamed from: a */
    public static C7592a m9814a() {
        return f12864a;
    }

    /* renamed from: f */
    private void m9816f() {
        C7585f.m9800e();
        if (TextUtils.isEmpty(this.f12866d)) {
            return;
        }
        try {
            final Context context = C7569a.m9757a().getContext();
            boolean zM9823c = C7594c.m9823c(context);
            C7585f.m9796a("", "isMainProcess", Boolean.valueOf(zM9823c));
            if (zM9823c) {
                new Thread(new Runnable() { // from class: com.ta.utdid2.device.a.1
                    @Override // java.lang.Runnable
                    public void run() throws InterruptedException {
                        try {
                            Thread.sleep(C7592a.f12865c);
                        } catch (Exception unused) {
                        }
                        if (C7576e.m9769a(context)) {
                            new RunnableC7579h(context).run();
                        } else {
                            C7585f.m9796a("", "unable upload!");
                        }
                    }
                }).start();
            }
        } catch (Throwable th) {
            C7585f.m9796a("", th);
        }
    }

    /* renamed from: l */
    private String m9817l() {
        if (C7569a.m9757a().getContext() == null) {
            return "";
        }
        String strM9772d = C7576e.m9772d();
        if (!C7595d.m9832c(strM9772d)) {
            return null;
        }
        C7585f.m9796a("AppUtdid", "read utdid from V5AppFile");
        C7595d.setType(7);
        return strM9772d;
    }

    public synchronized String getUtdid(Context context) {
        if (!TextUtils.isEmpty(this.f12866d)) {
            return this.f12866d;
        }
        try {
            C7582c.m9786c();
            String strM9817l = m9817l();
            if (TextUtils.isEmpty(strM9817l)) {
                strM9817l = C7595d.m9828a(context).getValue();
            }
            if (TextUtils.isEmpty(strM9817l)) {
                return "ffffffffffffffffffffffff";
            }
            this.f12866d = strM9817l;
            m9816f();
            return this.f12866d;
        } catch (Throwable th) {
            try {
                C7585f.m9795a("AppUtdid", th, new Object[0]);
                return "ffffffffffffffffffffffff";
            } finally {
                C7582c.m9787d();
            }
        }
    }

    /* renamed from: m */
    public synchronized String m9818m() {
        return this.f12866d;
    }
}
