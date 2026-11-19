package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* renamed from: com.huawei.hms.base.log.b */
/* loaded from: classes5.dex */
public class C7251b {

    /* renamed from: b */
    public String f11424b;

    /* renamed from: a */
    public int f11423a = 4;

    /* renamed from: c */
    public InterfaceC7253d f11425c = new C7252c();

    /* renamed from: a */
    public void m8397a(Context context, int i10, String str) {
        this.f11423a = i10;
        this.f11424b = str;
        this.f11425c.mo8392a(context, "HMSCore");
    }

    /* renamed from: b */
    public void m8401b(int i10, String str, String str2, Throwable th) {
        try {
            if (m8400a(i10)) {
                C7254e c7254eM8402c = m8402c(i10, str, str2, th);
                String str3 = c7254eM8402c.m8409c() + c7254eM8402c.m8407a();
                this.f11425c.mo8394a(str3, i10, str, str2 + '\n' + Log.getStackTraceString(th));
            }
        } catch (OutOfMemoryError unused) {
            m8403d();
        }
    }

    /* renamed from: c */
    public final C7254e m8402c(int i10, String str, String str2, Throwable th) {
        C7254e c7254e = new C7254e(8, this.f11424b, i10, str);
        c7254e.m8405a((C7254e) str2);
        c7254e.m8406a(th);
        return c7254e;
    }

    /* renamed from: d */
    public final void m8403d() {
        try {
            Log.e("HMSSDK_LogAdaptor", "log happened OOM error.");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public InterfaceC7253d m8395a() {
        return this.f11425c;
    }

    /* renamed from: a */
    public void m8398a(InterfaceC7253d interfaceC7253d) {
        this.f11425c = interfaceC7253d;
    }

    /* renamed from: a */
    public boolean m8400a(int i10) {
        return i10 >= this.f11423a;
    }

    /* renamed from: a */
    public void m8396a(int i10, String str, String str2) {
        try {
            if (m8400a(i10)) {
                C7254e c7254eM8402c = m8402c(i10, str, str2, null);
                this.f11425c.mo8394a(c7254eM8402c.m8409c() + c7254eM8402c.m8407a(), i10, str, str2);
            }
        } catch (OutOfMemoryError unused) {
            m8403d();
        }
    }

    /* renamed from: a */
    public void m8399a(String str, String str2) {
        try {
            C7254e c7254eM8402c = m8402c(4, str, str2, null);
            this.f11425c.mo8394a(c7254eM8402c.m8409c() + '\n' + c7254eM8402c.m8407a(), 4, str, str2);
        } catch (OutOfMemoryError unused) {
            m8403d();
        }
    }
}
