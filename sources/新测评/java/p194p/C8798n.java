package p194p;

import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;
import okio.Path;
import p030c0.AbstractC5084i;
import p030c0.C5093r;
import p137k.C7848t;
import p172n.AbstractC8604s;
import p194p.InterfaceC8795k;
import p290y.C9892k;

/* renamed from: p.n */
/* loaded from: classes3.dex */
public final class C8798n implements InterfaceC8795k {

    /* renamed from: a */
    public final C7848t f14939a;

    /* renamed from: b */
    public final C9892k f14940b;

    /* renamed from: p.n$a */
    public static final class a implements InterfaceC8795k.a {
        /* renamed from: c */
        private final boolean m14694c(C7848t c7848t) {
            return Intrinsics.areEqual(c7848t.m13309c(), "jar:file");
        }

        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(C7848t c7848t, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            if (m14694c(c7848t)) {
                return new C8798n(c7848t, c9892k);
            }
            return null;
        }
    }

    public C8798n(C7848t c7848t, C9892k c9892k) {
        this.f14939a = c7848t;
        this.f14940b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) {
        String strM13308b = this.f14939a.m13308b();
        if (strM13308b == null) {
            strM13308b = "";
        }
        String str = strM13308b;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '!', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + this.f14939a).toString());
        }
        Path.Companion companion = Path.INSTANCE;
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Path path = Path.Companion.get$default(companion, strSubstring, false, 1, (Object) null);
        String strSubstring2 = str.substring(iIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Path path2 = Path.Companion.get$default(companion, strSubstring2, false, 1, (Object) null);
        return new C8800p(AbstractC8604s.m14164d(path2, Okio.openZip(this.f14940b.m16704g(), path), null, null, null, 28, null), C5093r.f2659a.m2707a(AbstractC5084i.m2685d(path2)), DataSource.f2937c);
    }
}
