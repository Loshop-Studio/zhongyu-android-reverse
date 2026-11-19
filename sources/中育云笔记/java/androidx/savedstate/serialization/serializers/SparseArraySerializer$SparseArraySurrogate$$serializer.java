package androidx.savedstate.serialization.serializers;

import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import ee.InterfaceC9129f;
import ge.C9312d2;
import ge.C9319f;
import ge.InterfaceC9349l0;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.UnknownFieldException;
import p049ce.InterfaceC5431a;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

@InterfaceC10770a
/* loaded from: classes3.dex */
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements InterfaceC9349l0 {
    private final InterfaceC9129f descriptor;
    private final /* synthetic */ InterfaceC5432b typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        C9312d2 c9312d2 = new C9312d2("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        c9312d2.m18394m("keys", false);
        c9312d2.m18394m("values", false);
        this.descriptor = c9312d2;
    }

    private final /* synthetic */ InterfaceC5432b getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ge.InterfaceC9349l0
    public final InterfaceC5432b[] childSerializers() {
        return new InterfaceC5432b[]{SparseArraySerializer.SparseArraySurrogate.$childSerializers[0].getValue(), new C9319f(this.typeSerial0)};
    }

    @Override // p049ce.InterfaceC5431a
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(InterfaceC9228e decoder) {
        List list;
        List list2;
        int i10;
        AbstractC9979u.m20294g(decoder, "decoder");
        InterfaceC9129f interfaceC9129f = this.descriptor;
        InterfaceC9226c interfaceC9226cBeginStructure = decoder.beginStructure(interfaceC9129f);
        InterfaceC10773d[] interfaceC10773dArr = SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        if (interfaceC9226cBeginStructure.decodeSequentially()) {
            list = (List) interfaceC9226cBeginStructure.decodeSerializableElement(interfaceC9129f, 0, (InterfaceC5431a) interfaceC10773dArr[0].getValue(), null);
            list2 = (List) interfaceC9226cBeginStructure.decodeSerializableElement(interfaceC9129f, 1, new C9319f(this.typeSerial0), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list3 = null;
            List list4 = null;
            while (z10) {
                int iDecodeElementIndex = interfaceC9226cBeginStructure.decodeElementIndex(interfaceC9129f);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) interfaceC9226cBeginStructure.decodeSerializableElement(interfaceC9129f, 0, (InterfaceC5431a) interfaceC10773dArr[0].getValue(), list3);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list4 = (List) interfaceC9226cBeginStructure.decodeSerializableElement(interfaceC9129f, 1, new C9319f(this.typeSerial0), list4);
                    i11 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i10 = i11;
        }
        interfaceC9226cBeginStructure.endStructure(interfaceC9129f);
        return new SparseArraySerializer.SparseArraySurrogate<>(i10, list, list2, null);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public final InterfaceC9129f getDescriptor() {
        return this.descriptor;
    }

    @Override // p049ce.InterfaceC5439i
    public final void serialize(InterfaceC9229f encoder, SparseArraySerializer.SparseArraySurrogate<T> value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        InterfaceC9129f interfaceC9129f = this.descriptor;
        InterfaceC9227d interfaceC9227dBeginStructure = encoder.beginStructure(interfaceC9129f);
        SparseArraySerializer.SparseArraySurrogate.write$Self$savedstate_release(value, interfaceC9227dBeginStructure, interfaceC9129f, this.typeSerial0);
        interfaceC9227dBeginStructure.endStructure(interfaceC9129f);
    }

    @Override // ge.InterfaceC9349l0
    public final InterfaceC5432b[] typeParametersSerializers() {
        return new InterfaceC5432b[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(InterfaceC5432b typeSerial0) {
        this();
        AbstractC9979u.m20294g(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
