package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.data.C4494c;
import com.zykj.mistake.network.ApiResp;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$syncToNewCollection$2", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {1438}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$syncToNewCollection$2 extends SuspendLambda implements InterfaceC6471c {
    final /* synthetic */ C4494c $collection;
    final /* synthetic */ int $itemId;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$syncToNewCollection$2(MistakeDetailNewViewModel mistakeDetailNewViewModel, C4494c c4494c, int i, InterfaceC5631c<? super MistakeDetailNewViewModel$syncToNewCollection$2> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$collection = c4494c;
        this.$itemId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$syncToNewCollection$2(this.this$0, this.$collection, this.$itemId, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$syncToNewCollection$2) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
        C4492a c4492a = this.this$0.f6872a;
        List listM5286y = AbstractC5806u.m5286y(this.$collection.f6007a);
        List listM5286y2 = AbstractC5806u.m5286y(new Integer(this.$itemId));
        List listM5286y3 = AbstractC5806u.m5286y(this.$collection);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.label = 1;
        Object objM3973c = c4492a.m3973c(listM5286y, listM5286y2, listM5286y3, emptySet, this);
        return objM3973c == coroutineSingletons ? coroutineSingletons : objM3973c;
    }
}
