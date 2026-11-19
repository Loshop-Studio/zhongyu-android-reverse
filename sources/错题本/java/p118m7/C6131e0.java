package p118m7;

import androidx.collection.AbstractC0584a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.AbstractC5764f;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6072f;
import p200x6.C6754d;

/* renamed from: m7.e0 */
/* loaded from: classes4.dex */
public final class C6131e0 extends AbstractC6116a {

    /* renamed from: a */
    public final InterfaceC5686b f9791a;

    /* renamed from: b */
    public final InterfaceC5686b f9792b;

    /* renamed from: c */
    public final /* synthetic */ int f9793c;

    /* renamed from: d */
    public final C6128d0 f9794d;

    public C6131e0(InterfaceC5686b interfaceC5686b, InterfaceC5686b interfaceC5686b2, byte b6) {
        this.f9791a = interfaceC5686b;
        this.f9792b = interfaceC5686b2;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: a */
    public final Object mo5809a() {
        switch (this.f9793c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: b */
    public final int mo5810b(Object obj) {
        int size;
        switch (this.f9793c) {
            case 0:
                HashMap map = (HashMap) obj;
                AbstractC5830k.m5330g(map, "<this>");
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC5830k.m5330g(linkedHashMap, "<this>");
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: c */
    public final void mo5811c(int i, Object obj) {
        switch (this.f9793c) {
            case 0:
                AbstractC5830k.m5330g((HashMap) obj, "<this>");
                break;
            default:
                AbstractC5830k.m5330g((LinkedHashMap) obj, "<this>");
                break;
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: d */
    public final Iterator mo5812d(Object obj) {
        switch (this.f9793c) {
            case 0:
                Map map = (Map) obj;
                AbstractC5830k.m5330g(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                AbstractC5830k.m5330g(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        switch (this.f9793c) {
            case 0:
                Map map = (Map) obj;
                AbstractC5830k.m5330g(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                AbstractC5830k.m5330g(map2, "<this>");
                return map2.size();
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: g */
    public final void mo5815g(InterfaceC6069c interfaceC6069c, Object obj, int i, int i8) {
        Map builder = (Map) obj;
        AbstractC5830k.m5330g(builder, "builder");
        if (i8 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, i8 * 2), 2);
        int i9 = c6754dM5256J.f11420a;
        int i10 = c6754dM5256J.f11421b;
        int i11 = c6754dM5256J.f11422c;
        if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
            return;
        }
        while (true) {
            m5827k(interfaceC6069c, i + i9, builder, false);
            if (i9 == i10) {
                return;
            } else {
                i9 += i11;
            }
        }
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        switch (this.f9793c) {
        }
        return this.f9794d;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        m5827k(interfaceC6069c, i, (Map) obj, true);
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        switch (this.f9793c) {
            case 0:
                AbstractC5830k.m5330g(null, "<this>");
                return new HashMap((Map) null);
            default:
                AbstractC5830k.m5330g(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: j */
    public final Object mo5818j(Object obj) {
        switch (this.f9793c) {
            case 0:
                HashMap map = (HashMap) obj;
                AbstractC5830k.m5330g(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC5830k.m5330g(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    /* renamed from: k */
    public final void m5827k(InterfaceC6069c interfaceC6069c, int i, Map builder, boolean z8) {
        int iDecodeElementIndex;
        AbstractC5830k.m5330g(builder, "builder");
        Object objDecodeSerializableElement = interfaceC6069c.decodeSerializableElement(getDescriptor(), i, this.f9791a, null);
        if (z8) {
            iDecodeElementIndex = interfaceC6069c.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != i + 1) {
                throw new IllegalArgumentException(AbstractC0584a.m912m(i, iDecodeElementIndex, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            iDecodeElementIndex = i + 1;
        }
        boolean zContainsKey = builder.containsKey(objDecodeSerializableElement);
        InterfaceC5686b interfaceC5686b = this.f9792b;
        builder.put(objDecodeSerializableElement, (!zContainsKey || (interfaceC5686b.getDescriptor().getKind() instanceof AbstractC5764f)) ? interfaceC6069c.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, interfaceC5686b, null) : interfaceC6069c.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, interfaceC5686b, AbstractC5785e0.m5148B(builder, objDecodeSerializableElement)));
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        int iMo5813e = mo5813e(obj);
        InterfaceC5765g descriptor = getDescriptor();
        InterfaceC6070d interfaceC6070dBeginCollection = interfaceC6072f.beginCollection(descriptor, iMo5813e);
        Iterator itMo5812d = mo5812d(obj);
        int i = 0;
        while (itMo5812d.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo5812d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i8 = i + 1;
            interfaceC6070dBeginCollection.encodeSerializableElement(getDescriptor(), i, this.f9791a, key);
            i += 2;
            interfaceC6070dBeginCollection.encodeSerializableElement(getDescriptor(), i8, this.f9792b, value);
        }
        interfaceC6070dBeginCollection.endStructure(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6131e0(InterfaceC5686b kSerializer, InterfaceC5686b vSerializer, int i) {
        this(kSerializer, vSerializer, (byte) 0);
        this.f9793c = i;
        switch (i) {
            case 1:
                AbstractC5830k.m5330g(kSerializer, "kSerializer");
                AbstractC5830k.m5330g(vSerializer, "vSerializer");
                this(kSerializer, vSerializer, (byte) 0);
                InterfaceC5765g keyDesc = kSerializer.getDescriptor();
                InterfaceC5765g valueDesc = vSerializer.getDescriptor();
                AbstractC5830k.m5330g(keyDesc, "keyDesc");
                AbstractC5830k.m5330g(valueDesc, "valueDesc");
                this.f9794d = new C6128d0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                break;
            default:
                AbstractC5830k.m5330g(kSerializer, "kSerializer");
                AbstractC5830k.m5330g(vSerializer, "vSerializer");
                InterfaceC5765g keyDesc2 = kSerializer.getDescriptor();
                InterfaceC5765g valueDesc2 = vSerializer.getDescriptor();
                AbstractC5830k.m5330g(keyDesc2, "keyDesc");
                AbstractC5830k.m5330g(valueDesc2, "valueDesc");
                this.f9794d = new C6128d0("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                break;
        }
    }
}
