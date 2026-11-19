package com.zykj.mistake.feature.collection.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.PointerIconCompat;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.req.DeleteMyCollectionsReq;
import com.zykj.mistake.network.ApiResp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptySet;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$removeSelectedCollections$1", m5303f = "MistakeCollectionViewModel.kt", m5304i = {}, m5305l = {179}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeCollectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n230#2,3:256\n233#2,2:262\n827#3:259\n855#3,2:260\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1\n*L\n181#1:256,3\n181#1:262,2\n182#1:259\n182#1:260,2\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeCollectionViewModel$removeSelectedCollections$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ List<Integer> $collectionIds;
    final /* synthetic */ Set<String> $selectedIds;
    int label;
    final /* synthetic */ MistakeCollectionViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$removeSelectedCollections$1$1", m5303f = "MistakeCollectionViewModel.kt", m5304i = {}, m5305l = {179}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$removeSelectedCollections$1$1 */
    public static final class C46971 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ List<Integer> $collectionIds;
        int label;
        final /* synthetic */ MistakeCollectionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46971(MistakeCollectionViewModel mistakeCollectionViewModel, List<Integer> list, InterfaceC5631c<? super C46971> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionViewModel;
            this.$collectionIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C46971(this.this$0, this.$collectionIds, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
            return ((C46971) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            C4492a c4492a = this.this$0.f6734a;
            List<Integer> list = this.$collectionIds;
            this.label = 1;
            Object objM4432x = c4492a.f6002a.m5095a().m4432x(new DeleteMyCollectionsReq(list), this);
            return objM4432x == coroutineSingletons ? coroutineSingletons : objM4432x;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionViewModel$removeSelectedCollections$1(MistakeCollectionViewModel mistakeCollectionViewModel, List<Integer> list, Set<String> set, InterfaceC5631c<? super MistakeCollectionViewModel$removeSelectedCollections$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionViewModel;
        this.$collectionIds = list;
        this.$selectedIds = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionViewModel$removeSelectedCollections$1(this.this$0, this.$collectionIds, this.$selectedIds, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        C4723v c4723v;
        ArrayList arrayList;
        int size;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C46971 c46971 = new C46971(this.this$0, this.$collectionIds, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c46971, this);
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
        MistakeCollectionViewModel mistakeCollectionViewModel = this.this$0;
        Set<String> set = this.$selectedIds;
        if (Result.m13962isSuccessimpl(value)) {
            C5946n0 c5946n0 = mistakeCollectionViewModel.f6735b;
            do {
                value2 = c5946n0.getValue();
                c4723v = (C4723v) value2;
                List list = c4723v.f6776c;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!set.contains(((C4701b) obj2).f6746a)) {
                        arrayList.add(obj2);
                    }
                }
                size = c4723v.f6775b - set.size();
                if (size < 0) {
                    size = 0;
                }
            } while (!c5946n0.m5569i(value2, C4723v.m4099a(c4723v, size, arrayList, false, false, null, null, false, false, EmptySet.INSTANCE, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW)));
            mistakeCollectionViewModel.m4091c(C4703c.f6754a);
            mistakeCollectionViewModel.m4091c(new C4707f("删除成功"));
        }
        MistakeCollectionViewModel mistakeCollectionViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeCollectionViewModel2.m4091c(new C4707f(message));
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeCollectionViewModel$removeSelectedCollections$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
