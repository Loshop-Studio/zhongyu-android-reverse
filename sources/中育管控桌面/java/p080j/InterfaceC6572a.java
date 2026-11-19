package p080j;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j.a */
/* loaded from: classes3.dex */
public interface InterfaceC6572a extends IInterface {

    /* renamed from: j.a$a */
    public static abstract class a extends Binder implements InterfaceC6572a {

        /* renamed from: j.a$a$a, reason: collision with other inner class name */
        public static class C8030a implements InterfaceC6572a {

            /* renamed from: b */
            public static InterfaceC6572a f8514b;

            /* renamed from: a */
            public IBinder f8515a;

            public C8030a(IBinder iBinder) {
                this.f8515a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8515a;
            }

            @Override // p080j.InterfaceC6572a
            /* renamed from: j */
            public String mo7436j() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("cn.com.techvision.settingserverlib.system.ISystemInterface");
                    if (this.f8515a.transact(2, parcelObtain, parcelObtain2, 0) || a.m7438q() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = a.m7438q().mo7436j();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: p */
        public static InterfaceC6572a m7437p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("cn.com.techvision.settingserverlib.system.ISystemInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6572a)) ? new C8030a(iBinder) : (InterfaceC6572a) iInterfaceQueryLocalInterface;
        }

        /* renamed from: q */
        public static InterfaceC6572a m7438q() {
            return C8030a.f8514b;
        }
    }

    /* renamed from: j */
    String mo7436j();
}
