package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class DefaultScrollableState implements ScrollableState {
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private final MutableState<Boolean> isScrollingState;
    private final InterfaceC9540l onDelta;
    private final ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            float fFloatValue = ((Number) this.this$0.getOnDelta().invoke(Float.valueOf(f10))).floatValue();
            this.this$0.isLastScrollForwardState.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            this.this$0.isLastScrollBackwardState.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", m26211f = "ScrollableState.kt", m26212l = {Opcodes.IFNULL}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2 */
    public static final class C12842 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ MutatePriority $scrollPriority;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", m26211f = "ScrollableState.kt", m26212l = {201}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9544p $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultScrollableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DefaultScrollableState defaultScrollableState, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = defaultScrollableState;
                this.$block = interfaceC9544p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        ScrollScope scrollScope = (ScrollScope) this.L$0;
                        this.this$0.isScrollingState.setValue(AbstractC11826a.m26206a(true));
                        InterfaceC9544p interfaceC9544p = this.$block;
                        this.label = 1;
                        if (interfaceC9544p.invoke(scrollScope, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    this.this$0.isScrollingState.setValue(AbstractC11826a.m26206a(false));
                    return C10786q.f26013a;
                } catch (Throwable th) {
                    this.this$0.isScrollingState.setValue(AbstractC11826a.m26206a(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12842(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C12842> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$scrollPriority = mutatePriority;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return DefaultScrollableState.this.new C12842(this.$scrollPriority, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                MutatorMutex mutatorMutex = DefaultScrollableState.this.scrollMutex;
                ScrollScope scrollScope = DefaultScrollableState.this.scrollScope;
                MutatePriority mutatePriority = this.$scrollPriority;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DefaultScrollableState.this, this.$block, null);
                this.label = 1;
                if (mutatorMutex.mutateWith(scrollScope, mutatePriority, anonymousClass1, this) == objM25952f) {
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
            return ((C12842) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public DefaultScrollableState(InterfaceC9540l interfaceC9540l) {
        this.onDelta = interfaceC9540l;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f10) {
        return ((Number) this.onDelta.invoke(Float.valueOf(f10))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    public final InterfaceC9540l getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C12842(mutatePriority, interfaceC9544p, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }
}
