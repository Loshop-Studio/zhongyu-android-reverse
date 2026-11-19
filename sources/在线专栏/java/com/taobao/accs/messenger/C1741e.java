package com.taobao.accs.messenger;

import android.content.Intent;
import android.os.RemoteException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.messenger.e */
/* loaded from: classes.dex */
public class C1741e {

    /* renamed from: a */
    private static final String f7644a = C1741e.class.getName() + ".TRY_COUNT";

    /* renamed from: b */
    private final ScheduledExecutorService f7645b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private final C1737a f7646c;

    public C1741e(C1737a c1737a) {
        this.f7646c = c1737a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5984b(String str, Intent intent) {
        ServiceConnectionC1740d serviceConnectionC1740dM5975a = this.f7646c.m5975a(str);
        if (serviceConnectionC1740dM5975a == null) {
            this.f7646c.m5976a(str, intent);
            m5985c(str, intent);
            return;
        }
        try {
            serviceConnectionC1740dM5975a.m5979a(intent);
        } catch (RemoteException unused) {
            this.f7646c.m5978b(str, serviceConnectionC1740dM5975a);
            this.f7646c.m5976a(str, intent);
            m5985c(str, intent);
        }
    }

    /* renamed from: c */
    private void m5985c(String str, Intent intent) {
        String str2 = f7644a;
        int intExtra = intent.getIntExtra(str2, 0);
        if (intExtra > 10) {
            return;
        }
        intent.putExtra(str2, intExtra + 1);
        this.f7645b.schedule(new RunnableC1742f(this, str, intent), 1000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void m5986a(String str, Intent intent) {
        m5984b(str, intent);
    }
}
