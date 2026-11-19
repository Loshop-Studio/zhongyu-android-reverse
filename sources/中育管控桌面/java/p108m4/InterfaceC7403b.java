package p108m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import p108m4.InterfaceC7402a;

/* renamed from: m4.b */
/* loaded from: classes4.dex */
public interface InterfaceC7403b extends IInterface {
    /* renamed from: a */
    void mo6211a(String str, String str2, String str3);

    /* renamed from: d */
    void mo6212d(ServerInfo serverInfo);

    /* renamed from: e */
    UserInfo mo6213e();

    /* renamed from: f */
    void mo6214f(InterfaceC7402a interfaceC7402a);

    /* renamed from: k */
    ServerInfo mo6215k();

    /* renamed from: l */
    void mo6216l(InterfaceC7402a interfaceC7402a);

    /* renamed from: m */
    void mo6217m(UserInfo userInfo);

    /* renamed from: n */
    void mo6218n(InterfaceC7402a interfaceC7402a);

    /* renamed from: o */
    String mo6219o();

    /* renamed from: m4.b$a */
    public static abstract class a extends Binder implements InterfaceC7403b {

        /* renamed from: m4.b$a$a, reason: collision with other inner class name */
        public static class C8036a implements InterfaceC7403b {

            /* renamed from: a */
            public IBinder f9439a;

            public C8036a(IBinder iBinder) {
                this.f9439a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9439a;
            }

            @Override // p108m4.InterfaceC7403b
            /* renamed from: d */
            public void mo6212d(ServerInfo serverInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    if (serverInfo != null) {
                        parcelObtain.writeInt(1);
                        serverInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f9439a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, "com.zykj.message.server.MessageServer");
        }

        /* renamed from: p */
        public static InterfaceC7403b m8416p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageServer");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7403b)) ? new C8036a(iBinder) : (InterfaceC7403b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            if (i6 == 1598968902) {
                parcel2.writeString("com.zykj.message.server.MessageServer");
                return true;
            }
            switch (i6) {
                case 1:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    UserInfo userInfoMo6213e = mo6213e();
                    parcel2.writeNoException();
                    if (userInfoMo6213e != null) {
                        parcel2.writeInt(1);
                        userInfoMo6213e.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    ServerInfo serverInfoMo6215k = mo6215k();
                    parcel2.writeNoException();
                    if (serverInfoMo6215k != null) {
                        parcel2.writeInt(1);
                        serverInfoMo6215k.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    mo6217m(parcel.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    mo6212d(parcel.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    mo6214f(InterfaceC7402a.a.m8415p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    mo6218n(InterfaceC7402a.a.m8415p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    mo6216l(InterfaceC7402a.a.m8415p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    mo6211a(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.zykj.message.server.MessageServer");
                    String strMo6219o = mo6219o();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo6219o);
                    return true;
                default:
                    return super.onTransact(i6, parcel, parcel2, i7);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
