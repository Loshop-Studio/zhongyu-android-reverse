package p114g2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p114g2.InterfaceC8003a;

/* renamed from: g2.f */
/* loaded from: classes4.dex */
public class C8013f implements InterfaceC8040s0 {

    /* renamed from: b */
    public CountDownLatch f13499b;

    /* renamed from: a */
    public String f13498a = "";

    /* renamed from: c */
    public final ServiceConnection f13500c = new a();

    @Override // p114g2.InterfaceC8040s0
    /* renamed from: a */
    public String mo12569a(Context context) {
        this.f13499b = new CountDownLatch(1);
        try {
            try {
                m12591d(context);
                if (!this.f13499b.await(500L, TimeUnit.MILLISECONDS)) {
                    Log.e("DeviceIdService", "getOAID time-out");
                }
                String str = this.f13498a;
                m12592e(context);
                return str;
            } catch (InterruptedException e10) {
                Log.e("DeviceIdService", "getOAID interrupted. e=" + e10.getMessage());
                m12592e(context);
                return null;
            }
        } catch (Throwable th) {
            m12592e(context);
            throw th;
        }
    }

    /* renamed from: d */
    public final void m12591d(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
            if (context.bindService(intent, this.f13500c, 1)) {
            } else {
                throw new UnsupportedOperationException("not supported service");
            }
        } catch (Error | Exception e10) {
            Log.e("DeviceIdService", "bindService failed. e=" + e10.getMessage());
            this.f13499b.countDown();
        }
    }

    /* renamed from: e */
    public final void m12592e(Context context) {
        try {
            context.unbindService(this.f13500c);
        } catch (Error | Exception e10) {
            Log.e("DeviceIdService", "unbindService failed. e=" + e10.getMessage());
        }
    }

    /* renamed from: g2.f$a */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                C8013f.this.f13498a = InterfaceC8003a.a.m12558g(iBinder).mo12557a();
            } catch (RemoteException | NullPointerException e10) {
                Log.e("DeviceIdService", "onServiceConnected failed e=" + e10.getMessage());
            }
            C8013f.this.f13499b.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
