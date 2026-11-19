package com.zykj.student.dialogue.p076ui.home.category;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.student.dialogue.bean.req.SortCatalogReq;
import com.zykj.student.dialogue.network.BaseResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p138i6.AbstractC8137c;
import p158k6.InterfaceC8287g;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$sortCategory$2", m13451f = "EditCategoryViewModel.kt", m13452i = {}, m13453l = {94}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class EditCategoryViewModel$sortCategory$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11796a;

    /* renamed from: b */
    public final /* synthetic */ EditCategoryViewModel f11797b;

    /* renamed from: c */
    public final /* synthetic */ List f11798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCategoryViewModel$sortCategory$2(EditCategoryViewModel editCategoryViewModel, List list, Continuation continuation) {
        super(2, continuation);
        this.f11797b = editCategoryViewModel;
        this.f11798c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditCategoryViewModel$sortCategory$2(this.f11797b, this.f11798c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11796a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8287g interfaceC8287g = this.f11797b.dialogueApi;
            List<SortCatalogReq> list = this.f11798c;
            this.f11796a = 1;
            obj = interfaceC8287g.m13405u(list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC8137c.m13043b((BaseResponse) obj);
        this.f11797b.tabChanged = true;
        this.f11797b.m10947t();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EditCategoryViewModel$sortCategory$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
