package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9135w;
import p246s8.AbstractC10067q;
import p246s8.InterfaceC10051a;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class SavedStateDecoderKt {
    public static final <T> T decodeFromSavedState(InterfaceC10051a deserializer, Bundle savedState) {
        AbstractC9133u.m16133g(deserializer, "deserializer");
        AbstractC9133u.m16133g(savedState, "savedState");
        return (T) decodeFromSavedState$default(deserializer, savedState, null, 4, null);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(Bundle savedState, SavedStateConfiguration configuration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC9133u.m16133g(savedState, "savedState");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC10583a serializersModule = configuration.getSerializersModule();
        AbstractC9133u.m16139m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9135w.m16152a("kotlinx.serialization.serializer.withModule");
        return decodeFromSavedState(AbstractC10067q.m18780d(serializersModule, null), savedState, configuration);
    }

    public static final /* synthetic */ <T> T decodeFromSavedState(Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC9133u.m16133g(savedState, "savedState");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC10583a serializersModule = configuration.getSerializersModule();
        AbstractC9133u.m16139m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9135w.m16152a("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSavedState(AbstractC10067q.m18780d(serializersModule, null), savedState, configuration);
    }

    public static final <T> T decodeFromSavedState(InterfaceC10051a deserializer, Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC9133u.m16133g(deserializer, "deserializer");
        AbstractC9133u.m16133g(savedState, "savedState");
        AbstractC9133u.m16133g(configuration, "configuration");
        return (T) new SavedStateDecoder(savedState, configuration).decodeSerializableValue(deserializer);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(InterfaceC10051a interfaceC10051a, Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedState(interfaceC10051a, bundle, savedStateConfiguration);
    }
}
