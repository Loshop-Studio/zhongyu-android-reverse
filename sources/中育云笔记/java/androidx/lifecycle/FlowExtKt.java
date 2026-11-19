package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class FlowExtKt {

    @InterfaceC11829d(m26210c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m26211f = "FlowExt.kt", m26212l = {C7843ab.b.API_MYNA_INIT}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 */
    public static final class C39101 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ InterfaceC11594c $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m26211f = "FlowExt.kt", m26212l = {C7843ab.b.API_MYNA_INIT}, m26213m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC11395j $$this$callbackFlow;
            final /* synthetic */ InterfaceC11594c $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC11594c interfaceC11594c, InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$this_flowWithLifecycle = interfaceC11594c;
                this.$$this$callbackFlow = interfaceC11395j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11594c interfaceC11594c = this.$this_flowWithLifecycle;
                    final InterfaceC11395j interfaceC11395j = this.$$this$callbackFlow;
                    InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // p379vd.InterfaceC11595d
                        public final Object emit(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            Object objSend = interfaceC11395j.send(t10, interfaceC11588c);
                            return objSend == AbstractC11725a.m25952f() ? objSend : C10786q.f26013a;
                        }
                    };
                    this.label = 1;
                    if (interfaceC11594c.collect(interfaceC11595d, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39101(Lifecycle lifecycle, Lifecycle.State state, InterfaceC11594c interfaceC11594c, InterfaceC11588c<? super C39101> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = interfaceC11594c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C39101 c39101 = new C39101(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC11588c);
            c39101.L$0 = obj;
            return c39101;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11395j interfaceC11395j;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11395j interfaceC11395j2 = (InterfaceC11395j) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, interfaceC11395j2, null);
                this.L$0 = interfaceC11395j2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
                interfaceC11395j = interfaceC11395j2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC11395j = (InterfaceC11395j) this.L$0;
                AbstractC9924b.m20071b(obj);
            }
            InterfaceC10005f.a.m20742a(interfaceC11395j, null, 1, null);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39101) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <T> InterfaceC11594c flowWithLifecycle(InterfaceC11594c interfaceC11594c, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(lifecycle, "lifecycle");
        AbstractC9979u.m20294g(minActiveState, "minActiveState");
        return AbstractC11596e.m25555e(new C39101(lifecycle, minActiveState, interfaceC11594c, null));
    }

    public static /* synthetic */ InterfaceC11594c flowWithLifecycle$default(InterfaceC11594c interfaceC11594c, Lifecycle lifecycle, Lifecycle.State state, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC11594c, lifecycle, state);
    }
}
