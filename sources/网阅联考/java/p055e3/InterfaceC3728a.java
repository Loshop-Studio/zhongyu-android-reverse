package p055e3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e3.a */
/* loaded from: classes2.dex */
public interface InterfaceC3728a extends IInterface {

    /* renamed from: e3.a$a */
    public static abstract class a extends Binder implements InterfaceC3728a {

        /* renamed from: e3.a$a$a, reason: collision with other inner class name */
        public static class C4758a implements InterfaceC3728a {

            /* renamed from: a */
            public IBinder f4355a;

            public C4758a(IBinder iBinder) {
                this.f4355a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4355a;
            }

            /* renamed from: f */
            public String m4725f(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f4355a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: f */
        public static InterfaceC3728a m4724f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3728a)) ? new C4758a(iBinder) : (InterfaceC3728a) iInterfaceQueryLocalInterface;
        }
    }
}
