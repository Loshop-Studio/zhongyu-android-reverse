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
        public float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
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
        public int clampViewPositionHorizontal(@NonNull View view, int i6, int i7) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i6, int i7) {
            return 0;
        }

        public int getOrderedChildIndex(int i6) {
            return i6;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i6, int i7) {
        }

        public boolean onEdgeLock(int i6) {
            return false;
        }

        public void onEdgeTouched(int i6, int i7) {
        }

        public void onViewCaptured(@NonNull View view, int i6) {
        }

        public void onViewDragStateChanged(int i6) {
        }

        public void onViewPositionChanged(@NonNull View view, int i6, int i7, @Px int i8, @Px int i9) {
        }

        public void onViewReleased(@NonNull View view, float f6, float f7) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i6);
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
        int i6 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.mDefaultEdgeSize = i6;
        this.mEdgeSize = i6;
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMaxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mScroller = new OverScroller(context, sInterpolator);
    }

    private boolean checkNewEdgeDrag(float f6, float f7, int i6, int i7) {
        float fAbs = Math.abs(f6);
        float fAbs2 = Math.abs(f7);
        if ((this.mInitialEdgesTouched[i6] & i7) == i7 && (this.mTrackingEdges & i7) != 0 && (this.mEdgeDragsLocked[i6] & i7) != i7 && (this.mEdgeDragsInProgress[i6] & i7) != i7) {
            int i8 = this.mTouchSlop;
            if (fAbs > i8 || fAbs2 > i8) {
                if (fAbs < fAbs2 * 0.5f && this.mCallback.onEdgeLock(i7)) {
                    int[] iArr = this.mEdgeDragsLocked;
                    iArr[i6] = iArr[i6] | i7;
                    return false;
                }
                if ((this.mEdgeDragsInProgress[i6] & i7) == 0 && fAbs > this.mTouchSlop) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkTouchSlop(View view, float f6, float f7) {
        if (view == null) {
            return false;
        }
        boolean z6 = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z7 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (!z6 || !z7) {
            return z6 ? Math.abs(f6) > ((float) this.mTouchSlop) : z7 && Math.abs(f7) > ((float) this.mTouchSlop);
        }
        float f8 = (f6 * f6) + (f7 * f7);
        int i6 = this.mTouchSlop;
        return f8 > ((float) (i6 * i6));
    }

    private int clampMag(int i6, int i7, int i8) {
        int iAbs = Math.abs(i6);
        if (iAbs < i7) {
            return 0;
        }
        return iAbs > i8 ? i6 > 0 ? i8 : -i8 : i6;
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

    private int computeAxisDuration(int i6, int i7, int i8) {
        if (i6 == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f6 = width / 2;
        float fDistanceInfluenceForSnapDuration = f6 + (distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(i6) / width)) * f6);
        int iAbs = Math.abs(i7);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / i8) + 1.0f) * 256.0f), 600);
    }

    private int computeSettleDuration(View view, int i6, int i7, int i8, int i9) {
        float f6;
        float f7;
        float f8;
        float f9;
        int iClampMag = clampMag(i8, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int iClampMag2 = clampMag(i9, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int iAbs = Math.abs(i6);
        int iAbs2 = Math.abs(i7);
        int iAbs3 = Math.abs(iClampMag);
        int iAbs4 = Math.abs(iClampMag2);
        int i10 = iAbs3 + iAbs4;
        int i11 = iAbs + iAbs2;
        if (iClampMag != 0) {
            f6 = iAbs3;
            f7 = i10;
        } else {
            f6 = iAbs;
            f7 = i11;
        }
        float f10 = f6 / f7;
        if (iClampMag2 != 0) {
            f8 = iAbs4;
            f9 = i10;
        } else {
            f8 = iAbs2;
            f9 = i11;
        }
        return (int) ((computeAxisDuration(i6, iClampMag, this.mCallback.getViewHorizontalDragRange(view)) * f10) + (computeAxisDuration(i7, iClampMag2, this.mCallback.getViewVerticalDragRange(view)) * (f8 / f9)));
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private void dispatchViewReleased(float f6, float f7) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f6, f7);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f6) {
        return (float) Math.sin((f6 - 0.5f) * 0.47123894f);
    }

    private void dragTo(int i6, int i7, int i8, int i9) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i8 != 0) {
            i6 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i6, i8);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i6 - left);
        }
        int i10 = i6;
        if (i9 != 0) {
            i7 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i7, i9);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i7 - top);
        }
        int i11 = i7;
        if (i8 == 0 && i9 == 0) {
            return;
        }
        this.mCallback.onViewPositionChanged(this.mCapturedView, i10, i11, i10 - left, i11 - top);
    }

    private void ensureMotionHistorySizeForId(int i6) {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null || fArr.length <= i6) {
            int i7 = i6 + 1;
            float[] fArr2 = new float[i7];
            float[] fArr3 = new float[i7];
            float[] fArr4 = new float[i7];
            float[] fArr5 = new float[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
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

    private boolean forceSettleCapturedViewAt(int i6, int i7, int i8, int i9) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i10 = i6 - left;
        int i11 = i7 - top;
        if (i10 == 0 && i11 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, i10, i11, computeSettleDuration(this.mCapturedView, i10, i11, i8, i9));
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i6, int i7) {
        int i8 = i6 < this.mParentView.getLeft() + this.mEdgeSize ? 1 : 0;
        if (i7 < this.mParentView.getTop() + this.mEdgeSize) {
            i8 |= 4;
        }
        if (i6 > this.mParentView.getRight() - this.mEdgeSize) {
            i8 |= 2;
        }
        return i7 > this.mParentView.getBottom() - this.mEdgeSize ? i8 | 8 : i8;
    }

    private boolean isValidPointerForActionMove(int i6) {
        if (isPointerDown(i6)) {
            return true;
        }
        Log.e(TAG, "Ignoring pointerId=" + i6 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
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
    private void reportNewEdgeDrags(float f6, float f7, int i6) {
        boolean zCheckNewEdgeDrag = checkNewEdgeDrag(f6, f7, i6, 1);
        boolean z6 = zCheckNewEdgeDrag;
        if (checkNewEdgeDrag(f7, f6, i6, 4)) {
            z6 = (zCheckNewEdgeDrag ? 1 : 0) | 4;
        }
        boolean z7 = z6;
        if (checkNewEdgeDrag(f6, f7, i6, 2)) {
            z7 = (z6 ? 1 : 0) | 2;
        }
        ?? r02 = z7;
        if (checkNewEdgeDrag(f7, f6, i6, 8)) {
            r02 = (z7 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i6] = iArr[i6] | r02;
            this.mCallback.onEdgeDragStarted(r02, i6);
        }
    }

    private void saveInitialMotion(float f6, float f7, int i6) {
        ensureMotionHistorySizeForId(i6);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i6] = f6;
        fArr[i6] = f6;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i6] = f7;
        fArr2[i6] = f7;
        this.mInitialEdgesTouched[i6] = getEdgesTouched((int) f6, (int) f7);
        this.mPointersDown |= 1 << i6;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            int pointerId = motionEvent.getPointerId(i6);
            if (isValidPointerForActionMove(pointerId)) {
                float x6 = motionEvent.getX(i6);
                float y6 = motionEvent.getY(i6);
                this.mLastMotionX[pointerId] = x6;
                this.mLastMotionY[pointerId] = y6;
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

    public boolean canScroll(@NonNull View view, boolean z6, int i6, int i7, int i8, int i9) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i8 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i9 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && canScroll(childAt, true, i6, i7, i11 - childAt.getLeft(), i10 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z6) {
            return view.canScrollHorizontally(-i6) || view.canScrollVertically(-i7);
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

    public void captureChildView(@NonNull View view, int i6) {
        if (view.getParent() == this.mParentView) {
            this.mCapturedView = view;
            this.mActivePointerId = i6;
            this.mCallback.onViewCaptured(view, i6);
            setDragState(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + ")");
    }

    public boolean continueSettling(boolean z6) {
        if (this.mDragState == 2) {
            boolean zComputeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (left != 0 || top != 0) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z6) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        return this.mDragState == 2;
    }

    @Nullable
    public View findTopChildUnder(int i6, int i7) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && i7 >= childAt.getTop() && i7 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i6, int i7, int i8, int i9) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i6, i8, i7, i9);
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

    public boolean isCapturedViewUnder(int i6, int i7) {
        return isViewUnder(this.mCapturedView, i6, i7);
    }

    public boolean isEdgeTouched(int i6) {
        int length = this.mInitialEdgesTouched.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (isEdgeTouched(i6, i7)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i6) {
        return ((1 << i6) & this.mPointersDown) != 0;
    }

    public boolean isViewUnder(@Nullable View view, int i6, int i7) {
        return view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom();
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i7 = 0;
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewFindTopChildUnder = findTopChildUnder((int) x6, (int) y6);
            saveInitialMotion(x6, y6, pointerId);
            tryCaptureViewForDrag(viewFindTopChildUnder, pointerId);
            int i8 = this.mInitialEdgesTouched[pointerId];
            int i9 = this.mTrackingEdges;
            if ((i8 & i9) != 0) {
                this.mCallback.onEdgeTouched(i8 & i9, pointerId);
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
                    float x7 = motionEvent.getX(iFindPointerIndex);
                    float y7 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.mLastMotionX;
                    int i10 = this.mActivePointerId;
                    int i11 = (int) (x7 - fArr[i10]);
                    int i12 = (int) (y7 - this.mLastMotionY[i10]);
                    dragTo(this.mCapturedView.getLeft() + i11, this.mCapturedView.getTop() + i12, i11, i12);
                    saveLastMotion(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i7 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i7);
                if (isValidPointerForActionMove(pointerId2)) {
                    float x8 = motionEvent.getX(i7);
                    float y8 = motionEvent.getY(i7);
                    float f6 = x8 - this.mInitialMotionX[pointerId2];
                    float f7 = y8 - this.mInitialMotionY[pointerId2];
                    reportNewEdgeDrags(f6, f7, pointerId2);
                    if (this.mDragState != 1) {
                        View viewFindTopChildUnder2 = findTopChildUnder((int) x8, (int) y8);
                        if (checkTouchSlop(viewFindTopChildUnder2, f6, f7) && tryCaptureViewForDrag(viewFindTopChildUnder2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i7++;
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
            float x9 = motionEvent.getX(actionIndex);
            float y9 = motionEvent.getY(actionIndex);
            saveInitialMotion(x9, y9, pointerId3);
            if (this.mDragState != 0) {
                if (isCapturedViewUnder((int) x9, (int) y9)) {
                    tryCaptureViewForDrag(this.mCapturedView, pointerId3);
                    return;
                }
                return;
            } else {
                tryCaptureViewForDrag(findTopChildUnder((int) x9, (int) y9), pointerId3);
                int i13 = this.mInitialEdgesTouched[pointerId3];
                int i14 = this.mTrackingEdges;
                if ((i13 & i14) != 0) {
                    this.mCallback.onEdgeTouched(i13 & i14, pointerId3);
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
                if (i7 >= pointerCount2) {
                    i6 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i7);
                if (pointerId5 != this.mActivePointerId) {
                    View viewFindTopChildUnder3 = findTopChildUnder((int) motionEvent.getX(i7), (int) motionEvent.getY(i7));
                    View view = this.mCapturedView;
                    if (viewFindTopChildUnder3 == view && tryCaptureViewForDrag(view, pointerId5)) {
                        i6 = this.mActivePointerId;
                        break;
                    }
                }
                i7++;
            }
            if (i6 == -1) {
                releaseViewForPointerUp();
            }
        }
        clearMotionHistory(pointerId4);
    }

    public void setDragState(int i6) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i6) {
            this.mDragState = i6;
            this.mCallback.onViewDragStateChanged(i6);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeSize(@IntRange(from = 0) @Px int i6) {
        this.mEdgeSize = i6;
    }

    public void setEdgeTrackingEnabled(int i6) {
        this.mTrackingEdges = i6;
    }

    public void setMinVelocity(float f6) {
        this.mMinVelocity = f6;
    }

    public boolean settleCapturedViewAt(int i6, int i7) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i6, i7, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
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

    public boolean smoothSlideViewTo(@NonNull View view, int i6, int i7) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean zForceSettleCapturedViewAt = forceSettleCapturedViewAt(i6, i7, 0, 0);
        if (!zForceSettleCapturedViewAt && this.mDragState == 0 && this.mCapturedView != null) {
            this.mCapturedView = null;
        }
        return zForceSettleCapturedViewAt;
    }

    public boolean tryCaptureViewForDrag(View view, int i6) {
        if (view == this.mCapturedView && this.mActivePointerId == i6) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i6)) {
            return false;
        }
        this.mActivePointerId = i6;
        captureChildView(view, i6);
        return true;
    }

    private float clampMag(float f6, float f7, float f8) {
        float fAbs = Math.abs(f6);
        if (fAbs < f7) {
            return 0.0f;
        }
        return fAbs > f8 ? f6 > 0.0f ? f8 : -f8 : f6;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f6, @NonNull Callback callback) {
        ViewDragHelper viewDragHelperCreate = create(viewGroup, callback);
        viewDragHelperCreate.mTouchSlop = (int) (viewDragHelperCreate.mTouchSlop * (1.0f / f6));
        return viewDragHelperCreate;
    }

    public boolean isEdgeTouched(int i6, int i7) {
        return isPointerDown(i7) && (i6 & this.mInitialEdgesTouched[i7]) != 0;
    }

    public boolean checkTouchSlop(int i6) {
        int length = this.mInitialMotionX.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (checkTouchSlop(i6, i7)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i6, int i7) {
        if (!isPointerDown(i7)) {
            return false;
        }
        boolean z6 = (i6 & 1) == 1;
        boolean z7 = (i6 & 2) == 2;
        float f6 = this.mLastMotionX[i7] - this.mInitialMotionX[i7];
        float f7 = this.mLastMotionY[i7] - this.mInitialMotionY[i7];
        if (!z6 || !z7) {
            return z6 ? Math.abs(f6) > ((float) this.mTouchSlop) : z7 && Math.abs(f7) > ((float) this.mTouchSlop);
        }
        float f8 = (f6 * f6) + (f7 * f7);
        int i8 = this.mTouchSlop;
        return f8 > ((float) (i8 * i8));
    }

    private void clearMotionHistory(int i6) {
        if (this.mInitialMotionX == null || !isPointerDown(i6)) {
            return;
        }
        this.mInitialMotionX[i6] = 0.0f;
        this.mInitialMotionY[i6] = 0.0f;
        this.mLastMotionX[i6] = 0.0f;
        this.mLastMotionY[i6] = 0.0f;
        this.mInitialEdgesTouched[i6] = 0;
        this.mEdgeDragsInProgress[i6] = 0;
        this.mEdgeDragsLocked[i6] = 0;
        this.mPointersDown = (~(1 << i6)) & this.mPointersDown;
    }
}
