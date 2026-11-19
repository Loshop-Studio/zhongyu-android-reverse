package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String key) {
        AbstractC9979u.m20294g(data, "<this>");
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return data.hasKeyWithValueOfType(key, Object.class);
    }

    public static final Data workDataOf(Pair<String, ? extends Object>... pairs) {
        AbstractC9979u.m20294g(pairs, "pairs");
        Data.Builder builder = new Data.Builder();
        for (Pair<String, ? extends Object> pair : pairs) {
            builder.put((String) pair.m20051f(), pair.m20052g());
        }
        return builder.build();
    }
}
