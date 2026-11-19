package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.AbstractC5830k;
import p101k7.InterfaceC5765g;
import p125n7.AbstractC6227b;
import p125n7.AbstractC6235j;

/* renamed from: kotlinx.serialization.json.internal.m */
/* loaded from: classes4.dex */
public final class C6032m extends AbstractC6020a {

    /* renamed from: f */
    public final AbstractC6235j f9562f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6032m(AbstractC6227b json, AbstractC6235j value, String str) {
        super(json, str);
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5330g(value, "value");
        this.f9562f = value;
        this.f9539a.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: b */
    public final AbstractC6235j mo5659b(String tag) {
        AbstractC5830k.m5330g(tag, "tag");
        if (tag == "primitive") {
            return this.f9562f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // p109l7.InterfaceC6069c
    public final int decodeElementIndex(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: q */
    public final AbstractC6235j mo5674q() {
        return this.f9562f;
    }
}
