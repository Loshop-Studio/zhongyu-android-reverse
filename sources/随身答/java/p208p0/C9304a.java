package p208p0;

import p122h0.C8083c;
import p122h0.C8084d;
import p132i0.C8121j;
import p194o0.C9140g;
import p194o0.C9145l;
import p194o0.C9150q;
import p194o0.InterfaceC9146m;
import p194o0.InterfaceC9147n;

/* renamed from: p0.a */
/* loaded from: classes3.dex */
public class C9304a implements InterfaceC9146m {

    /* renamed from: b */
    public static final C8083c f16111b = C8083c.m12902f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final C9145l f16112a;

    /* renamed from: p0.a$a */
    public static class a implements InterfaceC9147n {

        /* renamed from: a */
        public final C9145l f16113a = new C9145l(500);

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9304a(this.f16113a);
        }
    }

    public C9304a(C9145l c9145l) {
        this.f16112a = c9145l;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(C9140g c9140g, int i9, int i10, C8084d c8084d) {
        C9145l c9145l = this.f16112a;
        if (c9145l != null) {
            C9140g c9140g2 = (C9140g) c9145l.m14697a(c9140g, 0, 0);
            if (c9140g2 == null) {
                this.f16112a.m14698b(c9140g, 0, 0, c9140g);
            } else {
                c9140g = c9140g2;
            }
        }
        return new InterfaceC9146m.a(c9140g, new C8121j(c9140g, ((Integer) c8084d.m12908c(f16111b)).intValue()));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(C9140g c9140g) {
        return true;
    }
}
