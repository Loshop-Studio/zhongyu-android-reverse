package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p014ui.focus.FocusEventModifierNode;
import androidx.compose.p014ui.focus.FocusRequesterModifierNode;
import androidx.compose.p014ui.focus.FocusState;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private boolean focused;
    private InterfaceC9529a onHandwritingSlopExceeded;
    private final SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", m26211f = "StylusHandwriting.kt", m26212l = {PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX, PatchStatus.CODE_LOAD_LIB_JSON, 171}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 */
        public static final class C17651 extends RestrictedSuspendLambda implements InterfaceC9544p {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ StylusHandwritingNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17651(StylusHandwritingNode stylusHandwritingNode, InterfaceC11588c<? super C17651> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = stylusHandwritingNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                C17651 c17651 = new C17651(this.this$0, interfaceC11588c);
                c17651.L$0 = obj;
                return c17651;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((C17651) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
            
                if (r9 != r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01a6, code lost:
            
                if (r5 != r1) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:42:0x00f8). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a6 -> B:75:0x01a9). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.C17651.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C17651(this.this$0, null), interfaceC11588c);
            return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
        }
    }));

    public StylusHandwritingNode(InterfaceC9529a interfaceC9529a) {
        this.onHandwritingSlopExceeded = interfaceC9529a;
    }

    public final InterfaceC9529a getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo27932getTouchBoundsExpansionRZrCHBk() {
        return StylusHandwritingKt.getHandwritingBoundsExpansion().m32392roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this));
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.suspendingPointerInputModifierNode.onCancelPointerInput();
    }

    @Override // androidx.compose.p014ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.focused = focusState.isFocused();
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        this.suspendingPointerInputModifierNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
    }

    public final void resetPointerInputHandler() {
        this.suspendingPointerInputModifierNode.resetPointerInputHandler();
    }

    public final void setOnHandwritingSlopExceeded(InterfaceC9529a interfaceC9529a) {
        this.onHandwritingSlopExceeded = interfaceC9529a;
    }
}
