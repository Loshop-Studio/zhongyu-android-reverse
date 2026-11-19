package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class ViewParentCompat {
    private static final String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static boolean onNestedFling(ViewParent viewParent, View view, float f6, float f7, boolean z6) {
            return viewParent.onNestedFling(view, f6, f7, z6);
        }

        public static boolean onNestedPreFling(ViewParent viewParent, View view, float f6, float f7) {
            return viewParent.onNestedPreFling(view, f6, f7);
        }

        public static void onNestedPreScroll(ViewParent viewParent, View view, int i6, int i7, int[] iArr) {
            viewParent.onNestedPreScroll(view, i6, i7, iArr);
        }

        public static void onNestedScroll(ViewParent viewParent, View view, int i6, int i7, int i8, int i9) {
            viewParent.onNestedScroll(view, i6, i7, i8, i9);
        }

        public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i6) {
            viewParent.onNestedScrollAccepted(view, view2, i6);
        }

        public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i6) {
            return viewParent.onStartNestedScroll(view, view2, i6);
        }

        public static void onStopNestedScroll(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private ViewParentCompat() {
    }

    private static int[] getTempNestedScrollConsumed() {
        int[] iArr = sTempNestedScrollConsumed;
        if (iArr == null) {
            sTempNestedScrollConsumed = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return sTempNestedScrollConsumed;
    }

    @ReplaceWith(expression = "parent.notifySubtreeAccessibilityStateChanged(child, source, changeType)")
    @Deprecated
    public static void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i6) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i6);
    }

    public static boolean onNestedFling(ViewParent viewParent, View view, float f6, float f7, boolean z6) {
        try {
            return Api21Impl.onNestedFling(viewParent, view, f6, f7, z6);
        } catch (AbstractMethodError e6) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e6);
            return false;
        }
    }

    public static boolean onNestedPreFling(ViewParent viewParent, View view, float f6, float f7) {
        try {
            return Api21Impl.onNestedPreFling(viewParent, view, f6, f7);
        } catch (AbstractMethodError e6) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e6);
            return false;
        }
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i6, int i7, int[] iArr) {
        onNestedPreScroll(viewParent, view, i6, i7, iArr, 0);
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i6, int i7, int i8, int i9) {
        onNestedScroll(viewParent, view, i6, i7, i8, i9, 0, getTempNestedScrollConsumed());
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i6) {
        onNestedScrollAccepted(viewParent, view, view2, i6, 0);
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i6) {
        return onStartNestedScroll(viewParent, view, view2, i6, 0);
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    @ReplaceWith(expression = "parent.requestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i6, int i7, int[] iArr, int i8) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedPreScroll(view, i6, i7, iArr, i8);
            return;
        }
        if (i8 == 0) {
            try {
                Api21Impl.onNestedPreScroll(viewParent, view, i6, i7, iArr);
            } catch (AbstractMethodError e6) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e6);
            }
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i6, int i7) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScrollAccepted(view, view2, i6, i7);
            return;
        }
        if (i7 == 0) {
            try {
                Api21Impl.onNestedScrollAccepted(viewParent, view, view2, i6);
            } catch (AbstractMethodError e6) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e6);
            }
        }
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i6, int i7) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).onStartNestedScroll(view, view2, i6, i7);
        }
        if (i7 != 0) {
            return false;
        }
        try {
            return Api21Impl.onStartNestedScroll(viewParent, view, view2, i6);
        } catch (AbstractMethodError e6) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e6);
            return false;
        }
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view, int i6) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onStopNestedScroll(view, i6);
            return;
        }
        if (i6 == 0) {
            try {
                Api21Impl.onStopNestedScroll(viewParent, view);
            } catch (AbstractMethodError e6) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e6);
            }
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i6, int i7, int i8, int i9, int i10) {
        onNestedScroll(viewParent, view, i6, i7, i8, i9, i10, getTempNestedScrollConsumed());
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        if (viewParent instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParent).onNestedScroll(view, i6, i7, i8, i9, i10, iArr);
            return;
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScroll(view, i6, i7, i8, i9, i10);
            return;
        }
        if (i10 == 0) {
            try {
                Api21Impl.onNestedScroll(viewParent, view, i6, i7, i8, i9);
            } catch (AbstractMethodError e6) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e6);
            }
        }
    }
}
