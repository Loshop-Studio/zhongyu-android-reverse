package com.zykj.mistake.feature.notebook.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.entity.req.CreateTagReq;
import com.zykj.mistake.entity.resp.CreateOrEditTagResp;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.network.InterfaceC5090c;
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
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.C5946n0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p098k4.C5755a;
import p129o2.C6268a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$createOrEditCustomTag$1", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {691}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,845:1\n230#2,5:846\n230#2,3:856\n233#2,2:863\n1563#3:851\n1634#3,2:852\n1636#3:855\n1563#3:859\n1634#3,3:860\n1#4:854\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$createOrEditCustomTag$1\n*L\n696#1:846,5\n715#1:856,3\n715#1:863,2\n708#1:851\n708#1:852,2\n708#1:855\n718#1:859\n718#1:860,3\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeNotebookViewModel$createOrEditCustomTag$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ long $id;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ MistakeNotebookViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$createOrEditCustomTag$1$1", m5303f = "MistakeNotebookViewModel.kt", m5304i = {}, m5305l = {691}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$createOrEditCustomTag$1$1 */
    public static final class C49231 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ long $id;
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ MistakeNotebookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49231(MistakeNotebookViewModel mistakeNotebookViewModel, String str, long j7, InterfaceC5631c<? super C49231> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeNotebookViewModel;
            this.$name = str;
            this.$id = j7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C49231(this.this$0, this.$name, this.$id, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super CreateOrEditTagResp> interfaceC5631c) {
            return ((C49231) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            CreateTagReq createTagReq = new CreateTagReq(this.$name, this.$id);
            this.label = 1;
            Object objM4418j = ((InterfaceC5090c) ((C5755a) c6268a.f10022b).f9107a.invoke()).m4418j(createTagReq, this);
            return objM4418j == coroutineSingletons ? coroutineSingletons : objM4418j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeNotebookViewModel$createOrEditCustomTag$1(MistakeNotebookViewModel mistakeNotebookViewModel, String str, long j7, InterfaceC5631c<? super MistakeNotebookViewModel$createOrEditCustomTag$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeNotebookViewModel;
        this.$name = str;
        this.$id = j7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeNotebookViewModel$createOrEditCustomTag$1(this.this$0, this.$name, this.$id, interfaceC5631c);
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
            this.this$0.m4296h(C4984w.f7620a);
            C49231 c49231 = new C49231(this.this$0, this.$name, this.$id, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c49231, this);
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
        long j7 = this.$id;
        String str = this.$name;
        MistakeNotebookViewModel mistakeNotebookViewModel = this.this$0;
        if (Result.m13962isSuccessimpl(value)) {
            CreateOrEditTagResp createOrEditTagResp = (CreateOrEditTagResp) value;
            if (j7 == 0) {
                CustomTagInfo customTagInfo = new CustomTagInfo(str, createOrEditTagResp.getResult(), 0, 0, 12, null);
                ArrayList arrayListM5240t0 = AbstractC5805t.m5240t0(AbstractC5806u.m5286y(customTagInfo), ((C4941e1) mistakeNotebookViewModel.f7448d.getValue()).f7512l);
                C5946n0 c5946n0 = mistakeNotebookViewModel.f7448d;
                while (true) {
                    Object value2 = c5946n0.getValue();
                    C4941e1 c4941e1 = (C4941e1) value2;
                    boolean z8 = c4941e1.f7514n;
                    List listM5240t0 = c4941e1.f7513m;
                    if (z8) {
                        listM5240t0 = AbstractC5805t.m5240t0(AbstractC5806u.m5286y(customTagInfo), listM5240t0);
                    }
                    C4941e1 c4941e1M4303a = C4941e1.m4303a(c4941e1, 0, 0, false, null, false, false, false, false, null, null, arrayListM5240t0, listM5240t0, false, null, null, null, false, false, null, null, false, null, false, 33548287);
                    arrayList2 = arrayListM5240t0;
                    if (c5946n0.m5569i(value2, c4941e1M4303a)) {
                        break;
                    }
                    arrayListM5240t0 = arrayList2;
                }
                mistakeNotebookViewModel.m4296h(new C4978t(arrayList2));
            } else {
                List<CustomTagInfo> list = ((C4941e1) mistakeNotebookViewModel.f7448d.getValue()).f7512l;
                ArrayList arrayList3 = new ArrayList(AbstractC5806u.m5277p(list, 10));
                for (CustomTagInfo customTagInfo2 : list) {
                    if (customTagInfo2.getId() == j7 && customTagInfo2.getLocalType() == -1) {
                        customTagInfo2.setName(str);
                    }
                    arrayList3.add(customTagInfo2);
                }
                C5946n0 c5946n02 = mistakeNotebookViewModel.f7448d;
                while (true) {
                    Object value3 = c5946n02.getValue();
                    C4941e1 c4941e12 = (C4941e1) value3;
                    List<CustomTagInfo> list2 = c4941e12.f7513m;
                    ArrayList arrayList4 = new ArrayList(AbstractC5806u.m5277p(list2, 10));
                    for (CustomTagInfo customTagInfo3 : list2) {
                        if (customTagInfo3.getId() == j7 && customTagInfo3.getLocalType() == -1) {
                            customTagInfo3.setName(str);
                        }
                        arrayList4.add(customTagInfo3);
                    }
                    arrayList = arrayList3;
                    if (c5946n02.m5569i(value3, C4941e1.m4303a(c4941e12, 0, 0, false, null, false, false, false, false, null, null, arrayList, arrayList4, false, null, null, null, false, false, null, null, false, null, false, 33548287))) {
                        break;
                    }
                    arrayList3 = arrayList;
                }
                mistakeNotebookViewModel.m4296h(new C4978t(arrayList));
            }
        }
        MistakeNotebookViewModel mistakeNotebookViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            mistakeNotebookViewModel2.getClass();
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            if (AbstractC5855p.m5372F(message, "重复", false)) {
                mistakeNotebookViewModel2.m4296h(C4963m.f7585a);
            } else {
                mistakeNotebookViewModel2.m4296h(C4966n.f7587a);
                String message2 = thM13959exceptionOrNullimpl.getMessage();
                mistakeNotebookViewModel2.m4296h(new C4986x(message2 != null ? message2 : ""));
            }
        }
        this.this$0.m4296h(C4968o.f7589a);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeNotebookViewModel$createOrEditCustomTag$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
