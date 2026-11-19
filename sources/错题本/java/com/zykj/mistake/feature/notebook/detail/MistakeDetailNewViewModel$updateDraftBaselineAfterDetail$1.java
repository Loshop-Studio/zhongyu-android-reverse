package com.zykj.mistake.feature.notebook.detail;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {0, 1}, m5305l = {635, 635}, m5306m = "invokeSuspend", m5307n = {"localPath", "localPath"}, m5308s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ int $itemId;
    Object L$0;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1(MistakeDetailNewViewModel mistakeDetailNewViewModel, int i, InterfaceC5631c<? super MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$itemId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1(this.this$0, this.$itemId, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r5.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC5774b.m5119b(r6)
            goto L62
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.AbstractC5774b.m5119b(r6)
            goto L43
        L25:
            kotlin.AbstractC5774b.m5119b(r6)
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r6 = r5.this$0
            int r1 = r5.$itemId
            r6.getClass()
            java.lang.String r6 = com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4128v(r1)
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r1 = r5.this$0
            r5.L$0 = r4
            r5.label = r3
            r1.getClass()
            java.lang.Object r6 = com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4129x(r6, r5)
            if (r6 != r0) goto L43
            goto L61
        L43:
            java.io.File r6 = (java.io.File) r6
            if (r6 == 0) goto L65
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r1 = r5.this$0
            int r3 = r5.$itemId
            r5.L$0 = r4
            r5.label = r2
            r1.getClass()
            g7.e r1 = kotlinx.coroutines.AbstractC5896f0.f9343a
            g7.d r1 = p068g7.ExecutorC5608d.f8730a
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$toDraftSignature$2 r2 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$toDraftSignature$2
            r2.<init>(r6, r3, r4)
            java.lang.Object r6 = kotlinx.coroutines.AbstractC6014x.m5626F(r1, r2, r5)
            if (r6 != r0) goto L62
        L61:
            return r0
        L62:
            r4 = r6
            com.zykj.mistake.feature.notebook.detail.d4 r4 = (com.zykj.mistake.feature.notebook.detail.C4784d4) r4
        L65:
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.n0 r6 = r6.f6876e
            java.lang.Object r6 = r6.getValue()
            com.zykj.mistake.feature.notebook.detail.m3 r6 = (com.zykj.mistake.feature.notebook.detail.C4837m3) r6
            int r6 = r6.f7149b
            int r0 = r5.$itemId
            if (r6 != r0) goto L79
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r6 = r5.this$0
            r6.f6874c = r4
        L79:
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1.smali:185
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
