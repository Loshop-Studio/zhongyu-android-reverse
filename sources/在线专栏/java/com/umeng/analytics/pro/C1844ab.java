package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.ab */
/* loaded from: classes.dex */
class C1844ab implements InterfaceC1924y {

    /* renamed from: a */
    private static final String f8209a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b */
    private static final int f8210b = 1;

    /* renamed from: c */
    private static final int f8211c = 2;

    /* renamed from: com.umeng.analytics.pro.ab$a */
    private static final class a implements ServiceConnection {

        /* renamed from: a */
        boolean f8212a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f8213b;

        private a() {
            this.f8212a = false;
            this.f8213b = new LinkedBlockingQueue<>();
        }

        /* renamed from: a */
        public IBinder m6750a() throws InterruptedException {
            if (this.f8212a) {
                throw new IllegalStateException();
            }
            this.f8212a = true;
            return this.f8213b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            try {
                this.f8213b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.umeng.analytics.pro.ab$b */
    private static final class b implements IInterface {

        /* renamed from: a */
        private IBinder f8214a;

        public b(IBinder iBinder) {
            this.f8214a = iBinder;
        }

        /* renamed from: a */
        public String m6751a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(C1844ab.f8209a);
                this.f8214a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f8214a;
        }

        /* renamed from: b */
        public boolean m6752b() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(C1844ab.f8209a);
                this.f8214a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    C1844ab() {
    }

    @Override // com.umeng.analytics.pro.InterfaceC1924y
    /* renamed from: a */
    public String mo6749a(Context context) {
        a aVar = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new b(aVar.m6750a()).m6751a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
