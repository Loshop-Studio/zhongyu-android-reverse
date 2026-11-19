package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.LoadState;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J&\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0018H\u0087\bø\u0001\u0000J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u001d\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0002\b!J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, m13413d2 = {"Landroidx/paging/LoadStates;", "", "refresh", "Landroidx/paging/LoadState;", "prepend", RequestParameters.SUBRESOURCE_APPEND, "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)V", "getAppend", "()Landroidx/paging/LoadState;", "hasError", "", "()Z", "isIdle", "getPrepend", "getRefresh", "component1", "component2", "component3", "copy", "equals", "other", "forEach", "", "op", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "get", "loadType", "get$paging_common_release", "hashCode", "", "modifyState", "newState", "modifyState$paging_common_release", "toString", "", "Companion", "paging-common_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class LoadStates {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LoadStates IDLE;
    private final LoadState append;
    private final boolean hasError;
    private final boolean isIdle;
    private final LoadState prepend;
    private final LoadState refresh;

    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13413d2 = {"Landroidx/paging/LoadStates$Companion;", "", "()V", "IDLE", "Landroidx/paging/LoadStates;", "getIDLE", "()Landroidx/paging/LoadStates;", "paging-common_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LoadStates getIDLE() {
            return LoadStates.IDLE;
        }

        private Companion() {
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.INSTANCE;
        IDLE = new LoadStates(companion.getIncomplete$paging_common_release(), companion.getIncomplete$paging_common_release(), companion.getIncomplete$paging_common_release());
    }

    public LoadStates(LoadState refresh, LoadState prepend, LoadState append) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        this.refresh = refresh;
        this.prepend = prepend;
        this.append = append;
        this.hasError = (refresh instanceof LoadState.Error) || (append instanceof LoadState.Error) || (prepend instanceof LoadState.Error);
        this.isIdle = (refresh instanceof LoadState.NotLoading) && (append instanceof LoadState.NotLoading) && (prepend instanceof LoadState.NotLoading);
    }

    public static /* synthetic */ LoadStates copy$default(LoadStates loadStates, LoadState loadState, LoadState loadState2, LoadState loadState3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            loadState = loadStates.refresh;
        }
        if ((i9 & 2) != 0) {
            loadState2 = loadStates.prepend;
        }
        if ((i9 & 4) != 0) {
            loadState3 = loadStates.append;
        }
        return loadStates.copy(loadState, loadState2, loadState3);
    }

    /* renamed from: component1, reason: from getter */
    public final LoadState getRefresh() {
        return this.refresh;
    }

    /* renamed from: component2, reason: from getter */
    public final LoadState getPrepend() {
        return this.prepend;
    }

    /* renamed from: component3, reason: from getter */
    public final LoadState getAppend() {
        return this.append;
    }

    public final LoadStates copy(LoadState refresh, LoadState prepend, LoadState append) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        return new LoadStates(refresh, prepend, append);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) other;
        return Intrinsics.areEqual(this.refresh, loadStates.refresh) && Intrinsics.areEqual(this.prepend, loadStates.prepend) && Intrinsics.areEqual(this.append, loadStates.append);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void forEach(Function2<? super LoadType, ? super LoadState, Unit> op) {
        Intrinsics.checkNotNullParameter(op, "op");
        op.invoke(LoadType.REFRESH, getRefresh());
        op.invoke(LoadType.PREPEND, getPrepend());
        op.invoke(LoadType.APPEND, getAppend());
    }

    public final LoadState get$paging_common_release(LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i9 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i9 == 1) {
            return this.append;
        }
        if (i9 == 2) {
            return this.prepend;
        }
        if (i9 == 3) {
            return this.refresh;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final LoadState getAppend() {
        return this.append;
    }

    public final LoadState getPrepend() {
        return this.prepend;
    }

    public final LoadState getRefresh() {
        return this.refresh;
    }

    @JvmName(name = "hasError")
    /* renamed from: hasError, reason: from getter */
    public final boolean getHasError() {
        return this.hasError;
    }

    public int hashCode() {
        return (((this.refresh.hashCode() * 31) + this.prepend.hashCode()) * 31) + this.append.hashCode();
    }

    /* renamed from: isIdle, reason: from getter */
    public final boolean getIsIdle() {
        return this.isIdle;
    }

    public final LoadStates modifyState$paging_common_release(LoadType loadType, LoadState newState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i9 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i9 == 1) {
            return copy$default(this, null, null, newState, 3, null);
        }
        if (i9 == 2) {
            return copy$default(this, null, newState, null, 5, null);
        }
        if (i9 == 3) {
            return copy$default(this, newState, null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return "LoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ')';
    }
}
