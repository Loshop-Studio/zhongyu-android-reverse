package androidx.compose.p013ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.focus.FocusInteropUtils;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.platform.AndroidComposeView;
import androidx.compose.p013ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public final class FocusInteropUtils_androidKt {
    public static final Rect calculateBoundingRectRelativeTo(View view, View view2) {
        FocusInteropUtils.Companion companion = FocusInteropUtils.Companion;
        view.getLocationInWindow(companion.getTempCoordinates());
        int i10 = companion.getTempCoordinates()[0];
        int i11 = companion.getTempCoordinates()[1];
        view2.getLocationInWindow(companion.getTempCoordinates());
        float f10 = i10 - companion.getTempCoordinates()[0];
        float f11 = i11 - companion.getTempCoordinates()[1];
        return new Rect(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean requestInteropFocus(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m23924toAndroidFocusDirection3ESFkO8(int i10) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23923getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23916getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23920getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m23912equalsimpl0(i10, companion.m23921getPreviousdhqQ8s()) ? 1 : null;
    }

    public static final FocusDirection toFocusDirection(int i10) {
        if (i10 == 1) {
            return FocusDirection.m23909boximpl(FocusDirection.Companion.m23921getPreviousdhqQ8s());
        }
        if (i10 == 2) {
            return FocusDirection.m23909boximpl(FocusDirection.Companion.m23920getNextdhqQ8s());
        }
        if (i10 == 17) {
            return FocusDirection.m23909boximpl(FocusDirection.Companion.m23919getLeftdhqQ8s());
        }
        if (i10 == 33) {
            return FocusDirection.m23909boximpl(FocusDirection.Companion.m23923getUpdhqQ8s());
        }
        if (i10 == 66) {
            return FocusDirection.m23909boximpl(FocusDirection.Companion.m23922getRightdhqQ8s());
        }
        if (i10 != 130) {
            return null;
        }
        return FocusDirection.m23909boximpl(FocusDirection.Companion.m23916getDowndhqQ8s());
    }

    public static final LayoutDirection toLayoutDirection(int i10) {
        if (i10 == 0) {
            return LayoutDirection.Ltr;
        }
        if (i10 != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }
}
