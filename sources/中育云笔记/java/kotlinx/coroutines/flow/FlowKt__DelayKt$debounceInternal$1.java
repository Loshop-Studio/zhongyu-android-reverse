package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m26211f = "Delay.kt", m26212l = {215, 415}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements InterfaceC9545q {

    /* renamed from: c */
    public Object f23626c;

    /* renamed from: d */
    public Object f23627d;

    /* renamed from: e */
    public int f23628e;

    /* renamed from: f */
    public /* synthetic */ Object f23629f;

    /* renamed from: g */
    public /* synthetic */ Object f23630g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC9540l f23631h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC11594c f23632i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(InterfaceC9540l interfaceC9540l, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c) {
        super(3, interfaceC11588c);
        this.f23631h = interfaceC9540l;
        this.f23632i = interfaceC11594c;
    }

    @Override // p181hd.InterfaceC9545q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f23631h, this.f23632i, interfaceC11588c);
        flowKt__DelayKt$debounceInternal$1.f23629f = interfaceC11122i0;
        flowKt__DelayKt$debounceInternal$1.f23630g = interfaceC11595d;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r7.emit(r15, r14) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r7.m20983o(r14) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
      0x00a4: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r5v3 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v2 ud.l) = (r6v4 ud.l), (r6v5 ud.l), (r6v5 ud.l) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r7v2 vd.d) = (r7v4 vd.d), (r7v5 vd.d), (r7v5 vd.d) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
