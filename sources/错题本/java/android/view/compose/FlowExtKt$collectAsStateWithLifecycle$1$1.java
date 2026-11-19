package android.view.compose;

import android.view.Lifecycle;
import android.view.RepeatOnLifecycleKt;
import androidx.compose.runtime.ProduceStateScope;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/ProduceStateScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/runtime/ProduceStateScope;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
@DebugMetadata(m5302c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", m5303f = "FlowExt.kt", m5304i = {}, m5305l = {177}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
public final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC5636h $context;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ InterfaceC5910f $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", m5303f = "FlowExt.kt", m5304i = {}, m5305l = {179, 181}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1 */
    public static final class C27441 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ ProduceStateScope<T> $$this$produceState;
        final /* synthetic */ InterfaceC5636h $context;
        final /* synthetic */ InterfaceC5910f $this_collectAsStateWithLifecycle;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
        @DebugMetadata(m5302c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", m5303f = "FlowExt.kt", m5304i = {}, m5305l = {182}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ ProduceStateScope<T> $$this$produceState;
            final /* synthetic */ InterfaceC5910f $this_collectAsStateWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC5910f interfaceC5910f, ProduceStateScope<T> produceStateScope, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$this_collectAsStateWithLifecycle = interfaceC5910f;
                this.$$this$produceState = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC5910f interfaceC5910f = this.$this_collectAsStateWithLifecycle;
                    final ProduceStateScope<T> produceStateScope = this.$$this$produceState;
                    InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle.1.1.1.2.1
                        @Override // kotlinx.coroutines.flow.InterfaceC5912g
                        public final Object emit(T t8, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            produceStateScope.setValue(t8);
                            return C5443s.f8405a;
                        }
                    };
                    this.label = 1;
                    if (interfaceC5910f.collect(interfaceC5912g, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                }
                return C5443s.f8405a;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27441(InterfaceC5636h interfaceC5636h, InterfaceC5910f interfaceC5910f, ProduceStateScope<T> produceStateScope, InterfaceC5631c<? super C27441> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$context = interfaceC5636h;
            this.$this_collectAsStateWithLifecycle = interfaceC5910f;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C27441(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, interfaceC5631c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r7.collect(r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (kotlinx.coroutines.AbstractC6014x.m5626F(r7, r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L15:
                kotlin.AbstractC5774b.m5119b(r7)
                goto L4d
            L19:
                kotlin.AbstractC5774b.m5119b(r7)
                h6.h r7 = r6.$context
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                boolean r7 = kotlin.jvm.internal.AbstractC5830k.m5325b(r7, r1)
                if (r7 == 0) goto L38
                kotlinx.coroutines.flow.f r7 = r6.$this_collectAsStateWithLifecycle
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1
                androidx.compose.runtime.ProduceStateScope<T> r2 = r6.$$this$produceState
                r1.<init>()
                r6.label = r3
                java.lang.Object r7 = r7.collect(r1, r6)
                if (r7 != r0) goto L4d
                goto L4c
            L38:
                h6.h r7 = r6.$context
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
                kotlinx.coroutines.flow.f r3 = r6.$this_collectAsStateWithLifecycle
                androidx.compose.runtime.ProduceStateScope<T> r4 = r6.$$this$produceState
                r5 = 0
                r1.<init>(r3, r4, r5)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.AbstractC6014x.m5626F(r7, r1, r6)
                if (r7 != r0) goto L4d
            L4c:
                return r0
            L4d:
                d6.s r7 = p045d6.C5443s.f8405a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: android.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.C27441.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C27441) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC5636h interfaceC5636h, InterfaceC5910f interfaceC5910f, InterfaceC5631c<? super FlowExtKt$collectAsStateWithLifecycle$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$context = interfaceC5636h;
        this.$this_collectAsStateWithLifecycle = interfaceC5910f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, interfaceC5631c);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(ProduceStateScope<T> produceStateScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create(produceStateScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            C27441 c27441 = new C27441(this.$context, this.$this_collectAsStateWithLifecycle, produceStateScope, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c27441, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }
}
