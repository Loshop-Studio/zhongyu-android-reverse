package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p157k8.InterfaceC9071g;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class FlowExtKt {

    @InterfaceC9539d(m17800c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m17801f = "FlowExt.kt", m17802l = {90}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 */
    public static final class C40361 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ InterfaceC9266c $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m17801f = "FlowExt.kt", m17802l = {90}, m17803m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC9071g $$this$callbackFlow;
            final /* synthetic */ InterfaceC9266c $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC9266c interfaceC9266c, InterfaceC9071g interfaceC9071g, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$this_flowWithLifecycle = interfaceC9266c;
                this.$$this$callbackFlow = interfaceC9071g;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9266c interfaceC9266c = this.$this_flowWithLifecycle;
                    final InterfaceC9071g interfaceC9071g = this.$$this$callbackFlow;
                    InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // p169l8.InterfaceC9267d
                        public final Object emit(T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                            Object objSend = interfaceC9071g.send(t10, interfaceC9324c);
                            return objSend == AbstractC9434a.m17291f() ? objSend : C8736p.f16368a;
                        }
                    };
                    this.label = 1;
                    if (interfaceC9266c.collect(interfaceC9267d, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40361(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9266c interfaceC9266c, InterfaceC9324c<? super C40361> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = interfaceC9266c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C40361 c40361 = new C40361(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC9324c);
            c40361.L$0 = obj;
            return c40361;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC9071g interfaceC9071g;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9071g interfaceC9071g2 = (InterfaceC9071g) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, interfaceC9071g2, null);
                this.L$0 = interfaceC9071g2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
                interfaceC9071g = interfaceC9071g2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC9071g = (InterfaceC9071g) this.L$0;
                AbstractC9079b.m15926b(obj);
            }
            InterfaceC9163f.a.m16549a(interfaceC9071g, null, 1, null);
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9071g interfaceC9071g, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40361) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public static final <T> InterfaceC9266c flowWithLifecycle(InterfaceC9266c interfaceC9266c, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(lifecycle, "lifecycle");
        AbstractC9133u.m16133g(minActiveState, "minActiveState");
        return AbstractC9268e.m17015e(new C40361(lifecycle, minActiveState, interfaceC9266c, null));
    }

    public static /* synthetic */ InterfaceC9266c flowWithLifecycle$default(InterfaceC9266c interfaceC9266c, Lifecycle lifecycle, Lifecycle.State state, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC9266c, lifecycle, state);
    }
}
