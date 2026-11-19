package com.zykj.mistake.feature.notebook.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.MistakeBookFilterOptionsResp;
import com.zykj.mistake.network.InterfaceC5090c;
import java.util.ArrayList;
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
import p098k4.C5755a;
import p129o2.C6268a;
import p137p4.C6382a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$loadFilterData$1", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {650}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,845:1\n1563#2:846\n1634#2,3:847\n1563#2:850\n1634#2,3:851\n230#3,5:854\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$loadFilterData$1\n*L\n652#1:846\n652#1:847,3\n658#1:850\n658#1:851,3\n666#1:854,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeNotebookViewModel$loadFilterData$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $openDrawer;
    final /* synthetic */ boolean $showError;
    final /* synthetic */ boolean $showLoading;
    int label;
    final /* synthetic */ MistakeNotebookViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$loadFilterData$1$1", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {650}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$loadFilterData$1$1 */
    public static final class C49241 extends SuspendLambda implements InterfaceC6471c {
        int label;
        final /* synthetic */ MistakeNotebookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49241(MistakeNotebookViewModel mistakeNotebookViewModel, InterfaceC5631c<? super C49241> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeNotebookViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C49241(this.this$0, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super MistakeBookFilterOptionsResp> interfaceC5631c) {
            return ((C49241) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            C6268a c6268a = this.this$0.f7447c;
            this.label = 1;
            Object objM4421m = ((InterfaceC5090c) ((C5755a) c6268a.f10022b).f9107a.invoke()).m4421m(this);
            return objM4421m == coroutineSingletons ? coroutineSingletons : objM4421m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeNotebookViewModel$loadFilterData$1(boolean z8, MistakeNotebookViewModel mistakeNotebookViewModel, boolean z9, boolean z10, InterfaceC5631c<? super MistakeNotebookViewModel$loadFilterData$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$showLoading = z8;
        this.this$0 = mistakeNotebookViewModel;
        this.$openDrawer = z9;
        this.$showError = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeNotebookViewModel$loadFilterData$1(this.$showLoading, this.this$0, this.$openDrawer, this.$showError, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        ArrayList arrayList2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            if (this.$showLoading) {
                this.this$0.m4296h(C4984w.f7620a);
            }
            C49241 c49241 = new C49241(this.this$0, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c49241, this);
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
        boolean z8 = this.$openDrawer;
        if (Result.m13962isSuccessimpl(value)) {
            MistakeBookFilterOptionsResp mistakeBookFilterOptionsResp = (MistakeBookFilterOptionsResp) value;
            List<MistakeBookFilterOptionsResp.FilterTopic> topics = mistakeBookFilterOptionsResp.getResult().getTopics();
            ArrayList arrayList3 = new ArrayList(AbstractC5806u.m5277p(topics, 10));
            for (MistakeBookFilterOptionsResp.FilterTopic filterTopic : topics) {
                arrayList3.add(new C6382a(filterTopic.getTopicId(), filterTopic.getTopicName()));
            }
            List<CustomTagInfo> tags = mistakeBookFilterOptionsResp.getResult().getTags();
            ArrayList arrayList4 = new ArrayList(AbstractC5806u.m5277p(tags, 10));
            for (CustomTagInfo customTagInfo : tags) {
                arrayList4.add(new CustomTagInfo(customTagInfo.getName(), customTagInfo.getId(), customTagInfo.getBindItemsCount(), -1));
            }
            C5946n0 c5946n0 = mistakeNotebookViewModel.f7448d;
            while (true) {
                Object value2 = c5946n0.getValue();
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                if (c5946n0.m5569i(value2, C4941e1.m4303a((C4941e1) value2, 0, 0, false, null, false, false, false, false, null, arrayList, null, arrayList2, false, null, null, null, false, false, null, null, false, null, false, 33541119))) {
                    break;
                }
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
            }
            if (z8) {
                mistakeNotebookViewModel.m4296h(new C4970p(arrayList, arrayList2));
            }
        }
        boolean z9 = this.$showError;
        MistakeNotebookViewModel mistakeNotebookViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null && z9) {
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeNotebookViewModel2.m4296h(new C4986x(message));
        }
        if (this.$showLoading) {
            this.this$0.m4296h(C4968o.f7589a);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeNotebookViewModel$loadFilterData$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
