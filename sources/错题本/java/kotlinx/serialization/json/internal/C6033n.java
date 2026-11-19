package kotlinx.serialization.json.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.navigation.C2857e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5795j0;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import p101k7.AbstractC5762d;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p118m7.AbstractC6191y0;
import p125n7.AbstractC6227b;
import p125n7.AbstractC6235j;
import p125n7.C6246u;
import p129o2.C6268a;

/* renamed from: kotlinx.serialization.json.internal.n */
/* loaded from: classes4.dex */
public class C6033n extends AbstractC6020a {

    /* renamed from: f */
    public final C6246u f9563f;

    /* renamed from: g */
    public final InterfaceC5765g f9564g;

    /* renamed from: h */
    public int f9565h;

    /* renamed from: i */
    public boolean f9566i;

    public /* synthetic */ C6033n(AbstractC6227b abstractC6227b, C6246u c6246u, String str, int i) {
        this(abstractC6227b, c6246u, (i & 4) != 0 ? null : str, (InterfaceC5765g) null);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: b */
    public AbstractC6235j mo5659b(String tag) {
        AbstractC5830k.m5330g(tag, "tag");
        return (AbstractC6235j) AbstractC5785e0.m5148B(mo5674q(), tag);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a, p109l7.InterfaceC6071e
    public final InterfaceC6069c beginStructure(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        InterfaceC5765g interfaceC5765g = this.f9564g;
        if (descriptor != interfaceC5765g) {
            return super.beginStructure(descriptor);
        }
        AbstractC6235j abstractC6235jM5660c = m5660c();
        String strMo5105h = interfaceC5765g.mo5105h();
        if (abstractC6235jM5660c instanceof C6246u) {
            return new C6033n(this.f9541c, (C6246u) abstractC6235jM5660c, this.f9542d, interfaceC5765g);
        }
        throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(C6246u.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jM5660c.getClass()).m5320e() + " as the serialized body of " + strMo5105h + " at element: " + m5676s(), abstractC6235jM5660c.toString(), -1);
    }

    @Override // p109l7.InterfaceC6069c
    public int decodeElementIndex(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        while (this.f9565h < descriptor.mo5101d()) {
            int i = this.f9565h;
            this.f9565h = i + 1;
            String strM5673p = m5673p(descriptor, i);
            int i8 = this.f9565h - 1;
            this.f9566i = false;
            if (!mo5674q().containsKey(strM5673p)) {
                boolean z8 = (this.f9541c.f9966a.f9977c || descriptor.mo5106i(i8) || !descriptor.mo5104g(i8).mo5099b()) ? false : true;
                this.f9566i = z8;
                if (z8) {
                }
            }
            this.f9543e.getClass();
            return i8;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a, p109l7.InterfaceC6071e
    public final boolean decodeNotNullMark() {
        return !this.f9566i && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a, p109l7.InterfaceC6069c
    public void endStructure(InterfaceC5765g descriptor) {
        Set setM5163x;
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC6227b abstractC6227b = this.f9541c;
        if (AbstractC6029j.m5691l(descriptor, abstractC6227b) || (descriptor.getKind() instanceof AbstractC5762d)) {
            return;
        }
        AbstractC6029j.m5694o(descriptor, abstractC6227b);
        if (this.f9543e.f9980f) {
            Set setM5832b = AbstractC6191y0.m5832b(descriptor);
            Map map = (Map) abstractC6227b.f9968c.m5868x(descriptor, AbstractC6029j.f9556a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = EmptySet.INSTANCE;
            }
            setM5163x = AbstractC5795j0.m5163x(setM5832b, setKeySet);
        } else {
            setM5163x = AbstractC6191y0.m5832b(descriptor);
        }
        for (String str : mo5674q().f9993a.keySet()) {
            if (!setM5163x.contains(str) && !AbstractC5830k.m5325b(str, this.f9542d)) {
                StringBuilder sbM100y = AbstractC0037f.m100y("Encountered an unknown key '", str, "' at element: ");
                sbM100y.append(m5676s());
                sbM100y.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbM100y.append((Object) AbstractC6029j.m5693n(mo5674q().toString(), -1));
                throw AbstractC6029j.m5683d(-1, sbM100y.toString());
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: o */
    public String mo5672o(InterfaceC5765g descriptor, int i) {
        Object next;
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC6227b abstractC6227b = this.f9541c;
        AbstractC6029j.m5694o(descriptor, abstractC6227b);
        String strMo5102e = descriptor.mo5102e(i);
        if (this.f9543e.f9980f && !mo5674q().f9993a.keySet().contains(strMo5102e)) {
            AbstractC5830k.m5330g(abstractC6227b, "<this>");
            C6268a c6268a = abstractC6227b.f9968c;
            C2857e c2857e = new C2857e(22, descriptor, abstractC6227b);
            c6268a.getClass();
            C6030k c6030k = AbstractC6029j.f9556a;
            Object objM5868x = c6268a.m5868x(descriptor, c6030k);
            if (objM5868x == null) {
                objM5868x = c2857e.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c6268a.f10022b;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(c6030k, objM5868x);
            }
            Map map = (Map) objM5868x;
            Iterator it = mo5674q().f9993a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strMo5102e;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6020a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C6246u mo5674q() {
        return this.f9563f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6033n(AbstractC6227b json, C6246u value, String str, InterfaceC5765g interfaceC5765g) {
        super(json, str);
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5330g(value, "value");
        this.f9563f = value;
        this.f9564g = interfaceC5765g;
    }
}
