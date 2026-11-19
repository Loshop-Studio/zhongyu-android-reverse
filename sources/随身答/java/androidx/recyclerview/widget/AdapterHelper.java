package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class AdapterHelper implements OpReorderer.Callback {
    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    final Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList<UpdateOp> mPendingUpdates;
    final ArrayList<UpdateOp> mPostponedList;
    private Pools.Pool<UpdateOp> mUpdateOpPool;

    public interface Callback {
        RecyclerView.ViewHolder findViewHolder(int i9);

        void markViewHoldersUpdated(int i9, int i10, Object obj);

        void offsetPositionsForAdd(int i9, int i10);

        void offsetPositionsForMove(int i9, int i10);

        void offsetPositionsForRemovingInvisible(int i9, int i10);

        void offsetPositionsForRemovingLaidOutOrNewView(int i9, int i10);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    public static final class UpdateOp {
        static final int ADD = 1;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        int cmd;
        int itemCount;
        Object payload;
        int positionStart;

        public UpdateOp(int i9, int i10, int i11, Object obj) {
            this.cmd = i9;
            this.positionStart = i10;
            this.itemCount = i11;
            this.payload = obj;
        }

        public String cmdToString() {
            int i9 = this.cmd;
            return i9 != 1 ? i9 != 2 ? i9 != 4 ? i9 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateOp)) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i9 = this.cmd;
            if (i9 != updateOp.cmd) {
                return false;
            }
            if (i9 == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
                return true;
            }
            if (this.itemCount != updateOp.itemCount || this.positionStart != updateOp.positionStart) {
                return false;
            }
            Object obj2 = this.payload;
            if (obj2 != null) {
                if (!obj2.equals(updateOp.payload)) {
                    return false;
                }
            } else if (updateOp.payload != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + cmdToString() + ",s:" + this.positionStart + "c:" + this.itemCount + ",p:" + this.payload + "]";
        }
    }

    public AdapterHelper(Callback callback) {
        this(callback, false);
    }

    private void applyAdd(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyMove(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyRemove(UpdateOp updateOp) {
        boolean z9;
        char c10;
        int i9 = updateOp.positionStart;
        int i10 = updateOp.itemCount + i9;
        char c11 = 65535;
        int i11 = i9;
        int i12 = 0;
        while (i11 < i10) {
            if (this.mCallback.findViewHolder(i11) != null || canFindInPreLayout(i11)) {
                if (c11 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i9, i12, null));
                    z9 = true;
                } else {
                    z9 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i9, i12, null));
                    z9 = true;
                } else {
                    z9 = false;
                }
                c10 = 0;
            }
            if (z9) {
                i11 -= i12;
                i10 -= i12;
                i12 = 1;
            } else {
                i12++;
            }
            i11++;
            c11 = c10;
        }
        if (i12 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i9, i12, null);
        }
        if (c11 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(UpdateOp updateOp) {
        int i9 = updateOp.positionStart;
        int i10 = updateOp.itemCount + i9;
        int i11 = 0;
        boolean z9 = -1;
        int i12 = i9;
        while (i9 < i10) {
            if (this.mCallback.findViewHolder(i9) != null || canFindInPreLayout(i9)) {
                if (!z9) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i12, i11, updateOp.payload));
                    i12 = i9;
                    i11 = 0;
                }
                z9 = true;
            } else {
                if (z9) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i12, i11, updateOp.payload));
                    i12 = i9;
                    i11 = 0;
                }
                z9 = false;
            }
            i11++;
            i9++;
        }
        if (i11 != updateOp.itemCount) {
            Object obj = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i12, i11, obj);
        }
        if (z9) {
            postponeAndUpdateViewHolders(updateOp);
        } else {
            dispatchAndUpdateViewHolders(updateOp);
        }
    }

    private boolean canFindInPreLayout(int i9) {
        int size = this.mPostponedList.size();
        for (int i10 = 0; i10 < size; i10++) {
            UpdateOp updateOp = this.mPostponedList.get(i10);
            int i11 = updateOp.cmd;
            if (i11 == 8) {
                if (findPositionOffset(updateOp.itemCount, i10 + 1) == i9) {
                    return true;
                }
            } else if (i11 == 1) {
                int i12 = updateOp.positionStart;
                int i13 = updateOp.itemCount + i12;
                while (i12 < i13) {
                    if (findPositionOffset(i12, i10 + 1) == i9) {
                        return true;
                    }
                    i12++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        int i9;
        int i10 = updateOp.cmd;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iUpdatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, i10);
        int i11 = updateOp.positionStart;
        int i12 = updateOp.cmd;
        if (i12 == 2) {
            i9 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i9 = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < updateOp.itemCount; i14++) {
            int iUpdatePositionWithPostponed2 = updatePositionWithPostponed(updateOp.positionStart + (i9 * i14), updateOp.cmd);
            int i15 = updateOp.cmd;
            if (i15 == 2 ? iUpdatePositionWithPostponed2 != iUpdatePositionWithPostponed : !(i15 == 4 && iUpdatePositionWithPostponed2 == iUpdatePositionWithPostponed + 1)) {
                UpdateOp updateOpObtainUpdateOp = obtainUpdateOp(i15, iUpdatePositionWithPostponed, i13, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp, i11);
                recycleUpdateOp(updateOpObtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i11 += i13;
                }
                i13 = 1;
                iUpdatePositionWithPostponed = iUpdatePositionWithPostponed2;
            } else {
                i13++;
            }
        }
        Object obj = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i13 > 0) {
            UpdateOp updateOpObtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, iUpdatePositionWithPostponed, i13, obj);
            dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp2, i11);
            recycleUpdateOp(updateOpObtainUpdateOp2);
        }
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i9 = updateOp.cmd;
        if (i9 == 1) {
            this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i9 == 2) {
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i9 == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else {
            if (i9 == 8) {
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    private int updatePositionWithPostponed(int i9, int i10) {
        int i11;
        int i12;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = this.mPostponedList.get(size);
            int i13 = updateOp.cmd;
            if (i13 == 8) {
                int i14 = updateOp.positionStart;
                int i15 = updateOp.itemCount;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i9 < i12 || i9 > i11) {
                    if (i9 < i14) {
                        if (i10 == 1) {
                            updateOp.positionStart = i14 + 1;
                            updateOp.itemCount = i15 + 1;
                        } else if (i10 == 2) {
                            updateOp.positionStart = i14 - 1;
                            updateOp.itemCount = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        updateOp.itemCount = i15 + 1;
                    } else if (i10 == 2) {
                        updateOp.itemCount = i15 - 1;
                    }
                    i9++;
                } else {
                    if (i10 == 1) {
                        updateOp.positionStart = i14 + 1;
                    } else if (i10 == 2) {
                        updateOp.positionStart = i14 - 1;
                    }
                    i9--;
                }
            } else {
                int i16 = updateOp.positionStart;
                if (i16 <= i9) {
                    if (i13 == 1) {
                        i9 -= updateOp.itemCount;
                    } else if (i13 == 2) {
                        i9 += updateOp.itemCount;
                    }
                } else if (i10 == 1) {
                    updateOp.positionStart = i16 + 1;
                } else if (i10 == 2) {
                    updateOp.positionStart = i16 - 1;
                }
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = this.mPostponedList.get(size2);
            if (updateOp2.cmd == 8) {
                int i17 = updateOp2.itemCount;
                if (i17 == updateOp2.positionStart || i17 < 0) {
                    this.mPostponedList.remove(size2);
                    recycleUpdateOp(updateOp2);
                }
            } else if (updateOp2.itemCount <= 0) {
                this.mPostponedList.remove(size2);
                recycleUpdateOp(updateOp2);
            }
        }
        return i9;
    }

    public AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
        Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    public int applyPendingUpdatesToPosition(int i9) {
        int size = this.mPendingUpdates.size();
        for (int i10 = 0; i10 < size; i10++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i10);
            int i11 = updateOp.cmd;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = updateOp.positionStart;
                    if (i12 <= i9) {
                        int i13 = updateOp.itemCount;
                        if (i12 + i13 > i9) {
                            return -1;
                        }
                        i9 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = updateOp.positionStart;
                    if (i14 == i9) {
                        i9 = updateOp.itemCount;
                    } else {
                        if (i14 < i9) {
                            i9--;
                        }
                        if (updateOp.itemCount <= i9) {
                            i9++;
                        }
                    }
                }
            } else if (updateOp.positionStart <= i9) {
                i9 += updateOp.itemCount;
            }
        }
        return i9;
    }

    public void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(i9));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i9 = 0; i9 < size; i9++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i9);
            int i10 = updateOp.cmd;
            if (i10 == 1) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i10 == 2) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
            } else if (i10 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i10 == 8) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    public void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i9) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i10 = updateOp.cmd;
        if (i10 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i9, updateOp.itemCount);
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.mCallback.markViewHoldersUpdated(i9, updateOp.itemCount, updateOp.payload);
        }
    }

    public int findPositionOffset(int i9) {
        return findPositionOffset(i9, 0);
    }

    public boolean hasAnyUpdateTypes(int i9) {
        return (i9 & this.mExistingUpdateTypes) != 0;
    }

    public boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    public boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public UpdateOp obtainUpdateOp(int i9, int i10, int i11, Object obj) {
        UpdateOp updateOpAcquire = this.mUpdateOpPool.acquire();
        if (updateOpAcquire == null) {
            return new UpdateOp(i9, i10, i11, obj);
        }
        updateOpAcquire.cmd = i9;
        updateOpAcquire.positionStart = i10;
        updateOpAcquire.itemCount = i11;
        updateOpAcquire.payload = obj;
        return updateOpAcquire;
    }

    public boolean onItemRangeChanged(int i9, int i10, Object obj) {
        if (i10 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i9, i10, obj));
        this.mExistingUpdateTypes |= 4;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeInserted(int i9, int i10) {
        if (i10 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i9, i10, null));
        this.mExistingUpdateTypes |= 1;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeMoved(int i9, int i10, int i11) {
        if (i9 == i10) {
            return false;
        }
        if (i11 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.mPendingUpdates.add(obtainUpdateOp(8, i9, i10, null));
        this.mExistingUpdateTypes |= 8;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeRemoved(int i9, int i10) {
        if (i10 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i9, i10, null));
        this.mExistingUpdateTypes |= 2;
        return this.mPendingUpdates.size() == 1;
    }

    public void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i9 = 0; i9 < size; i9++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i9);
            int i10 = updateOp.cmd;
            if (i10 == 1) {
                applyAdd(updateOp);
            } else if (i10 == 2) {
                applyRemove(updateOp);
            } else if (i10 == 4) {
                applyUpdate(updateOp);
            } else if (i10 == 8) {
                applyMove(updateOp);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.mPendingUpdates.clear();
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(UpdateOp updateOp) {
        if (this.mDisableRecycler) {
            return;
        }
        updateOp.payload = null;
        this.mUpdateOpPool.release(updateOp);
    }

    public void recycleUpdateOpsAndClearList(List<UpdateOp> list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            recycleUpdateOp(list.get(i9));
        }
        list.clear();
    }

    public void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public AdapterHelper(Callback callback, boolean z9) {
        this.mUpdateOpPool = new Pools.SimplePool(30);
        this.mPendingUpdates = new ArrayList<>();
        this.mPostponedList = new ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z9;
        this.mOpReorderer = new OpReorderer(this);
    }

    public int findPositionOffset(int i9, int i10) {
        int size = this.mPostponedList.size();
        while (i10 < size) {
            UpdateOp updateOp = this.mPostponedList.get(i10);
            int i11 = updateOp.cmd;
            if (i11 == 8) {
                int i12 = updateOp.positionStart;
                if (i12 == i9) {
                    i9 = updateOp.itemCount;
                } else {
                    if (i12 < i9) {
                        i9--;
                    }
                    if (updateOp.itemCount <= i9) {
                        i9++;
                    }
                }
            } else {
                int i13 = updateOp.positionStart;
                if (i13 > i9) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = updateOp.itemCount;
                    if (i9 < i13 + i14) {
                        return -1;
                    }
                    i9 -= i14;
                } else if (i11 == 1) {
                    i9 += updateOp.itemCount;
                }
            }
            i10++;
        }
        return i9;
    }
}
