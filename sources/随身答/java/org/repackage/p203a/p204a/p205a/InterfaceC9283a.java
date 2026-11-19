package org.repackage.p203a.p204a.p205a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: org.repackage.a.a.a.a */
/* loaded from: classes5.dex */
public interface InterfaceC9283a extends IInterface {

    /* renamed from: org.repackage.a.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC9283a {

        /* renamed from: org.repackage.a.a.a.a$a$a, reason: collision with other inner class name */
        public static class C10085a implements InterfaceC9283a {

            /* renamed from: a */
            public IBinder f16010a;

            public C10085a(IBinder iBinder) {
                this.f16010a = iBinder;
            }

            /* renamed from: a */
            public String m15091a(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f16010a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16010a;
            }
        }

        /* renamed from: a */
        public static InterfaceC9283a m15090a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC9283a)) ? new C10085a(iBinder) : (InterfaceC9283a) iInterfaceQueryLocalInterface;
        }
    }
}
