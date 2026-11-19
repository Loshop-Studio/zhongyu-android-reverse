package p290w8;

import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.SerializationException;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8809v;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10217m;
import p268u8.AbstractC10219o;
import p268u8.C10205a;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: w8.r1 */
/* loaded from: classes5.dex */
public final class C10441r1 implements InterfaceC10052b {

    /* renamed from: a */
    public final Object f20763a;

    /* renamed from: b */
    public List f20764b;

    /* renamed from: c */
    public final InterfaceC8724d f20765c;

    public C10441r1(final String serialName, Object objectInstance) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(objectInstance, "objectInstance");
        this.f20763a = objectInstance;
        this.f20764b = AbstractC8809v.m14771n();
        this.f20765c = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17344b, new InterfaceC10559a() { // from class: w8.p1
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C10441r1.m19508c(serialName, this);
            }
        });
    }

    /* renamed from: c */
    public static final InterfaceC10210f m19508c(String str, final C10441r1 c10441r1) {
        return AbstractC10217m.m19110h(str, AbstractC10219o.d.f20396a, new InterfaceC10210f[0], new InterfaceC10570l() { // from class: w8.q1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C10441r1.m19509d(this.f20758a, (C10205a) obj);
            }
        });
    }

    /* renamed from: d */
    public static final C8736p m19509d(C10441r1 c10441r1, C10205a buildSerialDescriptor) {
        AbstractC9133u.m16133g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.m19082h(c10441r1.f20764b);
        return C8736p.f16368a;
    }

    @Override // p246s8.InterfaceC10051a
    public Object deserialize(InterfaceC10256e decoder) {
        int iDecodeElementIndex;
        AbstractC9133u.m16133g(decoder, "decoder");
        InterfaceC10210f descriptor = getDescriptor();
        InterfaceC10254c interfaceC10254cBeginStructure = decoder.beginStructure(descriptor);
        if (interfaceC10254cBeginStructure.decodeSequentially() || (iDecodeElementIndex = interfaceC10254cBeginStructure.decodeElementIndex(getDescriptor())) == -1) {
            C8736p c8736p = C8736p.f16368a;
            interfaceC10254cBeginStructure.endStructure(descriptor);
            return this.f20763a;
        }
        throw new SerializationException("Unexpected index " + iDecodeElementIndex);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return (InterfaceC10210f) this.f20765c.getValue();
    }

    @Override // p246s8.InterfaceC10059i
    public void serialize(InterfaceC10257f encoder, Object value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }
}
