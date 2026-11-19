package p253n;

import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Okio;
import okio.Path;
import p001a0.AbstractC0012i;
import p001a0.C0021r;
import p212k.C9766t;
import p228l.AbstractC10086s;
import p253n.InterfaceC10281k;
import p310qd.AbstractC10793c0;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.n */
/* loaded from: classes3.dex */
public final class C10284n implements InterfaceC10281k {

    /* renamed from: a */
    public final C9766t f24475a;

    /* renamed from: b */
    public final C11634n f24476b;

    /* renamed from: n.n$a */
    public static final class a implements InterfaceC10281k.a {
        /* renamed from: c */
        private final boolean m21413c(C9766t c9766t) {
            return AbstractC9979u.m20289b(c9766t.m19685c(), "jar:file");
        }

        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(C9766t c9766t, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            if (m21413c(c9766t)) {
                return new C10284n(c9766t, c11634n);
            }
            return null;
        }
    }

    public C10284n(C9766t c9766t, C11634n c11634n) {
        this.f24475a = c9766t;
        this.f24476b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) {
        String strM19684b = this.f24475a.m19684b();
        if (strM19684b == null) {
            strM19684b = "";
        }
        String str = strM19684b;
        int iM23128e0 = AbstractC10793c0.m23128e0(str, '!', 0, false, 6, null);
        if (iM23128e0 == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + this.f24475a).toString());
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = str.substring(0, iM23128e0);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        Path path = Path.Companion.get$default(companion, strSubstring, false, 1, (Object) null);
        String strSubstring2 = str.substring(iM23128e0 + 1, str.length());
        AbstractC9979u.m20293f(strSubstring2, "substring(...)");
        Path path2 = Path.Companion.get$default(companion, strSubstring2, false, 1, (Object) null);
        return new C10286p(AbstractC10086s.m21097d(path2, Okio.openZip(this.f24476b.m25747g(), path), null, null, null, 28, null), C0021r.f9a.m48a(AbstractC0012i.m26d(path2)), DataSource.f3612e);
    }
}
