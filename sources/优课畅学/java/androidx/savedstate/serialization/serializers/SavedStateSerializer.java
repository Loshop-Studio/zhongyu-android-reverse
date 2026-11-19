package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10217m;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* loaded from: classes3.dex */
public final class SavedStateSerializer implements InterfaceC10052b {
    public static final SavedStateSerializer INSTANCE = new SavedStateSerializer();
    private static final InterfaceC10210f descriptor = AbstractC10217m.m19108f("androidx.savedstate.SavedState", new InterfaceC10210f[0], null, 4, null);

    private SavedStateSerializer() {
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return descriptor;
    }

    @Override // p246s8.InterfaceC10051a
    public Bundle deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().mo19089f(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        return AbstractC9133u.m16128b(savedStateDecoder.getKey$savedstate_release(), "") ? savedStateDecoder.getSavedState$savedstate_release() : SavedStateReader.m27286getSavedStateimpl(SavedStateReader.m27229constructorimpl(savedStateDecoder.getSavedState$savedstate_release()), savedStateDecoder.getKey$savedstate_release());
    }

    @Override // p246s8.InterfaceC10059i
    public void serialize(InterfaceC10257f encoder, Bundle value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().mo19089f(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        if (AbstractC9133u.m16128b(savedStateEncoder.getKey$savedstate_release(), "")) {
            SavedStateWriter.m27319putAllimpl(SavedStateWriter.m27315constructorimpl(savedStateEncoder.getSavedState$savedstate_release()), value);
        } else {
            SavedStateWriter.m27342putSavedStateimpl(SavedStateWriter.m27315constructorimpl(savedStateEncoder.getSavedState$savedstate_release()), savedStateEncoder.getKey$savedstate_release(), value);
        }
    }
}
