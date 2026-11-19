package p070b.p146d.p147a.p150d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p070b.p146d.p147a.p148b.EnumC0881b;
import p070b.p146d.p147a.p149c.AbstractBinderC0887a;
import p070b.p146d.p147a.p150d.p151c.C0891a;
import p070b.p146d.p147a.p150d.p151c.C0893c;

/* renamed from: b.d.a.d.a */
/* loaded from: classes.dex */
public interface InterfaceC0889a extends IInterface {

    /* renamed from: b.d.a.d.a$a */
    public static abstract class a extends Binder implements InterfaceC0889a {
        public a() {
            attachInterface(this, "com.zykj.message.server.MessageCallBack");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                if (parcel.readInt() != 0) {
                    C0893c.CREATOR.createFromParcel(parcel);
                }
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
                ((EnumC0881b.a.g) this).f4715b.mo2586c(parcel.readInt() != 0 ? C0891a.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.zykj.message.server.MessageCallBack");
                return true;
            }
            parcel.enforceInterface("com.zykj.message.server.MessageCallBack");
            String str = ((AbstractBinderC0887a) this).f4727a;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
    }
}
