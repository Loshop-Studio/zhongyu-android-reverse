package androidx.savedstate.serialization.serializers;

import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10217m;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* loaded from: classes3.dex */
public abstract class JavaSerializableSerializer<T extends Serializable> implements InterfaceC10052b {
    private final InterfaceC10210f descriptor = AbstractC10217m.m19108f("java.io.Serializable", new InterfaceC10210f[0], null, 4, null);

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public final InterfaceC10210f getDescriptor() {
        return this.descriptor;
    }

    @Override // p246s8.InterfaceC10051a
    public final T deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(this.descriptor.mo19089f(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        T t10 = (T) SavedStateReader.m27267getJavaSerializableimpl(SavedStateReader.m27229constructorimpl(savedStateDecoder.getSavedState$savedstate_release()), savedStateDecoder.getKey$savedstate_release(), AbstractC9137y.m16154b(Serializable.class));
        AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.JavaSerializableSerializer");
        return t10;
    }

    @Override // p246s8.InterfaceC10059i
    public final void serialize(InterfaceC10257f encoder, T value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(this.descriptor.mo19089f(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        SavedStateWriter.m27335putJavaSerializableimpl(SavedStateWriter.m27315constructorimpl(savedStateEncoder.getSavedState$savedstate_release()), savedStateEncoder.getKey$savedstate_release(), value);
    }
}
