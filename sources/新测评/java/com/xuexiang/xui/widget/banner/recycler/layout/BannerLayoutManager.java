package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class BannerLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    public SparseArray f5820a;

    /* renamed from: b */
    public int f5821b;

    /* renamed from: c */
    public int f5822c;

    /* renamed from: d */
    public int f5823d;

    /* renamed from: e */
    public int f5824e;

    /* renamed from: f */
    public int f5825f;

    /* renamed from: g */
    public float f5826g;

    /* renamed from: h */
    public OrientationHelper f5827h;

    /* renamed from: i */
    public boolean f5828i;

    /* renamed from: j */
    public boolean f5829j;

    /* renamed from: k */
    public boolean f5830k;

    /* renamed from: l */
    public int f5831l;

    /* renamed from: m */
    public SavedState f5832m;

    /* renamed from: n */
    public float f5833n;

    /* renamed from: o */
    public boolean f5834o;

    /* renamed from: p */
    public boolean f5835p;

    /* renamed from: q */
    public boolean f5836q;

    /* renamed from: r */
    public int f5837r;

    /* renamed from: s */
    public int f5838s;

    /* renamed from: t */
    public int f5839t;

    /* renamed from: u */
    public Interpolator f5840u;

    /* renamed from: v */
    public int f5841v;

    /* renamed from: w */
    public View f5842w;

    /* renamed from: x */
    public int f5843x;

    /* renamed from: y */
    public float f5844y;

    /* renamed from: z */
    public float f5845z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6486a();

        /* renamed from: a */
        public int f5846a;

        /* renamed from: b */
        public float f5847b;

        /* renamed from: c */
        public boolean f5848c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$SavedState$a */
        public static class C6486a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f5846a);
            parcel.writeFloat(this.f5847b);
            parcel.writeInt(this.f5848c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f5846a = parcel.readInt();
            this.f5847b = parcel.readFloat();
            this.f5848c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f5846a = savedState.f5846a;
            this.f5847b = savedState.f5847b;
            this.f5848c = savedState.f5848c;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$a */
    public interface InterfaceC6487a {
        void onPageSelected(int i10);
    }

    /* renamed from: C */
    private boolean m5438C() {
        return this.f5839t != -1;
    }

    /* renamed from: c */
    private float m5439c(float f10) {
        float fAbs = Math.abs(f10 - ((this.f5827h.getTotalSpace() - this.f5821b) / 2.0f));
        int i10 = this.f5821b;
        return (((this.f5844y - 1.0f) / i10) * (((float) i10) - fAbs > 0.0f ? i10 - fAbs : 0.0f)) + 1.0f;
    }

    /* renamed from: d */
    private int m5440d() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f5830k) {
            return (int) this.f5833n;
        }
        return 1;
    }

    /* renamed from: e */
    private int m5441e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f5830k) {
            return !this.f5829j ? m5454g() : (getItemCount() - m5454g()) - 1;
        }
        float fM5444n = m5444n();
        return !this.f5829j ? (int) fM5444n : (int) (((getItemCount() - 1) * this.f5833n) + fM5444n);
    }

    /* renamed from: f */
    private int m5442f() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f5830k ? getItemCount() : (int) (getItemCount() * this.f5833n);
    }

    /* renamed from: h */
    private int m5443h() {
        return Math.round(this.f5826g / this.f5833n);
    }

    /* renamed from: n */
    private float m5444n() {
        if (this.f5829j) {
            if (!this.f5835p) {
                return this.f5826g;
            }
            float f10 = this.f5826g;
            if (f10 <= 0.0f) {
                return f10 % (this.f5833n * getItemCount());
            }
            float itemCount = getItemCount();
            float f11 = this.f5833n;
            return (itemCount * (-f11)) + (this.f5826g % (f11 * getItemCount()));
        }
        if (!this.f5835p) {
            return this.f5826g;
        }
        float f12 = this.f5826g;
        if (f12 >= 0.0f) {
            return f12 % (this.f5833n * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f13 = this.f5833n;
        return (itemCount2 * f13) + (this.f5826g % (f13 * getItemCount()));
    }

    /* renamed from: q */
    private float m5445q(int i10) {
        return i10 * (this.f5829j ? -this.f5833n : this.f5833n);
    }

    private void resolveShouldLayoutReverse() {
        if (this.f5823d == 0 && getLayoutDirection() == 1) {
            this.f5828i = !this.f5828i;
        }
    }

    /* renamed from: s */
    private void m5446s(RecyclerView.Recycler recycler) {
        int i10;
        int i11;
        int i12;
        detachAndScrapAttachedViews(recycler);
        this.f5820a.clear();
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int iM5443h = this.f5829j ? -m5443h() : m5443h();
        int i13 = iM5443h - this.f5837r;
        int i14 = this.f5838s + iM5443h;
        if (m5438C()) {
            int i15 = this.f5839t;
            if (i15 % 2 == 0) {
                i11 = i15 / 2;
                i12 = (iM5443h - i11) + 1;
            } else {
                i11 = (i15 - 1) / 2;
                i12 = iM5443h - i11;
            }
            int i16 = i12;
            i14 = i11 + iM5443h + 1;
            i13 = i16;
        }
        if (!this.f5835p) {
            if (i13 < 0) {
                if (m5438C()) {
                    i14 = this.f5839t;
                }
                i13 = 0;
            }
            if (i14 > itemCount) {
                i14 = itemCount;
            }
        }
        float f10 = Float.MIN_VALUE;
        while (i13 < i14) {
            if (m5438C() || !m5448w(m5445q(i13) - this.f5826g)) {
                if (i13 >= itemCount) {
                    i10 = i13 % itemCount;
                } else if (i13 < 0) {
                    int i17 = (-i13) % itemCount;
                    if (i17 == 0) {
                        i17 = itemCount;
                    }
                    i10 = itemCount - i17;
                } else {
                    i10 = i13;
                }
                View viewForPosition = recycler.getViewForPosition(i10);
                measureChildWithMargins(viewForPosition, 0, 0);
                m5449x(viewForPosition);
                float fM5445q = m5445q(i13) - this.f5826g;
                m5447t(viewForPosition, fM5445q);
                float fM5451B = this.f5836q ? m5451B(viewForPosition, fM5445q) : i10;
                if (fM5451B > f10) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                if (i13 == iM5443h) {
                    this.f5842w = viewForPosition;
                }
                this.f5820a.put(i13, viewForPosition);
                f10 = fM5451B;
            }
            i13++;
        }
        this.f5842w.requestFocus();
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f10 = i10;
        float fM5455i = f10 / m5455i();
        if (Math.abs(fM5455i) < 1.0E-8f) {
            return 0;
        }
        float f11 = this.f5826g + fM5455i;
        if (!this.f5835p && f11 < m5458l()) {
            i10 = (int) (f10 - ((f11 - m5458l()) * m5455i()));
        } else if (!this.f5835p && f11 > m5457k()) {
            i10 = (int) ((m5457k() - this.f5826g) * m5455i());
        }
        this.f5826g += i10 / m5455i();
        m5446s(recycler);
        return i10;
    }

    /* renamed from: t */
    private void m5447t(View view, float f10) {
        int iM5452a = m5452a(view, f10);
        int iM5453b = m5453b(view, f10);
        if (this.f5823d == 1) {
            int i10 = this.f5825f;
            int i11 = this.f5824e;
            layoutDecorated(view, i10 + iM5452a, i11 + iM5453b, iM5452a + i10 + this.f5822c, i11 + iM5453b + this.f5821b);
        } else {
            int i12 = this.f5824e;
            int i13 = this.f5825f;
            layoutDecorated(view, i12 + iM5452a, i13 + iM5453b, iM5452a + i12 + this.f5821b, i13 + iM5453b + this.f5822c);
        }
        m5466z(view, f10);
    }

    /* renamed from: w */
    private boolean m5448w(float f10) {
        return f10 > m5463u() || f10 < m5464v();
    }

    /* renamed from: x */
    private void m5449x(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: A */
    public void m5450A() {
    }

    /* renamed from: B */
    public float m5451B(View view, float f10) {
        return 0.0f;
    }

    /* renamed from: a */
    public int m5452a(View view, float f10) {
        if (this.f5823d == 1) {
            return 0;
        }
        return (int) f10;
    }

    /* renamed from: b */
    public int m5453b(View view, float f10) {
        if (this.f5823d == 1) {
            return (int) f10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f5823d == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f5823d == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m5440d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m5441e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m5442f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m5440d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m5441e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m5442f();
    }

    public void ensureLayoutState() {
        if (this.f5827h == null) {
            this.f5827h = OrientationHelper.createOrientationHelper(this, this.f5823d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i10) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i11 = 0; i11 < this.f5820a.size(); i11++) {
            int iKeyAt = this.f5820a.keyAt(i11);
            if (iKeyAt < 0) {
                int i12 = iKeyAt % itemCount;
                if (i12 == 0) {
                    i12 = -itemCount;
                }
                if (i12 + itemCount == i10) {
                    return (View) this.f5820a.valueAt(i11);
                }
            } else if (i10 == iKeyAt % itemCount) {
                return (View) this.f5820a.valueAt(i11);
            }
        }
        return null;
    }

    /* renamed from: g */
    public int m5454g() {
        if (getItemCount() == 0) {
            return 0;
        }
        int iM5443h = m5443h();
        if (!this.f5835p) {
            return Math.abs(iM5443h);
        }
        int itemCount = !this.f5829j ? iM5443h >= 0 ? iM5443h % getItemCount() : (iM5443h % getItemCount()) + getItemCount() : iM5443h > 0 ? getItemCount() - (iM5443h % getItemCount()) : (-iM5443h) % getItemCount();
        if (itemCount == getItemCount()) {
            return 0;
        }
        return itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getOrientation() {
        return this.f5823d;
    }

    public boolean getReverseLayout() {
        return this.f5828i;
    }

    /* renamed from: i */
    public float m5455i() {
        float f10 = this.f5845z;
        if (f10 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f10;
    }

    /* renamed from: j */
    public boolean m5456j() {
        return this.f5835p;
    }

    /* renamed from: k */
    public float m5457k() {
        if (this.f5829j) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f5833n;
    }

    /* renamed from: l */
    public float m5458l() {
        if (this.f5829j) {
            return (-(getItemCount() - 1)) * this.f5833n;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final int m5459m(int i10) {
        boolean z9;
        if (this.f5823d == 1) {
            if (i10 != 33) {
                if (i10 == 130) {
                    return this.f5829j ? 1 : 0;
                }
                return -1;
            }
            z9 = this.f5829j;
        } else {
            if (i10 != 17) {
                if (i10 == 66) {
                    return this.f5829j ? 1 : 0;
                }
                return -1;
            }
            z9 = this.f5829j;
        }
        return !z9;
    }

    /* renamed from: o */
    public int m5460o() {
        float fM5454g;
        float fM5455i;
        if (this.f5835p) {
            fM5454g = (m5443h() * this.f5833n) - this.f5826g;
            fM5455i = m5455i();
        } else {
            fM5454g = (m5454g() * (!this.f5829j ? this.f5833n : -this.f5833n)) - this.f5826g;
            fM5455i = m5455i();
        }
        return (int) (fM5454g * fM5455i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f5826g = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
        int iM5454g = m5454g();
        View viewFindViewByPosition = findViewByPosition(iM5454g);
        if (viewFindViewByPosition == null) {
            return true;
        }
        if (recyclerView.hasFocus()) {
            int iM5459m = m5459m(i10);
            if (iM5459m != -1) {
                recyclerView.smoothScrollToPosition(iM5459m == 1 ? iM5454g - 1 : iM5454g + 1);
            }
        } else {
            viewFindViewByPosition.addFocusables(arrayList, i10, i11);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f5834o) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f5826g = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f5821b = this.f5827h.getDecoratedMeasurement(viewForPosition);
        this.f5822c = this.f5827h.getDecoratedMeasurementInOther(viewForPosition);
        this.f5824e = (this.f5827h.getTotalSpace() - this.f5821b) / 2;
        if (this.f5841v == Integer.MAX_VALUE) {
            this.f5825f = (m5462r() - this.f5822c) / 2;
        } else {
            this.f5825f = (m5462r() - this.f5822c) - this.f5841v;
        }
        this.f5833n = m5465y();
        m5450A();
        this.f5837r = ((int) Math.abs(m5464v() / this.f5833n)) + 1;
        this.f5838s = ((int) Math.abs(m5463u() / this.f5833n)) + 1;
        SavedState savedState = this.f5832m;
        if (savedState != null) {
            this.f5829j = savedState.f5848c;
            this.f5831l = savedState.f5846a;
            this.f5826g = savedState.f5847b;
        }
        int i10 = this.f5831l;
        if (i10 != -1) {
            this.f5826g = i10 * (this.f5829j ? -this.f5833n : this.f5833n);
        }
        detachAndScrapAttachedViews(recycler);
        m5446s(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f5832m = null;
        this.f5831l = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f5832m = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f5832m != null) {
            return new SavedState(this.f5832m);
        }
        SavedState savedState = new SavedState();
        savedState.f5846a = this.f5831l;
        savedState.f5847b = this.f5826g;
        savedState.f5848c = this.f5829j;
        return savedState;
    }

    /* renamed from: p */
    public int m5461p(int i10) {
        float fM5443h;
        float fM5455i;
        if (this.f5835p) {
            fM5443h = ((m5443h() + (!this.f5829j ? i10 - m5454g() : m5454g() - i10)) * this.f5833n) - this.f5826g;
            fM5455i = m5455i();
        } else {
            fM5443h = (i10 * (!this.f5829j ? this.f5833n : -this.f5833n)) - this.f5826g;
            fM5455i = m5455i();
        }
        return (int) (fM5443h * fM5455i);
    }

    /* renamed from: r */
    public int m5462r() {
        int width;
        int paddingRight;
        if (this.f5823d == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f5823d == 1) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        if (this.f5835p || (i10 >= 0 && i10 < getItemCount())) {
            this.f5831l = i10;
            this.f5826g = i10 * (this.f5829j ? -this.f5833n : this.f5833n);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f5823d == 0) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        int iM5461p = m5461p(i10);
        if (this.f5823d == 1) {
            recyclerView.smoothScrollBy(0, iM5461p, this.f5840u);
        } else {
            recyclerView.smoothScrollBy(iM5461p, 0, this.f5840u);
        }
    }

    /* renamed from: u */
    public float m5463u() {
        return this.f5827h.getTotalSpace() - this.f5824e;
    }

    /* renamed from: v */
    public float m5464v() {
        return ((-this.f5821b) - this.f5827h.getStartAfterPadding()) - this.f5824e;
    }

    /* renamed from: y */
    public float m5465y() {
        return (this.f5821b * (((this.f5844y - 1.0f) / 2.0f) + 1.0f)) + this.f5843x;
    }

    /* renamed from: z */
    public void m5466z(View view, float f10) {
        float fM5439c = m5439c(f10 + this.f5824e);
        view.setScaleX(fM5439c);
        view.setScaleY(fM5439c);
    }
}
