package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class BannerLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    public int f3994a;

    /* renamed from: b */
    public int f3995b;

    /* renamed from: c */
    public int f3996c;

    /* renamed from: d */
    public float f3997d;

    /* renamed from: e */
    public OrientationHelper f3998e;

    /* renamed from: f */
    public boolean f3999f;

    /* renamed from: g */
    public boolean f4000g;

    /* renamed from: h */
    public int f4001h;

    /* renamed from: i */
    public SavedState f4002i;

    /* renamed from: j */
    public float f4003j;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4160a();

        /* renamed from: a */
        public int f4004a;

        /* renamed from: b */
        public float f4005b;

        /* renamed from: c */
        public boolean f4006c;

        public SavedState(SavedState savedState) {
            this.f4004a = savedState.f4004a;
            this.f4005b = savedState.f4005b;
            this.f4006c = savedState.f4006c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4004a);
            parcel.writeFloat(this.f4005b);
            parcel.writeInt(this.f4006c ? 1 : 0);
        }
    }

    /* renamed from: a */
    public final int m3445a() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f4000g ? m3446b() : (getItemCount() - m3446b()) - 1;
    }

    /* renamed from: b */
    public final int m3446b() {
        if (getItemCount() == 0) {
            return 0;
        }
        return Math.abs(Math.round(this.f3997d / this.f4003j));
    }

    /* renamed from: c */
    public final float m3447c() {
        if (this.f4000g) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f4003j;
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
        return m3445a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return getChildCount() == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return m3445a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return getItemCount();
    }

    /* renamed from: d */
    public final float m3448d() {
        if (this.f4000g) {
            return (-(getItemCount() - 1)) * this.f4003j;
        }
        return 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View findViewByPosition(int i) {
        if (getItemCount() == 0) {
            return null;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f3997d = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i, int i8) {
        findViewByPosition(m3446b());
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f3997d = 0.0f;
            return;
        }
        if (this.f3998e == null) {
            this.f3998e = OrientationHelper.createOrientationHelper(this, 0);
        }
        if (getLayoutDirection() == 1) {
            this.f3999f = !this.f3999f;
        }
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f3994a = this.f3998e.getDecoratedMeasurement(viewForPosition);
        this.f3995b = this.f3998e.getDecoratedMeasurementInOther(viewForPosition);
        this.f3996c = (this.f3998e.getTotalSpace() - this.f3994a) / 2;
        getHeight();
        getPaddingTop();
        getPaddingBottom();
        this.f4003j = (0.5f * this.f3994a) + 0;
        Math.abs((((-r5) - this.f3998e.getStartAfterPadding()) - this.f3996c) / this.f4003j);
        Math.abs((this.f3998e.getTotalSpace() - this.f3996c) / this.f4003j);
        SavedState savedState = this.f4002i;
        if (savedState != null) {
            this.f4000g = savedState.f4006c;
            this.f4001h = savedState.f4004a;
            this.f3997d = savedState.f4005b;
        }
        int i = this.f4001h;
        if (i != -1) {
            this.f3997d = i * (this.f4000g ? -this.f4003j : this.f4003j);
        }
        detachAndScrapAttachedViews(recycler);
        detachAndScrapAttachedViews(recycler);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f4002i = null;
        this.f4001h = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4002i = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.f4002i;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f4004a = this.f4001h;
        savedState2.f4005b = this.f3997d;
        savedState2.f4006c = this.f4000g;
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        if (this.f3998e == null) {
            this.f3998e = OrientationHelper.createOrientationHelper(this, 0);
        }
        float f = i;
        float f7 = f / Float.MAX_VALUE;
        if (Math.abs(f7) < 1.0E-8f) {
            return 0;
        }
        float f8 = this.f3997d + f7;
        if (f8 < m3448d()) {
            i = (int) (f - ((f8 - m3448d()) * Float.MAX_VALUE));
        } else if (f8 > m3447c()) {
            i = (int) ((m3447c() - this.f3997d) * Float.MAX_VALUE);
        }
        this.f3997d += i / Float.MAX_VALUE;
        detachAndScrapAttachedViews(recycler);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        this.f4001h = i;
        this.f3997d = i * (this.f4000g ? -this.f4003j : this.f4003j);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        recyclerView.smoothScrollBy((int) (((i * (!this.f4000g ? this.f4003j : -this.f4003j)) - this.f3997d) * Float.MAX_VALUE), 0, null);
    }
}
