package androidx.compose.p011ui.focus;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001aX\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032:\b\u0002\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "FocusTargetModifierNode", "()Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/Focusability;", "focusability", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "previous", "current", "Ld6/s;", "onFocusChange", "FocusTargetModifierNode-PYyLHbc", "(ILr6/e;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FocusTargetModifierNodeKt {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNodeKt$FocusTargetModifierNode$1 */
    public /* synthetic */ class C21001 extends FunctionReferenceImpl implements InterfaceC6471c {
        public C21001(Object obj) {
            super(1, obj, InvalidateSemantics.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusTargetNode) obj);
            return C5443s.f8405a;
        }

        public final void invoke(FocusTargetNode focusTargetNode) {
            ((InvalidateSemantics) this.receiver).onDispatchEventsCompleted(focusTargetNode);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the other overload with added parameters for focusability and onFocusChange")
    public static final /* synthetic */ FocusTargetModifierNode FocusTargetModifierNode() {
        return new FocusTargetNode(0, null, new C21001(InvalidateSemantics.INSTANCE), 3, null);
    }

    @NotNull
    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m10355FocusTargetModifierNodePYyLHbc(int i, @Nullable InterfaceC6473e interfaceC6473e) {
        return new FocusTargetNode(i, interfaceC6473e, null, 4, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m10356FocusTargetModifierNodePYyLHbc$default(int i, InterfaceC6473e interfaceC6473e, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = Focusability.INSTANCE.m10377getAlwaysLCbbffg();
        }
        if ((i8 & 2) != 0) {
            interfaceC6473e = null;
        }
        return m10355FocusTargetModifierNodePYyLHbc(i, interfaceC6473e);
    }
}
