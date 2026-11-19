package p270v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: v2.g */
/* loaded from: classes4.dex */
public abstract class AbstractC9759g {

    /* renamed from: v2.g$b */
    public static final class b {

        /* renamed from: a */
        public final String f17296a;

        /* renamed from: b */
        public final boolean f17297b;

        public b(String str, boolean z9) {
            this.f17296a = str;
            this.f17297b = z9;
        }

        /* renamed from: b */
        public boolean m16439b() {
            return this.f17297b;
        }

        /* renamed from: c */
        public final String m16440c() {
            return this.f17296a;
        }
    }

    /* renamed from: v2.g$d */
    public static final class d implements IInterface {

        /* renamed from: a */
        public IBinder f17300a;

        public d(IBinder iBinder) {
            this.f17300a = iBinder;
        }

        /* renamed from: a */
        public String m16442a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f17300a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f17300a;
        }

        /* renamed from: g */
        public boolean m16443g(boolean z9) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z9 ? 1 : 0);
                this.f17300a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    /* renamed from: a */
    public static String m16436a(Context context) {
        try {
            b bVarM16437b = m16437b(context);
            if (bVarM16437b != null && !bVarM16437b.m16439b()) {
                return bVarM16437b.m16440c();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static b m16437b(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        c cVar = new c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, cVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                d dVar = new d(cVar.m16441a());
                boolean zM16443g = dVar.m16443g(true);
                b bVar = new b(zM16443g ? "" : dVar.m16442a(), zM16443g);
                context.unbindService(cVar);
                return bVar;
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th) {
            context.unbindService(cVar);
            throw th;
        }
    }

    /* renamed from: v2.g$c */
    public static final class c implements ServiceConnection {

        /* renamed from: a */
        public boolean f17298a;

        /* renamed from: b */
        public final LinkedBlockingQueue f17299b;

        public c() {
            this.f17298a = false;
            this.f17299b = new LinkedBlockingQueue(1);
        }

        /* renamed from: a */
        public IBinder m16441a() {
            if (this.f17298a) {
                throw new IllegalStateException();
            }
            this.f17298a = true;
            return (IBinder) this.f17299b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            try {
                this.f17299b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
