package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9981w;
import p049ce.AbstractC5447q;
import p049ce.InterfaceC5431a;
import p182he.AbstractC9553a;

/* loaded from: classes3.dex */
public final class SavedStateDecoderKt {
    public static final <T> T decodeFromSavedState(InterfaceC5431a deserializer, Bundle savedState) {
        AbstractC9979u.m20294g(deserializer, "deserializer");
        AbstractC9979u.m20294g(savedState, "savedState");
        return (T) decodeFromSavedState$default(deserializer, savedState, null, 4, null);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(Bundle savedState, SavedStateConfiguration configuration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC9979u.m20294g(savedState, "savedState");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9553a serializersModule = configuration.getSerializersModule();
        AbstractC9979u.m20300m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9981w.m20313a("kotlinx.serialization.serializer.withModule");
        return decodeFromSavedState(AbstractC5447q.m2952b(serializersModule, null), savedState, configuration);
    }

    public static final /* synthetic */ <T> T decodeFromSavedState(Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC9979u.m20294g(savedState, "savedState");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9553a serializersModule = configuration.getSerializersModule();
        AbstractC9979u.m20300m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9981w.m20313a("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSavedState(AbstractC5447q.m2952b(serializersModule, null), savedState, configuration);
    }

    public static final <T> T decodeFromSavedState(InterfaceC5431a deserializer, Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC9979u.m20294g(deserializer, "deserializer");
        AbstractC9979u.m20294g(savedState, "savedState");
        AbstractC9979u.m20294g(configuration, "configuration");
        return (T) new SavedStateDecoder(savedState, configuration).decodeSerializableValue(deserializer);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(InterfaceC5431a interfaceC5431a, Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedState(interfaceC5431a, bundle, savedStateConfiguration);
    }
}
