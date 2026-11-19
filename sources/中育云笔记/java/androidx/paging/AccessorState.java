package androidx.paging;

import androidx.paging.AccessorState;
import androidx.paging.LoadState;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10937b0;
import p325rc.C10958m;
import p425yc.InterfaceC11943a;

/* loaded from: classes3.dex */
final class AccessorState<Key, Value> {
    private final BlockState[] blockStates;
    private final LoadState.Error[] errors;
    private final C10958m pendingRequests;
    private boolean refreshAllowed;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BlockState {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ BlockState[] $VALUES;
        public static final BlockState UNBLOCKED = new BlockState("UNBLOCKED", 0);
        public static final BlockState COMPLETED = new BlockState("COMPLETED", 1);
        public static final BlockState REQUIRES_REFRESH = new BlockState("REQUIRES_REFRESH", 2);

        private static final /* synthetic */ BlockState[] $values() {
            return new BlockState[]{UNBLOCKED, COMPLETED, REQUIRES_REFRESH};
        }

        static {
            BlockState[] blockStateArr$values = $values();
            $VALUES = blockStateArr$values;
            $ENTRIES = AbstractC9953a.m20230a(blockStateArr$values);
        }

        private BlockState(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static BlockState valueOf(String str) {
            return (BlockState) Enum.valueOf(BlockState.class, str);
        }

        public static BlockState[] values() {
            return (BlockState[]) $VALUES.clone();
        }
    }

    public static final class PendingRequest<Key, Value> {
        private final LoadType loadType;
        private PagingState<Key, Value> pagingState;

        public PendingRequest(LoadType loadType, PagingState<Key, Value> pagingState) {
            AbstractC9979u.m20294g(loadType, "loadType");
            AbstractC9979u.m20294g(pagingState, "pagingState");
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
            AbstractC9979u.m20294g(pagingState, "<set-?>");
            this.pagingState = pagingState;
        }
    }

    public static final /* synthetic */ class WhenMappings {
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
        this.pendingRequests = new C10958m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearPendingRequest$lambda$0(LoadType loadType, PendingRequest it) {
        AbstractC9979u.m20294g(it, "it");
        return it.getLoadType() == loadType;
    }

    private final LoadState computeLoadTypeState(LoadType loadType) {
        BlockState blockState = this.blockStates[loadType.ordinal()];
        C10958m c10958m = this.pendingRequests;
        if (c10958m == null || !c10958m.isEmpty()) {
            Iterator<E> it = c10958m.iterator();
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
            return WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1 ? LoadState.NotLoading.Companion.getIncomplete$paging_common() : LoadState.NotLoading.Companion.getComplete$paging_common();
        }
        if (i10 == 2) {
            return LoadState.NotLoading.Companion.getIncomplete$paging_common();
        }
        if (i10 == 3) {
            return LoadState.NotLoading.Companion.getIncomplete$paging_common();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean add(LoadType loadType, PagingState<Key, Value> pagingState) {
        Object next;
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(pagingState, "pagingState");
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
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC10937b0.m23867L(this.pendingRequests, new InterfaceC9540l() { // from class: androidx.paging.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AccessorState.clearPendingRequest$lambda$0(loadType, (AccessorState.PendingRequest) obj));
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
            return AbstractC10776g.m22975a(pendingRequest2.getLoadType(), pendingRequest2.getPagingState());
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
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(state, "state");
        this.blockStates[loadType.ordinal()] = state;
    }

    public final void setError(LoadType loadType, LoadState.Error error) {
        AbstractC9979u.m20294g(loadType, "loadType");
        this.errors[loadType.ordinal()] = error;
    }

    public final void setRefreshAllowed(boolean z10) {
        this.refreshAllowed = z10;
    }
}
