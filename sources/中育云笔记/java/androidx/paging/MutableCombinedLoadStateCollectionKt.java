package androidx.paging;

import androidx.paging.LoadState;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class MutableCombinedLoadStateCollectionKt {
    private static final LoadState computeHelperState(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadState loadState4) {
        return loadState4 == null ? loadState3 : loadState instanceof LoadState.Loading ? (((loadState2 instanceof LoadState.NotLoading) && (loadState4 instanceof LoadState.NotLoading)) || (loadState4 instanceof LoadState.Error)) ? loadState4 : loadState : loadState4;
    }

    public static final CombinedLoadStates computeNewState(CombinedLoadStates combinedLoadStates, LoadStates newSource, LoadStates loadStates) {
        LoadState incomplete$paging_common;
        LoadState incomplete$paging_common2;
        LoadState incomplete$paging_common3;
        AbstractC9979u.m20294g(newSource, "newSource");
        if (combinedLoadStates == null || (incomplete$paging_common = combinedLoadStates.getRefresh()) == null) {
            incomplete$paging_common = LoadState.NotLoading.Companion.getIncomplete$paging_common();
        }
        LoadState loadStateComputeHelperState = computeHelperState(incomplete$paging_common, newSource.getRefresh(), newSource.getRefresh(), loadStates != null ? loadStates.getRefresh() : null);
        if (combinedLoadStates == null || (incomplete$paging_common2 = combinedLoadStates.getPrepend()) == null) {
            incomplete$paging_common2 = LoadState.NotLoading.Companion.getIncomplete$paging_common();
        }
        LoadState loadStateComputeHelperState2 = computeHelperState(incomplete$paging_common2, newSource.getRefresh(), newSource.getPrepend(), loadStates != null ? loadStates.getPrepend() : null);
        if (combinedLoadStates == null || (incomplete$paging_common3 = combinedLoadStates.getAppend()) == null) {
            incomplete$paging_common3 = LoadState.NotLoading.Companion.getIncomplete$paging_common();
        }
        return new CombinedLoadStates(loadStateComputeHelperState, loadStateComputeHelperState2, computeHelperState(incomplete$paging_common3, newSource.getRefresh(), newSource.getAppend(), loadStates != null ? loadStates.getAppend() : null), newSource, loadStates);
    }
}
