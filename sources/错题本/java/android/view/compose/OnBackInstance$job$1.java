package android.view.compose;

import android.view.OnBackPressedCallback;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.C5904c;
import kotlinx.coroutines.flow.C5937j;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.activity.compose.OnBackInstance$job$1", m5303f = "PredictiveBackHandler.kt", m5304i = {0}, m5305l = {121}, m5306m = "invokeSuspend", m5307n = {"completed"}, m5308s = {"L$0"})
@SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/OnBackInstance$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* loaded from: classes.dex */
public final class OnBackInstance$job$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ OnBackPressedCallback $callback;
    final /* synthetic */ InterfaceC6473e $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    @Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {"Lkotlinx/coroutines/flow/g;", "Landroidx/activity/BackEventCompat;", "", "it", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/g;Ljava/lang/Throwable;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.activity.compose.OnBackInstance$job$1$1", m5303f = "PredictiveBackHandler.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1 */
    public static final class C00741 extends SuspendLambda implements InterfaceC6474f {
        final /* synthetic */ Ref$BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00741(Ref$BooleanRef ref$BooleanRef, InterfaceC5631c<? super C00741> interfaceC5631c) {
            super(3, interfaceC5631c);
            this.$completed = ref$BooleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            this.$completed.element = true;
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6474f
        public final Object invoke(InterfaceC5912g interfaceC5912g, Throwable th, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return new C00741(this.$completed, interfaceC5631c).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInstance$job$1(OnBackPressedCallback onBackPressedCallback, InterfaceC6473e interfaceC6473e, OnBackInstance onBackInstance, InterfaceC5631c<? super OnBackInstance$job$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$callback = onBackPressedCallback;
        this.$onBack = interfaceC6473e;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new OnBackInstance$job$1(this.$callback, this.$onBack, this.this$0, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            if (this.$callback.getIsEnabled()) {
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                InterfaceC6473e interfaceC6473e = this.$onBack;
                C5937j c5937j = new C5937j(new C5904c(this.this$0.getChannel(), true), new C00741(ref$BooleanRef2, null));
                this.L$0 = ref$BooleanRef2;
                this.label = 1;
                if (interfaceC6473e.invoke(c5937j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
            }
            return C5443s.f8405a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$BooleanRef = (Ref$BooleanRef) this.L$0;
        AbstractC5774b.m5119b(obj);
        if (!ref$BooleanRef.element) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((OnBackInstance$job$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
