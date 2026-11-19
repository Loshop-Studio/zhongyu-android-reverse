package p194p;

import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p148io.encoding.Base64;
import kotlin.text.StringsKt;
import okio.Buffer;
import p137k.C7848t;
import p172n.AbstractC8604s;
import p194p.InterfaceC8795k;
import p290y.C9892k;

/* renamed from: p.h */
/* loaded from: classes3.dex */
public final class C8792h implements InterfaceC8795k {

    /* renamed from: c */
    public static final a f14929c = new a(null);

    /* renamed from: a */
    public final C7848t f14930a;

    /* renamed from: b */
    public final C9892k f14931b;

    /* renamed from: p.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: p.h$b */
    public static final class b implements InterfaceC8795k.a {
        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(C7848t c7848t, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            if (Intrinsics.areEqual(c7848t.m13309c(), "data")) {
                return new C8792h(c7848t, c9892k);
            }
            return null;
        }
    }

    public C8792h(C7848t c7848t, C9892k c9892k) {
        this.f14930a = c7848t;
        this.f14931b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f14930a.toString(), ";base64,", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.f14930a).toString());
        }
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) this.f14930a.toString(), ':', 0, false, 6, (Object) null);
        if (iIndexOf$default2 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.f14930a).toString());
        }
        String strSubstring = this.f14930a.toString().substring(iIndexOf$default2 + 1, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bArrDecode$default = Base64.decode$default(Base64.INSTANCE, this.f14930a.toString(), iIndexOf$default + 8, 0, 4, (Object) null);
        Buffer buffer = new Buffer();
        buffer.write(bArrDecode$default);
        return new C8800p(AbstractC8604s.m14163c(buffer, this.f14931b.m16704g(), null, 4, null), strSubstring, DataSource.f2936b);
    }
}
