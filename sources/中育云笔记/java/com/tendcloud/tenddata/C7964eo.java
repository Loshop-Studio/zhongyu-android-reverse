package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tendcloud.tenddata.eo */
/* loaded from: classes5.dex */
public class C7964eo {

    /* renamed from: b */
    private static volatile C7964eo f14875b = new C7964eo();

    /* renamed from: a */
    private final LinkedBlockingQueue<IBinder> f14876a = new LinkedBlockingQueue<>(1);

    /* renamed from: c */
    private ServiceConnection f14877c = new ServiceConnection() { // from class: com.tendcloud.tenddata.eo.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.eo.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C7964eo.this.f14876a.size() > 0) {
                            C7964eo.this.f14876a.clear();
                        }
                        C7964eo.this.f14876a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: com.tendcloud.tenddata.eo$a */
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
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.mIBinder.transact(3, parcelObtain, parcelObtain2, 0);
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

    private C7964eo() {
    }

    /* renamed from: b */
    private void m11898b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.asus.msa.action.ACCESS_DID");
            intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
            if (context.bindService(intent, this.f14877c, 1)) {
                try {
                    C7994fr.m11998a().setOAID(new a(this.f14876a.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f14877c);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void bindASUSServiceGetOAID(Context context) {
        f14875b.m11898b(context);
    }

    /* renamed from: a */
    public static boolean m11897a(Context context) {
        try {
            return C7963en.m11893j();
        } catch (Throwable unused) {
            return false;
        }
    }
}
