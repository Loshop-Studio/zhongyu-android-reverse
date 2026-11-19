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
/* loaded from: classes2.dex */
class C3328ab implements InterfaceC3408y {

    /* renamed from: a */
    private static final String f1617a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b */
    private static final int f1618b = 1;

    /* renamed from: c */
    private static final int f1619c = 2;

    /* renamed from: com.umeng.analytics.pro.ab$a */
    public static final class a implements ServiceConnection {

        /* renamed from: a */
        boolean f1620a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f1621b;

        private a() {
            this.f1620a = false;
            this.f1621b = new LinkedBlockingQueue<>();
        }

        /* renamed from: a */
        public IBinder m2827a() throws InterruptedException {
            if (this.f1620a) {
                throw new IllegalStateException();
            }
            this.f1620a = true;
            return this.f1621b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            try {
                this.f1621b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.umeng.analytics.pro.ab$b */
    public static final class b implements IInterface {

        /* renamed from: a */
        private IBinder f1622a;

        public b(IBinder iBinder) {
            this.f1622a = iBinder;
        }

        /* renamed from: a */
        public String m2828a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(C3328ab.f1617a);
                this.f1622a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f1622a;
        }

        /* renamed from: b */
        public boolean m2829b() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(C3328ab.f1617a);
                this.f1622a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3408y
    /* renamed from: a */
    public String mo2826a(Context context) {
        a aVar = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new b(aVar.m2827a()).m2828a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
