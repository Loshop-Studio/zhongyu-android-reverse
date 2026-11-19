package com.zykj.mistake.feature.notebook.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.network.ApiResp;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmJoinCollection$3", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {411}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,845:1\n230#2,5:846\n230#2,5:851\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3\n*L\n421#1:846,5\n423#1:851,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeNotebookViewModel$confirmJoinCollection$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ List<Integer> $selectedItemIds;
    int label;
    final /* synthetic */ MistakeNotebookViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmJoinCollection$3$1", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {412}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmJoinCollection$3$1 */
    public static final class C49221 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ List<String> $collectionIds;
        final /* synthetic */ List<Integer> $selectedItemIds;
        int label;
        final /* synthetic */ MistakeNotebookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49221(MistakeNotebookViewModel mistakeNotebookViewModel, List<String> list, List<Integer> list2, InterfaceC5631c<? super C49221> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeNotebookViewModel;
            this.$collectionIds = list;
            this.$selectedItemIds = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C49221(this.this$0, this.$collectionIds, this.$selectedItemIds, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
            return ((C49221) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            List<String> list = this.$collectionIds;
            List<Integer> list2 = this.$selectedItemIds;
            this.label = 1;
            Object objM3971a = c4492a.m3971a(list, list2, this);
            return objM3971a == coroutineSingletons ? coroutineSingletons : objM3971a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeNotebookViewModel$confirmJoinCollection$3(MistakeNotebookViewModel mistakeNotebookViewModel, List<String> list, List<Integer> list2, InterfaceC5631c<? super MistakeNotebookViewModel$confirmJoinCollection$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeNotebookViewModel;
        this.$collectionIds = list;
        this.$selectedItemIds = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeNotebookViewModel$confirmJoinCollection$3(this.this$0, this.$collectionIds, this.$selectedItemIds, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C49221 c49221 = new C49221(this.this$0, this.$collectionIds, this.$selectedItemIds, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c49221, this);
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
        MistakeNotebookViewModel mistakeNotebookViewModel = this.this$0;
        if (Result.m13962isSuccessimpl(value)) {
            mistakeNotebookViewModel.m4292b();
            mistakeNotebookViewModel.m4296h(C4960l.f7574a);
            mistakeNotebookViewModel.m4296h(new C4986x("已加入错题集"));
        }
        MistakeNotebookViewModel mistakeNotebookViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            C5946n0 c5946n0 = mistakeNotebookViewModel2.f7448d;
            do {
                value2 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value2, C4941e1.m4303a((C4941e1) value2, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33292287)));
            if (MistakeNotebookViewModel.m4290d(thM13959exceptionOrNullimpl)) {
                C5946n0 c5946n02 = mistakeNotebookViewModel2.f7448d;
                do {
                    value3 = c5946n02.getValue();
                } while (!c5946n02.m5569i(value3, C4941e1.m4303a((C4941e1) value3, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, true, ViewCompat.MEASURED_SIZE_MASK)));
            } else {
                String message = thM13959exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                mistakeNotebookViewModel2.m4296h(new C4986x(message));
            }
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeNotebookViewModel$confirmJoinCollection$3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
