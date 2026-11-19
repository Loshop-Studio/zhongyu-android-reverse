package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.data.C4494c;
import com.zykj.mistake.feature.notebook.list.C4927a;
import com.zykj.mistake.network.ApiResp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$confirmJoinCollection$2", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {1352}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2474:1\n230#2,3:2475\n233#2,2:2482\n230#2,5:2484\n230#2,5:2489\n1563#3:2478\n1634#3,3:2479\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2\n*L\n1360#1:2475,3\n1360#1:2482,2\n1367#1:2484,5\n1369#1:2489,5\n1361#1:2478\n1361#1:2479,3\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$confirmJoinCollection$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ C4837m3 $state;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$confirmJoinCollection$2$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {1353}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2474:1\n1563#2:2475\n1634#2,3:2476\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2$1\n*L\n1356#1:2475\n1356#1:2476,3\n*E\n"})
    /* renamed from: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$confirmJoinCollection$2$1 */
    public static final class C47491 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ List<String> $collectionIds;
        final /* synthetic */ C4837m3 $state;
        int label;
        final /* synthetic */ MistakeDetailNewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47491(MistakeDetailNewViewModel mistakeDetailNewViewModel, List<String> list, C4837m3 c4837m3, InterfaceC5631c<? super C47491> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeDetailNewViewModel;
            this.$collectionIds = list;
            this.$state = c4837m3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C47491(this.this$0, this.$collectionIds, this.$state, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
            return ((C47491) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            List<String> list = this.$collectionIds;
            List listM5286y = AbstractC5806u.m5286y(new Integer(this.$state.f7149b));
            List<C4927a> list2 = this.$state.f7141U;
            MistakeDetailNewViewModel mistakeDetailNewViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list2, 10));
            for (C4927a c4927a : list2) {
                mistakeDetailNewViewModel.getClass();
                arrayList.add(new C4494c(c4927a.f7456a, c4927a.f7457b, c4927a.f7458c, c4927a.f7459d, c4927a.f7461f));
            }
            Set set = this.$state.f7143W;
            this.label = 1;
            Object objM3973c = c4492a.m3973c(list, listM5286y, arrayList, set, this);
            return objM3973c == coroutineSingletons ? coroutineSingletons : objM3973c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$confirmJoinCollection$2(MistakeDetailNewViewModel mistakeDetailNewViewModel, List<String> list, C4837m3 c4837m3, InterfaceC5631c<? super MistakeDetailNewViewModel$confirmJoinCollection$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$collectionIds = list;
        this.$state = c4837m3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$confirmJoinCollection$2(this.this$0, this.$collectionIds, this.$state, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        C4837m3 c4837m3;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C47491 c47491 = new C47491(this.this$0, this.$collectionIds, this.$state, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c47491, this);
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
        MistakeDetailNewViewModel mistakeDetailNewViewModel = this.this$0;
        List<String> list = this.$collectionIds;
        if (Result.m13962isSuccessimpl(value)) {
            C5946n0 c5946n0 = mistakeDetailNewViewModel.f6876e;
            do {
                value4 = c5946n0.getValue();
                c4837m3 = (C4837m3) value4;
                arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(Integer.parseInt((String) it.next())));
                }
            } while (!c5946n0.m5569i(value4, C4837m3.m4207a(c4837m3, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, AbstractC5805t.m5221H0(arrayList), null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -32769, 1)));
            mistakeDetailNewViewModel.m4157n();
            mistakeDetailNewViewModel.m4144S(C4876t0.f7302a);
            mistakeDetailNewViewModel.m4144S(new C4817j1("已变更所属错题集"));
        }
        MistakeDetailNewViewModel mistakeDetailNewViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            C5946n0 c5946n02 = mistakeDetailNewViewModel2.f6876e;
            do {
                value2 = c5946n02.getValue();
            } while (!c5946n02.m5569i(value2, C4837m3.m4207a((C4837m3) value2, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -262145, 1)));
            if (MistakeDetailNewViewModel.m4106E(thM13959exceptionOrNullimpl)) {
                C5946n0 c5946n03 = mistakeDetailNewViewModel2.f6876e;
                do {
                    value3 = c5946n03.getValue();
                } while (!c5946n03.m5569i(value3, C4837m3.m4207a((C4837m3) value3, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, true, false, false, false, false, null, 0, -1, -67108865, 1)));
            } else {
                String message = thM13959exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                mistakeDetailNewViewModel2.m4144S(new C4817j1(message));
            }
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$confirmJoinCollection$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
