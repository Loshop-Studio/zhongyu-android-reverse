package androidx.compose.p011ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.focus.FocusInteropUtils;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.platform.AndroidComposeView;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000\u001a%\u0010\u000b\u001a\u00020\f*\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m5110d2 = {"toFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "androidDirection", "", "toLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "androidLayoutDirection", "calculateBoundingRectRelativeTo", "Landroidx/compose/ui/geometry/Rect;", "Landroid/view/View;", "view", "requestInteropFocus", "", "direction", "rect", "Landroid/graphics/Rect;", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "toAndroidFocusDirection", "toAndroidFocusDirection-3ESFkO8", "(I)Ljava/lang/Integer;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FocusInteropUtils_androidKt {
    @NotNull
    public static final Rect calculateBoundingRectRelativeTo(@NotNull View view, @NotNull View view2) {
        FocusInteropUtils.Companion companion = FocusInteropUtils.INSTANCE;
        view.getLocationInWindow(companion.getTempCoordinates());
        int i = companion.getTempCoordinates()[0];
        int i8 = companion.getTempCoordinates()[1];
        view2.getLocationInWindow(companion.getTempCoordinates());
        float f = i - companion.getTempCoordinates()[0];
        float f7 = i8 - companion.getTempCoordinates()[1];
        return new Rect(f, f7, view.getWidth() + f, view.getHeight() + f7);
    }

    public static final boolean requestInteropFocus(@NotNull View view, @Nullable Integer num, @Nullable android.graphics.Rect rect) {
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

    @Nullable
    /* renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m10330toAndroidFocusDirection3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m10318equalsimpl0(i, companion.m10329getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10322getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10325getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10328getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10326getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m10318equalsimpl0(i, companion.m10327getPreviousdhqQ8s()) ? 1 : null;
    }

    @Nullable
    public static final FocusDirection toFocusDirection(int i) {
        if (i == 1) {
            return FocusDirection.m10315boximpl(FocusDirection.INSTANCE.m10327getPreviousdhqQ8s());
        }
        if (i == 2) {
            return FocusDirection.m10315boximpl(FocusDirection.INSTANCE.m10326getNextdhqQ8s());
        }
        if (i == 17) {
            return FocusDirection.m10315boximpl(FocusDirection.INSTANCE.m10325getLeftdhqQ8s());
        }
        if (i == 33) {
            return FocusDirection.m10315boximpl(FocusDirection.INSTANCE.m10329getUpdhqQ8s());
        }
        if (i == 66) {
            return FocusDirection.m10315boximpl(FocusDirection.INSTANCE.m10328getRightdhqQ8s());
        }
        if (i != 130) {
            return null;
        }
        return FocusDirection.m10315boximpl(FocusDirection.INSTANCE.m10322getDowndhqQ8s());
    }

    @Nullable
    public static final LayoutDirection toLayoutDirection(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }
}
