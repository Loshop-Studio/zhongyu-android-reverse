package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private final Callback mCallback;
    private View mCapturedView;
    private final int mDefaultEdgeSize;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;
    private int mActivePointerId = -1;
    private final Runnable mSetIdleRunnable = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };

    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i9, int i10) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i9, int i10) {
            return 0;
        }

        public int getOrderedChildIndex(int i9) {
            return i9;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i9, int i10) {
        }

        public boolean onEdgeLock(int i9) {
            return false;
        }

        public void onEdgeTouched(int i9, int i10) {
        }

        public void onViewCaptured(@NonNull View view, int i9) {
        }

        public void onViewDragStateChanged(int i9) {
        }

        public void onViewPositionChanged(@NonNull View view, int i9, int i10, @Px int i11, @Px int i12) {
        }

        public void onViewReleased(@NonNull View view, float f10, float f11) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i9);
    }

    private ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.mParentView = viewGroup;
        this.mCallback = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i9 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.mDefaultEdgeSize = i9;
        this.mEdgeSize = i9;
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMaxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mScroller = new OverScroller(context, sInterpolator);
    }

    private boolean checkNewEdgeDrag(float f10, float f11, int i9, int i10) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.mInitialEdgesTouched[i9] & i10) == i10 && (this.mTrackingEdges & i10) != 0 && (this.mEdgeDragsLocked[i9] & i10) != i10 && (this.mEdgeDragsInProgress[i9] & i10) != i10) {
            int i11 = this.mTouchSlop;
            if (fAbs > i11 || fAbs2 > i11) {
                if (fAbs < fAbs2 * 0.5f && this.mCallback.onEdgeLock(i10)) {
                    int[] iArr = this.mEdgeDragsLocked;
                    iArr[i9] = iArr[i9] | i10;
                    return false;
                }
                if ((this.mEdgeDragsInProgress[i9] & i10) == 0 && fAbs > this.mTouchSlop) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkTouchSlop(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z9 = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z10 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (!z9 || !z10) {
            return z9 ? Math.abs(f10) > ((float) this.mTouchSlop) : z10 && Math.abs(f11) > ((float) this.mTouchSlop);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i9 = this.mTouchSlop;
        return f12 > ((float) (i9 * i9));
    }

    private int clampMag(int i9, int i10, int i11) {
        int iAbs = Math.abs(i9);
        if (iAbs < i10) {
            return 0;
        }
        return iAbs > i11 ? i9 > 0 ? i11 : -i11 : i9;
    }

    private void clearMotionHistory() {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.mInitialMotionY, 0.0f);
        Arrays.fill(this.mLastMotionX, 0.0f);
        Arrays.fill(this.mLastMotionY, 0.0f);
        Arrays.fill(this.mInitialEdgesTouched, 0);
        Arrays.fill(this.mEdgeDragsInProgress, 0);
        Arrays.fill(this.mEdgeDragsLocked, 0);
        this.mPointersDown = 0;
    }

    private int computeAxisDuration(int i9, int i10, int i11) {
        if (i9 == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f10 = width / 2;
        float fDistanceInfluenceForSnapDuration = f10 + (distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(i9) / width)) * f10);
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i9) / i11) + 1.0f) * 256.0f), 600);
    }

    private int computeSettleDuration(View view, int i9, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iClampMag = clampMag(i11, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int iClampMag2 = clampMag(i12, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int iAbs = Math.abs(i9);
        int iAbs2 = Math.abs(i10);
        int iAbs3 = Math.abs(iClampMag);
        int iAbs4 = Math.abs(iClampMag2);
        int i13 = iAbs3 + iAbs4;
        int i14 = iAbs + iAbs2;
        if (iClampMag != 0) {
            f10 = iAbs3;
            f11 = i13;
        } else {
            f10 = iAbs;
            f11 = i14;
        }
        float f14 = f10 / f11;
        if (iClampMag2 != 0) {
            f12 = iAbs4;
            f13 = i13;
        } else {
            f12 = iAbs2;
            f13 = i14;
        }
        return (int) ((computeAxisDuration(i9, iClampMag, this.mCallback.getViewHorizontalDragRange(view)) * f14) + (computeAxisDuration(i10, iClampMag2, this.mCallback.getViewVerticalDragRange(view)) * (f12 / f13)));
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private void dispatchViewReleased(float f10, float f11) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f10, f11);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void dragTo(int i9, int i10, int i11, int i12) {
        int left = this.mCapturedView.getLeft();
        int top2 = this.mCapturedView.getTop();
        if (i11 != 0) {
            i9 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i9, i11);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i9 - left);
        }
        int i13 = i9;
        if (i12 != 0) {
            i10 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i10, i12);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i10 - top2);
        }
        int i14 = i10;
        if (i11 == 0 && i12 == 0) {
            return;
        }
        this.mCallback.onViewPositionChanged(this.mCapturedView, i13, i14, i13 - left, i14 - top2);
    }

    private void ensureMotionHistorySizeForId(int i9) {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null || fArr.length <= i9) {
            int i10 = i9 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.mInitialMotionY;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.mLastMotionX;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.mLastMotionY;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.mInitialEdgesTouched;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.mEdgeDragsInProgress;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.mEdgeDragsLocked;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.mInitialMotionX = fArr2;
            this.mInitialMotionY = fArr3;
            this.mLastMotionX = fArr4;
            this.mLastMotionY = fArr5;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private boolean forceSettleCapturedViewAt(int i9, int i10, int i11, int i12) {
        int left = this.mCapturedView.getLeft();
        int top2 = this.mCapturedView.getTop();
        int i13 = i9 - left;
        int i14 = i10 - top2;
        if (i13 == 0 && i14 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top2, i13, i14, computeSettleDuration(this.mCapturedView, i13, i14, i11, i12));
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i9, int i10) {
        int i11 = i9 < this.mParentView.getLeft() + this.mEdgeSize ? 1 : 0;
        if (i10 < this.mParentView.getTop() + this.mEdgeSize) {
            i11 |= 4;
        }
        if (i9 > this.mParentView.getRight() - this.mEdgeSize) {
            i11 |= 2;
        }
        return i10 > this.mParentView.getBottom() - this.mEdgeSize ? i11 | 8 : i11;
    }

    private boolean isValidPointerForActionMove(int i9) {
        if (isPointerDown(i9)) {
            return true;
        }
        Log.e(TAG, "Ignoring pointerId=" + i9 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    private void reportNewEdgeDrags(float f10, float f11, int i9) {
        boolean zCheckNewEdgeDrag = checkNewEdgeDrag(f10, f11, i9, 1);
        boolean z9 = zCheckNewEdgeDrag;
        if (checkNewEdgeDrag(f11, f10, i9, 4)) {
            z9 = (zCheckNewEdgeDrag ? 1 : 0) | 4;
        }
        boolean z10 = z9;
        if (checkNewEdgeDrag(f10, f11, i9, 2)) {
            z10 = (z9 ? 1 : 0) | 2;
        }
        ?? r02 = z10;
        if (checkNewEdgeDrag(f11, f10, i9, 8)) {
            r02 = (z10 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i9] = iArr[i9] | r02;
            this.mCallback.onEdgeDragStarted(r02, i9);
        }
    }

    private void saveInitialMotion(float f10, float f11, int i9) {
        ensureMotionHistorySizeForId(i9);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i9] = f10;
        fArr[i9] = f10;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i9] = f11;
        fArr2[i9] = f11;
        this.mInitialEdgesTouched[i9] = getEdgesTouched((int) f10, (int) f11);
        this.mPointersDown |= 1 << i9;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i9 = 0; i9 < pointerCount; i9++) {
            int pointerId = motionEvent.getPointerId(i9);
            if (isValidPointerForActionMove(pointerId)) {
                float x9 = motionEvent.getX(i9);
                float y9 = motionEvent.getY(i9);
                this.mLastMotionX[pointerId] = x9;
                this.mLastMotionY[pointerId] = y9;
            }
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    public boolean canScroll(@NonNull View view, boolean z9, int i9, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && canScroll(childAt, true, i9, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z9) {
            return view.canScrollHorizontally(-i9) || view.canScrollVertically(-i10);
        }
        return false;
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void captureChildView(@NonNull View view, int i9) {
        if (view.getParent() == this.mParentView) {
            this.mCapturedView = view;
            this.mActivePointerId = i9;
            this.mCallback.onViewCaptured(view, i9);
            setDragState(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + ")");
    }

    public boolean continueSettling(boolean z9) {
        if (this.mDragState == 2) {
            boolean zComputeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top2 = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top2 != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top2);
            }
            if (left != 0 || top2 != 0) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top2);
            }
            if (zComputeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z9) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        return this.mDragState == 2;
    }

    @Nullable
    public View findTopChildUnder(int i9, int i10) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i9, int i10, int i11, int i12) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i9, i11, i10, i12);
        setDragState(2);
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    @Nullable
    public View getCapturedView() {
        return this.mCapturedView;
    }

    @Px
    public int getDefaultEdgeSize() {
        return this.mDefaultEdgeSize;
    }

    @Px
    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    @Px
    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public boolean isCapturedViewUnder(int i9, int i10) {
        return isViewUnder(this.mCapturedView, i9, i10);
    }

    public boolean isEdgeTouched(int i9) {
        int length = this.mInitialEdgesTouched.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (isEdgeTouched(i9, i10)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i9) {
        return ((1 << i9) & this.mPointersDown) != 0;
    }

    public boolean isViewUnder(@Nullable View view, int i9, int i10) {
        return view != null && i9 >= view.getLeft() && i9 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom();
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int i9;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewFindTopChildUnder = findTopChildUnder((int) x9, (int) y9);
            saveInitialMotion(x9, y9, pointerId);
            tryCaptureViewForDrag(viewFindTopChildUnder, pointerId);
            int i11 = this.mInitialEdgesTouched[pointerId];
            int i12 = this.mTrackingEdges;
            if ((i11 & i12) != 0) {
                this.mCallback.onEdgeTouched(i11 & i12, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.mDragState == 1) {
                releaseViewForPointerUp();
            }
            cancel();
            return;
        }
        if (actionMasked == 2) {
            if (this.mDragState == 1) {
                if (isValidPointerForActionMove(this.mActivePointerId)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.mLastMotionX;
                    int i13 = this.mActivePointerId;
                    int i14 = (int) (x10 - fArr[i13]);
                    int i15 = (int) (y10 - this.mLastMotionY[i13]);
                    dragTo(this.mCapturedView.getLeft() + i14, this.mCapturedView.getTop() + i15, i14, i15);
                    saveLastMotion(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i10 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i10);
                if (isValidPointerForActionMove(pointerId2)) {
                    float x11 = motionEvent.getX(i10);
                    float y11 = motionEvent.getY(i10);
                    float f10 = x11 - this.mInitialMotionX[pointerId2];
                    float f11 = y11 - this.mInitialMotionY[pointerId2];
                    reportNewEdgeDrags(f10, f11, pointerId2);
                    if (this.mDragState != 1) {
                        View viewFindTopChildUnder2 = findTopChildUnder((int) x11, (int) y11);
                        if (checkTouchSlop(viewFindTopChildUnder2, f10, f11) && tryCaptureViewForDrag(viewFindTopChildUnder2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i10++;
            }
            saveLastMotion(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.mDragState == 1) {
                dispatchViewReleased(0.0f, 0.0f);
            }
            cancel();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x12 = motionEvent.getX(actionIndex);
            float y12 = motionEvent.getY(actionIndex);
            saveInitialMotion(x12, y12, pointerId3);
            if (this.mDragState != 0) {
                if (isCapturedViewUnder((int) x12, (int) y12)) {
                    tryCaptureViewForDrag(this.mCapturedView, pointerId3);
                    return;
                }
                return;
            } else {
                tryCaptureViewForDrag(findTopChildUnder((int) x12, (int) y12), pointerId3);
                int i16 = this.mInitialEdgesTouched[pointerId3];
                int i17 = this.mTrackingEdges;
                if ((i16 & i17) != 0) {
                    this.mCallback.onEdgeTouched(i16 & i17, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.mDragState == 1 && pointerId4 == this.mActivePointerId) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i10 >= pointerCount2) {
                    i9 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i10);
                if (pointerId5 != this.mActivePointerId) {
                    View viewFindTopChildUnder3 = findTopChildUnder((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                    View view = this.mCapturedView;
                    if (viewFindTopChildUnder3 == view && tryCaptureViewForDrag(view, pointerId5)) {
                        i9 = this.mActivePointerId;
                        break;
                    }
                }
                i10++;
            }
            if (i9 == -1) {
                releaseViewForPointerUp();
            }
        }
        clearMotionHistory(pointerId4);
    }

    public void setDragState(int i9) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i9) {
            this.mDragState = i9;
            this.mCallback.onViewDragStateChanged(i9);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeSize(@IntRange(from = 0) @Px int i9) {
        this.mEdgeSize = i9;
    }

    public void setEdgeTrackingEnabled(int i9) {
        this.mTrackingEdges = i9;
    }

    public void setMinVelocity(float f10) {
        this.mMinVelocity = f10;
    }

    public boolean settleCapturedViewAt(int i9, int i10) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i9, i10, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i9, int i10) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean zForceSettleCapturedViewAt = forceSettleCapturedViewAt(i9, i10, 0, 0);
        if (!zForceSettleCapturedViewAt && this.mDragState == 0 && this.mCapturedView != null) {
            this.mCapturedView = null;
        }
        return zForceSettleCapturedViewAt;
    }

    public boolean tryCaptureViewForDrag(View view, int i9) {
        if (view == this.mCapturedView && this.mActivePointerId == i9) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i9)) {
            return false;
        }
        this.mActivePointerId = i9;
        captureChildView(view, i9);
        return true;
    }

    private float clampMag(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        return fAbs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f10, @NonNull Callback callback) {
        ViewDragHelper viewDragHelperCreate = create(viewGroup, callback);
        viewDragHelperCreate.mTouchSlop = (int) (viewDragHelperCreate.mTouchSlop * (1.0f / f10));
        return viewDragHelperCreate;
    }

    public boolean isEdgeTouched(int i9, int i10) {
        return isPointerDown(i10) && (i9 & this.mInitialEdgesTouched[i10]) != 0;
    }

    public boolean checkTouchSlop(int i9) {
        int length = this.mInitialMotionX.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (checkTouchSlop(i9, i10)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i9, int i10) {
        if (!isPointerDown(i10)) {
            return false;
        }
        boolean z9 = (i9 & 1) == 1;
        boolean z10 = (i9 & 2) == 2;
        float f10 = this.mLastMotionX[i10] - this.mInitialMotionX[i10];
        float f11 = this.mLastMotionY[i10] - this.mInitialMotionY[i10];
        if (!z9 || !z10) {
            return z9 ? Math.abs(f10) > ((float) this.mTouchSlop) : z10 && Math.abs(f11) > ((float) this.mTouchSlop);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i11 = this.mTouchSlop;
        return f12 > ((float) (i11 * i11));
    }

    private void clearMotionHistory(int i9) {
        if (this.mInitialMotionX == null || !isPointerDown(i9)) {
            return;
        }
        this.mInitialMotionX[i9] = 0.0f;
        this.mInitialMotionY[i9] = 0.0f;
        this.mLastMotionX[i9] = 0.0f;
        this.mLastMotionY[i9] = 0.0f;
        this.mInitialEdgesTouched[i9] = 0;
        this.mEdgeDragsInProgress[i9] = 0;
        this.mEdgeDragsLocked[i9] = 0;
        this.mPointersDown = (~(1 << i9)) & this.mPointersDown;
    }
}
