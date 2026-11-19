package androidx.compose.p014ui.focus;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class FocusTargetModifierNodeKt {

    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNodeKt$FocusTargetModifierNode$1 */
    public /* synthetic */ class C27031 extends FunctionReferenceImpl implements InterfaceC9540l {
        public C27031(Object obj) {
            super(1, obj, InvalidateSemantics.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusTargetNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(FocusTargetNode focusTargetNode) {
            ((InvalidateSemantics) this.receiver).onDispatchEventsCompleted(focusTargetNode);
        }
    }

    @InterfaceC10770a
    public static final /* synthetic */ FocusTargetModifierNode FocusTargetModifierNode() {
        return new FocusTargetNode(0, null, new C27031(InvalidateSemantics.INSTANCE), 3, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m30551FocusTargetModifierNodePYyLHbc(int i10, InterfaceC9544p interfaceC9544p) {
        return new FocusTargetNode(i10, interfaceC9544p, null, 4, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m30552FocusTargetModifierNodePYyLHbc$default(int i10, InterfaceC9544p interfaceC9544p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Focusability.Companion.m30573getAlwaysLCbbffg();
        }
        if ((i11 & 2) != 0) {
            interfaceC9544p = null;
        }
        return m30551FocusTargetModifierNodePYyLHbc(i10, interfaceC9544p);
    }
}
