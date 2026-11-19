package p135eb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;

/* renamed from: eb.b */
/* loaded from: classes6.dex */
public interface InterfaceC9115b extends IInterface {

    /* renamed from: eb.b$a */
    public static abstract class a extends Binder implements InterfaceC9115b {

        /* renamed from: eb.b$a$a, reason: collision with other inner class name */
        public static class C12136a implements InterfaceC9115b {

            /* renamed from: a */
            public IBinder f21288a;

            public C12136a(IBinder iBinder) {
                this.f21288a = iBinder;
            }

            @Override // p135eb.InterfaceC9115b
            /* renamed from: a */
            public void mo17933a(InterfaceC9114a interfaceC9114a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC9114a != null ? interfaceC9114a.asBinder() : null);
                    this.f21288a.transact(7, parcelObtain, parcelObtain2, 0);
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
                return this.f21288a;
            }

            @Override // p135eb.InterfaceC9115b
            /* renamed from: d */
            public UserInfo mo17934d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f21288a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p135eb.InterfaceC9115b
            /* renamed from: g */
            public void mo17935g(InterfaceC9114a interfaceC9114a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC9114a != null ? interfaceC9114a.asBinder() : null);
                    this.f21288a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p135eb.InterfaceC9115b
            /* renamed from: h */
            public void mo17936h(InterfaceC9114a interfaceC9114a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC9114a != null ? interfaceC9114a.asBinder() : null);
                    this.f21288a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p135eb.InterfaceC9115b
            /* renamed from: k */
            public ServerInfo mo17937k() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f21288a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServerInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: l */
        public static InterfaceC9115b m17938l(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageServer");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC9115b)) ? new C12136a(iBinder) : (InterfaceC9115b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo17933a(InterfaceC9114a interfaceC9114a);

    /* renamed from: d */
    UserInfo mo17934d();

    /* renamed from: g */
    void mo17935g(InterfaceC9114a interfaceC9114a);

    /* renamed from: h */
    void mo17936h(InterfaceC9114a interfaceC9114a);

    /* renamed from: k */
    ServerInfo mo17937k();
}
