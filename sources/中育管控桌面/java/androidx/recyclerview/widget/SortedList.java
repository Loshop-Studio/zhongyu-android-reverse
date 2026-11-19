package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        final Callback<T2> mWrappedCallback;

        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
            this.mBatchingListUpdateCallback = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areContentsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areItemsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.mWrappedCallback.compare(t22, t23);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return this.mWrappedCallback.getChangePayload(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i6, int i7) {
            this.mBatchingListUpdateCallback.onChanged(i6, i7, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i6, int i7) {
            this.mBatchingListUpdateCallback.onInserted(i6, i7);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i6, int i7) {
            this.mBatchingListUpdateCallback.onMoved(i6, i7);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i6, int i7) {
            this.mBatchingListUpdateCallback.onRemoved(i6, i7);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i6, int i7, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i6, i7, obj);
        }
    }

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t22, T2 t23);

        public abstract boolean areItemsTheSame(T2 t22, T2 t23);

        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return null;
        }

        public abstract void onChanged(int i6, int i7);

        public void onChanged(int i6, int i7, Object obj) {
            onChanged(i6, i7);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iSortAndDedup = sortAndDedup(tArr);
        if (this.mSize != 0) {
            merge(tArr, iSortAndDedup);
            return;
        }
        this.mData = tArr;
        this.mSize = iSortAndDedup;
        this.mCallback.onInserted(0, iSortAndDedup);
    }

    private void addToData(int i6, T t6) {
        int i7 = this.mSize;
        if (i6 > i7) {
            throw new IndexOutOfBoundsException("cannot add item to " + i6 + " because size is " + this.mSize);
        }
        T[] tArr = this.mData;
        if (i7 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
            System.arraycopy(this.mData, 0, tArr2, 0, i6);
            tArr2[i6] = t6;
            System.arraycopy(this.mData, i6, tArr2, i6 + 1, this.mSize - i6);
            this.mData = tArr2;
        } else {
            System.arraycopy(tArr, i6, tArr, i6 + 1, i7 - i6);
            this.mData[i6] = t6;
        }
        this.mSize++;
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int findIndexOf(T t6, T[] tArr, int i6, int i7, int i8) {
        while (i6 < i7) {
            int i9 = (i6 + i7) / 2;
            T t7 = tArr[i9];
            int iCompare = this.mCallback.compare(t7, t6);
            if (iCompare < 0) {
                i6 = i9 + 1;
            } else {
                if (iCompare == 0) {
                    if (!this.mCallback.areItemsTheSame(t7, t6)) {
                        int iLinearEqualitySearch = linearEqualitySearch(t6, i9, i6, i7);
                        if (i8 != 1 || iLinearEqualitySearch != -1) {
                            return iLinearEqualitySearch;
                        }
                    }
                    return i9;
                }
                i7 = i9;
            }
        }
        if (i8 == 1) {
            return i6;
        }
        return -1;
    }

    private int findSameItem(T t6, T[] tArr, int i6, int i7) {
        while (i6 < i7) {
            if (this.mCallback.areItemsTheSame(tArr[i6], t6)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    private int linearEqualitySearch(T t6, int i6, int i7, int i8) {
        T t7;
        for (int i9 = i6 - 1; i9 >= i7; i9--) {
            T t8 = this.mData[i9];
            if (this.mCallback.compare(t8, t6) != 0) {
                break;
            }
            if (this.mCallback.areItemsTheSame(t8, t6)) {
                return i9;
            }
        }
        do {
            i6++;
            if (i6 >= i8) {
                return -1;
            }
            t7 = this.mData[i6];
            if (this.mCallback.compare(t7, t6) != 0) {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t7, t6));
        return i6;
    }

    private void merge(T[] tArr, int i6) {
        boolean z6 = this.mCallback instanceof BatchedCallback;
        if (!z6) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i7 = 0;
        this.mOldDataStart = 0;
        int i8 = this.mSize;
        this.mOldDataSize = i8;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, i8 + i6 + 10));
        this.mNewDataStart = 0;
        while (true) {
            int i9 = this.mOldDataStart;
            int i10 = this.mOldDataSize;
            if (i9 >= i10 && i7 >= i6) {
                break;
            }
            if (i9 == i10) {
                int i11 = i6 - i7;
                System.arraycopy(tArr, i7, this.mData, this.mNewDataStart, i11);
                int i12 = this.mNewDataStart + i11;
                this.mNewDataStart = i12;
                this.mSize += i11;
                this.mCallback.onInserted(i12 - i11, i11);
                break;
            }
            if (i7 == i6) {
                int i13 = i10 - i9;
                System.arraycopy(this.mOldData, i9, this.mData, this.mNewDataStart, i13);
                this.mNewDataStart += i13;
                break;
            }
            T t6 = this.mOldData[i9];
            T t7 = tArr[i7];
            int iCompare = this.mCallback.compare(t6, t7);
            if (iCompare > 0) {
                T[] tArr2 = this.mData;
                int i14 = this.mNewDataStart;
                this.mNewDataStart = i14 + 1;
                tArr2[i14] = t7;
                this.mSize++;
                i7++;
                this.mCallback.onInserted(i14, 1);
            } else if (iCompare == 0 && this.mCallback.areItemsTheSame(t6, t7)) {
                T[] tArr3 = this.mData;
                int i15 = this.mNewDataStart;
                this.mNewDataStart = i15 + 1;
                tArr3[i15] = t7;
                i7++;
                this.mOldDataStart++;
                if (!this.mCallback.areContentsTheSame(t6, t7)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t6, t7));
                }
            } else {
                T[] tArr4 = this.mData;
                int i16 = this.mNewDataStart;
                this.mNewDataStart = i16 + 1;
                tArr4[i16] = t6;
                this.mOldDataStart++;
            }
        }
        this.mOldData = null;
        if (z6) {
            return;
        }
        endBatchedUpdates();
    }

    private void removeItemAtIndex(int i6, boolean z6) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i6 + 1, tArr, i6, (this.mSize - i6) - 1);
        int i7 = this.mSize - 1;
        this.mSize = i7;
        this.mData[i7] = null;
        if (z6) {
            this.mCallback.onRemoved(i6, 1);
        }
    }

    private void replaceAllInsert(T t6) {
        T[] tArr = this.mData;
        int i6 = this.mNewDataStart;
        tArr[i6] = t6;
        this.mNewDataStart = i6 + 1;
        this.mSize++;
        this.mCallback.onInserted(i6, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        boolean z6 = this.mCallback instanceof BatchedCallback;
        if (!z6) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int iSortAndDedup = sortAndDedup(tArr);
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, iSortAndDedup));
        while (true) {
            int i6 = this.mNewDataStart;
            if (i6 >= iSortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i7 = this.mOldDataStart;
            int i8 = this.mOldDataSize;
            if (i7 >= i8) {
                int i9 = iSortAndDedup - i6;
                System.arraycopy(tArr, i6, this.mData, i6, i9);
                this.mNewDataStart += i9;
                this.mSize += i9;
                this.mCallback.onInserted(i6, i9);
                break;
            }
            if (i6 >= iSortAndDedup) {
                int i10 = i8 - i7;
                this.mSize -= i10;
                this.mCallback.onRemoved(i6, i10);
                break;
            }
            T t6 = this.mOldData[i7];
            T t7 = tArr[i6];
            int iCompare = this.mCallback.compare(t6, t7);
            if (iCompare < 0) {
                replaceAllRemove();
            } else if (iCompare > 0) {
                replaceAllInsert(t7);
            } else if (this.mCallback.areItemsTheSame(t6, t7)) {
                T[] tArr2 = this.mData;
                int i11 = this.mNewDataStart;
                tArr2[i11] = t7;
                this.mOldDataStart++;
                this.mNewDataStart = i11 + 1;
                if (!this.mCallback.areContentsTheSame(t6, t7)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t6, t7));
                }
            } else {
                replaceAllRemove();
                replaceAllInsert(t7);
            }
        }
        this.mOldData = null;
        if (z6) {
            return;
        }
        endBatchedUpdates();
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i6 = 0;
        int i7 = 1;
        for (int i8 = 1; i8 < tArr.length; i8++) {
            T t6 = tArr[i8];
            if (this.mCallback.compare(tArr[i6], t6) == 0) {
                int iFindSameItem = findSameItem(t6, tArr, i6, i7);
                if (iFindSameItem != -1) {
                    tArr[iFindSameItem] = t6;
                } else {
                    if (i7 != i8) {
                        tArr[i7] = t6;
                    }
                    i7++;
                }
            } else {
                if (i7 != i8) {
                    tArr[i7] = t6;
                }
                i6 = i7;
                i7++;
            }
        }
        return i7;
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t6) {
        throwIfInMutationOperation();
        return add(t6, true);
    }

    public void addAll(@NonNull T[] tArr, boolean z6) {
        throwIfInMutationOperation();
        if (tArr.length == 0) {
            return;
        }
        if (z6) {
            addAllInternal(tArr);
        } else {
            addAllInternal(copyArray(tArr));
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.mBatchedCallback == null) {
            this.mBatchedCallback = new BatchedCallback(callback);
        }
        this.mCallback = this.mBatchedCallback;
    }

    public void clear() {
        throwIfInMutationOperation();
        int i6 = this.mSize;
        if (i6 == 0) {
            return;
        }
        Arrays.fill(this.mData, 0, i6, (Object) null);
        this.mSize = 0;
        this.mCallback.onRemoved(0, i6);
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    public T get(int i6) {
        int i7;
        if (i6 < this.mSize && i6 >= 0) {
            T[] tArr = this.mOldData;
            return (tArr == null || i6 < (i7 = this.mNewDataStart)) ? this.mData[i6] : tArr[(i6 - i7) + this.mOldDataStart];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i6 + " but size is " + this.mSize);
    }

    public int indexOf(T t6) {
        if (this.mOldData == null) {
            return findIndexOf(t6, this.mData, 0, this.mSize, 4);
        }
        int iFindIndexOf = findIndexOf(t6, this.mData, 0, this.mNewDataStart, 4);
        if (iFindIndexOf != -1) {
            return iFindIndexOf;
        }
        int iFindIndexOf2 = findIndexOf(t6, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
        if (iFindIndexOf2 != -1) {
            return (iFindIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
        }
        return -1;
    }

    public void recalculatePositionOfItemAt(int i6) {
        throwIfInMutationOperation();
        T t6 = get(i6);
        removeItemAtIndex(i6, false);
        int iAdd = add(t6, false);
        if (i6 != iAdd) {
            this.mCallback.onMoved(i6, iAdd);
        }
    }

    public boolean remove(T t6) {
        throwIfInMutationOperation();
        return remove(t6, true);
    }

    public T removeItemAt(int i6) {
        throwIfInMutationOperation();
        T t6 = get(i6);
        removeItemAtIndex(i6, true);
        return t6;
    }

    public void replaceAll(@NonNull T[] tArr, boolean z6) {
        throwIfInMutationOperation();
        if (z6) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i6, T t6) {
        throwIfInMutationOperation();
        T t7 = get(i6);
        boolean z6 = t7 == t6 || !this.mCallback.areContentsTheSame(t7, t6);
        if (t7 != t6 && this.mCallback.compare(t7, t6) == 0) {
            this.mData[i6] = t6;
            if (z6) {
                Callback callback = this.mCallback;
                callback.onChanged(i6, 1, callback.getChangePayload(t7, t6));
                return;
            }
            return;
        }
        if (z6) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i6, 1, callback2.getChangePayload(t7, t6));
        }
        removeItemAtIndex(i6, false);
        int iAdd = add(t6, false);
        if (i6 != iAdd) {
            this.mCallback.onMoved(i6, iAdd);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i6) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i6));
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t6, boolean z6) {
        int iFindIndexOf = findIndexOf(t6, this.mData, 0, this.mSize, 1);
        if (iFindIndexOf == -1) {
            iFindIndexOf = 0;
        } else if (iFindIndexOf < this.mSize) {
            T t7 = this.mData[iFindIndexOf];
            if (this.mCallback.areItemsTheSame(t7, t6)) {
                if (this.mCallback.areContentsTheSame(t7, t6)) {
                    this.mData[iFindIndexOf] = t6;
                    return iFindIndexOf;
                }
                this.mData[iFindIndexOf] = t6;
                Callback callback = this.mCallback;
                callback.onChanged(iFindIndexOf, 1, callback.getChangePayload(t7, t6));
                return iFindIndexOf;
            }
        }
        addToData(iFindIndexOf, t6);
        if (z6) {
            this.mCallback.onInserted(iFindIndexOf, 1);
        }
        return iFindIndexOf;
    }

    private boolean remove(T t6, boolean z6) {
        int iFindIndexOf = findIndexOf(t6, this.mData, 0, this.mSize, 2);
        if (iFindIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(iFindIndexOf, z6);
        return true;
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }
}
