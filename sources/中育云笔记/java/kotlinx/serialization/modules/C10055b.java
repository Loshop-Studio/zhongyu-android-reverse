package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.serialization.modules.AbstractC10054a;
import p049ce.InterfaceC5431a;
import p049ce.InterfaceC5432b;
import p049ce.InterfaceC5439i;
import p181hd.InterfaceC9540l;
import p182he.AbstractC9553a;
import p182he.InterfaceC9555c;
import p280od.InterfaceC10469c;

/* renamed from: kotlinx.serialization.modules.b */
/* loaded from: classes6.dex */
public final class C10055b extends AbstractC9553a {

    /* renamed from: a */
    public final Map f24061a;

    /* renamed from: b */
    public final Map f24062b;

    /* renamed from: c */
    public final Map f24063c;

    /* renamed from: d */
    public final Map f24064d;

    /* renamed from: e */
    public final Map f24065e;

    /* renamed from: f */
    public final boolean f24066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10055b(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        AbstractC9979u.m20294g(class2ContextualFactory, "class2ContextualFactory");
        AbstractC9979u.m20294g(polyBase2Serializers, "polyBase2Serializers");
        AbstractC9979u.m20294g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC9979u.m20294g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC9979u.m20294g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f24061a = class2ContextualFactory;
        this.f24062b = polyBase2Serializers;
        this.f24063c = polyBase2DefaultSerializerProvider;
        this.f24064d = polyBase2NamedSerializers;
        this.f24065e = polyBase2DefaultDeserializerProvider;
        this.f24066f = z10;
    }

    @Override // p182he.AbstractC9553a
    /* renamed from: a */
    public void mo18777a(InterfaceC9555c collector) {
        AbstractC9979u.m20294g(collector, "collector");
        for (Map.Entry entry : this.f24061a.entrySet()) {
            InterfaceC10469c interfaceC10469c = (InterfaceC10469c) entry.getKey();
            AbstractC10054a abstractC10054a = (AbstractC10054a) entry.getValue();
            if (abstractC10054a instanceof AbstractC10054a.a) {
                AbstractC9979u.m20292e(interfaceC10469c, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC5432b interfaceC5432bM21041b = ((AbstractC10054a.a) abstractC10054a).m21041b();
                AbstractC9979u.m20292e(interfaceC5432bM21041b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.mo18786d(interfaceC10469c, interfaceC5432bM21041b);
            } else {
                if (!(abstractC10054a instanceof AbstractC10054a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.mo18787e(interfaceC10469c, ((AbstractC10054a.b) abstractC10054a).m21042b());
            }
        }
        for (Map.Entry entry2 : this.f24062b.entrySet()) {
            InterfaceC10469c interfaceC10469c2 = (InterfaceC10469c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC10469c interfaceC10469c3 = (InterfaceC10469c) entry3.getKey();
                InterfaceC5432b interfaceC5432b = (InterfaceC5432b) entry3.getValue();
                AbstractC9979u.m20292e(interfaceC10469c2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC9979u.m20292e(interfaceC10469c3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC9979u.m20292e(interfaceC5432b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.mo18783a(interfaceC10469c2, interfaceC10469c3, interfaceC5432b);
            }
        }
        for (Map.Entry entry4 : this.f24063c.entrySet()) {
            InterfaceC10469c interfaceC10469c4 = (InterfaceC10469c) entry4.getKey();
            InterfaceC9540l interfaceC9540l = (InterfaceC9540l) entry4.getValue();
            AbstractC9979u.m20292e(interfaceC10469c4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC9979u.m20292e(interfaceC9540l, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.mo18784b(interfaceC10469c4, (InterfaceC9540l) AbstractC9962d0.m20254e(interfaceC9540l, 1));
        }
        for (Map.Entry entry5 : this.f24065e.entrySet()) {
            InterfaceC10469c interfaceC10469c5 = (InterfaceC10469c) entry5.getKey();
            InterfaceC9540l interfaceC9540l2 = (InterfaceC9540l) entry5.getValue();
            AbstractC9979u.m20292e(interfaceC10469c5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC9979u.m20292e(interfaceC9540l2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.mo18785c(interfaceC10469c5, (InterfaceC9540l) AbstractC9962d0.m20254e(interfaceC9540l2, 1));
        }
    }

    @Override // p182he.AbstractC9553a
    /* renamed from: b */
    public InterfaceC5432b mo18778b(InterfaceC10469c kClass, List typeArgumentsSerializers) {
        AbstractC9979u.m20294g(kClass, "kClass");
        AbstractC9979u.m20294g(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC10054a abstractC10054a = (AbstractC10054a) this.f24061a.get(kClass);
        InterfaceC5432b interfaceC5432bMo21040a = abstractC10054a != null ? abstractC10054a.mo21040a(typeArgumentsSerializers) : null;
        if (interfaceC5432bMo21040a instanceof InterfaceC5432b) {
            return interfaceC5432bMo21040a;
        }
        return null;
    }

    @Override // p182he.AbstractC9553a
    /* renamed from: d */
    public boolean mo18779d() {
        return this.f24066f;
    }

    @Override // p182he.AbstractC9553a
    /* renamed from: e */
    public InterfaceC5431a mo18780e(InterfaceC10469c baseClass, String str) {
        AbstractC9979u.m20294g(baseClass, "baseClass");
        Map map = (Map) this.f24064d.get(baseClass);
        InterfaceC5432b interfaceC5432b = map != null ? (InterfaceC5432b) map.get(str) : null;
        if (!(interfaceC5432b instanceof InterfaceC5432b)) {
            interfaceC5432b = null;
        }
        if (interfaceC5432b != null) {
            return interfaceC5432b;
        }
        Object obj = this.f24065e.get(baseClass);
        InterfaceC9540l interfaceC9540l = AbstractC9962d0.m20260k(obj, 1) ? (InterfaceC9540l) obj : null;
        if (interfaceC9540l != null) {
            return (InterfaceC5431a) interfaceC9540l.invoke(str);
        }
        return null;
    }

    @Override // p182he.AbstractC9553a
    /* renamed from: f */
    public InterfaceC5439i mo18781f(InterfaceC10469c baseClass, Object value) {
        AbstractC9979u.m20294g(baseClass, "baseClass");
        AbstractC9979u.m20294g(value, "value");
        if (!baseClass.mo20275d(value)) {
            return null;
        }
        Map map = (Map) this.f24062b.get(baseClass);
        InterfaceC5432b interfaceC5432b = map != null ? (InterfaceC5432b) map.get(AbstractC9983y.m20315b(value.getClass())) : null;
        InterfaceC5432b interfaceC5432b2 = interfaceC5432b instanceof InterfaceC5439i ? interfaceC5432b : null;
        if (interfaceC5432b2 != null) {
            return interfaceC5432b2;
        }
        Object obj = this.f24063c.get(baseClass);
        InterfaceC9540l interfaceC9540l = AbstractC9962d0.m20260k(obj, 1) ? (InterfaceC9540l) obj : null;
        if (interfaceC9540l != null) {
            return (InterfaceC5439i) interfaceC9540l.invoke(value);
        }
        return null;
    }
}
