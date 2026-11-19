package com.zykj.mistake.feature.notebook.detail;

import com.zykj.mistake.feature.review.ReviewContract$PracticePoolType;
import com.zykj.mistake.feature.review.ReviewContract$PracticeScene;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$startInitialReviewPractice$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {0, 0, 0, 1, 1, 1}, m5305l = {733, 735}, m5306m = "invokeSuspend", m5307n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-MistakeDetailNewViewModel$startInitialReviewPractice$1$round$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-MistakeDetailNewViewModel$startInitialReviewPractice$1$round$1"}, m5308s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$startInitialReviewPractice$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ ReviewContract$PracticePoolType $poolType;
    final /* synthetic */ ReviewContract$PracticeScene $scene;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$startInitialReviewPractice$1(MistakeDetailNewViewModel mistakeDetailNewViewModel, ReviewContract$PracticeScene reviewContract$PracticeScene, ReviewContract$PracticePoolType reviewContract$PracticePoolType, InterfaceC5631c<? super MistakeDetailNewViewModel$startInitialReviewPractice$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$scene = reviewContract$PracticeScene;
        this.$poolType = reviewContract$PracticePoolType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        MistakeDetailNewViewModel$startInitialReviewPractice$1 mistakeDetailNewViewModel$startInitialReviewPractice$1 = new MistakeDetailNewViewModel$startInitialReviewPractice$1(this.this$0, this.$scene, this.$poolType, interfaceC5631c);
        mistakeDetailNewViewModel$startInitialReviewPractice$1.L$0 = obj;
        return mistakeDetailNewViewModel$startInitialReviewPractice$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (r8 == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$startInitialReviewPractice$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1.smali:216
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$startInitialReviewPractice$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
