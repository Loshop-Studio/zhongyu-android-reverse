package p119o1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o1.a */
/* loaded from: classes3.dex */
public interface InterfaceC7516a extends IInterface {

    /* renamed from: o1.a$a */
    public static abstract class a extends Binder implements InterfaceC7516a {

        /* renamed from: o1.a$a$a, reason: collision with other inner class name */
        public static class C8038a implements InterfaceC7516a {

            /* renamed from: b */
            public static InterfaceC7516a f9708b;

            /* renamed from: a */
            public IBinder f9709a;

            public C8038a(IBinder iBinder) {
                this.f9709a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9709a;
            }

            @Override // p119o1.InterfaceC7516a
            /* renamed from: b */
            public boolean mo8668b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(str);
                    if (!this.f9709a.transact(1, parcelObtain, parcelObtain2, 0) && a.m8672q() != null) {
                        return a.m8672q().mo8668b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p119o1.InterfaceC7516a
            /* renamed from: g */
            public void mo8669g() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    if (this.f9709a.transact(2, parcelObtain, parcelObtain2, 0) || a.m8672q() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m8672q().mo8669g();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p119o1.InterfaceC7516a
            /* renamed from: h */
            public void mo8670h(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(str);
                    if (this.f9709a.transact(3, parcelObtain, parcelObtain2, 0) || a.m8672q() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m8672q().mo8670h(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: p */
        public static InterfaceC7516a m8671p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.techvision.aldl.ICheckAppUpdate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7516a)) ? new C8038a(iBinder) : (InterfaceC7516a) iInterfaceQueryLocalInterface;
        }

        /* renamed from: q */
        public static InterfaceC7516a m8672q() {
            return C8038a.f9708b;
        }
    }

    /* renamed from: b */
    boolean mo8668b(String str);

    /* renamed from: g */
    void mo8669g();

    /* renamed from: h */
    void mo8670h(String str);
}
