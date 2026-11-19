package kotlinx.serialization.modules;

import ge.AbstractC9394w1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.modules.AbstractC10054a;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9540l;
import p182he.AbstractC9553a;
import p182he.InterfaceC9555c;
import p280od.InterfaceC10469c;
import p325rc.AbstractC10971s0;

/* renamed from: kotlinx.serialization.modules.c */
/* loaded from: classes6.dex */
public final class C10056c implements InterfaceC9555c {

    /* renamed from: a */
    public final Map f24067a = new HashMap();

    /* renamed from: b */
    public final Map f24068b = new HashMap();

    /* renamed from: c */
    public final Map f24069c = new HashMap();

    /* renamed from: d */
    public final Map f24070d = new HashMap();

    /* renamed from: e */
    public final Map f24071e = new HashMap();

    /* renamed from: f */
    public boolean f24072f;

    /* renamed from: k */
    public static /* synthetic */ void m21043k(C10056c c10056c, InterfaceC10469c interfaceC10469c, InterfaceC10469c interfaceC10469c2, InterfaceC5432b interfaceC5432b, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c10056c.m21049j(interfaceC10469c, interfaceC10469c2, interfaceC5432b, z10);
    }

    /* renamed from: m */
    public static /* synthetic */ void m21044m(C10056c c10056c, InterfaceC10469c interfaceC10469c, AbstractC10054a abstractC10054a, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c10056c.m21050l(interfaceC10469c, abstractC10054a, z10);
    }

    @Override // p182he.InterfaceC9555c
    /* renamed from: a */
    public void mo18783a(InterfaceC10469c baseClass, InterfaceC10469c actualClass, InterfaceC5432b actualSerializer) {
        AbstractC9979u.m20294g(baseClass, "baseClass");
        AbstractC9979u.m20294g(actualClass, "actualClass");
        AbstractC9979u.m20294g(actualSerializer, "actualSerializer");
        m21043k(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // p182he.InterfaceC9555c
    /* renamed from: b */
    public void mo18784b(InterfaceC10469c baseClass, InterfaceC9540l defaultSerializerProvider) {
        AbstractC9979u.m20294g(baseClass, "baseClass");
        AbstractC9979u.m20294g(defaultSerializerProvider, "defaultSerializerProvider");
        m21048i(baseClass, defaultSerializerProvider, false);
    }

    @Override // p182he.InterfaceC9555c
    /* renamed from: c */
    public void mo18785c(InterfaceC10469c baseClass, InterfaceC9540l defaultDeserializerProvider) {
        AbstractC9979u.m20294g(baseClass, "baseClass");
        AbstractC9979u.m20294g(defaultDeserializerProvider, "defaultDeserializerProvider");
        m21047h(baseClass, defaultDeserializerProvider, false);
    }

    @Override // p182he.InterfaceC9555c
    /* renamed from: d */
    public void mo18786d(InterfaceC10469c kClass, InterfaceC5432b serializer) {
        AbstractC9979u.m20294g(kClass, "kClass");
        AbstractC9979u.m20294g(serializer, "serializer");
        m21044m(this, kClass, new AbstractC10054a.a(serializer), false, 4, null);
    }

    @Override // p182he.InterfaceC9555c
    /* renamed from: e */
    public void mo18787e(InterfaceC10469c kClass, InterfaceC9540l provider) {
        AbstractC9979u.m20294g(kClass, "kClass");
        AbstractC9979u.m20294g(provider, "provider");
        m21044m(this, kClass, new AbstractC10054a.b(provider), false, 4, null);
    }

    /* renamed from: f */
    public final AbstractC9553a m21045f() {
        return new C10055b(this.f24067a, this.f24068b, this.f24069c, this.f24070d, this.f24071e, this.f24072f);
    }

    /* renamed from: g */
    public final void m21046g(AbstractC9553a module) {
        AbstractC9979u.m20294g(module, "module");
        module.mo18777a(this);
    }

    /* renamed from: h */
    public final void m21047h(InterfaceC10469c baseClass, InterfaceC9540l defaultDeserializerProvider, boolean z10) {
        AbstractC9979u.m20294g(baseClass, "baseClass");
        AbstractC9979u.m20294g(defaultDeserializerProvider, "defaultDeserializerProvider");
        InterfaceC9540l interfaceC9540l = (InterfaceC9540l) this.f24071e.get(baseClass);
        if (interfaceC9540l == null || AbstractC9979u.m20289b(interfaceC9540l, defaultDeserializerProvider) || z10) {
            this.f24071e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + interfaceC9540l);
    }

    /* renamed from: i */
    public final void m21048i(InterfaceC10469c baseClass, InterfaceC9540l defaultSerializerProvider, boolean z10) {
        AbstractC9979u.m20294g(baseClass, "baseClass");
        AbstractC9979u.m20294g(defaultSerializerProvider, "defaultSerializerProvider");
        InterfaceC9540l interfaceC9540l = (InterfaceC9540l) this.f24069c.get(baseClass);
        if (interfaceC9540l == null || AbstractC9979u.m20289b(interfaceC9540l, defaultSerializerProvider) || z10) {
            this.f24069c.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + interfaceC9540l);
    }

    /* renamed from: j */
    public final void m21049j(InterfaceC10469c baseClass, InterfaceC10469c concreteClass, InterfaceC5432b concreteSerializer, boolean z10) {
        Object next;
        AbstractC9979u.m20294g(baseClass, "baseClass");
        AbstractC9979u.m20294g(concreteClass, "concreteClass");
        AbstractC9979u.m20294g(concreteSerializer, "concreteSerializer");
        String strMo17961f = concreteSerializer.getDescriptor().mo17961f();
        Map map = this.f24068b;
        Object map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(baseClass, map2);
        }
        Map map3 = (Map) map2;
        InterfaceC5432b interfaceC5432b = (InterfaceC5432b) map3.get(concreteClass);
        Map map4 = this.f24070d;
        Object map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(baseClass, map5);
        }
        Map map6 = (Map) map5;
        if (z10) {
            if (interfaceC5432b != null) {
                map6.remove(interfaceC5432b.getDescriptor().mo17961f());
            }
            map3.put(concreteClass, concreteSerializer);
            map6.put(strMo17961f, concreteSerializer);
            return;
        }
        if (interfaceC5432b != null) {
            if (!AbstractC9979u.m20289b(interfaceC5432b, concreteSerializer)) {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
        }
        InterfaceC5432b interfaceC5432b2 = (InterfaceC5432b) map6.get(strMo17961f);
        if (interfaceC5432b2 == null) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(strMo17961f, concreteSerializer);
            return;
        }
        Object obj = this.f24068b.get(baseClass);
        AbstractC9979u.m20291d(obj);
        Iterator it = AbstractC10971s0.m24119y((Map) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == interfaceC5432b2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + strMo17961f + "': '" + concreteClass + "' and '" + ((Map.Entry) next) + '\'');
    }

    /* renamed from: l */
    public final void m21050l(InterfaceC10469c forClass, AbstractC10054a provider, boolean z10) {
        AbstractC10054a abstractC10054a;
        AbstractC9979u.m20294g(forClass, "forClass");
        AbstractC9979u.m20294g(provider, "provider");
        if (z10 || (abstractC10054a = (AbstractC10054a) this.f24067a.get(forClass)) == null || AbstractC9979u.m20289b(abstractC10054a, provider)) {
            this.f24067a.put(forClass, provider);
            if (AbstractC9394w1.m18582l(forClass)) {
                this.f24072f = true;
                return;
            }
            return;
        }
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }
}
