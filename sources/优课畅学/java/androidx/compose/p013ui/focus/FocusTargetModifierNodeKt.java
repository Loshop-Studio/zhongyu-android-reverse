package androidx.compose.p013ui.focus;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class FocusTargetModifierNodeKt {

    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNodeKt$FocusTargetModifierNode$1 */
    public /* synthetic */ class C26731 extends FunctionReferenceImpl implements InterfaceC10570l {
        public C26731(Object obj) {
            super(1, obj, InvalidateSemantics.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusTargetNode) obj);
            return C8736p.f16368a;
        }

        public final void invoke(FocusTargetNode focusTargetNode) {
            ((InvalidateSemantics) this.receiver).onDispatchEventsCompleted(focusTargetNode);
        }
    }

    @InterfaceC8721a
    public static final /* synthetic */ FocusTargetModifierNode FocusTargetModifierNode() {
        return new FocusTargetNode(0, null, new C26731(InvalidateSemantics.INSTANCE), 3, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m23949FocusTargetModifierNodePYyLHbc(int i10, InterfaceC10574p interfaceC10574p) {
        return new FocusTargetNode(i10, interfaceC10574p, null, 4, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m23950FocusTargetModifierNodePYyLHbc$default(int i10, InterfaceC10574p interfaceC10574p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Focusability.Companion.m23971getAlwaysLCbbffg();
        }
        if ((i11 & 2) != 0) {
            interfaceC10574p = null;
        }
        return m23949FocusTargetModifierNodePYyLHbc(i10, interfaceC10574p);
    }
}
