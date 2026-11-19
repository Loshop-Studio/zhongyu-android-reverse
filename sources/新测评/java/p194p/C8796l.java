package p194p;

import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import coil3.util.AbstractC5213c;
import kotlin.coroutines.Continuation;
import okio.Path;
import p030c0.AbstractC5084i;
import p030c0.C5093r;
import p137k.AbstractC7849u;
import p137k.C7848t;
import p172n.AbstractC8604s;
import p194p.InterfaceC8795k;
import p290y.C9892k;

/* renamed from: p.l */
/* loaded from: classes3.dex */
public final class C8796l implements InterfaceC8795k {

    /* renamed from: a */
    public final C7848t f14934a;

    /* renamed from: b */
    public final C9892k f14935b;

    /* renamed from: p.l$a */
    public static final class a implements InterfaceC8795k.a {
        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(C7848t c7848t, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            if (AbstractC5213c.m3219m(c7848t)) {
                return new C8796l(c7848t, c9892k);
            }
            return null;
        }
    }

    public C8796l(C7848t c7848t, C9892k c9892k) {
        this.f14934a = c7848t;
        this.f14935b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) {
        Path.Companion companion = Path.INSTANCE;
        String strM13314d = AbstractC7849u.m13314d(this.f14934a);
        if (strM13314d == null) {
            throw new IllegalStateException("filePath == null");
        }
        Path path = Path.Companion.get$default(companion, strM13314d, false, 1, (Object) null);
        return new C8800p(AbstractC8604s.m14164d(path, this.f14935b.m16704g(), null, null, null, 28, null), C5093r.f2659a.m2707a(AbstractC5084i.m2685d(path)), DataSource.f2937c);
    }
}
