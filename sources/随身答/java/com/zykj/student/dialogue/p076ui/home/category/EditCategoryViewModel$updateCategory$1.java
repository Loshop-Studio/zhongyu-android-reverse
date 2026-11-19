package com.zykj.student.dialogue.p076ui.home.category;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.p076ui.home.category.AbstractC7619a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p138i6.AbstractC8136b;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$updateCategory$1", m13451f = "EditCategoryViewModel.kt", m13452i = {0}, m13453l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m13454m = "invokeSuspend", m13455n = {"it"}, m13456s = {"L$0"})
/* loaded from: classes5.dex */
public final class EditCategoryViewModel$updateCategory$1 extends SuspendLambda implements Function3<CoroutineScope, Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11799a;

    /* renamed from: b */
    public /* synthetic */ Object f11800b;

    /* renamed from: c */
    public final /* synthetic */ EditCategoryViewModel f11801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCategoryViewModel$updateCategory$1(EditCategoryViewModel editCategoryViewModel, Continuation continuation) {
        super(3, continuation);
        this.f11801c = editCategoryViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, Throwable th, Continuation continuation) {
        EditCategoryViewModel$updateCategory$1 editCategoryViewModel$updateCategory$1 = new EditCategoryViewModel$updateCategory$1(this.f11801c, continuation);
        editCategoryViewModel$updateCategory$1.f11800b = th;
        return editCategoryViewModel$updateCategory$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.f11800b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11799a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.f11801c._categoryResultEvent;
            AbstractC7619a.b bVar = new AbstractC7619a.b(false);
            this.f11800b = th;
            this.f11799a = 1;
            if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC8136b.m13039g(th, null, 1, null);
        return Unit.INSTANCE;
    }
}
