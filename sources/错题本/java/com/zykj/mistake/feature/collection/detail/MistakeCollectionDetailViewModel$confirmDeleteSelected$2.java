package com.zykj.mistake.feature.collection.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.req.RemoveItemsFromCollectionReq;
import com.zykj.mistake.network.ApiResp;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5805t;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$confirmDeleteSelected$2", m5303f = "MistakeCollectionDetailViewModel.kt", m5304i = {}, m5305l = {554}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeCollectionDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,663:1\n230#2,5:664\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2\n*L\n564#1:664,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeCollectionDetailViewModel$confirmDeleteSelected$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ int $collectionId;
    final /* synthetic */ List<Integer> $itemIds;
    int label;
    final /* synthetic */ MistakeCollectionDetailViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$confirmDeleteSelected$2$1", m5303f = "MistakeCollectionDetailViewModel.kt", m5304i = {}, m5305l = {555}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$confirmDeleteSelected$2$1 */
    public static final class C45721 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ int $collectionId;
        final /* synthetic */ List<Integer> $itemIds;
        int label;
        final /* synthetic */ MistakeCollectionDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45721(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, int i, List<Integer> list, InterfaceC5631c<? super C45721> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionDetailViewModel;
            this.$collectionId = i;
            this.$itemIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C45721(this.this$0, this.$collectionId, this.$itemIds, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
            return ((C45721) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            int i8 = this.$collectionId;
            List<Integer> list = this.$itemIds;
            this.label = 1;
            Object objM4433y = c4492a.f6002a.m5095a().m4433y(new RemoveItemsFromCollectionReq(i8, list), this);
            return objM4433y == coroutineSingletons ? coroutineSingletons : objM4433y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionDetailViewModel$confirmDeleteSelected$2(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, int i, List<Integer> list, InterfaceC5631c<? super MistakeCollectionDetailViewModel$confirmDeleteSelected$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionDetailViewModel;
        this.$collectionId = i;
        this.$itemIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionDetailViewModel$confirmDeleteSelected$2(this.this$0, this.$collectionId, this.$itemIds, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C45721 c45721 = new C45721(this.this$0, this.$collectionId, this.$itemIds, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c45721, this);
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
        MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel = this.this$0;
        List<Integer> list = this.$itemIds;
        if (Result.m13962isSuccessimpl(value)) {
            mistakeCollectionDetailViewModel.m4030g(AbstractC5805t.m5221H0(list));
        }
        MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            C5946n0 c5946n0 = mistakeCollectionDetailViewModel2.f6437c;
            do {
                value2 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value2, C4632z0.m4054a((C4632z0) value2, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, null, false, false, -1, 23)));
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
        return ((MistakeCollectionDetailViewModel$confirmDeleteSelected$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
