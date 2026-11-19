package com.zykj.mistake.feature.collection.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.resp.MistakeCollectionListResp;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$requestCollections$2", m5303f = "MistakeCollectionViewModel.kt", m5304i = {}, m5305l = {211}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeCollectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n230#2,3:256\n233#2,2:263\n230#2,5:265\n1563#3:259\n1634#3,3:260\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2\n*L\n214#1:256,3\n214#1:263,2\n225#1:265,5\n217#1:259\n217#1:260,3\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeCollectionViewModel$requestCollections$2 extends SuspendLambda implements InterfaceC6473e {
    int label;
    final /* synthetic */ MistakeCollectionViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$requestCollections$2$1", m5303f = "MistakeCollectionViewModel.kt", m5304i = {}, m5305l = {211}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$requestCollections$2$1 */
    public static final class C46981 extends SuspendLambda implements InterfaceC6471c {
        int label;
        final /* synthetic */ MistakeCollectionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46981(MistakeCollectionViewModel mistakeCollectionViewModel, InterfaceC5631c<? super C46981> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C46981(this.this$0, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super MistakeCollectionListResp> interfaceC5631c) {
            return ((C46981) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            this.label = 1;
            Object objM4420l = c4492a.f6002a.m5095a().m4420l(this);
            return objM4420l == coroutineSingletons ? coroutineSingletons : objM4420l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionViewModel$requestCollections$2(MistakeCollectionViewModel mistakeCollectionViewModel, InterfaceC5631c<? super MistakeCollectionViewModel$requestCollections$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionViewModel$requestCollections$2(this.this$0, interfaceC5631c);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$requestCollections$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2.smali:168
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeCollectionViewModel$requestCollections$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
