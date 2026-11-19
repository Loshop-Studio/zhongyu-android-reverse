package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.umeng.analytics.pro.C1913n;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0570o implements RecyclerView.AbstractC0579x.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0550a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0551b mLayoutChunkResult;
    private C0552c mLayoutState;
    int mOrientation;
    AbstractC0596j mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0549a();

        /* renamed from: a */
        int f3591a;

        /* renamed from: b */
        int f3592b;

        /* renamed from: c */
        boolean f3593c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        static class C0549a implements Parcelable.Creator<SavedState> {
            C0549a() {
            }

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

        /* renamed from: a */
        boolean m3001a() {
            return this.f3591a >= 0;
        }

        /* renamed from: b */
        void m3002b() {
            this.f3591a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f3591a);
            parcel.writeInt(this.f3592b);
            parcel.writeInt(this.f3593c ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f3591a = parcel.readInt();
            this.f3592b = parcel.readInt();
            this.f3593c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f3591a = savedState.f3591a;
            this.f3592b = savedState.f3592b;
            this.f3593c = savedState.f3593c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0550a {

        /* renamed from: a */
        AbstractC0596j f3594a;

        /* renamed from: b */
        int f3595b;

        /* renamed from: c */
        int f3596c;

        /* renamed from: d */
        boolean f3597d;

        /* renamed from: e */
        boolean f3598e;

        C0550a() {
            m3009e();
        }

        /* renamed from: a */
        void m3005a() {
            this.f3596c = this.f3597d ? this.f3594a.mo3400i() : this.f3594a.mo3404m();
        }

        /* renamed from: b */
        public void m3006b(View view, int i4) {
            if (this.f3597d) {
                this.f3596c = this.f3594a.mo3395d(view) + this.f3594a.m3406o();
            } else {
                this.f3596c = this.f3594a.mo3398g(view);
            }
            this.f3595b = i4;
        }

        /* renamed from: c */
        public void m3007c(View view, int i4) {
            int iM3406o = this.f3594a.m3406o();
            if (iM3406o >= 0) {
                m3006b(view, i4);
                return;
            }
            this.f3595b = i4;
            if (this.f3597d) {
                int iMo3400i = (this.f3594a.mo3400i() - iM3406o) - this.f3594a.mo3395d(view);
                this.f3596c = this.f3594a.mo3400i() - iMo3400i;
                if (iMo3400i > 0) {
                    int iMo3396e = this.f3596c - this.f3594a.mo3396e(view);
                    int iMo3404m = this.f3594a.mo3404m();
                    int iMin = iMo3396e - (iMo3404m + Math.min(this.f3594a.mo3398g(view) - iMo3404m, 0));
                    if (iMin < 0) {
                        this.f3596c += Math.min(iMo3400i, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo3398g = this.f3594a.mo3398g(view);
            int iMo3404m2 = iMo3398g - this.f3594a.mo3404m();
            this.f3596c = iMo3398g;
            if (iMo3404m2 > 0) {
                int iMo3400i2 = (this.f3594a.mo3400i() - Math.min(0, (this.f3594a.mo3400i() - iM3406o) - this.f3594a.mo3395d(view))) - (iMo3398g + this.f3594a.mo3396e(view));
                if (iMo3400i2 < 0) {
                    this.f3596c -= Math.min(iMo3404m2, -iMo3400i2);
                }
            }
        }

        /* renamed from: d */
        boolean m3008d(View view, RecyclerView.C0580y c0580y) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.m3019c() && layoutParams.m3017a() >= 0 && layoutParams.m3017a() < c0580y.m3161b();
        }

        /* renamed from: e */
        void m3009e() {
            this.f3595b = -1;
            this.f3596c = Integer.MIN_VALUE;
            this.f3597d = false;
            this.f3598e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3595b + ", mCoordinate=" + this.f3596c + ", mLayoutFromEnd=" + this.f3597d + ", mValid=" + this.f3598e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0551b {

        /* renamed from: a */
        public int f3599a;

        /* renamed from: b */
        public boolean f3600b;

        /* renamed from: c */
        public boolean f3601c;

        /* renamed from: d */
        public boolean f3602d;

        protected C0551b() {
        }

        /* renamed from: a */
        void m3010a() {
            this.f3599a = 0;
            this.f3600b = false;
            this.f3601c = false;
            this.f3602d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0552c {

        /* renamed from: b */
        int f3604b;

        /* renamed from: c */
        int f3605c;

        /* renamed from: d */
        int f3606d;

        /* renamed from: e */
        int f3607e;

        /* renamed from: f */
        int f3608f;

        /* renamed from: g */
        int f3609g;

        /* renamed from: k */
        int f3613k;

        /* renamed from: m */
        boolean f3615m;

        /* renamed from: a */
        boolean f3603a = true;

        /* renamed from: h */
        int f3610h = 0;

        /* renamed from: i */
        int f3611i = 0;

        /* renamed from: j */
        boolean f3612j = false;

        /* renamed from: l */
        List<RecyclerView.AbstractC0557b0> f3614l = null;

        C0552c() {
        }

        /* renamed from: e */
        private View m3011e() {
            int size = this.f3614l.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f3614l.get(i4).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.m3019c() && this.f3606d == layoutParams.m3017a()) {
                    m3013b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m3012a() {
            m3013b(null);
        }

        /* renamed from: b */
        public void m3013b(View view) {
            View viewM3016f = m3016f(view);
            if (viewM3016f == null) {
                this.f3606d = -1;
            } else {
                this.f3606d = ((RecyclerView.LayoutParams) viewM3016f.getLayoutParams()).m3017a();
            }
        }

        /* renamed from: c */
        boolean m3014c(RecyclerView.C0580y c0580y) {
            int i4 = this.f3606d;
            return i4 >= 0 && i4 < c0580y.m3161b();
        }

        /* renamed from: d */
        View m3015d(RecyclerView.C0576u c0576u) {
            if (this.f3614l != null) {
                return m3011e();
            }
            View viewM3143o = c0576u.m3143o(this.f3606d);
            this.f3606d += this.f3607e;
            return viewM3143o;
        }

        /* renamed from: f */
        public View m3016f(View view) {
            int iM3017a;
            int size = this.f3614l.size();
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < size; i5++) {
                View view3 = this.f3614l.get(i5).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.m3019c() && (iM3017a = (layoutParams.m3017a() - this.f3606d) * this.f3607e) >= 0 && iM3017a < i4) {
                    view2 = view3;
                    if (iM3017a == 0) {
                        break;
                    }
                    i4 = iM3017a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0599m.m3421a(c0580y, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0599m.m3422b(c0580y, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0599m.m3423c(c0580y, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findFirstReferenceChild(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return findReferenceChild(c0576u, c0580y, 0, getChildCount(), c0580y.m3161b());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return findReferenceChild(c0576u, c0580y, getChildCount() - 1, -1, c0580y.m3161b());
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View findReferenceChildClosestToEnd(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return this.mShouldReverseLayout ? findFirstReferenceChild(c0576u, c0580y) : findLastReferenceChild(c0576u, c0580y);
    }

    private View findReferenceChildClosestToStart(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return this.mShouldReverseLayout ? findLastReferenceChild(c0576u, c0580y) : findFirstReferenceChild(c0576u, c0580y);
    }

    private int fixLayoutEndGap(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, boolean z3) {
        int iMo3400i;
        int iMo3400i2 = this.mOrientationHelper.mo3400i() - i4;
        if (iMo3400i2 <= 0) {
            return 0;
        }
        int i5 = -scrollBy(-iMo3400i2, c0576u, c0580y);
        int i6 = i4 + i5;
        if (!z3 || (iMo3400i = this.mOrientationHelper.mo3400i() - i6) <= 0) {
            return i5;
        }
        this.mOrientationHelper.mo3409r(iMo3400i);
        return iMo3400i + i5;
    }

    private int fixLayoutStartGap(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, boolean z3) {
        int iMo3404m;
        int iMo3404m2 = i4 - this.mOrientationHelper.mo3404m();
        if (iMo3404m2 <= 0) {
            return 0;
        }
        int i5 = -scrollBy(iMo3404m2, c0576u, c0580y);
        int i6 = i4 + i5;
        if (!z3 || (iMo3404m = i6 - this.mOrientationHelper.mo3404m()) <= 0) {
            return i5;
        }
        this.mOrientationHelper.mo3409r(-iMo3404m);
        return i5 - iMo3404m;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, int i4, int i5) {
        if (!c0580y.m3166g() || getChildCount() == 0 || c0580y.m3164e() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.AbstractC0557b0> listM3139k = c0576u.m3139k();
        int size = listM3139k.size();
        int position = getPosition(getChildAt(0));
        int iMo3396e = 0;
        int iMo3396e2 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView.AbstractC0557b0 abstractC0557b0 = listM3139k.get(i6);
            if (!abstractC0557b0.isRemoved()) {
                if (((abstractC0557b0.getLayoutPosition() < position) != this.mShouldReverseLayout ? (char) 65535 : (char) 1) == 65535) {
                    iMo3396e += this.mOrientationHelper.mo3396e(abstractC0557b0.itemView);
                } else {
                    iMo3396e2 += this.mOrientationHelper.mo3396e(abstractC0557b0.itemView);
                }
            }
        }
        this.mLayoutState.f3614l = listM3139k;
        if (iMo3396e > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i4);
            C0552c c0552c = this.mLayoutState;
            c0552c.f3610h = iMo3396e;
            c0552c.f3605c = 0;
            c0552c.m3012a();
            fill(c0576u, this.mLayoutState, c0580y, false);
        }
        if (iMo3396e2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i5);
            C0552c c0552c2 = this.mLayoutState;
            c0552c2.f3610h = iMo3396e2;
            c0552c2.f3605c = 0;
            c0552c2.m3012a();
            fill(c0576u, this.mLayoutState, c0580y, false);
        }
        this.mLayoutState.f3614l = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo3398g(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.C0576u c0576u, C0552c c0552c) {
        if (!c0552c.f3603a || c0552c.f3615m) {
            return;
        }
        int i4 = c0552c.f3609g;
        int i5 = c0552c.f3611i;
        if (c0552c.f3608f == -1) {
            recycleViewsFromEnd(c0576u, i4, i5);
        } else {
            recycleViewsFromStart(c0576u, i4, i5);
        }
    }

    private void recycleChildren(RecyclerView.C0576u c0576u, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        if (i5 <= i4) {
            while (i4 > i5) {
                removeAndRecycleViewAt(i4, c0576u);
                i4--;
            }
        } else {
            for (int i6 = i5 - 1; i6 >= i4; i6--) {
                removeAndRecycleViewAt(i6, c0576u);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.C0576u c0576u, int i4, int i5) {
        int childCount = getChildCount();
        if (i4 < 0) {
            return;
        }
        int iMo3399h = (this.mOrientationHelper.mo3399h() - i4) + i5;
        if (this.mShouldReverseLayout) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (this.mOrientationHelper.mo3398g(childAt) < iMo3399h || this.mOrientationHelper.mo3408q(childAt) < iMo3399h) {
                    recycleChildren(c0576u, 0, i6);
                    return;
                }
            }
            return;
        }
        int i7 = childCount - 1;
        for (int i8 = i7; i8 >= 0; i8--) {
            View childAt2 = getChildAt(i8);
            if (this.mOrientationHelper.mo3398g(childAt2) < iMo3399h || this.mOrientationHelper.mo3408q(childAt2) < iMo3399h) {
                recycleChildren(c0576u, i7, i8);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.C0576u c0576u, int i4, int i5) {
        if (i4 < 0) {
            return;
        }
        int i6 = i4 - i5;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (this.mOrientationHelper.mo3395d(childAt) > i6 || this.mOrientationHelper.mo3407p(childAt) > i6) {
                    recycleChildren(c0576u, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            if (this.mOrientationHelper.mo3395d(childAt2) > i6 || this.mOrientationHelper.mo3407p(childAt2) > i6) {
                recycleChildren(c0576u, i8, i9);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, C0550a c0550a) {
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && c0550a.m3008d(focusedChild, c0580y)) {
            c0550a.m3007c(focusedChild, getPosition(focusedChild));
            return true;
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        View viewFindReferenceChildClosestToEnd = c0550a.f3597d ? findReferenceChildClosestToEnd(c0576u, c0580y) : findReferenceChildClosestToStart(c0576u, c0580y);
        if (viewFindReferenceChildClosestToEnd == null) {
            return false;
        }
        c0550a.m3006b(viewFindReferenceChildClosestToEnd, getPosition(viewFindReferenceChildClosestToEnd));
        if (!c0580y.m3164e() && supportsPredictiveItemAnimations()) {
            if (this.mOrientationHelper.mo3398g(viewFindReferenceChildClosestToEnd) >= this.mOrientationHelper.mo3400i() || this.mOrientationHelper.mo3395d(viewFindReferenceChildClosestToEnd) < this.mOrientationHelper.mo3404m()) {
                c0550a.f3596c = c0550a.f3597d ? this.mOrientationHelper.mo3400i() : this.mOrientationHelper.mo3404m();
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.C0580y c0580y, C0550a c0550a) {
        int i4;
        if (!c0580y.m3164e() && (i4 = this.mPendingScrollPosition) != -1) {
            if (i4 >= 0 && i4 < c0580y.m3161b()) {
                c0550a.f3595b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.m3001a()) {
                    boolean z3 = this.mPendingSavedState.f3593c;
                    c0550a.f3597d = z3;
                    if (z3) {
                        c0550a.f3596c = this.mOrientationHelper.mo3400i() - this.mPendingSavedState.f3592b;
                    } else {
                        c0550a.f3596c = this.mOrientationHelper.mo3404m() + this.mPendingSavedState.f3592b;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z4 = this.mShouldReverseLayout;
                    c0550a.f3597d = z4;
                    if (z4) {
                        c0550a.f3596c = this.mOrientationHelper.mo3400i() - this.mPendingScrollPositionOffset;
                    } else {
                        c0550a.f3596c = this.mOrientationHelper.mo3404m() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        c0550a.f3597d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c0550a.m3005a();
                } else {
                    if (this.mOrientationHelper.mo3396e(viewFindViewByPosition) > this.mOrientationHelper.mo3405n()) {
                        c0550a.m3005a();
                        return true;
                    }
                    if (this.mOrientationHelper.mo3398g(viewFindViewByPosition) - this.mOrientationHelper.mo3404m() < 0) {
                        c0550a.f3596c = this.mOrientationHelper.mo3404m();
                        c0550a.f3597d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.mo3400i() - this.mOrientationHelper.mo3395d(viewFindViewByPosition) < 0) {
                        c0550a.f3596c = this.mOrientationHelper.mo3400i();
                        c0550a.f3597d = true;
                        return true;
                    }
                    c0550a.f3596c = c0550a.f3597d ? this.mOrientationHelper.mo3395d(viewFindViewByPosition) + this.mOrientationHelper.m3406o() : this.mOrientationHelper.mo3398g(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, C0550a c0550a) {
        if (updateAnchorFromPendingData(c0580y, c0550a) || updateAnchorFromChildren(c0576u, c0580y, c0550a)) {
            return;
        }
        c0550a.m3005a();
        c0550a.f3595b = this.mStackFromEnd ? c0580y.m3161b() - 1 : 0;
    }

    private void updateLayoutState(int i4, int i5, boolean z3, RecyclerView.C0580y c0580y) {
        int iMo3404m;
        this.mLayoutState.f3615m = resolveIsInfinite();
        this.mLayoutState.f3608f = i4;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0580y, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z4 = i4 == 1;
        C0552c c0552c = this.mLayoutState;
        int i6 = z4 ? iMax2 : iMax;
        c0552c.f3610h = i6;
        if (!z4) {
            iMax = iMax2;
        }
        c0552c.f3611i = iMax;
        if (z4) {
            c0552c.f3610h = i6 + this.mOrientationHelper.mo3401j();
            View childClosestToEnd = getChildClosestToEnd();
            C0552c c0552c2 = this.mLayoutState;
            c0552c2.f3607e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C0552c c0552c3 = this.mLayoutState;
            c0552c2.f3606d = position + c0552c3.f3607e;
            c0552c3.f3604b = this.mOrientationHelper.mo3395d(childClosestToEnd);
            iMo3404m = this.mOrientationHelper.mo3395d(childClosestToEnd) - this.mOrientationHelper.mo3400i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f3610h += this.mOrientationHelper.mo3404m();
            C0552c c0552c4 = this.mLayoutState;
            c0552c4.f3607e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C0552c c0552c5 = this.mLayoutState;
            c0552c4.f3606d = position2 + c0552c5.f3607e;
            c0552c5.f3604b = this.mOrientationHelper.mo3398g(childClosestToStart);
            iMo3404m = (-this.mOrientationHelper.mo3398g(childClosestToStart)) + this.mOrientationHelper.mo3404m();
        }
        C0552c c0552c6 = this.mLayoutState;
        c0552c6.f3605c = i5;
        if (z3) {
            c0552c6.f3605c = i5 - iMo3404m;
        }
        c0552c6.f3609g = iMo3404m;
    }

    private void updateLayoutStateToFillEnd(C0550a c0550a) {
        updateLayoutStateToFillEnd(c0550a.f3595b, c0550a.f3596c);
    }

    private void updateLayoutStateToFillStart(C0550a c0550a) {
        updateLayoutStateToFillStart(c0550a.f3595b, c0550a.f3596c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(RecyclerView.C0580y c0580y, int[] iArr) {
        int i4;
        int extraLayoutSpace = getExtraLayoutSpace(c0580y);
        if (this.mLayoutState.f3608f == -1) {
            i4 = 0;
        } else {
            i4 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void collectAdjacentPrefetchPositions(int i4, int i5, RecyclerView.C0580y c0580y, RecyclerView.AbstractC0570o.c cVar) {
        if (this.mOrientation != 0) {
            i4 = i5;
        }
        if (getChildCount() == 0 || i4 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i4 > 0 ? 1 : -1, Math.abs(i4), true, c0580y);
        collectPrefetchPositionsForLayoutState(c0580y, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void collectInitialPrefetchPositions(int i4, RecyclerView.AbstractC0570o.c cVar) {
        boolean z3;
        int i5;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.m3001a()) {
            resolveShouldLayoutReverse();
            z3 = this.mShouldReverseLayout;
            i5 = this.mPendingScrollPosition;
            if (i5 == -1) {
                i5 = z3 ? i4 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z3 = savedState2.f3593c;
            i5 = savedState2.f3591a;
        }
        int i6 = z3 ? -1 : 1;
        for (int i7 = 0; i7 < this.mInitialPrefetchItemCount && i5 >= 0 && i5 < i4; i7++) {
            cVar.mo3096a(i5, 0);
            i5 += i6;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.C0580y c0580y, C0552c c0552c, RecyclerView.AbstractC0570o.c cVar) {
        int i4 = c0552c.f3606d;
        if (i4 < 0 || i4 >= c0580y.m3161b()) {
            return;
        }
        cVar.mo3096a(i4, Math.max(0, c0552c.f3609g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollExtent(RecyclerView.C0580y c0580y) {
        return computeScrollExtent(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollOffset(RecyclerView.C0580y c0580y) {
        return computeScrollOffset(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollRange(RecyclerView.C0580y c0580y) {
        return computeScrollRange(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579x.b
    public PointF computeScrollVectorForPosition(int i4) {
        if (getChildCount() == 0) {
            return null;
        }
        int i5 = (i4 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i5, IGoodView.DEFAULT_TO_ALPHA) : new PointF(IGoodView.DEFAULT_TO_ALPHA, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollExtent(RecyclerView.C0580y c0580y) {
        return computeScrollExtent(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollOffset(RecyclerView.C0580y c0580y) {
        return computeScrollOffset(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollRange(RecyclerView.C0580y c0580y) {
        return computeScrollRange(c0580y);
    }

    int convertFocusDirectionToLayoutDirection(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? (i4 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    C0552c createLayoutState() {
        return new C0552c();
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.C0576u c0576u, C0552c c0552c, RecyclerView.C0580y c0580y, boolean z3) {
        int i4 = c0552c.f3605c;
        int i5 = c0552c.f3609g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                c0552c.f3609g = i5 + i4;
            }
            recycleByLayoutState(c0576u, c0552c);
        }
        int i6 = c0552c.f3605c + c0552c.f3610h;
        C0551b c0551b = this.mLayoutChunkResult;
        while (true) {
            if ((!c0552c.f3615m && i6 <= 0) || !c0552c.m3014c(c0580y)) {
                break;
            }
            c0551b.m3010a();
            layoutChunk(c0576u, c0580y, c0552c, c0551b);
            if (!c0551b.f3600b) {
                c0552c.f3604b += c0551b.f3599a * c0552c.f3608f;
                if (!c0551b.f3601c || c0552c.f3614l != null || !c0580y.m3164e()) {
                    int i7 = c0552c.f3605c;
                    int i8 = c0551b.f3599a;
                    c0552c.f3605c = i7 - i8;
                    i6 -= i8;
                }
                int i9 = c0552c.f3609g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + c0551b.f3599a;
                    c0552c.f3609g = i10;
                    int i11 = c0552c.f3605c;
                    if (i11 < 0) {
                        c0552c.f3609g = i10 + i11;
                    }
                    recycleByLayoutState(c0576u, c0552c);
                }
                if (z3 && c0551b.f3602d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - c0552c.f3605c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findFirstVisibleChildClosestToEnd(boolean z3, boolean z4) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z3, z4) : findOneVisibleChild(getChildCount() - 1, -1, z3, z4);
    }

    View findFirstVisibleChildClosestToStart(boolean z3, boolean z4) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z3, z4) : findOneVisibleChild(0, getChildCount(), z3, z4);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i4, int i5) {
        int i6;
        int i7;
        ensureLayoutState();
        if ((i5 > i4 ? (char) 1 : i5 < i4 ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i4);
        }
        if (this.mOrientationHelper.mo3398g(getChildAt(i4)) < this.mOrientationHelper.mo3404m()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = C1913n.a.f8859a;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m3444a(i4, i5, i6, i7) : this.mVerticalBoundCheck.m3444a(i4, i5, i6, i7);
    }

    View findOneVisibleChild(int i4, int i5, boolean z3, boolean z4) {
        ensureLayoutState();
        int i6 = z3 ? 24579 : 320;
        int i7 = z4 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m3444a(i4, i5, i6, i7) : this.mVerticalBoundCheck.m3444a(i4, i5, i6, i7);
    }

    View findReferenceChild(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, int i4, int i5, int i6) {
        ensureLayoutState();
        int iMo3404m = this.mOrientationHelper.mo3404m();
        int iMo3400i = this.mOrientationHelper.mo3400i();
        int i7 = i5 > i4 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            int position = getPosition(childAt);
            if (position >= 0 && position < i6) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).m3019c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo3398g(childAt) < iMo3400i && this.mOrientationHelper.mo3395d(childAt) >= iMo3404m) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i4 += i7;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public View findViewByPosition(int i4) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i4 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i4) {
                return childAt;
            }
        }
        return super.findViewByPosition(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.C0580y c0580y) {
        if (c0580y.m3163d()) {
            return this.mOrientationHelper.mo3405n();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, C0552c c0552c, C0551b c0551b) {
        int i4;
        int i5;
        int i6;
        int paddingLeft;
        int iMo3397f;
        View viewM3015d = c0552c.m3015d(c0576u);
        if (viewM3015d == null) {
            c0551b.f3600b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewM3015d.getLayoutParams();
        if (c0552c.f3614l == null) {
            if (this.mShouldReverseLayout == (c0552c.f3608f == -1)) {
                addView(viewM3015d);
            } else {
                addView(viewM3015d, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c0552c.f3608f == -1)) {
                addDisappearingView(viewM3015d);
            } else {
                addDisappearingView(viewM3015d, 0);
            }
        }
        measureChildWithMargins(viewM3015d, 0, 0);
        c0551b.f3599a = this.mOrientationHelper.mo3396e(viewM3015d);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo3397f = getWidth() - getPaddingRight();
                paddingLeft = iMo3397f - this.mOrientationHelper.mo3397f(viewM3015d);
            } else {
                paddingLeft = getPaddingLeft();
                iMo3397f = this.mOrientationHelper.mo3397f(viewM3015d) + paddingLeft;
            }
            if (c0552c.f3608f == -1) {
                int i7 = c0552c.f3604b;
                i6 = i7;
                i5 = iMo3397f;
                i4 = i7 - c0551b.f3599a;
            } else {
                int i8 = c0552c.f3604b;
                i4 = i8;
                i5 = iMo3397f;
                i6 = c0551b.f3599a + i8;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo3397f2 = this.mOrientationHelper.mo3397f(viewM3015d) + paddingTop;
            if (c0552c.f3608f == -1) {
                int i9 = c0552c.f3604b;
                i5 = i9;
                i4 = paddingTop;
                i6 = iMo3397f2;
                paddingLeft = i9 - c0551b.f3599a;
            } else {
                int i10 = c0552c.f3604b;
                i4 = paddingTop;
                i5 = c0551b.f3599a + i10;
                i6 = iMo3397f2;
                paddingLeft = i10;
            }
        }
        layoutDecoratedWithMargins(viewM3015d, paddingLeft, i4, i5, i6);
        if (layoutParams.m3019c() || layoutParams.m3018b()) {
            c0551b.f3601c = true;
        }
        c0551b.f3602d = viewM3015d.hasFocusable();
    }

    void onAnchorReady(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, C0550a c0550a, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0576u c0576u) {
        super.onDetachedFromWindow(recyclerView, c0576u);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c0576u);
            c0576u.m3131c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public View onFocusSearchFailed(View view, int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i4)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo3405n() * MAX_SCROLL_FACTOR), false, c0580y);
        C0552c c0552c = this.mLayoutState;
        c0552c.f3609g = Integer.MIN_VALUE;
        c0552c.f3603a = false;
        fill(c0576u, c0552c, c0580y, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutChildren(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iFixLayoutEndGap;
        int i8;
        View viewFindViewByPosition;
        int iMo3398g;
        int iMo3400i;
        int i9 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c0580y.m3161b() == 0) {
            removeAndRecycleAllViews(c0576u);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.m3001a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f3591a;
        }
        ensureLayoutState();
        this.mLayoutState.f3603a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C0550a c0550a = this.mAnchorInfo;
        if (!c0550a.f3598e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c0550a.m3009e();
            C0550a c0550a2 = this.mAnchorInfo;
            c0550a2.f3597d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(c0576u, c0580y, c0550a2);
            this.mAnchorInfo.f3598e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo3398g(focusedChild) >= this.mOrientationHelper.mo3400i() || this.mOrientationHelper.mo3395d(focusedChild) <= this.mOrientationHelper.mo3404m())) {
            this.mAnchorInfo.m3007c(focusedChild, getPosition(focusedChild));
        }
        C0552c c0552c = this.mLayoutState;
        c0552c.f3608f = c0552c.f3613k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0580y, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo3404m();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo3401j();
        if (c0580y.m3164e() && (i8 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i8)) != null) {
            if (this.mShouldReverseLayout) {
                iMo3400i = this.mOrientationHelper.mo3400i() - this.mOrientationHelper.mo3395d(viewFindViewByPosition);
                iMo3398g = this.mPendingScrollPositionOffset;
            } else {
                iMo3398g = this.mOrientationHelper.mo3398g(viewFindViewByPosition) - this.mOrientationHelper.mo3404m();
                iMo3400i = this.mPendingScrollPositionOffset;
            }
            int i10 = iMo3400i - iMo3398g;
            if (i10 > 0) {
                iMax += i10;
            } else {
                iMax2 -= i10;
            }
        }
        C0550a c0550a3 = this.mAnchorInfo;
        if (!c0550a3.f3597d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i9 = 1;
        }
        onAnchorReady(c0576u, c0580y, c0550a3, i9);
        detachAndScrapAttachedViews(c0576u);
        this.mLayoutState.f3615m = resolveIsInfinite();
        this.mLayoutState.f3612j = c0580y.m3164e();
        this.mLayoutState.f3611i = 0;
        C0550a c0550a4 = this.mAnchorInfo;
        if (c0550a4.f3597d) {
            updateLayoutStateToFillStart(c0550a4);
            C0552c c0552c2 = this.mLayoutState;
            c0552c2.f3610h = iMax;
            fill(c0576u, c0552c2, c0580y, false);
            C0552c c0552c3 = this.mLayoutState;
            i5 = c0552c3.f3604b;
            int i11 = c0552c3.f3606d;
            int i12 = c0552c3.f3605c;
            if (i12 > 0) {
                iMax2 += i12;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C0552c c0552c4 = this.mLayoutState;
            c0552c4.f3610h = iMax2;
            c0552c4.f3606d += c0552c4.f3607e;
            fill(c0576u, c0552c4, c0580y, false);
            C0552c c0552c5 = this.mLayoutState;
            i4 = c0552c5.f3604b;
            int i13 = c0552c5.f3605c;
            if (i13 > 0) {
                updateLayoutStateToFillStart(i11, i5);
                C0552c c0552c6 = this.mLayoutState;
                c0552c6.f3610h = i13;
                fill(c0576u, c0552c6, c0580y, false);
                i5 = this.mLayoutState.f3604b;
            }
        } else {
            updateLayoutStateToFillEnd(c0550a4);
            C0552c c0552c7 = this.mLayoutState;
            c0552c7.f3610h = iMax2;
            fill(c0576u, c0552c7, c0580y, false);
            C0552c c0552c8 = this.mLayoutState;
            i4 = c0552c8.f3604b;
            int i14 = c0552c8.f3606d;
            int i15 = c0552c8.f3605c;
            if (i15 > 0) {
                iMax += i15;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C0552c c0552c9 = this.mLayoutState;
            c0552c9.f3610h = iMax;
            c0552c9.f3606d += c0552c9.f3607e;
            fill(c0576u, c0552c9, c0580y, false);
            C0552c c0552c10 = this.mLayoutState;
            i5 = c0552c10.f3604b;
            int i16 = c0552c10.f3605c;
            if (i16 > 0) {
                updateLayoutStateToFillEnd(i14, i4);
                C0552c c0552c11 = this.mLayoutState;
                c0552c11.f3610h = i16;
                fill(c0576u, c0552c11, c0580y, false);
                i4 = this.mLayoutState.f3604b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i4, c0576u, c0580y, true);
                i6 = i5 + iFixLayoutEndGap2;
                i7 = i4 + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i6, c0576u, c0580y, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i5, c0576u, c0580y, true);
                i6 = i5 + iFixLayoutStartGap;
                i7 = i4 + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i7, c0576u, c0580y, false);
            }
            i5 = i6 + iFixLayoutEndGap;
            i4 = i7 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(c0576u, c0580y, i5, i4);
        if (c0580y.m3164e()) {
            this.mAnchorInfo.m3009e();
        } else {
            this.mOrientationHelper.m3410s();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutCompleted(RecyclerView.C0580y c0580y) {
        super.onLayoutCompleted(c0580y);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m3009e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z3 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.f3593c = z3;
            if (z3) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.f3592b = this.mOrientationHelper.mo3400i() - this.mOrientationHelper.mo3395d(childClosestToEnd);
                savedState.f3591a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.f3591a = getPosition(childClosestToStart);
                savedState.f3592b = this.mOrientationHelper.mo3398g(childClosestToStart) - this.mOrientationHelper.mo3404m();
            }
        } else {
            savedState.m3002b();
        }
        return savedState;
    }

    public void prepareForDrop(View view, View view2, int i4, int i5) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c4 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c4 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo3400i() - (this.mOrientationHelper.mo3398g(view2) + this.mOrientationHelper.mo3396e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo3400i() - this.mOrientationHelper.mo3395d(view2));
                return;
            }
        }
        if (c4 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo3398g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo3395d(view2) - this.mOrientationHelper.mo3396e(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo3402k() == 0 && this.mOrientationHelper.mo3399h() == 0;
    }

    int scrollBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f3603a = true;
        int i5 = i4 > 0 ? 1 : -1;
        int iAbs = Math.abs(i4);
        updateLayoutState(i5, iAbs, true, c0580y);
        C0552c c0552c = this.mLayoutState;
        int iFill = c0552c.f3609g + fill(c0576u, c0552c, c0580y, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i4 = i5 * iFill;
        }
        this.mOrientationHelper.mo3409r(-i4);
        this.mLayoutState.f3613k = i4;
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int scrollHorizontallyBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i4, c0576u, c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void scrollToPosition(int i4) {
        this.mPendingScrollPosition = i4;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.m3002b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i4, int i5) {
        this.mPendingScrollPosition = i4;
        this.mPendingScrollPositionOffset = i5;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.m3002b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int scrollVerticallyBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i4, c0576u, c0580y);
    }

    public void setInitialPrefetchItemCount(int i4) {
        this.mInitialPrefetchItemCount = i4;
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i4);
        }
        assertNotInLayoutOrScroll(null);
        if (i4 != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC0596j abstractC0596jM3393b = AbstractC0596j.m3393b(this, i4);
            this.mOrientationHelper = abstractC0596jM3393b;
            this.mAnchorInfo.f3594a = abstractC0596jM3393b;
            this.mOrientation = i4;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z3) {
        this.mRecycleChildrenOnDetach = z3;
    }

    public void setReverseLayout(boolean z3) {
        assertNotInLayoutOrScroll(null);
        if (z3 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z3;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z3) {
        this.mSmoothScrollbarEnabled = z3;
    }

    public void setStackFromEnd(boolean z3) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z3) {
            return;
        }
        this.mStackFromEnd = z3;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0580y c0580y, int i4) {
        C0593g c0593g = new C0593g(recyclerView.getContext());
        c0593g.setTargetPosition(i4);
        startSmoothScroll(c0593g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo3398g = this.mOrientationHelper.mo3398g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i4 = 1; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                int position2 = getPosition(childAt);
                int iMo3398g2 = this.mOrientationHelper.mo3398g(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    sb.append(iMo3398g2 < iMo3398g);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo3398g2 > iMo3398g) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i5 = 1; i5 < getChildCount(); i5++) {
            View childAt2 = getChildAt(i5);
            int position3 = getPosition(childAt2);
            int iMo3398g3 = this.mOrientationHelper.mo3398g(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                sb2.append(iMo3398g3 < iMo3398g);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo3398g3 < iMo3398g) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i4, boolean z3) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0550a();
        this.mLayoutChunkResult = new C0551b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i4);
        setReverseLayout(z3);
    }

    private void updateLayoutStateToFillEnd(int i4, int i5) {
        this.mLayoutState.f3605c = this.mOrientationHelper.mo3400i() - i5;
        C0552c c0552c = this.mLayoutState;
        c0552c.f3607e = this.mShouldReverseLayout ? -1 : 1;
        c0552c.f3606d = i4;
        c0552c.f3608f = 1;
        c0552c.f3604b = i5;
        c0552c.f3609g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i4, int i5) {
        this.mLayoutState.f3605c = i5 - this.mOrientationHelper.mo3404m();
        C0552c c0552c = this.mLayoutState;
        c0552c.f3606d = i4;
        c0552c.f3607e = this.mShouldReverseLayout ? 1 : -1;
        c0552c.f3608f = -1;
        c0552c.f3604b = i5;
        c0552c.f3609g = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0550a();
        this.mLayoutChunkResult = new C0551b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.AbstractC0570o.d properties = RecyclerView.AbstractC0570o.getProperties(context, attributeSet, i4, i5);
        setOrientation(properties.f3646a);
        setReverseLayout(properties.f3648c);
        setStackFromEnd(properties.f3649d);
    }
}
