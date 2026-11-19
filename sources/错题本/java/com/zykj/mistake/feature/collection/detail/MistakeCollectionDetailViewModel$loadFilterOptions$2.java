package com.zykj.mistake.feature.collection.detail;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$loadFilterOptions$2", m5303f = "MistakeCollectionDetailViewModel.kt", m5304i = {}, m5305l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeCollectionDetailViewModel$loadFilterOptions$2 extends SuspendLambda implements InterfaceC6471c {
    int label;
    final /* synthetic */ MistakeCollectionDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionDetailViewModel$loadFilterOptions$2(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, InterfaceC5631c<? super MistakeCollectionDetailViewModel$loadFilterOptions$2> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.this$0 = mistakeCollectionDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionDetailViewModel$loadFilterOptions$2(this.this$0, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(InterfaceC5631c<? super MistakeBookFilterOptionsResp> interfaceC5631c) {
        return ((MistakeCollectionDetailViewModel$loadFilterOptions$2) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
        C6268a c6268a = this.this$0.f6436b;
        this.label = 1;
        Object objM4421m = ((InterfaceC5090c) ((C5755a) c6268a.f10022b).f9107a.invoke()).m4421m(this);
        return objM4421m == coroutineSingletons ? coroutineSingletons : objM4421m;
    }
}
