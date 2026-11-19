package p096e6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: e6.b */
/* loaded from: classes4.dex */
public interface InterfaceC7852b extends IInterface {

    /* renamed from: e6.b$a */
    public static abstract class a extends Binder implements InterfaceC7852b {

        /* renamed from: e6.b$a$a, reason: collision with other inner class name */
        public static class C10070a implements InterfaceC7852b {

            /* renamed from: a */
            public IBinder f13194a;

            public C10070a(IBinder iBinder) {
                this.f13194a = iBinder;
            }

            @Override // p096e6.InterfaceC7852b
            /* renamed from: a */
            public void mo12325a(InterfaceC7851a interfaceC7851a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC7851a != null ? interfaceC7851a.asBinder() : null);
                    this.f13194a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13194a;
            }

            @Override // p096e6.InterfaceC7852b
            /* renamed from: c */
            public UserInfo mo12326c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f13194a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p096e6.InterfaceC7852b
            /* renamed from: e */
            public ServerInfo mo12327e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f13194a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p096e6.InterfaceC7852b
            /* renamed from: f */
            public void mo12328f(InterfaceC7851a interfaceC7851a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC7851a != null ? interfaceC7851a.asBinder() : null);
                    this.f13194a.transact(7, parcelObtain, parcelObtain2, 0);
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

        /* renamed from: g */
        public static InterfaceC7852b m12329g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageServer");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7852b)) ? new C10070a(iBinder) : (InterfaceC7852b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo12325a(InterfaceC7851a interfaceC7851a);

    /* renamed from: c */
    UserInfo mo12326c();

    /* renamed from: e */
    ServerInfo mo12327e();

    /* renamed from: f */
    void mo12328f(InterfaceC7851a interfaceC7851a);
}
