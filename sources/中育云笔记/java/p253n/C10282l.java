package p253n;

import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import coil3.util.AbstractC5490c;
import okio.Path;
import p001a0.AbstractC0012i;
import p001a0.C0021r;
import p212k.AbstractC9767u;
import p212k.C9766t;
import p228l.AbstractC10086s;
import p253n.InterfaceC10281k;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.l */
/* loaded from: classes3.dex */
public final class C10282l implements InterfaceC10281k {

    /* renamed from: a */
    public final C9766t f24470a;

    /* renamed from: b */
    public final C11634n f24471b;

    /* renamed from: n.l$a */
    public static final class a implements InterfaceC10281k.a {
        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(C9766t c9766t, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            if (AbstractC5490c.m3313m(c9766t)) {
                return new C10282l(c9766t, c11634n);
            }
            return null;
        }
    }

    public C10282l(C9766t c9766t, C11634n c11634n) {
        this.f24470a = c9766t;
        this.f24471b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) {
        Path.Companion companion = Path.Companion;
        String strM19690d = AbstractC9767u.m19690d(this.f24470a);
        if (strM19690d == null) {
            throw new IllegalStateException("filePath == null");
        }
        Path path = Path.Companion.get$default(companion, strM19690d, false, 1, (Object) null);
        return new C10286p(AbstractC10086s.m21097d(path, this.f24471b.m25747g(), null, null, null, 28, null), C0021r.f9a.m48a(AbstractC0012i.m26d(path)), DataSource.f3612e);
    }
}
