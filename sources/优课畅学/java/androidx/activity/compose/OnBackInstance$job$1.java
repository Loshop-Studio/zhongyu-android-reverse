package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.activity.compose.OnBackInstance$job$1", m17801f = "PredictiveBackHandler.kt", m17802l = {TbsListener.ErrorCode.THREAD_INIT_ERROR}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OnBackInstance$job$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ OnBackPressedCallback $callback;
    final /* synthetic */ InterfaceC10574p $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    @InterfaceC9539d(m17800c = "androidx.activity.compose.OnBackInstance$job$1$1", m17801f = "PredictiveBackHandler.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1 */
    public static final class C01161 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ Ref$BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01161(Ref$BooleanRef ref$BooleanRef, InterfaceC9324c<? super C01161> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$completed = ref$BooleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            this.$completed.f17469a = true;
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(InterfaceC9267d interfaceC9267d, Throwable th, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return new C01161(this.$completed, interfaceC9324c).invokeSuspend(C8736p.f16368a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInstance$job$1(OnBackPressedCallback onBackPressedCallback, InterfaceC10574p interfaceC10574p, OnBackInstance onBackInstance, InterfaceC9324c<? super OnBackInstance$job$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$callback = onBackPressedCallback;
        this.$onBack = interfaceC10574p;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new OnBackInstance$job$1(this.$callback, this.$onBack, this.this$0, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((OnBackInstance$job$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$BooleanRef ref$BooleanRef;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            if (this.$callback.isEnabled()) {
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                InterfaceC10574p interfaceC10574p = this.$onBack;
                InterfaceC9266c interfaceC9266cM16999K = AbstractC9268e.m16999K(AbstractC9268e.m17023m(this.this$0.getChannel()), new C01161(ref$BooleanRef2, null));
                this.L$0 = ref$BooleanRef2;
                this.label = 1;
                if (interfaceC10574p.invoke(interfaceC9266cM16999K, this) == objM17291f) {
                    return objM17291f;
                }
                ref$BooleanRef = ref$BooleanRef2;
            }
            return C8736p.f16368a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$BooleanRef = (Ref$BooleanRef) this.L$0;
        AbstractC9079b.m15926b(obj);
        if (!ref$BooleanRef.f17469a) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return C8736p.f16368a;
    }
}
