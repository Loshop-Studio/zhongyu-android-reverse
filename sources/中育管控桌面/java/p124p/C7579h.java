package p124p;

import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p094io.encoding.Base64;
import kotlin.text.StringsKt;
import okio.Buffer;
import p087k.C6621t;
import p110n.AbstractC7436s;
import p124p.InterfaceC7582k;
import p187y.C7880m;

/* renamed from: p.h */
/* loaded from: classes3.dex */
public final class C7579h implements InterfaceC7582k {

    /* renamed from: c */
    public static final a f10029c = new a(null);

    /* renamed from: a */
    public final C6621t f10030a;

    /* renamed from: b */
    public final C7880m f10031b;

    /* renamed from: p.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: p.h$b */
    public static final class b implements InterfaceC7582k.a {
        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(C6621t c6621t, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            if (Intrinsics.areEqual(c6621t.m7575c(), "data")) {
                return new C7579h(c6621t, c7880m);
            }
            return null;
        }
    }

    public C7579h(C6621t c6621t, C7880m c7880m) {
        this.f10030a = c6621t;
        this.f10031b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f10030a.toString(), ";base64,", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.f10030a).toString());
        }
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) this.f10030a.toString(), ':', 0, false, 6, (Object) null);
        if (iIndexOf$default2 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.f10030a).toString());
        }
        String strSubstring = this.f10030a.toString().substring(iIndexOf$default2 + 1, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bArrDecode$default = Base64.decode$default(Base64.INSTANCE, this.f10030a.toString(), iIndexOf$default + 8, 0, 4, (Object) null);
        Buffer buffer = new Buffer();
        buffer.write(bArrDecode$default);
        return new C7587p(AbstractC7436s.m8484c(buffer, this.f10031b.m9665g(), null, 4, null), strSubstring, DataSource.f1620b);
    }
}
