package androidx.compose.foundation;

import androidx.compose.p013ui.focus.FocusState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements Function2<FocusState, FocusState, Unit> {
    public FocusableNode$focusTargetNode$1(Object obj) {
        super(2, obj, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState, FocusState focusState2) {
        invoke2(focusState, focusState2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusState focusState, FocusState focusState2) {
        ((FocusableNode) this.receiver).onFocusStateChange(focusState, focusState2);
    }
}
