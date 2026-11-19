package p133o7;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;

/* renamed from: o7.a */
/* loaded from: classes4.dex */
public final class C6277a extends AbstractC6279c {

    /* renamed from: a */
    public final InterfaceC5686b f10031a;

    public C6277a(InterfaceC5686b serializer) {
        AbstractC5830k.m5330g(serializer, "serializer");
        this.f10031a = serializer;
    }

    @Override // p133o7.AbstractC6279c
    /* renamed from: a */
    public final InterfaceC5686b mo5872a(List typeArgumentsSerializers) {
        AbstractC5830k.m5330g(typeArgumentsSerializers, "typeArgumentsSerializers");
        return this.f10031a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6277a) && AbstractC5830k.m5325b(((C6277a) obj).f10031a, this.f10031a);
    }

    public final int hashCode() {
        return this.f10031a.hashCode();
    }
}
