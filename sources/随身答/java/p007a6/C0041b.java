package p007a6;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p038c9.InterfaceC5274b;
import p038c9.InterfaceC5276c;
import p038c9.InterfaceC5280f;

/* renamed from: a6.b */
/* loaded from: classes4.dex */
public final class C0041b implements InterfaceC5276c {

    /* renamed from: a */
    public final Type f134a;

    /* renamed from: b */
    public final InterfaceC5280f f135b;

    public C0041b(Type successType, InterfaceC5280f errorBodyConverter) {
        Intrinsics.checkNotNullParameter(successType, "successType");
        Intrinsics.checkNotNullParameter(errorBodyConverter, "errorBodyConverter");
        this.f134a = successType;
        this.f135b = errorBodyConverter;
    }

    @Override // p038c9.InterfaceC5276c
    /* renamed from: a */
    public Type mo228a() {
        return this.f134a;
    }

    @Override // p038c9.InterfaceC5276c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5274b mo229b(InterfaceC5274b call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new C0043d(call, this.f135b);
    }
}
