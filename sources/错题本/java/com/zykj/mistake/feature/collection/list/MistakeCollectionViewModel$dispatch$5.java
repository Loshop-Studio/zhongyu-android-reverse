package com.zykj.mistake.feature.collection.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.AbstractC4496e;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.resp.CreateOrUpdateCollectionResp;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract$EntryMode;
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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$dispatch$5", m5303f = "MistakeCollectionViewModel.kt", m5304i = {}, m5305l = {71}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
@SourceDebugExtension({"SMAP\nMistakeCollectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$dispatch$5\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,255:1\n230#2,5:256\n230#2,5:261\n230#2,5:266\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$dispatch$5\n*L\n77#1:256,5\n96#1:261,5\n103#1:266,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeCollectionViewModel$dispatch$5 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ MistakeCollectionViewModel this$0;

    @Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$dispatch$5$1", m5303f = "MistakeCollectionViewModel.kt", m5304i = {}, m5305l = {72}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$dispatch$5$1 */
    public static final class C46961 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ MistakeCollectionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46961(MistakeCollectionViewModel mistakeCollectionViewModel, String str, InterfaceC5631c<? super C46961> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.this$0 = mistakeCollectionViewModel;
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C46961(this.this$0, this.$name, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super CreateOrUpdateCollectionResp> interfaceC5631c) {
            return ((C46961) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
            String str = this.$name;
            this.label = 1;
            Object objM3972b = c4492a.m3972b(0, str, this);
            return objM3972b == coroutineSingletons ? coroutineSingletons : objM3972b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionViewModel$dispatch$5(MistakeCollectionViewModel mistakeCollectionViewModel, String str, InterfaceC5631c<? super MistakeCollectionViewModel$dispatch$5> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionViewModel;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionViewModel$dispatch$5(this.this$0, this.$name, interfaceC5631c);
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
            C46961 c46961 = new C46961(this.this$0, this.$name, null);
            this.label = 1;
            Object objM3978a = AbstractC4496e.m3978a(c46961, this);
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
        MistakeCollectionViewModel mistakeCollectionViewModel = this.this$0;
        if (Result.m13962isSuccessimpl(value)) {
            CreateOrUpdateCollectionResp createOrUpdateCollectionResp = (CreateOrUpdateCollectionResp) value;
            C5946n0 c5946n0 = mistakeCollectionViewModel.f6735b;
            do {
                value4 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value4, C4723v.m4099a((C4723v) value4, 0, null, false, false, "", "", false, false, null, 3135)));
            mistakeCollectionViewModel.m4091c(C4703c.f6754a);
            mistakeCollectionViewModel.m4091c(new C4705d(String.valueOf(createOrUpdateCollectionResp.getResult().getId()), createOrUpdateCollectionResp.getResult().getName(), 0, MistakeCollectionDetailContract$EntryMode.CREATED));
        }
        MistakeCollectionViewModel mistakeCollectionViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(value);
        if (thM13959exceptionOrNullimpl != null) {
            mistakeCollectionViewModel2.getClass();
            C5946n0 c5946n02 = mistakeCollectionViewModel2.f6735b;
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            if (AbstractC5855p.m5372F(message, "该名称已存在", false)) {
                do {
                    value3 = c5946n02.getValue();
                } while (!c5946n02.m5569i(value3, C4723v.m4099a((C4723v) value3, 0, null, false, false, null, "该名称已存在", false, false, null, 3327)));
            } else {
                do {
                    value2 = c5946n02.getValue();
                } while (!c5946n02.m5569i(value2, C4723v.m4099a((C4723v) value2, 0, null, false, false, null, null, false, false, null, 3583)));
                String message2 = thM13959exceptionOrNullimpl.getMessage();
                mistakeCollectionViewModel2.m4091c(new C4707f(message2 != null ? message2 : ""));
            }
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeCollectionViewModel$dispatch$5) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
