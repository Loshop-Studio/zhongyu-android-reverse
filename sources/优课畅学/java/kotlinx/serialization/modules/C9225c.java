package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.modules.AbstractC9223a;
import p089e8.InterfaceC8375c;
import p134i7.AbstractC8802r0;
import p246s8.InterfaceC10052b;
import p290w8.AbstractC10461w1;
import p300x7.InterfaceC10570l;
import p301x8.AbstractC10583a;
import p301x8.InterfaceC10585c;

/* renamed from: kotlinx.serialization.modules.c */
/* loaded from: classes5.dex */
public final class C9225c implements InterfaceC10585c {

    /* renamed from: a */
    public final Map f18202a = new HashMap();

    /* renamed from: b */
    public final Map f18203b = new HashMap();

    /* renamed from: c */
    public final Map f18204c = new HashMap();

    /* renamed from: d */
    public final Map f18205d = new HashMap();

    /* renamed from: e */
    public final Map f18206e = new HashMap();

    /* renamed from: f */
    public boolean f18207f;

    /* renamed from: k */
    public static /* synthetic */ void m16915k(C9225c c9225c, InterfaceC8375c interfaceC8375c, InterfaceC8375c interfaceC8375c2, InterfaceC10052b interfaceC10052b, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c9225c.m16926j(interfaceC8375c, interfaceC8375c2, interfaceC10052b, z10);
    }

    /* renamed from: m */
    public static /* synthetic */ void m16916m(C9225c c9225c, InterfaceC8375c interfaceC8375c, AbstractC9223a abstractC9223a, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c9225c.m16927l(interfaceC8375c, abstractC9223a, z10);
    }

    @Override // p301x8.InterfaceC10585c
    /* renamed from: a */
    public void mo16917a(InterfaceC8375c kClass, InterfaceC10052b serializer) {
        AbstractC9133u.m16133g(kClass, "kClass");
        AbstractC9133u.m16133g(serializer, "serializer");
        m16916m(this, kClass, new AbstractC9223a.a(serializer), false, 4, null);
    }

    @Override // p301x8.InterfaceC10585c
    /* renamed from: b */
    public void mo16918b(InterfaceC8375c baseClass, InterfaceC10570l defaultSerializerProvider) {
        AbstractC9133u.m16133g(baseClass, "baseClass");
        AbstractC9133u.m16133g(defaultSerializerProvider, "defaultSerializerProvider");
        m16925i(baseClass, defaultSerializerProvider, false);
    }

    @Override // p301x8.InterfaceC10585c
    /* renamed from: c */
    public void mo16919c(InterfaceC8375c kClass, InterfaceC10570l provider) {
        AbstractC9133u.m16133g(kClass, "kClass");
        AbstractC9133u.m16133g(provider, "provider");
        m16916m(this, kClass, new AbstractC9223a.b(provider), false, 4, null);
    }

    @Override // p301x8.InterfaceC10585c
    /* renamed from: d */
    public void mo16920d(InterfaceC8375c baseClass, InterfaceC10570l defaultDeserializerProvider) {
        AbstractC9133u.m16133g(baseClass, "baseClass");
        AbstractC9133u.m16133g(defaultDeserializerProvider, "defaultDeserializerProvider");
        m16924h(baseClass, defaultDeserializerProvider, false);
    }

