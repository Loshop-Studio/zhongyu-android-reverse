package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0332a;
import androidx.core.view.C0335a;
import androidx.core.view.C0340c0;
import androidx.core.view.C0358u;
import androidx.core.view.InterfaceC0353p;
import androidx.customview.view.AbsSavedState;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p016c0.C1050c;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    AbstractC0783a mAdapter;
    private List<InterfaceC0778h> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private InterfaceC0779i mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C0776f> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private C0781k mObserver;
    private int mOffscreenPageLimit;
    private InterfaceC0779i mOnPageChangeListener;
    private List<InterfaceC0779i> mOnPageChangeListeners;
    private int mPageMargin;
    private InterfaceC0780j mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C0776f mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<C0776f> COMPARATOR = new C0771a();
    private static final Interpolator sInterpolator = new InterpolatorC0772b();
    private static final C0782l sPositionComparator = new C0782l();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0770a();

        /* renamed from: a */
        int f4650a;

        /* renamed from: b */
        Parcelable f4651b;

        /* renamed from: c */
        ClassLoader f4652c;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        static class C0770a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0770a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4650a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f4650a);
            parcel.writeParcelable(this.f4651b, i4);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f4650a = parcel.readInt();
            this.f4651b = parcel.readParcelable(classLoader);
            this.f4652c = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C0771a implements Comparator<C0776f> {
        C0771a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0776f c0776f, C0776f c0776f2) {
            return c0776f.f4657b - c0776f2.f4657b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class InterpolatorC0772b implements Interpolator {
        InterpolatorC0772b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class RunnableC0773c implements Runnable {
        RunnableC0773c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C0774d implements InterfaceC0353p {

        /* renamed from: a */
        private final Rect f4654a = new Rect();

        C0774d() {
        }

        @Override // androidx.core.view.InterfaceC0353p
        public C0340c0 onApplyWindowInsets(View view, C0340c0 c0340c0) {
            C0340c0 c0340c0M2023c0 = C0358u.m2023c0(view, c0340c0);
            if (c0340c0M2023c0.m1877p()) {
                return c0340c0M2023c0;
            }
            Rect rect = this.f4654a;
            rect.left = c0340c0M2023c0.m1872j();
            rect.top = c0340c0M2023c0.m1874l();
            rect.right = c0340c0M2023c0.m1873k();
            rect.bottom = c0340c0M2023c0.m1871i();
            int childCount = ViewPager.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C0340c0 c0340c0M2030g = C0358u.m2030g(ViewPager.this.getChildAt(i4), c0340c0M2023c0);
                rect.left = Math.min(c0340c0M2030g.m1872j(), rect.left);
                rect.top = Math.min(c0340c0M2030g.m1874l(), rect.top);
                rect.right = Math.min(c0340c0M2030g.m1873k(), rect.right);
                rect.bottom = Math.min(c0340c0M2030g.m1871i(), rect.bottom);
            }
            return c0340c0M2023c0.m1878q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface InterfaceC0775e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C0776f {

        /* renamed from: a */
        Object f4656a;

        /* renamed from: b */
        int f4657b;

        /* renamed from: c */
        boolean f4658c;

        /* renamed from: d */
        float f4659d;

        /* renamed from: e */
        float f4660e;

        C0776f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    class C0777g extends C0335a {
        C0777g() {
        }

        /* renamed from: a */
        private boolean m4044a() {
            AbstractC0783a abstractC0783a = ViewPager.this.mAdapter;
            return abstractC0783a != null && abstractC0783a.getCount() > 1;
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0783a abstractC0783a;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m4044a());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC0783a = ViewPager.this.mAdapter) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC0783a.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
            accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
        }

        @Override // androidx.core.view.C0335a
        public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
            super.onInitializeAccessibilityNodeInfo(view, c1050c);
            c1050c.m4879c0(ViewPager.class.getName());
            c1050c.m4915y0(m4044a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c1050c.m4874a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c1050c.m4874a(8192);
            }
        }

        @Override // androidx.core.view.C0335a
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) throws Resources.NotFoundException {
            if (super.performAccessibilityAction(view, i4, bundle)) {
                return true;
            }
            if (i4 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
            if (i4 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem - 1);
            return true;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface InterfaceC0778h {
        void onAdapterChanged(ViewPager viewPager, AbstractC0783a abstractC0783a, AbstractC0783a abstractC0783a2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface InterfaceC0779i {
        void onPageScrollStateChanged(int i4);

        void onPageScrolled(int i4, float f4, int i5);

        void onPageSelected(int i4);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface InterfaceC0780j {
        void transformPage(View view, float f4);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    private class C0781k extends DataSetObserver {
        C0781k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    static class C0782l implements Comparator<View> {
        C0782l() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z3 = layoutParams.f4644a;
            return z3 != layoutParams2.f4644a ? z3 ? 1 : -1 : layoutParams.f4648e - layoutParams2.f4648e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C0776f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC0773c();
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(C0776f c0776f, int i4, C0776f c0776f2) {
        int i5;
        int i6;
        C0776f c0776f3;
        C0776f c0776f4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f4 = clientWidth > 0 ? this.mPageMargin / clientWidth : IGoodView.DEFAULT_TO_ALPHA;
        if (c0776f2 != null) {
            int i7 = c0776f2.f4657b;
            int i8 = c0776f.f4657b;
            if (i7 < i8) {
                float pageWidth = c0776f2.f4660e + c0776f2.f4659d + f4;
                int i9 = i7 + 1;
                int i10 = 0;
                while (i9 <= c0776f.f4657b && i10 < this.mItems.size()) {
                    C0776f c0776f5 = this.mItems.get(i10);
                    while (true) {
                        c0776f4 = c0776f5;
                        if (i9 <= c0776f4.f4657b || i10 >= this.mItems.size() - 1) {
                            break;
                        }
                        i10++;
                        c0776f5 = this.mItems.get(i10);
                    }
                    while (i9 < c0776f4.f4657b) {
                        pageWidth += this.mAdapter.getPageWidth(i9) + f4;
                        i9++;
                    }
                    c0776f4.f4660e = pageWidth;
                    pageWidth += c0776f4.f4659d + f4;
                    i9++;
                }
            } else if (i7 > i8) {
                int size = this.mItems.size() - 1;
                float pageWidth2 = c0776f2.f4660e;
                while (true) {
                    i7--;
                    if (i7 < c0776f.f4657b || size < 0) {
                        break;
                    }
                    C0776f c0776f6 = this.mItems.get(size);
                    while (true) {
                        c0776f3 = c0776f6;
                        if (i7 >= c0776f3.f4657b || size <= 0) {
                            break;
                        }
                        size--;
                        c0776f6 = this.mItems.get(size);
                    }
                    while (i7 > c0776f3.f4657b) {
                        pageWidth2 -= this.mAdapter.getPageWidth(i7) + f4;
                        i7--;
                    }
                    pageWidth2 -= c0776f3.f4659d + f4;
                    c0776f3.f4660e = pageWidth2;
                }
            }
        }
        int size2 = this.mItems.size();
        float pageWidth3 = c0776f.f4660e;
        int i11 = c0776f.f4657b;
        int i12 = i11 - 1;
        this.mFirstOffset = i11 == 0 ? pageWidth3 : -3.4028235E38f;
        int i13 = count - 1;
        this.mLastOffset = i11 == i13 ? (c0776f.f4659d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i14 = i4 - 1;
        while (i14 >= 0) {
            C0776f c0776f7 = this.mItems.get(i14);
            while (true) {
                i6 = c0776f7.f4657b;
                if (i12 <= i6) {
                    break;
                }
                pageWidth3 -= this.mAdapter.getPageWidth(i12) + f4;
                i12--;
            }
            pageWidth3 -= c0776f7.f4659d + f4;
            c0776f7.f4660e = pageWidth3;
            if (i6 == 0) {
                this.mFirstOffset = pageWidth3;
            }
            i14--;
            i12--;
        }
        float pageWidth4 = c0776f.f4660e + c0776f.f4659d + f4;
        int i15 = c0776f.f4657b + 1;
        int i16 = i4 + 1;
        while (i16 < size2) {
            C0776f c0776f8 = this.mItems.get(i16);
            while (true) {
                i5 = c0776f8.f4657b;
                if (i15 >= i5) {
                    break;
                }
                pageWidth4 += this.mAdapter.getPageWidth(i15) + f4;
                i15++;
            }
            if (i5 == i13) {
                this.mLastOffset = (c0776f8.f4659d + pageWidth4) - 1.0f;
            }
            c0776f8.f4660e = pageWidth4;
            pageWidth4 += c0776f8.f4659d + f4;
            i16++;
            i15++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z3) {
        boolean z4 = this.mScrollState == 2;
        if (z4) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i4 = 0; i4 < this.mItems.size(); i4++) {
            C0776f c0776f = this.mItems.get(i4);
            if (c0776f.f4658c) {
                c0776f.f4658c = false;
                z4 = true;
            }
        }
        if (z4) {
            if (z3) {
                C0358u.m2035i0(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int determineTargetPage(int i4, float f4, int i5, int i6) {
        if (Math.abs(i6) <= this.mFlingDistance || Math.abs(i5) <= this.mMinimumVelocity) {
            i4 += (int) (f4 + (i4 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i5 <= 0) {
            i4++;
        }
        if (this.mItems.size() <= 0) {
            return i4;
        }
        return Math.max(this.mItems.get(0).f4657b, Math.min(i4, this.mItems.get(r4.size() - 1).f4657b));
    }

    private void dispatchOnPageScrolled(int i4, float f4, int i5) {
        InterfaceC0779i interfaceC0779i = this.mOnPageChangeListener;
        if (interfaceC0779i != null) {
            interfaceC0779i.onPageScrolled(i4, f4, i5);
        }
        List<InterfaceC0779i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC0779i interfaceC0779i2 = this.mOnPageChangeListeners.get(i6);
                if (interfaceC0779i2 != null) {
                    interfaceC0779i2.onPageScrolled(i4, f4, i5);
                }
            }
        }
        InterfaceC0779i interfaceC0779i3 = this.mInternalPageChangeListener;
        if (interfaceC0779i3 != null) {
            interfaceC0779i3.onPageScrolled(i4, f4, i5);
        }
    }

    private void dispatchOnPageSelected(int i4) {
        InterfaceC0779i interfaceC0779i = this.mOnPageChangeListener;
        if (interfaceC0779i != null) {
            interfaceC0779i.onPageSelected(i4);
        }
        List<InterfaceC0779i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                InterfaceC0779i interfaceC0779i2 = this.mOnPageChangeListeners.get(i5);
                if (interfaceC0779i2 != null) {
                    interfaceC0779i2.onPageSelected(i4);
                }
            }
        }
        InterfaceC0779i interfaceC0779i3 = this.mInternalPageChangeListener;
        if (interfaceC0779i3 != null) {
            interfaceC0779i3.onPageSelected(i4);
        }
    }

    private void dispatchOnScrollStateChanged(int i4) {
        InterfaceC0779i interfaceC0779i = this.mOnPageChangeListener;
        if (interfaceC0779i != null) {
            interfaceC0779i.onPageScrollStateChanged(i4);
        }
        List<InterfaceC0779i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                InterfaceC0779i interfaceC0779i2 = this.mOnPageChangeListeners.get(i5);
                if (interfaceC0779i2 != null) {
                    interfaceC0779i2.onPageScrollStateChanged(i4);
                }
            }
        }
        InterfaceC0779i interfaceC0779i3 = this.mInternalPageChangeListener;
        if (interfaceC0779i3 != null) {
            interfaceC0779i3.onPageScrollStateChanged(i4);
        }
    }

    private void enableLayers(boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).setLayerType(z3 ? this.mPageTransformerLayerType : 0, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C0776f infoForCurrentScrollPosition() {
        int i4;
        int clientWidth = getClientWidth();
        float f4 = IGoodView.DEFAULT_TO_ALPHA;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : IGoodView.DEFAULT_TO_ALPHA;
        float f5 = clientWidth > 0 ? this.mPageMargin / clientWidth : IGoodView.DEFAULT_TO_ALPHA;
        C0776f c0776f = null;
        float f6 = IGoodView.DEFAULT_TO_ALPHA;
        int i5 = -1;
        int i6 = 0;
        boolean z3 = true;
        while (i6 < this.mItems.size()) {
            C0776f c0776f2 = this.mItems.get(i6);
            if (!z3 && c0776f2.f4657b != (i4 = i5 + 1)) {
                c0776f2 = this.mTempItem;
                c0776f2.f4660e = f4 + f6 + f5;
                c0776f2.f4657b = i4;
                c0776f2.f4659d = this.mAdapter.getPageWidth(i4);
                i6--;
            }
            f4 = c0776f2.f4660e;
            float f7 = c0776f2.f4659d + f4 + f5;
            if (!z3 && scrollX < f4) {
                return c0776f;
            }
            if (scrollX < f7 || i6 == this.mItems.size() - 1) {
                return c0776f2;
            }
            i5 = c0776f2.f4657b;
            f6 = c0776f2.f4659d;
            i6++;
            c0776f = c0776f2;
            z3 = false;
        }
        return c0776f;
    }

    private static boolean isDecorView(View view) {
        return view.getClass().getAnnotation(InterfaceC0775e.class) != null;
    }

    private boolean isGutterDrag(float f4, float f5) {
        return (f4 < ((float) this.mGutterSize) && f5 > IGoodView.DEFAULT_TO_ALPHA) || (f4 > ((float) (getWidth() - this.mGutterSize)) && f5 < IGoodView.DEFAULT_TO_ALPHA);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i4);
            this.mActivePointerId = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i4) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, IGoodView.DEFAULT_TO_ALPHA, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0776f c0776fInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i5 = this.mPageMargin;
        int i6 = clientWidth + i5;
        float f4 = clientWidth;
        int i7 = c0776fInfoForCurrentScrollPosition.f4657b;
        float f5 = ((i4 / f4) - c0776fInfoForCurrentScrollPosition.f4660e) / (c0776fInfoForCurrentScrollPosition.f4659d + (i5 / f4));
        this.mCalledSuper = false;
        onPageScrolled(i7, f5, (int) (i6 * f5));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f4) {
        boolean z3;
        boolean z4;
        float f5 = this.mLastMotionX - f4;
        this.mLastMotionX = f4;
        float scrollX = getScrollX() + f5;
        float clientWidth = getClientWidth();
        float f6 = this.mFirstOffset * clientWidth;
        float f7 = this.mLastOffset * clientWidth;
        boolean z5 = false;
        C0776f c0776f = this.mItems.get(0);
        ArrayList<C0776f> arrayList = this.mItems;
        C0776f c0776f2 = arrayList.get(arrayList.size() - 1);
        if (c0776f.f4657b != 0) {
            f6 = c0776f.f4660e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (c0776f2.f4657b != this.mAdapter.getCount() - 1) {
            f7 = c0776f2.f4660e * clientWidth;
            z4 = false;
        } else {
            z4 = true;
        }
        if (scrollX < f6) {
            if (z3) {
                this.mLeftEdge.onPull(Math.abs(f6 - scrollX) / clientWidth);
                z5 = true;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z4) {
                this.mRightEdge.onPull(Math.abs(scrollX - f7) / clientWidth);
                z5 = true;
            }
            scrollX = f7;
        }
        int i4 = (int) scrollX;
        this.mLastMotionX += scrollX - i4;
        scrollTo(i4, getScrollY());
        pageScrolled(i4);
        return z5;
    }

    private void recomputeScrollPosition(int i4, int i5, int i6, int i7) {
        if (i5 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i5 - getPaddingLeft()) - getPaddingRight()) + i7)) * (((i4 - getPaddingLeft()) - getPaddingRight()) + i6)), getScrollY());
                return;
            }
        }
        C0776f c0776fInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((c0776fInfoForPosition != null ? Math.min(c0776fInfoForPosition.f4660e, this.mLastOffset) : IGoodView.DEFAULT_TO_ALPHA) * ((i4 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            completeScroll(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i4 = 0;
        while (i4 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i4).getLayoutParams()).f4644a) {
                removeViewAt(i4);
                i4--;
            }
            i4++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z3) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z3);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i4, boolean z3, int i5, boolean z4) throws Resources.NotFoundException {
        C0776f c0776fInfoForPosition = infoForPosition(i4);
        int clientWidth = c0776fInfoForPosition != null ? (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(c0776fInfoForPosition.f4660e, this.mLastOffset))) : 0;
        if (z3) {
            smoothScrollTo(clientWidth, 0, i5);
            if (z4) {
                dispatchOnPageSelected(i4);
                return;
            }
            return;
        }
        if (z4) {
            dispatchOnPageSelected(i4);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    private void setScrollingCacheEnabled(boolean z3) {
        if (this.mScrollingCacheEnabled != z3) {
            this.mScrollingCacheEnabled = z3;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.mDrawingOrderedChildren.add(getChildAt(i4));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        C0776f c0776fInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0 && (c0776fInfoForChild = infoForChild(childAt)) != null && c0776fInfoForChild.f4657b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i4, i5);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i5 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    C0776f addNewItem(int i4, int i5) {
        C0776f c0776f = new C0776f();
        c0776f.f4657b = i4;
        c0776f.f4656a = this.mAdapter.instantiateItem((ViewGroup) this, i4);
        c0776f.f4659d = this.mAdapter.getPageWidth(i4);
        if (i5 < 0 || i5 >= this.mItems.size()) {
            this.mItems.add(c0776f);
        } else {
            this.mItems.add(i5, c0776f);
        }
        return c0776f;
    }

    public void addOnAdapterChangeListener(InterfaceC0778h interfaceC0778h) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(interfaceC0778h);
    }

    public void addOnPageChangeListener(InterfaceC0779i interfaceC0779i) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC0779i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0776f c0776fInfoForChild;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (c0776fInfoForChild = infoForChild(childAt)) != null && c0776fInfoForChild.f4657b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zIsDecorView = layoutParams2.f4644a | isDecorView(view);
        layoutParams2.f4644a = zIsDecorView;
        if (!this.mInLayout) {
            super.addView(view, i4, layoutParams);
        } else {
            if (zIsDecorView) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f4647d = true;
            addViewInLayout(view, i4, layoutParams);
        }
    }

    public boolean arrowScroll(int i4) throws Resources.NotFoundException {
        boolean z3;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zPageLeft = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z3 = false;
                    break;
                }
                if (parent == this) {
                    z3 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z3) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i4);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i4 == 17) {
                zRequestFocus = (viewFindFocus == null || getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left < getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageLeft();
            } else if (i4 == 66) {
                zRequestFocus = (viewFindFocus == null || getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left > getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageRight();
            }
            zPageLeft = zRequestFocus;
        } else if (i4 == 17 || i4 == 1) {
            zPageLeft = pageLeft();
        } else if (i4 == 66 || i4 == 2) {
            zPageLeft = pageRight();
        }
        if (zPageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i4));
        }
        return zPageLeft;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = IGoodView.DEFAULT_TO_ALPHA;
        this.mInitialMotionX = IGoodView.DEFAULT_TO_ALPHA;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    protected boolean canScroll(View view, boolean z3, int i4, int i5, int i6) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i8 = i5 + scrollX;
                if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && (i7 = i6 + scrollY) >= childAt.getTop() && i7 < childAt.getBottom() && canScroll(childAt, true, i4, i8 - childAt.getLeft(), i7 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z3 && view.canScrollHorizontally(-i4);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i4 < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i4 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<InterfaceC0779i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0358u.m2033h0(this);
    }

    void dataSetChanged() throws Resources.NotFoundException {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z3 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int iMax = this.mCurItem;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < this.mItems.size()) {
            C0776f c0776f = this.mItems.get(i4);
            int itemPosition = this.mAdapter.getItemPosition(c0776f.f4656a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i4);
                    i4--;
                    if (!z4) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z4 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, c0776f.f4657b, c0776f.f4656a);
                    int i5 = this.mCurItem;
                    if (i5 == c0776f.f4657b) {
                        iMax = Math.max(0, Math.min(i5, count - 1));
                    }
                } else {
                    int i6 = c0776f.f4657b;
                    if (i6 != itemPosition) {
                        if (i6 == this.mCurItem) {
                            iMax = itemPosition;
                        }
                        c0776f.f4657b = itemPosition;
                    }
                }
                z3 = true;
            }
            i4++;
        }
        if (z4) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z3) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
                if (!layoutParams.f4644a) {
                    layoutParams.f4646c = IGoodView.DEFAULT_TO_ALPHA;
                }
            }
            setCurrentItemInternal(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0776f c0776fInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (c0776fInfoForChild = infoForChild(childAt)) != null && c0776fInfoForChild.f4657b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC0783a abstractC0783a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC0783a = this.mAdapter) != null && abstractC0783a.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (zDraw) {
            C0358u.m2033h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void endFakeDrag() throws Resources.NotFoundException {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0776f c0776fInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(c0776fInfoForCurrentScrollPosition.f4657b, ((scrollX / clientWidth) - c0776fInfoForCurrentScrollPosition.f4660e) / c0776fInfoForCurrentScrollPosition.f4659d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public void fakeDragBy(float f4) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f4;
        float scrollX = getScrollX() - f4;
        float clientWidth = getClientWidth();
        float f5 = this.mFirstOffset * clientWidth;
        float f6 = this.mLastOffset * clientWidth;
        C0776f c0776f = this.mItems.get(0);
        C0776f c0776f2 = this.mItems.get(r4.size() - 1);
        if (c0776f.f4657b != 0) {
            f5 = c0776f.f4660e * clientWidth;
        }
        if (c0776f2.f4657b != this.mAdapter.getCount() - 1) {
            f6 = c0776f2.f4660e * clientWidth;
        }
        if (scrollX < f5) {
            scrollX = f5;
        } else if (scrollX > f6) {
            scrollX = f6;
        }
        int i4 = (int) scrollX;
        this.mLastMotionX += scrollX - i4;
        scrollTo(i4, getScrollY());
        pageScrolled(i4);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, IGoodView.DEFAULT_TO_ALPHA, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0783a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        if (this.mDrawingOrder == 2) {
            i5 = (i4 - 1) - i5;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i5).getLayoutParams()).f4649f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    C0776f infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    C0776f infoForChild(View view) {
        for (int i4 = 0; i4 < this.mItems.size(); i4++) {
            C0776f c0776f = this.mItems.get(i4);
            if (this.mAdapter.isViewFromObject(view, c0776f.f4656a)) {
                return c0776f;
            }
        }
        return null;
    }

    C0776f infoForPosition(int i4) {
        for (int i5 = 0; i5 < this.mItems.size(); i5++) {
            C0776f c0776f = this.mItems.get(i5);
            if (c0776f.f4657b == i4) {
                return c0776f;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f4);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f4);
        this.mCloseEnough = (int) (2.0f * f4);
        this.mDefaultGutterSize = (int) (f4 * 16.0f);
        C0358u.m2051q0(this, new C0777g());
        if (C0358u.m2066y(this) == 0) {
            C0358u.m1979A0(this, 1);
        }
        C0358u.m1985D0(this, new C0774d());
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i4;
        float f4;
        float f5;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f6 = this.mPageMargin / width;
        int i5 = 0;
        C0776f c0776f = this.mItems.get(0);
        float f7 = c0776f.f4660e;
        int size = this.mItems.size();
        int i6 = c0776f.f4657b;
        int i7 = this.mItems.get(size - 1).f4657b;
        while (i6 < i7) {
            while (true) {
                i4 = c0776f.f4657b;
                if (i6 <= i4 || i5 >= size) {
                    break;
                }
                i5++;
                c0776f = this.mItems.get(i5);
            }
            if (i6 == i4) {
                float f8 = c0776f.f4660e;
                float f9 = c0776f.f4659d;
                f4 = (f8 + f9) * width;
                f7 = f8 + f9 + f6;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i6);
                f4 = (f7 + pageWidth) * width;
                f7 += pageWidth + f6;
            }
            if (this.mPageMargin + f4 > scrollX) {
                f5 = f6;
                this.mMarginDrawable.setBounds(Math.round(f4), this.mTopPageBounds, Math.round(this.mPageMargin + f4), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                f5 = f6;
            }
            if (f4 > scrollX + r2) {
                return;
            }
            i6++;
            f6 = f5;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x3 = motionEvent.getX();
            this.mInitialMotionX = x3;
            this.mLastMotionX = x3;
            float y3 = motionEvent.getY();
            this.mInitialMotionY = y3;
            this.mLastMotionY = y3;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i4 = this.mActivePointerId;
            if (i4 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float f4 = x4 - this.mLastMotionX;
                float fAbs = Math.abs(f4);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y4 - this.mInitialMotionY);
                if (f4 != IGoodView.DEFAULT_TO_ALPHA && !isGutterDrag(this.mLastMotionX, f4) && canScroll(this, false, (int) f4, (int) x4, (int) y4)) {
                    this.mLastMotionX = x4;
                    this.mLastMotionY = y4;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                int i5 = this.mTouchSlop;
                if (fAbs > i5 && fAbs * 0.5f > fAbs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    float f5 = this.mInitialMotionX;
                    float f6 = this.mTouchSlop;
                    this.mLastMotionX = f4 > IGoodView.DEFAULT_TO_ALPHA ? f5 + f6 : f5 - f6;
                    this.mLastMotionY = y4;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i5) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x4)) {
                    C0358u.m2033h0(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f4644a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f4645b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.mPageTransformer
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f4644a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.mPageTransformer
            r3.transformPage(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        int i5;
        int i6;
        C0776f c0776fInfoForChild;
        int childCount = getChildCount();
        int i7 = -1;
        if ((i4 & 2) != 0) {
            i7 = childCount;
            i5 = 0;
            i6 = 1;
        } else {
            i5 = childCount - 1;
            i6 = -1;
        }
        while (i5 != i7) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (c0776fInfoForChild = infoForChild(childAt)) != null && c0776fInfoForChild.f4657b == this.mCurItem && childAt.requestFocus(i4, rect)) {
                return true;
            }
            i5 += i6;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        AbstractC0783a abstractC0783a = this.mAdapter;
        if (abstractC0783a != null) {
            abstractC0783a.restoreState(savedState.f4651b, savedState.f4652c);
            setCurrentItemInternal(savedState.f4650a, false, true);
        } else {
            this.mRestoredCurItem = savedState.f4650a;
            this.mRestoredAdapterState = savedState.f4651b;
            this.mRestoredClassLoader = savedState.f4652c;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4650a = this.mCurItem;
        AbstractC0783a abstractC0783a = this.mAdapter;
        if (abstractC0783a != null) {
            savedState.f4651b = abstractC0783a.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6) {
            int i8 = this.mPageMargin;
            recomputeScrollPosition(i4, i6, i8, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    boolean pageLeft() throws Resources.NotFoundException {
        int i4 = this.mCurItem;
        if (i4 <= 0) {
            return false;
        }
        setCurrentItem(i4 - 1, true);
        return true;
    }

    boolean pageRight() throws Resources.NotFoundException {
        AbstractC0783a abstractC0783a = this.mAdapter;
        if (abstractC0783a == null || this.mCurItem >= abstractC0783a.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    void populate() throws Resources.NotFoundException {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(InterfaceC0778h interfaceC0778h) {
        List<InterfaceC0778h> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(interfaceC0778h);
        }
    }

    public void removeOnPageChangeListener(InterfaceC0779i interfaceC0779i) {
        List<InterfaceC0779i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC0779i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC0783a abstractC0783a) throws Resources.NotFoundException {
        AbstractC0783a abstractC0783a2 = this.mAdapter;
        if (abstractC0783a2 != null) {
            abstractC0783a2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i4 = 0; i4 < this.mItems.size(); i4++) {
                C0776f c0776f = this.mItems.get(i4);
                this.mAdapter.destroyItem((ViewGroup) this, c0776f.f4657b, c0776f.f4656a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        AbstractC0783a abstractC0783a3 = this.mAdapter;
        this.mAdapter = abstractC0783a;
        this.mExpectedAdapterCount = 0;
        if (abstractC0783a != null) {
            if (this.mObserver == null) {
                this.mObserver = new C0781k();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z3 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z3) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<InterfaceC0778h> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mAdapterChangeListeners.get(i5).onAdapterChanged(this, abstractC0783a3, abstractC0783a);
        }
    }

    public void setCurrentItem(int i4) throws Resources.NotFoundException {
        this.mPopulatePending = false;
        setCurrentItemInternal(i4, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i4, boolean z3, boolean z4) throws Resources.NotFoundException {
        setCurrentItemInternal(i4, z3, z4, 0);
    }

    InterfaceC0779i setInternalPageChangeListener(InterfaceC0779i interfaceC0779i) {
        InterfaceC0779i interfaceC0779i2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = interfaceC0779i;
        return interfaceC0779i2;
    }

    public void setOffscreenPageLimit(int i4) throws Resources.NotFoundException {
        if (i4 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i4 + " too small; defaulting to 1");
            i4 = 1;
        }
        if (i4 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i4;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0779i interfaceC0779i) {
        this.mOnPageChangeListener = interfaceC0779i;
    }

    public void setPageMargin(int i4) {
        int i5 = this.mPageMargin;
        this.mPageMargin = i4;
        int width = getWidth();
        recomputeScrollPosition(width, width, i4, i5);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z3, InterfaceC0780j interfaceC0780j) throws Resources.NotFoundException {
        setPageTransformer(z3, interfaceC0780j, 2);
    }

    void setScrollState(int i4) {
        if (this.mScrollState == i4) {
            return;
        }
        this.mScrollState = i4;
        if (this.mPageTransformer != null) {
            enableLayers(i4 != 0);
        }
        dispatchOnScrollStateChanged(i4);
    }

    void smoothScrollTo(int i4, int i5) throws Resources.NotFoundException {
        smoothScrollTo(i4, i5, 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f4644a;

        /* renamed from: b */
        public int f4645b;

        /* renamed from: c */
        float f4646c;

        /* renamed from: d */
        boolean f4647d;

        /* renamed from: e */
        int f4648e;

        /* renamed from: f */
        int f4649f;

        public LayoutParams() {
            super(-1, -1);
            this.f4646c = IGoodView.DEFAULT_TO_ALPHA;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4646c = IGoodView.DEFAULT_TO_ALPHA;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f4645b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[PHI: r7 r10 r15
      0x00f7: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void populate(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    void setCurrentItemInternal(int i4, boolean z3, boolean z4, int i5) throws Resources.NotFoundException {
        AbstractC0783a abstractC0783a = this.mAdapter;
        if (abstractC0783a == null || abstractC0783a.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z4 && this.mCurItem == i4 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 >= this.mAdapter.getCount()) {
            i4 = this.mAdapter.getCount() - 1;
        }
        int i6 = this.mOffscreenPageLimit;
        int i7 = this.mCurItem;
        if (i4 > i7 + i6 || i4 < i7 - i6) {
            for (int i8 = 0; i8 < this.mItems.size(); i8++) {
                this.mItems.get(i8).f4658c = true;
            }
        }
        boolean z5 = this.mCurItem != i4;
        if (!this.mFirstLayout) {
            populate(i4);
            scrollToItem(i4, z3, i5, z5);
        } else {
            this.mCurItem = i4;
            if (z5) {
                dispatchOnPageSelected(i4);
            }
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z3, InterfaceC0780j interfaceC0780j, int i4) throws Resources.NotFoundException {
        boolean z4 = interfaceC0780j != null;
        boolean z5 = z4 != (this.mPageTransformer != null);
        this.mPageTransformer = interfaceC0780j;
        setChildrenDrawingOrderEnabled(z4);
        if (z4) {
            this.mDrawingOrder = z3 ? 2 : 1;
            this.mPageTransformerLayerType = i4;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z5) {
            populate();
        }
    }

    void smoothScrollTo(int i4, int i5, int i6) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i7 = scrollX;
        int scrollY = getScrollY();
        int i8 = i4 - i7;
        int i9 = i5 - scrollY;
        if (i8 == 0 && i9 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i10 = clientWidth / 2;
        float f4 = clientWidth;
        float f5 = i10;
        float fDistanceInfluenceForSnapDuration = f5 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i8) * 1.0f) / f4)) * f5);
        int iAbs = Math.abs(i6);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i8) / ((f4 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f), MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i7, scrollY, i8, i9, iMin);
        C0358u.m2033h0(this);
    }

    public void setCurrentItem(int i4, boolean z3) throws Resources.NotFoundException {
        this.mPopulatePending = false;
        setCurrentItemInternal(i4, z3, false);
    }

    public void setPageMarginDrawable(int i4) {
        setPageMarginDrawable(C0332a.m1806d(getContext(), i4));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C0776f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC0773c();
        this.mScrollState = 0;
        initViewPager();
    }
}
