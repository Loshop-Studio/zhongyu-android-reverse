package com.zykj.mistake.feature.review;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.review.ReviewViewModel$loadHome$1", m5303f = "ReviewViewModel.kt", m5304i = {1}, m5305l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 82}, m5306m = "invokeSuspend", m5307n = {"error"}, m5308s = {"L$0"})
@SourceDebugExtension({"SMAP\nReviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewViewModel.kt\ncom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,134:1\n230#2,5:135\n230#2,5:140\n230#2,5:145\n*S KotlinDebug\n*F\n+ 1 ReviewViewModel.kt\ncom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1\n*L\n47#1:135,5\n50#1:140,5\n79#1:145,5\n*E\n"})
/* loaded from: classes3.dex */
final class ReviewViewModel$loadHome$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $studentName;
    Object L$0;
    int label;
    final /* synthetic */ ReviewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$loadHome$1(ReviewViewModel reviewViewModel, String str, InterfaceC5631c<? super ReviewViewModel$loadHome$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = reviewViewModel;
        this.$studentName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new ReviewViewModel$loadHome$1(this.this$0, this.$studentName, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0126, code lost:
    
        if (r3.mo5494q(r29, r4) != r2) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.review.ReviewViewModel$loadHome$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/review/ReviewViewModel$loadHome$1.smali:188
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ReviewViewModel$loadHome$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
