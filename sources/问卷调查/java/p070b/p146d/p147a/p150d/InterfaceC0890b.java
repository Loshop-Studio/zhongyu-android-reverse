package p070b.p146d.p147a.p150d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p070b.p146d.p147a.p150d.InterfaceC0889a;
import p070b.p146d.p147a.p150d.p151c.C0891a;
import p070b.p146d.p147a.p150d.p151c.C0893c;

/* renamed from: b.d.a.d.b */
/* loaded from: classes.dex */
public interface InterfaceC0890b extends IInterface {

    /* renamed from: b.d.a.d.b$a */
    public static abstract class a extends Binder implements InterfaceC0890b {

        /* renamed from: a */
        public static final /* synthetic */ int f4728a = 0;

        /* renamed from: b.d.a.d.b$a$a, reason: collision with other inner class name */
        public static class C1097a implements InterfaceC0890b {

            /* renamed from: a */
            public IBinder f4729a;

            public C1097a(IBinder iBinder) {
                this.f4729a = iBinder;
            }

            @Override // p070b.p146d.p147a.p150d.InterfaceC0890b
            /* renamed from: a */
            public void mo2587a(InterfaceC0889a interfaceC0889a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(interfaceC0889a != null ? (InterfaceC0889a.a) interfaceC0889a : null);
                    this.f4729a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4729a;
            }

            @Override // p070b.p146d.p147a.p150d.InterfaceC0890b
            /* renamed from: b */
            public void mo2588b(InterfaceC0889a interfaceC0889a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder((InterfaceC0889a.a) interfaceC0889a);
                    this.f4729a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p070b.p146d.p147a.p150d.InterfaceC0890b
            /* renamed from: c */
            public C0893c mo2589c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f4729a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? C0893c.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p070b.p146d.p147a.p150d.InterfaceC0890b
            /* renamed from: d */
            public C0891a mo2590d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    this.f4729a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? C0891a.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* renamed from: a */
    void mo2587a(InterfaceC0889a interfaceC0889a);

    /* renamed from: b */
    void mo2588b(InterfaceC0889a interfaceC0889a);

    /* renamed from: c */
    C0893c mo2589c();

    /* renamed from: d */
    C0891a mo2590d();
}
