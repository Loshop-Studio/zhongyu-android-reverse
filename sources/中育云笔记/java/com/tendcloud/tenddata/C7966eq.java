package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tendcloud.tenddata.eq */
/* loaded from: classes5.dex */
public class C7966eq {

    /* renamed from: b */
    private static volatile C7966eq f14881b = new C7966eq();

    /* renamed from: a */
    private final LinkedBlockingQueue<IBinder> f14882a = new LinkedBlockingQueue<>(1);

    /* renamed from: c */
    private ServiceConnection f14883c = new ServiceConnection() { // from class: com.tendcloud.tenddata.eq.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.eq.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C7966eq.this.f14882a.size() > 0) {
                            C7966eq.this.f14882a.clear();
                        }
                        C7966eq.this.f14882a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: com.tendcloud.tenddata.eq$a */
    public static class a implements IInterface {
        private IBinder mIBinder;

        public a(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getOAID() {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.mIBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused) {
                }
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable unused2) {
            }
            return string;
        }
    }

    private C7966eq() {
    }

    /* renamed from: b */
    private void m11907b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (context.bindService(intent, this.f14883c, 1)) {
                try {
                    C7994fr.m11998a().setOAID(new a(this.f14882a.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f14883c);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void bindLENOVOServiceGetOAID(Context context) {
        f14881b.m11907b(context);
    }

    /* renamed from: a */
    public static boolean m11906a(Context context) {
        try {
            if (!C7963en.m11894k()) {
                return false;
            }
            context.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
