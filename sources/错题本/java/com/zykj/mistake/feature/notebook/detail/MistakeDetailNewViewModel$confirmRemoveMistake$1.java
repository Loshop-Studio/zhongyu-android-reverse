package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.entity.req.MultiRemoveMistakeReq;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.network.InterfaceC5090c;
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
import p137p4.C6386e;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$confirmRemoveMistake$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {2350}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2474:1\n230#2,5:2475\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1\n*L\n2353#1:2475,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$confirmRemoveMistake$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MultiRemoveMistakeReq $req;
    final /* synthetic */ C4837m3 $state;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$confirmRemoveMistake$1$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {2351}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$confirmRemoveMistake$1$1 */
    public static final class C47501 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ MultiRemoveMistakeReq $req;
        int label;
        final /* synthetic */ MistakeDetailNewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47501(MistakeDetailNewViewModel mistakeDetailNewViewModel, MultiRemoveMistakeReq multiRemoveMistakeReq, InterfaceC5631c<? super C47501> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeDetailNewViewModel;
            this.$req = multiRemoveMistakeReq;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C47501(this.this$0, this.$req, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
            return ((C47501) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            InterfaceC5090c interfaceC5090cM4116c = MistakeDetailNewViewModel.m4116c(this.this$0);
            MultiRemoveMistakeReq multiRemoveMistakeReq = this.$req;
            this.label = 1;
            Object objM4410b = interfaceC5090cM4116c.m4410b(multiRemoveMistakeReq, this);
            return objM4410b == coroutineSingletons ? coroutineSingletons : objM4410b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$confirmRemoveMistake$1(MistakeDetailNewViewModel mistakeDetailNewViewModel, MultiRemoveMistakeReq multiRemoveMistakeReq, C4837m3 c4837m3, InterfaceC5631c<? super MistakeDetailNewViewModel$confirmRemoveMistake$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$req = multiRemoveMistakeReq;
        this.$state = c4837m3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$confirmRemoveMistake$1(this.this$0, this.$req, this.$state, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        C4837m3 c4837m3;
        Integer num;
        C6386e c6386e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C47501 c47501 = new C47501(this.this$0, this.$req, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c47501, this);
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
        C4837m3 c4837m32 = this.$state;
        if (Result.m13962isSuccessimpl(value)) {
            C5946n0 c5946n0 = mistakeDetailNewViewModel.f6876e;
            do {
                value2 = c5946n0.getValue();
                c4837m3 = (C4837m3) value2;
                num = new Integer(c4837m32.f7149b);
                C4837m3 c4837m33 = (C4837m3) mistakeDetailNewViewModel.f6876e.getValue();
                c6386e = (C6386e) AbstractC5805t.m5230j0(c4837m33.f7139S, c4837m33.f7138R);
            } while (!c5946n0.m5569i(value2, C4837m3.m4207a(c4837m3, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, num, c6386e != null ? c6386e.f10476j : false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -25165825, -1, 1)));
            mistakeDetailNewViewModel.m4144S(C4793f1.f6986a);
            mistakeDetailNewViewModel.m4144S(new C4787e1(c4837m32.f7149b));
        }
        MistakeDetailNewViewModel mistakeDetailNewViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeDetailNewViewModel2.m4144S(new C4817j1(message));
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$confirmRemoveMistake$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
