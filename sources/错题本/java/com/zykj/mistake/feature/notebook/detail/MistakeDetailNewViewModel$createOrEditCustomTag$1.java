package com.zykj.mistake.feature.notebook.detail;

import android.view.ViewModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.entity.req.CreateTagReq;
import com.zykj.mistake.entity.resp.CreateOrEditTagResp;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.network.InterfaceC5090c;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p098k4.C5755a;
import p129o2.C6268a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$createOrEditCustomTag$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {2327}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$createOrEditCustomTag$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ long $id;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$createOrEditCustomTag$1$1", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {2327}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$createOrEditCustomTag$1$1 */
    public static final class C47511 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ long $id;
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ MistakeDetailNewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47511(MistakeDetailNewViewModel mistakeDetailNewViewModel, String str, long j7, InterfaceC5631c<? super C47511> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeDetailNewViewModel;
            this.$name = str;
            this.$id = j7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C47511(this.this$0, this.$name, this.$id, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super CreateOrEditTagResp> interfaceC5631c) {
            return ((C47511) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            C6268a c6268a = this.this$0.f6873b;
            CreateTagReq createTagReq = new CreateTagReq(this.$name, this.$id);
            this.label = 1;
            Object objM4418j = ((InterfaceC5090c) ((C5755a) c6268a.f10022b).f9107a.invoke()).m4418j(createTagReq, this);
            return objM4418j == coroutineSingletons ? coroutineSingletons : objM4418j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$createOrEditCustomTag$1(MistakeDetailNewViewModel mistakeDetailNewViewModel, String str, long j7, InterfaceC5631c<? super MistakeDetailNewViewModel$createOrEditCustomTag$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$name = str;
        this.$id = j7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$createOrEditCustomTag$1(this.this$0, this.$name, this.$id, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM3978a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            this.this$0.m4144S(C4805h1.f7013a);
            C47511 c47511 = new C47511(this.this$0, this.$name, this.$id, null);
            this.label = 1;
            objM3978a = AbstractC4496e.m3978a(c47511, this);
            if (objM3978a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            objM3978a = ((Result) obj).getValue();
        }
        MistakeDetailNewViewModel mistakeDetailNewViewModel = this.this$0;
        if (Result.m13962isSuccessimpl(objM3978a)) {
            mistakeDetailNewViewModel.getClass();
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(mistakeDetailNewViewModel), null, null, new MistakeDetailNewViewModel$requestApi$2(false, mistakeDetailNewViewModel, new MistakeDetailNewViewModel$loadCustomTags$1(mistakeDetailNewViewModel, null), new C4564j(14), new C4887v((Object) mistakeDetailNewViewModel, false, 1), null), 3);
        }
        MistakeDetailNewViewModel mistakeDetailNewViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM3978a);
        if (thM13959exceptionOrNullimpl != null) {
            mistakeDetailNewViewModel2.getClass();
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            if (AbstractC5855p.m5372F(message, "重复", false)) {
                mistakeDetailNewViewModel2.m4144S(C4882u0.f7335a);
            } else {
                mistakeDetailNewViewModel2.m4144S(C4888v0.f7355a);
                String message2 = thM13959exceptionOrNullimpl.getMessage();
                mistakeDetailNewViewModel2.m4144S(new C4817j1(message2 != null ? message2 : ""));
            }
        }
        this.this$0.m4144S(C4900x0.f7400a);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$createOrEditCustomTag$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
