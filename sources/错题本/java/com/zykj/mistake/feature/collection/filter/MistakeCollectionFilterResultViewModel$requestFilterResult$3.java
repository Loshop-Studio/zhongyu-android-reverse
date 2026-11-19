package com.zykj.mistake.feature.collection.filter;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import com.zykj.mistake.entity.resp.MistakeListResp;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3", m5303f = "MistakeCollectionFilterResultViewModel.kt", m5304i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, m5305l = {326, 327, 364}, m5306m = "invokeSuspend", m5307n = {"$this$launch", "listDeferred", "selectableIdsReq", "idsDeferred", "$this$launch", "listDeferred", "selectableIdsReq", "idsDeferred", "listResult", "$this$launch"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
@SourceDebugExtension({"SMAP\nMistakeCollectionFilterResultViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,516:1\n1573#2:517\n1604#2,4:518\n1788#2,4:522\n1573#2:531\n1604#2,4:532\n230#3,5:526\n230#3,5:536\n230#3,5:541\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3\n*L\n337#1:517\n337#1:518,4\n345#1:522,4\n367#1:531\n367#1:532,4\n354#1:526,5\n370#1:536,5\n382#1:541,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeCollectionFilterResultViewModel$requestFilterResult$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ SearchMistakeCollectionReq $req;
    final /* synthetic */ int $requestSkipCount;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MistakeCollectionFilterResultViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/MistakeListResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3$2", m5303f = "MistakeCollectionFilterResultViewModel.kt", m5304i = {}, m5305l = {364}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3$2 */
    public static final class C46362 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ SearchMistakeCollectionReq $req;
        int label;
        final /* synthetic */ MistakeCollectionFilterResultViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46362(MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, SearchMistakeCollectionReq searchMistakeCollectionReq, InterfaceC5631c<? super C46362> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionFilterResultViewModel;
            this.$req = searchMistakeCollectionReq;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C46362(this.this$0, this.$req, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super MistakeListResp> interfaceC5631c) {
            return ((C46362) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
    public MistakeCollectionFilterResultViewModel$requestFilterResult$3(boolean z8, MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, SearchMistakeCollectionReq searchMistakeCollectionReq, int i, InterfaceC5631c<? super MistakeCollectionFilterResultViewModel$requestFilterResult$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$isRefresh = z8;
        this.this$0 = mistakeCollectionFilterResultViewModel;
        this.$req = searchMistakeCollectionReq;
        this.$requestSkipCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        MistakeCollectionFilterResultViewModel$requestFilterResult$3 mistakeCollectionFilterResultViewModel$requestFilterResult$3 = new MistakeCollectionFilterResultViewModel$requestFilterResult$3(this.$isRefresh, this.this$0, this.$req, this.$requestSkipCount, interfaceC5631c);
        mistakeCollectionFilterResultViewModel$requestFilterResult$3.L$0 = obj;
        return mistakeCollectionFilterResultViewModel$requestFilterResult$3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0262, code lost:
    
        if (r1 == r2) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3.smali:252
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeCollectionFilterResultViewModel$requestFilterResult$3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
