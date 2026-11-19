package androidx.compose.p014ui.input.pointer;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", m26211f = "SuspendingPointerInputFilter.kt", m26212l = {717, 719}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends SuspendLambda implements InterfaceC9544p {
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, InterfaceC11588c<? super SuspendingPointerInputModifierNodeImpl$onPointerEvent$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = suspendingPointerInputModifierNodeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.this$0, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.AbstractC9924b.m20071b(r5)
            goto L4b
        L1b:
            kotlin.AbstractC9924b.m20071b(r5)
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r5 = r4.this$0
            hd.p r5 = androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNodeImpl.access$get_deprecatedPointerInputHandler$p(r5)
            if (r5 == 0) goto L3a
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r5 = r4.this$0
            hd.p r5 = androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNodeImpl.access$get_deprecatedPointerInputHandler$p(r5)
            kotlin.jvm.internal.AbstractC9979u.m20291d(r5)
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r1 = r4.this$0
            r4.label = r3
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L4b
            goto L4a
        L3a:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r5 = r4.this$0
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r5.getPointerInputEventHandler()
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r1 = r4.this$0
            r4.label = r2
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L4b
        L4a:
            return r0
        L4b:
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
