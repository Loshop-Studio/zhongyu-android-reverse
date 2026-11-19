package com.zykj.student.dialogue.p076ui.home;

import androidx.paging.PagingData;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
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

@Metadata(m13412d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m13413d2 = {"Landroidx/paging/PagingData;", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "pagingData", "", "Lcom/zykj/student/dialogue/ui/home/p;", "modifications", "<anonymous>", "(Landroidx/paging/PagingData;Ljava/util/List;)Landroidx/paging/PagingData;"}, m13414k = 3, m13415mv = {2, 2, 0})
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$dataFlow$2", m13451f = "HomePagerViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nHomePagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePagerViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomePagerViewModel$dataFlow$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1803#2,3:193\n*S KotlinDebug\n*F\n+ 1 HomePagerViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomePagerViewModel$dataFlow$2\n*L\n91#1:193,3\n*E\n"})
/* loaded from: classes5.dex */
public final class HomePagerViewModel$dataFlow$2 extends SuspendLambda implements Function3<PagingData<QuestionResp>, List<? extends AbstractC7636p>, Continuation<? super PagingData<QuestionResp>>, Object> {

    /* renamed from: a */
    public int f11574a;

    /* renamed from: b */
    public /* synthetic */ Object f11575b;

    /* renamed from: c */
    public /* synthetic */ Object f11576c;

    /* renamed from: d */
    public final /* synthetic */ HomePagerViewModel f11577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$dataFlow$2(HomePagerViewModel homePagerViewModel, Continuation continuation) {
        super(3, continuation);
        this.f11577d = homePagerViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PagingData pagingData, List list, Continuation continuation) {
        HomePagerViewModel$dataFlow$2 homePagerViewModel$dataFlow$2 = new HomePagerViewModel$dataFlow$2(this.f11577d, continuation);
        homePagerViewModel$dataFlow$2.f11575b = pagingData;
        homePagerViewModel$dataFlow$2.f11576c = list;
        return homePagerViewModel$dataFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PagingData pagingDataM10780s = (PagingData) this.f11575b;
        List list = (List) this.f11576c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11574a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HomePagerViewModel homePagerViewModel = this.f11577d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pagingDataM10780s = homePagerViewModel.m10780s(pagingDataM10780s, (AbstractC7636p) it.next());
        }
        return pagingDataM10780s;
    }
}
