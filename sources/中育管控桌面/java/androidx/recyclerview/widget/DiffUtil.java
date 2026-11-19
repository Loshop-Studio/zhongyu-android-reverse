package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class DiffUtil {
    private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.f1008x - diagonal2.f1008x;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i6, int i7);

        public abstract boolean areItemsTheSame(int i6, int i7);

        @Nullable
        public Object getChangePayload(int i6, int i7) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        public CenteredArray(int i6) {
            int[] iArr = new int[i6];
            this.mData = iArr;
            this.mMid = iArr.length / 2;
        }

        public int[] backingData() {
            return this.mData;
        }

        public void fill(int i6) {
            Arrays.fill(this.mData, i6);
        }

        public int get(int i6) {
            return this.mData[i6 + this.mMid];
        }

        public void set(int i6, int i7) {
            this.mData[i6 + this.mMid] = i7;
        }
    }

    public static class Diagonal {
        public final int size;

        /* renamed from: x */
        public final int f1008x;

        /* renamed from: y */
        public final int f1009y;

        public Diagonal(int i6, int i7, int i8) {
            this.f1008x = i6;
            this.f1009y = i7;
            this.size = i8;
        }

        public int endX() {
            return this.f1008x + this.size;
        }

        public int endY() {
            return this.f1009y + this.size;
        }
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final List<Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        public DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z6) {
            this.mDiagonals = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z6;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal diagonal = this.mDiagonals.isEmpty() ? null : this.mDiagonals.get(0);
            if (diagonal == null || diagonal.f1008x != 0 || diagonal.f1009y != 0) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingAddition(int i6) {
            int size = this.mDiagonals.size();
            int iEndY = 0;
            for (int i7 = 0; i7 < size; i7++) {
                Diagonal diagonal = this.mDiagonals.get(i7);
                while (iEndY < diagonal.f1009y) {
                    if (this.mNewItemStatuses[iEndY] == 0 && this.mCallback.areItemsTheSame(i6, iEndY)) {
                        int i8 = this.mCallback.areContentsTheSame(i6, iEndY) ? 8 : 4;
                        this.mOldItemStatuses[i6] = (iEndY << 4) | i8;
                        this.mNewItemStatuses[iEndY] = (i6 << 4) | i8;
                        return;
                    }
                    iEndY++;
                }
                iEndY = diagonal.endY();
            }
        }

        private void findMatchingItems() {
            for (Diagonal diagonal : this.mDiagonals) {
                for (int i6 = 0; i6 < diagonal.size; i6++) {
                    int i7 = diagonal.f1008x + i6;
                    int i8 = diagonal.f1009y + i6;
                    int i9 = this.mCallback.areContentsTheSame(i7, i8) ? 1 : 2;
                    this.mOldItemStatuses[i7] = (i8 << 4) | i9;
                    this.mNewItemStatuses[i8] = (i7 << 4) | i9;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int iEndX = 0;
            for (Diagonal diagonal : this.mDiagonals) {
                while (iEndX < diagonal.f1008x) {
                    if (this.mOldItemStatuses[iEndX] == 0) {
                        findMatchingAddition(iEndX);
                    }
                    iEndX++;
                }
                iEndX = diagonal.endX();
            }
        }

        @Nullable
        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> collection, int i6, boolean z6) {
            PostponedUpdate next;
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.posInOwnerList == i6 && next.removal == z6) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next2 = it.next();
                if (z6) {
                    next2.currentPos--;
                } else {
                    next2.currentPos++;
                }
            }
            return next;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i6) {
            if (i6 >= 0 && i6 < this.mNewListSize) {
                int i7 = this.mNewItemStatuses[i6];
                if ((i7 & 15) == 0) {
                    return -1;
                }
                return i7 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i6 + ", new list size = " + this.mNewListSize);
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i6) {
            if (i6 >= 0 && i6 < this.mOldListSize) {
                int i7 = this.mOldItemStatuses[i6];
                if ((i7 & 15) == 0) {
                    return -1;
                }
                return i7 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i6 + ", old list size = " + this.mOldListSize);
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            int i6;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            int i7 = this.mOldListSize;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i8 = this.mOldListSize;
            int i9 = this.mNewListSize;
            for (int size = this.mDiagonals.size() - 1; size >= 0; size--) {
                Diagonal diagonal = this.mDiagonals.get(size);
                int iEndX = diagonal.endX();
                int iEndY = diagonal.endY();
                while (true) {
                    if (i8 <= iEndX) {
                        break;
                    }
                    i8--;
                    int i10 = this.mOldItemStatuses[i8];
                    if ((i10 & 12) != 0) {
                        int i11 = i10 >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i11, false);
                        if (postponedUpdate != null) {
                            int i12 = (i7 - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i8, i12);
                            if ((i10 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i12, 1, this.mCallback.getChangePayload(i8, i11));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i8, (i7 - i8) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i8, 1);
                        i7--;
                    }
                }
                while (i9 > iEndY) {
                    i9--;
                    int i13 = this.mNewItemStatuses[i9];
                    if ((i13 & 12) != 0) {
                        int i14 = i13 >> 4;
                        PostponedUpdate postponedUpdate2 = getPostponedUpdate(arrayDeque, i14, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new PostponedUpdate(i9, i7 - i8, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i7 - postponedUpdate2.currentPos) - 1, i8);
                            if ((i13 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i8, 1, this.mCallback.getChangePayload(i14, i9));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i8, 1);
                        i7++;
                    }
                }
                int i15 = diagonal.f1008x;
                int i16 = diagonal.f1009y;
                for (i6 = 0; i6 < diagonal.size; i6++) {
                    if ((this.mOldItemStatuses[i15] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i15, 1, this.mCallback.getChangePayload(i15, i16));
                    }
                    i15++;
                    i16++;
                }
                i8 = diagonal.f1008x;
                i9 = diagonal.f1009y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t6, @NonNull T t7);

        public abstract boolean areItemsTheSame(@NonNull T t6, @NonNull T t7);

        @Nullable
        public Object getChangePayload(@NonNull T t6, @NonNull T t7) {
            return null;
        }
    }

    public static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i6, int i7, boolean z6) {
            this.posInOwnerList = i6;
            this.currentPos = i7;
            this.removal = z6;
        }
    }

    public static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        public int newSize() {
            return this.newListEnd - this.newListStart;
        }

        public int oldSize() {
            return this.oldListEnd - this.oldListStart;
        }

        public Range(int i6, int i7, int i8, int i9) {
            this.oldListStart = i6;
            this.oldListEnd = i7;
            this.newListStart = i8;
            this.newListEnd = i9;
        }
    }

    public static class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        public int diagonalSize() {
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }

        public boolean hasAdditionOrRemoval() {
            return this.endY - this.startY != this.endX - this.startX;
        }

        public boolean isAddition() {
            return this.endY - this.startY > this.endX - this.startX;
        }

        @NonNull
        public Diagonal toDiagonal() {
            if (hasAdditionOrRemoval()) {
                return this.reverse ? new Diagonal(this.startX, this.startY, diagonalSize()) : isAddition() ? new Diagonal(this.startX, this.startY + 1, diagonalSize()) : new Diagonal(this.startX + 1, this.startY, diagonalSize());
            }
            int i6 = this.startX;
            return new Diagonal(i6, this.startY, this.endX - i6);
        }
    }

    private DiffUtil() {
    }

    @Nullable
    private static Snake backward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i6) {
        int i7;
        int i8;
        int i9;
        boolean z6 = (range.oldSize() - range.newSize()) % 2 == 0;
        int iOldSize = range.oldSize() - range.newSize();
        int i10 = -i6;
        for (int i11 = i10; i11 <= i6; i11 += 2) {
            if (i11 == i10 || (i11 != i6 && centeredArray2.get(i11 + 1) < centeredArray2.get(i11 - 1))) {
                i7 = centeredArray2.get(i11 + 1);
                i8 = i7;
            } else {
                i7 = centeredArray2.get(i11 - 1);
                i8 = i7 - 1;
            }
            int i12 = range.newListEnd - ((range.oldListEnd - i8) - i11);
            int i13 = (i6 == 0 || i8 != i7) ? i12 : i12 + 1;
            while (i8 > range.oldListStart && i12 > range.newListStart && callback.areItemsTheSame(i8 - 1, i12 - 1)) {
                i8--;
                i12--;
            }
            centeredArray2.set(i11, i8);
            if (z6 && (i9 = iOldSize - i11) >= i10 && i9 <= i6 && centeredArray.get(i9) >= i8) {
                Snake snake = new Snake();
                snake.startX = i8;
                snake.startY = i12;
                snake.endX = i7;
                snake.endY = i13;
                snake.reverse = true;
                return snake;
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    @Nullable
    private static Snake forward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i6) {
        int i7;
        int i8;
        int i9;
        boolean z6 = Math.abs(range.oldSize() - range.newSize()) % 2 == 1;
        int iOldSize = range.oldSize() - range.newSize();
        int i10 = -i6;
        for (int i11 = i10; i11 <= i6; i11 += 2) {
            if (i11 == i10 || (i11 != i6 && centeredArray.get(i11 + 1) > centeredArray.get(i11 - 1))) {
                i7 = centeredArray.get(i11 + 1);
                i8 = i7;
            } else {
                i7 = centeredArray.get(i11 - 1);
                i8 = i7 + 1;
            }
            int i12 = (range.newListStart + (i8 - range.oldListStart)) - i11;
            int i13 = (i6 == 0 || i8 != i7) ? i12 : i12 - 1;
            while (i8 < range.oldListEnd && i12 < range.newListEnd && callback.areItemsTheSame(i8, i12)) {
                i8++;
                i12++;
            }
            centeredArray.set(i11, i8);
            if (z6 && (i9 = iOldSize - i11) >= i10 + 1 && i9 <= i6 - 1 && centeredArray2.get(i9) <= i8) {
                Snake snake = new Snake();
                snake.startX = i7;
                snake.startY = i13;
                snake.endX = i8;
                snake.endY = i12;
                snake.reverse = false;
                return snake;
            }
        }
        return null;
    }

    @Nullable
    private static Snake midPoint(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2) {
        if (range.oldSize() >= 1 && range.newSize() >= 1) {
            int iOldSize = ((range.oldSize() + range.newSize()) + 1) / 2;
            centeredArray.set(1, range.oldListStart);
            centeredArray2.set(1, range.oldListEnd);
            for (int i6 = 0; i6 < iOldSize; i6++) {
                Snake snakeForward = forward(range, callback, centeredArray, centeredArray2, i6);
                if (snakeForward != null) {
                    return snakeForward;
                }
                Snake snakeBackward = backward(range, callback, centeredArray, centeredArray2, i6);
                if (snakeBackward != null) {
                    return snakeBackward;
                }
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z6) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int i6 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i6);
        CenteredArray centeredArray2 = new CenteredArray(i6);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake snakeMidPoint = midPoint(range, callback, centeredArray, centeredArray2);
            if (snakeMidPoint != null) {
                if (snakeMidPoint.diagonalSize() > 0) {
                    arrayList.add(snakeMidPoint.toDiagonal());
                }
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                range2.oldListEnd = snakeMidPoint.startX;
                range2.newListEnd = snakeMidPoint.startY;
                arrayList2.add(range2);
                range.oldListEnd = range.oldListEnd;
                range.newListEnd = range.newListEnd;
                range.oldListStart = snakeMidPoint.endX;
                range.newListStart = snakeMidPoint.endY;
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, DIAGONAL_COMPARATOR);
        return new DiffResult(callback, arrayList, centeredArray.backingData(), centeredArray2.backingData(), z6);
    }
}
