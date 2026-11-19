package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.activity.compose.OnBackInstance$job$1", m26211f = "PredictiveBackHandler.kt", m26212l = {PatchStatus.CODE_LOAD_RES_INJECT_PATH}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OnBackInstance$job$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ OnBackPressedCallback $callback;
    final /* synthetic */ InterfaceC9544p $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    @InterfaceC11829d(m26210c = "androidx.activity.compose.OnBackInstance$job$1$1", m26211f = "PredictiveBackHandler.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1 */
    public static final class C01801 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ Ref$BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01801(Ref$BooleanRef ref$BooleanRef, InterfaceC11588c<? super C01801> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$completed = ref$BooleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            this.$completed.f23398c = true;
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(InterfaceC11595d interfaceC11595d, Throwable th, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return new C01801(this.$completed, interfaceC11588c).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInstance$job$1(OnBackPressedCallback onBackPressedCallback, InterfaceC9544p interfaceC9544p, OnBackInstance onBackInstance, InterfaceC11588c<? super OnBackInstance$job$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$callback = onBackPressedCallback;
        this.$onBack = interfaceC9544p;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new OnBackInstance$job$1(this.$callback, this.$onBack, this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$BooleanRef ref$BooleanRef;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.$callback.isEnabled()) {
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                InterfaceC9544p interfaceC9544p = this.$onBack;
                InterfaceC11594c interfaceC11594cM25539J = AbstractC11596e.m25539J(AbstractC11596e.m25562l(this.this$0.getChannel()), new C01801(ref$BooleanRef2, null));
                this.L$0 = ref$BooleanRef2;
                this.label = 1;
                if (interfaceC9544p.invoke(interfaceC11594cM25539J, this) == objM25952f) {
                    return objM25952f;
                }
                ref$BooleanRef = ref$BooleanRef2;
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$BooleanRef = (Ref$BooleanRef) this.L$0;
        AbstractC9924b.m20071b(obj);
        if (!ref$BooleanRef.f23398c) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((OnBackInstance$job$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
