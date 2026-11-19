package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0358u;
import androidx.customview.widget.C0384c;
import com.p068uc.crashsdk.export.LogType;
import p016c0.C1050c;
import p016c0.InterfaceC1053f;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean sensitivitySet;
    C0384c viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final C0384c.c dragCallback = new C0384c.c() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(View view, float f4) {
            if (f4 == 0.0f) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z3 = C0358u.m1978A(view) == 1;
            int i4 = SwipeDismissBehavior.this.swipeDirection;
            if (i4 == 2) {
                return true;
            }
            if (i4 == 0) {
                if (z3) {
                    if (f4 >= 0.0f) {
                        return false;
                    }
                } else if (f4 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i4 != 1) {
                return false;
            }
            if (z3) {
                if (f4 <= 0.0f) {
                    return false;
                }
            } else if (f4 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.C0384c.c
        public int clampViewPositionHorizontal(View view, int i4, int i5) {
            int width;
            int width2;
            int width3;
            boolean z3 = C0358u.m1978A(view) == 1;
            int i6 = SwipeDismissBehavior.this.swipeDirection;
            if (i6 == 0) {
                if (z3) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i6 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z3) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i4, width2);
        }

        @Override // androidx.customview.widget.C0384c.c
        public int clampViewPositionVertical(View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C0384c.c
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewCaptured(View view, int i4) {
            this.activePointerId = i4;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewDragStateChanged(int i4) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i4);
            }
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewPositionChanged(View view, int i4, int i5, int i6, int i7) {
            float width = this.originalCapturedViewLeft + (view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance);
            float width2 = this.originalCapturedViewLeft + (view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance);
            float f4 = i4;
            if (f4 <= width) {
                view.setAlpha(1.0f);
            } else if (f4 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f4), 1.0f));
            }
        }

        @Override // androidx.customview.widget.C0384c.c
        public void onViewReleased(View view, float f4, float f5) {
            int i4;
            boolean z3;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f4)) {
                int left = view.getLeft();
                int i5 = this.originalCapturedViewLeft;
                i4 = left < i5 ? i5 - width : i5 + width;
                z3 = true;
            } else {
                i4 = this.originalCapturedViewLeft;
                z3 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.m2269N(i4, view.getTop())) {
                C0358u.m2035i0(view, new SettleRunnable(view, z3));
            } else {
                if (!z3 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.C0384c.c
        public boolean tryCaptureView(View view, int i4) {
            int i5 = this.activePointerId;
            return (i5 == -1 || i5 == i4) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i4);
    }

    private class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        SettleRunnable(View view, boolean z3) {
            this.view = view;
            this.dismiss = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            C0384c c0384c = SwipeDismissBehavior.this.viewDragHelper;
            if (c0384c != null && c0384c.m2278n(true)) {
                C0358u.m2035i0(this.view, this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    static float clamp(float f4, float f5, float f6) {
        return Math.min(Math.max(f4, f5), f6);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? C0384c.m2253o(viewGroup, this.sensitivity, this.dragCallback) : C0384c.m2254p(viewGroup, this.dragCallback);
        }
    }

    static float fraction(float f4, float f5, float f6) {
        return (f6 - f4) / (f5 - f4);
    }

    private void updateAccessibilityActions(View view) {
        C0358u.m2039k0(view, LogType.ANR);
        if (canSwipeDismissView(view)) {
            C0358u.m2043m0(view, C1050c.a.f6227y, null, new InterfaceC1053f() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // p016c0.InterfaceC1053f
                public boolean perform(View view2, InterfaceC1053f.a aVar) {
                    boolean z3 = false;
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    boolean z4 = C0358u.m1978A(view2) == 1;
                    int i4 = SwipeDismissBehavior.this.swipeDirection;
                    if ((i4 == 0 && z4) || (i4 == 1 && !z4)) {
                        z3 = true;
                    }
                    int width = view2.getWidth();
                    if (z3) {
                        width = -width;
                    }
                    C0358u.m2019a0(view2, width);
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public int getDragState() {
        C0384c c0384c = this.viewDragHelper;
        if (c0384c != null) {
            return c0384c.m2261A();
        }
        return 0;
    }

    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v3, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.viewDragHelper.m2270O(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v3, int i4) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v3, i4);
        if (C0358u.m2066y(v3) == 0) {
            C0358u.m1979A0(v3, 1);
            updateAccessibilityActions(v3);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        C0384c c0384c = this.viewDragHelper;
        if (c0384c == null) {
            return false;
        }
        c0384c.m2265F(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f4) {
        this.dragDismissThreshold = clamp(0.0f, f4, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f4) {
        this.alphaEndSwipeDistance = clamp(0.0f, f4, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f4) {
        this.sensitivity = f4;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f4) {
        this.alphaStartSwipeDistance = clamp(0.0f, f4, 1.0f);
    }

    public void setSwipeDirection(int i4) {
        this.swipeDirection = i4;
    }

    static int clamp(int i4, int i5, int i6) {
        return Math.min(Math.max(i4, i5), i6);
    }
}
