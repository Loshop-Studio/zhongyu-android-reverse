package ge;

import ee.AbstractC9136m;
import ee.C9124a;
import ee.InterfaceC9129f;
import kotlin.Triple;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.SerializationException;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* renamed from: ge.u2 */
/* loaded from: classes6.dex */
public final class C9387u2 implements InterfaceC5432b {

    /* renamed from: a */
    public final InterfaceC5432b f21813a;

    /* renamed from: b */
    public final InterfaceC5432b f21814b;

    /* renamed from: c */
    public final InterfaceC5432b f21815c;

    /* renamed from: d */
    public final InterfaceC9129f f21816d;

    public C9387u2(InterfaceC5432b aSerializer, InterfaceC5432b bSerializer, InterfaceC5432b cSerializer) {
        AbstractC9979u.m20294g(aSerializer, "aSerializer");
        AbstractC9979u.m20294g(bSerializer, "bSerializer");
        AbstractC9979u.m20294g(cSerializer, "cSerializer");
        this.f21813a = aSerializer;
        this.f21814b = bSerializer;
        this.f21815c = cSerializer;
        this.f21816d = AbstractC9136m.m17979e("kotlin.Triple", new InterfaceC9129f[0], new InterfaceC9540l() { // from class: ge.t2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C9387u2.m18559d(this.f21807c, (C9124a) obj);
            }
        });
    }

    /* renamed from: d */
    public static final C10786q m18559d(C9387u2 c9387u2, C9124a buildClassSerialDescriptor) {
        AbstractC9979u.m20294g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C9124a.m17947b(buildClassSerialDescriptor, "first", c9387u2.f21813a.getDescriptor(), null, false, 12, null);
        C9124a.m17947b(buildClassSerialDescriptor, "second", c9387u2.f21814b.getDescriptor(), null, false, 12, null);
        C9124a.m17947b(buildClassSerialDescriptor, "third", c9387u2.f21815c.getDescriptor(), null, false, 12, null);
        return C10786q.f26013a;
    }

    /* renamed from: b */
    public final Triple m18560b(InterfaceC9226c interfaceC9226c) {
        Object objM18145c = InterfaceC9226c.a.m18145c(interfaceC9226c, getDescriptor(), 0, this.f21813a, null, 8, null);
        Object objM18145c2 = InterfaceC9226c.a.m18145c(interfaceC9226c, getDescriptor(), 1, this.f21814b, null, 8, null);
        Object objM18145c3 = InterfaceC9226c.a.m18145c(interfaceC9226c, getDescriptor(), 2, this.f21815c, null, 8, null);
        interfaceC9226c.endStructure(getDescriptor());
        return new Triple(objM18145c, objM18145c2, objM18145c3);
    }

    /* renamed from: c */
    public final Triple m18561c(InterfaceC9226c interfaceC9226c) {
        InterfaceC9226c interfaceC9226c2;
        Object objM18145c = AbstractC9391v2.f21818a;
        Object objM18145c2 = AbstractC9391v2.f21818a;
        Object objM18145c3 = AbstractC9391v2.f21818a;
        while (true) {
            int iDecodeElementIndex = interfaceC9226c.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex == -1) {
                interfaceC9226c.endStructure(getDescriptor());
                if (objM18145c == AbstractC9391v2.f21818a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objM18145c2 == AbstractC9391v2.f21818a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objM18145c3 != AbstractC9391v2.f21818a) {
                    return new Triple(objM18145c, objM18145c2, objM18145c3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iDecodeElementIndex == 0) {
                interfaceC9226c2 = interfaceC9226c;
                objM18145c = InterfaceC9226c.a.m18145c(interfaceC9226c2, getDescriptor(), 0, this.f21813a, null, 8, null);
            } else if (iDecodeElementIndex == 1) {
                interfaceC9226c2 = interfaceC9226c;
                objM18145c2 = InterfaceC9226c.a.m18145c(interfaceC9226c2, getDescriptor(), 1, this.f21814b, null, 8, null);
            } else {
                if (iDecodeElementIndex != 2) {
                    throw new SerializationException("Unexpected index " + iDecodeElementIndex);
                }
                objM18145c3 = InterfaceC9226c.a.m18145c(interfaceC9226c, getDescriptor(), 2, this.f21815c, null, 8, null);
            }
            interfaceC9226c = interfaceC9226c2;
        }
    }

    @Override // p049ce.InterfaceC5431a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Triple deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        InterfaceC9226c interfaceC9226cBeginStructure = decoder.beginStructure(getDescriptor());
        return interfaceC9226cBeginStructure.decodeSequentially() ? m18560b(interfaceC9226cBeginStructure) : m18561c(interfaceC9226cBeginStructure);
    }

    @Override // p049ce.InterfaceC5439i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC9229f encoder, Triple value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        InterfaceC9227d interfaceC9227dBeginStructure = encoder.beginStructure(getDescriptor());
        interfaceC9227dBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f21813a, value.m20065e());
        interfaceC9227dBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f21814b, value.m20066f());
        interfaceC9227dBeginStructure.encodeSerializableElement(getDescriptor(), 2, this.f21815c, value.m20067g());
        interfaceC9227dBeginStructure.endStructure(getDescriptor());
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21816d;
    }
}
