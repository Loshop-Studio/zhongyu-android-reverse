package p114g2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: g2.c */
/* loaded from: classes4.dex */
public class C8007c implements InterfaceC8040s0 {

    /* renamed from: g2.c$c */
    public static final class c implements IInterface {

        /* renamed from: a */
        public IBinder f13488a;

        public c(IBinder iBinder) {
            this.f13488a = iBinder;
        }

        /* renamed from: a */
        public String m12571a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f13488a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f13488a;
        }
    }

    @Override // p114g2.InterfaceC8040s0
    /* renamed from: a */
    public String mo12569a(Context context) {
        b bVar = new b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, bVar, 1)) {
            try {
                return new c(bVar.m12570a()).m12571a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* renamed from: g2.c$b */
    public static final class b implements ServiceConnection {

        /* renamed from: a */
        public boolean f13486a;

        /* renamed from: b */
        public final LinkedBlockingQueue f13487b;

        public b() {
            this.f13486a = false;
            this.f13487b = new LinkedBlockingQueue();
        }

        /* renamed from: a */
        public IBinder m12570a() {
            if (this.f13486a) {
                throw new IllegalStateException();
            }
            this.f13486a = true;
            return (IBinder) this.f13487b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            try {
                this.f13487b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
