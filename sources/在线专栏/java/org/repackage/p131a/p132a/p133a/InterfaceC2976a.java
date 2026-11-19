package org.repackage.p131a.p132a.p133a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: org.repackage.a.a.a.a */
/* loaded from: classes.dex */
public interface InterfaceC2976a extends IInterface {

    /* renamed from: org.repackage.a.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC2976a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: org.repackage.a.a.a.a$a$a, reason: collision with other inner class name */
        public static class C3538a implements InterfaceC2976a {

            /* renamed from: a */
            public IBinder f11469a;

            public C3538a(IBinder iBinder) {
                this.f11469a = iBinder;
            }

            /* renamed from: a */
            public String m10044a(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f11469a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11469a;
            }
        }

        /* renamed from: a */
        public static InterfaceC2976a m10043a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2976a)) ? new C3538a(iBinder) : (InterfaceC2976a) iInterfaceQueryLocalInterface;
        }
    }
}
