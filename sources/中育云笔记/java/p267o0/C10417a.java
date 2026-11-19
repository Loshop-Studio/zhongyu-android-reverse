package p267o0;

import com.bumptech.glide.load.data.C5830j;
import p168h0.C9437d;
import p168h0.C9438e;
import p254n0.C10294h;
import p254n0.C10299m;
import p254n0.C10304r;
import p254n0.InterfaceC10300n;
import p254n0.InterfaceC10301o;

/* renamed from: o0.a */
/* loaded from: classes3.dex */
public class C10417a implements InterfaceC10300n {

    /* renamed from: b */
    public static final C9437d f24795b = C9437d.m18621f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final C10299m f24796a;

    /* renamed from: o0.a$a */
    public static class a implements InterfaceC10301o {

        /* renamed from: a */
        public final C10299m f24797a = new C10299m(500);

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10417a(this.f24797a);
        }
    }

    public C10417a(C10299m c10299m) {
        this.f24796a = c10299m;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(C10294h c10294h, int i10, int i11, C9438e c9438e) {
        C10299m c10299m = this.f24796a;
        if (c10299m != null) {
            C10294h c10294h2 = (C10294h) c10299m.m21472a(c10294h, 0, 0);
            if (c10294h2 == null) {
                this.f24796a.m21473b(c10294h, 0, 0, c10294h);
            } else {
                c10294h = c10294h2;
            }
        }
        return new InterfaceC10300n.a(c10294h, new C5830j(c10294h, ((Integer) c9438e.m18626c(f24795b)).intValue()));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(C10294h c10294h) {
        return true;
    }
}
