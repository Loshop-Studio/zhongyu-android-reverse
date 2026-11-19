package p133o7;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;

/* renamed from: o7.d */
/* loaded from: classes4.dex */
public final class C6280d extends AbstractC6281e {

    /* renamed from: a */
    public final Map f10033a;

    /* renamed from: b */
    public final Map f10034b;

    /* renamed from: c */
    public final Map f10035c;

    /* renamed from: d */
    public final Map f10036d;

    /* renamed from: e */
    public final Map f10037e;

    /* renamed from: f */
    public final boolean f10038f;

    public C6280d(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z8) {
        AbstractC5830k.m5330g(class2ContextualFactory, "class2ContextualFactory");
        AbstractC5830k.m5330g(polyBase2Serializers, "polyBase2Serializers");
        AbstractC5830k.m5330g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC5830k.m5330g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC5830k.m5330g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f10033a = class2ContextualFactory;
        this.f10034b = polyBase2Serializers;
        this.f10035c = polyBase2DefaultSerializerProvider;
        this.f10036d = polyBase2NamedSerializers;
        this.f10037e = polyBase2DefaultDeserializerProvider;
        this.f10038f = z8;
    }

    @Override // p133o7.AbstractC6281e
    /* renamed from: a */
    public final void mo5873a(InterfaceC6282f interfaceC6282f) {
        for (Map.Entry entry : this.f10033a.entrySet()) {
            InterfaceC6779c interfaceC6779c = (InterfaceC6779c) entry.getKey();
            AbstractC6279c abstractC6279c = (AbstractC6279c) entry.getValue();
            if (abstractC6279c instanceof C6277a) {
                AbstractC5830k.m5328e(interfaceC6779c, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC5686b interfaceC5686b = ((C6277a) abstractC6279c).f10031a;
                AbstractC5830k.m5328e(interfaceC5686b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                interfaceC6282f.mo5735n(interfaceC6779c, interfaceC5686b);
            } else {
                if (!(abstractC6279c instanceof C6278b)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC6282f.mo2045q(interfaceC6779c, ((C6278b) abstractC6279c).f10032a);
            }
        }
        for (Map.Entry entry2 : this.f10034b.entrySet()) {
            InterfaceC6779c interfaceC6779c2 = (InterfaceC6779c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC6779c interfaceC6779c3 = (InterfaceC6779c) entry3.getKey();
                InterfaceC5686b interfaceC5686b2 = (InterfaceC5686b) entry3.getValue();
                AbstractC5830k.m5328e(interfaceC6779c2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC5830k.m5328e(interfaceC6779c3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC5830k.m5328e(interfaceC5686b2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                interfaceC6282f.mo2043m(interfaceC6779c2, interfaceC6779c3, interfaceC5686b2);
            }
        }
        for (Map.Entry entry4 : this.f10035c.entrySet()) {
            InterfaceC6779c interfaceC6779c4 = (InterfaceC6779c) entry4.getKey();
            InterfaceC6471c interfaceC6471c = (InterfaceC6471c) entry4.getValue();
            AbstractC5830k.m5328e(interfaceC6779c4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC5830k.m5328e(interfaceC6471c, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            AbstractC5835p.m5354c(1, interfaceC6471c);
            interfaceC6282f.mo2042l(interfaceC6779c4, interfaceC6471c);
        }
        for (Map.Entry entry5 : this.f10037e.entrySet()) {
            InterfaceC6779c interfaceC6779c5 = (InterfaceC6779c) entry5.getKey();
            InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) entry5.getValue();
            AbstractC5830k.m5328e(interfaceC6779c5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC5830k.m5328e(interfaceC6471c2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            AbstractC5835p.m5354c(1, interfaceC6471c2);
            interfaceC6282f.mo2044o(interfaceC6779c5, interfaceC6471c2);
        }
    }

    @Override // p133o7.AbstractC6281e
    /* renamed from: b */
    public final InterfaceC5686b mo5874b(InterfaceC6779c interfaceC6779c, List typeArgumentsSerializers) {
        AbstractC5830k.m5330g(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC6279c abstractC6279c = (AbstractC6279c) this.f10033a.get(interfaceC6779c);
        InterfaceC5686b interfaceC5686bMo5872a = abstractC6279c != null ? abstractC6279c.mo5872a(typeArgumentsSerializers) : null;
        if (interfaceC5686bMo5872a instanceof InterfaceC5686b) {
            return interfaceC5686bMo5872a;
        }
        return null;
    }
}
