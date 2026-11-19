package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class DefaultTransformableState implements TransformableState {
    private final InterfaceC9545q onTransformation;
    private final TransformScope transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
        @Override // androidx.compose.foundation.gestures.TransformScope
        /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
        public void mo27136transformByd4ec7I(float f10, long j10, float f11) {
            this.this$0.getOnTransformation().invoke(Float.valueOf(f10), Offset.m30626boximpl(j10), Float.valueOf(f11));
        }
    };
    private final MutatorMutex transformMutex = new MutatorMutex();
    private final MutableState<Boolean> isTransformingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", m26211f = "TransformableState.kt", m26212l = {443}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2 */
    public static final class C12852 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ MutatePriority $transformPriority;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", m26211f = "TransformableState.kt", m26212l = {446}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9544p $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultTransformableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DefaultTransformableState defaultTransformableState, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = defaultTransformableState;
                this.$block = interfaceC9544p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        TransformScope transformScope = (TransformScope) this.L$0;
                        this.this$0.isTransformingState.setValue(AbstractC11826a.m26206a(true));
                        InterfaceC9544p interfaceC9544p = this.$block;
                        this.label = 1;
                        if (interfaceC9544p.invoke(transformScope, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    this.this$0.isTransformingState.setValue(AbstractC11826a.m26206a(false));
                    return C10786q.f26013a;
                } catch (Throwable th) {
                    this.this$0.isTransformingState.setValue(AbstractC11826a.m26206a(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12852(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C12852> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$transformPriority = mutatePriority;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return DefaultTransformableState.this.new C12852(this.$transformPriority, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                MutatorMutex mutatorMutex = DefaultTransformableState.this.transformMutex;
                TransformScope transformScope = DefaultTransformableState.this.transformScope;
                MutatePriority mutatePriority = this.$transformPriority;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DefaultTransformableState.this, this.$block, null);
                this.label = 1;
                if (mutatorMutex.mutateWith(transformScope, mutatePriority, anonymousClass1, this) == objM25952f) {
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
            return ((C12852) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public DefaultTransformableState(InterfaceC9545q interfaceC9545q) {
        this.onTransformation = interfaceC9545q;
    }

    public final InterfaceC9545q getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C12852(mutatePriority, interfaceC9544p, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }
}
