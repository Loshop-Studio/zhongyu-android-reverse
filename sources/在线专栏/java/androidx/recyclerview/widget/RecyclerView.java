package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.C0335a;
import androidx.core.view.C0347j;
import androidx.core.view.C0349l;
import androidx.core.view.C0358u;
import androidx.core.view.C0359v;
import androidx.core.view.InterfaceC0348k;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C0587a;
import androidx.recyclerview.widget.C0588b;
import androidx.recyclerview.widget.C0598l;
import androidx.recyclerview.widget.C0602p;
import androidx.recyclerview.widget.C0603q;
import androidx.recyclerview.widget.RunnableC0591e;
import com.umeng.analytics.pro.C1913n;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p011b0.C1025h;
import p016c0.C1049b;
import p016c0.C1050c;
import p126o0.C2904a;
import p126o0.C2905b;
import p126o0.C2906c;
import p172y.C3485d;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0348k {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    C0598l mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC0562g mAdapter;
    C0587a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC0565j mChildDrawingOrderCallback;
    C0588b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0566k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC0591e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC0573r mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC0567l mItemAnimator;
    private AbstractC0567l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC0569n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    AbstractC0570o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0578w mObserver;
    private List<InterfaceC0571p> mOnChildAttachStateListeners;
    private AbstractC0572q mOnFlingListener;
    private final ArrayList<InterfaceC0573r> mOnItemTouchListeners;
    final List<AbstractC0557b0> mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    RunnableC0591e.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0576u mRecycler;
    InterfaceC0577v mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC0574s mScrollListener;
    private List<AbstractC0574s> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0349l mScrollingChildHelper;
    final C0580y mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC0555a0 mViewFlinger;
    private final C0603q.b mViewInfoProcessCallback;
    final C0603q mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class RunnableC0554a implements Runnable {
        RunnableC0554a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    class RunnableC0555a0 implements Runnable {

        /* renamed from: a */
        private int f3622a;

        /* renamed from: b */
        private int f3623b;

        /* renamed from: c */
        OverScroller f3624c;

        /* renamed from: d */
        Interpolator f3625d;

        /* renamed from: e */
        private boolean f3626e;

        /* renamed from: f */
        private boolean f3627f;

        RunnableC0555a0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f3625d = interpolator;
            this.f3626e = false;
            this.f3627f = false;
            this.f3624c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m3025a(int i4, int i5, int i6, int i7) {
            int iRound;
            int iAbs = Math.abs(i4);
            int iAbs2 = Math.abs(i5);
            boolean z3 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i6 * i6) + (i7 * i7));
            int iSqrt2 = (int) Math.sqrt((i4 * i4) + (i5 * i5));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i8 = width / 2;
            float f4 = width;
            float f5 = i8;
            float fM3026b = f5 + (m3026b(Math.min(1.0f, (iSqrt2 * 1.0f) / f4)) * f5);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fM3026b / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z3) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f4) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        /* renamed from: b */
        private float m3026b(float f4) {
            return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
        }

        /* renamed from: d */
        private void m3027d() {
            RecyclerView.this.removeCallbacks(this);
            C0358u.m2035i0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void m3028c(int i4, int i5) {
            RecyclerView.this.setScrollState(2);
            this.f3623b = 0;
            this.f3622a = 0;
            Interpolator interpolator = this.f3625d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3625d = interpolator2;
                this.f3624c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3624c.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m3029e();
        }

        /* renamed from: e */
        void m3029e() {
            if (this.f3626e) {
                this.f3627f = true;
            } else {
                m3027d();
            }
        }

        /* renamed from: f */
        public void m3030f(int i4, int i5, int i6, Interpolator interpolator) {
            if (i6 == Integer.MIN_VALUE) {
                i6 = m3025a(i4, i5, 0, 0);
            }
            int i7 = i6;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3625d != interpolator) {
                this.f3625d = interpolator;
                this.f3624c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3623b = 0;
            this.f3622a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3624c.startScroll(0, 0, i4, i5, i7);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3624c.computeScrollOffset();
            }
            m3029e();
        }

        /* renamed from: g */
        public void m3031g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3624c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m3031g();
                return;
            }
            this.f3627f = false;
            this.f3626e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f3624c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f3622a;
                int i7 = currY - this.f3623b;
                this.f3622a = currX;
                this.f3623b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i6, i7, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i6 -= iArr2[0];
                    i7 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i6, i7);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i6, i7, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i5 = iArr4[0];
                    i4 = iArr4[1];
                    i6 -= i5;
                    i7 -= i4;
                    AbstractC0579x abstractC0579x = recyclerView4.mLayout.mSmoothScroller;
                    if (abstractC0579x != null && !abstractC0579x.isPendingInitialRun() && abstractC0579x.isRunning()) {
                        int iM3161b = RecyclerView.this.mState.m3161b();
                        if (iM3161b == 0) {
                            abstractC0579x.stop();
                        } else if (abstractC0579x.getTargetPosition() >= iM3161b) {
                            abstractC0579x.setTargetPosition(iM3161b - 1);
                            abstractC0579x.onAnimation(i5, i4);
                        } else {
                            abstractC0579x.onAnimation(i5, i4);
                        }
                    }
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i5, i4, i6, i7, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i8 = i6 - iArr6[0];
                int i9 = i7 - iArr6[1];
                if (i5 != 0 || i4 != 0) {
                    recyclerView6.dispatchOnScrolled(i5, i4);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i8 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i9 != 0));
                AbstractC0579x abstractC0579x2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((abstractC0579x2 != null && abstractC0579x2.isPendingInitialRun()) || !z3) {
                    m3029e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC0591e runnableC0591e = recyclerView7.mGapWorker;
                    if (runnableC0591e != null) {
                        runnableC0591e.m3366f(recyclerView7, i5, i4);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i10 = i8 < 0 ? -currVelocity : i8 > 0 ? currVelocity : 0;
                        if (i9 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i9 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i10, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m3370b();
                    }
                }
            }
            AbstractC0579x abstractC0579x3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (abstractC0579x3 != null && abstractC0579x3.isPendingInitialRun()) {
                abstractC0579x3.onAnimation(0, 0);
            }
            this.f3626e = false;
            if (this.f3627f) {
                m3027d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class RunnableC0556b implements Runnable {
        RunnableC0556b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0567l abstractC0567l = RecyclerView.this.mItemAnimator;
            if (abstractC0567l != null) {
                abstractC0567l.mo3085u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class AbstractC0557b0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC0557b0 mShadowedHolder = null;
        AbstractC0557b0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C0576u mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public AbstractC0557b0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i4) {
            this.mFlags = i4 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C0358u.m2010S(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i4, int i5, boolean z3) {
            addFlags(8);
            offsetPosition(i5, z3);
            this.mPosition = i4;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i4 = this.mPreLayoutPosition;
            return i4 == -1 ? this.mPosition : i4;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i4 = this.mPreLayoutPosition;
            return i4 == -1 ? this.mPosition : i4;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i4) {
            return (i4 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C0358u.m2010S(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i4, boolean z3) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z3) {
                this.mPreLayoutPosition += i4;
            }
            this.mPosition += i4;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f3618c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i4 = this.mPendingAccessibilityState;
            if (i4 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i4;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C0358u.m2066y(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i4, int i5) {
            this.mFlags = (i4 & i5) | (this.mFlags & (~i5));
        }

        public final void setIsRecyclable(boolean z3) {
            int i4 = this.mIsRecyclableCount;
            int i5 = z3 ? i4 - 1 : i4 + 1;
            this.mIsRecyclableCount = i5;
            if (i5 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z3 && i5 == 1) {
                this.mFlags |= 16;
            } else if (z3 && i5 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(C0576u c0576u, boolean z3) {
            this.mScrapContainer = c0576u;
            this.mInChangeScrap = z3;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.m3126J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class InterpolatorC0558c implements Interpolator {
        InterpolatorC0558c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0559d implements C0603q.b {
        C0559d() {
        }

        @Override // androidx.recyclerview.widget.C0603q.b
        /* renamed from: a */
        public void mo3032a(AbstractC0557b0 abstractC0557b0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(abstractC0557b0.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.C0603q.b
        /* renamed from: b */
        public void mo3033b(AbstractC0557b0 abstractC0557b0, AbstractC0567l.c cVar, AbstractC0567l.c cVar2) {
            RecyclerView.this.animateAppearance(abstractC0557b0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0603q.b
        /* renamed from: c */
        public void mo3034c(AbstractC0557b0 abstractC0557b0, AbstractC0567l.c cVar, AbstractC0567l.c cVar2) {
            RecyclerView.this.mRecycler.m3126J(abstractC0557b0);
            RecyclerView.this.animateDisappearance(abstractC0557b0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0603q.b
        /* renamed from: d */
        public void mo3035d(AbstractC0557b0 abstractC0557b0, AbstractC0567l.c cVar, AbstractC0567l.c cVar2) {
            abstractC0557b0.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.mo3067b(abstractC0557b0, abstractC0557b0, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo3069d(abstractC0557b0, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C0560e implements C0588b.b {
        C0560e() {
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: a */
        public View mo3036a(int i4) {
            return RecyclerView.this.getChildAt(i4);
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: b */
        public void mo3037b(View view) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: c */
        public AbstractC0557b0 mo3038c(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: d */
        public void mo3039d(int i4) {
            AbstractC0557b0 childViewHolderInt;
            View viewMo3036a = mo3036a(i4);
            if (viewMo3036a != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(viewMo3036a)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i4);
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: e */
        public void mo3040e(View view) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: f */
        public void mo3041f(View view, int i4) {
            RecyclerView.this.addView(view, i4);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: g */
        public int mo3042g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: h */
        public void mo3043h(int i4) {
            View childAt = RecyclerView.this.getChildAt(i4);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i4);
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: i */
        public void mo3044i() {
            int iMo3042g = mo3042g();
            for (int i4 = 0; i4 < iMo3042g; i4++) {
                View viewMo3036a = mo3036a(i4);
                RecyclerView.this.dispatchChildDetached(viewMo3036a);
                viewMo3036a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: j */
        public void mo3045j(View view, int i4, ViewGroup.LayoutParams layoutParams) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i4, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C0588b.b
        /* renamed from: k */
        public int mo3046k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C0561f implements C0587a.a {
        C0561f() {
        }

        @Override // androidx.recyclerview.widget.C0587a.a
        /* renamed from: a */
        public void mo3047a(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForMove(i4, i5);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0587a.a
        /* renamed from: b */
        public void mo3048b(C0587a.b bVar) {
            m3055i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0587a.a
        /* renamed from: c */
        public AbstractC0557b0 mo3049c(int i4) {
            AbstractC0557b0 abstractC0557b0FindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i4, true);
            if (abstractC0557b0FindViewHolderForPosition == null || RecyclerView.this.mChildHelper.m3311n(abstractC0557b0FindViewHolderForPosition.itemView)) {
                return null;
            }
            return abstractC0557b0FindViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.C0587a.a
        /* renamed from: d */
        public void mo3050d(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForRemove(i4, i5, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0587a.a
        /* renamed from: e */
        public void mo3051e(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForInsert(i4, i5);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0587a.a
        /* renamed from: f */
        public void mo3052f(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForRemove(i4, i5, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3675d += i5;
        }

        @Override // androidx.recyclerview.widget.C0587a.a
        /* renamed from: g */
        public void mo3053g(C0587a.b bVar) {
            m3055i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0587a.a
        /* renamed from: h */
        public void mo3054h(int i4, int i5, Object obj) {
            RecyclerView.this.viewRangeUpdate(i4, i5, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: i */
        void m3055i(C0587a.b bVar) {
            int i4 = bVar.f3753a;
            if (i4 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f3754b, bVar.f3756d);
                return;
            }
            if (i4 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f3754b, bVar.f3756d);
            } else if (i4 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f3754b, bVar.f3756d, bVar.f3755c);
            } else {
                if (i4 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f3754b, bVar.f3756d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class AbstractC0562g<VH extends AbstractC0557b0> {
        private final C0563h mObservable = new C0563h();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(VH vh, int i4) {
            vh.mPosition = i4;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i4);
            }
            vh.setFlags(1, 519);
            C3485d.m10560a(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i4, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).f3618c = true;
            }
            C3485d.m10561b();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i4) {
            try {
                C3485d.m10560a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i4);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i4;
                return vh;
            } finally {
                C3485d.m10561b();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i4) {
            return -1L;
        }

        public int getItemViewType(int i4) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.m3056a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m3057b();
        }

        public final void notifyItemChanged(int i4) {
            this.mObservable.m3059d(i4, 1);
        }

        public final void notifyItemInserted(int i4) {
            this.mObservable.m3061f(i4, 1);
        }

        public final void notifyItemMoved(int i4, int i5) {
            this.mObservable.m3058c(i4, i5);
        }

        public final void notifyItemRangeChanged(int i4, int i5) {
            this.mObservable.m3059d(i4, i5);
        }

        public final void notifyItemRangeInserted(int i4, int i5) {
            this.mObservable.m3061f(i4, i5);
        }

        public final void notifyItemRangeRemoved(int i4, int i5) {
            this.mObservable.m3062g(i4, i5);
        }

        public final void notifyItemRemoved(int i4) {
            this.mObservable.m3062g(i4, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i4);

        public void onBindViewHolder(VH vh, int i4, List<Object> list) {
            onBindViewHolder(vh, i4);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i4);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(AbstractC0564i abstractC0564i) {
            this.mObservable.registerObserver(abstractC0564i);
        }

        public void setHasStableIds(boolean z3) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z3;
        }

        public void unregisterAdapterDataObserver(AbstractC0564i abstractC0564i) {
            this.mObservable.unregisterObserver(abstractC0564i);
        }

        public final void notifyItemChanged(int i4, Object obj) {
            this.mObservable.m3060e(i4, 1, obj);
        }

        public final void notifyItemRangeChanged(int i4, int i5, Object obj) {
            this.mObservable.m3060e(i4, i5, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C0563h extends Observable<AbstractC0564i> {
        C0563h() {
        }

        /* renamed from: a */
        public boolean m3056a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m3057b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0564i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* renamed from: c */
        public void m3058c(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0564i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i4, i5, 1);
            }
        }

        /* renamed from: d */
        public void m3059d(int i4, int i5) {
            m3060e(i4, i5, null);
        }

        /* renamed from: e */
        public void m3060e(int i4, int i5, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0564i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i4, i5, obj);
            }
        }

        /* renamed from: f */
        public void m3061f(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0564i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i4, i5);
            }
        }

        /* renamed from: g */
        public void m3062g(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0564i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i4, i5);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class AbstractC0564i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i4, int i5) {
        }

        public void onItemRangeChanged(int i4, int i5, Object obj) {
            onItemRangeChanged(i4, i5);
        }

        public void onItemRangeInserted(int i4, int i5) {
        }

        public void onItemRangeMoved(int i4, int i5, int i6) {
        }

        public void onItemRangeRemoved(int i4, int i5) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface InterfaceC0565j {
        /* renamed from: a */
        int m3063a(int i4, int i5);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0566k {
        /* renamed from: a */
        protected EdgeEffect m3064a(RecyclerView recyclerView, int i4) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC0567l {

        /* renamed from: a */
        private b f3633a = null;

        /* renamed from: b */
        private ArrayList<a> f3634b = new ArrayList<>();

        /* renamed from: c */
        private long f3635c = 120;

        /* renamed from: d */
        private long f3636d = 120;

        /* renamed from: e */
        private long f3637e = 250;

        /* renamed from: f */
        private long f3638f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface a {
            /* renamed from: a */
            void m3087a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface b {
            /* renamed from: a */
            void mo3088a(AbstractC0557b0 abstractC0557b0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class c {

            /* renamed from: a */
            public int f3639a;

            /* renamed from: b */
            public int f3640b;

            /* renamed from: c */
            public int f3641c;

            /* renamed from: d */
            public int f3642d;

            /* renamed from: a */
            public c m3089a(AbstractC0557b0 abstractC0557b0) {
                return m3090b(abstractC0557b0, 0);
            }

            /* renamed from: b */
            public c m3090b(AbstractC0557b0 abstractC0557b0, int i4) {
                View view = abstractC0557b0.itemView;
                this.f3639a = view.getLeft();
                this.f3640b = view.getTop();
                this.f3641c = view.getRight();
                this.f3642d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m3065e(AbstractC0557b0 abstractC0557b0) {
            int i4 = abstractC0557b0.mFlags & 14;
            if (abstractC0557b0.isInvalid()) {
                return 4;
            }
            if ((i4 & 4) != 0) {
                return i4;
            }
            int oldPosition = abstractC0557b0.getOldPosition();
            int adapterPosition = abstractC0557b0.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i4 : i4 | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo3066a(AbstractC0557b0 abstractC0557b0, c cVar, c cVar2);

        /* renamed from: b */
        public abstract boolean mo3067b(AbstractC0557b0 abstractC0557b0, AbstractC0557b0 abstractC0557b02, c cVar, c cVar2);

        /* renamed from: c */
        public abstract boolean mo3068c(AbstractC0557b0 abstractC0557b0, c cVar, c cVar2);

        /* renamed from: d */
        public abstract boolean mo3069d(AbstractC0557b0 abstractC0557b0, c cVar, c cVar2);

        /* renamed from: f */
        public abstract boolean mo3070f(AbstractC0557b0 abstractC0557b0);

        /* renamed from: g */
        public boolean mo3071g(AbstractC0557b0 abstractC0557b0, List<Object> list) {
            return mo3070f(abstractC0557b0);
        }

        /* renamed from: h */
        public final void m3072h(AbstractC0557b0 abstractC0557b0) {
            m3082r(abstractC0557b0);
            b bVar = this.f3633a;
            if (bVar != null) {
                bVar.mo3088a(abstractC0557b0);
            }
        }

        /* renamed from: i */
        public final void m3073i() {
            int size = this.f3634b.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f3634b.get(i4).m3087a();
            }
            this.f3634b.clear();
        }

        /* renamed from: j */
        public abstract void mo3074j(AbstractC0557b0 abstractC0557b0);

        /* renamed from: k */
        public abstract void mo3075k();

        /* renamed from: l */
        public long m3076l() {
            return this.f3635c;
        }

        /* renamed from: m */
        public long m3077m() {
            return this.f3638f;
        }

        /* renamed from: n */
        public long m3078n() {
            return this.f3637e;
        }

        /* renamed from: o */
        public long m3079o() {
            return this.f3636d;
        }

        /* renamed from: p */
        public abstract boolean mo3080p();

        /* renamed from: q */
        public c m3081q() {
            return new c();
        }

        /* renamed from: r */
        public void m3082r(AbstractC0557b0 abstractC0557b0) {
        }

        /* renamed from: s */
        public c m3083s(C0580y c0580y, AbstractC0557b0 abstractC0557b0) {
            return m3081q().m3089a(abstractC0557b0);
        }

        /* renamed from: t */
        public c m3084t(C0580y c0580y, AbstractC0557b0 abstractC0557b0, int i4, List<Object> list) {
            return m3081q().m3089a(abstractC0557b0);
        }

        /* renamed from: u */
        public abstract void mo3085u();

        /* renamed from: v */
        void m3086v(b bVar) {
            this.f3633a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C0568m implements AbstractC0567l.b {
        C0568m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l.b
        /* renamed from: a */
        public void mo3088a(AbstractC0557b0 abstractC0557b0) {
            abstractC0557b0.setIsRecyclable(true);
            if (abstractC0557b0.mShadowedHolder != null && abstractC0557b0.mShadowingHolder == null) {
                abstractC0557b0.mShadowedHolder = null;
            }
            abstractC0557b0.mShadowingHolder = null;
            if (abstractC0557b0.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(abstractC0557b0.itemView) || !abstractC0557b0.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC0557b0.itemView, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC0569n {
        @Deprecated
        public void getItemOffsets(Rect rect, int i4, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C0580y c0580y) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0580y c0580y) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0580y c0580y) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).m3017a(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC0570o {
        boolean mAutoMeasure;
        C0588b mChildHelper;
        private int mHeight;
        private int mHeightMode;
        C0602p mHorizontalBoundCheck;
        private final C0602p.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        AbstractC0579x mSmoothScroller;
        C0602p mVerticalBoundCheck;
        private final C0602p.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class a implements C0602p.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: a */
            public View mo3091a(int i4) {
                return AbstractC0570o.this.getChildAt(i4);
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: b */
            public int mo3092b() {
                return AbstractC0570o.this.getWidth() - AbstractC0570o.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: c */
            public int mo3093c(View view) {
                return AbstractC0570o.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: d */
            public int mo3094d() {
                return AbstractC0570o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: e */
            public int mo3095e(View view) {
                return AbstractC0570o.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class b implements C0602p.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: a */
            public View mo3091a(int i4) {
                return AbstractC0570o.this.getChildAt(i4);
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: b */
            public int mo3092b() {
                return AbstractC0570o.this.getHeight() - AbstractC0570o.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: c */
            public int mo3093c(View view) {
                return AbstractC0570o.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: d */
            public int mo3094d() {
                return AbstractC0570o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C0602p.b
            /* renamed from: e */
            public int mo3095e(View view) {
                return AbstractC0570o.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface c {
            /* renamed from: a */
            void mo3096a(int i4, int i5);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class d {

            /* renamed from: a */
            public int f3646a;

            /* renamed from: b */
            public int f3647b;

            /* renamed from: c */
            public boolean f3648c;

            /* renamed from: d */
            public boolean f3649d;
        }

        public AbstractC0570o() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new C0602p(aVar);
            this.mVerticalBoundCheck = new C0602p(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i4, boolean z3) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z3 || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m3453b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m3466p(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.m3302c(view, i4, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iM3310m = this.mChildHelper.m3310m(view);
                if (i4 == -1) {
                    i4 = this.mChildHelper.m3306g();
                }
                if (iM3310m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (iM3310m != i4) {
                    this.mRecyclerView.mLayout.moveView(iM3310m, i4);
                }
            } else {
                this.mChildHelper.m3300a(view, i4, false);
                layoutParams.f3618c = true;
                AbstractC0579x abstractC0579x = this.mSmoothScroller;
                if (abstractC0579x != null && abstractC0579x.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f3619d) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.f3619d = false;
            }
        }

        public static int chooseSize(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
        }

        private void detachViewInternal(int i4, View view) {
            this.mChildHelper.m3303d(i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = 0
                goto L21
            Lf:
                if (r3 < 0) goto L14
            L11:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0570o.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i4 = left - paddingLeft;
            int iMin = Math.min(0, i4);
            int i5 = top - paddingTop;
            int iMin2 = Math.min(0, i5);
            int i6 = iWidth - width;
            int iMax = Math.max(0, i6);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i4, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i6);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i5, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i4, int i5) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2906c.f11386f, i4, i5);
            dVar.f3646a = typedArrayObtainStyledAttributes.getInt(C2906c.f11387g, 1);
            dVar.f3647b = typedArrayObtainStyledAttributes.getInt(C2906c.f11397q, 1);
            dVar.f3648c = typedArrayObtainStyledAttributes.getBoolean(C2906c.f11396p, false);
            dVar.f3649d = typedArrayObtainStyledAttributes.getBoolean(C2906c.f11398r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i4, int i5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i4 < width && rect.right - i4 > paddingLeft && rect.top - i5 < height && rect.bottom - i5 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (i6 > 0 && i4 != i6) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i4;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i4;
            }
            return true;
        }

        private void scrapOrRecycleView(C0576u c0576u, int i4, View view) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i4);
                c0576u.m3120C(childViewHolderInt);
            } else {
                detachViewAt(i4);
                c0576u.m3121D(view);
                this.mRecyclerView.mViewInfoStore.m3462k(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i4, LayoutParams layoutParams) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m3453b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m3466p(childViewHolderInt);
            }
            this.mChildHelper.m3302c(view, i4, layoutParams, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i4, int i5, C0580y c0580y, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i4, c cVar) {
        }

        public int computeHorizontalScrollExtent(C0580y c0580y) {
            return 0;
        }

        public int computeHorizontalScrollOffset(C0580y c0580y) {
            return 0;
        }

        public int computeHorizontalScrollRange(C0580y c0580y) {
            return 0;
        }

        public int computeVerticalScrollExtent(C0580y c0580y) {
            return 0;
        }

        public int computeVerticalScrollOffset(C0580y c0580y) {
            return 0;
        }

        public int computeVerticalScrollRange(C0580y c0580y) {
            return 0;
        }

        public void detachAndScrapAttachedViews(C0576u c0576u) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(c0576u, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, C0576u c0576u) {
            scrapOrRecycleView(c0576u, this.mChildHelper.m3310m(view), view);
        }

        public void detachAndScrapViewAt(int i4, C0576u c0576u) {
            scrapOrRecycleView(c0576u, i4, getChildAt(i4));
        }

        public void detachView(View view) {
            int iM3310m = this.mChildHelper.m3310m(view);
            if (iM3310m >= 0) {
                detachViewInternal(iM3310m, view);
            }
        }

        public void detachViewAt(int i4) {
            detachViewInternal(i4, getChildAt(i4));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, C0576u c0576u) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, c0576u);
        }

        public void endAnimation(View view) {
            AbstractC0567l abstractC0567l = this.mRecyclerView.mItemAnimator;
            if (abstractC0567l != null) {
                abstractC0567l.mo3074j(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.m3311n(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i4 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.m3164e() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3617b.bottom;
        }

        public View getChildAt(int i4) {
            C0588b c0588b = this.mChildHelper;
            if (c0588b != null) {
                return c0588b.m3305f(i4);
            }
            return null;
        }

        public int getChildCount() {
            C0588b c0588b = this.mChildHelper;
            if (c0588b != null) {
                return c0588b.m3306g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(C0576u c0576u, C0580y c0580y) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f3617b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f3617b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.m3311n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            AbstractC0562g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return C0358u.m1978A(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3617b.left;
        }

        public int getMinimumHeight() {
            return C0358u.m1980B(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return C0358u.m1982C(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return C0358u.m1988F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return C0358u.m1990G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((LayoutParams) view.getLayoutParams()).m3017a();
        }

        public int getRightDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3617b.right;
        }

        public int getRowCountForAccessibility(C0576u c0576u, C0580y c0580y) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(C0576u c0576u, C0580y c0580y) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3617b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z3, Rect rect) {
            Matrix matrix;
            if (z3) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f3617b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.m3467q(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(C0576u c0576u, C0580y c0580y) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            AbstractC0579x abstractC0579x = this.mSmoothScroller;
            return abstractC0579x != null && abstractC0579x.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z3, boolean z4) {
            boolean z5 = this.mHorizontalBoundCheck.m3445b(view, 24579) && this.mVerticalBoundCheck.m3445b(view, 24579);
            return z3 ? z5 : !z5;
        }

        public void layoutDecorated(View view, int i4, int i5, int i6, int i7) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f3617b;
            view.layout(i4 + rect.left, i5 + rect.top, i6 - rect.right, i7 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i4, int i5, int i6, int i7) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f3617b;
            view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(View view, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i6 = i4 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i7 = i5 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i7, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i6 = i4 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i7 = i5 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i4, int i5) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                detachViewAt(i4);
                attachView(childAt, i5);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i4 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i4) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i4);
            }
        }

        public void offsetChildrenVertical(int i4) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i4);
            }
        }

        public void onAdapterChanged(AbstractC0562g abstractC0562g, AbstractC0562g abstractC0562g2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i4, int i5) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, C0576u c0576u) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view, int i4, C0576u c0576u, C0580y c0580y) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(C1050c c1050c) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c1050c);
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, C1050c c1050c) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.m3311n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c1050c);
        }

        public View onInterceptFocusSearch(View view, int i4) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i4, int i5) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i4, int i5, int i6) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i4, int i5) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5, Object obj) {
            onItemsUpdated(recyclerView, i4, i5);
        }

        public void onLayoutChildren(C0576u c0576u, C0580y c0580y) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(C0580y c0580y) {
        }

        public void onMeasure(C0576u c0576u, C0580y c0580y, int i4, int i5) {
            this.mRecyclerView.defaultOnMeasure(i4, i5);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i4) {
        }

        void onSmoothScrollerStopped(AbstractC0579x abstractC0579x) {
            if (this.mSmoothScroller == abstractC0579x) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i4, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i4, bundle);
        }

        boolean performAccessibilityActionForItem(View view, int i4, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i4, bundle);
        }

        public boolean performAccessibilityActionForItem(C0576u c0576u, C0580y c0580y, View view, int i4, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                C0358u.m2035i0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.m3314q(childCount);
            }
        }

        public void removeAndRecycleAllViews(C0576u c0576u) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, c0576u);
                }
            }
        }

        void removeAndRecycleScrapInt(C0576u c0576u) {
            int iM3138j = c0576u.m3138j();
            for (int i4 = iM3138j - 1; i4 >= 0; i4--) {
                View viewM3142n = c0576u.m3142n(i4);
                AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM3142n);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(viewM3142n, false);
                    }
                    AbstractC0567l abstractC0567l = this.mRecyclerView.mItemAnimator;
                    if (abstractC0567l != null) {
                        abstractC0567l.mo3074j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    c0576u.m3151y(viewM3142n);
                }
            }
            c0576u.m3133e();
            if (iM3138j > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, C0576u c0576u) {
            removeView(view);
            c0576u.m3119B(view);
        }

        public void removeAndRecycleViewAt(int i4, C0576u c0576u) {
            View childAt = getChildAt(i4);
            removeViewAt(i4);
            c0576u.m3119B(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.m3313p(view);
        }

        public void removeViewAt(int i4) {
            if (getChildAt(i4) != null) {
                this.mChildHelper.m3314q(i4);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z3) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z3, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i4, C0576u c0576u, C0580y c0580y) {
            return 0;
        }

        public void scrollToPosition(int i4) {
        }

        public int scrollVerticallyBy(int i4, C0576u c0576u, C0580y c0580y) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z3) {
            this.mAutoMeasure = z3;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z3) {
            if (z3 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z3;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m3127K();
                }
            }
        }

        void setMeasureSpecs(int i4, int i5) {
            this.mWidth = View.MeasureSpec.getSize(i4);
            int mode = View.MeasureSpec.getMode(i4);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i4, int i5) {
            setMeasuredDimension(chooseSize(i4, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i5, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i4, int i5) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i4, i5);
                return;
            }
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = Integer.MAX_VALUE;
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i11 = rect.left;
                if (i11 < i8) {
                    i8 = i11;
                }
                int i12 = rect.right;
                if (i12 > i6) {
                    i6 = i12;
                }
                int i13 = rect.top;
                if (i13 < i9) {
                    i9 = i13;
                }
                int i14 = rect.bottom;
                if (i14 > i7) {
                    i7 = i14;
                }
            }
            this.mRecyclerView.mTempRect.set(i8, i9, i6, i7);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i4, i5);
        }

        public void setMeasurementCacheEnabled(boolean z3) {
            this.mMeasurementCacheEnabled = z3;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i4, int i5, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i4, int i5, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, C0580y c0580y, int i4) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(AbstractC0579x abstractC0579x) {
            AbstractC0579x abstractC0579x2 = this.mSmoothScroller;
            if (abstractC0579x2 != null && abstractC0579x != abstractC0579x2 && abstractC0579x2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = abstractC0579x;
            abstractC0579x.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            AbstractC0579x abstractC0579x = this.mSmoothScroller;
            if (abstractC0579x != null) {
                abstractC0579x.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i4) {
            addViewInt(view, i4, true);
        }

        public void addView(View view, int i4) {
            addViewInt(view, i4, false);
        }

        public void onInitializeAccessibilityEvent(C0576u c0576u, C0580y c0580y, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z3 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            AbstractC0562g abstractC0562g = this.mRecyclerView.mAdapter;
            if (abstractC0562g != null) {
                accessibilityEvent.setItemCount(abstractC0562g.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(C0576u c0576u, C0580y c0580y, C1050c c1050c) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                c1050c.m4874a(8192);
                c1050c.m4915y0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                c1050c.m4874a(4096);
                c1050c.m4915y0(true);
            }
            c1050c.m4882e0(C1050c.b.m4922b(getRowCountForAccessibility(c0576u, c0580y), getColumnCountForAccessibility(c0576u, c0580y), isLayoutHierarchical(c0576u, c0580y), getSelectionModeForAccessibility(c0576u, c0580y)));
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, C0580y c0580y, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(C0576u c0576u, C0580y c0580y, int i4, Bundle bundle) {
            int height;
            int width;
            int i5;
            int i6;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i4 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i5 = height;
                    i6 = width;
                }
                i5 = height;
                i6 = 0;
            } else if (i4 != 8192) {
                i6 = 0;
                i5 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i5 = height;
                    i6 = width;
                }
                i5 = height;
                i6 = 0;
            }
            if (i5 == 0 && i6 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i6, i5, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i4 = childRectangleOnScreenScrollAmount[0];
            int i5 = childRectangleOnScreenScrollAmount[1];
            if ((z4 && !isFocusedChildVisibleAfterScrolling(recyclerView, i4, i5)) || (i4 == 0 && i5 == 0)) {
                return false;
            }
            if (z3) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.smoothScrollBy(i4, i5);
            }
            return true;
        }

        public static int getChildMeasureSpec(int i4, int i5, int i6, int i7, boolean z3) {
            int iMax = Math.max(0, i4 - i6);
            if (z3) {
                if (i7 < 0) {
                    if (i7 != -1 || (i5 != Integer.MIN_VALUE && (i5 == 0 || i5 != 1073741824))) {
                        i5 = 0;
                        i7 = 0;
                    } else {
                        i7 = iMax;
                    }
                }
                i5 = 1073741824;
            } else {
                if (i7 < 0) {
                    if (i7 != -1) {
                        if (i7 == -2) {
                            i5 = (i5 == Integer.MIN_VALUE || i5 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        i5 = 0;
                        i7 = 0;
                    }
                    i7 = iMax;
                }
                i5 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i7, i5);
        }

        public void onInitializeAccessibilityNodeInfoForItem(C0576u c0576u, C0580y c0580y, View view, C1050c c1050c) {
            c1050c.m4884f0(C1050c.c.m4923a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void attachView(View view, int i4) {
            attachView(view, i4, (LayoutParams) view.getLayoutParams());
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i4, int i5) {
            this.mRecyclerView.setMeasuredDimension(i4, i5);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public interface InterfaceC0571p {
        /* renamed from: a */
        void mo3097a(View view);

        /* renamed from: b */
        void mo3098b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static abstract class AbstractC0572q {
        public abstract boolean onFling(int i4, int i5);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public interface InterfaceC0573r {
        /* renamed from: a */
        boolean mo3099a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo3100b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo3101c(boolean z3);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static abstract class AbstractC0574s {
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        }

        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static class C0575t {

        /* renamed from: a */
        SparseArray<a> f3650a = new SparseArray<>();

        /* renamed from: b */
        private int f3651b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$t$a */
        static class a {

            /* renamed from: a */
            final ArrayList<AbstractC0557b0> f3652a = new ArrayList<>();

            /* renamed from: b */
            int f3653b = 5;

            /* renamed from: c */
            long f3654c = 0;

            /* renamed from: d */
            long f3655d = 0;

            a() {
            }
        }

        /* renamed from: g */
        private a m3102g(int i4) {
            a aVar = this.f3650a.get(i4);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3650a.put(i4, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        void m3103a() {
            this.f3651b++;
        }

        /* renamed from: b */
        public void m3104b() {
            for (int i4 = 0; i4 < this.f3650a.size(); i4++) {
                this.f3650a.valueAt(i4).f3652a.clear();
            }
        }

        /* renamed from: c */
        void m3105c() {
            this.f3651b--;
        }

        /* renamed from: d */
        void m3106d(int i4, long j4) {
            a aVarM3102g = m3102g(i4);
            aVarM3102g.f3655d = m3111j(aVarM3102g.f3655d, j4);
        }

        /* renamed from: e */
        void m3107e(int i4, long j4) {
            a aVarM3102g = m3102g(i4);
            aVarM3102g.f3654c = m3111j(aVarM3102g.f3654c, j4);
        }

        /* renamed from: f */
        public AbstractC0557b0 m3108f(int i4) {
            a aVar = this.f3650a.get(i4);
            if (aVar == null || aVar.f3652a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0557b0> arrayList = aVar.f3652a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: h */
        void m3109h(AbstractC0562g abstractC0562g, AbstractC0562g abstractC0562g2, boolean z3) {
            if (abstractC0562g != null) {
                m3105c();
            }
            if (!z3 && this.f3651b == 0) {
                m3104b();
            }
            if (abstractC0562g2 != null) {
                m3103a();
            }
        }

        /* renamed from: i */
        public void m3110i(AbstractC0557b0 abstractC0557b0) {
            int itemViewType = abstractC0557b0.getItemViewType();
            ArrayList<AbstractC0557b0> arrayList = m3102g(itemViewType).f3652a;
            if (this.f3650a.get(itemViewType).f3653b <= arrayList.size()) {
                return;
            }
            abstractC0557b0.resetInternal();
            arrayList.add(abstractC0557b0);
        }

        /* renamed from: j */
        long m3111j(long j4, long j5) {
            return j4 == 0 ? j5 : ((j4 / 4) * 3) + (j5 / 4);
        }

        /* renamed from: k */
        boolean m3112k(int i4, long j4, long j5) {
            long j6 = m3102g(i4).f3655d;
            return j6 == 0 || j4 + j6 < j5;
        }

        /* renamed from: l */
        boolean m3113l(int i4, long j4, long j5) {
            long j6 = m3102g(i4).f3654c;
            return j6 == 0 || j4 + j6 < j5;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public final class C0576u {

        /* renamed from: a */
        final ArrayList<AbstractC0557b0> f3656a;

        /* renamed from: b */
        ArrayList<AbstractC0557b0> f3657b;

        /* renamed from: c */
        final ArrayList<AbstractC0557b0> f3658c;

        /* renamed from: d */
        private final List<AbstractC0557b0> f3659d;

        /* renamed from: e */
        private int f3660e;

        /* renamed from: f */
        int f3661f;

        /* renamed from: g */
        C0575t f3662g;

        public C0576u() {
            ArrayList<AbstractC0557b0> arrayList = new ArrayList<>();
            this.f3656a = arrayList;
            this.f3657b = null;
            this.f3658c = new ArrayList<>();
            this.f3659d = Collections.unmodifiableList(arrayList);
            this.f3660e = 2;
            this.f3661f = 2;
        }

        /* renamed from: H */
        private boolean m3114H(AbstractC0557b0 abstractC0557b0, int i4, int i5, long j4) {
            abstractC0557b0.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = abstractC0557b0.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j4 != RecyclerView.FOREVER_NS && !this.f3662g.m3112k(itemViewType, nanoTime, j4)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(abstractC0557b0, i4);
            this.f3662g.m3106d(abstractC0557b0.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m3115b(abstractC0557b0);
            if (!RecyclerView.this.mState.m3164e()) {
                return true;
            }
            abstractC0557b0.mPreLayoutPosition = i5;
            return true;
        }

        /* renamed from: b */
        private void m3115b(AbstractC0557b0 abstractC0557b0) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = abstractC0557b0.itemView;
                if (C0358u.m2066y(view) == 0) {
                    C0358u.m1979A0(view, 1);
                }
                C0598l c0598l = RecyclerView.this.mAccessibilityDelegate;
                if (c0598l == null) {
                    return;
                }
                C0335a itemDelegate = c0598l.getItemDelegate();
                if (itemDelegate instanceof C0598l.a) {
                    ((C0598l.a) itemDelegate).m3420b(view);
                }
                C0358u.m2051q0(view, itemDelegate);
            }
        }

        /* renamed from: q */
        private void m3116q(ViewGroup viewGroup, boolean z3) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m3116q((ViewGroup) childAt, true);
                }
            }
            if (z3) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: r */
        private void m3117r(AbstractC0557b0 abstractC0557b0) {
            View view = abstractC0557b0.itemView;
            if (view instanceof ViewGroup) {
                m3116q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m3118A(int i4) {
            m3130a(this.f3658c.get(i4), true);
            this.f3658c.remove(i4);
        }

        /* renamed from: B */
        public void m3119B(View view) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m3120C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.mo3074j(childViewHolderInt);
        }

        /* renamed from: C */
        void m3120C(AbstractC0557b0 abstractC0557b0) {
            boolean z3;
            boolean z4 = true;
            if (abstractC0557b0.isScrap() || abstractC0557b0.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC0557b0.isScrap());
                sb.append(" isAttached:");
                sb.append(abstractC0557b0.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC0557b0.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0557b0 + RecyclerView.this.exceptionLabel());
            }
            if (abstractC0557b0.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
            boolean zDoesTransientStatePreventRecycling = abstractC0557b0.doesTransientStatePreventRecycling();
            AbstractC0562g abstractC0562g = RecyclerView.this.mAdapter;
            if ((abstractC0562g != null && zDoesTransientStatePreventRecycling && abstractC0562g.onFailedToRecycleView(abstractC0557b0)) || abstractC0557b0.isRecyclable()) {
                if (this.f3661f <= 0 || abstractC0557b0.hasAnyOfTheFlags(526)) {
                    z3 = false;
                } else {
                    int size = this.f3658c.size();
                    if (size >= this.f3661f && size > 0) {
                        m3118A(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m3372d(abstractC0557b0.mPosition)) {
                        int i4 = size - 1;
                        while (i4 >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.m3372d(this.f3658c.get(i4).mPosition)) {
                                break;
                            } else {
                                i4--;
                            }
                        }
                        size = i4 + 1;
                    }
                    this.f3658c.add(size, abstractC0557b0);
                    z3 = true;
                }
                if (z3) {
                    z = z3;
                    z4 = false;
                } else {
                    m3130a(abstractC0557b0, true);
                    z = z3;
                }
            } else {
                z4 = false;
            }
            RecyclerView.this.mViewInfoStore.m3467q(abstractC0557b0);
            if (z || z4 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            abstractC0557b0.mOwnerRecyclerView = null;
        }

        /* renamed from: D */
        void m3121D(View view) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3657b == null) {
                    this.f3657b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f3657b.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f3656a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* renamed from: E */
        void m3122E(C0575t c0575t) {
            C0575t c0575t2 = this.f3662g;
            if (c0575t2 != null) {
                c0575t2.m3105c();
            }
            this.f3662g = c0575t;
            if (c0575t == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f3662g.m3103a();
        }

        /* renamed from: F */
        void m3123F(AbstractC0581z abstractC0581z) {
        }

        /* renamed from: G */
        public void m3124G(int i4) {
            this.f3660e = i4;
            m3127K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[PHI: r1 r4
          0x012c: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$b0) = (r1v11 androidx.recyclerview.widget.RecyclerView$b0), (r1v30 androidx.recyclerview.widget.RecyclerView$b0) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
          0x012c: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01d6  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        androidx.recyclerview.widget.RecyclerView.AbstractC0557b0 m3125I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 530
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0576u.m3125I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        /* renamed from: J */
        void m3126J(AbstractC0557b0 abstractC0557b0) {
            if (abstractC0557b0.mInChangeScrap) {
                this.f3657b.remove(abstractC0557b0);
            } else {
                this.f3656a.remove(abstractC0557b0);
            }
            abstractC0557b0.mScrapContainer = null;
            abstractC0557b0.mInChangeScrap = false;
            abstractC0557b0.clearReturnedFromScrapFlag();
        }

        /* renamed from: K */
        void m3127K() {
            AbstractC0570o abstractC0570o = RecyclerView.this.mLayout;
            this.f3661f = this.f3660e + (abstractC0570o != null ? abstractC0570o.mPrefetchMaxCountObserved : 0);
            for (int size = this.f3658c.size() - 1; size >= 0 && this.f3658c.size() > this.f3661f; size--) {
                m3118A(size);
            }
        }

        /* renamed from: L */
        boolean m3128L(AbstractC0557b0 abstractC0557b0) {
            if (abstractC0557b0.isRemoved()) {
                return RecyclerView.this.mState.m3164e();
            }
            int i4 = abstractC0557b0.mPosition;
            if (i4 >= 0 && i4 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.m3164e() || RecyclerView.this.mAdapter.getItemViewType(abstractC0557b0.mPosition) == abstractC0557b0.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || abstractC0557b0.getItemId() == RecyclerView.this.mAdapter.getItemId(abstractC0557b0.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0557b0 + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: M */
        void m3129M(int i4, int i5) {
            int i6;
            int i7 = i5 + i4;
            for (int size = this.f3658c.size() - 1; size >= 0; size--) {
                AbstractC0557b0 abstractC0557b0 = this.f3658c.get(size);
                if (abstractC0557b0 != null && (i6 = abstractC0557b0.mPosition) >= i4 && i6 < i7) {
                    abstractC0557b0.addFlags(2);
                    m3118A(size);
                }
            }
        }

        /* renamed from: a */
        void m3130a(AbstractC0557b0 abstractC0557b0, boolean z3) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC0557b0);
            View view = abstractC0557b0.itemView;
            C0598l c0598l = RecyclerView.this.mAccessibilityDelegate;
            if (c0598l != null) {
                C0335a itemDelegate = c0598l.getItemDelegate();
                C0358u.m2051q0(view, itemDelegate instanceof C0598l.a ? ((C0598l.a) itemDelegate).m3419a(view) : null);
            }
            if (z3) {
                m3135g(abstractC0557b0);
            }
            abstractC0557b0.mOwnerRecyclerView = null;
            m3137i().m3110i(abstractC0557b0);
        }

        /* renamed from: c */
        public void m3131c() {
            this.f3656a.clear();
            m3152z();
        }

        /* renamed from: d */
        void m3132d() {
            int size = this.f3658c.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f3658c.get(i4).clearOldPosition();
            }
            int size2 = this.f3656a.size();
            for (int i5 = 0; i5 < size2; i5++) {
                this.f3656a.get(i5).clearOldPosition();
            }
            ArrayList<AbstractC0557b0> arrayList = this.f3657b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    this.f3657b.get(i6).clearOldPosition();
                }
            }
        }

        /* renamed from: e */
        void m3133e() {
            this.f3656a.clear();
            ArrayList<AbstractC0557b0> arrayList = this.f3657b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m3134f(int i4) {
            if (i4 >= 0 && i4 < RecyclerView.this.mState.m3161b()) {
                return !RecyclerView.this.mState.m3164e() ? i4 : RecyclerView.this.mAdapterHelper.m3284m(i4);
            }
            throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + RecyclerView.this.mState.m3161b() + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: g */
        void m3135g(AbstractC0557b0 abstractC0557b0) {
            InterfaceC0577v interfaceC0577v = RecyclerView.this.mRecyclerListener;
            if (interfaceC0577v != null) {
                interfaceC0577v.m3153a(abstractC0557b0);
            }
            AbstractC0562g abstractC0562g = RecyclerView.this.mAdapter;
            if (abstractC0562g != null) {
                abstractC0562g.onViewRecycled(abstractC0557b0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m3467q(abstractC0557b0);
            }
        }

        /* renamed from: h */
        AbstractC0557b0 m3136h(int i4) {
            int size;
            int iM3284m;
            ArrayList<AbstractC0557b0> arrayList = this.f3657b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC0557b0 abstractC0557b0 = this.f3657b.get(i5);
                    if (!abstractC0557b0.wasReturnedFromScrap() && abstractC0557b0.getLayoutPosition() == i4) {
                        abstractC0557b0.addFlags(32);
                        return abstractC0557b0;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iM3284m = RecyclerView.this.mAdapterHelper.m3284m(i4)) > 0 && iM3284m < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iM3284m);
                    for (int i6 = 0; i6 < size; i6++) {
                        AbstractC0557b0 abstractC0557b02 = this.f3657b.get(i6);
                        if (!abstractC0557b02.wasReturnedFromScrap() && abstractC0557b02.getItemId() == itemId) {
                            abstractC0557b02.addFlags(32);
                            return abstractC0557b02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        C0575t m3137i() {
            if (this.f3662g == null) {
                this.f3662g = new C0575t();
            }
            return this.f3662g;
        }

        /* renamed from: j */
        int m3138j() {
            return this.f3656a.size();
        }

        /* renamed from: k */
        public List<AbstractC0557b0> m3139k() {
            return this.f3659d;
        }

        /* renamed from: l */
        AbstractC0557b0 m3140l(long j4, int i4, boolean z3) {
            for (int size = this.f3656a.size() - 1; size >= 0; size--) {
                AbstractC0557b0 abstractC0557b0 = this.f3656a.get(size);
                if (abstractC0557b0.getItemId() == j4 && !abstractC0557b0.wasReturnedFromScrap()) {
                    if (i4 == abstractC0557b0.getItemViewType()) {
                        abstractC0557b0.addFlags(32);
                        if (abstractC0557b0.isRemoved() && !RecyclerView.this.mState.m3164e()) {
                            abstractC0557b0.setFlags(2, 14);
                        }
                        return abstractC0557b0;
                    }
                    if (!z3) {
                        this.f3656a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC0557b0.itemView, false);
                        m3151y(abstractC0557b0.itemView);
                    }
                }
            }
            int size2 = this.f3658c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0557b0 abstractC0557b02 = this.f3658c.get(size2);
                if (abstractC0557b02.getItemId() == j4 && !abstractC0557b02.isAttachedToTransitionOverlay()) {
                    if (i4 == abstractC0557b02.getItemViewType()) {
                        if (!z3) {
                            this.f3658c.remove(size2);
                        }
                        return abstractC0557b02;
                    }
                    if (!z3) {
                        m3118A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        AbstractC0557b0 m3141m(int i4, boolean z3) {
            View viewM3304e;
            int size = this.f3656a.size();
            for (int i5 = 0; i5 < size; i5++) {
                AbstractC0557b0 abstractC0557b0 = this.f3656a.get(i5);
                if (!abstractC0557b0.wasReturnedFromScrap() && abstractC0557b0.getLayoutPosition() == i4 && !abstractC0557b0.isInvalid() && (RecyclerView.this.mState.f3679h || !abstractC0557b0.isRemoved())) {
                    abstractC0557b0.addFlags(32);
                    return abstractC0557b0;
                }
            }
            if (z3 || (viewM3304e = RecyclerView.this.mChildHelper.m3304e(i4)) == null) {
                int size2 = this.f3658c.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    AbstractC0557b0 abstractC0557b02 = this.f3658c.get(i6);
                    if (!abstractC0557b02.isInvalid() && abstractC0557b02.getLayoutPosition() == i4 && !abstractC0557b02.isAttachedToTransitionOverlay()) {
                        if (!z3) {
                            this.f3658c.remove(i6);
                        }
                        return abstractC0557b02;
                    }
                }
                return null;
            }
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM3304e);
            RecyclerView.this.mChildHelper.m3316s(viewM3304e);
            int iM3310m = RecyclerView.this.mChildHelper.m3310m(viewM3304e);
            if (iM3310m != -1) {
                RecyclerView.this.mChildHelper.m3303d(iM3310m);
                m3121D(viewM3304e);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: n */
        View m3142n(int i4) {
            return this.f3656a.get(i4).itemView;
        }

        /* renamed from: o */
        public View m3143o(int i4) {
            return m3144p(i4, false);
        }

        /* renamed from: p */
        View m3144p(int i4, boolean z3) {
            return m3125I(i4, z3, RecyclerView.FOREVER_NS).itemView;
        }

        /* renamed from: s */
        void m3145s() {
            int size = this.f3658c.size();
            for (int i4 = 0; i4 < size; i4++) {
                LayoutParams layoutParams = (LayoutParams) this.f3658c.get(i4).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f3618c = true;
                }
            }
        }

        /* renamed from: t */
        void m3146t() {
            int size = this.f3658c.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0557b0 abstractC0557b0 = this.f3658c.get(i4);
                if (abstractC0557b0 != null) {
                    abstractC0557b0.addFlags(6);
                    abstractC0557b0.addChangePayload(null);
                }
            }
            AbstractC0562g abstractC0562g = RecyclerView.this.mAdapter;
            if (abstractC0562g == null || !abstractC0562g.hasStableIds()) {
                m3152z();
            }
        }

        /* renamed from: u */
        void m3147u(int i4, int i5) {
            int size = this.f3658c.size();
            for (int i6 = 0; i6 < size; i6++) {
                AbstractC0557b0 abstractC0557b0 = this.f3658c.get(i6);
                if (abstractC0557b0 != null && abstractC0557b0.mPosition >= i4) {
                    abstractC0557b0.offsetPosition(i5, true);
                }
            }
        }

        /* renamed from: v */
        void m3148v(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int i9;
            if (i4 < i5) {
                i6 = -1;
                i8 = i4;
                i7 = i5;
            } else {
                i6 = 1;
                i7 = i4;
                i8 = i5;
            }
            int size = this.f3658c.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0557b0 abstractC0557b0 = this.f3658c.get(i10);
                if (abstractC0557b0 != null && (i9 = abstractC0557b0.mPosition) >= i8 && i9 <= i7) {
                    if (i9 == i4) {
                        abstractC0557b0.offsetPosition(i5 - i4, false);
                    } else {
                        abstractC0557b0.offsetPosition(i6, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m3149w(int i4, int i5, boolean z3) {
            int i6 = i4 + i5;
            for (int size = this.f3658c.size() - 1; size >= 0; size--) {
                AbstractC0557b0 abstractC0557b0 = this.f3658c.get(size);
                if (abstractC0557b0 != null) {
                    int i7 = abstractC0557b0.mPosition;
                    if (i7 >= i6) {
                        abstractC0557b0.offsetPosition(-i5, z3);
                    } else if (i7 >= i4) {
                        abstractC0557b0.addFlags(8);
                        m3118A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m3150x(AbstractC0562g abstractC0562g, AbstractC0562g abstractC0562g2, boolean z3) {
            m3131c();
            m3137i().m3109h(abstractC0562g, abstractC0562g2, z3);
        }

        /* renamed from: y */
        void m3151y(View view) {
            AbstractC0557b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m3120C(childViewHolderInt);
        }

        /* renamed from: z */
        void m3152z() {
            for (int size = this.f3658c.size() - 1; size >= 0; size--) {
                m3118A(size);
            }
            this.f3658c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m3370b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public interface InterfaceC0577v {
        /* renamed from: a */
        void m3153a(AbstractC0557b0 abstractC0557b0);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    private class C0578w extends AbstractC0564i {
        C0578w() {
        }

        /* renamed from: a */
        void m3154a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C0358u.m2035i0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3678g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.m3287p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeChanged(int i4, int i5, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m3289r(i4, i5, obj)) {
                m3154a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeInserted(int i4, int i5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m3290s(i4, i5)) {
                m3154a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeMoved(int i4, int i5, int i6) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m3291t(i4, i5, i6)) {
                m3154a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0564i
        public void onItemRangeRemoved(int i4, int i5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m3292u(i4, i5)) {
                m3154a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static abstract class AbstractC0579x {
        private AbstractC0570o mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$x$a */
        public static class a {

            /* renamed from: a */
            private int f3665a;

            /* renamed from: b */
            private int f3666b;

            /* renamed from: c */
            private int f3667c;

            /* renamed from: d */
            private int f3668d;

            /* renamed from: e */
            private Interpolator f3669e;

            /* renamed from: f */
            private boolean f3670f;

            /* renamed from: g */
            private int f3671g;

            public a(int i4, int i5) {
                this(i4, i5, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m3155e() {
                if (this.f3669e != null && this.f3667c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3667c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m3156a() {
                return this.f3668d >= 0;
            }

            /* renamed from: b */
            public void m3157b(int i4) {
                this.f3668d = i4;
            }

            /* renamed from: c */
            void m3158c(RecyclerView recyclerView) {
                int i4 = this.f3668d;
                if (i4 >= 0) {
                    this.f3668d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i4);
                    this.f3670f = false;
                } else {
                    if (!this.f3670f) {
                        this.f3671g = 0;
                        return;
                    }
                    m3155e();
                    recyclerView.mViewFlinger.m3030f(this.f3665a, this.f3666b, this.f3667c, this.f3669e);
                    int i5 = this.f3671g + 1;
                    this.f3671g = i5;
                    if (i5 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3670f = false;
                }
            }

            /* renamed from: d */
            public void m3159d(int i4, int i5, int i6, Interpolator interpolator) {
                this.f3665a = i4;
                this.f3666b = i5;
                this.f3667c = i6;
                this.f3669e = interpolator;
                this.f3670f = true;
            }

            public a(int i4, int i5, int i6, Interpolator interpolator) {
                this.f3668d = -1;
                this.f3670f = false;
                this.f3671g = 0;
                this.f3665a = i4;
                this.f3666b = i5;
                this.f3667c = i6;
                this.f3669e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$x$b */
        public interface b {
            PointF computeScrollVectorForPosition(int i4);
        }

        public PointF computeScrollVectorForPosition(int i4) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i4);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i4) {
            return this.mRecyclerView.mLayout.findViewByPosition(i4);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public AbstractC0570o getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i4) {
            this.mRecyclerView.scrollToPosition(i4);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(PointF pointF) {
            float f4 = pointF.x;
            float f5 = pointF.y;
            float fSqrt = (float) Math.sqrt((f4 * f4) + (f5 * f5));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void onAnimation(int i4, int i5) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f4 = pointFComputeScrollVectorForPosition.x;
                if (f4 != IGoodView.DEFAULT_TO_ALPHA || pointFComputeScrollVectorForPosition.y != IGoodView.DEFAULT_TO_ALPHA) {
                    recyclerView.scrollStep((int) Math.signum(f4), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m3158c(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i4, i5, recyclerView.mState, this.mRecyclingAction);
                boolean zM3156a = this.mRecyclingAction.m3156a();
                this.mRecyclingAction.m3158c(recyclerView);
                if (zM3156a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m3029e();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i4, int i5, C0580y c0580y, a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, C0580y c0580y, a aVar);

        public void setTargetPosition(int i4) {
            this.mTargetPosition = i4;
        }

        void start(RecyclerView recyclerView, AbstractC0570o abstractC0570o) {
            recyclerView.mViewFlinger.m3031g();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = abstractC0570o;
            int i4 = this.mTargetPosition;
            if (i4 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f3672a = i4;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.m3029e();
            this.mStarted = true;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f3672a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0580y {

        /* renamed from: b */
        private SparseArray<Object> f3673b;

        /* renamed from: m */
        int f3684m;

        /* renamed from: n */
        long f3685n;

        /* renamed from: o */
        int f3686o;

        /* renamed from: p */
        int f3687p;

        /* renamed from: q */
        int f3688q;

        /* renamed from: a */
        int f3672a = -1;

        /* renamed from: c */
        int f3674c = 0;

        /* renamed from: d */
        int f3675d = 0;

        /* renamed from: e */
        int f3676e = 1;

        /* renamed from: f */
        int f3677f = 0;

        /* renamed from: g */
        boolean f3678g = false;

        /* renamed from: h */
        boolean f3679h = false;

        /* renamed from: i */
        boolean f3680i = false;

        /* renamed from: j */
        boolean f3681j = false;

        /* renamed from: k */
        boolean f3682k = false;

        /* renamed from: l */
        boolean f3683l = false;

        /* renamed from: a */
        void m3160a(int i4) {
            if ((this.f3676e & i4) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f3676e));
        }

        /* renamed from: b */
        public int m3161b() {
            return this.f3679h ? this.f3674c - this.f3675d : this.f3677f;
        }

        /* renamed from: c */
        public int m3162c() {
            return this.f3672a;
        }

        /* renamed from: d */
        public boolean m3163d() {
            return this.f3672a != -1;
        }

        /* renamed from: e */
        public boolean m3164e() {
            return this.f3679h;
        }

        /* renamed from: f */
        void m3165f(AbstractC0562g abstractC0562g) {
            this.f3676e = 1;
            this.f3677f = abstractC0562g.getItemCount();
            this.f3679h = false;
            this.f3680i = false;
            this.f3681j = false;
        }

        /* renamed from: g */
        public boolean m3166g() {
            return this.f3683l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3672a + ", mData=" + this.f3673b + ", mItemCount=" + this.f3677f + ", mIsMeasuring=" + this.f3681j + ", mPreviousLayoutItemCount=" + this.f3674c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3675d + ", mStructureChanged=" + this.f3678g + ", mInPreLayout=" + this.f3679h + ", mRunSimpleAnimations=" + this.f3682k + ", mRunPredictiveAnimations=" + this.f3683l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class AbstractC0581z {
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i4 >= 23;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = true;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC0558c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(AbstractC0557b0 abstractC0557b0) {
        View view = abstractC0557b0.itemView;
        boolean z3 = view.getParent() == this;
        this.mRecycler.m3126J(getChildViewHolder(view));
        if (abstractC0557b0.isTmpDetached()) {
            this.mChildHelper.m3302c(view, -1, view.getLayoutParams(), true);
        } else if (z3) {
            this.mChildHelper.m3309k(view);
        } else {
            this.mChildHelper.m3301b(view, true);
        }
    }

    private void animateChange(AbstractC0557b0 abstractC0557b0, AbstractC0557b0 abstractC0557b02, AbstractC0567l.c cVar, AbstractC0567l.c cVar2, boolean z3, boolean z4) {
        abstractC0557b0.setIsRecyclable(false);
        if (z3) {
            addAnimatingView(abstractC0557b0);
        }
        if (abstractC0557b0 != abstractC0557b02) {
            if (z4) {
                addAnimatingView(abstractC0557b02);
            }
            abstractC0557b0.mShadowedHolder = abstractC0557b02;
            addAnimatingView(abstractC0557b0);
            this.mRecycler.m3126J(abstractC0557b0);
            abstractC0557b02.setIsRecyclable(false);
            abstractC0557b02.mShadowingHolder = abstractC0557b0;
        }
        if (this.mItemAnimator.mo3067b(abstractC0557b0, abstractC0557b02, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(AbstractC0557b0 abstractC0557b0) {
        WeakReference<RecyclerView> weakReference = abstractC0557b0.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC0557b0.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC0557b0.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i4, int i5) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0570o.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i4), Integer.valueOf(i5)};
                } catch (NoSuchMethodException e4) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e5) {
                        e5.initCause(e4);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e5);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0570o) constructor.newInstance(objArr));
            } catch (ClassCastException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e6);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e8);
            } catch (InstantiationException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e9);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e10);
            }
        }
    }

    private boolean didChildRangeChange(int i4, int i5) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i4 && iArr[1] == i5) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i4 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i4 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        C1049b.m4830b(accessibilityEventObtain, i4);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.m3160a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3681j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m3457f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0580y c0580y = this.mState;
        c0580y.f3680i = c0580y.f3682k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c0580y.f3679h = c0580y.f3683l;
        c0580y.f3677f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3682k) {
            int iM3306g = this.mChildHelper.m3306g();
            for (int i4 = 0; i4 < iM3306g; i4++) {
                AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3305f(i4));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m3456e(childViewHolderInt, this.mItemAnimator.m3084t(this.mState, childViewHolderInt, AbstractC0567l.m3065e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f3680i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m3454c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f3683l) {
            saveOldPositions();
            C0580y c0580y2 = this.mState;
            boolean z3 = c0580y2.f3678g;
            c0580y2.f3678g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c0580y2);
            this.mState.f3678g = z3;
            for (int i5 = 0; i5 < this.mChildHelper.m3306g(); i5++) {
                AbstractC0557b0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m3305f(i5));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m3460i(childViewHolderInt2)) {
                    int iM3065e = AbstractC0567l.m3065e(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iM3065e |= 4096;
                    }
                    AbstractC0567l.c cVarM3084t = this.mItemAnimator.m3084t(this.mState, childViewHolderInt2, iM3065e, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVarM3084t);
                    } else {
                        this.mViewInfoStore.m3452a(childViewHolderInt2, cVarM3084t);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3676e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m3160a(6);
        this.mAdapterHelper.m3282j();
        this.mState.f3677f = this.mAdapter.getItemCount();
        C0580y c0580y = this.mState;
        c0580y.f3675d = 0;
        c0580y.f3679h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c0580y);
        C0580y c0580y2 = this.mState;
        c0580y2.f3678g = false;
        this.mPendingSavedState = null;
        c0580y2.f3682k = c0580y2.f3682k && this.mItemAnimator != null;
        c0580y2.f3676e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m3160a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0580y c0580y = this.mState;
        c0580y.f3676e = 1;
        if (c0580y.f3682k) {
            for (int iM3306g = this.mChildHelper.m3306g() - 1; iM3306g >= 0; iM3306g--) {
                AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3305f(iM3306g));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    AbstractC0567l.c cVarM3083s = this.mItemAnimator.m3083s(this.mState, childViewHolderInt);
                    AbstractC0557b0 abstractC0557b0M3458g = this.mViewInfoStore.m3458g(changedHolderKey);
                    if (abstractC0557b0M3458g == null || abstractC0557b0M3458g.shouldIgnore()) {
                        this.mViewInfoStore.m3455d(childViewHolderInt, cVarM3083s);
                    } else {
                        boolean zM3459h = this.mViewInfoStore.m3459h(abstractC0557b0M3458g);
                        boolean zM3459h2 = this.mViewInfoStore.m3459h(childViewHolderInt);
                        if (zM3459h && abstractC0557b0M3458g == childViewHolderInt) {
                            this.mViewInfoStore.m3455d(childViewHolderInt, cVarM3083s);
                        } else {
                            AbstractC0567l.c cVarM3464n = this.mViewInfoStore.m3464n(abstractC0557b0M3458g);
                            this.mViewInfoStore.m3455d(childViewHolderInt, cVarM3083s);
                            AbstractC0567l.c cVarM3463m = this.mViewInfoStore.m3463m(childViewHolderInt);
                            if (cVarM3464n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, abstractC0557b0M3458g);
                            } else {
                                animateChange(abstractC0557b0M3458g, childViewHolderInt, cVarM3464n, cVarM3463m, zM3459h, zM3459h2);
                            }
                        }
                    }
                }
            }
            this.mViewInfoStore.m3465o(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C0580y c0580y2 = this.mState;
        c0580y2.f3674c = c0580y2.f3677f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c0580y2.f3682k = false;
        c0580y2.f3683l = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<AbstractC0557b0> arrayList = this.mRecycler.f3657b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC0570o.mPrefetchMaxCountObserved = 0;
            abstractC0570o.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m3127K();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m3457f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC0573r interfaceC0573r = this.mInterceptingOnItemTouchListener;
        if (interfaceC0573r == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC0573r.mo3100b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC0573r interfaceC0573r = this.mOnItemTouchListeners.get(i4);
            if (interfaceC0573r.mo3099a(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC0573r;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iM3306g = this.mChildHelper.m3306g();
        if (iM3306g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < iM3306g; i6++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3305f(i6));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i4) {
                    i4 = layoutPosition;
                }
                if (layoutPosition > i5) {
                    i5 = layoutPosition;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i4));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        AbstractC0557b0 abstractC0557b0FindViewHolderForAdapterPosition;
        C0580y c0580y = this.mState;
        int i4 = c0580y.f3684m;
        if (i4 == -1) {
            i4 = 0;
        }
        int iM3161b = c0580y.m3161b();
        for (int i5 = i4; i5 < iM3161b; i5++) {
            AbstractC0557b0 abstractC0557b0FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i5);
            if (abstractC0557b0FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC0557b0FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC0557b0FindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM3161b, i4);
        do {
            iMin--;
            if (iMin < 0 || (abstractC0557b0FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC0557b0FindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC0557b0FindViewHolderForAdapterPosition.itemView;
    }

    static AbstractC0557b0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f3616a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f3617b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C0349l getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0349l(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j4, AbstractC0557b0 abstractC0557b0, AbstractC0557b0 abstractC0557b02) {
        int iM3306g = this.mChildHelper.m3306g();
        for (int i4 = 0; i4 < iM3306g; i4++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3305f(i4));
            if (childViewHolderInt != abstractC0557b0 && getChangedHolderKey(childViewHolderInt) == j4) {
                AbstractC0562g abstractC0562g = this.mAdapter;
                if (abstractC0562g == null || !abstractC0562g.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0557b0 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0557b0 + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0557b02 + " cannot be found but it is necessary for " + abstractC0557b0 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iM3306g = this.mChildHelper.m3306g();
        for (int i4 = 0; i4 < iM3306g; i4++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3305f(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0358u.m2068z(this) == 0) {
            C0358u.m1981B0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0588b(new C0560e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i4) {
        int i5;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c4 = 65535;
        int i6 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i7 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i8 = rect2.left;
        if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
            i5 = 1;
        } else {
            int i9 = rect.right;
            int i10 = rect2.right;
            i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
            c4 = 1;
        } else {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if ((i13 <= i14 && i11 < i14) || i11 <= i12) {
                c4 = 0;
            }
        }
        if (i4 == 1) {
            return c4 < 0 || (c4 == 0 && i5 * i6 <= 0);
        }
        if (i4 == 2) {
            return c4 > 0 || (c4 == 0 && i5 * i6 >= 0);
        }
        if (i4 == 17) {
            return i5 < 0;
        }
        if (i4 == 33) {
            return c4 < 0;
        }
        if (i4 == 66) {
            return i5 > 0;
        }
        if (i4 == 130) {
            return c4 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i4 + exceptionLabel());
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i4);
            int x3 = (int) (motionEvent.getX(i4) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(i4) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z3;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m3295y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m3293w();
        } else {
            this.mAdapterHelper.m3282j();
        }
        boolean z4 = false;
        boolean z5 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f3682k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z3 = this.mDataSetHasChangedAfterLayout) || z5 || this.mLayout.mRequestedSimpleAnimations) && (!z3 || this.mAdapter.hasStableIds());
        C0580y c0580y = this.mState;
        if (c0580y.f3682k && z5 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z4 = true;
        }
        c0580y.f3683l = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C0372f.m2177a(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0372f.m2177a(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0372f.m2177a(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0372f.m2177a(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.C0358u.m2033h0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.m3311n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m3306g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        AbstractC0557b0 abstractC0557b0FindViewHolderForItemId = (this.mState.f3685n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f3685n);
        if (abstractC0557b0FindViewHolderForItemId != null && !this.mChildHelper.m3311n(abstractC0557b0FindViewHolderForItemId.itemView) && abstractC0557b0FindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = abstractC0557b0FindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.m3306g() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i4 = this.mState.f3686o;
            if (i4 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            C0358u.m2033h0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f3618c) {
                Rect rect = layoutParams2.f3617b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0580y c0580y = this.mState;
        c0580y.f3685n = -1L;
        c0580y.f3684m = -1;
        c0580y.f3686o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC0557b0 abstractC0557b0FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC0557b0FindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f3685n = this.mAdapter.hasStableIds() ? abstractC0557b0FindContainingViewHolder.getItemId() : -1L;
        this.mState.f3684m = this.mDataSetHasChangedAfterLayout ? -1 : abstractC0557b0FindContainingViewHolder.isRemoved() ? abstractC0557b0FindContainingViewHolder.mOldPosition : abstractC0557b0FindContainingViewHolder.getAdapterPosition();
        this.mState.f3686o = getDeepestFocusedViewWithId(abstractC0557b0FindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(AbstractC0562g abstractC0562g, boolean z3, boolean z4) {
        AbstractC0562g abstractC0562g2 = this.mAdapter;
        if (abstractC0562g2 != null) {
            abstractC0562g2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z3 || z4) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m3295y();
        AbstractC0562g abstractC0562g3 = this.mAdapter;
        this.mAdapter = abstractC0562g;
        if (abstractC0562g != null) {
            abstractC0562g.registerAdapterDataObserver(this.mObserver);
            abstractC0562g.onAttachedToRecyclerView(this);
        }
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.onAdapterChanged(abstractC0562g3, this.mAdapter);
        }
        this.mRecycler.m3150x(abstractC0562g3, this.mAdapter, z3);
        this.mState.f3678g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.m3031g();
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.stopSmoothScroller();
        }
    }

    void absorbGlows(int i4, int i5) {
        if (i4 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i4);
            }
        }
        if (i5 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i5);
            }
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        C0358u.m2033h0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null || !abstractC0570o.onAddFocusables(this, arrayList, i4, i5)) {
            super.addFocusables(arrayList, i4, i5);
        }
    }

    public void addItemDecoration(AbstractC0569n abstractC0569n, int i4) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i4 < 0) {
            this.mItemDecorations.add(abstractC0569n);
        } else {
            this.mItemDecorations.add(i4, abstractC0569n);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC0571p interfaceC0571p) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC0571p);
    }

    public void addOnItemTouchListener(InterfaceC0573r interfaceC0573r) {
        this.mOnItemTouchListeners.add(interfaceC0573r);
    }

    public void addOnScrollListener(AbstractC0574s abstractC0574s) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC0574s);
    }

    void animateAppearance(AbstractC0557b0 abstractC0557b0, AbstractC0567l.c cVar, AbstractC0567l.c cVar2) {
        abstractC0557b0.setIsRecyclable(false);
        if (this.mItemAnimator.mo3066a(abstractC0557b0, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(AbstractC0557b0 abstractC0557b0, AbstractC0567l.c cVar, AbstractC0567l.c cVar2) {
        addAnimatingView(abstractC0557b0);
        abstractC0557b0.setIsRecyclable(false);
        if (this.mItemAnimator.mo3068c(abstractC0557b0, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(AbstractC0557b0 abstractC0557b0) {
        AbstractC0567l abstractC0567l = this.mItemAnimator;
        return abstractC0567l == null || abstractC0567l.mo3071g(abstractC0557b0, abstractC0557b0.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    void clearOldPositions() {
        int iM3308j = this.mChildHelper.m3308j();
        for (int i4 = 0; i4 < iM3308j; i4++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3307i(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m3132d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC0571p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC0574s> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null && abstractC0570o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null && abstractC0570o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null && abstractC0570o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null && abstractC0570o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null && abstractC0570o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null && abstractC0570o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i4, int i5) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            C0358u.m2033h0(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C3485d.m10560a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C3485d.m10561b();
            return;
        }
        if (this.mAdapterHelper.m3287p()) {
            if (!this.mAdapterHelper.m3286o(4) || this.mAdapterHelper.m3286o(11)) {
                if (this.mAdapterHelper.m3287p()) {
                    C3485d.m10560a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    C3485d.m10561b();
                    return;
                }
                return;
            }
            C3485d.m10560a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.m3293w();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.m3281i();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            C3485d.m10561b();
        }
    }

    void defaultOnMeasure(int i4, int i5) {
        setMeasuredDimension(AbstractC0570o.chooseSize(i4, getPaddingLeft() + getPaddingRight(), C0358u.m1982C(this)), AbstractC0570o.chooseSize(i5, getPaddingTop() + getPaddingBottom(), C0358u.m1980B(this)));
    }

    void dispatchChildAttached(View view) {
        AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC0562g abstractC0562g = this.mAdapter;
        if (abstractC0562g != null && childViewHolderInt != null) {
            abstractC0562g.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC0571p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo3097a(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC0562g abstractC0562g = this.mAdapter;
        if (abstractC0562g != null && childViewHolderInt != null) {
            abstractC0562g.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC0571p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo3098b(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        C0580y c0580y = this.mState;
        c0580y.f3681j = false;
        if (c0580y.f3676e == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (!this.mAdapterHelper.m3288q() && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return getScrollingChildHelper().m1953a(f4, f5, z3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().m1954b(f4, f5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1955c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().m1958f(i4, i5, i6, i7, iArr);
    }

    void dispatchOnScrollStateChanged(int i4) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.onScrollStateChanged(i4);
        }
        onScrollStateChanged(i4);
        AbstractC0574s abstractC0574s = this.mScrollListener;
        if (abstractC0574s != null) {
            abstractC0574s.onScrollStateChanged(this, i4);
        }
        List<AbstractC0574s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i4);
            }
        }
    }

    void dispatchOnScrolled(int i4, int i5) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        onScrolled(i4, i5);
        AbstractC0574s abstractC0574s = this.mScrollListener;
        if (abstractC0574s != null) {
            abstractC0574s.onScrolled(this, i4, i5);
        }
        List<AbstractC0574s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i4, i5);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i4;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC0557b0 abstractC0557b0 = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC0557b0.itemView.getParent() == this && !abstractC0557b0.shouldIgnore() && (i4 = abstractC0557b0.mPendingAccessibilityState) != -1) {
                C0358u.m1979A0(abstractC0557b0.itemView, i4);
                abstractC0557b0.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            this.mItemDecorations.get(i4).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, IGoodView.DEFAULT_TO_ALPHA);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(iSave4);
        }
        if ((z3 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo3080p()) ? z3 : true) {
            C0358u.m2033h0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM3064a = this.mEdgeEffectFactory.m3064a(this, 3);
        this.mBottomGlow = edgeEffectM3064a;
        if (this.mClipToPadding) {
            edgeEffectM3064a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM3064a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM3064a = this.mEdgeEffectFactory.m3064a(this, 0);
        this.mLeftGlow = edgeEffectM3064a;
        if (this.mClipToPadding) {
            edgeEffectM3064a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM3064a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM3064a = this.mEdgeEffectFactory.m3064a(this, 2);
        this.mRightGlow = edgeEffectM3064a;
        if (this.mClipToPadding) {
            edgeEffectM3064a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM3064a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM3064a = this.mEdgeEffectFactory.m3064a(this, 1);
        this.mTopGlow = edgeEffectM3064a;
        if (this.mClipToPadding) {
            edgeEffectM3064a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM3064a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(C0580y c0580y) {
        if (getScrollState() != 2) {
            c0580y.f3687p = 0;
            c0580y.f3688q = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f3624c;
            c0580y.f3687p = overScroller.getFinalX() - overScroller.getCurrX();
            c0580y.f3688q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View findChildViewUnder(float f4, float f5) {
        for (int iM3306g = this.mChildHelper.m3306g() - 1; iM3306g >= 0; iM3306g--) {
            View viewM3305f = this.mChildHelper.m3305f(iM3306g);
            float translationX = viewM3305f.getTranslationX();
            float translationY = viewM3305f.getTranslationY();
            if (f4 >= viewM3305f.getLeft() + translationX && f4 <= viewM3305f.getRight() + translationX && f5 >= viewM3305f.getTop() + translationY && f5 <= viewM3305f.getBottom() + translationY) {
                return viewM3305f;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public AbstractC0557b0 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public AbstractC0557b0 findViewHolderForAdapterPosition(int i4) {
        AbstractC0557b0 abstractC0557b0 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM3308j = this.mChildHelper.m3308j();
        for (int i5 = 0; i5 < iM3308j; i5++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3307i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i4) {
                if (!this.mChildHelper.m3311n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                abstractC0557b0 = childViewHolderInt;
            }
        }
        return abstractC0557b0;
    }

    public AbstractC0557b0 findViewHolderForItemId(long j4) {
        AbstractC0562g abstractC0562g = this.mAdapter;
        AbstractC0557b0 abstractC0557b0 = null;
        if (abstractC0562g != null && abstractC0562g.hasStableIds()) {
            int iM3308j = this.mChildHelper.m3308j();
            for (int i4 = 0; i4 < iM3308j; i4++) {
                AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3307i(i4));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j4) {
                    if (!this.mChildHelper.m3311n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC0557b0 = childViewHolderInt;
                }
            }
        }
        return abstractC0557b0;
    }

    public AbstractC0557b0 findViewHolderForLayoutPosition(int i4) {
        return findViewHolderForPosition(i4, false);
    }

    @Deprecated
    public AbstractC0557b0 findViewHolderForPosition(int i4) {
        return findViewHolderForPosition(i4, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i4, int i5) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = abstractC0570o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i4) < this.mMinFlingVelocity) {
            i4 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i5) < this.mMinFlingVelocity) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return false;
        }
        float f4 = i4;
        float f5 = i5;
        if (!dispatchNestedPreFling(f4, f5)) {
            boolean z3 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f4, f5, z3);
            AbstractC0572q abstractC0572q = this.mOnFlingListener;
            if (abstractC0572q != null && abstractC0572q.onFling(i4, i5)) {
                return true;
            }
            if (z3) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i6 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i6, Math.min(i4, i6));
                int i7 = this.mMaxFlingVelocity;
                this.mViewFlinger.m3028c(iMax, Math.max(-i7, Math.min(i5, i7)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i4) {
        View viewOnFocusSearchFailed;
        boolean z3;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i4);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z4 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z4 && (i4 == 2 || i4 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i5 = i4 == 2 ? 130 : 33;
                z3 = focusFinder.findNextFocus(this, view, i5) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i4 = i5;
                }
            } else {
                z3 = false;
            }
            if (!z3 && this.mLayout.canScrollHorizontally()) {
                int i6 = (this.mLayout.getLayoutDirection() == 1) ^ (i4 == 2) ? 66 : 17;
                boolean z5 = focusFinder.findNextFocus(this, view, i6) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i4 = i6;
                }
                z3 = z5;
            }
            if (z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i4, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i4);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i4);
            if (viewFindNextFocus == null && z4) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i4, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i4) ? viewOnFocusSearchFailed : super.focusSearch(view, i4);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i4);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            return abstractC0570o.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            return abstractC0570o.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0562g getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionFor(AbstractC0557b0 abstractC0557b0) {
        if (abstractC0557b0.hasAnyOfTheFlags(524) || !abstractC0557b0.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.m3280e(abstractC0557b0.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0570o abstractC0570o = this.mLayout;
        return abstractC0570o != null ? abstractC0570o.getBaseline() : super.getBaseline();
    }

    long getChangedHolderKey(AbstractC0557b0 abstractC0557b0) {
        return this.mAdapter.hasStableIds() ? abstractC0557b0.getItemId() : abstractC0557b0.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        InterfaceC0565j interfaceC0565j = this.mChildDrawingOrderCallback;
        return interfaceC0565j == null ? super.getChildDrawingOrder(i4, i5) : interfaceC0565j.m3063a(i4, i5);
    }

    public long getChildItemId(View view) {
        AbstractC0557b0 childViewHolderInt;
        AbstractC0562g abstractC0562g = this.mAdapter;
        if (abstractC0562g == null || !abstractC0562g.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC0557b0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C0598l getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C0566k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC0567l getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f3618c) {
            return layoutParams.f3617b;
        }
        if (this.mState.m3164e() && (layoutParams.m3018b() || layoutParams.m3020d())) {
            return layoutParams.f3617b;
        }
        Rect rect = layoutParams.f3617b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i4).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i5 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i5 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f3618c = false;
        return rect;
    }

    public AbstractC0569n getItemDecorationAt(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            return this.mItemDecorations.get(i4);
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public AbstractC0570o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0572q getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C0575t getRecycledViewPool() {
        return this.mRecycler.m3137i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m1960k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m3287p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new C0587a(new C0561f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0590d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C2905b.f11378a), resources.getDimensionPixelSize(C2905b.f11380c), resources.getDimensionPixelOffset(C2905b.f11379b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC0567l abstractC0567l = this.mItemAnimator;
        return abstractC0567l != null && abstractC0567l.mo3080p();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m1962m();
    }

    void jumpToPositionForSmoothScroller(int i4) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i4);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int iM3308j = this.mChildHelper.m3308j();
        for (int i4 = 0; i4 < iM3308j; i4++) {
            ((LayoutParams) this.mChildHelper.m3307i(i4).getLayoutParams()).f3618c = true;
        }
        this.mRecycler.m3145s();
    }

    void markKnownViewsInvalid() {
        int iM3308j = this.mChildHelper.m3308j();
        for (int i4 = 0; i4 < iM3308j; i4++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3307i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m3146t();
    }

    public void offsetChildrenHorizontal(int i4) {
        int iM3306g = this.mChildHelper.m3306g();
        for (int i5 = 0; i5 < iM3306g; i5++) {
            this.mChildHelper.m3305f(i5).offsetLeftAndRight(i4);
        }
    }

    public void offsetChildrenVertical(int i4) {
        int iM3306g = this.mChildHelper.m3306g();
        for (int i5 = 0; i5 < iM3306g; i5++) {
            this.mChildHelper.m3305f(i5).offsetTopAndBottom(i4);
        }
    }

    void offsetPositionRecordsForInsert(int i4, int i5) {
        int iM3308j = this.mChildHelper.m3308j();
        for (int i6 = 0; i6 < iM3308j; i6++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3307i(i6));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i4) {
                childViewHolderInt.offsetPosition(i5, false);
                this.mState.f3678g = true;
            }
        }
        this.mRecycler.m3147u(i4, i5);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int iM3308j = this.mChildHelper.m3308j();
        if (i4 < i5) {
            i8 = -1;
            i7 = i4;
            i6 = i5;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i10 = 0; i10 < iM3308j; i10++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3307i(i10));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i7 && i9 <= i6) {
                if (i9 == i4) {
                    childViewHolderInt.offsetPosition(i5 - i4, false);
                } else {
                    childViewHolderInt.offsetPosition(i8, false);
                }
                this.mState.f3678g = true;
            }
        }
        this.mRecycler.m3148v(i4, i5);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i4, int i5, boolean z3) {
        int i6 = i4 + i5;
        int iM3308j = this.mChildHelper.m3308j();
        for (int i7 = 0; i7 < iM3308j; i7++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3307i(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i8 = childViewHolderInt.mPosition;
                if (i8 >= i6) {
                    childViewHolderInt.offsetPosition(-i5, z3);
                    this.mState.f3678g = true;
                } else if (i8 >= i4) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i4 - 1, -i5, z3);
                    this.mState.f3678g = true;
                }
            }
        }
        this.mRecycler.m3149w(i4, i5, z3);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<RunnableC0591e> threadLocal = RunnableC0591e.f3849e;
            RunnableC0591e runnableC0591e = threadLocal.get();
            this.mGapWorker = runnableC0591e;
            if (runnableC0591e == null) {
                this.mGapWorker = new RunnableC0591e();
                Display displayM2056t = C0358u.m2056t(this);
                float f4 = 60.0f;
                if (!isInEditMode() && displayM2056t != null) {
                    float refreshRate = displayM2056t.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f4 = refreshRate;
                    }
                }
                RunnableC0591e runnableC0591e2 = this.mGapWorker;
                runnableC0591e2.f3853c = (long) (1.0E9f / f4);
                threadLocal.set(runnableC0591e2);
            }
            this.mGapWorker.m3365a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC0591e runnableC0591e;
        super.onDetachedFromWindow();
        AbstractC0567l abstractC0567l = this.mItemAnimator;
        if (abstractC0567l != null) {
            abstractC0567l.mo3075k();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m3461j();
        if (!ALLOW_THREAD_GAP_WORK || (runnableC0591e = this.mGapWorker) == null) {
            return;
        }
        runnableC0591e.m3368j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mItemDecorations.get(i4).onDraw(canvas, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC0570o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i4 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i4, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i5 = x4 - this.mInitialTouchX;
                int i6 = y4 - this.mInitialTouchY;
                if (zCanScrollHorizontally == 0 || Math.abs(i5) <= this.mTouchSlop) {
                    z3 = false;
                } else {
                    this.mLastTouchX = x4;
                    z3 = true;
                }
                if (zCanScrollVertically && Math.abs(i6) > this.mTouchSlop) {
                    this.mLastTouchY = y4;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x5;
            this.mInitialTouchX = x5;
            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y5;
            this.mInitialTouchY = y5;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        C3485d.m10560a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C3485d.m10561b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null) {
            defaultOnMeasure(i4, i5);
            return;
        }
        boolean z3 = false;
        if (abstractC0570o.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            if (z3 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f3676e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i4, i5);
            this.mState.f3681j = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i4, i5);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f3681j = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i4, i5);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            C0580y c0580y = this.mState;
            if (c0580y.f3683l) {
                c0580y.f3679h = true;
            } else {
                this.mAdapterHelper.m3282j();
                this.mState.f3679h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f3683l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0562g abstractC0562g = this.mAdapter;
        if (abstractC0562g != null) {
            this.mState.f3677f = abstractC0562g.getItemCount();
        } else {
            this.mState.f3677f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
        stopInterceptRequestLayout(false);
        this.mState.f3679h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null || (parcelable2 = this.mPendingSavedState.f3620a) == null) {
            return;
        }
        abstractC0570o.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.m3021a(savedState2);
        } else {
            AbstractC0570o abstractC0570o = this.mLayout;
            if (abstractC0570o != null) {
                savedState.f3620a = abstractC0570o.onSaveInstanceState();
            } else {
                savedState.f3620a = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i4) {
    }

    public void onScrolled(int i4, int i5) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
      0x00df: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        C0358u.m2035i0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z3) {
        this.mDispatchItemsChangedEvent = z3 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(AbstractC0557b0 abstractC0557b0, AbstractC0567l.c cVar) {
        abstractC0557b0.setFlags(0, 8192);
        if (this.mState.f3680i && abstractC0557b0.isUpdated() && !abstractC0557b0.isRemoved() && !abstractC0557b0.shouldIgnore()) {
            this.mViewInfoStore.m3454c(getChangedHolderKey(abstractC0557b0), abstractC0557b0);
        }
        this.mViewInfoStore.m3456e(abstractC0557b0, cVar);
    }

    void removeAndRecycleViews() {
        AbstractC0567l abstractC0567l = this.mItemAnimator;
        if (abstractC0567l != null) {
            abstractC0567l.mo3075k();
        }
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.m3131c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zM3315r = this.mChildHelper.m3315r(view);
        if (zM3315r) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m3126J(childViewHolderInt);
            this.mRecycler.m3120C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!zM3315r);
        return zM3315r;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z3) {
        AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z3);
    }

    public void removeItemDecoration(AbstractC0569n abstractC0569n) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            abstractC0570o.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC0569n);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i4));
            return;
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC0571p interfaceC0571p) {
        List<InterfaceC0571p> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0571p);
    }

    public void removeOnItemTouchListener(InterfaceC0573r interfaceC0573r) {
        this.mOnItemTouchListeners.remove(interfaceC0573r);
        if (this.mInterceptingOnItemTouchListener == interfaceC0573r) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC0574s abstractC0574s) {
        List<AbstractC0574s> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC0574s);
        }
    }

    void repositionShadowingViews() {
        AbstractC0557b0 abstractC0557b0;
        int iM3306g = this.mChildHelper.m3306g();
        for (int i4 = 0; i4 < iM3306g; i4++) {
            View viewM3305f = this.mChildHelper.m3305f(i4);
            AbstractC0557b0 childViewHolder = getChildViewHolder(viewM3305f);
            if (childViewHolder != null && (abstractC0557b0 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC0557b0.itemView;
                int left = viewM3305f.getLeft();
                int top = viewM3305f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        int size = this.mOnItemTouchListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mOnItemTouchListeners.get(i4).mo3101c(z3);
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int iM3308j = this.mChildHelper.m3308j();
        for (int i4 = 0; i4 < iM3308j; i4++) {
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3307i(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC0570o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i4 = 0;
            }
            if (!zCanScrollVertically) {
                i5 = 0;
            }
            scrollByInternal(i4, i5, null);
        }
    }

    boolean scrollByInternal(int i4, int i5, MotionEvent motionEvent) {
        int i6;
        int i7;
        int i8;
        int i9;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i4, i5, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i6 = i11;
            i7 = i10;
            i8 = i4 - i10;
            i9 = i5 - i11;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i7, i6, i8, i9, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i12 = i8 - iArr4[0];
        int i13 = i9 - iArr4[1];
        boolean z3 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i14 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0347j.m1948b(motionEvent, C1913n.a.f8875q)) {
                pullGlows(motionEvent.getX(), i12, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i4, i5);
        }
        if (i7 != 0 || i6 != 0) {
            dispatchOnScrolled(i7, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i7 == 0 && i6 == 0) ? false : true;
    }

    void scrollStep(int i4, int i5, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C3485d.m10560a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i4 != 0 ? this.mLayout.scrollHorizontallyBy(i4, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i5 != 0 ? this.mLayout.scrollVerticallyBy(i5, this.mRecycler, this.mState) : 0;
        C3485d.m10561b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i4) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0570o.scrollToPosition(i4);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0598l c0598l) {
        this.mAccessibilityDelegate = c0598l;
        C0358u.m2051q0(this, c0598l);
    }

    public void setAdapter(AbstractC0562g abstractC0562g) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0562g, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0565j interfaceC0565j) {
        if (interfaceC0565j == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC0565j;
        setChildrenDrawingOrderEnabled(interfaceC0565j != null);
    }

    boolean setChildImportantForAccessibilityInternal(AbstractC0557b0 abstractC0557b0, int i4) {
        if (!isComputingLayout()) {
            C0358u.m1979A0(abstractC0557b0.itemView, i4);
            return true;
        }
        abstractC0557b0.mPendingAccessibilityState = i4;
        this.mPendingAccessibilityImportanceChange.add(abstractC0557b0);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z3;
        super.setClipToPadding(z3);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0566k c0566k) {
        C1025h.m4782f(c0566k);
        this.mEdgeEffectFactory = c0566k;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z3) {
        this.mHasFixedSize = z3;
    }

    public void setItemAnimator(AbstractC0567l abstractC0567l) {
        AbstractC0567l abstractC0567l2 = this.mItemAnimator;
        if (abstractC0567l2 != null) {
            abstractC0567l2.mo3075k();
            this.mItemAnimator.m3086v(null);
        }
        this.mItemAnimator = abstractC0567l;
        if (abstractC0567l != null) {
            abstractC0567l.m3086v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i4) {
        this.mRecycler.m3124G(i4);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(AbstractC0570o abstractC0570o) {
        if (abstractC0570o == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC0567l abstractC0567l = this.mItemAnimator;
            if (abstractC0567l != null) {
                abstractC0567l.mo3075k();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.m3131c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m3131c();
        }
        this.mChildHelper.m3312o();
        this.mLayout = abstractC0570o;
        if (abstractC0570o != null) {
            if (abstractC0570o.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0570o + " is already attached to a RecyclerView:" + abstractC0570o.mRecyclerView.exceptionLabel());
            }
            abstractC0570o.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m3127K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        getScrollingChildHelper().m1963n(z3);
    }

    public void setOnFlingListener(AbstractC0572q abstractC0572q) {
        this.mOnFlingListener = abstractC0572q;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0574s abstractC0574s) {
        this.mScrollListener = abstractC0574s;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.mPreserveFocusAfterLayout = z3;
    }

    public void setRecycledViewPool(C0575t c0575t) {
        this.mRecycler.m3122E(c0575t);
    }

    public void setRecyclerListener(InterfaceC0577v interfaceC0577v) {
        this.mRecyclerListener = interfaceC0577v;
    }

    void setScrollState(int i4) {
        if (i4 == this.mScrollState) {
            return;
        }
        this.mScrollState = i4;
        if (i4 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i4);
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0581z abstractC0581z) {
        this.mRecycler.m3123F(abstractC0581z);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iM4829a = accessibilityEvent != null ? C1049b.m4829a(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= iM4829a != 0 ? iM4829a : 0;
        return true;
    }

    public void smoothScrollBy(int i4, int i5) {
        smoothScrollBy(i4, i5, null);
    }

    public void smoothScrollToPosition(int i4) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0570o.smoothScrollToPosition(this, this.mState, i4);
        }
    }

    void startInterceptRequestLayout() {
        int i4 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i4;
        if (i4 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().m1964p(i4);
    }

    void stopInterceptRequestLayout(boolean z3) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z3 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z3 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m1966r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(AbstractC0562g abstractC0562g, boolean z3) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0562g, true, z3);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i4, int i5, Object obj) {
        int i6;
        int iM3308j = this.mChildHelper.m3308j();
        int i7 = i4 + i5;
        for (int i8 = 0; i8 < iM3308j; i8++) {
            View viewM3307i = this.mChildHelper.m3307i(i8);
            AbstractC0557b0 childViewHolderInt = getChildViewHolderInt(viewM3307i);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i6 = childViewHolderInt.mPosition) >= i4 && i6 < i7) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) viewM3307i.getLayoutParams()).f3618c = true;
            }
        }
        this.mRecycler.m3129M(i4, i5);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2904a.f11377a);
    }

    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().m1956d(i4, i5, iArr, iArr2, i6);
    }

    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr, int i8) {
        return getScrollingChildHelper().m1959g(i4, i5, i6, i7, iArr, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC0557b0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            int r0 = r0.m3308j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.mChildHelper
            android.view.View r3 = r3.m3307i(r2)
            androidx.recyclerview.widget.RecyclerView$b0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m3311n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$b0");
    }

    public boolean hasNestedScrollingParent(int i4) {
        return getScrollingChildHelper().m1961l(i4);
    }

    void onExitLayoutOrScroll(boolean z3) {
        int i4 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i4;
        if (i4 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z3) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i4, int i5, Interpolator interpolator) {
        smoothScrollBy(i4, i5, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i4, int i5) {
        return getScrollingChildHelper().m1965q(i4, i5);
    }

    public void stopNestedScroll(int i4) {
        getScrollingChildHelper().m1967s(i4);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i4) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i4);
        this.mObserver = new C0578w();
        this.mRecycler = new C0576u();
        this.mViewInfoStore = new C0603q();
        this.mUpdateChildViewsRunnable = new RunnableC0554a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0566k();
        this.mItemAnimator = new C0589c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC0555a0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC0591e.b() : null;
        this.mState = new C0580y();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0568m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0556b();
        this.mViewInfoProcessCallback = new C0559d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0359v.m2107b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C0359v.m2109d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m3086v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0358u.m2066y(this) == 0) {
            C0358u.m1979A0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0598l(this));
        int[] iArr = C2906c.f11386f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i4, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(C2906c.f11395o);
        if (typedArrayObtainStyledAttributes.getInt(C2906c.f11389i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(C2906c.f11388h, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2906c.f11390j, false);
        this.mEnableFastScroller = z3;
        if (z3) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C2906c.f11393m), typedArrayObtainStyledAttributes.getDrawable(C2906c.f11394n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C2906c.f11391k), typedArrayObtainStyledAttributes.getDrawable(C2906c.f11392l));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i4, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i4, 0);
        }
        boolean z4 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
    }

    public final void dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().m1957e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public void smoothScrollBy(int i4, int i5, Interpolator interpolator, int i6) {
        smoothScrollBy(i4, i5, interpolator, i6, false);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0557b0 f3616a;

        /* renamed from: b */
        final Rect f3617b;

        /* renamed from: c */
        boolean f3618c;

        /* renamed from: d */
        boolean f3619d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3617b = new Rect();
            this.f3618c = true;
            this.f3619d = false;
        }

        /* renamed from: a */
        public int m3017a() {
            return this.f3616a.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean m3018b() {
            return this.f3616a.isUpdated();
        }

        /* renamed from: c */
        public boolean m3019c() {
            return this.f3616a.isRemoved();
        }

        /* renamed from: d */
        public boolean m3020d() {
            return this.f3616a.isInvalid();
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f3617b = new Rect();
            this.f3618c = true;
            this.f3619d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3617b = new Rect();
            this.f3618c = true;
            this.f3619d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3617b = new Rect();
            this.f3618c = true;
            this.f3619d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f3617b = new Rect();
            this.f3618c = true;
            this.f3619d = false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0553a();

        /* renamed from: a */
        Parcelable f3620a;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        static class C0553a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0553a() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3620a = parcel.readParcelable(classLoader == null ? AbstractC0570o.class.getClassLoader() : classLoader);
        }

        /* renamed from: a */
        void m3021a(SavedState savedState) {
            this.f3620a = savedState.f3620a;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.f3620a, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o != null) {
            return abstractC0570o.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i4, int i5, Interpolator interpolator, int i6, boolean z3) {
        AbstractC0570o abstractC0570o = this.mLayout;
        if (abstractC0570o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC0570o.canScrollHorizontally()) {
            i4 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (i6 == Integer.MIN_VALUE || i6 > 0) {
            if (z3) {
                int i7 = i4 != 0 ? 1 : 0;
                if (i5 != 0) {
                    i7 |= 2;
                }
                startNestedScroll(i7, 1);
            }
            this.mViewFlinger.m3030f(i4, i5, i6, interpolator);
            return;
        }
        scrollBy(i4, i5);
    }

    public void addItemDecoration(AbstractC0569n abstractC0569n) {
        addItemDecoration(abstractC0569n, -1);
    }
}
