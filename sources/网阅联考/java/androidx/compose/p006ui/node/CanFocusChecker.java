package androidx.compose.p006ui.node;

import androidx.compose.p006ui.focus.FocusProperties;
import androidx.compose.p006ui.focus.FocusRequester;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(m5174d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, m5175d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "()V", "value", "", "canFocus", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocusValue", "Ljava/lang/Boolean;", "isCanFocusSet", "reset", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class CanFocusChecker implements FocusProperties {
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getDown() {
        return FocusProperties.CC.m329a(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getEnd() {
        return FocusProperties.CC.m330b(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ Function1 getEnter() {
        return FocusProperties.CC.m331c(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ Function1 getExit() {
        return FocusProperties.CC.m332d(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getLeft() {
        return FocusProperties.CC.m333e(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getNext() {
        return FocusProperties.CC.m334f(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getPrevious() {
        return FocusProperties.CC.m335g(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getRight() {
        return FocusProperties.CC.m336h(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getStart() {
        return FocusProperties.CC.m337i(this);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getUp() {
        return FocusProperties.CC.m338j(this);
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public void setCanFocus(boolean z3) {
        canFocusValue = Boolean.valueOf(z3);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setDown(FocusRequester focusRequester) {
        FocusProperties.CC.m339k(this, focusRequester);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setEnd(FocusRequester focusRequester) {
        FocusProperties.CC.m340l(this, focusRequester);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setEnter(Function1 function1) {
        FocusProperties.CC.m341m(this, function1);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setExit(Function1 function1) {
        FocusProperties.CC.m342n(this, function1);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setLeft(FocusRequester focusRequester) {
        FocusProperties.CC.m343o(this, focusRequester);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setNext(FocusRequester focusRequester) {
        FocusProperties.CC.m344p(this, focusRequester);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setPrevious(FocusRequester focusRequester) {
        FocusProperties.CC.m345q(this, focusRequester);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setRight(FocusRequester focusRequester) {
        FocusProperties.CC.m346r(this, focusRequester);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setStart(FocusRequester focusRequester) {
        FocusProperties.CC.m347s(this, focusRequester);
    }

    @Override // androidx.compose.p006ui.focus.FocusProperties
    public /* synthetic */ void setUp(FocusRequester focusRequester) {
        FocusProperties.CC.m348t(this, focusRequester);
    }
}
