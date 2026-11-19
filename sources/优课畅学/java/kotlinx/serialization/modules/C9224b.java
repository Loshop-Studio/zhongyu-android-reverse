package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlinx.serialization.modules.AbstractC9223a;
import p089e8.InterfaceC8375c;
import p246s8.InterfaceC10051a;
import p246s8.InterfaceC10052b;
import p246s8.InterfaceC10059i;
import p300x7.InterfaceC10570l;
import p301x8.AbstractC10583a;
import p301x8.InterfaceC10585c;

/* renamed from: kotlinx.serialization.modules.b */
/* loaded from: classes5.dex */
public final class C9224b extends AbstractC10583a {

    /* renamed from: a */
    public final Map f18196a;

    /* renamed from: b */
    public final Map f18197b;

    /* renamed from: c */
    public final Map f18198c;

    /* renamed from: d */
    public final Map f18199d;

    /* renamed from: e */
    public final Map f18200e;

    /* renamed from: f */
    public final boolean f18201f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9224b(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        AbstractC9133u.m16133g(class2ContextualFactory, "class2ContextualFactory");
        AbstractC9133u.m16133g(polyBase2Serializers, "polyBase2Serializers");
        AbstractC9133u.m16133g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC9133u.m16133g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC9133u.m16133g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f18196a = class2ContextualFactory;
        this.f18197b = polyBase2Serializers;
        this.f18198c = polyBase2DefaultSerializerProvider;
        this.f18199d = polyBase2NamedSerializers;
        this.f18200e = polyBase2DefaultDeserializerProvider;
        this.f18201f = z10;
    }

    @Override // p301x8.AbstractC10583a
    /* renamed from: a */
    public void mo16910a(InterfaceC10585c collector) {
        AbstractC9133u.m16133g(collector, "collector");
        for (Map.Entry entry : this.f18196a.entrySet()) {
            InterfaceC8375c interfaceC8375c = (InterfaceC8375c) entry.getKey();
            AbstractC9223a abstractC9223a = (AbstractC9223a) entry.getValue();
            if (abstractC9223a instanceof AbstractC9223a.a) {
                AbstractC9133u.m16131e(interfaceC8375c, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC10052b interfaceC10052bM16908b = ((AbstractC9223a.a) abstractC9223a).m16908b();
                AbstractC9133u.m16131e(interfaceC10052bM16908b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.mo16917a(interfaceC8375c, interfaceC10052bM16908b);
            } else {
                if (!(abstractC9223a instanceof AbstractC9223a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.mo16919c(interfaceC8375c, ((AbstractC9223a.b) abstractC9223a).m16909b());
            }
        }
        for (Map.Entry entry2 : this.f18197b.entrySet()) {
            InterfaceC8375c interfaceC8375c2 = (InterfaceC8375c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC8375c interfaceC8375c3 = (InterfaceC8375c) entry3.getKey();
                InterfaceC10052b interfaceC10052b = (InterfaceC10052b) entry3.getValue();
                AbstractC9133u.m16131e(interfaceC8375c2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC9133u.m16131e(interfaceC8375c3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC9133u.m16131e(interfaceC10052b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.mo16921e(interfaceC8375c2, interfaceC8375c3, interfaceC10052b);
            }
        }
        for (Map.Entry entry4 : this.f18198c.entrySet()) {
            InterfaceC8375c interfaceC8375c4 = (InterfaceC8375c) entry4.getKey();
            InterfaceC10570l interfaceC10570l = (InterfaceC10570l) entry4.getValue();
            AbstractC9133u.m16131e(interfaceC8375c4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC9133u.m16131e(interfaceC10570l, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.mo16918b(interfaceC8375c4, (InterfaceC10570l) AbstractC9116d0.m16096e(interfaceC10570l, 1));
        }
        for (Map.Entry entry5 : this.f18200e.entrySet()) {
            InterfaceC8375c interfaceC8375c5 = (InterfaceC8375c) entry5.getKey();
            InterfaceC10570l interfaceC10570l2 = (InterfaceC10570l) entry5.getValue();
            AbstractC9133u.m16131e(interfaceC8375c5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC9133u.m16131e(interfaceC10570l2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.mo16920d(interfaceC8375c5, (InterfaceC10570l) AbstractC9116d0.m16096e(interfaceC10570l2, 1));
        }
    }

    @Override // p301x8.AbstractC10583a
    /* renamed from: b */
    public InterfaceC10052b mo16911b(InterfaceC8375c kClass, List typeArgumentsSerializers) {
        AbstractC9133u.m16133g(kClass, "kClass");
        AbstractC9133u.m16133g(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC9223a abstractC9223a = (AbstractC9223a) this.f18196a.get(kClass);
        InterfaceC10052b interfaceC10052bMo16907a = abstractC9223a != null ? abstractC9223a.mo16907a(typeArgumentsSerializers) : null;
        if (interfaceC10052bMo16907a instanceof InterfaceC10052b) {
            return interfaceC10052bMo16907a;
        }
        return null;
    }

    @Override // p301x8.AbstractC10583a
    /* renamed from: d */
    public boolean mo16912d() {
        return this.f18201f;
    }

    @Override // p301x8.AbstractC10583a
    /* renamed from: e */
    public InterfaceC10051a mo16913e(InterfaceC8375c baseClass, String str) {
        AbstractC9133u.m16133g(baseClass, "baseClass");
        Map map = (Map) this.f18199d.get(baseClass);
        InterfaceC10052b interfaceC10052b = map != null ? (InterfaceC10052b) map.get(str) : null;
        if (!(interfaceC10052b instanceof InterfaceC10052b)) {
            interfaceC10052b = null;
        }
        if (interfaceC10052b != null) {
            return interfaceC10052b;
        }
        Object obj = this.f18200e.get(baseClass);
        InterfaceC10570l interfaceC10570l = AbstractC9116d0.m16102k(obj, 1) ? (InterfaceC10570l) obj : null;
        if (interfaceC10570l != null) {
            return (InterfaceC10051a) interfaceC10570l.invoke(str);
        }
        return null;
    }

    @Override // p301x8.AbstractC10583a
    /* renamed from: f */
    public InterfaceC10059i mo16914f(InterfaceC8375c baseClass, Object value) {
        AbstractC9133u.m16133g(baseClass, "baseClass");
        AbstractC9133u.m16133g(value, "value");
        if (!baseClass.mo13670c(value)) {
            return null;
        }
        Map map = (Map) this.f18197b.get(baseClass);
        InterfaceC10052b interfaceC10052b = map != null ? (InterfaceC10052b) map.get(AbstractC9137y.m16154b(value.getClass())) : null;
        InterfaceC10052b interfaceC10052b2 = interfaceC10052b instanceof InterfaceC10059i ? interfaceC10052b : null;
        if (interfaceC10052b2 != null) {
            return interfaceC10052b2;
        }
        Object obj = this.f18198c.get(baseClass);
        InterfaceC10570l interfaceC10570l = AbstractC9116d0.m16102k(obj, 1) ? (InterfaceC10570l) obj : null;
        if (interfaceC10570l != null) {
            return (InterfaceC10059i) interfaceC10570l.invoke(value);
        }
        return null;
    }
}
