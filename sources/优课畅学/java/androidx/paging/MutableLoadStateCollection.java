package androidx.paging;

import androidx.paging.LoadState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class MutableLoadStateCollection {
    private LoadState append;
    private LoadState prepend;
    private LoadState refresh;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MutableLoadStateCollection() {
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.Companion;
        this.refresh = companion.getIncomplete$paging_common_release();
        this.prepend = companion.getIncomplete$paging_common_release();
        this.append = companion.getIncomplete$paging_common_release();
    }

    public final LoadState get(LoadType loadType) {
        AbstractC9133u.m16133g(loadType, "loadType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 == 1) {
            return this.refresh;
        }
        if (i10 == 2) {
            return this.append;
        }
        if (i10 == 3) {
            return this.prepend;
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

    public final void set(LoadType type, LoadState state) {
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(state, "state");
        int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            this.refresh = state;
        } else if (i10 == 2) {
            this.append = state;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.prepend = state;
        }
    }

    public final void setAppend(LoadState loadState) {
        AbstractC9133u.m16133g(loadState, "<set-?>");
        this.append = loadState;
    }

    public final void setPrepend(LoadState loadState) {
        AbstractC9133u.m16133g(loadState, "<set-?>");
        this.prepend = loadState;
    }

    public final void setRefresh(LoadState loadState) {
        AbstractC9133u.m16133g(loadState, "<set-?>");
        this.refresh = loadState;
    }

    public final LoadStates snapshot() {
        return new LoadStates(this.refresh, this.prepend, this.append);
    }

    public final void set(LoadStates states) {
        AbstractC9133u.m16133g(states, "states");
        this.refresh = states.getRefresh();
        this.append = states.getAppend();
        this.prepend = states.getPrepend();
    }
}
