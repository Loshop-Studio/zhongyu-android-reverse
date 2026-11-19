package com.taobao.accs.messenger;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.taobao.accs.utl.ALog;
import java.util.HashMap;

/* renamed from: com.taobao.accs.messenger.a */
/* loaded from: classes.dex */
public class C1737a {

    /* renamed from: a */
    private final Context f7632a;

    /* renamed from: b */
    private final HashMap<String, ServiceConnectionC1740d> f7633b = new HashMap<>();

    /* renamed from: c */
    private boolean f7634c;

    public C1737a(Context context) {
        this.f7632a = context;
    }

    /* renamed from: a */
    public ServiceConnectionC1740d m5975a(String str) {
        ServiceConnectionC1740d serviceConnectionC1740d = this.f7633b.get(str);
        if (serviceConnectionC1740d == null || !serviceConnectionC1740d.m5980a()) {
            return null;
        }
        return serviceConnectionC1740d;
    }

    /* renamed from: b */
    public void m5978b(String str, ServiceConnectionC1740d serviceConnectionC1740d) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7633b.remove(str, serviceConnectionC1740d);
        } else if (this.f7633b.get(str) == serviceConnectionC1740d) {
            this.f7633b.remove(str);
        }
    }

    /* renamed from: a */
    public void m5977a(String str, ServiceConnectionC1740d serviceConnectionC1740d) {
        m5978b(str, serviceConnectionC1740d);
        if (this.f7634c) {
            try {
                this.f7632a.unbindService(serviceConnectionC1740d);
            } catch (Exception e4) {
                ALog.m6092e("ConnectionManager", "disconnect error: " + e4.getMessage(), new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void m5976a(String str, Intent intent) {
        ServiceConnectionC1740d serviceConnectionC1740d = this.f7633b.get(str);
        if (serviceConnectionC1740d != null) {
            if (serviceConnectionC1740d.m5981b()) {
                if (!serviceConnectionC1740d.m5982c()) {
                    return;
                } else {
                    m5977a(str, serviceConnectionC1740d);
                }
            } else {
                this.f7633b.remove(str);
            }
            serviceConnectionC1740d = null;
        }
        if (serviceConnectionC1740d == null) {
            ServiceConnectionC1740d serviceConnectionC1740d2 = new ServiceConnectionC1740d(this.f7632a, str, this);
            this.f7633b.put(str, serviceConnectionC1740d2);
            this.f7634c = this.f7632a.bindService(m5974a(intent), serviceConnectionC1740d2, 1);
        }
    }

    /* renamed from: a */
    private static Intent m5974a(Intent intent) {
        Intent intent2 = (Intent) intent.clone();
        intent2.replaceExtras(new Bundle());
        return intent2;
    }
}
