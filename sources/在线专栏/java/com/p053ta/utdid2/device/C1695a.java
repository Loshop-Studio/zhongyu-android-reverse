package com.p053ta.utdid2.device;

import android.content.Context;
import android.text.TextUtils;
import com.p053ta.p054a.C1672a;
import com.p053ta.p054a.p056b.C1679e;
import com.p053ta.p054a.p056b.RunnableC1682h;
import com.p053ta.p054a.p057c.C1685c;
import com.p053ta.p054a.p057c.C1688f;

/* renamed from: com.ta.utdid2.device.a */
/* loaded from: classes.dex */
public class C1695a {

    /* renamed from: a */
    private static final C1695a f7466a = new C1695a();

    /* renamed from: c */
    private static long f7467c = 3000;

    /* renamed from: d */
    private String f7468d = "";

    private C1695a() {
    }

    /* renamed from: a */
    public static C1695a m5788a() {
        return f7466a;
    }

    /* renamed from: f */
    private void m5790f() {
        C1688f.m5774e();
        if (TextUtils.isEmpty(this.f7468d)) {
            return;
        }
        try {
            final Context context = C1672a.m5731a().getContext();
            boolean zM5797c = C1697c.m5797c(context);
            C1688f.m5770a("", "isMainProcess", Boolean.valueOf(zM5797c));
            if (zM5797c) {
                new Thread(new Runnable() { // from class: com.ta.utdid2.device.a.1
                    @Override // java.lang.Runnable
                    public void run() throws InterruptedException {
                        try {
                            Thread.sleep(C1695a.f7467c);
                        } catch (Exception unused) {
                        }
                        if (C1679e.m5743a(context)) {
                            new RunnableC1682h(context).run();
                        } else {
                            C1688f.m5770a("", "unable upload!");
                        }
                    }
                }).start();
            }
        } catch (Throwable th) {
            C1688f.m5770a("", th);
        }
    }

    /* renamed from: l */
    private String m5791l() {
        if (C1672a.m5731a().getContext() == null) {
            return "";
        }
        String strM5746d = C1679e.m5746d();
        if (!C1698d.m5806c(strM5746d)) {
            return null;
        }
        C1688f.m5770a("AppUtdid", "read utdid from V5AppFile");
        C1698d.setType(7);
        return strM5746d;
    }

    synchronized String getUtdid(Context context) {
        if (!TextUtils.isEmpty(this.f7468d)) {
            return this.f7468d;
        }
        try {
            C1685c.m5760c();
            String strM5791l = m5791l();
            if (TextUtils.isEmpty(strM5791l)) {
                strM5791l = C1698d.m5802a(context).getValue();
            }
            if (TextUtils.isEmpty(strM5791l)) {
                return "ffffffffffffffffffffffff";
            }
            this.f7468d = strM5791l;
            m5790f();
            return this.f7468d;
        } catch (Throwable th) {
            try {
                C1688f.m5769a("AppUtdid", th, new Object[0]);
                return "ffffffffffffffffffffffff";
            } finally {
                C1685c.m5761d();
            }
        }
    }

    /* renamed from: m */
    public synchronized String m5792m() {
        return this.f7468d;
    }
}
