package p239t0;

import java.io.InputStream;
import java.net.URL;
import p162m0.C8539d;
import p228s0.C9106h;
import p228s0.C9116r;
import p228s0.InterfaceC9112n;
import p228s0.InterfaceC9113o;

/* renamed from: t0.g */
/* loaded from: classes3.dex */
public class C9376g implements InterfaceC9112n {

    /* renamed from: a */
    public final InterfaceC9112n f16280a;

    /* renamed from: t0.g$a */
    public static class a implements InterfaceC9113o {
        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9376g(c9116r.m15429d(C9106h.class, InputStream.class));
        }
    }

    public C9376g(InterfaceC9112n interfaceC9112n) {
        this.f16280a = interfaceC9112n;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(URL url, int i10, int i11, C8539d c8539d) {
        return this.f16280a.mo15355b(new C9106h(url), i10, i11, c8539d);
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(URL url) {
        return true;
    }
}
