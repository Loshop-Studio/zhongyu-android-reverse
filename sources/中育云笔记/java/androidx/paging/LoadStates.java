package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes3.dex */
public final class LoadStates {
    public static final Companion Companion = new Companion(null);
    private static final LoadStates IDLE;
    private final LoadState append;
    private final boolean hasError;
    private final boolean isIdle;
    private final LoadState prepend;
    private final LoadState refresh;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final LoadStates getIDLE() {
            return LoadStates.IDLE;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
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
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.Companion;
        IDLE = new LoadStates(companion.getIncomplete$paging_common(), companion.getIncomplete$paging_common(), companion.getIncomplete$paging_common());
    }

    public LoadStates(LoadState refresh, LoadState prepend, LoadState append) {
        AbstractC9979u.m20294g(refresh, "refresh");
        AbstractC9979u.m20294g(prepend, "prepend");
        AbstractC9979u.m20294g(append, "append");
        this.refresh = refresh;
        this.prepend = prepend;
        this.append = append;
        this.hasError = (refresh instanceof LoadState.Error) || (append instanceof LoadState.Error) || (prepend instanceof LoadState.Error);
        this.isIdle = (refresh instanceof LoadState.NotLoading) && (append instanceof LoadState.NotLoading) && (prepend instanceof LoadState.NotLoading);
    }

    public static /* synthetic */ LoadStates copy$default(LoadStates loadStates, LoadState loadState, LoadState loadState2, LoadState loadState3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loadState = loadStates.refresh;
        }
        if ((i10 & 2) != 0) {
            loadState2 = loadStates.prepend;
        }
        if ((i10 & 4) != 0) {
            loadState3 = loadStates.append;
        }
        return loadStates.copy(loadState, loadState2, loadState3);
    }

    public final LoadState component1() {
        return this.refresh;
    }

    public final LoadState component2() {
        return this.prepend;
    }

    public final LoadState component3() {
        return this.append;
    }

    public final LoadStates copy(LoadState refresh, LoadState prepend, LoadState append) {
        AbstractC9979u.m20294g(refresh, "refresh");
        AbstractC9979u.m20294g(prepend, "prepend");
        AbstractC9979u.m20294g(append, "append");
        return new LoadStates(refresh, prepend, append);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) obj;
        return AbstractC9979u.m20289b(this.refresh, loadStates.refresh) && AbstractC9979u.m20289b(this.prepend, loadStates.prepend) && AbstractC9979u.m20289b(this.append, loadStates.append);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void forEach(InterfaceC9544p op) {
        AbstractC9979u.m20294g(op, "op");
        op.invoke(LoadType.REFRESH, getRefresh());
        op.invoke(LoadType.PREPEND, getPrepend());
        op.invoke(LoadType.APPEND, getAppend());
    }

    public final LoadState get$paging_common(LoadType loadType) {
        AbstractC9979u.m20294g(loadType, "loadType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 == 1) {
            return this.append;
        }
        if (i10 == 2) {
            return this.prepend;
        }
        if (i10 == 3) {
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

    public final boolean hasError() {
        return this.hasError;
    }

    public int hashCode() {
        return (((this.refresh.hashCode() * 31) + this.prepend.hashCode()) * 31) + this.append.hashCode();
    }

    public final boolean isIdle() {
        return this.isIdle;
    }

    public final LoadStates modifyState$paging_common(LoadType loadType, LoadState newState) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(newState, "newState");
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 == 1) {
            return copy$default(this, null, null, newState, 3, null);
        }
        if (i10 == 2) {
            return copy$default(this, null, newState, null, 5, null);
        }
        if (i10 == 3) {
            return copy$default(this, newState, null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return "LoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ')';
    }
}
