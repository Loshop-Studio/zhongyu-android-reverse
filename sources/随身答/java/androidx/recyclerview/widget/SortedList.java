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
        public void onChanged(int i9, int i10) {
            this.mBatchingListUpdateCallback.onChanged(i9, i10, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i9, int i10) {
            this.mBatchingListUpdateCallback.onInserted(i9, i10);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i9, int i10) {
            this.mBatchingListUpdateCallback.onMoved(i9, i10);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i9, int i10) {
            this.mBatchingListUpdateCallback.onRemoved(i9, i10);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i9, int i10, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i9, i10, obj);
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

        public abstract void onChanged(int i9, int i10);

        public void onChanged(int i9, int i10, Object obj) {
            onChanged(i9, i10);
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

    private void addToData(int i9, T t9) {
        int i10 = this.mSize;
        if (i9 > i10) {
            throw new IndexOutOfBoundsException("cannot add item to " + i9 + " because size is " + this.mSize);
        }
        T[] tArr = this.mData;
        if (i10 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
            System.arraycopy(this.mData, 0, tArr2, 0, i9);
            tArr2[i9] = t9;
            System.arraycopy(this.mData, i9, tArr2, i9 + 1, this.mSize - i9);
            this.mData = tArr2;
        } else {
            System.arraycopy(tArr, i9, tArr, i9 + 1, i10 - i9);
            this.mData[i9] = t9;
        }
        this.mSize++;
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int findIndexOf(T t9, T[] tArr, int i9, int i10, int i11) {
        while (i9 < i10) {
            int i12 = (i9 + i10) / 2;
            T t10 = tArr[i12];
            int iCompare = this.mCallback.compare(t10, t9);
            if (iCompare < 0) {
                i9 = i12 + 1;
            } else {
                if (iCompare == 0) {
                    if (!this.mCallback.areItemsTheSame(t10, t9)) {
                        int iLinearEqualitySearch = linearEqualitySearch(t9, i12, i9, i10);
                        if (i11 != 1 || iLinearEqualitySearch != -1) {
                            return iLinearEqualitySearch;
                        }
                    }
                    return i12;
                }
                i10 = i12;
            }
        }
        if (i11 == 1) {
            return i9;
        }
        return -1;
    }

    private int findSameItem(T t9, T[] tArr, int i9, int i10) {
        while (i9 < i10) {
            if (this.mCallback.areItemsTheSame(tArr[i9], t9)) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    private int linearEqualitySearch(T t9, int i9, int i10, int i11) {
        T t10;
        for (int i12 = i9 - 1; i12 >= i10; i12--) {
            T t11 = this.mData[i12];
            if (this.mCallback.compare(t11, t9) != 0) {
                break;
            }
            if (this.mCallback.areItemsTheSame(t11, t9)) {
                return i12;
            }
        }
        do {
            i9++;
            if (i9 >= i11) {
                return -1;
            }
            t10 = this.mData[i9];
            if (this.mCallback.compare(t10, t9) != 0) {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t10, t9));
        return i9;
    }

    private void merge(T[] tArr, int i9) {
        boolean z9 = this.mCallback instanceof BatchedCallback;
        if (!z9) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i10 = 0;
        this.mOldDataStart = 0;
        int i11 = this.mSize;
        this.mOldDataSize = i11;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, i11 + i9 + 10));
        this.mNewDataStart = 0;
        while (true) {
            int i12 = this.mOldDataStart;
            int i13 = this.mOldDataSize;
            if (i12 >= i13 && i10 >= i9) {
                break;
            }
            if (i12 == i13) {
                int i14 = i9 - i10;
                System.arraycopy(tArr, i10, this.mData, this.mNewDataStart, i14);
                int i15 = this.mNewDataStart + i14;
                this.mNewDataStart = i15;
                this.mSize += i14;
                this.mCallback.onInserted(i15 - i14, i14);
                break;
            }
            if (i10 == i9) {
                int i16 = i13 - i12;
                System.arraycopy(this.mOldData, i12, this.mData, this.mNewDataStart, i16);
                this.mNewDataStart += i16;
                break;
            }
            T t9 = this.mOldData[i12];
            T t10 = tArr[i10];
            int iCompare = this.mCallback.compare(t9, t10);
            if (iCompare > 0) {
                T[] tArr2 = this.mData;
                int i17 = this.mNewDataStart;
                this.mNewDataStart = i17 + 1;
                tArr2[i17] = t10;
                this.mSize++;
                i10++;
                this.mCallback.onInserted(i17, 1);
            } else if (iCompare == 0 && this.mCallback.areItemsTheSame(t9, t10)) {
                T[] tArr3 = this.mData;
                int i18 = this.mNewDataStart;
                this.mNewDataStart = i18 + 1;
                tArr3[i18] = t10;
                i10++;
                this.mOldDataStart++;
                if (!this.mCallback.areContentsTheSame(t9, t10)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t9, t10));
                }
            } else {
                T[] tArr4 = this.mData;
                int i19 = this.mNewDataStart;
                this.mNewDataStart = i19 + 1;
                tArr4[i19] = t9;
                this.mOldDataStart++;
            }
        }
        this.mOldData = null;
        if (z9) {
            return;
        }
        endBatchedUpdates();
    }

    private void removeItemAtIndex(int i9, boolean z9) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i9 + 1, tArr, i9, (this.mSize - i9) - 1);
        int i10 = this.mSize - 1;
        this.mSize = i10;
        this.mData[i10] = null;
        if (z9) {
            this.mCallback.onRemoved(i9, 1);
        }
    }

    private void replaceAllInsert(T t9) {
        T[] tArr = this.mData;
        int i9 = this.mNewDataStart;
        tArr[i9] = t9;
        this.mNewDataStart = i9 + 1;
        this.mSize++;
        this.mCallback.onInserted(i9, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        boolean z9 = this.mCallback instanceof BatchedCallback;
        if (!z9) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int iSortAndDedup = sortAndDedup(tArr);
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, iSortAndDedup));
        while (true) {
            int i9 = this.mNewDataStart;
            if (i9 >= iSortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i10 = this.mOldDataStart;
            int i11 = this.mOldDataSize;
            if (i10 >= i11) {
                int i12 = iSortAndDedup - i9;
                System.arraycopy(tArr, i9, this.mData, i9, i12);
                this.mNewDataStart += i12;
                this.mSize += i12;
                this.mCallback.onInserted(i9, i12);
                break;
            }
            if (i9 >= iSortAndDedup) {
                int i13 = i11 - i10;
                this.mSize -= i13;
                this.mCallback.onRemoved(i9, i13);
                break;
            }
            T t9 = this.mOldData[i10];
            T t10 = tArr[i9];
            int iCompare = this.mCallback.compare(t9, t10);
            if (iCompare < 0) {
                replaceAllRemove();
            } else if (iCompare > 0) {
                replaceAllInsert(t10);
            } else if (this.mCallback.areItemsTheSame(t9, t10)) {
                T[] tArr2 = this.mData;
                int i14 = this.mNewDataStart;
                tArr2[i14] = t10;
                this.mOldDataStart++;
                this.mNewDataStart = i14 + 1;
                if (!this.mCallback.areContentsTheSame(t9, t10)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t9, t10));
                }
            } else {
                replaceAllRemove();
                replaceAllInsert(t10);
            }
        }
        this.mOldData = null;
        if (z9) {
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
        int i9 = 0;
        int i10 = 1;
        for (int i11 = 1; i11 < tArr.length; i11++) {
            T t9 = tArr[i11];
            if (this.mCallback.compare(tArr[i9], t9) == 0) {
                int iFindSameItem = findSameItem(t9, tArr, i9, i10);
                if (iFindSameItem != -1) {
                    tArr[iFindSameItem] = t9;
                } else {
                    if (i10 != i11) {
                        tArr[i10] = t9;
                    }
                    i10++;
                }
            } else {
                if (i10 != i11) {
                    tArr[i10] = t9;
                }
                i9 = i10;
                i10++;
            }
        }
        return i10;
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t9) {
        throwIfInMutationOperation();
        return add(t9, true);
    }

    public void addAll(@NonNull T[] tArr, boolean z9) {
        throwIfInMutationOperation();
        if (tArr.length == 0) {
            return;
        }
        if (z9) {
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
        int i9 = this.mSize;
        if (i9 == 0) {
            return;
        }
        Arrays.fill(this.mData, 0, i9, (Object) null);
        this.mSize = 0;
        this.mCallback.onRemoved(0, i9);
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

    public T get(int i9) throws IndexOutOfBoundsException {
        int i10;
        if (i9 < this.mSize && i9 >= 0) {
            T[] tArr = this.mOldData;
            return (tArr == null || i9 < (i10 = this.mNewDataStart)) ? this.mData[i9] : tArr[(i9 - i10) + this.mOldDataStart];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i9 + " but size is " + this.mSize);
    }

    public int indexOf(T t9) {
        if (this.mOldData == null) {
            return findIndexOf(t9, this.mData, 0, this.mSize, 4);
        }
        int iFindIndexOf = findIndexOf(t9, this.mData, 0, this.mNewDataStart, 4);
        if (iFindIndexOf != -1) {
            return iFindIndexOf;
        }
        int iFindIndexOf2 = findIndexOf(t9, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
        if (iFindIndexOf2 != -1) {
            return (iFindIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
        }
        return -1;
    }

    public void recalculatePositionOfItemAt(int i9) throws IndexOutOfBoundsException {
        throwIfInMutationOperation();
        T t9 = get(i9);
        removeItemAtIndex(i9, false);
        int iAdd = add(t9, false);
        if (i9 != iAdd) {
            this.mCallback.onMoved(i9, iAdd);
        }
    }

    public boolean remove(T t9) {
        throwIfInMutationOperation();
        return remove(t9, true);
    }

    public T removeItemAt(int i9) throws IndexOutOfBoundsException {
        throwIfInMutationOperation();
        T t9 = get(i9);
        removeItemAtIndex(i9, true);
        return t9;
    }

    public void replaceAll(@NonNull T[] tArr, boolean z9) {
        throwIfInMutationOperation();
        if (z9) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i9, T t9) throws IndexOutOfBoundsException {
        throwIfInMutationOperation();
        T t10 = get(i9);
        boolean z9 = t10 == t9 || !this.mCallback.areContentsTheSame(t10, t9);
        if (t10 != t9 && this.mCallback.compare(t10, t9) == 0) {
            this.mData[i9] = t9;
            if (z9) {
                Callback callback = this.mCallback;
                callback.onChanged(i9, 1, callback.getChangePayload(t10, t9));
                return;
            }
            return;
        }
        if (z9) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i9, 1, callback2.getChangePayload(t10, t9));
        }
        removeItemAtIndex(i9, false);
        int iAdd = add(t9, false);
        if (i9 != iAdd) {
            this.mCallback.onMoved(i9, iAdd);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i9) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i9));
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t9, boolean z9) {
        int iFindIndexOf = findIndexOf(t9, this.mData, 0, this.mSize, 1);
        if (iFindIndexOf == -1) {
            iFindIndexOf = 0;
        } else if (iFindIndexOf < this.mSize) {
            T t10 = this.mData[iFindIndexOf];
            if (this.mCallback.areItemsTheSame(t10, t9)) {
                if (this.mCallback.areContentsTheSame(t10, t9)) {
                    this.mData[iFindIndexOf] = t9;
                    return iFindIndexOf;
                }
                this.mData[iFindIndexOf] = t9;
                Callback callback = this.mCallback;
                callback.onChanged(iFindIndexOf, 1, callback.getChangePayload(t10, t9));
                return iFindIndexOf;
            }
        }
        addToData(iFindIndexOf, t9);
        if (z9) {
            this.mCallback.onInserted(iFindIndexOf, 1);
        }
        return iFindIndexOf;
    }

    private boolean remove(T t9, boolean z9) {
        int iFindIndexOf = findIndexOf(t9, this.mData, 0, this.mSize, 2);
        if (iFindIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(iFindIndexOf, z9);
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
