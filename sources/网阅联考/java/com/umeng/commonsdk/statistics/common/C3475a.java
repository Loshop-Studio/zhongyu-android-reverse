package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.umeng.commonsdk.statistics.common.a */
/* loaded from: classes2.dex */
public class C3475a {

    /* renamed from: com.umeng.commonsdk.statistics.common.a$a */
    public static final class a {

        /* renamed from: a */
        private final String f2760a;

        /* renamed from: b */
        private final boolean f2761b;

        public a(String str, boolean z3) {
            this.f2760a = str;
            this.f2761b = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public String m3705b() {
            return this.f2760a;
        }

        /* renamed from: a */
        public boolean m3706a() {
            return this.f2761b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.a$b */
    public static final class b implements ServiceConnection {

        /* renamed from: a */
        boolean f2762a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f2763b;

        private b() {
            this.f2762a = false;
            this.f2763b = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder m3707a() throws InterruptedException {
            if (this.f2762a) {
                throw new IllegalStateException();
            }
            this.f2762a = true;
            return this.f2763b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            try {
                this.f2763b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static String m3701a(Context context) {
        try {
            a aVarM3703c = m3703c(context);
            if (aVarM3703c != null && !aVarM3703c.m3706a()) {
                return aVarM3703c.m3705b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static String m3702b(Context context) {
        try {
            a aVarM3703c = m3703c(context);
            if (aVarM3703c == null) {
                return null;
            }
            return aVarM3703c.m3705b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static a m3703c(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, bVar, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                c cVar = new c(bVar.m3707a());
                boolean zM3709a = cVar.m3709a(true);
                return new a(zM3709a ? "" : cVar.m3708a(), zM3709a);
            } catch (Exception e4) {
                throw e4;
            }
        } finally {
            context.unbindService(bVar);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.a$c */
    public static final class c implements IInterface {

        /* renamed from: a */
        private IBinder f2764a;

        public c(IBinder iBinder) {
            this.f2764a = iBinder;
        }

        /* renamed from: a */
        public String m3708a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f2764a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f2764a;
        }

        /* renamed from: a */
        public boolean m3709a(boolean z3) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z3 ? 1 : 0);
                this.f2764a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
