package androidx.savedstate.serialization.serializers;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* loaded from: classes3.dex */
public final class BuiltInSerializerKt {
    public static final String decoderErrorMessage(String serialName, InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(decoder, "decoder");
        return "Cannot deserialize " + serialName + " with '" + AbstractC9137y.m16154b(decoder.getClass()).mo13672g() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String encoderErrorMessage(String serialName, InterfaceC10257f encoder) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(encoder, "encoder");
        return "Cannot serialize " + serialName + " with '" + AbstractC9137y.m16154b(encoder.getClass()).mo13672g() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
