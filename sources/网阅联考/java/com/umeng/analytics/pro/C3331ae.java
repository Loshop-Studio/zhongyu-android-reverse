package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.umeng.analytics.pro.InterfaceC3326a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.ae */
/* loaded from: classes2.dex */
public class C3331ae implements InterfaceC3408y {

    /* renamed from: a */
    private static final String f1624a = "DeviceIdService";

    /* renamed from: b */
    private static final String f1625b = "com.samsung.android.deviceidservice";

    /* renamed from: c */
    private static final String f1626c = "com.samsung.android.deviceidservice.DeviceIdService";

    /* renamed from: e */
    private CountDownLatch f1628e;

    /* renamed from: d */
    private String f1627d = "";

    /* renamed from: f */
    private final ServiceConnection f1629f = new ServiceConnection() { // from class: com.umeng.analytics.pro.ae.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                C3331ae.this.f1627d = InterfaceC3326a.a.m2823a(iBinder).mo2820a();
            } catch (RemoteException | NullPointerException e4) {
                Log.e(C3331ae.f1624a, "onServiceConnected failed e=" + e4.getMessage());
            }
            C3331ae.this.f1628e.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: b */
    private void m2832b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName(f1625b, f1626c);
            if (context.bindService(intent, this.f1629f, 1)) {
            } else {
                throw new UnsupportedOperationException("not supported service");
            }
        } catch (Error | Exception e4) {
            Log.e(f1624a, "bindService failed. e=" + e4.getMessage());
            this.f1628e.countDown();
        }
    }

    /* renamed from: c */
    private void m2833c(Context context) {
        try {
            context.unbindService(this.f1629f);
        } catch (Error | Exception e4) {
            Log.e(f1624a, "unbindService failed. e=" + e4.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3408y
    /* renamed from: a */
    public String mo2826a(Context context) {
        this.f1628e = new CountDownLatch(1);
        try {
            try {
                m2832b(context);
                if (!this.f1628e.await(500L, TimeUnit.MILLISECONDS)) {
                    Log.e(f1624a, "getOAID time-out");
                }
                return this.f1627d;
            } catch (InterruptedException e4) {
                Log.e(f1624a, "getOAID interrupted. e=" + e4.getMessage());
                m2833c(context);
                return null;
            }
        } finally {
            m2833c(context);
        }
    }
}
