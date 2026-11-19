package com.zykj.mistake.feature.collection.filter;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.network.ApiResp;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$addToCollection$2", m5303f = "MistakeCollectionFilterResultViewModel.kt", m5304i = {}, m5305l = {418}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeCollectionFilterResultViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$addToCollection$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,516:1\n230#2,5:517\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$addToCollection$2\n*L\n436#1:517,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeCollectionFilterResultViewModel$addToCollection$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Integer $collectionId;
    final /* synthetic */ List<Integer> $itemIds;
    int label;
    final /* synthetic */ MistakeCollectionFilterResultViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$addToCollection$2$1", m5303f = "MistakeCollectionFilterResultViewModel.kt", m5304i = {}, m5305l = {419}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$addToCollection$2$1 */
    public static final class C46351 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ Integer $collectionId;
        final /* synthetic */ List<Integer> $itemIds;
        int label;
        final /* synthetic */ MistakeCollectionFilterResultViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46351(MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, Integer num, List<Integer> list, InterfaceC5631c<? super C46351> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionFilterResultViewModel;
            this.$collectionId = num;
            this.$itemIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C46351(this.this$0, this.$collectionId, this.$itemIds, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
            return ((C46351) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            List listM5286y = AbstractC5806u.m5286y(this.$collectionId.toString());
            List<Integer> list = this.$itemIds;
            this.label = 1;
            Object objM3971a = c4492a.m3971a(listM5286y, list, this);
            return objM3971a == coroutineSingletons ? coroutineSingletons : objM3971a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionFilterResultViewModel$addToCollection$2(MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, Integer num, List<Integer> list, InterfaceC5631c<? super MistakeCollectionFilterResultViewModel$addToCollection$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionFilterResultViewModel;
        this.$collectionId = num;
        this.$itemIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionFilterResultViewModel$addToCollection$2(this.this$0, this.$collectionId, this.$itemIds, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C46351 c46351 = new C46351(this.this$0, this.$collectionId, this.$itemIds, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c46351, this);
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
        MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel = this.this$0;
        List<Integer> list = this.$itemIds;
        if (Result.m13962isSuccessimpl(value)) {
            mistakeCollectionFilterResultViewModel.m4071f(new C4663m(list.size()));
        }
        MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeCollectionFilterResultViewModel2.m4071f(new C4669p(message));
        }
        C5946n0 c5946n0 = this.this$0.f6578c;
        do {
            value2 = c5946n0.getValue();
        } while (!c5946n0.m5569i(value2, C4676s0.m4080a((C4676s0) value2, null, null, 0, 0, null, 0, null, 0, null, null, null, false, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, null, false, null, -131073, 3)));
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeCollectionFilterResultViewModel$addToCollection$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
