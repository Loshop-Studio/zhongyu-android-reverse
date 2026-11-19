package p062g0;

import java.util.ArrayDeque;
import p055f0.C5501f;
import p055f0.C5508m;
import p055f0.C5509n;
import p055f0.C5510o;
import p055f0.InterfaceC5511p;
import p129o2.C6268a;
import p202y.C6762e;
import p202y.C6763f;
import p208z.C6806k;

/* renamed from: g0.a */
/* loaded from: classes2.dex */
public final class C5536a implements InterfaceC5511p {

    /* renamed from: b */
    public static final C6762e f8578b = C6762e.m6435a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a */
    public final C6268a f8579a;

    public C5536a(C6268a c6268a) {
        this.f8579a = c6268a;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4873a(Object obj) {
        return true;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        C5501f c5501f = (C5501f) obj;
        C6268a c6268a = this.f8579a;
        if (c6268a != null) {
            C5508m c5508m = (C5508m) c6268a.f10022b;
            C5509n c5509nM4887a = C5509n.m4887a(c5501f);
            Object objM6316a = c5508m.m6316a(c5509nM4887a);
            ArrayDeque arrayDeque = C5509n.f8527b;
            synchronized (arrayDeque) {
                arrayDeque.offer(c5509nM4887a);
            }
            C5501f c5501f2 = (C5501f) objM6316a;
            if (c5501f2 == null) {
                c5508m.m6317d(C5509n.m4887a(c5501f), c5501f);
            } else {
                c5501f = c5501f2;
            }
        }
        return new C5510o(c5501f, new C6806k(c5501f, ((Integer) c6763f.m6436c(f8578b)).intValue()));
    }
}
