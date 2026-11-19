package p237s;

import com.bumptech.glide.load.data.C5411j;
import p160l.C9229c;
import p160l.C9230d;
import p226r.C9882h;
import p226r.C9887m;
import p226r.C9892r;
import p226r.InterfaceC9888n;
import p226r.InterfaceC9889o;

/* renamed from: s.a */
/* loaded from: classes3.dex */
public class C9955a implements InterfaceC9888n {

    /* renamed from: b */
    public static final C9229c f19940b = C9229c.m16935f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final C9887m f19941a;

    /* renamed from: s.a$a */
    public static class a implements InterfaceC9889o {

        /* renamed from: a */
        public final C9887m f19942a = new C9887m(500);

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9955a(this.f19942a);
        }
    }

    public C9955a(C9887m c9887m) {
        this.f19941a = c9887m;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(C9882h c9882h, int i10, int i11, C9230d c9230d) {
        C9887m c9887m = this.f19941a;
        if (c9887m != null) {
            C9882h c9882h2 = (C9882h) c9887m.m18501a(c9882h, 0, 0);
            if (c9882h2 == null) {
                this.f19941a.m18502b(c9882h, 0, 0, c9882h);
            } else {
                c9882h = c9882h2;
            }
        }
        return new InterfaceC9888n.a(c9882h, new C5411j(c9882h, ((Integer) c9230d.m16940c(f19940b)).intValue()));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(C9882h c9882h) {
        return true;
    }
}
