package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.tbs.video.interfaces.IUserStateChangedListener;
import com.tencent.tbs.video.interfaces.InterfaceC6870a;

/* renamed from: com.tencent.smtt.sdk.ba */
/* loaded from: classes4.dex */
class C6802ba {

    /* renamed from: e */
    private static C6802ba f6842e;

    /* renamed from: a */
    C6804bc f6843a;

    /* renamed from: b */
    Context f6844b;

    /* renamed from: c */
    InterfaceC6870a f6845c;

    /* renamed from: d */
    IUserStateChangedListener f6846d;

    private C6802ba(Context context) {
        this.f6843a = null;
        this.f6844b = context.getApplicationContext();
        this.f6843a = new C6804bc(this.f6844b);
    }

    /* renamed from: a */
    public static synchronized C6802ba m6130a(Context context) {
        try {
            if (f6842e == null) {
                f6842e = new C6802ba(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6842e;
    }

    /* renamed from: a */
    public void m6131a(int i10, int i11, Intent intent) {
        InterfaceC6870a interfaceC6870a = this.f6845c;
        if (interfaceC6870a != null) {
            interfaceC6870a.m6411a(i10, i11, intent);
        }
    }

    /* renamed from: a */
    public void m6132a(Activity activity, int i10) {
        this.f6843a.m6138a(activity, i10);
    }

    /* renamed from: a */
    public boolean m6133a() {
        this.f6843a.m6136a();
        return this.f6843a.m6140b();
    }

    /* renamed from: a */
    public boolean m6134a(String str, Bundle bundle, InterfaceC6870a interfaceC6870a) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("videoUrl", str);
        }
        if (interfaceC6870a != null) {
            this.f6843a.m6136a();
            if (!this.f6843a.m6140b()) {
                return false;
            }
            this.f6845c = interfaceC6870a;
            C6803bb c6803bb = new C6803bb(this);
            this.f6846d = c6803bb;
            this.f6845c.m6412a(c6803bb);
            bundle.putInt("callMode", 3);
        } else {
            bundle.putInt("callMode", 1);
        }
        this.f6843a.m6139a(bundle, interfaceC6870a == null ? null : this);
        return true;
    }
}
