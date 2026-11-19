package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.AbstractC9079b;
import kotlin.collections.AbstractC9080a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

/* loaded from: classes2.dex */
public final class AnchoredDraggableKt {

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", m17801f = "AnchoredDraggable.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1 */
    public static final class C24281 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", m17801f = "AnchoredDraggable.kt", m17802l = {177}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ AnchoredDraggableState<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, float f10, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$state = anchoredDraggableState;
                this.$velocity = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.$state, this.$velocity, interfaceC9324c);
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
                    AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                    float f10 = this.$velocity;
                    this.label = 1;
                    if (anchoredDraggableState.settle(f10, this) == objM17291f) {
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
        public C24281(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9324c<? super C24281> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$state = anchoredDraggableState;
        }

        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C24281 c24281 = new C24281(this.$state, interfaceC9324c);
            c24281.L$0 = interfaceC8822b0;
            c24281.F$0 = f10;
            return c24281.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d((InterfaceC8822b0) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC8822b0) obj, ((Number) obj2).floatValue(), (InterfaceC9324c<? super C8736p>) obj3);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", m17801f = "AnchoredDraggable.kt", m17802l = {685}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2 */
    public static final class C24292 extends SuspendLambda implements InterfaceC10576r {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24292(AnchoredDraggableState<T> anchoredDraggableState, float f10, InterfaceC9324c<? super C24292> interfaceC9324c) {
            super(4, interfaceC9324c);
            this.$this_animateTo = anchoredDraggableState;
            this.$velocity = f10;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C24292 c24292 = new C24292(this.$this_animateTo, this.$velocity, interfaceC9324c);
            c24292.L$0 = anchoredDragScope;
            c24292.L$1 = draggableAnchors;
            c24292.L$2 = t10;
            return c24292.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                    ref$FloatRef.f17470a = offset;
                    float f10 = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                    InterfaceC10574p interfaceC10574p = new InterfaceC10574p() { // from class: androidx.compose.material3.internal.AnchoredDraggableKt.animateTo.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p300x7.InterfaceC10574p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                            return C8736p.f16368a;
                        }

                        public final void invoke(float f11, float f12) {
                            anchoredDragScope.dragTo(f11, f12);
                            ref$FloatRef.f17470a = f11;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(offset, fPositionOf, f10, animationSpec, interfaceC10574p, this) == objM17291f) {
                        return objM17291f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10576r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC9324c<? super C8736p>) obj4);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableKt", m17801f = "AnchoredDraggable.kt", m17802l = {713}, m17803m = "restartable")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 */
    public static final class C24301<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24301(InterfaceC9324c<? super C24301> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", m17801f = "AnchoredDraggable.kt", m17802l = {715}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 */
    public static final class C24312 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ InterfaceC10559a $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC9267d {
            final /* synthetic */ InterfaceC8822b0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC10574p $block;
            final /* synthetic */ Ref$ObjectRef<InterfaceC9212n> $previousDrag;

            @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", m17801f = "AnchoredDraggable.kt", m17802l = {722}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ InterfaceC8822b0 $$this$coroutineScope;
                final /* synthetic */ InterfaceC10574p $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC10574p interfaceC10574p, I i10, InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$block = interfaceC10574p;
                    this.$latestInputs = i10;
                    this.$$this$coroutineScope = interfaceC8822b0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        InterfaceC10574p interfaceC10574p = this.$block;
                        Object obj2 = this.$latestInputs;
                        this.label = 1;
                        if (interfaceC10574p.invoke(obj2, this) == objM17291f) {
                            return objM17291f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9079b.m15926b(obj);
                    }
                    AbstractC9165e.m16554c(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return C8736p.f16368a;
                }
            }

            public AnonymousClass1(Ref$ObjectRef<InterfaceC9212n> ref$ObjectRef, InterfaceC8822b0 interfaceC8822b0, InterfaceC10574p interfaceC10574p) {
                this.$previousDrag = ref$ObjectRef;
                this.$$this$coroutineScope = interfaceC8822b0;
                this.$block = interfaceC10574p;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p169l8.InterfaceC9267d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, p179m7.InterfaceC9324c<? super p123h7.C8736p> r9) throws java.lang.Throwable {
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
                    java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.n r8 = (kotlinx.coroutines.InterfaceC9212n) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C24312.AnonymousClass1) r0
                    kotlin.AbstractC9079b.m15926b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.AbstractC9079b.m15926b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.n> r9 = r7.$previousDrag
                    java.lang.Object r9 = r9.f17473a
                    kotlinx.coroutines.n r9 = (kotlinx.coroutines.InterfaceC9212n) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.material3.internal.AnchoredDragFinishedSignal r2 = new androidx.compose.material3.internal.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.cancel(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.mo16291n(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.n> r9 = r0.$previousDrag
                    i8.b0 r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.f17555d
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2
                    x7.p r0 = r0.$block
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    kotlinx.coroutines.n r8 = p135i8.AbstractC8833f.m14845d(r1, r2, r3, r4, r5, r6)
                    r9.f17473a = r8
                    h7.p r8 = p123h7.C8736p.f16368a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.C24312.AnonymousClass1.emit(java.lang.Object, m7.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24312(InterfaceC10559a interfaceC10559a, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C24312> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$inputs = interfaceC10559a;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C24312 c24312 = new C24312(this.$inputs, this.$block, interfaceC9324c);
            c24312.L$0 = obj;
            return c24312;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C24312) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                InterfaceC9266c interfaceC9266cSnapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, interfaceC8822b0, this.$block);
                this.label = 1;
                if (interfaceC9266cSnapshotFlow.collect(anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", m17801f = "AnchoredDraggable.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2 */
    public static final class C24322 extends SuspendLambda implements InterfaceC10576r {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C24322(InterfaceC9324c<? super C24322> interfaceC9324c) {
            super(4, interfaceC9324c);
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C24322 c24322 = new C24322(interfaceC9324c);
            c24322.L$0 = anchoredDragScope;
            c24322.L$1 = draggableAnchors;
            c24322.L$2 = t10;
            return c24322.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10576r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC9324c<? super C8736p>) obj4);
        }
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(InterfaceC10570l interfaceC10570l) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        interfaceC10570l.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material3_release());
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState$material3_release(), orientation, z10, mutableInteractionSource, anchoredDraggableState.isAnimationRunning(), null, new C24281(anchoredDraggableState, null), z11, 32, null);
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

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t10, float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new C24292(anchoredDraggableState, f10, null), interfaceC9324c, 2, null);
        return objAnchoredDrag$default == AbstractC9434a.m17291f() ? objAnchoredDrag$default : C8736p.f16368a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f10, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f10, interfaceC9324c);
    }

    public static final <T> Modifier draggableAnchors(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, InterfaceC10574p interfaceC10574p) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, interfaceC10574p, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(AbstractC9080a.m15943h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(p300x7.InterfaceC10559a r4, p300x7.InterfaceC10574p r5, p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.AnchoredDraggableKt.C24301
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C24301) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r6)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.AbstractC9079b.m15926b(r6)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.AbstractC9165e.m16556e(r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            h7.p r4 = p123h7.C8736p.f16368a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.restartable(x7.a, x7.p, m7.c):java.lang.Object");
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new C24322(null), interfaceC9324c, 2, null);
        return objAnchoredDrag$default == AbstractC9434a.m17291f() ? objAnchoredDrag$default : C8736p.f16368a;
    }
}
