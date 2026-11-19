package com.zykj.student.dialogue.p076ui.ask;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.CollectSession;
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
import p180m6.C9005k0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.ask.SearchQuestionViewModel$updateLocalCollectState$1", m13451f = "SearchQuestionViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nSearchQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n230#2,3:111\n233#2,2:118\n1563#3:114\n1634#3,3:115\n*S KotlinDebug\n*F\n+ 1 SearchQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1\n*L\n85#1:111,3\n85#1:118,2\n86#1:114\n86#1:115,3\n*E\n"})
/* loaded from: classes5.dex */
public final class SearchQuestionViewModel$updateLocalCollectState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10685a;

    /* renamed from: b */
    public final /* synthetic */ SearchQuestionViewModel f10686b;

    /* renamed from: c */
    public final /* synthetic */ String f10687c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchQuestionViewModel$updateLocalCollectState$1(SearchQuestionViewModel searchQuestionViewModel, String str, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f10686b = searchQuestionViewModel;
        this.f10687c = str;
        this.f10688d = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchQuestionViewModel$updateLocalCollectState$1(this.f10686b, this.f10687c, this.f10688d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        C9005k0 c9005k0;
        ArrayList arrayList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10685a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f10686b._uiState;
        String str2 = this.f10687c;
        boolean z9 = this.f10688d;
        while (true) {
            Object value = mutableStateFlow.getValue();
            C9005k0 c9005k02 = (C9005k0) value;
            Result.Companion companion = Result.INSTANCE;
            Object objM14381b = c9005k02.m14381b();
            List listEmptyList = CollectionsKt.emptyList();
            if (Result.m24764isFailureimpl(objM14381b)) {
                objM14381b = listEmptyList;
            }
            Iterable<CollectSession> iterable = (Iterable) objM14381b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (CollectSession collectSessionCopy$default : iterable) {
                if (Intrinsics.areEqual(collectSessionCopy$default.getId(), str2)) {
                    arrayList = arrayList2;
                    obj2 = value;
                    str = str2;
                    c9005k0 = c9005k02;
                    collectSessionCopy$default = CollectSession.copy$default(collectSessionCopy$default, null, null, null, null, null, null, null, null, null, z9, null, 1535, null);
                } else {
                    str = str2;
                    obj2 = value;
                    c9005k0 = c9005k02;
                    arrayList = arrayList2;
                }
                arrayList.add(collectSessionCopy$default);
                arrayList2 = arrayList;
                c9005k02 = c9005k0;
                str2 = str;
                value = obj2;
            }
            String str3 = str2;
            if (mutableStateFlow.compareAndSet(value, c9005k02.m14380a(Result.m24758constructorimpl(arrayList2)))) {
                return Unit.INSTANCE;
            }
            str2 = str3;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SearchQuestionViewModel$updateLocalCollectState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
