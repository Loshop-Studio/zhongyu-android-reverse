package p290w8;

import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10217m;
import p268u8.AbstractC10219o;
import p268u8.C10205a;
import p268u8.InterfaceC10210f;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* renamed from: w8.g1 */
/* loaded from: classes5.dex */
public final class C10393g1 extends AbstractC10460w0 {

    /* renamed from: c */
    public final InterfaceC10210f f20694c;

    /* renamed from: w8.g1$a */
    public static final class a implements Map.Entry, InterfaceC10668a {

        /* renamed from: a */
        public final Object f20695a;

        /* renamed from: b */
        public final Object f20696b;

        public a(Object obj, Object obj2) {
            this.f20695a = obj;
            this.f20696b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f20695a, aVar.f20695a) && AbstractC9133u.m16128b(this.f20696b, aVar.f20696b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f20695a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f20696b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f20695a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f20696b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f20695a + ", value=" + this.f20696b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10393g1(final InterfaceC10052b keySerializer, final InterfaceC10052b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        AbstractC9133u.m16133g(keySerializer, "keySerializer");
        AbstractC9133u.m16133g(valueSerializer, "valueSerializer");
        this.f20694c = AbstractC10217m.m19110h("kotlin.collections.Map.Entry", AbstractC10219o.c.f20395a, new InterfaceC10210f[0], new InterfaceC10570l() { // from class: w8.f1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C10393g1.m19396g(keySerializer, valueSerializer, (C10205a) obj);
            }
        });
    }

    /* renamed from: g */
    public static final C8736p m19396g(InterfaceC10052b interfaceC10052b, InterfaceC10052b interfaceC10052b2, C10205a buildSerialDescriptor) {
        AbstractC9133u.m16133g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C10205a.m19075b(buildSerialDescriptor, "key", interfaceC10052b.getDescriptor(), null, false, 12, null);
        C10205a.m19075b(buildSerialDescriptor, "value", interfaceC10052b2.getDescriptor(), null, false, 12, null);
        return C8736p.f16368a;
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20694c;
    }

    @Override // p290w8.AbstractC10460w0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo19397a(Map.Entry entry) {
        AbstractC9133u.m16133g(entry, "<this>");
        return entry.getKey();
    }

    @Override // p290w8.AbstractC10460w0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object mo19398c(Map.Entry entry) {
        AbstractC9133u.m16133g(entry, "<this>");
        return entry.getValue();
    }

    @Override // p290w8.AbstractC10460w0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry mo19399e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
