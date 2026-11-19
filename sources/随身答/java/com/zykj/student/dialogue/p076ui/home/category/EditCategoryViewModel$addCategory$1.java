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
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$addCategory$1", m13451f = "EditCategoryViewModel.kt", m13452i = {0}, m13453l = {102}, m13454m = "invokeSuspend", m13455n = {"it"}, m13456s = {"L$0"})
/* loaded from: classes5.dex */
public final class EditCategoryViewModel$addCategory$1 extends SuspendLambda implements Function3<CoroutineScope, Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11776a;

    /* renamed from: b */
    public /* synthetic */ Object f11777b;

    /* renamed from: c */
    public final /* synthetic */ EditCategoryViewModel f11778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCategoryViewModel$addCategory$1(EditCategoryViewModel editCategoryViewModel, Continuation continuation) {
        super(3, continuation);
        this.f11778c = editCategoryViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, Throwable th, Continuation continuation) {
        EditCategoryViewModel$addCategory$1 editCategoryViewModel$addCategory$1 = new EditCategoryViewModel$addCategory$1(this.f11778c, continuation);
        editCategoryViewModel$addCategory$1.f11777b = th;
        return editCategoryViewModel$addCategory$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.f11777b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11776a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.f11778c._categoryResultEvent;
            AbstractC7619a.a aVar = new AbstractC7619a.a(false);
            this.f11777b = th;
            this.f11776a = 1;
            if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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
