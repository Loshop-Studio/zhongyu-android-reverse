package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9135w;
import p123h7.AbstractC8726f;
import p246s8.AbstractC10067q;
import p246s8.InterfaceC10059i;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class SavedStateEncoderKt {
    public static final <T> Bundle encodeToSavedState(InterfaceC10059i serializer, T value) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(value, "value");
        return encodeToSavedState$default(serializer, value, null, 4, null);
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(Object value, SavedStateConfiguration configuration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC9133u.m16133g(value, "value");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC10583a serializersModule = configuration.getSerializersModule();
        AbstractC9133u.m16139m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9135w.m16152a("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(AbstractC10067q.m18780d(serializersModule, null), value, configuration);
    }

    public static final /* synthetic */ <T> Bundle encodeToSavedState(T value, SavedStateConfiguration configuration) {
        AbstractC9133u.m16133g(value, "value");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC10583a serializersModule = configuration.getSerializersModule();
        AbstractC9133u.m16139m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9135w.m16152a("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(AbstractC10067q.m18780d(serializersModule, null), value, configuration);
    }

    public static final <T> Bundle encodeToSavedState(InterfaceC10059i serializer, T value, SavedStateConfiguration configuration) {
        Pair[] pairArr;
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(value, "value");
        AbstractC9133u.m16133g(configuration, "configuration");
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM15943h.size());
            for (Map.Entry entry : mapM15943h.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        new SavedStateEncoder(bundleBundleOf, configuration).encodeSerializableValue(serializer, value);
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(InterfaceC10059i interfaceC10059i, Object obj, SavedStateConfiguration savedStateConfiguration, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedState(interfaceC10059i, obj, savedStateConfiguration);
    }
}
