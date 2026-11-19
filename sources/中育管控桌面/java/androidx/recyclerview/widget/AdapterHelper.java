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
        RecyclerView.ViewHolder findViewHolder(int i6);

        void markViewHoldersUpdated(int i6, int i7, Object obj);

        void offsetPositionsForAdd(int i6, int i7);

        void offsetPositionsForMove(int i6, int i7);

        void offsetPositionsForRemovingInvisible(int i6, int i7);

        void offsetPositionsForRemovingLaidOutOrNewView(int i6, int i7);

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

        public UpdateOp(int i6, int i7, int i8, Object obj) {
            this.cmd = i6;
            this.positionStart = i7;
            this.itemCount = i8;
            this.payload = obj;
        }

        public String cmdToString() {
            int i6 = this.cmd;
            return i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateOp)) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i6 = this.cmd;
            if (i6 != updateOp.cmd) {
                return false;
            }
            if (i6 == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
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
        boolean z6;
        char c7;
        int i6 = updateOp.positionStart;
        int i7 = updateOp.itemCount + i6;
        char c8 = 65535;
        int i8 = i6;
        int i9 = 0;
        while (i8 < i7) {
            if (this.mCallback.findViewHolder(i8) != null || canFindInPreLayout(i8)) {
                if (c8 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i6, i9, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                c7 = 1;
            } else {
                if (c8 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i6, i9, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                c7 = 0;
            }
            if (z6) {
                i8 -= i9;
                i7 -= i9;
                i9 = 1;
            } else {
                i9++;
            }
            i8++;
            c8 = c7;
        }
        if (i9 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i6, i9, null);
        }
        if (c8 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(UpdateOp updateOp) {
        int i6 = updateOp.positionStart;
        int i7 = updateOp.itemCount + i6;
        int i8 = 0;
        boolean z6 = -1;
        int i9 = i6;
        while (i6 < i7) {
            if (this.mCallback.findViewHolder(i6) != null || canFindInPreLayout(i6)) {
                if (!z6) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i9, i8, updateOp.payload));
                    i9 = i6;
                    i8 = 0;
                }
                z6 = true;
            } else {
                if (z6) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i9, i8, updateOp.payload));
                    i9 = i6;
                    i8 = 0;
                }
                z6 = false;
            }
            i8++;
            i6++;
        }
        if (i8 != updateOp.itemCount) {
            Object obj = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i9, i8, obj);
        }
        if (z6) {
            postponeAndUpdateViewHolders(updateOp);
        } else {
            dispatchAndUpdateViewHolders(updateOp);
        }
    }

    private boolean canFindInPreLayout(int i6) {
        int size = this.mPostponedList.size();
        for (int i7 = 0; i7 < size; i7++) {
            UpdateOp updateOp = this.mPostponedList.get(i7);
            int i8 = updateOp.cmd;
            if (i8 == 8) {
                if (findPositionOffset(updateOp.itemCount, i7 + 1) == i6) {
                    return true;
                }
            } else if (i8 == 1) {
                int i9 = updateOp.positionStart;
                int i10 = updateOp.itemCount + i9;
                while (i9 < i10) {
                    if (findPositionOffset(i9, i7 + 1) == i6) {
                        return true;
                    }
                    i9++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        int i6;
        int i7 = updateOp.cmd;
        if (i7 == 1 || i7 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iUpdatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, i7);
        int i8 = updateOp.positionStart;
        int i9 = updateOp.cmd;
        if (i9 == 2) {
            i6 = 0;
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i6 = 1;
        }
        int i10 = 1;
        for (int i11 = 1; i11 < updateOp.itemCount; i11++) {
            int iUpdatePositionWithPostponed2 = updatePositionWithPostponed(updateOp.positionStart + (i6 * i11), updateOp.cmd);
            int i12 = updateOp.cmd;
            if (i12 == 2 ? iUpdatePositionWithPostponed2 != iUpdatePositionWithPostponed : !(i12 == 4 && iUpdatePositionWithPostponed2 == iUpdatePositionWithPostponed + 1)) {
                UpdateOp updateOpObtainUpdateOp = obtainUpdateOp(i12, iUpdatePositionWithPostponed, i10, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp, i8);
                recycleUpdateOp(updateOpObtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i8 += i10;
                }
                i10 = 1;
                iUpdatePositionWithPostponed = iUpdatePositionWithPostponed2;
            } else {
                i10++;
            }
        }
        Object obj = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i10 > 0) {
            UpdateOp updateOpObtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, iUpdatePositionWithPostponed, i10, obj);
            dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp2, i8);
            recycleUpdateOp(updateOpObtainUpdateOp2);
        }
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i6 = updateOp.cmd;
        if (i6 == 1) {
            this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i6 == 2) {
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i6 == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else {
            if (i6 == 8) {
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    private int updatePositionWithPostponed(int i6, int i7) {
        int i8;
        int i9;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = this.mPostponedList.get(size);
            int i10 = updateOp.cmd;
            if (i10 == 8) {
                int i11 = updateOp.positionStart;
                int i12 = updateOp.itemCount;
                if (i11 < i12) {
                    i9 = i11;
                    i8 = i12;
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                if (i6 < i9 || i6 > i8) {
                    if (i6 < i11) {
                        if (i7 == 1) {
                            updateOp.positionStart = i11 + 1;
                            updateOp.itemCount = i12 + 1;
                        } else if (i7 == 2) {
                            updateOp.positionStart = i11 - 1;
                            updateOp.itemCount = i12 - 1;
                        }
                    }
                } else if (i9 == i11) {
                    if (i7 == 1) {
                        updateOp.itemCount = i12 + 1;
                    } else if (i7 == 2) {
                        updateOp.itemCount = i12 - 1;
                    }
                    i6++;
                } else {
                    if (i7 == 1) {
                        updateOp.positionStart = i11 + 1;
                    } else if (i7 == 2) {
                        updateOp.positionStart = i11 - 1;
                    }
                    i6--;
                }
            } else {
                int i13 = updateOp.positionStart;
                if (i13 <= i6) {
                    if (i10 == 1) {
                        i6 -= updateOp.itemCount;
                    } else if (i10 == 2) {
                        i6 += updateOp.itemCount;
                    }
                } else if (i7 == 1) {
                    updateOp.positionStart = i13 + 1;
                } else if (i7 == 2) {
                    updateOp.positionStart = i13 - 1;
                }
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = this.mPostponedList.get(size2);
            if (updateOp2.cmd == 8) {
                int i14 = updateOp2.itemCount;
                if (i14 == updateOp2.positionStart || i14 < 0) {
                    this.mPostponedList.remove(size2);
                    recycleUpdateOp(updateOp2);
                }
            } else if (updateOp2.itemCount <= 0) {
                this.mPostponedList.remove(size2);
                recycleUpdateOp(updateOp2);
            }
        }
        return i6;
    }

    public AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
        Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    public int applyPendingUpdatesToPosition(int i6) {
        int size = this.mPendingUpdates.size();
        for (int i7 = 0; i7 < size; i7++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i7);
            int i8 = updateOp.cmd;
            if (i8 != 1) {
                if (i8 == 2) {
                    int i9 = updateOp.positionStart;
                    if (i9 <= i6) {
                        int i10 = updateOp.itemCount;
                        if (i9 + i10 > i6) {
                            return -1;
                        }
                        i6 -= i10;
                    } else {
                        continue;
                    }
                } else if (i8 == 8) {
                    int i11 = updateOp.positionStart;
                    if (i11 == i6) {
                        i6 = updateOp.itemCount;
                    } else {
                        if (i11 < i6) {
                            i6--;
                        }
                        if (updateOp.itemCount <= i6) {
                            i6++;
                        }
                    }
                }
            } else if (updateOp.positionStart <= i6) {
                i6 += updateOp.itemCount;
            }
        }
        return i6;
    }

    public void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(i6));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i6 = 0; i6 < size; i6++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i6);
            int i7 = updateOp.cmd;
            if (i7 == 1) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i7 == 2) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
            } else if (i7 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i7 == 8) {
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

    public void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i6) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i7 = updateOp.cmd;
        if (i7 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i6, updateOp.itemCount);
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.mCallback.markViewHoldersUpdated(i6, updateOp.itemCount, updateOp.payload);
        }
    }

    public int findPositionOffset(int i6) {
        return findPositionOffset(i6, 0);
    }

    public boolean hasAnyUpdateTypes(int i6) {
        return (i6 & this.mExistingUpdateTypes) != 0;
    }

    public boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    public boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public UpdateOp obtainUpdateOp(int i6, int i7, int i8, Object obj) {
        UpdateOp updateOpAcquire = this.mUpdateOpPool.acquire();
        if (updateOpAcquire == null) {
            return new UpdateOp(i6, i7, i8, obj);
        }
        updateOpAcquire.cmd = i6;
        updateOpAcquire.positionStart = i7;
        updateOpAcquire.itemCount = i8;
        updateOpAcquire.payload = obj;
        return updateOpAcquire;
    }

    public boolean onItemRangeChanged(int i6, int i7, Object obj) {
        if (i7 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i6, i7, obj));
        this.mExistingUpdateTypes |= 4;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeInserted(int i6, int i7) {
        if (i7 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i6, i7, null));
        this.mExistingUpdateTypes |= 1;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeMoved(int i6, int i7, int i8) {
        if (i6 == i7) {
            return false;
        }
        if (i8 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.mPendingUpdates.add(obtainUpdateOp(8, i6, i7, null));
        this.mExistingUpdateTypes |= 8;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeRemoved(int i6, int i7) {
        if (i7 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i6, i7, null));
        this.mExistingUpdateTypes |= 2;
        return this.mPendingUpdates.size() == 1;
    }

    public void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i6 = 0; i6 < size; i6++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i6);
            int i7 = updateOp.cmd;
            if (i7 == 1) {
                applyAdd(updateOp);
            } else if (i7 == 2) {
                applyRemove(updateOp);
            } else if (i7 == 4) {
                applyUpdate(updateOp);
            } else if (i7 == 8) {
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
        for (int i6 = 0; i6 < size; i6++) {
            recycleUpdateOp(list.get(i6));
        }
        list.clear();
    }

    public void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public AdapterHelper(Callback callback, boolean z6) {
        this.mUpdateOpPool = new Pools.SimplePool(30);
        this.mPendingUpdates = new ArrayList<>();
        this.mPostponedList = new ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z6;
        this.mOpReorderer = new OpReorderer(this);
    }

    public int findPositionOffset(int i6, int i7) {
        int size = this.mPostponedList.size();
        while (i7 < size) {
            UpdateOp updateOp = this.mPostponedList.get(i7);
            int i8 = updateOp.cmd;
            if (i8 == 8) {
                int i9 = updateOp.positionStart;
                if (i9 == i6) {
                    i6 = updateOp.itemCount;
                } else {
                    if (i9 < i6) {
                        i6--;
                    }
                    if (updateOp.itemCount <= i6) {
                        i6++;
                    }
                }
            } else {
                int i10 = updateOp.positionStart;
                if (i10 > i6) {
                    continue;
                } else if (i8 == 2) {
                    int i11 = updateOp.itemCount;
                    if (i6 < i10 + i11) {
                        return -1;
                    }
                    i6 -= i11;
                } else if (i8 == 1) {
                    i6 += updateOp.itemCount;
                }
            }
            i7++;
        }
        return i6;
    }
}
