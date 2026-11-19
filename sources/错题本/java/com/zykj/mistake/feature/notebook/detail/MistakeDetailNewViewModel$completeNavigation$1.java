package com.zykj.mistake.feature.notebook.detail;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$completeNavigation$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4}, m5305l = {447, 453, 472, 483, 496}, m5306m = "invokeSuspend", m5307n = {"loadingShownForDraft", "isReviewPractice", "draftSync", "loadingShownForDraft", "isReviewPractice", "loadingShownForDraft", "isReviewPractice", "loadingShownForDraft", "isReviewPractice", "loadingVisible", "loadingShownForDraft", "isReviewPractice", "loadingVisible"}, m5308s = {"I$0", "Z$0", "L$0", "I$0", "Z$0", "I$0", "Z$0", "I$0", "Z$0", "I$1", "I$0", "Z$0", "I$1"})
@SourceDebugExtension({"SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2474:1\n230#2,5:2475\n230#2,5:2480\n1#3:2485\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1\n*L\n451#1:2475,5\n463#1:2480,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$completeNavigation$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MistakeDetailNewContract$DraftNavigation $navigation;
    final /* synthetic */ boolean $skipDraftSync;
    int I$0;
    int I$1;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$completeNavigation$1(MistakeDetailNewViewModel mistakeDetailNewViewModel, boolean z8, MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation, InterfaceC5631c<? super MistakeDetailNewViewModel$completeNavigation$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$skipDraftSync = z8;
        this.$navigation = mistakeDetailNewContract$DraftNavigation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$completeNavigation$1(this.this$0, this.$skipDraftSync, this.$navigation, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0592, code lost:
    
        if (r0 == r2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0609, code lost:
    
        if (r4.mo5494q(r85, r5) == r2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
    
        r12 = r13;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f1, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01fd, code lost:
    
        r0 = "草稿上传失败，请检查网络后重试";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0393, code lost:
    
        if (r0 == r2) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x034f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r86) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$completeNavigation$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1.smali:244
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$completeNavigation$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
