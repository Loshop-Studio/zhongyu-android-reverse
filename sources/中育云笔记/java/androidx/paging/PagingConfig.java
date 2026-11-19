package androidx.paging;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes3.dex */
public final class PagingConfig {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
    public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;
    public final boolean enablePlaceholders;
    public final int initialLoadSize;
    public final int jumpThreshold;
    public final int maxSize;
    public final int pageSize;
    public final int prefetchDistance;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ void getMAX_SIZE_UNBOUNDED$annotations() {
        }

        private Companion() {
        }
    }

    public PagingConfig(int i10) {
        this(i10, 0, false, 0, 0, 0, 62, null);
    }

    public PagingConfig(int i10, @IntRange(from = 0) int i11) {
        this(i10, i11, false, 0, 0, 0, 60, null);
    }

    public PagingConfig(int i10, @IntRange(from = 0) int i11, boolean z10) {
        this(i10, i11, z10, 0, 0, 0, 56, null);
    }

    public PagingConfig(int i10, @IntRange(from = 0) int i11, boolean z10, @IntRange(from = 1) int i12) {
        this(i10, i11, z10, i12, 0, 0, 48, null);
    }

    public PagingConfig(int i10, @IntRange(from = 0) int i11, boolean z10, @IntRange(from = 1) int i12, @IntRange(from = 2) int i13) {
        this(i10, i11, z10, i12, i13, 0, 32, null);
    }

    public PagingConfig(int i10, @IntRange(from = 0) int i11, boolean z10, @IntRange(from = 1) int i12, @IntRange(from = 2) int i13, int i14) {
        this.pageSize = i10;
        this.prefetchDistance = i11;
        this.enablePlaceholders = z10;
        this.initialLoadSize = i12;
        this.maxSize = i13;
        this.jumpThreshold = i14;
        if (!z10 && i11 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i13 == Integer.MAX_VALUE || i13 >= (i11 * 2) + i10) {
            if (i14 != Integer.MIN_VALUE && i14 <= 0) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
            }
            return;
        }
        throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i10 + ", prefetchDist=" + i11 + ", maxSize=" + i13);
    }

    public /* synthetic */ PagingConfig(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, AbstractC9972n abstractC9972n) {
        this(i10, (i15 & 2) != 0 ? i10 : i11, (i15 & 4) != 0 ? true : z10, (i15 & 8) != 0 ? i10 * 3 : i12, (i15 & 16) != 0 ? Integer.MAX_VALUE : i13, (i15 & 32) != 0 ? Integer.MIN_VALUE : i14);
    }
}
