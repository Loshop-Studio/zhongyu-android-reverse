package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String key) {
        AbstractC9133u.m16133g(data, "<this>");
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return data.hasKeyWithValueOfType(key, Object.class);
    }

    public static final Data workDataOf(Pair<String, ? extends Object>... pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        Data.Builder builder = new Data.Builder();
        for (Pair<String, ? extends Object> pair : pairs) {
            builder.put((String) pair.m15906e(), pair.m15907g());
        }
        return builder.build();
    }
}
