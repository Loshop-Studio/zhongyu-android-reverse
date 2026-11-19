package com.zykj.mistake.feature.collection.filter;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.entity.resp.MistakeBookFilterOptionsResp;
import com.zykj.mistake.network.InterfaceC5090c;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p098k4.C5755a;
import p129o2.C6268a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$loadFilterOptions$1", m5303f = "MistakeCollectionFilterResultViewModel.kt", m5304i = {}, m5305l = {394}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeCollectionFilterResultViewModel$loadFilterOptions$1 extends SuspendLambda implements InterfaceC6471c {
    int label;
    final /* synthetic */ MistakeCollectionFilterResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionFilterResultViewModel$loadFilterOptions$1(MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, InterfaceC5631c<? super MistakeCollectionFilterResultViewModel$loadFilterOptions$1> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.this$0 = mistakeCollectionFilterResultViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionFilterResultViewModel$loadFilterOptions$1(this.this$0, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(InterfaceC5631c<? super MistakeBookFilterOptionsResp> interfaceC5631c) {
        return ((MistakeCollectionFilterResultViewModel$loadFilterOptions$1) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj;
        }
        AbstractC5774b.m5119b(obj);
        C6268a c6268a = this.this$0.f6577b;
        this.label = 1;
        Object objM4421m = ((InterfaceC5090c) ((C5755a) c6268a.f10022b).f9107a.invoke()).m4421m(this);
        return objM4421m == coroutineSingletons ? coroutineSingletons : objM4421m;
    }
}