    @Override // p301x8.InterfaceC10585c
    /* renamed from: e */
    public void mo16921e(InterfaceC8375c baseClass, InterfaceC8375c actualClass, InterfaceC10052b actualSerializer) {
        AbstractC9133u.m16133g(baseClass, "baseClass");
        AbstractC9133u.m16133g(actualClass, "actualClass");
        AbstractC9133u.m16133g(actualSerializer, "actualSerializer");
        m16915k(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    /* renamed from: f */
    public final AbstractC10583a m16922f() {
        return new C9224b(this.f18202a, this.f18203b, this.f18204c, this.f18205d, this.f18206e, this.f18207f);
    }

    /* renamed from: g */
    public final void m16923g(AbstractC10583a module) {
        AbstractC9133u.m16133g(module, "module");
        module.mo16910a(this);
    }

    /* renamed from: h */
    public final void m16924h(InterfaceC8375c baseClass, InterfaceC10570l defaultDeserializerProvider, boolean z10) {
        AbstractC9133u.m16133g(baseClass, "baseClass");
        AbstractC9133u.m16133g(defaultDeserializerProvider, "defaultDeserializerProvider");
        InterfaceC10570l interfaceC10570l = (InterfaceC10570l) this.f18206e.get(baseClass);
        if (interfaceC10570l == null || AbstractC9133u.m16128b(interfaceC10570l, defaultDeserializerProvider) || z10) {
            this.f18206e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + interfaceC10570l);
    }

    /* renamed from: i */
    public final void m16925i(InterfaceC8375c baseClass, InterfaceC10570l defaultSerializerProvider, boolean z10) {
        AbstractC9133u.m16133g(baseClass, "baseClass");
        AbstractC9133u.m16133g(defaultSerializerProvider, "defaultSerializerProvider");
        InterfaceC10570l interfaceC10570l = (InterfaceC10570l) this.f18204c.get(baseClass);
        if (interfaceC10570l == null || AbstractC9133u.m16128b(interfaceC10570l, defaultSerializerProvider) || z10) {
            this.f18204c.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + interfaceC10570l);
    }

    /* renamed from: j */
    public final void m16926j(InterfaceC8375c baseClass, InterfaceC8375c concreteClass, InterfaceC10052b concreteSerializer, boolean z10) {
        Object next;
        AbstractC9133u.m16133g(baseClass, "baseClass");
        AbstractC9133u.m16133g(concreteClass, "concreteClass");
        AbstractC9133u.m16133g(concreteSerializer, "concreteSerializer");
        String strMo19089f = concreteSerializer.getDescriptor().mo19089f();
        Map map = this.f18203b;
        Object map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(baseClass, map2);
        }
        Map map3 = (Map) map2;
        InterfaceC10052b interfaceC10052b = (InterfaceC10052b) map3.get(concreteClass);
        Map map4 = this.f18205d;
        Object map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(baseClass, map5);
        }
        Map map6 = (Map) map5;
        if (z10) {
            if (interfaceC10052b != null) {
                map6.remove(interfaceC10052b.getDescriptor().mo19089f());
            }
            map3.put(concreteClass, concreteSerializer);
            map6.put(strMo19089f, concreteSerializer);
            return;
        }
        if (interfaceC10052b != null) {
            if (!AbstractC9133u.m16128b(interfaceC10052b, concreteSerializer)) {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
        }
        InterfaceC10052b interfaceC10052b2 = (InterfaceC10052b) map6.get(strMo19089f);
        if (interfaceC10052b2 == null) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(strMo19089f, concreteSerializer);
            return;
        }
        Object obj = this.f18203b.get(baseClass);
        AbstractC9133u.m16130d(obj);
        Iterator it = AbstractC8802r0.m14747y((Map) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == interfaceC10052b2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + strMo19089f + "': '" + concreteClass + "' and '" + ((Map.Entry) next) + '\'');
    }

    /* renamed from: l */
    public final void m16927l(InterfaceC8375c forClass, AbstractC9223a provider, boolean z10) {
        AbstractC9223a abstractC9223a;
        AbstractC9133u.m16133g(forClass, "forClass");
        AbstractC9133u.m16133g(provider, "provider");
        if (z10 || (abstractC9223a = (AbstractC9223a) this.f18202a.get(forClass)) == null || AbstractC9133u.m16128b(abstractC9223a, provider)) {
            this.f18202a.put(forClass, provider);
            if (AbstractC10461w1.m19554l(forClass)) {
                this.f18207f = true;
                return;
            }
            return;
        }
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }
}
