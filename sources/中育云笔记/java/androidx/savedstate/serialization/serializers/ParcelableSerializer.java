package androidx.savedstate.serialization.serializers;

import android.os.Parcelable;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import ee.AbstractC9136m;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* loaded from: classes3.dex */
public abstract class ParcelableSerializer<T extends Parcelable> implements InterfaceC5432b {
    private final InterfaceC9129f descriptor = AbstractC9136m.m17980f("android.os.Parcelable", new InterfaceC9129f[0], null, 4, null);

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public final InterfaceC9129f getDescriptor() {
        return this.descriptor;
    }

    @Override // p049ce.InterfaceC5431a
    public final T deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(this.descriptor.mo17961f(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        T t10 = (T) SavedStateReader.m33870getParcelableimpl(SavedStateReader.m33824constructorimpl(savedStateDecoder.getSavedState$savedstate_release()), savedStateDecoder.getKey$savedstate_release(), AbstractC9983y.m20315b(Parcelable.class));
        AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.ParcelableSerializer");
        return t10;
    }

    @Override // p049ce.InterfaceC5439i
    public final void serialize(InterfaceC9229f encoder, T value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(this.descriptor.mo17961f(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        SavedStateWriter.m33934putParcelableimpl(SavedStateWriter.m33910constructorimpl(savedStateEncoder.getSavedState$savedstate_release()), savedStateEncoder.getKey$savedstate_release(), value);
    }
}
