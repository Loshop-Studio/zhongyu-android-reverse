package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class PressDownGestureKt {

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", m17801f = "PressDownGesture.kt", m17802l = {31, 37}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2 */
    public static final class C18492 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ TapOnPosition $onDown;
        final /* synthetic */ InterfaceC10559a $onUp;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18492(TapOnPosition tapOnPosition, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C18492> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$onDown = tapOnPosition;
            this.$onUp = interfaceC10559a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C18492 c18492 = new C18492(this.$onDown, this.$onUp, interfaceC9324c);
            c18492.L$0 = obj;
            return c18492;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C18492) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r13.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r13.L$1
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r1
                java.lang.Object r4 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r4
                kotlin.AbstractC9079b.m15926b(r14)
                r7 = r13
                goto L64
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r14)
                r7 = r13
                goto L45
            L2c:
                kotlin.AbstractC9079b.m15926b(r14)
                java.lang.Object r14 = r13.L$0
                r4 = r14
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r4
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
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r14
                androidx.compose.foundation.text.input.internal.selection.TapOnPosition r4 = r7.$onDown
                long r5 = r14.m25502getPositionF1C5BW0()
                r4.mo21503onEventk4lQ0M(r5)
                x7.a r4 = r7.$onUp
                if (r4 == 0) goto L94
                r4 = r1
                r1 = r14
            L56:
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r2
                r14 = 0
                java.lang.Object r14 = androidx.compose.p013ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r4, r14, r13, r3, r14)
                if (r14 != r0) goto L64
            L63:
                return r0
            L64:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.p013ui.input.pointer.PointerEvent) r14
                java.util.List r14 = r14.getChanges()
                int r5 = r14.size()
                r6 = 0
            L6f:
                if (r6 >= r5) goto L8f
                java.lang.Object r8 = r14.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
                long r9 = r8.m25500getIdJ3iCeTQ()
                long r11 = r1.m25500getIdJ3iCeTQ()
                boolean r9 = androidx.compose.p013ui.input.pointer.PointerId.m25484equalsimpl0(r9, r11)
                if (r9 == 0) goto L8c
                boolean r8 = r8.getPressed()
                if (r8 == 0) goto L8c
                goto L56
            L8c:
                int r6 = r6 + 1
                goto L6f
            L8f:
                x7.a r14 = r7.$onUp
                r14.invoke()
            L94:
                h7.p r14 = p123h7.C8736p.f16368a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt.C18492.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object detectPressDownGesture(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C18492(tapOnPosition, interfaceC10559a, null), interfaceC9324c);
        return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectPressDownGesture$default(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, InterfaceC10559a interfaceC10559a, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10559a = null;
        }
        return detectPressDownGesture(pointerInputScope, tapOnPosition, interfaceC10559a, interfaceC9324c);
    }
}
