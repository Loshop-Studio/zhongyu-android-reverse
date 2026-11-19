package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
class ChildHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "ChildrenHelper";
    final Callback mCallback;
    final Bucket mBucket = new Bucket();
    final List<View> mHiddenViews = new ArrayList();

    public static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = Long.MIN_VALUE;
        long mData = 0;
        Bucket mNext;

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        public void clear(int i9) {
            if (i9 < 64) {
                this.mData &= ~(1 << i9);
                return;
            }
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.clear(i9 - 64);
            }
        }

        public int countOnesBefore(int i9) {
            Bucket bucket = this.mNext;
            return bucket == null ? i9 >= 64 ? Long.bitCount(this.mData) : Long.bitCount(this.mData & ((1 << i9) - 1)) : i9 < 64 ? Long.bitCount(this.mData & ((1 << i9) - 1)) : bucket.countOnesBefore(i9 - 64) + Long.bitCount(this.mData);
        }

        public boolean get(int i9) {
            if (i9 < 64) {
                return (this.mData & (1 << i9)) != 0;
            }
            ensureNext();
            return this.mNext.get(i9 - 64);
        }

        public void insert(int i9, boolean z9) {
            if (i9 >= 64) {
                ensureNext();
                this.mNext.insert(i9 - 64, z9);
                return;
            }
            long j9 = this.mData;
            boolean z10 = (Long.MIN_VALUE & j9) != 0;
            long j10 = (1 << i9) - 1;
            this.mData = ((j9 & (~j10)) << 1) | (j9 & j10);
            if (z9) {
                set(i9);
            } else {
                clear(i9);
            }
            if (z10 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z10);
            }
        }

        public boolean remove(int i9) {
            if (i9 >= 64) {
                ensureNext();
                return this.mNext.remove(i9 - 64);
            }
            long j9 = 1 << i9;
            long j10 = this.mData;
            boolean z9 = (j10 & j9) != 0;
            long j11 = j10 & (~j9);
            this.mData = j11;
            long j12 = j9 - 1;
            this.mData = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z9;
        }

        public void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        public void set(int i9) {
            if (i9 < 64) {
                this.mData |= 1 << i9;
            } else {
                ensureNext();
                this.mNext.set(i9 - 64);
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            return this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }

    public interface Callback {
        void addView(View view, int i9);

        void attachViewToParent(View view, int i9, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i9);

        View getChildAt(int i9);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i9);
    }

    public ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    private int getOffset(int i9) {
        if (i9 < 0) {
            return -1;
        }
        int childCount = this.mCallback.getChildCount();
        int i10 = i9;
        while (i10 < childCount) {
            int iCountOnesBefore = i9 - (i10 - this.mBucket.countOnesBefore(i10));
            if (iCountOnesBefore == 0) {
                while (this.mBucket.get(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iCountOnesBefore;
        }
        return -1;
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view) {
        if (!this.mHiddenViews.remove(view)) {
            return false;
        }
        this.mCallback.onLeftHiddenState(view);
        return true;
    }

    public void addView(View view, boolean z9) {
        addView(view, -1, z9);
    }

    public void attachViewToParent(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z9) {
        int childCount = i9 < 0 ? this.mCallback.getChildCount() : getOffset(i9);
        this.mBucket.insert(childCount, z9);
        if (z9) {
            hideViewInternal(view);
        }
        this.mCallback.attachViewToParent(view, childCount, layoutParams);
    }

    public void detachViewFromParent(int i9) {
        int offset = getOffset(i9);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    public View findHiddenNonRemovedView(int i9) {
        int size = this.mHiddenViews.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.mHiddenViews.get(i10);
            RecyclerView.ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (childViewHolder.getLayoutPosition() == i9 && !childViewHolder.isInvalid() && !childViewHolder.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View getChildAt(int i9) {
        return this.mCallback.getChildAt(getOffset(i9));
    }

    public int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    public View getUnfilteredChildAt(int i9) {
        return this.mCallback.getChildAt(i9);
    }

    public int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    public void hide(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.mBucket.set(iIndexOfChild);
            hideViewInternal(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public int indexOfChild(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild == -1 || this.mBucket.get(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.mBucket.countOnesBefore(iIndexOfChild);
    }

    public boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    public void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.removeAllViews();
    }

    public void removeView(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild < 0) {
            return;
        }
        if (this.mBucket.remove(iIndexOfChild)) {
            unhideViewInternal(view);
        }
        this.mCallback.removeViewAt(iIndexOfChild);
    }

    public void removeViewAt(int i9) {
        int offset = getOffset(i9);
        View childAt = this.mCallback.getChildAt(offset);
        if (childAt == null) {
            return;
        }
        if (this.mBucket.remove(offset)) {
            unhideViewInternal(childAt);
        }
        this.mCallback.removeViewAt(offset);
    }

    public boolean removeViewIfHidden(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild == -1) {
            unhideViewInternal(view);
            return true;
        }
        if (!this.mBucket.get(iIndexOfChild)) {
            return false;
        }
        this.mBucket.remove(iIndexOfChild);
        unhideViewInternal(view);
        this.mCallback.removeViewAt(iIndexOfChild);
        return true;
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    public void unhide(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.mBucket.get(iIndexOfChild)) {
            this.mBucket.clear(iIndexOfChild);
            unhideViewInternal(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public void addView(View view, int i9, boolean z9) {
        int childCount = i9 < 0 ? this.mCallback.getChildCount() : getOffset(i9);
        this.mBucket.insert(childCount, z9);
        if (z9) {
            hideViewInternal(view);
        }
        this.mCallback.addView(view, childCount);
    }
}
