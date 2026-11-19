package p124p;

import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import coil3.util.AbstractC4594c;
import kotlin.coroutines.Continuation;
import okio.Path;
import p023c0.AbstractC4464i;
import p023c0.C4473r;
import p087k.AbstractC6622u;
import p087k.C6621t;
import p110n.AbstractC7436s;
import p124p.InterfaceC7582k;
import p187y.C7880m;

/* renamed from: p.l */
/* loaded from: classes3.dex */
public final class C7583l implements InterfaceC7582k {

    /* renamed from: a */
    public final C6621t f10034a;

    /* renamed from: b */
    public final C7880m f10035b;

    /* renamed from: p.l$a */
    public static final class a implements InterfaceC7582k.a {
        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(C6621t c6621t, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            if (AbstractC4594c.m2045m(c6621t)) {
                return new C7583l(c6621t, c7880m);
            }
            return null;
        }
    }

    public C7583l(C6621t c6621t, C7880m c7880m) {
        this.f10034a = c6621t;
        this.f10035b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) {
        Path.Companion companion = Path.INSTANCE;
        String strM7580d = AbstractC6622u.m7580d(this.f10034a);
        if (strM7580d == null) {
            throw new IllegalStateException("filePath == null");
        }
        Path path = Path.Companion.get$default(companion, strM7580d, false, 1, (Object) null);
        return new C7587p(AbstractC7436s.m8485d(path, this.f10035b.m9665g(), null, null, null, 28, null), C4473r.f1339a.m1565a(AbstractC4464i.m1543d(path)), DataSource.f1621c);
    }
}
