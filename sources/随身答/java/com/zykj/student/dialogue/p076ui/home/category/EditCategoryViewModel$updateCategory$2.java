package com.zykj.student.dialogue.p076ui.home.category;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$updateCategory$2", m13451f = "EditCategoryViewModel.kt", m13452i = {}, m13453l = {59, LockFreeTaskQueueCore.CLOSED_SHIFT}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class EditCategoryViewModel$updateCategory$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11802a;

    /* renamed from: b */
    public final /* synthetic */ EditCategoryViewModel f11803b;

    /* renamed from: c */
    public final /* synthetic */ long f11804c;

    /* renamed from: d */
    public final /* synthetic */ String f11805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCategoryViewModel$updateCategory$2(EditCategoryViewModel editCategoryViewModel, long j9, String str, Continuation continuation) {
        super(2, continuation);
        this.f11803b = editCategoryViewModel;
        this.f11804c = j9;
        this.f11805d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditCategoryViewModel$updateCategory$2(this.f11803b, this.f11804c, this.f11805d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f11802a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r8)
            goto L57
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L39
        L1e:
            kotlin.ResultKt.throwOnFailure(r8)
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel r8 = r7.f11803b
            k6.g r8 = com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel.m10935m(r8)
            com.zykj.student.dialogue.bean.req.UpdateCategoryReq r1 = new com.zykj.student.dialogue.bean.req.UpdateCategoryReq
            long r4 = r7.f11804c
            java.lang.String r6 = r7.f11805d
            r1.<init>(r4, r6)
            r7.f11802a = r3
            java.lang.Object r8 = r8.m13402r(r1, r7)
            if (r8 != r0) goto L39
            goto L56
        L39:
            com.zykj.student.dialogue.network.BaseResponse r8 = (com.zykj.student.dialogue.network.BaseResponse) r8
            p138i6.AbstractC8137c.m13043b(r8)
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel r8 = r7.f11803b
            com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel.m10939q(r8, r3)
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel r8 = r7.f11803b
            kotlinx.coroutines.flow.MutableSharedFlow r8 = com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel.m10936n(r8)
            com.zykj.student.dialogue.ui.home.category.a$b r1 = new com.zykj.student.dialogue.ui.home.category.a$b
            r1.<init>(r3)
            r7.f11802a = r2
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L57
        L56:
            return r0
        L57:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel$updateCategory$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2.smali:146
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EditCategoryViewModel$updateCategory$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
