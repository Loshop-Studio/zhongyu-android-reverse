package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC9165e;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
final class DefaultTransformableState implements TransformableState {
    private final InterfaceC10575q onTransformation;
    private final TransformScope transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
        @Override // androidx.compose.foundation.gestures.TransformScope
        /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
        public void mo20534transformByd4ec7I(float f10, long j10, float f11) {
            this.this$0.getOnTransformation().invoke(Float.valueOf(f10), Offset.m24024boximpl(j10), Float.valueOf(f11));
        }
    };
    private final MutatorMutex transformMutex = new MutatorMutex();
    private final MutableState<Boolean> isTransformingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", m17801f = "TransformableState.kt", m17802l = {443}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2 */
    public static final class C12552 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ MutatePriority $transformPriority;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", m17801f = "TransformableState.kt", m17802l = {446}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC10574p $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultTransformableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DefaultTransformableState defaultTransformableState, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = defaultTransformableState;
                this.$block = interfaceC10574p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        TransformScope transformScope = (TransformScope) this.L$0;
                        this.this$0.isTransformingState.setValue(AbstractC9536a.m17796a(true));
                        InterfaceC10574p interfaceC10574p = this.$block;
                        this.label = 1;
                        if (interfaceC10574p.invoke(transformScope, this) == objM17291f) {
                            return objM17291f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9079b.m15926b(obj);
                    }
                    this.this$0.isTransformingState.setValue(AbstractC9536a.m17796a(false));
                    return C8736p.f16368a;
                } catch (Throwable th) {
                    this.this$0.isTransformingState.setValue(AbstractC9536a.m17796a(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12552(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C12552> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$transformPriority = mutatePriority;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return DefaultTransformableState.this.new C12552(this.$transformPriority, this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12552) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                MutatorMutex mutatorMutex = DefaultTransformableState.this.transformMutex;
                TransformScope transformScope = DefaultTransformableState.this.transformScope;
                MutatePriority mutatePriority = this.$transformPriority;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DefaultTransformableState.this, this.$block, null);
                this.label = 1;
                if (mutatorMutex.mutateWith(transformScope, mutatePriority, anonymousClass1, this) == objM17291f) {
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

    public DefaultTransformableState(InterfaceC10575q interfaceC10575q) {
        this.onTransformation = interfaceC10575q;
    }

    public final InterfaceC10575q getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C12552(mutatePriority, interfaceC10574p, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }
}
