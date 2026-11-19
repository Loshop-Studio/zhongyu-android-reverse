package p207p;

import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p161io.encoding.Base64;
import kotlin.text.StringsKt;
import okio.Buffer;
import p151k.C8247r;
import p183n.AbstractC9074s;
import p207p.InterfaceC9298k;
import p297y.C9932m;

/* renamed from: p.h */
/* loaded from: classes3.dex */
public final class C9295h implements InterfaceC9298k {

    /* renamed from: c */
    public static final a f16094c = new a(null);

    /* renamed from: a */
    public final C8247r f16095a;

    /* renamed from: b */
    public final C9932m f16096b;

    /* renamed from: p.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: p.h$b */
    public static final class b implements InterfaceC9298k.a {
        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(C8247r c8247r, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            if (Intrinsics.areEqual(c8247r.m13277c(), "data")) {
                return new C9295h(c8247r, c9932m);
            }
            return null;
        }
    }

    public C9295h(C8247r c8247r, C9932m c9932m) {
        this.f16095a = c8247r;
        this.f16096b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f16095a.toString(), ";base64,", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.f16095a).toString());
        }
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) this.f16095a.toString(), ':', 0, false, 6, (Object) null);
        if (iIndexOf$default2 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.f16095a).toString());
        }
        String strSubstring = this.f16095a.toString().substring(iIndexOf$default2 + 1, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bArrDecode$default = Base64.decode$default(Base64.INSTANCE, this.f16095a.toString(), iIndexOf$default + 8, 0, 4, (Object) null);
        Buffer buffer = new Buffer();
        buffer.write(bArrDecode$default);
        return new C9303p(AbstractC9074s.m14554c(buffer, this.f16096b.m17112g(), null, 4, null), strSubstring, DataSource.f2865b);
    }
}
