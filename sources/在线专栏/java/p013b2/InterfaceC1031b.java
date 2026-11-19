package p013b2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: b2.b */
/* loaded from: classes.dex */
public interface InterfaceC1031b extends IInterface {

    /* renamed from: b2.b$a */
    public static abstract class a extends Binder implements InterfaceC1031b {

        /* renamed from: b2.b$a$a, reason: collision with other inner class name */
        private static class C3522a implements InterfaceC1031b {

            /* renamed from: a */
            private IBinder f5711a;

            C3522a(IBinder iBinder) {
                this.f5711a = iBinder;
            }

            @Override // p013b2.InterfaceC1031b
            /* renamed from: a */
            public void mo4795a(InterfaceC1030a interfaceC1030a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC1030a != null ? interfaceC1030a.asBinder() : null);
                    this.f5711a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5711a;
            }

            @Override // p013b2.InterfaceC1031b
            /* renamed from: c */
            public UserInfo mo4796c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f5711a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p013b2.InterfaceC1031b
            /* renamed from: e */
            public String mo4797e() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f5711a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p013b2.InterfaceC1031b
            /* renamed from: m */
            public void mo4798m(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f5711a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p013b2.InterfaceC1031b
            /* renamed from: p */
            public ServerInfo mo4799p() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f5711a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p013b2.InterfaceC1031b
            /* renamed from: r */
            public void mo4800r(InterfaceC1030a interfaceC1030a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC1030a != null ? interfaceC1030a.asBinder() : null);
                    this.f5711a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: y */
        public static InterfaceC1031b m4801y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageServer");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1031b)) ? new C3522a(iBinder) : (InterfaceC1031b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo4795a(InterfaceC1030a interfaceC1030a) throws RemoteException;

    /* renamed from: c */
    UserInfo mo4796c() throws RemoteException;

    /* renamed from: e */
    String mo4797e() throws RemoteException;

    /* renamed from: m */
    void mo4798m(String str, String str2, String str3) throws RemoteException;

    /* renamed from: p */
    ServerInfo mo4799p() throws RemoteException;

    /* renamed from: r */
    void mo4800r(InterfaceC1030a interfaceC1030a) throws RemoteException;
}
