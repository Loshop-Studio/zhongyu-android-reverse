package p114g2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g2.a */
/* loaded from: classes4.dex */
public interface InterfaceC8003a extends IInterface {

    /* renamed from: g2.a$a */
    public static abstract class a extends Binder implements InterfaceC8003a {

        /* renamed from: g2.a$a$a, reason: collision with other inner class name */
        public static class C10071a implements InterfaceC8003a {

            /* renamed from: a */
            public IBinder f13480a;

            public C10071a(IBinder iBinder) {
                this.f13480a = iBinder;
            }

            @Override // p114g2.InterfaceC8003a
            /* renamed from: a */
            public String mo12557a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.f13480a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13480a;
            }
        }

        /* renamed from: g */
        public static InterfaceC8003a m12558g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8003a)) ? new C10071a(iBinder) : (InterfaceC8003a) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: a */
    String mo12557a();
}
