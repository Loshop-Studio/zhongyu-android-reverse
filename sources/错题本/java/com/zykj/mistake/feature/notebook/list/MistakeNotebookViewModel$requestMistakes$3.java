package com.zykj.mistake.feature.notebook.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4495d;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.req.MistakeListReq;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$requestMistakes$3", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {363}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,845:1\n1573#2:846\n1604#2,4:847\n230#3,5:851\n230#3,5:856\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestMistakes$3\n*L\n366#1:846\n366#1:847,4\n374#1:851,5\n387#1:856,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeNotebookViewModel$requestMistakes$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ int $requestSkipCount;
    int label;
    final /* synthetic */ MistakeNotebookViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/MistakeListResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$requestMistakes$3$1", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {363}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$requestMistakes$3$1 */
    public static final class C49251 extends SuspendLambda implements InterfaceC6471c {
        int label;
        final /* synthetic */ MistakeNotebookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49251(MistakeNotebookViewModel mistakeNotebookViewModel, InterfaceC5631c<? super C49251> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeNotebookViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C49251(this.this$0, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super MistakeListResp> interfaceC5631c) {
            return ((C49251) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            MistakeNotebookViewModel mistakeNotebookViewModel = this.this$0;
            C4492a c4492a = mistakeNotebookViewModel.f7446b;
            MistakeListReq mistakeListReq = mistakeNotebookViewModel.f7452h;
            this.label = 1;
            Object objM4409a = c4492a.f6002a.m5095a().m4409a(mistakeListReq, this);
            return objM4409a == coroutineSingletons ? coroutineSingletons : objM4409a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeNotebookViewModel$requestMistakes$3(MistakeNotebookViewModel mistakeNotebookViewModel, int i, boolean z8, InterfaceC5631c<? super MistakeNotebookViewModel$requestMistakes$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeNotebookViewModel;
        this.$requestSkipCount = i;
        this.$isRefresh = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeNotebookViewModel$requestMistakes$3(this.this$0, this.$requestSkipCount, this.$isRefresh, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        C4941e1 c4941e1;
        ArrayList arrayListM5240t0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C49251 c49251 = new C49251(this.this$0, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c49251, this);
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
        int i8 = this.$requestSkipCount;
        MistakeNotebookViewModel mistakeNotebookViewModel = this.this$0;
        boolean z8 = this.$isRefresh;
        if (Result.m13962isSuccessimpl(value)) {
            MistakeListResp mistakeListResp = (MistakeListResp) value;
            int maxResultCount = (i8 / mistakeNotebookViewModel.f7452h.getMaxResultCount()) + 1;
            List<MistakeListResp.MistakeInfo> items = mistakeListResp.getResult().getItems();
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(items, 10));
            int i9 = 0;
            for (Object obj2 : items) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC5806u.m5258L();
                    throw null;
                }
                arrayList.add(AbstractC4495d.m3977c((MistakeListResp.MistakeInfo) obj2, maxResultCount, i9));
                i9 = i10;
            }
            int totalCount = mistakeListResp.getResult().getTotalCount();
            int masteredCount = mistakeListResp.getResult().getMasteredCount();
            C5946n0 c5946n0 = mistakeNotebookViewModel.f7448d;
            do {
                value3 = c5946n0.getValue();
                c4941e1 = (C4941e1) value3;
                arrayListM5240t0 = z8 ? arrayList : AbstractC5805t.m5240t0(c4941e1.f7504d, arrayList);
            } while (!c5946n0.m5569i(value3, C4941e1.m4303a(c4941e1, totalCount, masteredCount, false, arrayListM5240t0, false, false, arrayListM5240t0.size() < totalCount, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33554308)));
        }
        MistakeNotebookViewModel mistakeNotebookViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            C5946n0 c5946n02 = mistakeNotebookViewModel2.f7448d;
            do {
                value2 = c5946n02.getValue();
            } while (!c5946n02.m5569i(value2, C4941e1.m4303a((C4941e1) value2, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33554383)));
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeNotebookViewModel2.m4296h(new C4986x(message));
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeNotebookViewModel$requestMistakes$3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
