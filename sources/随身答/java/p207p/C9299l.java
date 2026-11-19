package p207p;

import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import coil3.util.AbstractC5348c;
import kotlin.coroutines.Continuation;
import okio.Path;
import p090e0.AbstractC7810h;
import p090e0.C7819q;
import p151k.AbstractC8248s;
import p151k.C8247r;
import p183n.AbstractC9074s;
import p207p.InterfaceC9298k;
import p297y.C9932m;

/* renamed from: p.l */
/* loaded from: classes3.dex */
public final class C9299l implements InterfaceC9298k {

    /* renamed from: a */
    public final C8247r f16099a;

    /* renamed from: b */
    public final C9932m f16100b;

    /* renamed from: p.l$a */
    public static final class a implements InterfaceC9298k.a {
        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(C8247r c8247r, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            if (AbstractC5348c.m2936m(c8247r)) {
                return new C9299l(c8247r, c9932m);
            }
            return null;
        }
    }

    public C9299l(C8247r c8247r, C9932m c9932m) {
        this.f16099a = c8247r;
        this.f16100b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) {
        Path.Companion companion = Path.INSTANCE;
        String strM13282d = AbstractC8248s.m13282d(this.f16099a);
        if (strM13282d == null) {
            throw new IllegalStateException("filePath == null");
        }
        Path path = Path.Companion.get$default(companion, strM13282d, false, 1, (Object) null);
        return new C9303p(AbstractC9074s.m14555d(path, this.f16100b.m17112g(), null, null, null, 28, null), C7819q.f13131a.m12214a(AbstractC7810h.m12193d(path)), DataSource.f2866c);
    }
}
