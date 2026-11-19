package p003a2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;

/* renamed from: a2.b */
/* loaded from: classes2.dex */
public interface InterfaceC0010b extends IInterface {

    /* renamed from: a2.b$a */
    public static abstract class a extends Binder implements InterfaceC0010b {

        /* renamed from: a2.b$a$a, reason: collision with other inner class name */
        public static class C4719a implements InterfaceC0010b {

            /* renamed from: a */
            public IBinder f6a;

            public C4719a(IBinder iBinder) {
                this.f6a = iBinder;
            }

            @Override // p003a2.InterfaceC0010b
            /* renamed from: a */
            public void mo20a(InterfaceC0009a interfaceC0009a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC0009a != null ? interfaceC0009a.asBinder() : null);
                    this.f6a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6a;
            }

            @Override // p003a2.InterfaceC0010b
            /* renamed from: c */
            public ServerInfo mo21c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f6a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p003a2.InterfaceC0010b
            /* renamed from: d */
            public void mo22d(InterfaceC0009a interfaceC0009a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC0009a != null ? interfaceC0009a.asBinder() : null);
                    this.f6a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: f */
        public static InterfaceC0010b m23f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageServer");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0010b)) ? new C4719a(iBinder) : (InterfaceC0010b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo20a(InterfaceC0009a interfaceC0009a);

    /* renamed from: c */
    ServerInfo mo21c();

    /* renamed from: d */
    void mo22d(InterfaceC0009a interfaceC0009a);
}
