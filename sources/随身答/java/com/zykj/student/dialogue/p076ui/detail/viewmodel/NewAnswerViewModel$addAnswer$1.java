package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$addAnswer$1", m13451f = "NewAnswerViewModel.kt", m13452i = {0, 1, 1, 2, 2, 3, 3}, m13453l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL, PatchStatus.CODE_LOAD_SOPHIX_VERSION, PatchStatus.CODE_LOAD_JIT_CLEAR, PatchStatus.CODE_LOAD_HANDLE_DEX}, m13454m = "invokeSuspend", m13455n = {"$i$a$-runCatching-NewAnswerViewModel$addAnswer$1$1", "it", "$i$a$-onSuccess-NewAnswerViewModel$addAnswer$1$2", "it", "$i$a$-onSuccess-NewAnswerViewModel$addAnswer$1$2", "it", "$i$a$-onFailure-NewAnswerViewModel$addAnswer$1$3"}, m13456s = {"I$0", "L$1", "I$0", "L$1", "I$0", "L$1", "I$0"})
/* loaded from: classes5.dex */
public final class NewAnswerViewModel$addAnswer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11206a;

    /* renamed from: b */
    public Object f11207b;

    /* renamed from: c */
    public Object f11208c;

    /* renamed from: d */
    public int f11209d;

    /* renamed from: e */
    public final /* synthetic */ NewAnswerViewModel f11210e;

    /* renamed from: f */
    public final /* synthetic */ String f11211f;

    /* renamed from: g */
    public final /* synthetic */ String f11212g;

    /* renamed from: h */
    public final /* synthetic */ String f11213h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAnswerViewModel$addAnswer$1(NewAnswerViewModel newAnswerViewModel, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f11210e = newAnswerViewModel;
        this.f11211f = str;
        this.f11212g = str2;
        this.f11213h = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewAnswerViewModel$addAnswer$1(this.f11210e, this.f11211f, this.f11212g, this.f11213h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r11.emit(r4, r10) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f11209d
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 == r5) goto L26
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r0 = r10.f11208c
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lda
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            java.lang.Object r1 = r10.f11208c
            com.zykj.student.dialogue.network.BaseResponse r1 = (com.zykj.student.dialogue.network.BaseResponse) r1
            java.lang.Object r1 = r10.f11207b
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb6
        L31:
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L35
            goto L59
        L35:
            r11 = move-exception
            goto L61
        L37:
            kotlin.ResultKt.throwOnFailure(r11)
            com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel r11 = r10.f11210e
            java.lang.String r1 = r10.f11211f
            java.lang.String r7 = r10.f11212g
            java.lang.String r8 = r10.f11213h
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L35
            k6.g r11 = com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel.m10487m(r11)     // Catch: java.lang.Throwable -> L35
            com.zykj.student.dialogue.bean.req.AddMessageReq r9 = new com.zykj.student.dialogue.bean.req.AddMessageReq     // Catch: java.lang.Throwable -> L35
            r9.<init>(r1, r7, r8)     // Catch: java.lang.Throwable -> L35
            r10.f11206a = r6     // Catch: java.lang.Throwable -> L35
            r10.f11209d = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r11 = r11.m13388d(r9, r10)     // Catch: java.lang.Throwable -> L35
            if (r11 != r0) goto L59
            goto Ld9
        L59:
            com.zykj.student.dialogue.network.BaseResponse r11 = (com.zykj.student.dialogue.network.BaseResponse) r11     // Catch: java.lang.Throwable -> L35
            java.lang.Object r11 = kotlin.Result.m24758constructorimpl(r11)     // Catch: java.lang.Throwable -> L35
        L5f:
            r1 = r11
            goto L6c
        L61:
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r11 = kotlin.Result.m24758constructorimpl(r11)
            goto L5f
        L6c:
            com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel r11 = r10.f11210e
            boolean r7 = kotlin.Result.m24765isSuccessimpl(r1)
            if (r7 == 0) goto Lb6
            r7 = r1
            com.zykj.student.dialogue.network.BaseResponse r7 = (com.zykj.student.dialogue.network.BaseResponse) r7
            boolean r8 = r7.getSuccess()
            r9 = 0
            if (r8 == 0) goto L9a
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel.m10488n(r11)
            com.zykj.student.dialogue.ui.detail.viewmodel.c$a r3 = new com.zykj.student.dialogue.ui.detail.viewmodel.c$a
            r3.<init>(r4, r9, r5, r9)
            r10.f11207b = r1
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r10.f11208c = r4
            r10.f11206a = r6
            r10.f11209d = r5
            java.lang.Object r11 = r11.emit(r3, r10)
            if (r11 != r0) goto Lb6
            goto Ld9
        L9a:
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel.m10488n(r11)
            com.zykj.student.dialogue.ui.detail.viewmodel.c$a r4 = new com.zykj.student.dialogue.ui.detail.viewmodel.c$a
            r4.<init>(r6, r9, r5, r9)
            r10.f11207b = r1
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r10.f11208c = r5
            r10.f11206a = r6
            r10.f11209d = r3
            java.lang.Object r11 = r11.emit(r4, r10)
            if (r11 != r0) goto Lb6
            goto Ld9
        Lb6:
            com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel r11 = r10.f11210e
            java.lang.Throwable r3 = kotlin.Result.m24761exceptionOrNullimpl(r1)
            if (r3 == 0) goto Lda
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel.m10488n(r11)
            com.zykj.student.dialogue.ui.detail.viewmodel.c$a r4 = new com.zykj.student.dialogue.ui.detail.viewmodel.c$a
            r4.<init>(r6, r3)
            r10.f11207b = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r10.f11208c = r1
            r10.f11206a = r6
            r10.f11209d = r2
            java.lang.Object r11 = r11.emit(r4, r10)
            if (r11 != r0) goto Lda
        Ld9:
            return r0
        Lda:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel$addAnswer$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1.smali:184
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NewAnswerViewModel$addAnswer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
