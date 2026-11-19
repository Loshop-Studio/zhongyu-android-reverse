package com.taobao.accs.messenger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.utl.ALog;
import java.util.HashMap;

/* renamed from: com.taobao.accs.messenger.a */
/* loaded from: classes5.dex */
public class C7634a {

    /* renamed from: a */
    private final Context f13030a;

    /* renamed from: b */
    private final HashMap<String, ServiceConnectionC7637d> f13031b = new HashMap<>();

    /* renamed from: c */
    private boolean f13032c;

    public C7634a(Context context) {
        this.f13030a = context;
    }

    /* renamed from: a */
    public ServiceConnectionC7637d m10001a(String str) {
        ServiceConnectionC7637d serviceConnectionC7637d = this.f13031b.get(str);
        if (serviceConnectionC7637d == null || !serviceConnectionC7637d.m10006a()) {
            return null;
        }
        return serviceConnectionC7637d;
    }

    /* renamed from: b */
    public void m10004b(String str, ServiceConnectionC7637d serviceConnectionC7637d) {
        this.f13031b.remove(str, serviceConnectionC7637d);
    }

    /* renamed from: a */
    public void m10003a(String str, ServiceConnectionC7637d serviceConnectionC7637d) {
        m10004b(str, serviceConnectionC7637d);
        if (this.f13032c) {
            try {
                this.f13030a.unbindService(serviceConnectionC7637d);
            } catch (Exception e10) {
                ALog.m10118e("ConnectionManager", "disconnect error: " + e10.getMessage(), new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void m10002a(String str, Intent intent) {
        ServiceConnectionC7637d serviceConnectionC7637d = this.f13031b.get(str);
        if (serviceConnectionC7637d != null) {
            if (serviceConnectionC7637d.m10007b()) {
                if (!serviceConnectionC7637d.m10008c()) {
                    return;
                } else {
                    m10003a(str, serviceConnectionC7637d);
                }
            } else {
                this.f13031b.remove(str);
            }
            serviceConnectionC7637d = null;
        }
        if (serviceConnectionC7637d == null) {
            ServiceConnectionC7637d serviceConnectionC7637d2 = new ServiceConnectionC7637d(this.f13030a, str, this);
            this.f13031b.put(str, serviceConnectionC7637d2);
            this.f13032c = this.f13030a.bindService(m10000a(intent), serviceConnectionC7637d2, 1);
        }
    }

    /* renamed from: a */
    private static Intent m10000a(Intent intent) {
        Intent intent2 = (Intent) intent.clone();
        intent2.replaceExtras(new Bundle());
        return intent2;
    }
}
