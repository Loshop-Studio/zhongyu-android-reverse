package p124p;

import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;
import okio.Path;
import p023c0.AbstractC4464i;
import p023c0.C4473r;
import p087k.C6621t;
import p110n.AbstractC7436s;
import p124p.InterfaceC7582k;
import p187y.C7880m;

/* renamed from: p.n */
/* loaded from: classes3.dex */
public final class C7585n implements InterfaceC7582k {

    /* renamed from: a */
    public final C6621t f10039a;

    /* renamed from: b */
    public final C7880m f10040b;

    /* renamed from: p.n$a */
    public static final class a implements InterfaceC7582k.a {
        /* renamed from: c */
        private final boolean m8986c(C6621t c6621t) {
            return Intrinsics.areEqual(c6621t.m7575c(), "jar:file");
        }

        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(C6621t c6621t, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            if (m8986c(c6621t)) {
                return new C7585n(c6621t, c7880m);
            }
            return null;
        }
    }

    public C7585n(C6621t c6621t, C7880m c7880m) {
        this.f10039a = c6621t;
        this.f10040b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) {
        String strM7574b = this.f10039a.m7574b();
        if (strM7574b == null) {
            strM7574b = "";
        }
        String str = strM7574b;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '!', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + this.f10039a).toString());
        }
        Path.Companion companion = Path.INSTANCE;
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Path path = Path.Companion.get$default(companion, strSubstring, false, 1, (Object) null);
        String strSubstring2 = str.substring(iIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Path path2 = Path.Companion.get$default(companion, strSubstring2, false, 1, (Object) null);
        return new C7587p(AbstractC7436s.m8485d(path2, Okio.openZip(this.f10040b.m9665g(), path), null, null, null, 28, null), C4473r.f1339a.m1565a(AbstractC4464i.m1543d(path2)), DataSource.f1621c);
    }
}
