package p375v7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: v7.a */
/* loaded from: classes5.dex */
public interface InterfaceC11548a extends IInterface {

    /* renamed from: v7.a$a */
    public static abstract class a extends Binder implements InterfaceC11548a {

        /* renamed from: v7.a$a$a, reason: collision with other inner class name */
        public static class C12152a implements InterfaceC11548a {

            /* renamed from: b */
            public static InterfaceC11548a f27421b;

            /* renamed from: a */
            public IBinder f27422a;

            public C12152a(IBinder iBinder) {
                this.f27422a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27422a;
            }

            @Override // p375v7.InterfaceC11548a
            /* renamed from: b */
            public boolean mo25409b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(str);
                    if (!this.f27422a.transact(1, parcelObtain, parcelObtain2, 0) && a.m25413m() != null) {
                        return a.m25413m().mo25409b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p375v7.InterfaceC11548a
            /* renamed from: e */
            public void mo25410e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    if (this.f27422a.transact(2, parcelObtain, parcelObtain2, 0) || a.m25413m() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m25413m().mo25410e();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p375v7.InterfaceC11548a
            /* renamed from: f */
            public void mo25411f(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(str);
                    if (this.f27422a.transact(3, parcelObtain, parcelObtain2, 0) || a.m25413m() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m25413m().mo25411f(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: l */
        public static InterfaceC11548a m25412l(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.techvision.aldl.ICheckAppUpdate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC11548a)) ? new C12152a(iBinder) : (InterfaceC11548a) iInterfaceQueryLocalInterface;
        }

        /* renamed from: m */
        public static InterfaceC11548a m25413m() {
            return C12152a.f27421b;
        }
    }

    /* renamed from: b */
    boolean mo25409b(String str);

    /* renamed from: e */
    void mo25410e();

    /* renamed from: f */
    void mo25411f(String str);
}
