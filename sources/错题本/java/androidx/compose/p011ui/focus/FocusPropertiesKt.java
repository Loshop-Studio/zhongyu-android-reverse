package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0002\b\u0005*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u000b\u001a\u00020\b*\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "Landroidx/compose/ui/focus/FocusRequester;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "toUsingEnterExitScope", "(Lr6/c;)Lr6/c;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusProperties;", "scope", "focusProperties", "(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FocusPropertiesKt {
    @NotNull
    public static final Modifier focusProperties(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c) {
        return modifier.then(new FocusPropertiesElement(new C2097xfe8f9d59(interfaceC6471c)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6471c toUsingEnterExitScope(final InterfaceC6471c interfaceC6471c) {
        return new InterfaceC6471c() { // from class: androidx.compose.ui.focus.FocusPropertiesKt.toUsingEnterExitScope.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
                FocusRequester focusRequester = (FocusRequester) interfaceC6471c.invoke(FocusDirection.m10315boximpl(focusEnterExitScope.getRequestedFocusDirection()));
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                if (focusRequester == companion.getCancel()) {
                    focusEnterExitScope.cancelFocusChange();
                } else if (focusRequester != companion.getDefault()) {
                    FocusRequester.m10349requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
            }
        };
    }
}
