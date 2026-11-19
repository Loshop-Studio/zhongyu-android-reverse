package p239t0;

import com.bumptech.glide.load.data.C5362j;
import p162m0.C8538c;
import p162m0.C8539d;
import p228s0.C9106h;
import p228s0.C9111m;
import p228s0.C9116r;
import p228s0.InterfaceC9112n;
import p228s0.InterfaceC9113o;

/* renamed from: t0.a */
/* loaded from: classes3.dex */
public class C9370a implements InterfaceC9112n {

    /* renamed from: b */
    public static final C8538c f16256b = C8538c.m14052f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final C9111m f16257a;

    /* renamed from: t0.a$a */
    public static class a implements InterfaceC9113o {

        /* renamed from: a */
        public final C9111m f16258a = new C9111m(500);

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9370a(this.f16258a);
        }
    }

    public C9370a(C9111m c9111m) {
        this.f16257a = c9111m;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(C9106h c9106h, int i10, int i11, C8539d c8539d) {
        C9111m c9111m = this.f16257a;
        if (c9111m != null) {
            C9106h c9106h2 = (C9106h) c9111m.m15410a(c9106h, 0, 0);
            if (c9106h2 == null) {
                this.f16257a.m15411b(c9106h, 0, 0, c9106h);
            } else {
                c9106h = c9106h2;
            }
        }
        return new InterfaceC9112n.a(c9106h, new C5362j(c9106h, ((Integer) c8539d.m14057c(f16256b)).intValue()));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(C9106h c9106h) {
        return true;
    }
}
