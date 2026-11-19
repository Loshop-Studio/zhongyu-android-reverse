package androidx.paging;

import androidx.paging.LoadState;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p134i7.AbstractC8768a0;
import p134i7.C8791m;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final class AccessorState<Key, Value> {
    private final BlockState[] blockStates;
    private final LoadState.Error[] errors;
    private final C8791m pendingRequests;
    private boolean refreshAllowed;

    public enum BlockState {
        UNBLOCKED,
        COMPLETED,
        REQUIRES_REFRESH
    }

    public static final class PendingRequest<Key, Value> {
        private final LoadType loadType;
        private PagingState<Key, Value> pagingState;

        public PendingRequest(LoadType loadType, PagingState<Key, Value> pagingState) {
            AbstractC9133u.m16133g(loadType, "loadType");
            AbstractC9133u.m16133g(pagingState, "pagingState");
            this.loadType = loadType;
            this.pagingState = pagingState;
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final PagingState<Key, Value> getPagingState() {
            return this.pagingState;
        }

        public final void setPagingState(PagingState<Key, Value> pagingState) {
            AbstractC9133u.m16133g(pagingState, "<set-?>");
            this.pagingState = pagingState;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BlockState.values().length];
            try {
                iArr2[BlockState.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[BlockState.REQUIRES_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BlockState.UNBLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AccessorState() {
        int length = LoadType.values().length;
        BlockState[] blockStateArr = new BlockState[length];
        for (int i10 = 0; i10 < length; i10++) {
            blockStateArr[i10] = BlockState.UNBLOCKED;
        }
        this.blockStates = blockStateArr;
        int length2 = LoadType.values().length;
        LoadState.Error[] errorArr = new LoadState.Error[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            errorArr[i11] = null;
        }
        this.errors = errorArr;
        this.pendingRequests = new C8791m();
    }

    private final LoadState computeLoadTypeState(LoadType loadType) {
        BlockState blockState = this.blockStates[loadType.ordinal()];
        C8791m c8791m = this.pendingRequests;
        if (c8791m == null || !c8791m.isEmpty()) {
            Iterator<E> it = c8791m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((PendingRequest) it.next()).getLoadType() == loadType) {
                    if (blockState != BlockState.REQUIRES_REFRESH) {
                        return LoadState.Loading.INSTANCE;
                    }
                }
            }
        }
        LoadState.Error error = this.errors[loadType.ordinal()];
        if (error != null) {
            return error;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$1[blockState.ordinal()];
        if (i10 == 1) {
            return WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1 ? LoadState.NotLoading.Companion.getIncomplete$paging_common_release() : LoadState.NotLoading.Companion.getComplete$paging_common_release();
        }
        if (i10 == 2) {
            return LoadState.NotLoading.Companion.getIncomplete$paging_common_release();
        }
        if (i10 == 3) {
            return LoadState.NotLoading.Companion.getIncomplete$paging_common_release();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean add(LoadType loadType, PagingState<Key, Value> pagingState) {
        Object next;
        AbstractC9133u.m16133g(loadType, "loadType");
        AbstractC9133u.m16133g(pagingState, "pagingState");
        Iterator<E> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PendingRequest) next).getLoadType() == loadType) {
                break;
            }
        }
        PendingRequest pendingRequest = (PendingRequest) next;
        if (pendingRequest != null) {
            pendingRequest.setPagingState(pagingState);
            return false;
        }
        BlockState blockState = this.blockStates[loadType.ordinal()];
        if (blockState == BlockState.REQUIRES_REFRESH && loadType != LoadType.REFRESH) {
            this.pendingRequests.add(new PendingRequest(loadType, pagingState));
            return false;
        }
        if (blockState != BlockState.UNBLOCKED && loadType != LoadType.REFRESH) {
            return false;
        }
        LoadType loadType2 = LoadType.REFRESH;
        if (loadType == loadType2) {
            setError(loadType2, null);
        }
        if (this.errors[loadType.ordinal()] == null) {
            return this.pendingRequests.add(new PendingRequest(loadType, pagingState));
        }
        return false;
    }

    public final void clearErrors() {
        int length = this.errors.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.errors[i10] = null;
        }
    }

    public final void clearPendingRequest(final LoadType loadType) {
        AbstractC9133u.m16133g(loadType, "loadType");
        AbstractC8768a0.m14490L(this.pendingRequests, new InterfaceC10570l() { // from class: androidx.paging.AccessorState.clearPendingRequest.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(PendingRequest<Key, Value> it) {
                AbstractC9133u.m16133g(it, "it");
                return Boolean.valueOf(it.getLoadType() == loadType);
            }
        });
    }

    public final void clearPendingRequests() {
        this.pendingRequests.clear();
    }

    public final LoadStates computeLoadStates() {
        return new LoadStates(computeLoadTypeState(LoadType.REFRESH), computeLoadTypeState(LoadType.PREPEND), computeLoadTypeState(LoadType.APPEND));
    }

    public final Pair<LoadType, PagingState<Key, Value>> getPendingBoundary() {
        Object next;
        Iterator<E> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PendingRequest pendingRequest = (PendingRequest) next;
            if (pendingRequest.getLoadType() != LoadType.REFRESH && this.blockStates[pendingRequest.getLoadType().ordinal()] == BlockState.UNBLOCKED) {
                break;
            }
        }
        PendingRequest pendingRequest2 = (PendingRequest) next;
        if (pendingRequest2 != null) {
            return AbstractC8726f.m14230a(pendingRequest2.getLoadType(), pendingRequest2.getPagingState());
        }
        return null;
    }

    public final PagingState<Key, Value> getPendingRefresh() {
        Object next;
        Iterator<E> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PendingRequest) next).getLoadType() == LoadType.REFRESH) {
                break;
            }
        }
        PendingRequest pendingRequest = (PendingRequest) next;
        if (pendingRequest != null) {
            return pendingRequest.getPagingState();
        }
        return null;
    }

    public final boolean getRefreshAllowed() {
        return this.refreshAllowed;
    }

    public final void setBlockState(LoadType loadType, BlockState state) {
        AbstractC9133u.m16133g(loadType, "loadType");
        AbstractC9133u.m16133g(state, "state");
        this.blockStates[loadType.ordinal()] = state;
    }

    public final void setError(LoadType loadType, LoadState.Error error) {
        AbstractC9133u.m16133g(loadType, "loadType");
        this.errors[loadType.ordinal()] = error;
    }

    public final void setRefreshAllowed(boolean z10) {
        this.refreshAllowed = z10;
    }
}
