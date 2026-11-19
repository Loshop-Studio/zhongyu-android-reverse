package com.xuexiang.xui.widget.banner.recycler.layout;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class OverFlyingLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: a */
    public int f4009a;

    /* renamed from: b */
    public int f4010b;

    /* renamed from: c */
    public int f4011c;

    /* renamed from: d */
    public int f4012d;

    /* renamed from: e */
    public float f4013e;

    /* renamed from: f */
    public OrientationHelper f4014f;

    /* renamed from: g */
    public boolean f4015g;

    /* renamed from: h */
    public int f4016h;

    /* renamed from: i */
    public SavedState f4017i;

    /* renamed from: j */
    public float f4018j;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4162c();

        /* renamed from: a */
        public int f4019a;

        /* renamed from: b */
        public float f4020b;

        /* renamed from: c */
        public boolean f4021c;

        public SavedState(SavedState savedState) {
            this.f4019a = savedState.f4019a;
            this.f4020b = savedState.f4020b;
            this.f4021c = savedState.f4021c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4019a);
            parcel.writeFloat(this.f4020b);
            parcel.writeInt(this.f4021c ? 1 : 0);
        }
    }

    /* renamed from: a */
    public final void m3449a(RecyclerView.Recycler recycler) {
        int i;
        float f;
        float f7;
        detachAndScrapAttachedViews(recycler);
        int iRound = (this.f4015g ? -Math.round(this.f4013e / this.f4018j) : Math.round(this.f4013e / this.f4018j)) + 1;
        int itemCount = getItemCount();
        if (iRound < 0) {
            iRound = 0;
        }
        int i8 = iRound;
        if (iRound > itemCount) {
            iRound = itemCount;
        }
        float f8 = Float.MIN_VALUE;
        while (i8 < iRound) {
            if (i8 >= itemCount) {
                i = i8 % itemCount;
            } else if (i8 < 0) {
                int i9 = (-i8) % itemCount;
                if (i9 == 0) {
                    i9 = itemCount;
                }
                i = itemCount - i9;
            } else {
                i = i8;
            }
            View viewForPosition = recycler.getViewForPosition(i);
            measureChildWithMargins(viewForPosition, 0, 0);
            viewForPosition.setRotation(0.0f);
            viewForPosition.setRotationY(0.0f);
            viewForPosition.setRotationX(0.0f);
            viewForPosition.setScaleX(1.0f);
            viewForPosition.setScaleY(1.0f);
            viewForPosition.setAlpha(1.0f);
            if (this.f4015g) {
                f = i8;
                f7 = -this.f4018j;
            } else {
                f = i8;
                f7 = this.f4018j;
            }
            m3450b(viewForPosition, (f * f7) - this.f4013e);
            float f9 = i;
            if (f9 > f8) {
                addView(viewForPosition);
            } else {
                addView(viewForPosition, 0);
            }
            i8++;
            f8 = f9;
        }
    }

    /* renamed from: b */
    public final void m3450b(View view, float f) {
        int i = this.f4011c + ((int) f);
        int i8 = this.f4012d;
        layoutDecorated(view, i, i8, i + this.f4009a, i8 + this.f4010b);
        float fAbs = ((Math.abs((this.f4011c + f) - ((this.f4014f.getTotalSpace() - this.f4009a) / 2.0f)) * (-1.0f)) / (this.f4014f.getTotalSpace() / 2.0f)) + 1.0f;
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
        view.setElevation(0.0f);
        view.setRotationY(((-0.0f) / this.f4018j) * f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return getChildCount() == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f4015g ? Math.abs(Math.round(this.f4013e / this.f4018j)) : (getItemCount() - Math.abs(Math.round(this.f4013e / this.f4018j))) - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        return new PointF((i < getPosition(getChildAt(0))) == (this.f4015g ^ true) ? -1.0f : 1.0f, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return getChildCount() == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f4015g ? Math.abs(Math.round(this.f4013e / this.f4018j)) : (getItemCount() - Math.abs(Math.round(this.f4013e / this.f4018j))) - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f4013e = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f4013e = 0.0f;
            return;
        }
        if (this.f4014f == null) {
            this.f4014f = OrientationHelper.createOrientationHelper(this, 0);
        }
        if (getLayoutDirection() == 1) {
            this.f4015g = !this.f4015g;
        }
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f4009a = this.f4014f.getDecoratedMeasurement(viewForPosition);
        this.f4010b = this.f4014f.getDecoratedMeasurementInOther(viewForPosition);
        this.f4011c = (this.f4014f.getTotalSpace() - this.f4009a) / 2;
        this.f4012d = (((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.f4010b) / 2;
        this.f4018j = this.f4009a;
        Math.abs((((-r4) - this.f4014f.getStartAfterPadding()) - this.f4011c) / this.f4018j);
        Math.abs((this.f4014f.getTotalSpace() - this.f4011c) / this.f4018j);
        SavedState savedState = this.f4017i;
        if (savedState != null) {
            this.f4015g = savedState.f4021c;
            this.f4016h = savedState.f4019a;
            this.f4013e = savedState.f4020b;
        }
        int i = this.f4016h;
        if (i != -1) {
            this.f4013e = i * (this.f4015g ? -this.f4018j : this.f4018j);
        }
        detachAndScrapAttachedViews(recycler);
        m3449a(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f4017i = null;
        this.f4016h = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4017i = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.f4017i;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f4019a = this.f4016h;
        savedState2.f4020b = this.f4013e;
        savedState2.f4021c = this.f4015g;
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() != 0 && i != 0) {
            if (this.f4014f == null) {
                this.f4014f = OrientationHelper.createOrientationHelper(this, 0);
            }
            float f = i;
            float f7 = f / 1.0f;
            if (Math.abs(f7) >= 1.0E-8f) {
                float f8 = this.f4013e + f7;
                if (f8 < (!this.f4015g ? 0.0f : (-(getItemCount() - 1)) * this.f4018j)) {
                    i = (int) (f - ((f8 - (this.f4015g ? (-(getItemCount() - 1)) * this.f4018j : 0.0f)) * 1.0f));
                } else if (f8 > (!this.f4015g ? (getItemCount() - 1) * this.f4018j : 0.0f)) {
                    i = (int) (((this.f4015g ? 0.0f : (getItemCount() - 1) * this.f4018j) - this.f4013e) * 1.0f);
                }
                float f9 = i / 1.0f;
                this.f4013e += f9;
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    m3450b(getChildAt(i8), (r1.getLeft() - this.f4011c) - f9);
                }
                m3449a(recycler);
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.f4016h = i;
        this.f4013e = i * (this.f4015g ? -this.f4018j : this.f4018j);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }
}
