package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", m26211f = "SuspendingPointerInputFilter.kt", m26212l = {883, 884}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 */
/* loaded from: classes2.dex */
public final class C2893xf3489d20 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2893xf3489d20(long j10, SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, InterfaceC11588c<? super C2893xf3489d20> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$timeMillis = j10;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C2893xf3489d20(this.$timeMillis, this.this$0, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (kotlinx.coroutines.DelayKt.m20376b(8, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r8.label
            r2 = 8
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            kotlin.AbstractC9924b.m20071b(r9)
            goto L38
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.AbstractC9924b.m20071b(r9)
            goto L2f
        L20:
            kotlin.AbstractC9924b.m20071b(r9)
            long r6 = r8.$timeMillis
            long r6 = r6 - r2
            r8.label = r5
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.m20376b(r6, r8)
            if (r9 != r0) goto L2f
            goto L37
        L2f:
            r8.label = r4
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.m20376b(r2, r8)
            if (r9 != r0) goto L38
        L37:
            return r0
        L38:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<R> r9 = r8.this$0
            sd.j r9 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.access$getPointerAwaiter$p(r9)
            if (r9 == 0) goto L54
            kotlin.Result$a r0 = kotlin.Result.f23263d
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            long r1 = r8.$timeMillis
            r0.<init>(r1)
            java.lang.Object r0 = kotlin.AbstractC9924b.m20070a(r0)
            java.lang.Object r0 = kotlin.Result.m20054c(r0)
            r9.resumeWith(r0)
        L54:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.input.pointer.C2893xf3489d20.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C2893xf3489d20) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
