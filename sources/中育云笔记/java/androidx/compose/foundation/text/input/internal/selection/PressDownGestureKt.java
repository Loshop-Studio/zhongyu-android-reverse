package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class PressDownGestureKt {

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", m26211f = "PressDownGesture.kt", m26212l = {31, 37}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2 */
    public static final class C18792 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ TapOnPosition $onDown;
        final /* synthetic */ InterfaceC9529a $onUp;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18792(TapOnPosition tapOnPosition, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C18792> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$onDown = tapOnPosition;
            this.$onUp = interfaceC9529a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C18792 c18792 = new C18792(this.$onDown, this.$onUp, interfaceC11588c);
            c18792.L$0 = obj;
            return c18792;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C18792) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r14 != r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0061 -> B:20:0x0064). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r13.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r13.L$1
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r1
                java.lang.Object r4 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r4
                kotlin.AbstractC9924b.m20071b(r14)
                r7 = r13
                goto L64
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r14)
                r7 = r13
                goto L45
            L2c:
                kotlin.AbstractC9924b.m20071b(r14)
                java.lang.Object r14 = r13.L$0
                r4 = r14
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r4
                r13.L$0 = r4
                r13.label = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r13
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r14 != r0) goto L44
                goto L63
            L44:
                r1 = r4
            L45:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r14
                androidx.compose.foundation.text.input.internal.selection.TapOnPosition r4 = r7.$onDown
                long r5 = r14.m32104getPositionF1C5BW0()
                r4.mo28105onEventk4lQ0M(r5)
                hd.a r4 = r7.$onUp
                if (r4 == 0) goto L97
                r4 = r1
                r1 = r14
            L56:
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r2
                r14 = 0
                java.lang.Object r14 = androidx.compose.p014ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r4, r14, r13, r3, r14)
                if (r14 != r0) goto L64
            L63:
                return r0
            L64:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.p014ui.input.pointer.PointerEvent) r14
                java.util.List r14 = r14.getChanges()
                r5 = r14
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
            L72:
                if (r6 >= r5) goto L92
                java.lang.Object r8 = r14.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
                long r9 = r8.m32102getIdJ3iCeTQ()
                long r11 = r1.m32102getIdJ3iCeTQ()
                boolean r9 = androidx.compose.p014ui.input.pointer.PointerId.m32086equalsimpl0(r9, r11)
                if (r9 == 0) goto L8f
                boolean r8 = r8.getPressed()
                if (r8 == 0) goto L8f
                goto L56
            L8f:
                int r6 = r6 + 1
                goto L72
            L92:
                hd.a r14 = r7.$onUp
                r14.invoke()
            L97:
                qc.q r14 = p309qc.C10786q.f26013a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt.C18792.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object detectPressDownGesture(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C18792(tapOnPosition, interfaceC9529a, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectPressDownGesture$default(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, InterfaceC9529a interfaceC9529a, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9529a = null;
        }
        return detectPressDownGesture(pointerInputScope, tapOnPosition, interfaceC9529a, interfaceC11588c);
    }
}
