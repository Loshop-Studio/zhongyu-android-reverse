package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tendcloud.tenddata.ew */
/* loaded from: classes5.dex */
public final class C7972ew {

    /* renamed from: c */
    private static volatile C7972ew f14892c = new C7972ew();

    /* renamed from: b */
    private final LinkedBlockingQueue<IBinder> f14894b = new LinkedBlockingQueue<>(1);

    /* renamed from: a */
    ServiceConnection f14893a = new ServiceConnection() { // from class: com.tendcloud.tenddata.ew.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ew.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C7972ew.this.f14894b.size() > 0) {
                            C7972ew.this.f14894b.clear();
                        }
                        C7972ew.this.f14894b.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: com.tendcloud.tenddata.ew$a */
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
            Parcel parcelObtain;
            Parcel parcelObtain2;
            String string = null;
            try {
                parcelObtain = Parcel.obtain();
                parcelObtain2 = Parcel.obtain();
            } catch (Throwable unused) {
            }
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.mIBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return string;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    private C7972ew() {
    }

    /* renamed from: b */
    private void m11921b(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, this.f14893a, 1)) {
            try {
                try {
                    C7994fr.m11998a().setOAID(new a(this.f14894b.take()).getOAID());
                    context.unbindService(this.f14893a);
                } catch (Throwable unused) {
                    context.unbindService(this.f14893a);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void bindSECServiceGetOAID(Context context) {
        f14892c.m11921b(context);
    }

    /* renamed from: a */
    public static boolean m11920a(Context context) {
        try {
            if (!C7963en.m11890g()) {
                return false;
            }
            context.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
