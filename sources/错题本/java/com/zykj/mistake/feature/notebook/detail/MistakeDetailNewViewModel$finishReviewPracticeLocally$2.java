package com.zykj.mistake.feature.notebook.detail;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$finishReviewPracticeLocally$2", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {1231, 1236}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$finishReviewPracticeLocally$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $hasVisibleDialog;
    final /* synthetic */ boolean $refreshNotebook;
    final /* synthetic */ boolean $refreshReviewHome;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$finishReviewPracticeLocally$2(boolean z8, boolean z9, MistakeDetailNewViewModel mistakeDetailNewViewModel, boolean z10, InterfaceC5631c<? super MistakeDetailNewViewModel$finishReviewPracticeLocally$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$hasVisibleDialog = z8;
        this.$refreshReviewHome = z9;
        this.this$0 = mistakeDetailNewViewModel;
        this.$refreshNotebook = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$finishReviewPracticeLocally$2(this.$hasVisibleDialog, this.$refreshReviewHome, this.this$0, this.$refreshNotebook, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r1.mo5494q(r6, r3) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.AbstractC5774b.m5119b(r7)
            goto L63
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.AbstractC5774b.m5119b(r7)
            goto L2e
        L1c:
            kotlin.AbstractC5774b.m5119b(r7)
            boolean r7 = r6.$hasVisibleDialog
            if (r7 == 0) goto L2e
            r6.label = r3
            r3 = 16
            java.lang.Object r7 = kotlinx.coroutines.AbstractC6014x.m5638i(r3, r6)
            if (r7 != r0) goto L2e
            goto L62
        L2e:
            boolean r7 = r6.$refreshReviewHome
            if (r7 == 0) goto L39
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r7 = r6.this$0
            com.zykj.mistake.feature.notebook.detail.f1 r1 = com.zykj.mistake.feature.notebook.detail.C4793f1.f6986a
            r7.m4144S(r1)
        L39:
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r7 = r6.this$0
            kotlinx.coroutines.channels.b r1 = r7.f6878g
            com.zykj.mistake.feature.notebook.detail.r0 r3 = new com.zykj.mistake.feature.notebook.detail.r0
            boolean r4 = r6.$refreshNotebook
            kotlinx.coroutines.flow.n0 r7 = r7.f6876e
            java.lang.Object r7 = r7.getValue()
            com.zykj.mistake.feature.notebook.detail.m3 r7 = (com.zykj.mistake.feature.notebook.detail.C4837m3) r7
            java.lang.Integer r7 = r7.f7183x
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r5 = r6.this$0
            kotlinx.coroutines.flow.n0 r5 = r5.f6876e
            java.lang.Object r5 = r5.getValue()
            com.zykj.mistake.feature.notebook.detail.m3 r5 = (com.zykj.mistake.feature.notebook.detail.C4837m3) r5
            boolean r5 = r5.f7184y
            r3.<init>(r4, r7, r5)
            r6.label = r2
            java.lang.Object r7 = r1.mo5494q(r6, r3)
            if (r7 != r0) goto L63
        L62:
            return r0
        L63:
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$finishReviewPracticeLocally$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$finishReviewPracticeLocally$2.smali:197
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$finishReviewPracticeLocally$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
