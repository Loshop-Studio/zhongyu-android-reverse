package com.zykj.mistake.feature.collection.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4495d;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.req.GetCollectionItemsReq;
import com.zykj.mistake.entity.resp.MistakeListResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.C5946n0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$requestCollectionItems$3", m5303f = "MistakeCollectionDetailViewModel.kt", m5304i = {}, m5305l = {405}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeCollectionDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,663:1\n1573#2:664\n1604#2,4:665\n230#3,5:669\n230#3,5:674\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$requestCollectionItems$3\n*L\n408#1:664\n408#1:665,4\n412#1:669,5\n426#1:674,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeCollectionDetailViewModel$requestCollectionItems$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ GetCollectionItemsReq $req;
    final /* synthetic */ int $skipCount;
    int label;
    final /* synthetic */ MistakeCollectionDetailViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/MistakeListResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$requestCollectionItems$3$1", m5303f = "MistakeCollectionDetailViewModel.kt", m5304i = {}, m5305l = {405}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$requestCollectionItems$3$1 */
    public static final class C45741 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ GetCollectionItemsReq $req;
        int label;
        final /* synthetic */ MistakeCollectionDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45741(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, GetCollectionItemsReq getCollectionItemsReq, InterfaceC5631c<? super C45741> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionDetailViewModel;
            this.$req = getCollectionItemsReq;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C45741(this.this$0, this.$req, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super MistakeListResp> interfaceC5631c) {
            return ((C45741) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            C4492a c4492a = this.this$0.f6435a;
            GetCollectionItemsReq getCollectionItemsReq = this.$req;
            this.label = 1;
            Object objM4423o = c4492a.f6002a.m5095a().m4423o(getCollectionItemsReq, this);
            return objM4423o == coroutineSingletons ? coroutineSingletons : objM4423o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionDetailViewModel$requestCollectionItems$3(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, GetCollectionItemsReq getCollectionItemsReq, int i, boolean z8, InterfaceC5631c<? super MistakeCollectionDetailViewModel$requestCollectionItems$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionDetailViewModel;
        this.$req = getCollectionItemsReq;
        this.$skipCount = i;
        this.$isRefresh = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionDetailViewModel$requestCollectionItems$3(this.this$0, this.$req, this.$skipCount, this.$isRefresh, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        C4632z0 c4632z0;
        ArrayList arrayListM5240t0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C45741 c45741 = new C45741(this.this$0, this.$req, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c45741, this);
            if (objM3978a == coroutineSingletons) {
                return coroutineSingletons;
            }
            value = objM3978a;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            value = ((Result) obj).getValue();
        }
        int i8 = this.$skipCount;
        MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel = this.this$0;
        boolean z8 = this.$isRefresh;
        if (Result.m13962isSuccessimpl(value)) {
            MistakeListResp mistakeListResp = (MistakeListResp) value;
            int i9 = (i8 / 20) + 1;
            List<MistakeListResp.MistakeInfo> items = mistakeListResp.getResult().getItems();
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(items, 10));
            int i10 = 0;
            for (Object obj2 : items) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC5806u.m5258L();
                    throw null;
                }
                arrayList.add(AbstractC4495d.m3977c((MistakeListResp.MistakeInfo) obj2, i9, i10));
                i10 = i11;
            }
            int totalCount = mistakeListResp.getResult().getTotalCount();
            C5946n0 c5946n0 = mistakeCollectionDetailViewModel.f6437c;
            do {
                value3 = c5946n0.getValue();
                c4632z0 = (C4632z0) value3;
                arrayListM5240t0 = z8 ? arrayList : AbstractC5805t.m5240t0(c4632z0.f6552g, arrayList);
            } while (!c5946n0.m5569i(value3, C4632z0.m4054a(c4632z0, null, null, totalCount, null, c4632z0.f6550e || (z8 && totalCount == 0), null, arrayListM5240t0, false, true, false, false, arrayListM5240t0.size() < totalCount, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, null, false, false, -7845, 31)));
        }
        MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            C5946n0 c5946n02 = mistakeCollectionDetailViewModel2.f6437c;
            do {
                value2 = c5946n02.getValue();
            } while (!c5946n02.m5569i(value2, C4632z0.m4054a((C4632z0) value2, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, null, false, false, -3073, 31)));
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeCollectionDetailViewModel2.m4033j(new C4603l(message));
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeCollectionDetailViewModel$requestCollectionItems$3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
