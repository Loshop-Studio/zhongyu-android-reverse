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

        public static boolean onNestedFling(ViewParent viewParent, View view, float f10, float f11, boolean z9) {
            return viewParent.onNestedFling(view, f10, f11, z9);
        }

        public static boolean onNestedPreFling(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        public static void onNestedPreScroll(ViewParent viewParent, View view, int i9, int i10, int[] iArr) {
            viewParent.onNestedPreScroll(view, i9, i10, iArr);
        }

        public static void onNestedScroll(ViewParent viewParent, View view, int i9, int i10, int i11, int i12) {
            viewParent.onNestedScroll(view, i9, i10, i11, i12);
        }

        public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i9) {
            viewParent.onNestedScrollAccepted(view, view2, i9);
        }

        public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i9) {
            return viewParent.onStartNestedScroll(view, view2, i9);
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
    public static void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i9) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i9);
    }

    public static boolean onNestedFling(ViewParent viewParent, View view, float f10, float f11, boolean z9) {
        try {
            return Api21Impl.onNestedFling(viewParent, view, f10, f11, z9);
        } catch (AbstractMethodError e10) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public static boolean onNestedPreFling(ViewParent viewParent, View view, float f10, float f11) {
        try {
            return Api21Impl.onNestedPreFling(viewParent, view, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i9, int i10, int[] iArr) {
        onNestedPreScroll(viewParent, view, i9, i10, iArr, 0);
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i9, int i10, int i11, int i12) {
        onNestedScroll(viewParent, view, i9, i10, i11, i12, 0, getTempNestedScrollConsumed());
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i9) {
        onNestedScrollAccepted(viewParent, view, view2, i9, 0);
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i9) {
        return onStartNestedScroll(viewParent, view, view2, i9, 0);
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    @ReplaceWith(expression = "parent.requestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i9, int i10, int[] iArr, int i11) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedPreScroll(view, i9, i10, iArr, i11);
            return;
        }
        if (i11 == 0) {
            try {
                Api21Impl.onNestedPreScroll(viewParent, view, i9, i10, iArr);
            } catch (AbstractMethodError e10) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
            }
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i9, int i10) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScrollAccepted(view, view2, i9, i10);
            return;
        }
        if (i10 == 0) {
            try {
                Api21Impl.onNestedScrollAccepted(viewParent, view, view2, i9);
            } catch (AbstractMethodError e10) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
            }
        }
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i9, int i10) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).onStartNestedScroll(view, view2, i9, i10);
        }
        if (i10 != 0) {
            return false;
        }
        try {
            return Api21Impl.onStartNestedScroll(viewParent, view, view2, i9);
        } catch (AbstractMethodError e10) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
            return false;
        }
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view, int i9) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onStopNestedScroll(view, i9);
            return;
        }
        if (i9 == 0) {
            try {
                Api21Impl.onStopNestedScroll(viewParent, view);
            } catch (AbstractMethodError e10) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
            }
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i9, int i10, int i11, int i12, int i13) {
        onNestedScroll(viewParent, view, i9, i10, i11, i12, i13, getTempNestedScrollConsumed());
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        if (viewParent instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParent).onNestedScroll(view, i9, i10, i11, i12, i13, iArr);
            return;
        }
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScroll(view, i9, i10, i11, i12, i13);
            return;
        }
        if (i13 == 0) {
            try {
                Api21Impl.onNestedScroll(viewParent, view, i9, i10, i11, i12);
            } catch (AbstractMethodError e10) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e10);
            }
        }
    }
}
