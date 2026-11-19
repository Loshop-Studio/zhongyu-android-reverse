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
/* loaded from: classes.dex */
public class C1991a {

    /* renamed from: com.umeng.commonsdk.statistics.common.a$a */
    private static final class a {

        /* renamed from: a */
        private final String f9352a;

        /* renamed from: b */
        private final boolean f9353b;

        a(String str, boolean z3) {
            this.f9352a = str;
            this.f9353b = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public String m7628b() {
            return this.f9352a;
        }

        /* renamed from: a */
        public boolean m7629a() {
            return this.f9353b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.a$b */
    private static final class b implements ServiceConnection {

        /* renamed from: a */
        boolean f9354a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f9355b;

        private b() {
            this.f9354a = false;
            this.f9355b = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder m7630a() throws InterruptedException {
            if (this.f9354a) {
                throw new IllegalStateException();
            }
            this.f9354a = true;
            return this.f9355b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            try {
                this.f9355b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static String m7624a(Context context) {
        try {
            a aVarM7626c = m7626c(context);
            if (aVarM7626c != null && !aVarM7626c.m7629a()) {
                return aVarM7626c.m7628b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static String m7625b(Context context) {
        try {
            a aVarM7626c = m7626c(context);
            if (aVarM7626c == null) {
                return null;
            }
            return aVarM7626c.m7628b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static a m7626c(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (!context.bindService(intent, bVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                try {
                    c cVar = new c(bVar.m7630a());
                    boolean zM7632a = cVar.m7632a(true);
                    return new a(zM7632a ? "" : cVar.m7631a(), zM7632a);
                } catch (Exception e4) {
                    throw e4;
                }
            } finally {
                context.unbindService(bVar);
            }
        } catch (Exception e5) {
            throw e5;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.a$c */
    private static final class c implements IInterface {

        /* renamed from: a */
        private IBinder f9356a;

        public c(IBinder iBinder) {
            this.f9356a = iBinder;
        }

        /* renamed from: a */
        public String m7631a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f9356a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f9356a;
        }

        /* renamed from: a */
        public boolean m7632a(boolean z3) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z3 ? 1 : 0);
                this.f9356a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
