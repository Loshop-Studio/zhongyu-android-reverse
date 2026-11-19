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
    public SparseArray f7075a;

    /* renamed from: b */
    public int f7076b;

    /* renamed from: c */
    public int f7077c;

    /* renamed from: d */
    public int f7078d;

    /* renamed from: e */
    public int f7079e;

    /* renamed from: f */
    public int f7080f;

    /* renamed from: g */
    public float f7081g;

    /* renamed from: h */
    public OrientationHelper f7082h;

    /* renamed from: i */
    public boolean f7083i;

    /* renamed from: j */
    public boolean f7084j;

    /* renamed from: k */
    public boolean f7085k;

    /* renamed from: l */
    public int f7086l;

    /* renamed from: m */
    public SavedState f7087m;

    /* renamed from: n */
    public float f7088n;

    /* renamed from: o */
    public boolean f7089o;

    /* renamed from: p */
    public boolean f7090p;

    /* renamed from: q */
    public boolean f7091q;

    /* renamed from: r */
    public int f7092r;

    /* renamed from: s */
    public int f7093s;

    /* renamed from: t */
    public int f7094t;

    /* renamed from: u */
    public Interpolator f7095u;

    /* renamed from: v */
    public int f7096v;

    /* renamed from: w */
    public View f7097w;

    /* renamed from: x */
    public int f7098x;

    /* renamed from: y */
    public float f7099y;

    /* renamed from: z */
    public float f7100z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6805a();

        /* renamed from: a */
        public int f7101a;

        /* renamed from: b */
        public float f7102b;

        /* renamed from: c */
        public boolean f7103c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$SavedState$a */
        public static class C6805a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i9) {
                return new SavedState[i9];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.f7101a);
            parcel.writeFloat(this.f7102b);
            parcel.writeInt(this.f7103c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f7101a = parcel.readInt();
            this.f7102b = parcel.readFloat();
            this.f7103c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f7101a = savedState.f7101a;
            this.f7102b = savedState.f7102b;
            this.f7103c = savedState.f7103c;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$a */
    public interface InterfaceC6806a {
        void onPageSelected(int i9);
    }

    /* renamed from: C */
    private boolean m6534C() {
        return this.f7094t != -1;
    }

    /* renamed from: c */
    private float m6535c(float f10) {
        float fAbs = Math.abs(f10 - ((this.f7082h.getTotalSpace() - this.f7076b) / 2.0f));
        int i9 = this.f7076b;
        return (((this.f7099y - 1.0f) / i9) * (((float) i9) - fAbs > 0.0f ? i9 - fAbs : 0.0f)) + 1.0f;
    }

    /* renamed from: d */
    private int m6536d() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f7085k) {
            return (int) this.f7088n;
        }
        return 1;
    }

    /* renamed from: e */
    private int m6537e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f7085k) {
            return !this.f7084j ? m6550g() : (getItemCount() - m6550g()) - 1;
        }
        float fM6540n = m6540n();
        return !this.f7084j ? (int) fM6540n : (int) (((getItemCount() - 1) * this.f7088n) + fM6540n);
    }

    /* renamed from: f */
    private int m6538f() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f7085k ? getItemCount() : (int) (getItemCount() * this.f7088n);
    }

    /* renamed from: h */
    private int m6539h() {
        return Math.round(this.f7081g / this.f7088n);
    }

    /* renamed from: n */
    private float m6540n() {
        if (this.f7084j) {
            if (!this.f7090p) {
                return this.f7081g;
            }
            float f10 = this.f7081g;
            if (f10 <= 0.0f) {
                return f10 % (this.f7088n * getItemCount());
            }
            float itemCount = getItemCount();
            float f11 = this.f7088n;
            return (itemCount * (-f11)) + (this.f7081g % (f11 * getItemCount()));
        }
        if (!this.f7090p) {
            return this.f7081g;
        }
        float f12 = this.f7081g;
        if (f12 >= 0.0f) {
            return f12 % (this.f7088n * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f13 = this.f7088n;
        return (itemCount2 * f13) + (this.f7081g % (f13 * getItemCount()));
    }

    /* renamed from: q */
    private float m6541q(int i9) {
        return i9 * (this.f7084j ? -this.f7088n : this.f7088n);
    }

    private void resolveShouldLayoutReverse() {
        if (this.f7078d == 0 && getLayoutDirection() == 1) {
            this.f7083i = !this.f7083i;
        }
    }

    /* renamed from: s */
    private void m6542s(RecyclerView.Recycler recycler) {
        int i9;
        int i10;
        int i11;
        detachAndScrapAttachedViews(recycler);
        this.f7075a.clear();
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int iM6539h = this.f7084j ? -m6539h() : m6539h();
        int i12 = iM6539h - this.f7092r;
        int i13 = this.f7093s + iM6539h;
        if (m6534C()) {
            int i14 = this.f7094t;
            if (i14 % 2 == 0) {
                i10 = i14 / 2;
                i11 = (iM6539h - i10) + 1;
            } else {
                i10 = (i14 - 1) / 2;
                i11 = iM6539h - i10;
            }
            int i15 = i11;
            i13 = i10 + iM6539h + 1;
            i12 = i15;
        }
        if (!this.f7090p) {
            if (i12 < 0) {
                if (m6534C()) {
                    i13 = this.f7094t;
                }
                i12 = 0;
            }
            if (i13 > itemCount) {
                i13 = itemCount;
            }
        }
        float f10 = Float.MIN_VALUE;
        while (i12 < i13) {
            if (m6534C() || !m6544w(m6541q(i12) - this.f7081g)) {
                if (i12 >= itemCount) {
                    i9 = i12 % itemCount;
                } else if (i12 < 0) {
                    int i16 = (-i12) % itemCount;
                    if (i16 == 0) {
                        i16 = itemCount;
                    }
                    i9 = itemCount - i16;
                } else {
                    i9 = i12;
                }
                View viewForPosition = recycler.getViewForPosition(i9);
                measureChildWithMargins(viewForPosition, 0, 0);
                m6545x(viewForPosition);
                float fM6541q = m6541q(i12) - this.f7081g;
                m6543t(viewForPosition, fM6541q);
                float fM6547B = this.f7091q ? m6547B(viewForPosition, fM6541q) : i9;
                if (fM6547B > f10) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                if (i12 == iM6539h) {
                    this.f7097w = viewForPosition;
                }
                this.f7075a.put(i12, viewForPosition);
                f10 = fM6547B;
            }
            i12++;
        }
        this.f7097w.requestFocus();
    }

    private int scrollBy(int i9, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i9 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f10 = i9;
        float fM6551i = f10 / m6551i();
        if (Math.abs(fM6551i) < 1.0E-8f) {
            return 0;
        }
        float f11 = this.f7081g + fM6551i;
        if (!this.f7090p && f11 < m6554l()) {
            i9 = (int) (f10 - ((f11 - m6554l()) * m6551i()));
        } else if (!this.f7090p && f11 > m6553k()) {
            i9 = (int) ((m6553k() - this.f7081g) * m6551i());
        }
        this.f7081g += i9 / m6551i();
        m6542s(recycler);
        return i9;
    }

    /* renamed from: t */
    private void m6543t(View view, float f10) {
        int iM6548a = m6548a(view, f10);
        int iM6549b = m6549b(view, f10);
        if (this.f7078d == 1) {
            int i9 = this.f7080f;
            int i10 = this.f7079e;
            layoutDecorated(view, i9 + iM6548a, i10 + iM6549b, iM6548a + i9 + this.f7077c, i10 + iM6549b + this.f7076b);
        } else {
            int i11 = this.f7079e;
            int i12 = this.f7080f;
            layoutDecorated(view, i11 + iM6548a, i12 + iM6549b, iM6548a + i11 + this.f7076b, i12 + iM6549b + this.f7077c);
        }
        m6562z(view, f10);
    }

    /* renamed from: w */
    private boolean m6544w(float f10) {
        return f10 > m6559u() || f10 < m6560v();
    }

    /* renamed from: x */
    private void m6545x(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: A */
    public void m6546A() {
    }

    /* renamed from: B */
    public float m6547B(View view, float f10) {
        return 0.0f;
    }

    /* renamed from: a */
    public int m6548a(View view, float f10) {
        if (this.f7078d == 1) {
            return 0;
        }
        return (int) f10;
    }

    /* renamed from: b */
    public int m6549b(View view, float f10) {
        if (this.f7078d == 1) {
            return (int) f10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f7078d == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f7078d == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m6536d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m6537e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m6538f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m6536d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m6537e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m6538f();
    }

    public void ensureLayoutState() {
        if (this.f7082h == null) {
            this.f7082h = OrientationHelper.createOrientationHelper(this, this.f7078d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i9) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i10 = 0; i10 < this.f7075a.size(); i10++) {
            int iKeyAt = this.f7075a.keyAt(i10);
            if (iKeyAt < 0) {
                int i11 = iKeyAt % itemCount;
                if (i11 == 0) {
                    i11 = -itemCount;
                }
                if (i11 + itemCount == i9) {
                    return (View) this.f7075a.valueAt(i10);
                }
            } else if (i9 == iKeyAt % itemCount) {
                return (View) this.f7075a.valueAt(i10);
            }
        }
        return null;
    }

    /* renamed from: g */
    public int m6550g() {
        if (getItemCount() == 0) {
            return 0;
        }
        int iM6539h = m6539h();
        if (!this.f7090p) {
            return Math.abs(iM6539h);
        }
        int itemCount = !this.f7084j ? iM6539h >= 0 ? iM6539h % getItemCount() : (iM6539h % getItemCount()) + getItemCount() : iM6539h > 0 ? getItemCount() - (iM6539h % getItemCount()) : (-iM6539h) % getItemCount();
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
        return this.f7078d;
    }

    public boolean getReverseLayout() {
        return this.f7083i;
    }

    /* renamed from: i */
    public float m6551i() {
        float f10 = this.f7100z;
        if (f10 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f10;
    }

    /* renamed from: j */
    public boolean m6552j() {
        return this.f7090p;
    }

    /* renamed from: k */
    public float m6553k() {
        if (this.f7084j) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f7088n;
    }

    /* renamed from: l */
    public float m6554l() {
        if (this.f7084j) {
            return (-(getItemCount() - 1)) * this.f7088n;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final int m6555m(int i9) {
        boolean z9;
        if (this.f7078d == 1) {
            if (i9 != 33) {
                if (i9 == 130) {
                    return this.f7084j ? 1 : 0;
                }
                return -1;
            }
            z9 = this.f7084j;
        } else {
            if (i9 != 17) {
                if (i9 == 66) {
                    return this.f7084j ? 1 : 0;
                }
                return -1;
            }
            z9 = this.f7084j;
        }
        return !z9;
    }

    /* renamed from: o */
    public int m6556o() {
        float fM6550g;
        float fM6551i;
        if (this.f7090p) {
            fM6550g = (m6539h() * this.f7088n) - this.f7081g;
            fM6551i = m6551i();
        } else {
            fM6550g = (m6550g() * (!this.f7084j ? this.f7088n : -this.f7088n)) - this.f7081g;
            fM6551i = m6551i();
        }
        return (int) (fM6550g * fM6551i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f7081g = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i9, int i10) {
        int iM6550g = m6550g();
        View viewFindViewByPosition = findViewByPosition(iM6550g);
        if (viewFindViewByPosition == null) {
            return true;
        }
        if (recyclerView.hasFocus()) {
            int iM6555m = m6555m(i9);
            if (iM6555m != -1) {
                recyclerView.smoothScrollToPosition(iM6555m == 1 ? iM6550g - 1 : iM6550g + 1);
            }
        } else {
            viewFindViewByPosition.addFocusables(arrayList, i9, i10);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f7089o) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i9, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f7081g = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f7076b = this.f7082h.getDecoratedMeasurement(viewForPosition);
        this.f7077c = this.f7082h.getDecoratedMeasurementInOther(viewForPosition);
        this.f7079e = (this.f7082h.getTotalSpace() - this.f7076b) / 2;
        if (this.f7096v == Integer.MAX_VALUE) {
            this.f7080f = (m6558r() - this.f7077c) / 2;
        } else {
            this.f7080f = (m6558r() - this.f7077c) - this.f7096v;
        }
        this.f7088n = m6561y();
        m6546A();
        this.f7092r = ((int) Math.abs(m6560v() / this.f7088n)) + 1;
        this.f7093s = ((int) Math.abs(m6559u() / this.f7088n)) + 1;
        SavedState savedState = this.f7087m;
        if (savedState != null) {
            this.f7084j = savedState.f7103c;
            this.f7086l = savedState.f7101a;
            this.f7081g = savedState.f7102b;
        }
        int i9 = this.f7086l;
        if (i9 != -1) {
            this.f7081g = i9 * (this.f7084j ? -this.f7088n : this.f7088n);
        }
        detachAndScrapAttachedViews(recycler);
        m6542s(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f7087m = null;
        this.f7086l = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f7087m = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f7087m != null) {
            return new SavedState(this.f7087m);
        }
        SavedState savedState = new SavedState();
        savedState.f7101a = this.f7086l;
        savedState.f7102b = this.f7081g;
        savedState.f7103c = this.f7084j;
        return savedState;
    }

    /* renamed from: p */
    public int m6557p(int i9) {
        float fM6539h;
        float fM6551i;
        if (this.f7090p) {
            fM6539h = ((m6539h() + (!this.f7084j ? i9 - m6550g() : m6550g() - i9)) * this.f7088n) - this.f7081g;
            fM6551i = m6551i();
        } else {
            fM6539h = (i9 * (!this.f7084j ? this.f7088n : -this.f7088n)) - this.f7081g;
            fM6551i = m6551i();
        }
        return (int) (fM6539h * fM6551i);
    }

    /* renamed from: r */
    public int m6558r() {
        int width;
        int paddingRight;
        if (this.f7078d == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i9, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f7078d == 1) {
            return 0;
        }
        return scrollBy(i9, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i9) {
        if (this.f7090p || (i9 >= 0 && i9 < getItemCount())) {
            this.f7086l = i9;
            this.f7081g = i9 * (this.f7084j ? -this.f7088n : this.f7088n);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i9, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f7078d == 0) {
            return 0;
        }
        return scrollBy(i9, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i9) {
        int iM6557p = m6557p(i9);
        if (this.f7078d == 1) {
            recyclerView.smoothScrollBy(0, iM6557p, this.f7095u);
        } else {
            recyclerView.smoothScrollBy(iM6557p, 0, this.f7095u);
        }
    }

    /* renamed from: u */
    public float m6559u() {
        return this.f7082h.getTotalSpace() - this.f7079e;
    }

    /* renamed from: v */
    public float m6560v() {
        return ((-this.f7076b) - this.f7082h.getStartAfterPadding()) - this.f7079e;
    }

    /* renamed from: y */
    public float m6561y() {
        return (this.f7076b * (((this.f7099y - 1.0f) / 2.0f) + 1.0f)) + this.f7098x;
    }

    /* renamed from: z */
    public void m6562z(View view, float f10) {
        float fM6535c = m6535c(f10 + this.f7079e);
        view.setScaleX(fM6535c);
        view.setScaleY(fM6535c);
    }
}
