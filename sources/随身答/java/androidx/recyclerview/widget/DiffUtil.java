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
            return diagonal.f1959x - diagonal2.f1959x;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i9, int i10);

        public abstract boolean areItemsTheSame(int i9, int i10);

        @Nullable
        public Object getChangePayload(int i9, int i10) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        public CenteredArray(int i9) {
            int[] iArr = new int[i9];
            this.mData = iArr;
            this.mMid = iArr.length / 2;
        }

        public int[] backingData() {
            return this.mData;
        }

        public void fill(int i9) {
            Arrays.fill(this.mData, i9);
        }

        public int get(int i9) {
            return this.mData[i9 + this.mMid];
        }

        public void set(int i9, int i10) {
            this.mData[i9 + this.mMid] = i10;
        }
    }

    public static class Diagonal {
        public final int size;

        /* renamed from: x */
        public final int f1959x;

        /* renamed from: y */
        public final int f1960y;

        public Diagonal(int i9, int i10, int i11) {
            this.f1959x = i9;
            this.f1960y = i10;
            this.size = i11;
        }

        public int endX() {
            return this.f1959x + this.size;
        }

        public int endY() {
            return this.f1960y + this.size;
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

        public DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z9) {
            this.mDiagonals = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z9;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal diagonal = this.mDiagonals.isEmpty() ? null : this.mDiagonals.get(0);
            if (diagonal == null || diagonal.f1959x != 0 || diagonal.f1960y != 0) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingAddition(int i9) {
            int size = this.mDiagonals.size();
            int iEndY = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Diagonal diagonal = this.mDiagonals.get(i10);
                while (iEndY < diagonal.f1960y) {
                    if (this.mNewItemStatuses[iEndY] == 0 && this.mCallback.areItemsTheSame(i9, iEndY)) {
                        int i11 = this.mCallback.areContentsTheSame(i9, iEndY) ? 8 : 4;
                        this.mOldItemStatuses[i9] = (iEndY << 4) | i11;
                        this.mNewItemStatuses[iEndY] = (i9 << 4) | i11;
                        return;
                    }
                    iEndY++;
                }
                iEndY = diagonal.endY();
            }
        }

        private void findMatchingItems() {
            for (Diagonal diagonal : this.mDiagonals) {
                for (int i9 = 0; i9 < diagonal.size; i9++) {
                    int i10 = diagonal.f1959x + i9;
                    int i11 = diagonal.f1960y + i9;
                    int i12 = this.mCallback.areContentsTheSame(i10, i11) ? 1 : 2;
                    this.mOldItemStatuses[i10] = (i11 << 4) | i12;
                    this.mNewItemStatuses[i11] = (i10 << 4) | i12;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int iEndX = 0;
            for (Diagonal diagonal : this.mDiagonals) {
                while (iEndX < diagonal.f1959x) {
                    if (this.mOldItemStatuses[iEndX] == 0) {
                        findMatchingAddition(iEndX);
                    }
                    iEndX++;
                }
                iEndX = diagonal.endX();
            }
        }

        @Nullable
        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> collection, int i9, boolean z9) {
            PostponedUpdate next;
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.posInOwnerList == i9 && next.removal == z9) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next2 = it.next();
                if (z9) {
                    next2.currentPos--;
                } else {
                    next2.currentPos++;
                }
            }
            return next;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i9) {
            if (i9 >= 0 && i9 < this.mNewListSize) {
                int i10 = this.mNewItemStatuses[i9];
                if ((i10 & 15) == 0) {
                    return -1;
                }
                return i10 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i9 + ", new list size = " + this.mNewListSize);
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i9) {
            if (i9 >= 0 && i9 < this.mOldListSize) {
                int i10 = this.mOldItemStatuses[i9];
                if ((i10 & 15) == 0) {
                    return -1;
                }
                return i10 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i9 + ", old list size = " + this.mOldListSize);
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            int i9;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            int i10 = this.mOldListSize;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i11 = this.mOldListSize;
            int i12 = this.mNewListSize;
            for (int size = this.mDiagonals.size() - 1; size >= 0; size--) {
                Diagonal diagonal = this.mDiagonals.get(size);
                int iEndX = diagonal.endX();
                int iEndY = diagonal.endY();
                while (true) {
                    if (i11 <= iEndX) {
                        break;
                    }
                    i11--;
                    int i13 = this.mOldItemStatuses[i11];
                    if ((i13 & 12) != 0) {
                        int i14 = i13 >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i14, false);
                        if (postponedUpdate != null) {
                            int i15 = (i10 - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i11, i15);
                            if ((i13 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i15, 1, this.mCallback.getChangePayload(i11, i14));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i11, (i10 - i11) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i11, 1);
                        i10--;
                    }
                }
                while (i12 > iEndY) {
                    i12--;
                    int i16 = this.mNewItemStatuses[i12];
                    if ((i16 & 12) != 0) {
                        int i17 = i16 >> 4;
                        PostponedUpdate postponedUpdate2 = getPostponedUpdate(arrayDeque, i17, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new PostponedUpdate(i12, i10 - i11, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i10 - postponedUpdate2.currentPos) - 1, i11);
                            if ((i16 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i11, 1, this.mCallback.getChangePayload(i17, i12));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i11, 1);
                        i10++;
                    }
                }
                int i18 = diagonal.f1959x;
                int i19 = diagonal.f1960y;
                for (i9 = 0; i9 < diagonal.size; i9++) {
                    if ((this.mOldItemStatuses[i18] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i18, 1, this.mCallback.getChangePayload(i18, i19));
                    }
                    i18++;
                    i19++;
                }
                i11 = diagonal.f1959x;
                i12 = diagonal.f1960y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t9, @NonNull T t10);

        public abstract boolean areItemsTheSame(@NonNull T t9, @NonNull T t10);

        @Nullable
        public Object getChangePayload(@NonNull T t9, @NonNull T t10) {
            return null;
        }
    }

    public static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i9, int i10, boolean z9) {
            this.posInOwnerList = i9;
            this.currentPos = i10;
            this.removal = z9;
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

        public Range(int i9, int i10, int i11, int i12) {
            this.oldListStart = i9;
            this.oldListEnd = i10;
            this.newListStart = i11;
            this.newListEnd = i12;
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
            int i9 = this.startX;
            return new Diagonal(i9, this.startY, this.endX - i9);
        }
    }

    private DiffUtil() {
    }

    @Nullable
    private static Snake backward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i9) {
        int i10;
        int i11;
        int i12;
        boolean z9 = (range.oldSize() - range.newSize()) % 2 == 0;
        int iOldSize = range.oldSize() - range.newSize();
        int i13 = -i9;
        for (int i14 = i13; i14 <= i9; i14 += 2) {
            if (i14 == i13 || (i14 != i9 && centeredArray2.get(i14 + 1) < centeredArray2.get(i14 - 1))) {
                i10 = centeredArray2.get(i14 + 1);
                i11 = i10;
            } else {
                i10 = centeredArray2.get(i14 - 1);
                i11 = i10 - 1;
            }
            int i15 = range.newListEnd - ((range.oldListEnd - i11) - i14);
            int i16 = (i9 == 0 || i11 != i10) ? i15 : i15 + 1;
            while (i11 > range.oldListStart && i15 > range.newListStart && callback.areItemsTheSame(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            centeredArray2.set(i14, i11);
            if (z9 && (i12 = iOldSize - i14) >= i13 && i12 <= i9 && centeredArray.get(i12) >= i11) {
                Snake snake = new Snake();
                snake.startX = i11;
                snake.startY = i15;
                snake.endX = i10;
                snake.endY = i16;
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
    private static Snake forward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i9) {
        int i10;
        int i11;
        int i12;
        boolean z9 = Math.abs(range.oldSize() - range.newSize()) % 2 == 1;
        int iOldSize = range.oldSize() - range.newSize();
        int i13 = -i9;
        for (int i14 = i13; i14 <= i9; i14 += 2) {
            if (i14 == i13 || (i14 != i9 && centeredArray.get(i14 + 1) > centeredArray.get(i14 - 1))) {
                i10 = centeredArray.get(i14 + 1);
                i11 = i10;
            } else {
                i10 = centeredArray.get(i14 - 1);
                i11 = i10 + 1;
            }
            int i15 = (range.newListStart + (i11 - range.oldListStart)) - i14;
            int i16 = (i9 == 0 || i11 != i10) ? i15 : i15 - 1;
            while (i11 < range.oldListEnd && i15 < range.newListEnd && callback.areItemsTheSame(i11, i15)) {
                i11++;
                i15++;
            }
            centeredArray.set(i14, i11);
            if (z9 && (i12 = iOldSize - i14) >= i13 + 1 && i12 <= i9 - 1 && centeredArray2.get(i12) <= i11) {
                Snake snake = new Snake();
                snake.startX = i10;
                snake.startY = i16;
                snake.endX = i11;
                snake.endY = i15;
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
            for (int i9 = 0; i9 < iOldSize; i9++) {
                Snake snakeForward = forward(range, callback, centeredArray, centeredArray2, i9);
                if (snakeForward != null) {
                    return snakeForward;
                }
                Snake snakeBackward = backward(range, callback, centeredArray, centeredArray2, i9);
                if (snakeBackward != null) {
                    return snakeBackward;
                }
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z9) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int i9 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i9);
        CenteredArray centeredArray2 = new CenteredArray(i9);
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
        return new DiffResult(callback, arrayList, centeredArray.backingData(), centeredArray2.backingData(), z9);
    }
}
