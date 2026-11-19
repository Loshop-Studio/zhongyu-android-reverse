package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0340c0;
import androidx.core.view.C0358u;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C0384c;
import anet.channel.bytes.C0860a;
import com.google.android.material.C1371R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.p068uc.crashsdk.export.LogType;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p016c0.C1050c;
import p016c0.InterfaceC1053f;
import p164w.C3425a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = C1371R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    int activePointerId;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final C0384c.c dragCallback;
    private boolean draggable;
    float elevation;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private BottomSheetBehavior<V>.SettleRunnable settleRunnable;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    private boolean skipCollapsed;
    int state;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    C0384c viewDragHelper;
    WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(View view, float f4);

        public abstract void onStateChanged(View view, int i4);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
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
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i4) {
            super(parcelable);
            this.state = i4;
        }
    }

    private class SettleRunnable implements Runnable {
        private boolean isPosted;
        int targetState;
        private final View view;

        SettleRunnable(View view, int i4) {
            this.view = view;
            this.targetState = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0384c c0384c = BottomSheetBehavior.this.viewDragHelper;
            if (c0384c == null || !c0384c.m2278n(true)) {
                BottomSheetBehavior.this.setStateInternal(this.targetState);
            } else {
                C0358u.m2035i0(this.view, this);
            }
            this.isPosted = false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.settleRunnable = null;
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.dragCallback = new C0384c.c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // androidx.customview.widget.C0384c.c
            public int clampViewPositionHorizontal(View view, int i4, int i5) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.C0384c.c
            public int clampViewPositionVertical(View view, int i4, int i5) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return C3425a.m10443b(i4, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // androidx.customview.widget.C0384c.c
            public int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // androidx.customview.widget.C0384c.c
            public void onViewDragStateChanged(int i4) {
                if (i4 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.C0384c.c
            public void onViewPositionChanged(View view, int i4, int i5, int i6, int i7) {
                BottomSheetBehavior.this.dispatchOnSlide(i5);
            }

            @Override // androidx.customview.widget.C0384c.c
            public void onViewReleased(View view, float f4, float f5) {
                int i4;
                int i5 = 4;
                if (f5 < IGoodView.DEFAULT_TO_ALPHA) {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i4 = BottomSheetBehavior.this.fitToContentsOffset;
                    } else {
                        int top = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                        int i6 = bottomSheetBehavior.halfExpandedOffset;
                        if (top > i6) {
                            i4 = i6;
                            i5 = 6;
                        } else {
                            i4 = bottomSheetBehavior.expandedOffset;
                        }
                    }
                    i5 = 3;
                } else {
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior2.hideable && bottomSheetBehavior2.shouldHide(view, f5)) {
                        if ((Math.abs(f4) >= Math.abs(f5) || f5 <= 500.0f) && !releasedLow(view)) {
                            if (BottomSheetBehavior.this.fitToContents) {
                                i4 = BottomSheetBehavior.this.fitToContentsOffset;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.expandedOffset) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                                i4 = BottomSheetBehavior.this.expandedOffset;
                            } else {
                                i4 = BottomSheetBehavior.this.halfExpandedOffset;
                                i5 = 6;
                            }
                            i5 = 3;
                        } else {
                            i4 = BottomSheetBehavior.this.parentHeight;
                            i5 = 5;
                        }
                    } else if (f5 == IGoodView.DEFAULT_TO_ALPHA || Math.abs(f4) > Math.abs(f5)) {
                        int top2 = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                            int i7 = bottomSheetBehavior3.halfExpandedOffset;
                            if (top2 < i7) {
                                if (top2 < Math.abs(top2 - bottomSheetBehavior3.collapsedOffset)) {
                                    i4 = BottomSheetBehavior.this.expandedOffset;
                                    i5 = 3;
                                } else {
                                    i4 = BottomSheetBehavior.this.halfExpandedOffset;
                                }
                            } else if (Math.abs(top2 - i7) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                                i4 = BottomSheetBehavior.this.halfExpandedOffset;
                            } else {
                                i4 = BottomSheetBehavior.this.collapsedOffset;
                            }
                            i5 = 6;
                        } else if (Math.abs(top2 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            i4 = BottomSheetBehavior.this.fitToContentsOffset;
                            i5 = 3;
                        } else {
                            i4 = BottomSheetBehavior.this.collapsedOffset;
                        }
                    } else if (BottomSheetBehavior.this.fitToContents) {
                        i4 = BottomSheetBehavior.this.collapsedOffset;
                    } else {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                            i4 = BottomSheetBehavior.this.halfExpandedOffset;
                            i5 = 6;
                        } else {
                            i4 = BottomSheetBehavior.this.collapsedOffset;
                        }
                    }
                }
                BottomSheetBehavior.this.startSettlingAnimation(view, i5, i4, true);
            }

            @Override // androidx.customview.widget.C0384c.c
            public boolean tryCaptureView(View view, int i4) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior.state;
                if (i5 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i5 == 3 && bottomSheetBehavior.activePointerId == i4) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    private void addAccessibilityActionForState(V v3, C1050c.a aVar, final int i4) {
        C0358u.m2043m0(v3, aVar, null, new InterfaceC1053f() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // p016c0.InterfaceC1053f
            public boolean perform(View view, InterfaceC1053f.a aVar2) {
                BottomSheetBehavior.this.setState(i4);
                return true;
            }
        });
    }

    private void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - iCalculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - iCalculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private int calculatePeekHeight() {
        int i4;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) : (this.gestureInsetBottomIgnored || (i4 = this.gestureInsetBottom) <= 0) ? this.peekHeight : Math.max(this.peekHeight, i4 + this.peekHeightGestureInsetBuffer);
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z3) {
        createMaterialShapeDrawable(context, attributeSet, z3, null);
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(IGoodView.DEFAULT_TO_ALPHA, 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(fFloatValue);
                }
            }
        });
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v3) {
        ViewGroup.LayoutParams layoutParams = v3.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0305e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorM1709f = ((CoordinatorLayout.C0305e) layoutParams).m1709f();
        if (behaviorM1709f instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behaviorM1709f;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i4 = this.saveFlags;
        if (i4 == 0) {
            return;
        }
        if (i4 == -1 || (i4 & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i4 == -1 || (i4 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i4 == -1 || (i4 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i4 == -1 || (i4 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void setSystemGestureInsets(View view) {
        if (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) {
            return;
        }
        ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public C0340c0 onApplyWindowInsets(View view2, C0340c0 c0340c0, ViewUtils.RelativePadding relativePadding) {
                BottomSheetBehavior.this.gestureInsetBottom = c0340c0.m1869g().f11903d;
                BottomSheetBehavior.this.updatePeekHeight(false);
                return c0340c0;
            }
        });
    }

    private void settleToStatePendingLayout(final int i4) {
        final V v3 = this.viewRef.get();
        if (v3 == null) {
            return;
        }
        ViewParent parent = v3.getParent();
        if (parent != null && parent.isLayoutRequested() && C0358u.m2012U(v3)) {
            v3.post(new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.settleToState(v3, i4);
                }
            });
        } else {
            settleToState(v3, i4);
        }
    }

    private void updateAccessibilityActions() {
        V v3;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        C0358u.m2039k0(v3, C0860a.MAX_POOL_SIZE);
        C0358u.m2039k0(v3, 262144);
        C0358u.m2039k0(v3, LogType.ANR);
        if (this.hideable && this.state != 5) {
            addAccessibilityActionForState(v3, C1050c.a.f6227y, 5);
        }
        int i4 = this.state;
        if (i4 == 3) {
            addAccessibilityActionForState(v3, C1050c.a.f6226x, this.fitToContents ? 4 : 6);
            return;
        }
        if (i4 == 4) {
            addAccessibilityActionForState(v3, C1050c.a.f6225w, this.fitToContents ? 3 : 6);
        } else {
            if (i4 != 6) {
                return;
            }
            addAccessibilityActionForState(v3, C1050c.a.f6226x, 4);
            addAccessibilityActionForState(v3, C1050c.a.f6225w, 3);
        }
    }

    private void updateDrawableForTargetState(int i4) {
        ValueAnimator valueAnimator;
        if (i4 == 2) {
            return;
        }
        boolean z3 = i4 == 3;
        if (this.isShapeExpanded != z3) {
            this.isShapeExpanded = z3;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f4 = z3 ? IGoodView.DEFAULT_TO_ALPHA : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f4, f4);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z3) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (childAt != this.viewRef.get()) {
                    if (z3) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            C0358u.m1979A0(childAt, 4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        C0358u.m1979A0(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (z3) {
                return;
            }
            this.importantForAccessibilityMap = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z3) {
        V v3;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v3 = this.viewRef.get()) == null) {
                return;
            }
            if (z3) {
                settleToStatePendingLayout(this.state);
            } else {
                v3.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    void dispatchOnSlide(int i4) {
        float f4;
        float expandedOffset;
        V v3 = this.viewRef.get();
        if (v3 == null || this.callbacks.isEmpty()) {
            return;
        }
        int i5 = this.collapsedOffset;
        if (i4 > i5 || i5 == getExpandedOffset()) {
            int i6 = this.collapsedOffset;
            f4 = i6 - i4;
            expandedOffset = this.parentHeight - i6;
        } else {
            int i7 = this.collapsedOffset;
            f4 = i7 - i4;
            expandedOffset = i7 - getExpandedOffset();
        }
        float f5 = f4 / expandedOffset;
        for (int i8 = 0; i8 < this.callbacks.size(); i8++) {
            this.callbacks.get(i8).onSlide(v3, f5);
        }
    }

    View findScrollingChild(View view) {
        if (C0358u.m2014W(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i4));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.fitToContents ? this.fitToContentsOffset : this.expandedOffset;
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.C0305e c0305e) {
        super.onAttachedToLayoutParams(c0305e);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        C0384c c0384c;
        if (!v3.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x3, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v3, x3, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (c0384c = this.viewDragHelper) != null && c0384c.m2270O(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.m2282z())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v3, int i4) {
        MaterialShapeDrawable materialShapeDrawable;
        if (C0358u.m2064x(coordinatorLayout) && !C0358u.m2064x(v3)) {
            v3.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(C1371R.dimen.design_bottom_sheet_peek_height_min);
            setSystemGestureInsets(v3);
            this.viewRef = new WeakReference<>(v3);
            if (this.shapeThemingEnabled && (materialShapeDrawable = this.materialShapeDrawable) != null) {
                C0358u.m2057t0(v3, materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
            if (materialShapeDrawable2 != null) {
                float fM2058u = this.elevation;
                if (fM2058u == -1.0f) {
                    fM2058u = C0358u.m2058u(v3);
                }
                materialShapeDrawable2.setElevation(fM2058u);
                boolean z3 = this.state == 3;
                this.isShapeExpanded = z3;
                this.materialShapeDrawable.setInterpolation(z3 ? IGoodView.DEFAULT_TO_ALPHA : 1.0f);
            }
            updateAccessibilityActions();
            if (C0358u.m2066y(v3) == 0) {
                C0358u.m1979A0(v3, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = C0384c.m2254p(coordinatorLayout, this.dragCallback);
        }
        int top = v3.getTop();
        coordinatorLayout.onLayoutChild(v3, i4);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v3.getHeight();
        this.childHeight = height;
        this.fitToContentsOffset = Math.max(0, this.parentHeight - height);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i5 = this.state;
        if (i5 == 3) {
            C0358u.m2021b0(v3, getExpandedOffset());
        } else if (i5 == 6) {
            C0358u.m2021b0(v3, this.halfExpandedOffset);
        } else if (this.hideable && i5 == 5) {
            C0358u.m2021b0(v3, this.parentHeight);
        } else if (i5 == 4) {
            C0358u.m2021b0(v3, this.collapsedOffset);
        } else if (i5 == 1 || i5 == 2) {
            C0358u.m2021b0(v3, top - v3.getTop());
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v3));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v3, View view, float f4, float f5) {
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v3, view, f4, f5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v3.getTop();
        int i7 = top - i5;
        if (i5 > 0) {
            if (i7 < getExpandedOffset()) {
                iArr[1] = top - getExpandedOffset();
                C0358u.m2021b0(v3, -iArr[1]);
                setStateInternal(3);
            } else {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i5;
                C0358u.m2021b0(v3, -i5);
                setStateInternal(1);
            }
        } else if (i5 < 0 && !view.canScrollVertically(-1)) {
            int i8 = this.collapsedOffset;
            if (i7 > i8 && !this.hideable) {
                iArr[1] = top - i8;
                C0358u.m2021b0(v3, -iArr[1]);
                setStateInternal(4);
            } else {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i5;
                C0358u.m2021b0(v3, -i5);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v3.getTop());
        this.lastNestedScrollDy = i5;
        this.nestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v3, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i4 = savedState.state;
        if (i4 == 1 || i4 == 2) {
            this.state = 4;
        } else {
            this.state = i4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v3) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v3), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i4, int i5) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i4 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4) {
        int i5;
        int i6 = 3;
        if (v3.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null && view == weakReference.get() && this.nestedScrolled) {
            if (this.lastNestedScrollDy > 0) {
                if (this.fitToContents) {
                    i5 = this.fitToContentsOffset;
                } else {
                    int top = v3.getTop();
                    int i7 = this.halfExpandedOffset;
                    if (top > i7) {
                        i5 = i7;
                        i6 = 6;
                    } else {
                        i5 = this.expandedOffset;
                    }
                }
            } else if (this.hideable && shouldHide(v3, getYVelocity())) {
                i5 = this.parentHeight;
                i6 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top2 = v3.getTop();
                if (!this.fitToContents) {
                    int i8 = this.halfExpandedOffset;
                    if (top2 < i8) {
                        if (top2 < Math.abs(top2 - this.collapsedOffset)) {
                            i5 = this.expandedOffset;
                        } else {
                            i5 = this.halfExpandedOffset;
                        }
                    } else if (Math.abs(top2 - i8) < Math.abs(top2 - this.collapsedOffset)) {
                        i5 = this.halfExpandedOffset;
                    } else {
                        i5 = this.collapsedOffset;
                        i6 = 4;
                    }
                    i6 = 6;
                } else if (Math.abs(top2 - this.fitToContentsOffset) < Math.abs(top2 - this.collapsedOffset)) {
                    i5 = this.fitToContentsOffset;
                } else {
                    i5 = this.collapsedOffset;
                    i6 = 4;
                }
            } else {
                if (this.fitToContents) {
                    i5 = this.collapsedOffset;
                } else {
                    int top3 = v3.getTop();
                    if (Math.abs(top3 - this.halfExpandedOffset) < Math.abs(top3 - this.collapsedOffset)) {
                        i5 = this.halfExpandedOffset;
                        i6 = 6;
                    } else {
                        i5 = this.collapsedOffset;
                    }
                }
                i6 = 4;
            }
            startSettlingAnimation(v3, i6, i5, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        C0384c c0384c = this.viewDragHelper;
        if (c0384c != null) {
            c0384c.m2265F(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (this.viewDragHelper != null && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.m2282z()) {
            this.viewDragHelper.m2275c(v3, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z3) {
        this.draggable = z3;
    }

    public void setExpandedOffset(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i4;
    }

    public void setFitToContents(boolean z3) {
        if (this.fitToContents == z3) {
            return;
        }
        this.fitToContents = z3;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z3) {
        this.gestureInsetBottomIgnored = z3;
    }

    public void setHalfExpandedRatio(float f4) {
        if (f4 <= IGoodView.DEFAULT_TO_ALPHA || f4 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f4;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideable(boolean z3) {
        if (this.hideable != z3) {
            this.hideable = z3;
            if (!z3 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setPeekHeight(int i4) {
        setPeekHeight(i4, false);
    }

    public void setSaveFlags(int i4) {
        this.saveFlags = i4;
    }

    public void setSkipCollapsed(boolean z3) {
        this.skipCollapsed = z3;
    }

    public void setState(int i4) {
        if (i4 == this.state) {
            return;
        }
        if (this.viewRef != null) {
            settleToStatePendingLayout(i4);
            return;
        }
        if (i4 == 4 || i4 == 3 || i4 == 6 || (this.hideable && i4 == 5)) {
            this.state = i4;
        }
    }

    void setStateInternal(int i4) {
        V v3;
        if (this.state == i4) {
            return;
        }
        this.state = i4;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        if (i4 == 3) {
            updateImportantForAccessibility(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i4);
        for (int i5 = 0; i5 < this.callbacks.size(); i5++) {
            this.callbacks.get(i5).onStateChanged(v3, i4);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z3) {
        this.updateImportantForAccessibilityOnSiblings = z3;
    }

    void settleToState(View view, int i4) {
        int expandedOffset;
        int i5;
        if (i4 == 4) {
            expandedOffset = this.collapsedOffset;
        } else if (i4 == 6) {
            int i6 = this.halfExpandedOffset;
            if (!this.fitToContents || i6 > (i5 = this.fitToContentsOffset)) {
                expandedOffset = i6;
            } else {
                expandedOffset = i5;
                i4 = 3;
            }
        } else if (i4 == 3) {
            expandedOffset = getExpandedOffset();
        } else {
            if (!this.hideable || i4 != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i4);
            }
            expandedOffset = this.parentHeight;
        }
        startSettlingAnimation(view, i4, expandedOffset, false);
    }

    boolean shouldHide(View view, float f4) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f4 * HIDE_FRICTION)) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > HIDE_THRESHOLD;
    }

    void startSettlingAnimation(View view, int i4, int i5, boolean z3) {
        C0384c c0384c = this.viewDragHelper;
        if (!(c0384c != null && (!z3 ? !c0384c.m2271P(view, view.getLeft(), i5) : !c0384c.m2269N(view.getLeft(), i5)))) {
            setStateInternal(i4);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i4);
        if (this.settleRunnable == null) {
            this.settleRunnable = new SettleRunnable(view, i4);
        }
        if (((SettleRunnable) this.settleRunnable).isPosted) {
            this.settleRunnable.targetState = i4;
            return;
        }
        BottomSheetBehavior<V>.SettleRunnable settleRunnable = this.settleRunnable;
        settleRunnable.targetState = i4;
        C0358u.m2035i0(view, settleRunnable);
        ((SettleRunnable) this.settleRunnable).isPosted = true;
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z3, ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, C1371R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            if (z3 && colorStateList != null) {
                this.materialShapeDrawable.setFillColor(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPeekHeight(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.peekHeightAuto
            if (r4 != 0) goto L15
            r3.peekHeightAuto = r0
            goto L1f
        Lc:
            boolean r2 = r3.peekHeightAuto
            if (r2 != 0) goto L17
            int r2 = r3.peekHeight
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1f
        L17:
            r3.peekHeightAuto = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.peekHeight = r4
        L1f:
            if (r0 == 0) goto L24
            r3.updatePeekHeight(r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setPeekHeight(int, boolean):void");
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i4;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.settleRunnable = null;
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.dragCallback = new C0384c.c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // androidx.customview.widget.C0384c.c
            public int clampViewPositionHorizontal(View view, int i42, int i5) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.C0384c.c
            public int clampViewPositionVertical(View view, int i42, int i5) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return C3425a.m10443b(i42, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // androidx.customview.widget.C0384c.c
            public int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // androidx.customview.widget.C0384c.c
            public void onViewDragStateChanged(int i42) {
                if (i42 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.C0384c.c
            public void onViewPositionChanged(View view, int i42, int i5, int i6, int i7) {
                BottomSheetBehavior.this.dispatchOnSlide(i5);
            }

            @Override // androidx.customview.widget.C0384c.c
            public void onViewReleased(View view, float f4, float f5) {
                int i42;
                int i5 = 4;
                if (f5 < IGoodView.DEFAULT_TO_ALPHA) {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i42 = BottomSheetBehavior.this.fitToContentsOffset;
                    } else {
                        int top = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                        int i6 = bottomSheetBehavior.halfExpandedOffset;
                        if (top > i6) {
                            i42 = i6;
                            i5 = 6;
                        } else {
                            i42 = bottomSheetBehavior.expandedOffset;
                        }
                    }
                    i5 = 3;
                } else {
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior2.hideable && bottomSheetBehavior2.shouldHide(view, f5)) {
                        if ((Math.abs(f4) >= Math.abs(f5) || f5 <= 500.0f) && !releasedLow(view)) {
                            if (BottomSheetBehavior.this.fitToContents) {
                                i42 = BottomSheetBehavior.this.fitToContentsOffset;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.expandedOffset) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                                i42 = BottomSheetBehavior.this.expandedOffset;
                            } else {
                                i42 = BottomSheetBehavior.this.halfExpandedOffset;
                                i5 = 6;
                            }
                            i5 = 3;
                        } else {
                            i42 = BottomSheetBehavior.this.parentHeight;
                            i5 = 5;
                        }
                    } else if (f5 == IGoodView.DEFAULT_TO_ALPHA || Math.abs(f4) > Math.abs(f5)) {
                        int top2 = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                            int i7 = bottomSheetBehavior3.halfExpandedOffset;
                            if (top2 < i7) {
                                if (top2 < Math.abs(top2 - bottomSheetBehavior3.collapsedOffset)) {
                                    i42 = BottomSheetBehavior.this.expandedOffset;
                                    i5 = 3;
                                } else {
                                    i42 = BottomSheetBehavior.this.halfExpandedOffset;
                                }
                            } else if (Math.abs(top2 - i7) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                                i42 = BottomSheetBehavior.this.halfExpandedOffset;
                            } else {
                                i42 = BottomSheetBehavior.this.collapsedOffset;
                            }
                            i5 = 6;
                        } else if (Math.abs(top2 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            i42 = BottomSheetBehavior.this.fitToContentsOffset;
                            i5 = 3;
                        } else {
                            i42 = BottomSheetBehavior.this.collapsedOffset;
                        }
                    } else if (BottomSheetBehavior.this.fitToContents) {
                        i42 = BottomSheetBehavior.this.collapsedOffset;
                    } else {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                            i42 = BottomSheetBehavior.this.halfExpandedOffset;
                            i5 = 6;
                        } else {
                            i42 = BottomSheetBehavior.this.collapsedOffset;
                        }
                    }
                }
                BottomSheetBehavior.this.startSettlingAnimation(view, i5, i42, true);
            }

            @Override // androidx.customview.widget.C0384c.c
            public boolean tryCaptureView(View view, int i42) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior.state;
                if (i5 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i5 == 3 && bottomSheetBehavior.activePointerId == i42) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(C1371R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1371R.styleable.BottomSheetBehavior_Layout);
        this.shapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(C1371R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        int i5 = C1371R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i5);
        if (zHasValue) {
            createMaterialShapeDrawable(context, attributeSet, zHasValue, MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i5));
        } else {
            createMaterialShapeDrawable(context, attributeSet, zHasValue);
        }
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(C1371R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i6 = C1371R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i6);
        if (typedValuePeekValue != null && (i4 = typedValuePeekValue.data) == -1) {
            setPeekHeight(i4);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(C1371R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(C1371R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, HIDE_THRESHOLD));
        int i7 = C1371R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i7);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i7, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
