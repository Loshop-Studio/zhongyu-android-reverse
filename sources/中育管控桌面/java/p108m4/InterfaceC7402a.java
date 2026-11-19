package p108m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: m4.a */
/* loaded from: classes4.dex */
public interface InterfaceC7402a extends IInterface {

    /* renamed from: m4.a$a */
    public static abstract class a extends Binder implements InterfaceC7402a {

        /* renamed from: m4.a$a$a, reason: collision with other inner class name */
        public static class C8035a implements InterfaceC7402a {

            /* renamed from: a */
            public IBinder f9438a;

            public C8035a(IBinder iBinder) {
                this.f9438a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9438a;
            }

            @Override // p108m4.InterfaceC7402a
            /* renamed from: c */
            public void mo8413c(UserInfo userInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageCallBack");
                    if (userInfo != null) {
                        parcelObtain.writeInt(1);
                        userInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f9438a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p108m4.InterfaceC7402a
            public String getName() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageCallBack");
                    this.f9438a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p108m4.InterfaceC7402a
            /* renamed from: i */
            public void mo8414i(ServerInfo serverInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageCallBack");
                    if (serverInfo != null) {
                        parcelObtain.writeInt(1);
                        serverInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f9438a.transact(2, parcelObtain, parcelObtain2, 0);
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

        /* renamed from: p */
        public static InterfaceC7402a m8415p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageCallBack");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7402a)) ? new C8035a(iBinder) : (InterfaceC7402a) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: c */
    void mo8413c(UserInfo userInfo);

    String getName();

    /* renamed from: i */
    void mo8414i(ServerInfo serverInfo);
}
