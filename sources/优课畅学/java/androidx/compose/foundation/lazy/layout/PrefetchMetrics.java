package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PrefetchMetrics {
    public static final int $stable = 8;
    private Averages lastUsedAverage;
    private Object lastUsedContentType;
    private final Averages overallAverage = new Averages();
    private final MutableScatterMap<Object, Averages> averagesByContentType = ScatterMapKt.mutableScatterMapOf();

    private final Averages getAverage(Object obj) {
        Averages averages = this.lastUsedAverage;
        if (this.lastUsedContentType == obj && averages != null) {
            return averages;
        }
        MutableScatterMap<Object, Averages> mutableScatterMap = this.averagesByContentType;
        Averages averagesCopy = mutableScatterMap.get(obj);
        if (averagesCopy == null) {
            averagesCopy = this.overallAverage.copy();
            mutableScatterMap.set(obj, averagesCopy);
        }
        Averages averages2 = averagesCopy;
        this.lastUsedContentType = obj;
        this.lastUsedAverage = averages2;
        return averages2;
    }

    public final long getCompositionTimeNanos(Object obj) {
        return getAverage(obj).getCompositionTimeNanos();
    }

    public final long getMeasureTimeNanos(Object obj) {
        return getAverage(obj).getMeasureTimeNanos();
    }

    public final void saveCompositionTime(Object obj, long j10) {
        this.overallAverage.saveCompositionTimeNanos(j10);
        getAverage(obj).saveCompositionTimeNanos(j10);
    }

    public final void saveMeasureTime(Object obj, long j10) {
        this.overallAverage.saveMeasureTimeNanos(j10);
        getAverage(obj).saveMeasureTimeNanos(j10);
    }
}
