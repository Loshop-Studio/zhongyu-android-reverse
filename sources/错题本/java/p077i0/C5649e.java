package p077i0;

import android.os.ParcelFileDescriptor;
import coil3.decode.C3271l;
import io.reactivex.internal.operators.observable.C5707c;
import java.nio.ByteBuffer;
import p016b0.C3071g;
import p016b0.InterfaceC3072g0;
import p180v0.AbstractC6654a;
import p202y.C6763f;
import p202y.InterfaceC6764g;

/* renamed from: i0.e */
/* loaded from: classes2.dex */
public final class C5649e implements InterfaceC6764g {

    /* renamed from: a */
    public final /* synthetic */ int f8786a;

    /* renamed from: b */
    public final C5657m f8787b;

    public /* synthetic */ C5649e(C5657m c5657m, int i) {
        this.f8786a = i;
        this.f8787b = c5657m;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: a */
    public final boolean mo4970a(Object obj, C6763f c6763f) {
        switch (this.f8786a) {
            case 0:
                this.f8787b.getClass();
                break;
            default:
                this.f8787b.getClass();
                break;
        }
        return true;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: b */
    public final InterfaceC3072g0 mo4971b(Object obj, int i, int i8, C6763f c6763f) {
        switch (this.f8786a) {
            case 0:
                int i9 = AbstractC6654a.f11225a;
                C3271l c3271l = new C3271l((ByteBuffer) obj);
                C5707c c5707c = C5657m.f8807k;
                C5657m c5657m = this.f8787b;
                return c5657m.m4990a(new C3071g(c3271l, c5657m.f8813d, c5657m.f8812c), i, i8, c6763f, c5707c);
            default:
                C5657m c5657m2 = this.f8787b;
                return c5657m2.m4990a(new C3071g((ParcelFileDescriptor) obj, c5657m2.f8813d, c5657m2.f8812c), i, i8, c6763f, C5657m.f8807k);
        }
    }
}
