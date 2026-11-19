package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0340c0;
import androidx.core.view.C0358u;
import androidx.core.view.InterfaceC0348k;
import androidx.core.view.InterfaceC0353p;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C1371R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p011b0.C1020c;
import p016c0.C1050c;
import p016c0.InterfaceC1053f;
import p073d.C2443a;
import p156u.C3403a;
import p164w.C3425a;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0302b {
    private static final int DEF_STYLE_RES = C1371R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private ValueAnimator elevationOverlayAnimator;
    private boolean haveChildWithInterpolator;
    private C0340c0 lastInsets;
    private boolean liftOnScroll;
    private WeakReference<View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;
    private Drawable statusBarForeground;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final int INVALID_POSITION = -1;
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private int offsetToChildIndexOnLayout;
        private boolean offsetToChildIndexOnLayoutIsMinHeight;
        private float offsetToChildIndexOnLayoutPerc;
        private BaseDragCallback onDragCallback;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(T t3);
        }

        public BaseBehavior() {
            this.offsetToChildIndexOnLayout = -1;
        }

        private void addAccessibilityScrollActions(final CoordinatorLayout coordinatorLayout, final T t3, final View view) {
            if (getTopBottomOffsetForScrollingSibling() != (-t3.getTotalScrollRange()) && view.canScrollVertically(1)) {
                addActionToExpand(coordinatorLayout, t3, C1050c.a.f6219q, false);
            }
            if (getTopBottomOffsetForScrollingSibling() != 0) {
                if (!view.canScrollVertically(-1)) {
                    addActionToExpand(coordinatorLayout, t3, C1050c.a.f6220r, true);
                    return;
                }
                final int i4 = -t3.getDownNestedPreScrollRange();
                if (i4 != 0) {
                    C0358u.m2043m0(coordinatorLayout, C1050c.a.f6220r, null, new InterfaceC1053f() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p016c0.InterfaceC1053f
                        public boolean perform(View view2, InterfaceC1053f.a aVar) throws Resources.NotFoundException {
                            BaseBehavior.this.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) t3, view, 0, i4, new int[]{0, 0}, 1);
                            return true;
                        }
                    });
                }
            }
        }

        private void addActionToExpand(CoordinatorLayout coordinatorLayout, final T t3, C1050c.a aVar, final boolean z3) {
            C0358u.m2043m0(coordinatorLayout, aVar, null, new InterfaceC1053f() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.3
                @Override // p016c0.InterfaceC1053f
                public boolean perform(View view, InterfaceC1053f.a aVar2) {
                    t3.setExpanded(z3);
                    return true;
                }
            });
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, T t3, int i4, float f4) {
            int iAbs = Math.abs(getTopBottomOffsetForScrollingSibling() - i4);
            float fAbs = Math.abs(f4);
            animateOffsetWithDuration(coordinatorLayout, t3, i4, fAbs > IGoodView.DEFAULT_TO_ALPHA ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t3.getHeight()) + 1.0f) * 150.0f));
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T t3, int i4, int i5) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i4) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.offsetAnimator.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t3, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i5, MAX_OFFSET_ANIMATION_DURATION));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i4);
            this.offsetAnimator.start();
        }

        private boolean canScrollChildren(CoordinatorLayout coordinatorLayout, T t3, View view) {
            return t3.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= t3.getHeight();
        }

        private static boolean checkFlag(int i4, int i5) {
            return (i4 & i5) == i5;
        }

        private View findFirstScrollingChild(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt instanceof InterfaceC0348k) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View getAppBarChildOnOffset(AppBarLayout appBarLayout, int i4) {
            int iAbs = Math.abs(i4);
            int childCount = appBarLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = appBarLayout.getChildAt(i5);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(T t3, int i4) {
            int childCount = t3.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t3.getChildAt(i5);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i6 = -i4;
                if (top <= i6 && bottom >= i6) {
                    return i5;
                }
            }
            return -1;
        }

        private int interpolateOffset(T t3, int i4) {
            int iAbs = Math.abs(i4);
            int childCount = t3.getChildCount();
            int topInset = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                View childAt = t3.getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i5++;
                } else if (scrollInterpolator != null) {
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            topInset -= C0358u.m1980B(childAt);
                        }
                    }
                    if (C0358u.m2064x(childAt)) {
                        topInset -= t3.getTopInset();
                    }
                    if (topInset > 0) {
                        float f4 = topInset;
                        return Integer.signum(i4) * (childAt.getTop() + Math.round(f4 * scrollInterpolator.getInterpolation((iAbs - childAt.getTop()) / f4)));
                    }
                }
            }
            return i4;
        }

        private boolean shouldJumpElevationState(CoordinatorLayout coordinatorLayout, T t3) {
            List<View> dependents = coordinatorLayout.getDependents(t3);
            int size = dependents.size();
            for (int i4 = 0; i4 < size; i4++) {
                CoordinatorLayout.Behavior behaviorM1709f = ((CoordinatorLayout.C0305e) dependents.get(i4).getLayoutParams()).m1709f();
                if (behaviorM1709f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behaviorM1709f).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, T t3) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int childIndexOnOffset = getChildIndexOnOffset(t3, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t3.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i4 = -childAt.getTop();
                    int iM1980B = -childAt.getBottom();
                    if (childIndexOnOffset == t3.getChildCount() - 1) {
                        iM1980B += t3.getTopInset();
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        iM1980B += C0358u.m1980B(childAt);
                    } else if (checkFlag(scrollFlags, 5)) {
                        int iM1980B2 = C0358u.m1980B(childAt) + iM1980B;
                        if (topBottomOffsetForScrollingSibling < iM1980B2) {
                            i4 = iM1980B2;
                        } else {
                            iM1980B = iM1980B2;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        i4 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        iM1980B -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    if (topBottomOffsetForScrollingSibling < (iM1980B + i4) / 2) {
                        i4 = iM1980B;
                    }
                    animateOffsetTo(coordinatorLayout, t3, C3425a.m10443b(i4, -t3.getTotalScrollRange(), 0), IGoodView.DEFAULT_TO_ALPHA);
                }
            }
        }

        private void updateAccessibilityActions(CoordinatorLayout coordinatorLayout, T t3) {
            C0358u.m2039k0(coordinatorLayout, C1050c.a.f6219q.m4918b());
            C0358u.m2039k0(coordinatorLayout, C1050c.a.f6220r.m4918b());
            View viewFindFirstScrollingChild = findFirstScrollingChild(coordinatorLayout);
            if (viewFindFirstScrollingChild == null || t3.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0305e) viewFindFirstScrollingChild.getLayoutParams()).m1709f() instanceof ScrollingViewBehavior)) {
                return;
            }
            addAccessibilityScrollActions(coordinatorLayout, t3, viewFindFirstScrollingChild);
        }

        private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorLayout, T t3, int i4, int i5, boolean z3) throws Resources.NotFoundException {
            View appBarChildOnOffset = getAppBarChildOnOffset(t3, i4);
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                boolean zShouldLift = false;
                if ((scrollFlags & 1) != 0) {
                    int iM1980B = C0358u.m1980B(appBarChildOnOffset);
                    if (i5 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i4) < (appBarChildOnOffset.getBottom() - iM1980B) - t3.getTopInset()) : (-i4) >= (appBarChildOnOffset.getBottom() - iM1980B) - t3.getTopInset()) {
                        zShouldLift = true;
                    }
                }
                if (t3.isLiftOnScroll()) {
                    zShouldLift = t3.shouldLift(findFirstScrollingChild(coordinatorLayout));
                }
                boolean liftedState = t3.setLiftedState(zShouldLift);
                if (z3 || (liftedState && shouldJumpElevationState(coordinatorLayout, t3))) {
                    t3.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        public void setDragCallback(BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(T t3) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t3);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(T t3) {
            return -t3.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(T t3) {
            return t3.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(CoordinatorLayout coordinatorLayout, T t3) throws Resources.NotFoundException {
            snapToChildIfNeeded(coordinatorLayout, t3);
            if (t3.isLiftOnScroll()) {
                t3.setLiftedState(t3.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t3, int i4) throws Resources.NotFoundException {
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) t3, i4);
            int pendingAction = t3.getPendingAction();
            int i5 = this.offsetToChildIndexOnLayout;
            if (i5 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t3.getChildAt(i5);
                setHeaderTopBottomOffset(coordinatorLayout, t3, (-childAt.getBottom()) + (this.offsetToChildIndexOnLayoutIsMinHeight ? C0358u.m1980B(childAt) + t3.getTopInset() : Math.round(childAt.getHeight() * this.offsetToChildIndexOnLayoutPerc)));
            } else if (pendingAction != 0) {
                boolean z3 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i6 = -t3.getUpNestedPreScrollRange();
                    if (z3) {
                        animateOffsetTo(coordinatorLayout, t3, i6, IGoodView.DEFAULT_TO_ALPHA);
                    } else {
                        setHeaderTopBottomOffset(coordinatorLayout, t3, i6);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z3) {
                        animateOffsetTo(coordinatorLayout, t3, 0, IGoodView.DEFAULT_TO_ALPHA);
                    } else {
                        setHeaderTopBottomOffset(coordinatorLayout, t3, 0);
                    }
                }
            }
            t3.resetPendingAction();
            this.offsetToChildIndexOnLayout = -1;
            setTopAndBottomOffset(C3425a.m10443b(getTopAndBottomOffset(), -t3.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t3, getTopAndBottomOffset(), 0, true);
            t3.onOffsetChanged(getTopAndBottomOffset());
            updateAccessibilityActions(coordinatorLayout, t3);
            return zOnLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t3, int i4, int i5, int i6, int i7) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0305e) t3.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) t3, i4, i5, i6, i7);
            }
            coordinatorLayout.onMeasureChild(t3, i4, i5, View.MeasureSpec.makeMeasureSpec(0, 0), i7);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t3, View view, int i4, int i5, int[] iArr, int i6) throws Resources.NotFoundException {
            int i7;
            int downNestedPreScrollRange;
            if (i5 != 0) {
                if (i5 < 0) {
                    int i8 = -t3.getTotalScrollRange();
                    i7 = i8;
                    downNestedPreScrollRange = t3.getDownNestedPreScrollRange() + i8;
                } else {
                    i7 = -t3.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i7 != downNestedPreScrollRange) {
                    iArr[1] = scroll(coordinatorLayout, t3, i5, i7, downNestedPreScrollRange);
                }
            }
            if (t3.isLiftOnScroll()) {
                t3.setLiftedState(t3.shouldLift(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t3, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            if (i7 < 0) {
                iArr[1] = scroll(coordinatorLayout, t3, i7, -t3.getDownNestedScrollRange(), 0);
            }
            if (i7 == 0) {
                updateAccessibilityActions(coordinatorLayout, t3);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t3, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t3, parcelable);
                this.offsetToChildIndexOnLayout = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t3, savedState.getSuperState());
            this.offsetToChildIndexOnLayout = savedState.firstVisibleChildIndex;
            this.offsetToChildIndexOnLayoutPerc = savedState.firstVisibleChildPercentageShown;
            this.offsetToChildIndexOnLayoutIsMinHeight = savedState.firstVisibleChildAtMinimumHeight;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t3) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) t3);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t3.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = t3.getChildAt(i4);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
                    savedState.firstVisibleChildIndex = i4;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == C0358u.m1980B(childAt) + t3.getTopInset();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return parcelableOnSaveInstanceState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t3, View view, View view2, int i4, int i5) {
            ValueAnimator valueAnimator;
            boolean z3 = (i4 & 2) != 0 && (t3.isLiftOnScroll() || canScrollChildren(coordinatorLayout, t3, view));
            if (z3 && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i5;
            return z3;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t3, View view, int i4) throws Resources.NotFoundException {
            if (this.lastStartedType == 0 || i4 == 1) {
                snapToChildIfNeeded(coordinatorLayout, t3);
                if (t3.isLiftOnScroll()) {
                    t3.setLiftedState(t3.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, T t3, int i4, int i5, int i6) throws Resources.NotFoundException {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i7 = 0;
            if (i5 == 0 || topBottomOffsetForScrollingSibling < i5 || topBottomOffsetForScrollingSibling > i6) {
                this.offsetDelta = 0;
            } else {
                int iM10443b = C3425a.m10443b(i4, i5, i6);
                if (topBottomOffsetForScrollingSibling != iM10443b) {
                    int iInterpolateOffset = t3.hasChildWithInterpolator() ? interpolateOffset(t3, iM10443b) : iM10443b;
                    boolean topAndBottomOffset = setTopAndBottomOffset(iInterpolateOffset);
                    i7 = topBottomOffsetForScrollingSibling - iM10443b;
                    this.offsetDelta = iM10443b - iInterpolateOffset;
                    if (!topAndBottomOffset && t3.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t3);
                    }
                    t3.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t3, iM10443b, iM10443b < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                }
            }
            updateAccessibilityActions(coordinatorLayout, t3);
            return i7;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.offsetToChildIndexOnLayout = -1;
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                @Override // android.os.Parcelable.Creator
                public SavedState[] newArray(int i4) {
                    return new SavedState[i4];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                super.writeToParcel(parcel, i4);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t3, int i4);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, int i6, int i7) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i4, i5, i6, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int[] iArr, int i6) throws Resources.NotFoundException {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i4, i5, iArr, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i4, i5, i6, i7, i8, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i4, int i5) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4) throws Resources.NotFoundException {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z3) {
            super.setHorizontalOffsetEnabled(z3);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i4) {
            return super.setLeftAndRightOffset(i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i4) {
            return super.setTopAndBottomOffset(i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z3) {
            super.setVerticalOffsetEnabled(z3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i4);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behaviorM1709f = ((CoordinatorLayout.C0305e) appBarLayout.getLayoutParams()).m1709f();
            if (behaviorM1709f instanceof BaseBehavior) {
                return ((BaseBehavior) behaviorM1709f).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            CoordinatorLayout.Behavior behaviorM1709f = ((CoordinatorLayout.C0305e) view2.getLayoutParams()).m1709f();
            if (behaviorM1709f instanceof BaseBehavior) {
                C0358u.m2021b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behaviorM1709f).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) throws Resources.NotFoundException {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* bridge */ /* synthetic */ View findFirstDependency(List list) {
            return findFirstDependency((List<View>) list);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float getOverlapRatioForOffset(View view) {
            int i4;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i4 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i4) + 1.0f;
                }
            }
            return IGoodView.DEFAULT_TO_ALPHA;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.getScrollRange(view);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C0358u.m2039k0(coordinatorLayout, C1050c.a.f6219q.m4918b());
                C0358u.m2039k0(coordinatorLayout, C1050c.a.f6220r.m4918b());
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
            return super.onLayoutChild(coordinatorLayout, view, i4);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
            return super.onMeasureChild(coordinatorLayout, view, i4, i5, i6, i7);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z3) {
            AppBarLayout appBarLayoutFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (appBarLayoutFindFirstDependency != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.tempRect1;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutFindFirstDependency.setExpanded(false, !z3);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z3) {
            super.setHorizontalOffsetEnabled(z3);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i4) {
            return super.setLeftAndRightOffset(i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i4) {
            return super.setTopAndBottomOffset(i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z3) {
            super.setVerticalOffsetEnabled(z3);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1371R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1371R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        AppBarLayout findFirstDependency(List<View> list) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = list.get(i4);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    private View findLiftOnScrollTargetView(View view) {
        int i4;
        if (this.liftOnScrollTargetView == null && (i4 = this.liftOnScrollTargetViewId) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i4) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (viewFindViewById != null) {
                this.liftOnScrollTargetView = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((LayoutParams) getChildAt(i4).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void invalidateScrollRanges() {
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
    }

    private boolean setLiftableState(boolean z3) {
        if (this.liftable == z3) {
            return false;
        }
        this.liftable = z3;
        refreshDrawableState();
        return true;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || C0358u.m2064x(childAt)) ? false : true;
    }

    private void startLiftOnScrollElevationOverlayAnimation(final MaterialShapeDrawable materialShapeDrawable, boolean z3) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(C1371R.dimen.design_appbar_elevation);
        float f4 = z3 ? IGoodView.DEFAULT_TO_ALPHA : dimension;
        if (!z3) {
            dimension = IGoodView.DEFAULT_TO_ALPHA;
        }
        ValueAnimator valueAnimator = this.elevationOverlayAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, dimension);
        this.elevationOverlayAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(C1371R.integer.app_bar_elevation_anim_duration));
        this.elevationOverlayAnimator.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        this.elevationOverlayAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                materialShapeDrawable.setElevation(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.elevationOverlayAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    public void addOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int iSave = canvas.save();
            canvas.translate(IGoodView.DEFAULT_TO_ALPHA, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0302b
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iM1980B;
        int i4 = this.downPreScrollRange;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = layoutParams.scrollFlags;
            if ((i6 & 5) != 5) {
                if (i5 > 0) {
                    break;
                }
            } else {
                int i7 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i6 & 8) != 0) {
                    iM1980B = C0358u.m1980B(childAt);
                } else if ((i6 & 2) != 0) {
                    iM1980B = measuredHeight - C0358u.m1980B(childAt);
                } else {
                    iMin = i7 + measuredHeight;
                    if (childCount == 0 && C0358u.m2064x(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i5 += iMin;
                }
                iMin = i7 + iM1980B;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i5 += iMin;
            }
        }
        int iMax = Math.max(0, i5);
        this.downPreScrollRange = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i4 = this.downScrollRange;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int iM1980B = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            int i6 = layoutParams.scrollFlags;
            if ((i6 & 1) == 0) {
                break;
            }
            iM1980B += measuredHeight;
            if ((i6 & 2) != 0) {
                iM1980B -= C0358u.m1980B(childAt);
                break;
            }
            i5++;
        }
        int iMax = Math.max(0, iM1980B);
        this.downScrollRange = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iM1980B = C0358u.m1980B(this);
        if (iM1980B == 0) {
            int childCount = getChildCount();
            iM1980B = childCount >= 1 ? C0358u.m1980B(getChildAt(childCount - 1)) : 0;
            if (iM1980B == 0) {
                return getHeight() / 3;
            }
        }
        return (iM1980B * 2) + topInset;
    }

    int getPendingAction() {
        return this.pendingAction;
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return IGoodView.DEFAULT_TO_ALPHA;
    }

    final int getTopInset() {
        C0340c0 c0340c0 = this.lastInsets;
        if (c0340c0 != null) {
            return c0340c0.m1874l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i4 = this.totalScrollRange;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int iM1980B = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = layoutParams.scrollFlags;
            if ((i6 & 1) == 0) {
                break;
            }
            iM1980B += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            if (i5 == 0 && C0358u.m2064x(childAt)) {
                iM1980B -= getTopInset();
            }
            if ((i6 & 2) != 0) {
                iM1980B -= C0358u.m1980B(childAt);
                break;
            }
            i5++;
        }
        int iMax = Math.max(0, iM1980B);
        this.totalScrollRange = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + iArr.length);
        boolean z3 = this.liftable;
        int i5 = C1371R.attr.state_liftable;
        if (!z3) {
            i5 = -i5;
        }
        iArr[0] = i5;
        iArr[1] = (z3 && this.lifted) ? C1371R.attr.state_lifted : -C1371R.attr.state_lifted;
        int i6 = C1371R.attr.state_collapsible;
        if (!z3) {
            i6 = -i6;
        }
        iArr[2] = i6;
        iArr[3] = (z3 && this.lifted) ? C1371R.attr.state_collapsed : -C1371R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        boolean z4 = true;
        if (C0358u.m2064x(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0358u.m2021b0(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i8 = 0;
        while (true) {
            if (i8 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i8).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
            i8++;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll && !hasCollapsibleChild()) {
            z4 = false;
        }
        setLiftableState(z4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != 1073741824 && C0358u.m2064x(this) && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C3425a.m10443b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i5));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    void onOffsetChanged(int i4) {
        this.currentOffset = i4;
        if (!willNotDraw()) {
            C0358u.m2033h0(this);
        }
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i5);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i4);
                }
            }
        }
    }

    C0340c0 onWindowInsetChanged(C0340c0 c0340c0) {
        C0340c0 c0340c02 = C0358u.m2064x(this) ? c0340c0 : null;
        if (!C1020c.m4773a(this.lastInsets, c0340c02)) {
            this.lastInsets = c0340c02;
            updateWillNotDraw();
            requestLayout();
        }
        return c0340c0;
    }

    public void removeOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    void resetPendingAction() {
        this.pendingAction = 0;
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        MaterialShapeUtils.setElevation(this, f4);
    }

    public void setExpanded(boolean z3) {
        setExpanded(z3, C0358u.m2013V(this));
    }

    public void setLiftOnScroll(boolean z3) {
        this.liftOnScroll = z3;
    }

    public void setLiftOnScrollTargetViewId(int i4) {
        this.liftOnScrollTargetViewId = i4;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z3) {
        this.liftableOverride = true;
        return setLiftableState(z3);
    }

    public boolean setLifted(boolean z3) {
        return setLiftedState(z3);
    }

    boolean setLiftedState(boolean z3) throws Resources.NotFoundException {
        if (this.lifted == z3) {
            return false;
        }
        this.lifted = z3;
        refreshDrawableState();
        if (!this.liftOnScroll || !(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        startLiftOnScrollElevationOverlayAnimation((MaterialShapeDrawable) getBackground(), z3);
        return true;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (i4 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i4);
    }

    public void setStatusBarForeground(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.statusBarForeground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                C3403a.m10396m(this.statusBarForeground, C0358u.m1978A(this));
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            C0358u.m2033h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarForeground(new ColorDrawable(i4));
    }

    public void setStatusBarForegroundResource(int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarForeground(C2443a.m8169d(getContext(), i4));
    }

    @Deprecated
    public void setTargetElevation(float f4) throws Resources.NotFoundException {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f4);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
    }

    boolean shouldLift(View view) {
        View viewFindLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (viewFindLiftOnScrollTargetView != null) {
            view = viewFindLiftOnScrollTargetView;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1371R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z3, boolean z4) {
        setExpanded(z3, z4, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i4) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i5 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i4, i5), attributeSet, i4);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        Context context2 = getContext();
        setOrientation(1);
        int i6 = Build.VERSION.SDK_INT;
        ViewUtilsLollipop.setBoundsViewOutlineProvider(this);
        ViewUtilsLollipop.setStateListAnimatorFromAttrs(this, attributeSet, i4, i5);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1371R.styleable.AppBarLayout, i4, i5, new int[0]);
        C0358u.m2057t0(this, typedArrayObtainStyledAttributes.getDrawable(C1371R.styleable.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.initializeElevationOverlay(context2);
            C0358u.m2057t0(this, materialShapeDrawable);
        }
        int i7 = C1371R.styleable.AppBarLayout_expanded;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            setExpanded(typedArrayObtainStyledAttributes.getBoolean(i7, false), false, false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1371R.styleable.AppBarLayout_elevation)) {
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r12, 0));
        }
        if (i6 >= 26) {
            int i8 = C1371R.styleable.AppBarLayout_android_keyboardNavigationCluster;
            if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(i8, false));
            }
            int i9 = C1371R.styleable.AppBarLayout_android_touchscreenBlocksFocus;
            if (typedArrayObtainStyledAttributes.hasValue(i9)) {
                setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(i9, false));
            }
        }
        this.liftOnScroll = typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.AppBarLayout_liftOnScroll, false);
        this.liftOnScrollTargetViewId = typedArrayObtainStyledAttributes.getResourceId(C1371R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayObtainStyledAttributes.getDrawable(C1371R.styleable.AppBarLayout_statusBarForeground));
        typedArrayObtainStyledAttributes.recycle();
        C0358u.m1985D0(this, new InterfaceC0353p() { // from class: com.google.android.material.appbar.AppBarLayout.1
            @Override // androidx.core.view.InterfaceC0353p
            public C0340c0 onApplyWindowInsets(View view, C0340c0 c0340c0) {
                return AppBarLayout.this.onWindowInsetChanged(c0340c0);
            }
        });
    }

    private void setExpanded(boolean z3, boolean z4, boolean z5) {
        this.pendingAction = (z3 ? 1 : 2) | (z4 ? 4 : 0) | (z5 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1371R.styleable.AppBarLayout_Layout);
            this.scrollFlags = typedArrayObtainStyledAttributes.getInt(C1371R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            int i4 = C1371R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i4, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        boolean isCollapsible() {
            int i4 = this.scrollFlags;
            return (i4 & 1) == 1 && (i4 & 10) != 0;
        }

        public void setScrollFlags(int i4) {
            this.scrollFlags = i4;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i4, int i5, float f4) {
            super(i4, i5, f4);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }
}
