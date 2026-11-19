package p139j1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j1.a */
/* loaded from: classes4.dex */
public interface InterfaceC8994a extends IInterface {

    /* renamed from: j1.a$a */
    public static abstract class a extends Binder implements InterfaceC8994a {

        /* renamed from: j1.a$a$a, reason: collision with other inner class name */
        public static class C10809a implements InterfaceC8994a {

            /* renamed from: b */
            public static InterfaceC8994a f17186b;

            /* renamed from: a */
            public IBinder f17187a;

            public C10809a(IBinder iBinder) {
                this.f17187a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17187a;
            }

            @Override // p139j1.InterfaceC8994a
            /* renamed from: b */
            public boolean mo15645b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(str);
                    if (!this.f17187a.transact(1, parcelObtain, parcelObtain2, 0) && a.m15649l() != null) {
                        return a.m15649l().mo15645b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p139j1.InterfaceC8994a
            /* renamed from: e */
            public void mo15646e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    if (this.f17187a.transact(2, parcelObtain, parcelObtain2, 0) || a.m15649l() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m15649l().mo15646e();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p139j1.InterfaceC8994a
            /* renamed from: f */
            public void mo15647f(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(str);
                    if (this.f17187a.transact(3, parcelObtain, parcelObtain2, 0) || a.m15649l() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m15649l().mo15647f(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: k */
        public static InterfaceC8994a m15648k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.techvision.aldl.ICheckAppUpdate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8994a)) ? new C10809a(iBinder) : (InterfaceC8994a) iInterfaceQueryLocalInterface;
        }

        /* renamed from: l */
        public static InterfaceC8994a m15649l() {
            return C10809a.f17186b;
        }
    }

    /* renamed from: b */
    boolean mo15645b(String str);

    /* renamed from: e */
    void mo15646e();

    /* renamed from: f */
    void mo15647f(String str);
}
