package p180n7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: n7.b */
/* loaded from: classes.dex */
public interface InterfaceC8669b extends IInterface {

    /* renamed from: n7.b$a */
    public static abstract class a extends Binder implements InterfaceC8669b {

        /* renamed from: n7.b$a$a, reason: collision with other inner class name */
        public static class C10154a implements InterfaceC8669b {

            /* renamed from: a */
            public IBinder f14411a;

            public C10154a(IBinder iBinder) {
                this.f14411a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14411a;
            }

            @Override // p180n7.InterfaceC8669b
            /* renamed from: b */
            public UserInfo mo14269b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f14411a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p180n7.InterfaceC8669b
            /* renamed from: c */
            public void mo14270c(InterfaceC8668a interfaceC8668a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC8668a != null ? interfaceC8668a.asBinder() : null);
                    this.f14411a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p180n7.InterfaceC8669b
            /* renamed from: d */
            public void mo14271d(InterfaceC8668a interfaceC8668a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC8668a != null ? interfaceC8668a.asBinder() : null);
                    this.f14411a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p180n7.InterfaceC8669b
            /* renamed from: f */
            public ServerInfo mo14272f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f14411a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p180n7.InterfaceC8669b
            /* renamed from: g */
            public String mo14273g() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f14411a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: h */
        public static InterfaceC8669b m14274h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageServer");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8669b)) ? new C10154a(iBinder) : (InterfaceC8669b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: b */
    UserInfo mo14269b();

    /* renamed from: c */
    void mo14270c(InterfaceC8668a interfaceC8668a);

    /* renamed from: d */
    void mo14271d(InterfaceC8668a interfaceC8668a);

    /* renamed from: f */
    ServerInfo mo14272f();

    /* renamed from: g */
    String mo14273g();
}
