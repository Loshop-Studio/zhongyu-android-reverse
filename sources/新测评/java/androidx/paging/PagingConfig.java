package androidx.paging;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bBA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m13558d2 = {"Landroidx/paging/PagingConfig;", "", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSize", "maxSize", "jumpThreshold", "(IIZIII)V", "Companion", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class PagingConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
    public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;

    @JvmField
    public final boolean enablePlaceholders;

    @JvmField
    public final int initialLoadSize;

    @JvmField
    public final int jumpThreshold;

    @JvmField
    public final int maxSize;

    @JvmField
    public final int pageSize;

    @JvmField
    public final int prefetchDistance;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, m13558d2 = {"Landroidx/paging/PagingConfig$Companion;", "", "()V", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "", "MAX_SIZE_UNBOUNDED", "getMAX_SIZE_UNBOUNDED$annotations", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMAX_SIZE_UNBOUNDED$annotations() {
        }

        private Companion() {
        }
    }

    @JvmOverloads
    public PagingConfig(int i10) {
        this(i10, 0, false, 0, 0, 0, 62, null);
    }

    @JvmOverloads
    public PagingConfig(int i10, @IntRange(from = 0) int i11) {
        this(i10, i11, false, 0, 0, 0, 60, null);
    }

    @JvmOverloads
    public PagingConfig(int i10, @IntRange(from = 0) int i11, boolean z9) {
        this(i10, i11, z9, 0, 0, 0, 56, null);
    }

    @JvmOverloads
    public PagingConfig(int i10, @IntRange(from = 0) int i11, boolean z9, @IntRange(from = 1) int i12) {
        this(i10, i11, z9, i12, 0, 0, 48, null);
    }

    @JvmOverloads
    public PagingConfig(int i10, @IntRange(from = 0) int i11, boolean z9, @IntRange(from = 1) int i12, @IntRange(from = 2) int i13) {
        this(i10, i11, z9, i12, i13, 0, 32, null);
    }

    @JvmOverloads
    public PagingConfig(int i10, @IntRange(from = 0) int i11, boolean z9, @IntRange(from = 1) int i12, @IntRange(from = 2) int i13, int i14) {
        this.pageSize = i10;
        this.prefetchDistance = i11;
        this.enablePlaceholders = z9;
        this.initialLoadSize = i12;
        this.maxSize = i13;
        this.jumpThreshold = i14;
        if (!z9 && i11 == 0) {
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

    public /* synthetic */ PagingConfig(int i10, int i11, boolean z9, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i15 & 2) != 0 ? i10 : i11, (i15 & 4) != 0 ? true : z9, (i15 & 8) != 0 ? i10 * 3 : i12, (i15 & 16) != 0 ? Integer.MAX_VALUE : i13, (i15 & 32) != 0 ? Integer.MIN_VALUE : i14);
    }
}
