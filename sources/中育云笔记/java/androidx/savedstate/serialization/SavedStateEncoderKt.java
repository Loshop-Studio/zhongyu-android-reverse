package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9981w;
import p049ce.AbstractC5447q;
import p049ce.InterfaceC5439i;
import p182he.AbstractC9553a;
import p309qc.AbstractC10776g;

/* loaded from: classes3.dex */
public final class SavedStateEncoderKt {
    public static final <T> Bundle encodeToSavedState(InterfaceC5439i serializer, T value) {
        AbstractC9979u.m20294g(serializer, "serializer");
        AbstractC9979u.m20294g(value, "value");
        return encodeToSavedState$default(serializer, value, null, 4, null);
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(Object value, SavedStateConfiguration configuration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC9979u.m20294g(value, "value");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9553a serializersModule = configuration.getSerializersModule();
        AbstractC9979u.m20300m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9981w.m20313a("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(AbstractC5447q.m2952b(serializersModule, null), value, configuration);
    }

    public static final /* synthetic */ <T> Bundle encodeToSavedState(T value, SavedStateConfiguration configuration) {
        AbstractC9979u.m20294g(value, "value");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9553a serializersModule = configuration.getSerializersModule();
        AbstractC9979u.m20300m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9981w.m20313a("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(AbstractC5447q.m2952b(serializersModule, null), value, configuration);
    }

    public static final <T> Bundle encodeToSavedState(InterfaceC5439i serializer, T value, SavedStateConfiguration configuration) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(serializer, "serializer");
        AbstractC9979u.m20294g(value, "value");
        AbstractC9979u.m20294g(configuration, "configuration");
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20088h.size());
            for (Map.Entry entry : mapM20088h.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        new SavedStateEncoder(bundleBundleOf, configuration).encodeSerializableValue(serializer, value);
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(InterfaceC5439i interfaceC5439i, Object obj, SavedStateConfiguration savedStateConfiguration, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedState(interfaceC5439i, obj, savedStateConfiguration);
    }
}
