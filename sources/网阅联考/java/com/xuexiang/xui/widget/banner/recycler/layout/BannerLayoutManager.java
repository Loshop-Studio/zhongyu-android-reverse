package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class BannerLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    public SparseArray f3160a;

    /* renamed from: b */
    public int f3161b;

    /* renamed from: c */
    public int f3162c;

    /* renamed from: d */
    public int f3163d;

    /* renamed from: e */
    public int f3164e;

    /* renamed from: f */
    public int f3165f;

    /* renamed from: g */
    public float f3166g;

    /* renamed from: h */
    public OrientationHelper f3167h;

    /* renamed from: i */
    public boolean f3168i;

    /* renamed from: j */
    public boolean f3169j;

    /* renamed from: k */
    public boolean f3170k;

    /* renamed from: l */
    public int f3171l;

    /* renamed from: m */
    public SavedState f3172m;

    /* renamed from: n */
    public float f3173n;

    /* renamed from: o */
    public boolean f3174o;

    /* renamed from: p */
    public boolean f3175p;

    /* renamed from: q */
    public boolean f3176q;

    /* renamed from: r */
    public int f3177r;

    /* renamed from: s */
    public int f3178s;

    /* renamed from: t */
    public int f3179t;

    /* renamed from: u */
    public Interpolator f3180u;

    /* renamed from: v */
    public int f3181v;

    /* renamed from: w */
    public View f3182w;

    /* renamed from: x */
    public int f3183x;

    /* renamed from: y */
    public float f3184y;

    /* renamed from: z */
    public float f3185z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3535a();

        /* renamed from: a */
        public int f3186a;

        /* renamed from: b */
        public float f3187b;

        /* renamed from: c */
        public boolean f3188c;

        /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$SavedState$a */
        public static class C3535a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f3186a);
            parcel.writeFloat(this.f3187b);
            parcel.writeInt(this.f3188c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f3186a = parcel.readInt();
            this.f3187b = parcel.readFloat();
            this.f3188c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f3186a = savedState.f3186a;
            this.f3187b = savedState.f3187b;
            this.f3188c = savedState.f3188c;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager$a */
    public interface InterfaceC3536a {
        void onPageSelected(int i4);
    }

    /* renamed from: A */
    public void m4124A() {
    }

    /* renamed from: B */
    public float m4125B(View view, float f4) {
        return 0.0f;
    }

    /* renamed from: C */
    public final boolean m4126C() {
        return this.f3179t != -1;
    }

    /* renamed from: a */
    public int m4127a(View view, float f4) {
        if (this.f3163d == 1) {
            return 0;
        }
        return (int) f4;
    }

    /* renamed from: b */
    public int m4128b(View view, float f4) {
        if (this.f3163d == 1) {
            return (int) f4;
        }
        return 0;
    }

    /* renamed from: c */
    public final float m4129c(float f4) {
        float fAbs = Math.abs(f4 - ((this.f3167h.getTotalSpace() - this.f3161b) / 2.0f));
        int i4 = this.f3161b;
        return (((this.f3184y - 1.0f) / i4) * (((float) i4) - fAbs > 0.0f ? i4 - fAbs : 0.0f)) + 1.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f3163d == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f3163d == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m4130d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m4131e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m4132f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m4130d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m4131e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m4132f();
    }

    /* renamed from: d */
    public final int m4130d() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.f3170k) {
            return (int) this.f3173n;
        }
        return 1;
    }

    /* renamed from: e */
    public final int m4131e() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f3170k) {
            return !this.f3169j ? m4133g() : (getItemCount() - m4133g()) - 1;
        }
        float fM4140n = m4140n();
        return !this.f3169j ? (int) fM4140n : (int) (((getItemCount() - 1) * this.f3173n) + fM4140n);
    }

    public void ensureLayoutState() {
        if (this.f3167h == null) {
            this.f3167h = OrientationHelper.createOrientationHelper(this, this.f3163d);
        }
    }

    /* renamed from: f */
    public final int m4132f() {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f3170k ? getItemCount() : (int) (getItemCount() * this.f3173n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i4) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i5 = 0; i5 < this.f3160a.size(); i5++) {
            int iKeyAt = this.f3160a.keyAt(i5);
            if (iKeyAt < 0) {
                int i6 = iKeyAt % itemCount;
                if (i6 == 0) {
                    i6 = -itemCount;
                }
                if (i6 + itemCount == i4) {
                    return (View) this.f3160a.valueAt(i5);
                }
            } else if (i4 == iKeyAt % itemCount) {
                return (View) this.f3160a.valueAt(i5);
            }
        }
        return null;
    }

    /* renamed from: g */
    public int m4133g() {
        if (getItemCount() == 0) {
            return 0;
        }
        int iM4134h = m4134h();
        if (!this.f3175p) {
            return Math.abs(iM4134h);
        }
        int itemCount = !this.f3169j ? iM4134h >= 0 ? iM4134h % getItemCount() : (iM4134h % getItemCount()) + getItemCount() : iM4134h > 0 ? getItemCount() - (iM4134h % getItemCount()) : (-iM4134h) % getItemCount();
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
        return this.f3163d;
    }

    public boolean getReverseLayout() {
        return this.f3168i;
    }

    /* renamed from: h */
    public final int m4134h() {
        return Math.round(this.f3166g / this.f3173n);
    }

    /* renamed from: i */
    public float m4135i() {
        float f4 = this.f3185z;
        if (f4 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f4;
    }

    /* renamed from: j */
    public boolean m4136j() {
        return this.f3175p;
    }

    /* renamed from: k */
    public float m4137k() {
        if (this.f3169j) {
            return 0.0f;
        }
        return (getItemCount() - 1) * this.f3173n;
    }

    /* renamed from: l */
    public float m4138l() {
        if (this.f3169j) {
            return (-(getItemCount() - 1)) * this.f3173n;
        }
        return 0.0f;
    }

    /* renamed from: m */
    public final int m4139m(int i4) {
        if (this.f3163d == 1) {
            if (i4 == 33) {
                return !this.f3169j ? 1 : 0;
            }
            if (i4 == 130) {
                return this.f3169j ? 1 : 0;
            }
            return -1;
        }
        if (i4 == 17) {
            return !this.f3169j ? 1 : 0;
        }
        if (i4 == 66) {
            return this.f3169j ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: n */
    public final float m4140n() {
        if (this.f3169j) {
            if (!this.f3175p) {
                return this.f3166g;
            }
            float f4 = this.f3166g;
            if (f4 <= 0.0f) {
                return f4 % (this.f3173n * getItemCount());
            }
            float itemCount = getItemCount();
            float f5 = this.f3173n;
            return (itemCount * (-f5)) + (this.f3166g % (f5 * getItemCount()));
        }
        if (!this.f3175p) {
            return this.f3166g;
        }
        float f6 = this.f3166g;
        if (f6 >= 0.0f) {
            return f6 % (this.f3173n * getItemCount());
        }
        float itemCount2 = getItemCount();
        float f7 = this.f3173n;
        return (itemCount2 * f7) + (this.f3166g % (f7 * getItemCount()));
    }

    /* renamed from: o */
    public int m4141o() {
        float fM4133g;
        float fM4135i;
        if (this.f3175p) {
            fM4133g = (m4134h() * this.f3173n) - this.f3166g;
            fM4135i = m4135i();
        } else {
            fM4133g = (m4133g() * (!this.f3169j ? this.f3173n : -this.f3173n)) - this.f3166g;
            fM4135i = m4135i();
        }
        return (int) (fM4133g * fM4135i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.f3166g = 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i4, int i5) {
        int iM4133g = m4133g();
        View viewFindViewByPosition = findViewByPosition(iM4133g);
        if (viewFindViewByPosition == null) {
            return true;
        }
        if (recyclerView.hasFocus()) {
            int iM4139m = m4139m(i4);
            if (iM4139m != -1) {
                recyclerView.smoothScrollToPosition(iM4139m == 1 ? iM4133g - 1 : iM4133g + 1);
            }
        } else {
            viewFindViewByPosition.addFocusables(arrayList, i4, i5);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.f3174o) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            this.f3166g = 0.0f;
            return;
        }
        ensureLayoutState();
        resolveShouldLayoutReverse();
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f3161b = this.f3167h.getDecoratedMeasurement(viewForPosition);
        this.f3162c = this.f3167h.getDecoratedMeasurementInOther(viewForPosition);
        this.f3164e = (this.f3167h.getTotalSpace() - this.f3161b) / 2;
        if (this.f3181v == Integer.MAX_VALUE) {
            this.f3165f = (m4144r() - this.f3162c) / 2;
        } else {
            this.f3165f = (m4144r() - this.f3162c) - this.f3181v;
        }
        this.f3173n = m4151y();
        m4124A();
        this.f3177r = ((int) Math.abs(m4148v() / this.f3173n)) + 1;
        this.f3178s = ((int) Math.abs(m4147u() / this.f3173n)) + 1;
        SavedState savedState = this.f3172m;
        if (savedState != null) {
            this.f3169j = savedState.f3188c;
            this.f3171l = savedState.f3186a;
            this.f3166g = savedState.f3187b;
        }
        int i4 = this.f3171l;
        if (i4 != -1) {
            this.f3166g = i4 * (this.f3169j ? -this.f3173n : this.f3173n);
        }
        detachAndScrapAttachedViews(recycler);
        m4145s(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f3172m = null;
        this.f3171l = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f3172m = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f3172m != null) {
            return new SavedState(this.f3172m);
        }
        SavedState savedState = new SavedState();
        savedState.f3186a = this.f3171l;
        savedState.f3187b = this.f3166g;
        savedState.f3188c = this.f3169j;
        return savedState;
    }

    /* renamed from: p */
    public int m4142p(int i4) {
        float fM4134h;
        float fM4135i;
        if (this.f3175p) {
            fM4134h = ((m4134h() + (!this.f3169j ? i4 - m4133g() : m4133g() - i4)) * this.f3173n) - this.f3166g;
            fM4135i = m4135i();
        } else {
            fM4134h = (i4 * (!this.f3169j ? this.f3173n : -this.f3173n)) - this.f3166g;
            fM4135i = m4135i();
        }
        return (int) (fM4134h * fM4135i);
    }

    /* renamed from: q */
    public final float m4143q(int i4) {
        return i4 * (this.f3169j ? -this.f3173n : this.f3173n);
    }

    /* renamed from: r */
    public int m4144r() {
        int width;
        int paddingRight;
        if (this.f3163d == 0) {
            width = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return width - paddingRight;
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f3163d == 0 && getLayoutDirection() == 1) {
            this.f3168i = !this.f3168i;
        }
    }

    /* renamed from: s */
    public final void m4145s(RecyclerView.Recycler recycler) {
        int i4;
        int i5;
        int i6;
        detachAndScrapAttachedViews(recycler);
        this.f3160a.clear();
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int iM4134h = this.f3169j ? -m4134h() : m4134h();
        int i7 = iM4134h - this.f3177r;
        int i8 = this.f3178s + iM4134h;
        if (m4126C()) {
            int i9 = this.f3179t;
            if (i9 % 2 == 0) {
                i5 = i9 / 2;
                i6 = (iM4134h - i5) + 1;
            } else {
                i5 = (i9 - 1) / 2;
                i6 = iM4134h - i5;
            }
            int i10 = i6;
            i8 = i5 + iM4134h + 1;
            i7 = i10;
        }
        if (!this.f3175p) {
            if (i7 < 0) {
                if (m4126C()) {
                    i8 = this.f3179t;
                }
                i7 = 0;
            }
            if (i8 > itemCount) {
                i8 = itemCount;
            }
        }
        float f4 = Float.MIN_VALUE;
        while (i7 < i8) {
            if (m4126C() || !m4149w(m4143q(i7) - this.f3166g)) {
                if (i7 >= itemCount) {
                    i4 = i7 % itemCount;
                } else if (i7 < 0) {
                    int i11 = (-i7) % itemCount;
                    if (i11 == 0) {
                        i11 = itemCount;
                    }
                    i4 = itemCount - i11;
                } else {
                    i4 = i7;
                }
                View viewForPosition = recycler.getViewForPosition(i4);
                measureChildWithMargins(viewForPosition, 0, 0);
                m4150x(viewForPosition);
                float fM4143q = m4143q(i7) - this.f3166g;
                m4146t(viewForPosition, fM4143q);
                float fM4125B = this.f3176q ? m4125B(viewForPosition, fM4143q) : i4;
                if (fM4125B > f4) {
                    addView(viewForPosition);
                } else {
                    addView(viewForPosition, 0);
                }
                if (i7 == iM4134h) {
                    this.f3182w = viewForPosition;
                }
                this.f3160a.put(i7, viewForPosition);
                f4 = fM4125B;
            }
            i7++;
        }
        this.f3182w.requestFocus();
    }

    public final int scrollBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        ensureLayoutState();
        float f4 = i4;
        float fM4135i = f4 / m4135i();
        if (Math.abs(fM4135i) < 1.0E-8f) {
            return 0;
        }
        float f5 = this.f3166g + fM4135i;
        if (!this.f3175p && f5 < m4138l()) {
            i4 = (int) (f4 - ((f5 - m4138l()) * m4135i()));
        } else if (!this.f3175p && f5 > m4137k()) {
            i4 = (int) ((m4137k() - this.f3166g) * m4135i());
        }
        this.f3166g += i4 / m4135i();
        m4145s(recycler);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f3163d == 1) {
            return 0;
        }
        return scrollBy(i4, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i4) {
        if (this.f3175p || (i4 >= 0 && i4 < getItemCount())) {
            this.f3171l = i4;
            this.f3166g = i4 * (this.f3169j ? -this.f3173n : this.f3173n);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f3163d == 0) {
            return 0;
        }
        return scrollBy(i4, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i4) {
        int iM4142p = m4142p(i4);
        if (this.f3163d == 1) {
            recyclerView.smoothScrollBy(0, iM4142p, this.f3180u);
        } else {
            recyclerView.smoothScrollBy(iM4142p, 0, this.f3180u);
        }
    }

    /* renamed from: t */
    public final void m4146t(View view, float f4) {
        int iM4127a = m4127a(view, f4);
        int iM4128b = m4128b(view, f4);
        if (this.f3163d == 1) {
            int i4 = this.f3165f;
            int i5 = this.f3164e;
            layoutDecorated(view, i4 + iM4127a, i5 + iM4128b, i4 + iM4127a + this.f3162c, i5 + iM4128b + this.f3161b);
        } else {
            int i6 = this.f3164e;
            int i7 = this.f3165f;
            layoutDecorated(view, i6 + iM4127a, i7 + iM4128b, i6 + iM4127a + this.f3161b, i7 + iM4128b + this.f3162c);
        }
        m4152z(view, f4);
    }

    /* renamed from: u */
    public float m4147u() {
        return this.f3167h.getTotalSpace() - this.f3164e;
    }

    /* renamed from: v */
    public float m4148v() {
        return ((-this.f3161b) - this.f3167h.getStartAfterPadding()) - this.f3164e;
    }

    /* renamed from: w */
    public final boolean m4149w(float f4) {
        return f4 > m4147u() || f4 < m4148v();
    }

    /* renamed from: x */
    public final void m4150x(View view) {
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: y */
    public float m4151y() {
        return (this.f3161b * (((this.f3184y - 1.0f) / 2.0f) + 1.0f)) + this.f3183x;
    }

    /* renamed from: z */
    public void m4152z(View view, float f4) {
        float fM4129c = m4129c(f4 + this.f3164e);
        view.setScaleX(fM4129c);
        view.setScaleY(fM4129c);
    }
}
