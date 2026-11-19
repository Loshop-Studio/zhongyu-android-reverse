package com.zykj.mistake.feature.notebook.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.resp.CreateOrUpdateCollectionResp;
import java.util.List;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3", m5303f = "MistakeNotebookViewModel.kt", m5304i = {1, 1}, m5305l = {445, 459}, m5306m = "invokeSuspend", m5307n = {"it", "$i$a$-onSuccess-MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3$3"}, m5308s = {"L$1", "I$0"})
@SourceDebugExtension({"SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,845:1\n230#2,5:846\n230#2,5:851\n230#2,5:856\n230#2,5:861\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3\n*L\n462#1:846,5\n476#1:851,5\n478#1:856,5\n480#1:861,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MistakeNotebookContract$CreateCollectionEntry $entry;
    final /* synthetic */ String $name;
    final /* synthetic */ List<Integer> $selectedItemIds;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MistakeNotebookViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3$1", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {447}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3$1 */
    public static final class C49211 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ MistakeNotebookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49211(MistakeNotebookViewModel mistakeNotebookViewModel, String str, InterfaceC5631c<? super C49211> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeNotebookViewModel;
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C49211(this.this$0, this.$name, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super CreateOrUpdateCollectionResp> interfaceC5631c) {
            return ((C49211) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            C4492a c4492a = this.this$0.f7445a;
            String str = this.$name;
            this.label = 1;
            Object objM3972b = c4492a.m3972b(0, str, this);
            return objM3972b == coroutineSingletons ? coroutineSingletons : objM3972b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3(MistakeNotebookViewModel mistakeNotebookViewModel, String str, MistakeNotebookContract$CreateCollectionEntry mistakeNotebookContract$CreateCollectionEntry, List<Integer> list, InterfaceC5631c<? super MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeNotebookViewModel;
        this.$name = str;
        this.$entry = mistakeNotebookContract$CreateCollectionEntry;
        this.$selectedItemIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3(this.this$0, this.$name, this.$entry, this.$selectedItemIds, interfaceC5631c);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3.smali:230
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
