package p104m0;

import com.bumptech.glide.load.data.C4698j;
import p053f0.C6284c;
import p053f0.C6285d;
import p097l0.C7274h;
import p097l0.C7279m;
import p097l0.C7284r;
import p097l0.InterfaceC7280n;
import p097l0.InterfaceC7281o;

/* renamed from: m0.a */
/* loaded from: classes3.dex */
public class C7367a implements InterfaceC7280n {

    /* renamed from: b */
    public static final C6284c f9361b = C6284c.m6415f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final C7279m f9362a;

    /* renamed from: m0.a$a */
    public static class a implements InterfaceC7281o {

        /* renamed from: a */
        public final C7279m f9363a = new C7279m(500);

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7367a(this.f9363a);
        }
    }

    public C7367a(C7279m c7279m) {
        this.f9362a = c7279m;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(C7274h c7274h, int i6, int i7, C6285d c6285d) {
        C7279m c7279m = this.f9362a;
        if (c7279m != null) {
            C7274h c7274h2 = (C7274h) c7279m.m8246a(c7274h, 0, 0);
            if (c7274h2 == null) {
                this.f9362a.m8247b(c7274h, 0, 0, c7274h);
            } else {
                c7274h = c7274h2;
            }
        }
        return new InterfaceC7280n.a(c7274h, new C4698j(c7274h, ((Integer) c6285d.m6420c(f9361b)).intValue()));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(C7274h c7274h) {
        return true;
    }
}
