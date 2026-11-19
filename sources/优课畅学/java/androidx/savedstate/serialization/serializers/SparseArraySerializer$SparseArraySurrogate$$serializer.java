package androidx.savedstate.serialization.serializers;

import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.UnknownFieldException;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p246s8.InterfaceC10051a;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;
import p290w8.C10379d2;
import p290w8.C10386f;
import p290w8.InterfaceC10416l0;

@InterfaceC8721a
/* loaded from: classes3.dex */
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements InterfaceC10416l0 {
    private final InterfaceC10210f descriptor;
    private final /* synthetic */ InterfaceC10052b typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        C10379d2 c10379d2 = new C10379d2("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        c10379d2.m19368m("keys", false);
        c10379d2.m19368m("values", false);
        this.descriptor = c10379d2;
    }

    private final /* synthetic */ InterfaceC10052b getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p290w8.InterfaceC10416l0
    public final InterfaceC10052b[] childSerializers() {
        return new InterfaceC10052b[]{SparseArraySerializer.SparseArraySurrogate.$childSerializers[0].getValue(), new C10386f(this.typeSerial0)};
    }

    @Override // p246s8.InterfaceC10051a
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(InterfaceC10256e decoder) {
        List list;
        List list2;
        int i10;
        AbstractC9133u.m16133g(decoder, "decoder");
        InterfaceC10210f interfaceC10210f = this.descriptor;
        InterfaceC10254c interfaceC10254cBeginStructure = decoder.beginStructure(interfaceC10210f);
        InterfaceC8724d[] interfaceC8724dArr = SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        if (interfaceC10254cBeginStructure.decodeSequentially()) {
            list = (List) interfaceC10254cBeginStructure.decodeSerializableElement(interfaceC10210f, 0, (InterfaceC10051a) interfaceC8724dArr[0].getValue(), null);
            list2 = (List) interfaceC10254cBeginStructure.decodeSerializableElement(interfaceC10210f, 1, new C10386f(this.typeSerial0), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list3 = null;
            List list4 = null;
            while (z10) {
                int iDecodeElementIndex = interfaceC10254cBeginStructure.decodeElementIndex(interfaceC10210f);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) interfaceC10254cBeginStructure.decodeSerializableElement(interfaceC10210f, 0, (InterfaceC10051a) interfaceC8724dArr[0].getValue(), list3);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list4 = (List) interfaceC10254cBeginStructure.decodeSerializableElement(interfaceC10210f, 1, new C10386f(this.typeSerial0), list4);
                    i11 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i10 = i11;
        }
        interfaceC10254cBeginStructure.endStructure(interfaceC10210f);
        return new SparseArraySerializer.SparseArraySurrogate<>(i10, list, list2, null);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public final InterfaceC10210f getDescriptor() {
        return this.descriptor;
    }

    @Override // p246s8.InterfaceC10059i
    public final void serialize(InterfaceC10257f encoder, SparseArraySerializer.SparseArraySurrogate<T> value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        InterfaceC10210f interfaceC10210f = this.descriptor;
        InterfaceC10255d interfaceC10255dBeginStructure = encoder.beginStructure(interfaceC10210f);
        SparseArraySerializer.SparseArraySurrogate.write$Self$savedstate_release(value, interfaceC10255dBeginStructure, interfaceC10210f, this.typeSerial0);
        interfaceC10255dBeginStructure.endStructure(interfaceC10210f);
    }

    @Override // p290w8.InterfaceC10416l0
    public final InterfaceC10052b[] typeParametersSerializers() {
        return new InterfaceC10052b[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(InterfaceC10052b typeSerial0) {
        this();
        AbstractC9133u.m16133g(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
