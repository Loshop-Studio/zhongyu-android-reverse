package p120s1;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p080j3.InterfaceC3807b;
import p080j3.InterfaceC3809c;
import p080j3.InterfaceC3821i;

/* renamed from: s1.b */
/* loaded from: classes2.dex */
public final class C4546b implements InterfaceC3809c {

    /* renamed from: a */
    public final Type f5695a;

    /* renamed from: b */
    public final InterfaceC3821i f5696b;

    public C4546b(Type successType, InterfaceC3821i errorBodyConverter) {
        Intrinsics.checkNotNullParameter(successType, "successType");
        Intrinsics.checkNotNullParameter(errorBodyConverter, "errorBodyConverter");
        this.f5695a = successType;
        this.f5696b = errorBodyConverter;
    }

    @Override // p080j3.InterfaceC3809c
    /* renamed from: b */
    public Type mo4999b() {
        return this.f5695a;
    }

    @Override // p080j3.InterfaceC3809c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC3807b mo4998a(InterfaceC3807b call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new C4548d(call, this.f5696b);
    }
}
