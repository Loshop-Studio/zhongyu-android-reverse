package p086j0;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import p077i0.C5652h;
import p208z.C6803h;
import p208z.InterfaceC6801f;
import p208z.InterfaceC6802g;

/* renamed from: j0.a */
/* loaded from: classes2.dex */
public final class C5731a implements InterfaceC6801f {

    /* renamed from: a */
    public final /* synthetic */ int f9064a;

    public /* synthetic */ C5731a(int i) {
        this.f9064a = i;
    }

    @Override // p208z.InterfaceC6801f
    /* renamed from: a */
    public final InterfaceC6802g mo5090a(Object obj) {
        switch (this.f9064a) {
            case 0:
                return new C5652h((ByteBuffer) obj, 3);
            case 1:
                return new C6803h(obj, 1);
            default:
                return new C6803h((ParcelFileDescriptor) obj);
        }
    }

    @Override // p208z.InterfaceC6801f
    /* renamed from: b */
    public final Class mo5091b() {
        switch (this.f9064a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
