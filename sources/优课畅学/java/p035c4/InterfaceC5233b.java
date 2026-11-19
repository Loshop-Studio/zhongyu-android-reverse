package p035c4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: c4.b */
/* loaded from: classes4.dex */
public interface InterfaceC5233b extends IInterface {

    /* renamed from: c4.b$a */
    public static abstract class a extends Binder implements InterfaceC5233b {

        /* renamed from: c4.b$a$a, reason: collision with other inner class name */
        public static class C10785a implements InterfaceC5233b {

            /* renamed from: a */
            public IBinder f2319a;

            public C10785a(IBinder iBinder) {
                this.f2319a = iBinder;
            }

            @Override // p035c4.InterfaceC5233b
            /* renamed from: a */
            public void mo2137a(InterfaceC5232a interfaceC5232a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC5232a != null ? interfaceC5232a.asBinder() : null);
                    this.f2319a.transact(5, parcelObtain, parcelObtain2, 0);
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
                return this.f2319a;
            }

            @Override // p035c4.InterfaceC5233b
            /* renamed from: d */
            public UserInfo mo2138d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f2319a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p035c4.InterfaceC5233b
            /* renamed from: g */
            public void mo2139g(InterfaceC5232a interfaceC5232a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC5232a != null ? interfaceC5232a.asBinder() : null);
                    this.f2319a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p035c4.InterfaceC5233b
            /* renamed from: i */
            public void mo2140i(InterfaceC5232a interfaceC5232a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC5232a != null ? interfaceC5232a.asBinder() : null);
                    this.f2319a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p035c4.InterfaceC5233b
            /* renamed from: j */
            public ServerInfo mo2141j() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f2319a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: k */
        public static InterfaceC5233b m2142k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageServer");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5233b)) ? new C10785a(iBinder) : (InterfaceC5233b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo2137a(InterfaceC5232a interfaceC5232a);

    /* renamed from: d */
    UserInfo mo2138d();

    /* renamed from: g */
    void mo2139g(InterfaceC5232a interfaceC5232a);

    /* renamed from: i */
    void mo2140i(InterfaceC5232a interfaceC5232a);

    /* renamed from: j */
    ServerInfo mo2141j();
}
