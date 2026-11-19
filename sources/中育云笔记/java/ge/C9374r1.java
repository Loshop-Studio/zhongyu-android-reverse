package ge;

import ee.AbstractC9136m;
import ee.AbstractC9138o;
import ee.C9124a;
import ee.InterfaceC9129f;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.SerializationException;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;

/* renamed from: ge.r1 */
/* loaded from: classes6.dex */
public final class C9374r1 implements InterfaceC5432b {

    /* renamed from: a */
    public final Object f21790a;

    /* renamed from: b */
    public List f21791b;

    /* renamed from: c */
    public final InterfaceC10773d f21792c;

    public C9374r1(final String serialName, Object objectInstance) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(objectInstance, "objectInstance");
        this.f21790a = objectInstance;
        this.f21791b = AbstractC10978w.m24136n();
        this.f21792c = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23257d, new InterfaceC9529a() { // from class: ge.p1
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C9374r1.m18534c(serialName, this);
            }
        });
    }

    /* renamed from: c */
    public static final InterfaceC9129f m18534c(String str, final C9374r1 c9374r1) {
        return AbstractC9136m.m17982h(str, AbstractC9138o.d.f21335a, new InterfaceC9129f[0], new InterfaceC9540l() { // from class: ge.q1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C9374r1.m18535d(this.f21785c, (C9124a) obj);
            }
        });
    }

    /* renamed from: d */
    public static final C10786q m18535d(C9374r1 c9374r1, C9124a buildSerialDescriptor) {
        AbstractC9979u.m20294g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.m17954h(c9374r1.f21791b);
        return C10786q.f26013a;
    }

    @Override // p049ce.InterfaceC5431a
    public Object deserialize(InterfaceC9228e decoder) {
        int iDecodeElementIndex;
        AbstractC9979u.m20294g(decoder, "decoder");
        InterfaceC9129f descriptor = getDescriptor();
        InterfaceC9226c interfaceC9226cBeginStructure = decoder.beginStructure(descriptor);
        if (interfaceC9226cBeginStructure.decodeSequentially() || (iDecodeElementIndex = interfaceC9226cBeginStructure.decodeElementIndex(getDescriptor())) == -1) {
            C10786q c10786q = C10786q.f26013a;
            interfaceC9226cBeginStructure.endStructure(descriptor);
            return this.f21790a;
        }
        throw new SerializationException("Unexpected index " + iDecodeElementIndex);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return (InterfaceC9129f) this.f21792c.getValue();
    }

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, Object value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }
}
