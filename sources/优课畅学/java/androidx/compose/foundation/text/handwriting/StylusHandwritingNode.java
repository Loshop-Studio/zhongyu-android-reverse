package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p013ui.focus.FocusEventModifierNode;
import androidx.compose.p013ui.focus.FocusRequesterModifierNode;
import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private boolean focused;
    private InterfaceC10559a onHandwritingSlopExceeded;
    private final SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", m17801f = "StylusHandwriting.kt", m17802l = {TbsListener.ErrorCode.DISK_FULL, 133, 171}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 */
        public static final class C17351 extends RestrictedSuspendLambda implements InterfaceC10574p {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ StylusHandwritingNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17351(StylusHandwritingNode stylusHandwritingNode, InterfaceC9324c<? super C17351> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = stylusHandwritingNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                C17351 c17351 = new C17351(this.this$0, interfaceC9324c);
                c17351.L$0 = obj;
                return c17351;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((C17351) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
            
                if (r9 != r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01a3, code lost:
            
                if (r5 != r1) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01a5, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:42:0x00f8). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a3 -> B:75:0x01a6). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 489
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.C17351.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C17351(this.this$0, null), interfaceC9324c);
            return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
        }
    }));

    public StylusHandwritingNode(InterfaceC10559a interfaceC10559a) {
        this.onHandwritingSlopExceeded = interfaceC10559a;
    }

    public final InterfaceC10559a getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo21330getTouchBoundsExpansionRZrCHBk() {
        return StylusHandwritingKt.getHandwritingBoundsExpansion().m25790roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this));
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.suspendingPointerInputModifierNode.onCancelPointerInput();
    }

    @Override // androidx.compose.p013ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.focused = focusState.isFocused();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo20318onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        this.suspendingPointerInputModifierNode.mo20318onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
    }

    public final void resetPointerInputHandler() {
        this.suspendingPointerInputModifierNode.resetPointerInputHandler();
    }

    public final void setOnHandwritingSlopExceeded(InterfaceC10559a interfaceC10559a) {
        this.onHandwritingSlopExceeded = interfaceC10559a;
    }
}
