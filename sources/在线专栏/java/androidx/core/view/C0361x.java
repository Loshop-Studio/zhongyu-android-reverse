package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.x */
/* loaded from: classes.dex */
public final class C0361x {
    /* renamed from: a */
    public static boolean m2112a(ViewParent viewParent, View view, float f4, float f5, boolean z3) {
        try {
            return viewParent.onNestedFling(view, f4, f5, z3);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m2113b(ViewParent viewParent, View view, float f4, float f5) {
        try {
            return viewParent.onNestedPreFling(view, f4, f5);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    /* renamed from: c */
    public static void m2114c(ViewParent viewParent, View view, int i4, int i5, int[] iArr, int i6) {
        if (viewParent instanceof InterfaceC0350m) {
            ((InterfaceC0350m) viewParent).onNestedPreScroll(view, i4, i5, iArr, i6);
            return;
        }
        if (i6 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i4, i5, iArr);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e4);
            }
        }
    }

    /* renamed from: d */
    public static void m2115d(ViewParent viewParent, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        if (viewParent instanceof InterfaceC0351n) {
            ((InterfaceC0351n) viewParent).onNestedScroll(view, i4, i5, i6, i7, i8, iArr);
            return;
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (viewParent instanceof InterfaceC0350m) {
            ((InterfaceC0350m) viewParent).onNestedScroll(view, i4, i5, i6, i7, i8);
            return;
        }
        if (i8 == 0) {
            try {
                viewParent.onNestedScroll(view, i4, i5, i6, i7);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e4);
            }
        }
    }

    /* renamed from: e */
    public static void m2116e(ViewParent viewParent, View view, View view2, int i4, int i5) {
        if (viewParent instanceof InterfaceC0350m) {
            ((InterfaceC0350m) viewParent).onNestedScrollAccepted(view, view2, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i4);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e4);
            }
        }
    }

    /* renamed from: f */
    public static boolean m2117f(ViewParent viewParent, View view, View view2, int i4, int i5) {
        if (viewParent instanceof InterfaceC0350m) {
            return ((InterfaceC0350m) viewParent).onStartNestedScroll(view, view2, i4, i5);
        }
        if (i5 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i4);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e4);
            return false;
        }
    }

    /* renamed from: g */
    public static void m2118g(ViewParent viewParent, View view, int i4) {
        if (viewParent instanceof InterfaceC0350m) {
            ((InterfaceC0350m) viewParent).onStopNestedScroll(view, i4);
            return;
        }
        if (i4 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e4);
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m2119h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
