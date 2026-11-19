package com.zykj.student.dialogue.p076ui.home.category;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$addCategory$2", m13451f = "EditCategoryViewModel.kt", m13452i = {}, m13453l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 111}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class EditCategoryViewModel$addCategory$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11779a;

    /* renamed from: b */
    public final /* synthetic */ EditCategoryViewModel f11780b;

    /* renamed from: c */
    public final /* synthetic */ String f11781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCategoryViewModel$addCategory$2(EditCategoryViewModel editCategoryViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f11780b = editCategoryViewModel;
        this.f11781c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditCategoryViewModel$addCategory$2(this.f11780b, this.f11781c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f11779a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r6)
            goto L55
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L37
        L1e:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel r6 = r5.f11780b
            k6.g r6 = com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel.m10935m(r6)
            com.zykj.student.dialogue.bean.req.AddCategoryReq r1 = new com.zykj.student.dialogue.bean.req.AddCategoryReq
            java.lang.String r4 = r5.f11781c
            r1.<init>(r4)
            r5.f11779a = r3
            java.lang.Object r6 = r6.m13396l(r1, r5)
            if (r6 != r0) goto L37
            goto L54
        L37:
            com.zykj.student.dialogue.network.BaseResponse r6 = (com.zykj.student.dialogue.network.BaseResponse) r6
            p138i6.AbstractC8137c.m13043b(r6)
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel r6 = r5.f11780b
            com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel.m10939q(r6, r3)
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel r6 = r5.f11780b
            kotlinx.coroutines.flow.MutableSharedFlow r6 = com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel.m10936n(r6)
            com.zykj.student.dialogue.ui.home.category.a$a r1 = new com.zykj.student.dialogue.ui.home.category.a$a
            r1.<init>(r3)
            r5.f11779a = r2
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel$addCategory$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$addCategory$2.smali:138
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EditCategoryViewModel$addCategory$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
