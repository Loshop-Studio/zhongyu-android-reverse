package androidx.savedstate.serialization.serializers;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* loaded from: classes3.dex */
public final class BuiltInSerializerKt {
    public static final String decoderErrorMessage(String serialName, InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(decoder, "decoder");
        return "Cannot deserialize " + serialName + " with '" + AbstractC9983y.m20315b(decoder.getClass()).mo20277f() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String encoderErrorMessage(String serialName, InterfaceC9229f encoder) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(encoder, "encoder");
        return "Cannot serialize " + serialName + " with '" + AbstractC9983y.m20315b(encoder.getClass()).mo20277f() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
