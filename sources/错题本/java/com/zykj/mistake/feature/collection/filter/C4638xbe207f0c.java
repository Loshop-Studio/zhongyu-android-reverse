package com.zykj.mistake.feature.collection.filter;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import com.zykj.mistake.entity.resp.MistakeListResp;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Lkotlin/Result;", "Lcom/zykj/mistake/entity/resp/MistakeListResp;", "<anonymous>", "(Lkotlinx/coroutines/v;)Lkotlin/Result;"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3$listDeferred$1", m5303f = "MistakeCollectionFilterResultViewModel.kt", m5304i = {}, m5305l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* renamed from: com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3$listDeferred$1 */
/* loaded from: classes3.dex */
public final class C4638xbe207f0c extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ SearchMistakeCollectionReq $req;
    int label;
    final /* synthetic */ MistakeCollectionFilterResultViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/MistakeListResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3$listDeferred$1$1", m5303f = "MistakeCollectionFilterResultViewModel.kt", m5304i = {}, m5305l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3$listDeferred$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ SearchMistakeCollectionReq $req;
        int label;
        final /* synthetic */ MistakeCollectionFilterResultViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, SearchMistakeCollectionReq searchMistakeCollectionReq, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionFilterResultViewModel;
            this.$req = searchMistakeCollectionReq;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new AnonymousClass1(this.this$0, this.$req, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super MistakeListResp> interfaceC5631c) {
            return ((AnonymousClass1) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            C4492a c4492a = this.this$0.f6576a;
            SearchMistakeCollectionReq searchMistakeCollectionReqM4066b = MistakeCollectionFilterResultViewModel.m4066b(this.$req);
            this.label = 1;
            Object objM4430v = c4492a.f6002a.m5095a().m4430v(searchMistakeCollectionReqM4066b, this);
            return objM4430v == coroutineSingletons ? coroutineSingletons : objM4430v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4638xbe207f0c(MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, SearchMistakeCollectionReq searchMistakeCollectionReq, InterfaceC5631c<? super C4638xbe207f0c> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionFilterResultViewModel;
        this.$req = searchMistakeCollectionReq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new C4638xbe207f0c(this.this$0, this.$req, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM3978a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$req, null);
            this.label = 1;
            objM3978a = AbstractC4496e.m3978a(anonymousClass1, this);
            if (objM3978a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            objM3978a = ((Result) obj).getValue();
        }
        return Result.m13955boximpl(objM3978a);
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super Result<MistakeListResp>> interfaceC5631c) {
        return ((C4638xbe207f0c) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
