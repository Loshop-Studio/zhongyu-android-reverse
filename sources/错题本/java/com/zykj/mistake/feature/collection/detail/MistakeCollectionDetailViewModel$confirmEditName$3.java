package com.zykj.mistake.feature.collection.detail;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.resp.CreateOrUpdateCollectionResp;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.C5946n0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$confirmEditName$3", m5303f = "MistakeCollectionDetailViewModel.kt", m5304i = {}, m5305l = {TypedValues.PositionType.TYPE_CURVE_FIT}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeCollectionDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,663:1\n230#2,5:664\n230#2,5:669\n230#2,5:674\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmEditName$3\n*L\n515#1:664,5\n528#1:669,5\n535#1:674,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeCollectionDetailViewModel$confirmEditName$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ MistakeCollectionDetailViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$confirmEditName$3$1", m5303f = "MistakeCollectionDetailViewModel.kt", m5304i = {}, m5305l = {509}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$confirmEditName$3$1 */
    public static final class C45731 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ MistakeCollectionDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45731(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, String str, InterfaceC5631c<? super C45731> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionDetailViewModel;
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C45731(this.this$0, this.$name, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super CreateOrUpdateCollectionResp> interfaceC5631c) {
            return ((C45731) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws NumberFormatException {
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
            MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel = this.this$0;
            C4492a c4492a = mistakeCollectionDetailViewModel.f6435a;
            int i8 = Integer.parseInt(((C4632z0) mistakeCollectionDetailViewModel.f6437c.getValue()).f6546a);
            String str = this.$name;
            this.label = 1;
            Object objM3972b = c4492a.m3972b(i8, str, this);
            return objM3972b == coroutineSingletons ? coroutineSingletons : objM3972b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionDetailViewModel$confirmEditName$3(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, String str, InterfaceC5631c<? super MistakeCollectionDetailViewModel$confirmEditName$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionDetailViewModel;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionDetailViewModel$confirmEditName$3(this.this$0, this.$name, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C45731 c45731 = new C45731(this.this$0, this.$name, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c45731, this);
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
        MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel = this.this$0;
        if (Result.m13962isSuccessimpl(value)) {
            CreateOrUpdateCollectionResp createOrUpdateCollectionResp = (CreateOrUpdateCollectionResp) value;
            C5946n0 c5946n0 = mistakeCollectionDetailViewModel.f6437c;
            do {
                value4 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value4, C4632z0.m4054a((C4632z0) value4, null, createOrUpdateCollectionResp.getResult().getName(), 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, "", "", false, false, null, false, false, 536870909, 30)));
            mistakeCollectionDetailViewModel.m4033j(C4601k.f6505a);
        }
        MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            mistakeCollectionDetailViewModel2.getClass();
            C5946n0 c5946n02 = mistakeCollectionDetailViewModel2.f6437c;
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            if (AbstractC5855p.m5372F(message, "该名称已存在", false)) {
                do {
                    value3 = c5946n02.getValue();
                } while (!c5946n02.m5569i(value3, C4632z0.m4054a((C4632z0) value3, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, "该名称已存在", false, false, null, false, false, Integer.MAX_VALUE, 30)));
            } else {
                do {
                    value2 = c5946n02.getValue();
                } while (!c5946n02.m5569i(value2, C4632z0.m4054a((C4632z0) value2, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, null, false, false, -1, 30)));
                String message2 = thM13959exceptionOrNullimpl.getMessage();
                mistakeCollectionDetailViewModel2.m4033j(new C4603l(message2 != null ? message2 : ""));
            }
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeCollectionDetailViewModel$confirmEditName$3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
