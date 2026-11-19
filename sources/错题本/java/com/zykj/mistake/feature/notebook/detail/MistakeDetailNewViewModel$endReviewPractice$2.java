package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.network.InterfaceC5090c;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$endReviewPractice$2", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {1195}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$endReviewPractice$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2474:1\n230#2,5:2475\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$endReviewPractice$2\n*L\n1205#1:2475,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$endReviewPractice$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $hasVisibleDialog;
    final /* synthetic */ Long $numericSessionId;
    final /* synthetic */ boolean $refreshNotebook;
    final /* synthetic */ boolean $refreshReviewHome;
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$endReviewPractice$2$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {1196}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$endReviewPractice$2$1 */
    public static final class C47521 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ Long $numericSessionId;
        int label;
        final /* synthetic */ MistakeDetailNewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47521(MistakeDetailNewViewModel mistakeDetailNewViewModel, Long l, InterfaceC5631c<? super C47521> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeDetailNewViewModel;
            this.$numericSessionId = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C47521(this.this$0, this.$numericSessionId, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
            return ((C47521) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            long jLongValue = this.$numericSessionId.longValue();
            this.label = 1;
            Object objM4408E = interfaceC5090cM4116c.m4408E(jLongValue, this);
            return objM4408E == coroutineSingletons ? coroutineSingletons : objM4408E;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$endReviewPractice$2(MistakeDetailNewViewModel mistakeDetailNewViewModel, Long l, String str, boolean z8, boolean z9, boolean z10, InterfaceC5631c<? super MistakeDetailNewViewModel$endReviewPractice$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$numericSessionId = l;
        this.$sessionId = str;
        this.$hasVisibleDialog = z8;
        this.$refreshNotebook = z9;
        this.$refreshReviewHome = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$endReviewPractice$2(this.this$0, this.$numericSessionId, this.$sessionId, this.$hasVisibleDialog, this.$refreshNotebook, this.$refreshReviewHome, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            this.this$0.m4144S(C4805h1.f7013a);
            C47521 c47521 = new C47521(this.this$0, this.$numericSessionId, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c47521, this);
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
        String str = this.$sessionId;
        boolean z8 = this.$hasVisibleDialog;
        boolean z9 = this.$refreshNotebook;
        boolean z10 = this.$refreshReviewHome;
        if (Result.m13962isSuccessimpl(value)) {
            mistakeDetailNewViewModel.m4164y(str, z8, z9, z10);
        }
        MistakeDetailNewViewModel mistakeDetailNewViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            C5946n0 c5946n0 = mistakeDetailNewViewModel2.f6876e;
            do {
                value2 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value2, C4837m3.m4207a((C4837m3) value2, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -1073741825, 1)));
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeDetailNewViewModel2.m4144S(new C4817j1(message));
        }
        this.this$0.m4144S(C4900x0.f7400a);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$endReviewPractice$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
