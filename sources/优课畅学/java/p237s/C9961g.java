package p237s;

import java.io.InputStream;
import java.net.URL;
import p160l.C9230d;
import p226r.C9882h;
import p226r.C9892r;
import p226r.InterfaceC9888n;
import p226r.InterfaceC9889o;

/* renamed from: s.g */
/* loaded from: classes3.dex */
public class C9961g implements InterfaceC9888n {

    /* renamed from: a */
    public final InterfaceC9888n f19964a;

    /* renamed from: s.g$a */
    public static class a implements InterfaceC9889o {
        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9961g(c9892r.m18520d(C9882h.class, InputStream.class));
        }
    }

    public C9961g(InterfaceC9888n interfaceC9888n) {
        this.f19964a = interfaceC9888n;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(URL url, int i10, int i11, C9230d c9230d) {
        return this.f19964a.mo18446b(new C9882h(url), i10, i11, c9230d);
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(URL url) {
        return true;
    }
}
