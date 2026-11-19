package androidx.compose.p013ui.focus;

import androidx.autofill.HintConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001aX\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032:\b\u0002\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m13558d2 = {"FocusTargetModifierNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "focusability", "Landroidx/compose/ui/focus/Focusability;", "onFocusChange", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "previous", "current", "", "FocusTargetModifierNode-PYyLHbc", "(ILkotlin/jvm/functions/Function2;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class FocusTargetModifierNodeKt {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNodeKt$FocusTargetModifierNode$1 */
    public /* synthetic */ class C26441 extends FunctionReferenceImpl implements Function1<FocusTargetNode, Unit> {
        public C26441(Object obj) {
            super(1, obj, InvalidateSemantics.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusTargetNode focusTargetNode) {
            invoke2(focusTargetNode);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusTargetNode focusTargetNode) {
            ((InvalidateSemantics) this.receiver).onDispatchEventsCompleted(focusTargetNode);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the other overload with added parameters for focusability and onFocusChange")
    public static final /* synthetic */ FocusTargetModifierNode FocusTargetModifierNode() {
        return new FocusTargetNode(0, null, new C26441(InvalidateSemantics.INSTANCE), 3, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m20652FocusTargetModifierNodePYyLHbc(int i10, Function2<? super FocusState, ? super FocusState, Unit> function2) {
        return new FocusTargetNode(i10, function2, null, 4, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m20653FocusTargetModifierNodePYyLHbc$default(int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Focusability.INSTANCE.m20671getAlwaysLCbbffg();
        }
        if ((i11 & 2) != 0) {
            function2 = null;
        }
        return m20652FocusTargetModifierNodePYyLHbc(i10, function2);
    }
}
