package p207p;

import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;
import okio.Path;
import p090e0.AbstractC7810h;
import p090e0.C7819q;
import p151k.C8247r;
import p183n.AbstractC9074s;
import p207p.InterfaceC9298k;
import p297y.C9932m;

/* renamed from: p.n */
/* loaded from: classes3.dex */
public final class C9301n implements InterfaceC9298k {

    /* renamed from: a */
    public final C8247r f16104a;

    /* renamed from: b */
    public final C9932m f16105b;

    /* renamed from: p.n$a */
    public static final class a implements InterfaceC9298k.a {
        /* renamed from: c */
        private final boolean m15145c(C8247r c8247r) {
            return Intrinsics.areEqual(c8247r.m13277c(), "jar:file");
        }

        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(C8247r c8247r, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            if (m15145c(c8247r)) {
                return new C9301n(c8247r, c9932m);
            }
            return null;
        }
    }

    public C9301n(C8247r c8247r, C9932m c9932m) {
        this.f16104a = c8247r;
        this.f16105b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) {
        String strM13276b = this.f16104a.m13276b();
        if (strM13276b == null) {
            strM13276b = "";
        }
        String str = strM13276b;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '!', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + this.f16104a).toString());
        }
        Path.Companion companion = Path.INSTANCE;
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Path path = Path.Companion.get$default(companion, strSubstring, false, 1, (Object) null);
        String strSubstring2 = str.substring(iIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Path path2 = Path.Companion.get$default(companion, strSubstring2, false, 1, (Object) null);
        return new C9303p(AbstractC9074s.m14555d(path2, Okio.openZip(this.f16105b.m17112g(), path), null, null, null, 28, null), C7819q.f13131a.m12214a(AbstractC7810h.m12193d(path2)), DataSource.f2866c);
    }
}
