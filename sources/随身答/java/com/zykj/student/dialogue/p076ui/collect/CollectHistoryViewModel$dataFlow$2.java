package com.zykj.student.dialogue.p076ui.collect;

import androidx.paging.PagingData;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m13413d2 = {"Landroidx/paging/PagingData;", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;", "pagingData", "", "Lcom/zykj/student/dialogue/ui/collect/b;", "modifications", "<anonymous>", "(Landroidx/paging/PagingData;Ljava/util/List;)Landroidx/paging/PagingData;"}, m13414k = 3, m13415mv = {2, 2, 0})
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$dataFlow$2", m13451f = "CollectHistoryViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nCollectHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectHistoryViewModel.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1803#2,3:133\n*S KotlinDebug\n*F\n+ 1 CollectHistoryViewModel.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2\n*L\n74#1:133,3\n*E\n"})
/* loaded from: classes5.dex */
public final class CollectHistoryViewModel$dataFlow$2 extends SuspendLambda implements Function3<PagingData<CollectSession>, List<? extends AbstractC7494b>, Continuation<? super PagingData<CollectSession>>, Object> {

    /* renamed from: a */
    public int f10753a;

    /* renamed from: b */
    public /* synthetic */ Object f10754b;

    /* renamed from: c */
    public /* synthetic */ Object f10755c;

    /* renamed from: d */
    public final /* synthetic */ CollectHistoryViewModel f10756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectHistoryViewModel$dataFlow$2(CollectHistoryViewModel collectHistoryViewModel, Continuation continuation) {
        super(3, continuation);
        this.f10756d = collectHistoryViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PagingData pagingData, List list, Continuation continuation) {
        CollectHistoryViewModel$dataFlow$2 collectHistoryViewModel$dataFlow$2 = new CollectHistoryViewModel$dataFlow$2(this.f10756d, continuation);
        collectHistoryViewModel$dataFlow$2.f10754b = pagingData;
        collectHistoryViewModel$dataFlow$2.f10755c = list;
        return collectHistoryViewModel$dataFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PagingData pagingDataM10115o = (PagingData) this.f10754b;
        List list = (List) this.f10755c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10753a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CollectHistoryViewModel collectHistoryViewModel = this.f10756d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pagingDataM10115o = collectHistoryViewModel.m10115o(pagingDataM10115o, (AbstractC7494b) it.next());
        }
        return pagingDataM10115o;
    }
}
