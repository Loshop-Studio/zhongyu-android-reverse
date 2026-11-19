package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p118m7.AbstractC6191y0;
import p133o7.AbstractC6279c;
import p133o7.C6277a;
import p133o7.C6278b;
import p133o7.C6280d;
import p133o7.InterfaceC6282f;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;

/* renamed from: kotlinx.serialization.modules.a */
/* loaded from: classes4.dex */
public final class C6045a implements InterfaceC6282f {

    /* renamed from: a */
    public final HashMap f9604a = new HashMap();

    /* renamed from: b */
    public final HashMap f9605b = new HashMap();

    /* renamed from: c */
    public final HashMap f9606c = new HashMap();

    /* renamed from: d */
    public final HashMap f9607d = new HashMap();

    /* renamed from: e */
    public final HashMap f9608e = new HashMap();

    /* renamed from: f */
    public boolean f9609f;

    /* renamed from: a */
    public final C6280d m5730a() {
        return new C6280d(this.f9604a, this.f9605b, this.f9606c, this.f9607d, this.f9608e, this.f9609f);
    }

    /* renamed from: b */
    public final void m5731b(InterfaceC6779c interfaceC6779c, InterfaceC6471c interfaceC6471c, boolean z8) {
        HashMap map = this.f9608e;
        InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) map.get(interfaceC6779c);
        if (interfaceC6471c2 == null || interfaceC6471c2.equals(interfaceC6471c) || z8) {
            map.put(interfaceC6779c, interfaceC6471c);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + interfaceC6779c + " is already registered: " + interfaceC6471c2);
    }

    /* renamed from: c */
    public final void m5732c(InterfaceC6779c interfaceC6779c, InterfaceC6471c interfaceC6471c, boolean z8) {
        HashMap map = this.f9606c;
        InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) map.get(interfaceC6779c);
        if (interfaceC6471c2 == null || interfaceC6471c2.equals(interfaceC6471c) || z8) {
            map.put(interfaceC6779c, interfaceC6471c);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + interfaceC6779c + " is already registered: " + interfaceC6471c2);
    }

    /* renamed from: d */
    public final void m5733d(InterfaceC6779c interfaceC6779c, InterfaceC6779c interfaceC6779c2, InterfaceC5686b interfaceC5686b, boolean z8) {
        Object next;
        InterfaceC6779c interfaceC6779c3;
        String strMo5105h = interfaceC5686b.getDescriptor().mo5105h();
        HashMap map = this.f9605b;
        Object map2 = map.get(interfaceC6779c);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(interfaceC6779c, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = this.f9607d;
        Object map5 = map4.get(interfaceC6779c);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(interfaceC6779c, map5);
        }
        Map map6 = (Map) map5;
        InterfaceC5686b interfaceC5686b2 = (InterfaceC5686b) map3.get(interfaceC6779c2);
        if (interfaceC5686b2 != null && !interfaceC5686b2.equals(interfaceC5686b)) {
            if (!z8) {
                throw new SerializerAlreadyRegisteredException(interfaceC6779c, interfaceC6779c2);
            }
        }
        InterfaceC5686b interfaceC5686b3 = (InterfaceC5686b) map6.get(strMo5105h);
        if (interfaceC5686b3 != null && !interfaceC5686b3.equals(interfaceC5686b)) {
            Iterator it = ((Iterable) AbstractC5805t.m5223c0(map3.entrySet()).f9198b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((Map.Entry) next).getValue() == interfaceC5686b3) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (interfaceC6779c3 = (InterfaceC6779c) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + strMo5105h + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (!z8) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + interfaceC6779c + "' have the same serial name '" + strMo5105h + "': " + interfaceC5686b + " for '" + interfaceC6779c2 + "' and " + interfaceC5686b3 + " for '" + interfaceC6779c3 + '\'');
            }
        }
        map3.put(interfaceC6779c2, interfaceC5686b);
        map6.put(strMo5105h, interfaceC5686b);
    }

    /* renamed from: e */
    public final void m5734e(InterfaceC6779c forClass, AbstractC6279c abstractC6279c, boolean z8) {
        AbstractC6279c abstractC6279c2;
        AbstractC5830k.m5330g(forClass, "forClass");
        HashMap map = this.f9604a;
        if (!z8 && (abstractC6279c2 = (AbstractC6279c) map.get(forClass)) != null && !abstractC6279c2.equals(abstractC6279c)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        map.put(forClass, abstractC6279c);
        if (AbstractC6191y0.m5838h(forClass)) {
            this.f9609f = true;
        }
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: l */
    public final void mo2042l(InterfaceC6779c interfaceC6779c, InterfaceC6471c interfaceC6471c) {
        m5732c(interfaceC6779c, interfaceC6471c, false);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: m */
    public final void mo2043m(InterfaceC6779c interfaceC6779c, InterfaceC6779c interfaceC6779c2, InterfaceC5686b interfaceC5686b) {
        m5733d(interfaceC6779c, interfaceC6779c2, interfaceC5686b, false);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: n */
    public final void mo5735n(InterfaceC6779c interfaceC6779c, InterfaceC5686b serializer) {
        AbstractC5830k.m5330g(serializer, "serializer");
        m5734e(interfaceC6779c, new C6277a(serializer), false);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: o */
    public final void mo2044o(InterfaceC6779c interfaceC6779c, InterfaceC6471c interfaceC6471c) {
        m5731b(interfaceC6779c, interfaceC6471c, false);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: q */
    public final void mo2045q(InterfaceC6779c kClass, InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(kClass, "kClass");
        m5734e(kClass, new C6278b(interfaceC6471c), false);
    }
}
