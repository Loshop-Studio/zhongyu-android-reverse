package androidx.savedstate.serialization.serializers;

import android.util.Size;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import ee.AbstractC9136m;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* loaded from: classes3.dex */
public final class SizeSerializer implements InterfaceC5432b {
    public static final SizeSerializer INSTANCE = new SizeSerializer();
    private static final InterfaceC9129f descriptor = AbstractC9136m.m17980f("android.util.Size", new InterfaceC9129f[0], null, 4, null);

    private SizeSerializer() {
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return descriptor;
    }

    @Override // p049ce.InterfaceC5431a
    public Size deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().mo17961f(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        return SavedStateReader.m33887getSizeimpl(SavedStateReader.m33824constructorimpl(savedStateDecoder.getSavedState$savedstate_release()), savedStateDecoder.getKey$savedstate_release());
    }

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, Size value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().mo17961f(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        SavedStateWriter.m33940putSizeimpl(SavedStateWriter.m33910constructorimpl(savedStateEncoder.getSavedState$savedstate_release()), savedStateEncoder.getKey$savedstate_release(), value);
    }
}
