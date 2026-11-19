package com.zykj.student.dialogue.p076ui.home.category;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$sortCategory$1", m13451f = "EditCategoryViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class EditCategoryViewModel$sortCategory$1 extends SuspendLambda implements Function3<CoroutineScope, Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11794a;

    /* renamed from: b */
    public final /* synthetic */ EditCategoryViewModel f11795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCategoryViewModel$sortCategory$1(EditCategoryViewModel editCategoryViewModel, Continuation continuation) {
        super(3, continuation);
        this.f11795b = editCategoryViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, Throwable th, Continuation continuation) {
        return new EditCategoryViewModel$sortCategory$1(this.f11795b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11794a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f11795b.m10947t();
        return Unit.INSTANCE;
    }
}
