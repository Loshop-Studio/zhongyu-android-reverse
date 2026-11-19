package com.p041ta.utdid2.device;

import android.content.Context;
import android.text.TextUtils;
import com.p041ta.utdid2.device.C6342c;
import p074e2.C7329a;
import p085f2.AbstractC7433a;
import p085f2.C7434b;
import p118i2.AbstractC7657e;
import p118i2.RunnableC7659g;
import p129j2.AbstractC7781a;
import p129j2.AbstractC7785e;
import p129j2.AbstractC7788h;

/* renamed from: com.ta.utdid2.device.a */
/* loaded from: classes4.dex */
public class C6340a {

    /* renamed from: a */
    private static final C6340a f4813a = new C6340a();

    /* renamed from: c */
    private static long f4814c = 3000;

    /* renamed from: e */
    private String f4815e = "";

    private C6340a() {
    }

    /* renamed from: a */
    public static C6340a m4496a() {
        return f4813a;
    }

    /* renamed from: h */
    private void m4498h() {
        AbstractC7788h.m13183i();
        if (TextUtils.isEmpty(this.f4815e)) {
            return;
        }
        try {
            final Context contextM11713f = C7329a.m11708b().m11713f();
            if (AbstractC7781a.m13156e(contextM11713f)) {
                new Thread(new Runnable() { // from class: com.ta.utdid2.device.a.4
                    @Override // java.lang.Runnable
                    public void run() throws InterruptedException {
                        try {
                            Thread.sleep(C6340a.f4814c);
                        } catch (Exception unused) {
                        }
                        if (AbstractC7657e.m12718h(contextM11713f)) {
                            new RunnableC7659g(contextM11713f).run();
                        } else {
                            AbstractC7788h.m13179e("", "unable upload!");
                        }
                    }
                }).start();
            }
        } catch (Throwable th) {
            AbstractC7788h.m13179e("", th);
        }
    }

    /* renamed from: q */
    private String m4499q() {
        final Context contextM11713f = C7329a.m11708b().m11713f();
        if (contextM11713f == null) {
            return "";
        }
        final String strM12720j = AbstractC7657e.m12720j();
        if (C6342c.m4509c(strM12720j)) {
            AbstractC7788h.m13179e("AppUtdid", "read utdid from V5AppFile");
            C6342c.setType(7);
            C6342c.m4506a(new C6342c.a() { // from class: com.ta.utdid2.device.a.1
                @Override // com.p041ta.utdid2.device.C6342c.a
                /* renamed from: i */
                public void mo4501i() {
                    C7434b c7434bM11981a = AbstractC7433a.m11981a(strM12720j);
                    String strM12715e = AbstractC7657e.m12715e(contextM11713f);
                    if (TextUtils.isEmpty(strM12715e)) {
                        AbstractC7657e.m12712b(contextM11713f, strM12720j);
                    } else {
                        C7434b c7434bM11981a2 = AbstractC7433a.m11981a(strM12715e);
                        if (!c7434bM11981a2.m11984c() || c7434bM11981a2.m11983b() < c7434bM11981a.m11983b()) {
                            AbstractC7657e.m12712b(contextM11713f, strM12720j);
                        }
                    }
                    String strM12722l = AbstractC7657e.m12722l();
                    if (TextUtils.isEmpty(strM12722l)) {
                        AbstractC7657e.m12716f(strM12720j);
                        return;
                    }
                    C7434b c7434bM11981a3 = AbstractC7433a.m11981a(strM12722l);
                    if (!c7434bM11981a3.m11984c() || c7434bM11981a3.m11983b() < c7434bM11981a.m11983b()) {
                        AbstractC7657e.m12716f(strM12720j);
                    }
                }
            });
            return strM12720j;
        }
        final String strM12715e = AbstractC7657e.m12715e(contextM11713f);
        if (C6342c.m4509c(strM12715e)) {
            AbstractC7788h.m13179e("AppUtdid", "read utdid from V5Settings");
            C6342c.setType(8);
            C6342c.m4506a(new C6342c.a() { // from class: com.ta.utdid2.device.a.2
                @Override // com.p041ta.utdid2.device.C6342c.a
                /* renamed from: i */
                public void mo4501i() {
                    AbstractC7657e.m12713c(strM12715e);
                    String strM12722l = AbstractC7657e.m12722l();
                    if (TextUtils.isEmpty(strM12722l)) {
                        AbstractC7657e.m12716f(strM12715e);
                        return;
                    }
                    C7434b c7434bM11981a = AbstractC7433a.m11981a(strM12715e);
                    C7434b c7434bM11981a2 = AbstractC7433a.m11981a(strM12722l);
                    if (!c7434bM11981a2.m11984c() || c7434bM11981a2.m11983b() < c7434bM11981a.m11983b()) {
                        AbstractC7657e.m12716f(strM12715e);
                    }
                }
            });
            return strM12715e;
        }
        final String strM12722l = AbstractC7657e.m12722l();
        if (!C6342c.m4509c(strM12722l)) {
            return null;
        }
        AbstractC7788h.m13179e("AppUtdid", "read utdid from V5Sdcard");
        C6342c.setType(9);
        C6342c.m4506a(new C6342c.a() { // from class: com.ta.utdid2.device.a.3
            @Override // com.p041ta.utdid2.device.C6342c.a
            /* renamed from: i */
            public void mo4501i() {
                AbstractC7657e.m12713c(strM12722l);
                AbstractC7657e.m12712b(contextM11713f, strM12722l);
            }
        });
        return strM12722l;
    }

    public synchronized String getUtdid(Context context) {
        if (!TextUtils.isEmpty(this.f4815e)) {
            return this.f4815e;
        }
        try {
            AbstractC7785e.m13168b();
            String strM4499q = m4499q();
            if (TextUtils.isEmpty(strM4499q)) {
                strM4499q = C6342c.m4504a(context).getValue();
            }
            if (TextUtils.isEmpty(strM4499q)) {
                return "ffffffffffffffffffffffff";
            }
            this.f4815e = strM4499q;
            m4498h();
            return this.f4815e;
        } catch (Throwable th) {
            try {
                AbstractC7788h.m13178d("AppUtdid", th, new Object[0]);
                return "ffffffffffffffffffffffff";
            } finally {
                AbstractC7785e.m13169c();
            }
        }
    }

    /* renamed from: r */
    public synchronized String m4500r() {
        return this.f4815e;
    }
}
