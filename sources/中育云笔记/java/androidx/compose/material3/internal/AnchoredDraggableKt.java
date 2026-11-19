package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.SnapshotStateKt;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.collections.AbstractC9925a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class AnchoredDraggableKt {

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", m26211f = "AnchoredDraggable.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1 */
    public static final class C24581 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", m26211f = "AnchoredDraggable.kt", m26212l = {Opcodes.RETURN}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ AnchoredDraggableState<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, float f10, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$state = anchoredDraggableState;
                this.$velocity = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$state, this.$velocity, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                    float f10 = this.$velocity;
                    this.label = 1;
                    if (anchoredDraggableState.settle(f10, this) == objM25952f) {
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
        public C24581(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC11588c<? super C24581> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$state = anchoredDraggableState;
        }

        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC11122i0) obj, ((Number) obj2).floatValue(), (InterfaceC11588c<? super C10786q>) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AbstractC11117h.m24726d((InterfaceC11122i0) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
            return C10786q.f26013a;
        }

        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C24581 c24581 = new C24581(this.$state, interfaceC11588c);
            c24581.L$0 = interfaceC11122i0;
            c24581.F$0 = f10;
            return c24581.invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", m26211f = "AnchoredDraggable.kt", m26212l = {685}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2 */
    public static final class C24592 extends SuspendLambda implements InterfaceC9546r {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24592(AnchoredDraggableState<T> anchoredDraggableState, float f10, InterfaceC11588c<? super C24592> interfaceC11588c) {
            super(4, interfaceC11588c);
            this.$this_animateTo = anchoredDraggableState;
            this.$velocity = f10;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C24592 c24592 = new C24592(this.$this_animateTo, this.$velocity, interfaceC11588c);
            c24592.L$0 = anchoredDragScope;
            c24592.L$1 = draggableAnchors;
            c24592.L$2 = t10;
            return c24592.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                    ref$FloatRef.f23399c = offset;
                    float f10 = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                    InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.material3.internal.AnchoredDraggableKt.animateTo.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                            return C10786q.f26013a;
                        }

                        public final void invoke(float f11, float f12) {
                            anchoredDragScope.dragTo(f11, f12);
                            ref$FloatRef.f23399c = f11;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(offset, fPositionOf, f10, animationSpec, interfaceC9544p, this) == objM25952f) {
                        return objM25952f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC11588c<? super C10786q>) obj4);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableKt", m26211f = "AnchoredDraggable.kt", m26212l = {713}, m26213m = "restartable")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 */
    public static final class C24601<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24601(InterfaceC11588c<? super C24601> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", m26211f = "AnchoredDraggable.kt", m26212l = {715}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 */
    public static final class C24612 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ InterfaceC9529a $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC11595d {
            final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC9544p $block;
            final /* synthetic */ Ref$ObjectRef<InterfaceC10045g> $previousDrag;

            @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", m26211f = "AnchoredDraggable.kt", m26212l = {722}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
                final /* synthetic */ InterfaceC9544p $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC9544p interfaceC9544p, I i10, InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$block = interfaceC9544p;
                    this.$latestInputs = i10;
                    this.$$this$coroutineScope = interfaceC11122i0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC9544p interfaceC9544p = this.$block;
                        Object obj2 = this.$latestInputs;
                        this.label = 1;
                        if (interfaceC9544p.invoke(obj2, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    AbstractC10006d.m20746c(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            public AnonymousClass1(Ref$ObjectRef<InterfaceC10045g> ref$ObjectRef, InterfaceC11122i0 interfaceC11122i0, InterfaceC9544p interfaceC9544p) {
                this.$previousDrag = ref$ObjectRef;
                this.$$this$coroutineScope = interfaceC11122i0;
                this.$block = interfaceC9544p;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p379vd.InterfaceC11595d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.g r8 = (kotlinx.coroutines.InterfaceC10045g) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C24612.AnonymousClass1) r0
                    kotlin.AbstractC9924b.m20071b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.AbstractC9924b.m20071b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.g> r9 = r7.$previousDrag
                    java.lang.Object r9 = r9.f23402c
                    kotlinx.coroutines.g r9 = (kotlinx.coroutines.InterfaceC10045g) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.material3.internal.AnchoredDragFinishedSignal r2 = new androidx.compose.material3.internal.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.cancel(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.mo20458v(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.g> r9 = r0.$previousDrag
                    sd.i0 r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.f23479f
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2
                    hd.p r0 = r0.$block
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    kotlinx.coroutines.g r8 = sd.AbstractC11109f.m24706d(r1, r2, r3, r4, r5, r6)
                    r9.f23402c = r8
                    qc.q r8 = p309qc.C10786q.f26013a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.C24612.AnonymousClass1.emit(java.lang.Object, vc.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24612(InterfaceC9529a interfaceC9529a, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C24612> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$inputs = interfaceC9529a;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C24612 c24612 = new C24612(this.$inputs, this.$block, interfaceC11588c);
            c24612.L$0 = obj;
            return c24612;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, interfaceC11122i0, this.$block);
                this.label = 1;
                if (interfaceC11594cSnapshotFlow.collect(anonymousClass1, this) == objM25952f) {
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
            return ((C24612) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", m26211f = "AnchoredDraggable.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2 */
    public static final class C24622 extends SuspendLambda implements InterfaceC9546r {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C24622(InterfaceC11588c<? super C24622> interfaceC11588c) {
            super(4, interfaceC11588c);
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C24622 c24622 = new C24622(interfaceC11588c);
            c24622.L$0 = anchoredDragScope;
            c24622.L$1 = draggableAnchors;
            c24622.L$2 = t10;
            return c24622.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC11588c<? super C10786q>) obj4);
        }
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(InterfaceC9540l interfaceC9540l) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        interfaceC9540l.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material3_release());
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState$material3_release(), orientation, z10, mutableInteractionSource, anchoredDraggableState.isAnimationRunning(), null, new C24581(anchoredDraggableState, null), z11, 32, null);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z12, z13, mutableInteractionSource);
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t10, float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new C24592(anchoredDraggableState, f10, null), interfaceC11588c, 2, null);
        return objAnchoredDrag$default == AbstractC11725a.m25952f() ? objAnchoredDrag$default : C10786q.f26013a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f10, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f10, interfaceC11588c);
    }

    public static final <T> Modifier draggableAnchors(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, InterfaceC9544p interfaceC9544p) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, interfaceC9544p, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(AbstractC9925a.m20088h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(p181hd.InterfaceC9529a r4, p181hd.InterfaceC9544p r5, vc.InterfaceC11588c<? super p309qc.C10786q> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.AnchoredDraggableKt.C24601
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C24601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.AbstractC9924b.m20071b(r6)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.AbstractC10006d.m20748e(r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            qc.q r4 = p309qc.C10786q.f26013a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.restartable(hd.a, hd.p, vc.c):java.lang.Object");
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new C24622(null), interfaceC11588c, 2, null);
        return objAnchoredDrag$default == AbstractC11725a.m25952f() ? objAnchoredDrag$default : C10786q.f26013a;
    }
}
