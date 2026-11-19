package com.zykj.student.dialogue.p076ui.ask;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.bean.resp.SearchQuestion;
import com.zykj.student.dialogue.network.BaseResponse;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import p180m6.C9005k0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.ask.SearchQuestionViewModel$searchQuestions$1", m13451f = "SearchQuestionViewModel.kt", m13452i = {}, m13453l = {60}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nSearchQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,110:1\n1563#2:111\n1634#2,3:112\n230#3,5:115\n*S KotlinDebug\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1\n*L\n62#1:111\n62#1:112,3\n77#1:115,5\n*E\n"})
/* loaded from: classes5.dex */
public final class SearchQuestionViewModel$searchQuestions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10682a;

    /* renamed from: b */
    public final /* synthetic */ SearchQuestionViewModel f10683b;

    /* renamed from: c */
    public final /* synthetic */ String f10684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchQuestionViewModel$searchQuestions$1(SearchQuestionViewModel searchQuestionViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f10683b = searchQuestionViewModel;
        this.f10684c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchQuestionViewModel$searchQuestions$1(this.f10683b, this.f10684c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f10682a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8287g interfaceC8287g = this.f10683b.dialogueApi;
            Map<String, String> mapMapOf = MapsKt.mapOf(new Pair("imgUrl", this.f10684c));
            this.f10682a = 1;
            obj = interfaceC8287g.m13400p(mapMapOf, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Iterable<SearchQuestion> iterable = (Iterable) AbstractC8137c.m13042a((BaseResponse) obj);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (SearchQuestion searchQuestion : iterable) {
            arrayList.add(new CollectSession(searchQuestion.getCourseId(), searchQuestion.getUpdateTime(), searchQuestion.getSnapshot(), searchQuestion.getSummary(), searchQuestion.getAskUserName(), searchQuestion.getAskUserPhoto(), searchQuestion.getClassName(), searchQuestion.getTopicName(), searchQuestion.getId(), searchQuestion.isCollect(), searchQuestion.getUpdateTime()));
        }
        MutableStateFlow mutableStateFlow = this.f10683b._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((C9005k0) value).m14380a(Result.m24758constructorimpl(arrayList))));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SearchQuestionViewModel$searchQuestions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
