package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "<init>", "()V", "contentType", "Landroidx/compose/foundation/lazy/layout/Averages;", "getAverage", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/Averages;", "", "getCompositionTimeNanos", "(Ljava/lang/Object;)J", "getMeasureTimeNanos", "timeNanos", "Ld6/s;", "saveCompositionTime", "(Ljava/lang/Object;J)V", "saveMeasureTime", "overallAverage", "Landroidx/compose/foundation/lazy/layout/Averages;", "Landroidx/collection/MutableScatterMap;", "averagesByContentType", "Landroidx/collection/MutableScatterMap;", "lastUsedContentType", "Ljava/lang/Object;", "lastUsedAverage", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n683#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n*L\n170#1:542\n170#1:543\n*E\n"})
/* loaded from: classes.dex */
public final class PrefetchMetrics {
    public static final int $stable = 8;

    @Nullable
    private Averages lastUsedAverage;

    @Nullable
    private Object lastUsedContentType;

    @NotNull
    private final Averages overallAverage = new Averages();

    @NotNull
    private final MutableScatterMap<Object, Averages> averagesByContentType = ScatterMapKt.mutableScatterMapOf();

    private final Averages getAverage(Object contentType) {
        Averages averages = this.lastUsedAverage;
        if (this.lastUsedContentType == contentType && averages != null) {
            return averages;
        }
        MutableScatterMap<Object, Averages> mutableScatterMap = this.averagesByContentType;
        Averages averagesCopy = mutableScatterMap.get(contentType);
        if (averagesCopy == null) {
            averagesCopy = this.overallAverage.copy();
            mutableScatterMap.set(contentType, averagesCopy);
        }
        Averages averages2 = averagesCopy;
        this.lastUsedContentType = contentType;
        this.lastUsedAverage = averages2;
        return averages2;
    }

    public final long getCompositionTimeNanos(@Nullable Object contentType) {
        return getAverage(contentType).getCompositionTimeNanos();
    }

    public final long getMeasureTimeNanos(@Nullable Object contentType) {
        return getAverage(contentType).getMeasureTimeNanos();
    }

    public final void saveCompositionTime(@Nullable Object contentType, long timeNanos) {
        this.overallAverage.saveCompositionTimeNanos(timeNanos);
        getAverage(contentType).saveCompositionTimeNanos(timeNanos);
    }

    public final void saveMeasureTime(@Nullable Object contentType, long timeNanos) {
        this.overallAverage.saveMeasureTimeNanos(timeNanos);
        getAverage(contentType).saveMeasureTimeNanos(timeNanos);
    }
}
