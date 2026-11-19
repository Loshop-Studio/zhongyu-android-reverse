package com.taobao.accs.messenger;

import android.content.Intent;
import android.os.RemoteException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.messenger.e */
/* loaded from: classes5.dex */
public class C7638e {

    /* renamed from: a */
    private static final String f13042a = C7638e.class.getName() + ".TRY_COUNT";

    /* renamed from: b */
    private final ScheduledExecutorService f13043b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private final C7634a f13044c;

    public C7638e(C7634a c7634a) {
        this.f13044c = c7634a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m10010b(String str, Intent intent) {
        ServiceConnectionC7637d serviceConnectionC7637dM10001a = this.f13044c.m10001a(str);
        if (serviceConnectionC7637dM10001a == null) {
            this.f13044c.m10002a(str, intent);
            m10011c(str, intent);
            return;
        }
        try {
            serviceConnectionC7637dM10001a.m10005a(intent);
        } catch (RemoteException unused) {
            this.f13044c.m10004b(str, serviceConnectionC7637dM10001a);
            this.f13044c.m10002a(str, intent);
            m10011c(str, intent);
        }
    }

    /* renamed from: c */
    private void m10011c(String str, Intent intent) {
        String str2 = f13042a;
        int intExtra = intent.getIntExtra(str2, 0);
        if (intExtra > 10) {
            return;
        }
        intent.putExtra(str2, intExtra + 1);
        this.f13043b.schedule(new RunnableC7639f(this, str, intent), 1000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void m10012a(String str, Intent intent) {
        m10010b(str, intent);
    }
}
