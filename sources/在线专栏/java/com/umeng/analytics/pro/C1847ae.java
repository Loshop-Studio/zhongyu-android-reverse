package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.umeng.analytics.pro.InterfaceC1842a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.ae */
/* loaded from: classes.dex */
public class C1847ae implements InterfaceC1924y {

    /* renamed from: a */
    private static final String f8216a = "DeviceIdService";

    /* renamed from: b */
    private static final String f8217b = "com.samsung.android.deviceidservice";

    /* renamed from: c */
    private static final String f8218c = "com.samsung.android.deviceidservice.DeviceIdService";

    /* renamed from: e */
    private CountDownLatch f8220e;

    /* renamed from: d */
    private String f8219d = "";

    /* renamed from: f */
    private final ServiceConnection f8221f = new ServiceConnection() { // from class: com.umeng.analytics.pro.ae.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                C1847ae.this.f8219d = InterfaceC1842a.a.m6746a(iBinder).mo6743a();
                Log.d(C1847ae.f8216a, "onServiceConnected");
            } catch (RemoteException | NullPointerException e4) {
                Log.e(C1847ae.f8216a, "onServiceConnected failed e=" + e4.getMessage());
            }
            C1847ae.this.f8220e.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(C1847ae.f8216a, "onServiceDisconnected");
        }
    };

    /* renamed from: b */
    private void m6755b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName(f8217b, f8218c);
            if (context.bindService(intent, this.f8221f, 1)) {
            } else {
                throw new UnsupportedOperationException("not supported service");
            }
        } catch (Error | Exception e4) {
            Log.e(f8216a, "bindService failed. e=" + e4.getMessage());
            this.f8220e.countDown();
        }
    }

    /* renamed from: c */
    private void m6756c(Context context) {
        try {
            context.unbindService(this.f8221f);
        } catch (Error | Exception e4) {
            Log.e(f8216a, "unbindService failed. e=" + e4.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC1924y
    /* renamed from: a */
    public String mo6749a(Context context) {
        this.f8220e = new CountDownLatch(1);
        try {
            try {
                m6755b(context);
                if (!this.f8220e.await(500L, TimeUnit.MILLISECONDS)) {
                    Log.e(f8216a, "getOAID time-out");
                }
                return this.f8219d;
            } catch (InterruptedException e4) {
                Log.e(f8216a, "getOAID interrupted. e=" + e4.getMessage());
                m6756c(context);
                return null;
            }
        } finally {
            m6756c(context);
        }
    }
}
