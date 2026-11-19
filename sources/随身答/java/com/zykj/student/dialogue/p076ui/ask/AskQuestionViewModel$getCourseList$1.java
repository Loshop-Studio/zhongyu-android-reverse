package com.zykj.student.dialogue.p076ui.ask;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.CourseItem;
import com.zykj.student.dialogue.network.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p138i6.AbstractC8137c;
import p158k6.InterfaceC8287g;
import p180m6.C8993e0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.ask.AskQuestionViewModel$getCourseList$1", m13451f = "AskQuestionViewModel.kt", m13452i = {}, m13453l = {29}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAskQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$getCourseList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,61:1\n774#2:62\n865#2,2:63\n230#3,5:65\n*S KotlinDebug\n*F\n+ 1 AskQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$getCourseList$1\n*L\n29#1:62\n29#1:63,2\n30#1:65,5\n*E\n"})
/* loaded from: classes5.dex */
public final class AskQuestionViewModel$getCourseList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10660a;

    /* renamed from: b */
    public final /* synthetic */ AskQuestionViewModel f10661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskQuestionViewModel$getCourseList$1(AskQuestionViewModel askQuestionViewModel, Continuation continuation) {
        super(2, continuation);
        this.f10661b = askQuestionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskQuestionViewModel$getCourseList$1(this.f10661b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listEmptyList;
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f10660a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8287g interfaceC8287g = this.f10661b.dialogueApi;
            this.f10660a = 1;
            obj = interfaceC8287g.m13397m(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) AbstractC8137c.m13043b((BaseResponse) obj);
        if (list != null) {
            listEmptyList = new ArrayList();
            for (Object obj2 : list) {
                CourseItem courseItem = (CourseItem) obj2;
                if (courseItem.getState() == 1 && courseItem.getAllowQuora()) {
                    listEmptyList.add(obj2);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        MutableStateFlow mutableStateFlow = this.f10661b._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C8993e0.m14371b((C8993e0) value, list2, false, null, (CourseItem) CollectionsKt.getOrNull(list2, 0), 6, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AskQuestionViewModel$getCourseList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
