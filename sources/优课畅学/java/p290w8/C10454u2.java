package p290w8;

import kotlin.Triple;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.SerializationException;
import p123h7.C8736p;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10217m;
import p268u8.C10205a;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;
import p300x7.InterfaceC10570l;

/* renamed from: w8.u2 */
/* loaded from: classes5.dex */
public final class C10454u2 implements InterfaceC10052b {

    /* renamed from: a */
    public final InterfaceC10052b f20786a;

    /* renamed from: b */
    public final InterfaceC10052b f20787b;

    /* renamed from: c */
    public final InterfaceC10052b f20788c;

    /* renamed from: d */
    public final InterfaceC10210f f20789d;

    public C10454u2(InterfaceC10052b aSerializer, InterfaceC10052b bSerializer, InterfaceC10052b cSerializer) {
        AbstractC9133u.m16133g(aSerializer, "aSerializer");
        AbstractC9133u.m16133g(bSerializer, "bSerializer");
        AbstractC9133u.m16133g(cSerializer, "cSerializer");
        this.f20786a = aSerializer;
        this.f20787b = bSerializer;
        this.f20788c = cSerializer;
        this.f20789d = AbstractC10217m.m19107e("kotlin.Triple", new InterfaceC10210f[0], new InterfaceC10570l() { // from class: w8.t2
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C10454u2.m19533d(this.f20780a, (C10205a) obj);
            }
        });
    }

    /* renamed from: d */
    public static final C8736p m19533d(C10454u2 c10454u2, C10205a buildClassSerialDescriptor) {
        AbstractC9133u.m16133g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C10205a.m19075b(buildClassSerialDescriptor, "first", c10454u2.f20786a.getDescriptor(), null, false, 12, null);
        C10205a.m19075b(buildClassSerialDescriptor, "second", c10454u2.f20787b.getDescriptor(), null, false, 12, null);
        C10205a.m19075b(buildClassSerialDescriptor, "third", c10454u2.f20788c.getDescriptor(), null, false, 12, null);
        return C8736p.f16368a;
    }

    /* renamed from: b */
    public final Triple m19534b(InterfaceC10254c interfaceC10254c) {
        Object objM19208c = InterfaceC10254c.a.m19208c(interfaceC10254c, getDescriptor(), 0, this.f20786a, null, 8, null);
        Object objM19208c2 = InterfaceC10254c.a.m19208c(interfaceC10254c, getDescriptor(), 1, this.f20787b, null, 8, null);
        Object objM19208c3 = InterfaceC10254c.a.m19208c(interfaceC10254c, getDescriptor(), 2, this.f20788c, null, 8, null);
        interfaceC10254c.endStructure(getDescriptor());
        return new Triple(objM19208c, objM19208c2, objM19208c3);
    }

    /* renamed from: c */
    public final Triple m19535c(InterfaceC10254c interfaceC10254c) {
        InterfaceC10254c interfaceC10254c2;
        Object objM19208c = AbstractC10458v2.f20791a;
        Object objM19208c2 = AbstractC10458v2.f20791a;
        Object objM19208c3 = AbstractC10458v2.f20791a;
        while (true) {
            int iDecodeElementIndex = interfaceC10254c.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex == -1) {
                interfaceC10254c.endStructure(getDescriptor());
                if (objM19208c == AbstractC10458v2.f20791a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objM19208c2 == AbstractC10458v2.f20791a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objM19208c3 != AbstractC10458v2.f20791a) {
                    return new Triple(objM19208c, objM19208c2, objM19208c3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iDecodeElementIndex == 0) {
                interfaceC10254c2 = interfaceC10254c;
                objM19208c = InterfaceC10254c.a.m19208c(interfaceC10254c2, getDescriptor(), 0, this.f20786a, null, 8, null);
            } else if (iDecodeElementIndex == 1) {
                interfaceC10254c2 = interfaceC10254c;
                objM19208c2 = InterfaceC10254c.a.m19208c(interfaceC10254c2, getDescriptor(), 1, this.f20787b, null, 8, null);
            } else {
                if (iDecodeElementIndex != 2) {
                    throw new SerializationException("Unexpected index " + iDecodeElementIndex);
                }
                objM19208c3 = InterfaceC10254c.a.m19208c(interfaceC10254c, getDescriptor(), 2, this.f20788c, null, 8, null);
            }
            interfaceC10254c = interfaceC10254c2;
        }
    }

    @Override // p246s8.InterfaceC10051a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Triple deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        InterfaceC10254c interfaceC10254cBeginStructure = decoder.beginStructure(getDescriptor());
        return interfaceC10254cBeginStructure.decodeSequentially() ? m19534b(interfaceC10254cBeginStructure) : m19535c(interfaceC10254cBeginStructure);
    }

    @Override // p246s8.InterfaceC10059i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC10257f encoder, Triple value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        InterfaceC10255d interfaceC10255dBeginStructure = encoder.beginStructure(getDescriptor());
        interfaceC10255dBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f20786a, value.m15920d());
        interfaceC10255dBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f20787b, value.m15921e());
        interfaceC10255dBeginStructure.encodeSerializableElement(getDescriptor(), 2, this.f20788c, value.m15922g());
        interfaceC10255dBeginStructure.endStructure(getDescriptor());
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20789d;
    }
}
