package p114r;

import p076j.C3793c;
import p076j.C3794d;
import p081k.C3849j;
import p110q.C4458g;
import p110q.C4463l;
import p110q.C4468q;
import p110q.InterfaceC4464m;
import p110q.InterfaceC4465n;

/* renamed from: r.a */
/* loaded from: classes2.dex */
public class C4485a implements InterfaceC4464m {

    /* renamed from: b */
    public static final C3793c f5252b = C3793c.m4945f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final C4463l f5253a;

    /* renamed from: r.a$a */
    public static class a implements InterfaceC4465n {

        /* renamed from: a */
        public final C4463l f5254a = new C4463l(500);

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4485a(this.f5254a);
        }
    }

    public C4485a(C4463l c4463l) {
        this.f5253a = c4463l;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(C4458g c4458g, int i4, int i5, C3794d c3794d) {
        C4463l c4463l = this.f5253a;
        if (c4463l != null) {
            C4458g c4458g2 = (C4458g) c4463l.m5713a(c4458g, 0, 0);
            if (c4458g2 == null) {
                this.f5253a.m5714b(c4458g, 0, 0, c4458g);
            } else {
                c4458g = c4458g2;
            }
        }
        return new InterfaceC4464m.a(c4458g, new C3849j(c4458g, ((Integer) c3794d.m4951c(f5252b)).intValue()));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(C4458g c4458g) {
        return true;
    }
}
