package com.zykj.student.dialogue.p076ui.ask;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.student.dialogue.bean.req.CollectReq;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.network.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p128h6.AbstractC8103b;
import p138i6.AbstractC8137c;
import p158k6.InterfaceC8287g;
import p180m6.C9005k0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.ask.SearchQuestionViewModel$changeCollect$1", m13451f = "SearchQuestionViewModel.kt", m13452i = {0}, m13453l = {40}, m13454m = "invokeSuspend", m13455n = {"isCollectNow"}, m13456s = {"I$0"})
@SourceDebugExtension({"SMAP\nSearchQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n230#2,3:111\n233#2,2:118\n1563#3:114\n1634#3,3:115\n*S KotlinDebug\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1\n*L\n43#1:111,3\n43#1:118,2\n44#1:114\n44#1:115,3\n*E\n"})
/* loaded from: classes5.dex */
public final class SearchQuestionViewModel$changeCollect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10678a;

    /* renamed from: b */
    public int f10679b;

    /* renamed from: c */
    public final /* synthetic */ CollectSession f10680c;

    /* renamed from: d */
    public final /* synthetic */ SearchQuestionViewModel f10681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchQuestionViewModel$changeCollect$1(CollectSession collectSession, SearchQuestionViewModel searchQuestionViewModel, Continuation continuation) {
        super(2, continuation);
        this.f10680c = collectSession;
        this.f10681d = searchQuestionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchQuestionViewModel$changeCollect$1(this.f10680c, this.f10681d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object objM13390f;
        int i9;
        Object value;
        C9005k0 c9005k0;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10679b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z9 = !this.f10680c.isCollect();
            InterfaceC8287g interfaceC8287g = this.f10681d.dialogueApi;
            CollectReq collectReq = new CollectReq(this.f10680c.getId(), z9);
            this.f10678a = z9 ? 1 : 0;
            this.f10679b = 1;
            objM13390f = interfaceC8287g.m13390f(collectReq, this);
            if (objM13390f == coroutine_suspended) {
                return coroutine_suspended;
            }
            i9 = z9 ? 1 : 0;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = this.f10678a;
            ResultKt.throwOnFailure(obj);
            objM13390f = obj;
        }
        AbstractC8137c.m13043b((BaseResponse) objM13390f);
        this.f10681d.m9922g(new AbstractC8103b.a.b(this.f10680c.isCollect() ? "取消收藏成功" : "收藏成功"));
        MutableStateFlow mutableStateFlow = this.f10681d._uiState;
        CollectSession collectSession = this.f10680c;
        do {
            value = mutableStateFlow.getValue();
            c9005k0 = (C9005k0) value;
            Result.Companion companion = Result.INSTANCE;
            Object objM14381b = c9005k0.m14381b();
            List listEmptyList = CollectionsKt.emptyList();
            if (Result.m24764isFailureimpl(objM14381b)) {
                objM14381b = listEmptyList;
            }
            Iterable<CollectSession> iterable = (Iterable) objM14381b;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (CollectSession collectSessionCopy$default : iterable) {
                if (Intrinsics.areEqual(collectSessionCopy$default.getId(), collectSession.getId())) {
                    collectSessionCopy$default = CollectSession.copy$default(collectSessionCopy$default, null, null, null, null, null, null, null, null, null, i9 != 0, null, 1535, null);
                }
                arrayList.add(collectSessionCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, c9005k0.m14380a(Result.m24758constructorimpl(arrayList))));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SearchQuestionViewModel$changeCollect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
