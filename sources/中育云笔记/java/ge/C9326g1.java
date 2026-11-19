package ge;

import ee.AbstractC9136m;
import ee.AbstractC9138o;
import ee.C9124a;
import ee.InterfaceC9129f;
import id.InterfaceC9624a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* renamed from: ge.g1 */
/* loaded from: classes6.dex */
public final class C9326g1 extends AbstractC9393w0 {

    /* renamed from: c */
    public final InterfaceC9129f f21721c;

    /* renamed from: ge.g1$a */
    public static final class a implements Map.Entry, InterfaceC9624a {

        /* renamed from: c */
        public final Object f21722c;

        /* renamed from: d */
        public final Object f21723d;

        public a(Object obj, Object obj2) {
            this.f21722c = obj;
            this.f21723d = obj2;
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
            return AbstractC9979u.m20289b(this.f21722c, aVar.f21722c) && AbstractC9979u.m20289b(this.f21723d, aVar.f21723d);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f21722c;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f21723d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f21722c;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f21723d;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f21722c + ", value=" + this.f21723d + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9326g1(final InterfaceC5432b keySerializer, final InterfaceC5432b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        AbstractC9979u.m20294g(keySerializer, "keySerializer");
        AbstractC9979u.m20294g(valueSerializer, "valueSerializer");
        this.f21721c = AbstractC9136m.m17982h("kotlin.collections.Map.Entry", AbstractC9138o.c.f21334a, new InterfaceC9129f[0], new InterfaceC9540l() { // from class: ge.f1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C9326g1.m18422g(keySerializer, valueSerializer, (C9124a) obj);
            }
        });
    }

    /* renamed from: g */
    public static final C10786q m18422g(InterfaceC5432b interfaceC5432b, InterfaceC5432b interfaceC5432b2, C9124a buildSerialDescriptor) {
        AbstractC9979u.m20294g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C9124a.m17947b(buildSerialDescriptor, "key", interfaceC5432b.getDescriptor(), null, false, 12, null);
        C9124a.m17947b(buildSerialDescriptor, "value", interfaceC5432b2.getDescriptor(), null, false, 12, null);
        return C10786q.f26013a;
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21721c;
    }

    @Override // ge.AbstractC9393w0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo18423a(Map.Entry entry) {
        AbstractC9979u.m20294g(entry, "<this>");
        return entry.getKey();
    }

    @Override // ge.AbstractC9393w0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object mo18424c(Map.Entry entry) {
        AbstractC9979u.m20294g(entry, "<this>");
        return entry.getValue();
    }

    @Override // ge.AbstractC9393w0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry mo18425e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
