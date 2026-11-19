package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.accs.common.Constants;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.C9974p;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation {
    private static final long NotInitialized;
    private final InterfaceC11122i0 coroutineScope;
    private FiniteAnimationSpec<Float> fadeInSpec;
    private FiniteAnimationSpec<Float> fadeOutSpec;
    private long finalOffset;
    private final GraphicsContext graphicsContext;
    private final MutableState isAppearanceAnimationInProgress$delegate;
    private final MutableState isDisappearanceAnimationFinished$delegate;
    private final MutableState isDisappearanceAnimationInProgress$delegate;
    private final MutableState isPlacementAnimationInProgress$delegate;
    private boolean isRunningMovingAwayAnimation;
    private GraphicsLayer layer;
    private long lookaheadOffset;
    private final InterfaceC9529a onLayerPropertyChanged;
    private final MutableState placementDelta$delegate;
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;
    private FiniteAnimationSpec<IntOffset> placementSpec;
    private long rawOffset;
    private final Animatable<Float, AnimationVector1D> visibilityAnimation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m27626getNotInitializednOccac() {
            return LazyLayoutItemAnimation.NotInitialized;
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", m26211f = "LazyLayoutItemAnimation.kt", m26212l = {171}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1 */
    public static final class C15781 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C15781(InterfaceC11588c<? super C15781> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyLayoutItemAnimation.this.new C15781(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.visibilityAnimation;
                Float fM26207b = AbstractC11826a.m26207b(1.0f);
                this.label = 1;
                if (animatable.snapTo(fM26207b, this) == objM25952f) {
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
            return ((C15781) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", m26211f = "LazyLayoutItemAnimation.kt", m26212l = {Opcodes.INVOKESPECIAL, Opcodes.INVOKEINTERFACE}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2 */
    public static final class C15792 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ GraphicsLayer $layer;
        final /* synthetic */ boolean $shouldResetValue;
        final /* synthetic */ FiniteAnimationSpec<Float> $spec;
        int label;
        final /* synthetic */ LazyLayoutItemAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15792(boolean z10, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, InterfaceC11588c<? super C15792> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$shouldResetValue = z10;
            this.this$0 = lazyLayoutItemAnimation;
            this.$spec = finiteAnimationSpec;
            this.$layer = graphicsLayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C15792(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, interfaceC11588c);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|33|(1:(1:(4:6|7|25|26)(2:10|11))(1:12))(6:14|36|15|(3:17|(1:19)|24)|31|32)|20|21|34|22|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, r8, r9, 4, null) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        
            r0 = th;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r12.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                kotlin.AbstractC9924b.m20071b(r13)     // Catch: java.lang.Throwable -> L14
                r9 = r12
                goto L64
            L14:
                r0 = move-exception
                r13 = r0
                r9 = r12
                goto L72
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                kotlin.AbstractC9924b.m20071b(r13)     // Catch: java.lang.Throwable -> L14
                goto L40
            L24:
                kotlin.AbstractC9924b.m20071b(r13)
                boolean r13 = r12.$shouldResetValue     // Catch: java.lang.Throwable -> L6f
                if (r13 == 0) goto L40
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r12.this$0     // Catch: java.lang.Throwable -> L14
                androidx.compose.animation.core.Animatable r13 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getVisibilityAnimation$p(r13)     // Catch: java.lang.Throwable -> L14
                r1 = 0
                java.lang.Float r1 = p409xc.AbstractC11826a.m26207b(r1)     // Catch: java.lang.Throwable -> L14
                r12.label = r4     // Catch: java.lang.Throwable -> L14
                java.lang.Object r13 = r13.snapTo(r1, r12)     // Catch: java.lang.Throwable -> L14
                if (r13 != r0) goto L40
                r9 = r12
                goto L63
            L40:
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r12.this$0     // Catch: java.lang.Throwable -> L6f
                androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getVisibilityAnimation$p(r13)     // Catch: java.lang.Throwable -> L6f
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = p409xc.AbstractC11826a.m26207b(r13)     // Catch: java.lang.Throwable -> L6f
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r6 = r12.$spec     // Catch: java.lang.Throwable -> L6f
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1 r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1     // Catch: java.lang.Throwable -> L6f
                androidx.compose.ui.graphics.layer.GraphicsLayer r13 = r12.$layer     // Catch: java.lang.Throwable -> L6f
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r1 = r12.this$0     // Catch: java.lang.Throwable -> L6f
                r8.<init>()     // Catch: java.lang.Throwable -> L6f
                r12.label = r3     // Catch: java.lang.Throwable -> L6f
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6c
                if (r13 != r0) goto L64
            L63:
                return r0
            L64:
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r9.this$0
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(r13, r2)
                qc.q r13 = p309qc.C10786q.f26013a
                return r13
            L6c:
                r0 = move-exception
            L6d:
                r13 = r0
                goto L72
            L6f:
                r0 = move-exception
                r9 = r12
                goto L6d
            L72:
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r9.this$0
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.C15792.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C15792) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", m26211f = "LazyLayoutItemAnimation.kt", m26212l = {ComposerKt.providerMapsKey}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1 */
    public static final class C15801 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ GraphicsLayer $layer;
        final /* synthetic */ FiniteAnimationSpec<Float> $spec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15801(FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, InterfaceC11588c<? super C15801> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$spec = finiteAnimationSpec;
            this.$layer = graphicsLayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyLayoutItemAnimation.this.new C15801(this.$spec, this.$layer, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C15801 c15801;
            Throwable th;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                try {
                    Animatable animatable = LazyLayoutItemAnimation.this.visibilityAnimation;
                    Float fM26207b = AbstractC11826a.m26207b(0.0f);
                    FiniteAnimationSpec<Float> finiteAnimationSpec = this.$spec;
                    final GraphicsLayer graphicsLayer = this.$layer;
                    final LazyLayoutItemAnimation lazyLayoutItemAnimation = LazyLayoutItemAnimation.this;
                    InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.animateDisappearance.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((Animatable<Float, AnimationVector1D>) obj2);
                            return C10786q.f26013a;
                        }

                        public final void invoke(Animatable<Float, AnimationVector1D> animatable2) {
                            graphicsLayer.setAlpha(animatable2.getValue().floatValue());
                            lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
                        }
                    };
                    this.label = 1;
                    c15801 = this;
                    try {
                        if (Animatable.animateTo$default(animatable, fM26207b, finiteAnimationSpec, null, interfaceC9540l, c15801, 4, null) == objM25952f) {
                            return objM25952f;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c15801 = this;
                    th = th;
                    LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
                    throw th;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC9924b.m20071b(obj);
                    c15801 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c15801 = this;
                    LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
                    throw th;
                }
            }
            LazyLayoutItemAnimation.this.setDisappearanceAnimationFinished(true);
            LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C15801) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", m26211f = "LazyLayoutItemAnimation.kt", m26212l = {106}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1 */
    public static final class C15821 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C15821(InterfaceC11588c<? super C15821> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyLayoutItemAnimation.this.new C15821(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.placementDeltaAnimation;
                IntOffset intOffsetM33620boximpl = IntOffset.m33620boximpl(IntOffset.Companion.m33640getZeronOccac());
                this.label = 1;
                if (animatable.snapTo(intOffsetM33620boximpl, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            LazyLayoutItemAnimation.this.m27616setPlacementDeltagyyYBs(IntOffset.Companion.m33640getZeronOccac());
            LazyLayoutItemAnimation.this.setPlacementAnimationInProgress(false);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C15821) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", m26211f = "LazyLayoutItemAnimation.kt", m26212l = {218}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1 */
    public static final class C15831 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C15831(InterfaceC11588c<? super C15831> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyLayoutItemAnimation.this.new C15831(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.placementDeltaAnimation;
                this.label = 1;
                if (animatable.stop(this) == objM25952f) {
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
            return ((C15831) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", m26211f = "LazyLayoutItemAnimation.kt", m26212l = {Constants.SDK_VERSION_CODE}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2 */
    public static final class C15842 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C15842(InterfaceC11588c<? super C15842> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyLayoutItemAnimation.this.new C15842(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.visibilityAnimation;
                this.label = 1;
                if (animatable.stop(this) == objM25952f) {
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
            return ((C15842) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", m26211f = "LazyLayoutItemAnimation.kt", m26212l = {226}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3 */
    public static final class C15853 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C15853(InterfaceC11588c<? super C15853> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyLayoutItemAnimation.this.new C15853(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.visibilityAnimation;
                this.label = 1;
                if (animatable.stop(this) == objM25952f) {
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
            return ((C15853) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    static {
        long j10 = Integer.MAX_VALUE;
        NotInitialized = IntOffset.m33623constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    public LazyLayoutItemAnimation(InterfaceC11122i0 interfaceC11122i0, GraphicsContext graphicsContext, InterfaceC9529a interfaceC9529a) {
        this.coroutineScope = interfaceC11122i0;
        this.graphicsContext = graphicsContext;
        this.onLayerPropertyChanged = interfaceC9529a;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isAppearanceAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        long j10 = NotInitialized;
        this.rawOffset = j10;
        IntOffset.Companion companion = IntOffset.Companion;
        this.finalOffset = companion.m33640getZeronOccac();
        this.layer = graphicsContext != null ? graphicsContext.createGraphicsLayer() : null;
        String str = null;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m33620boximpl(companion.m33640getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, str, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.getVectorConverter(C9974p.f23424a), str, null, 12, null);
        this.placementDelta$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m33620boximpl(companion.m33640getZeronOccac()), null, 2, null);
        this.lookaheadOffset = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearanceAnimationInProgress(boolean z10) {
        this.isAppearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationFinished(boolean z10) {
        this.isDisappearanceAnimationFinished$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationInProgress(boolean z10) {
        this.isDisappearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlacementAnimationInProgress(boolean z10) {
        this.isPlacementAnimationInProgress$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m27616setPlacementDeltagyyYBs(long j10) {
        this.placementDelta$delegate.setValue(IntOffset.m33620boximpl(j10));
    }

    public final void animateAppearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null || graphicsLayer == null) {
            if (isDisappearanceAnimationInProgress()) {
                if (graphicsLayer != null) {
                    graphicsLayer.setAlpha(1.0f);
                }
                AbstractC11117h.m24726d(this.coroutineScope, null, null, new C15781(null), 3, null);
                return;
            }
            return;
        }
        setAppearanceAnimationInProgress(true);
        boolean zIsDisappearanceAnimationInProgress = isDisappearanceAnimationInProgress();
        boolean z10 = !zIsDisappearanceAnimationInProgress;
        if (!zIsDisappearanceAnimationInProgress) {
            graphicsLayer.setAlpha(0.0f);
        }
        AbstractC11117h.m24726d(this.coroutineScope, null, null, new C15792(z10, this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    public final void animateDisappearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeOutSpec;
        if (graphicsLayer == null || isDisappearanceAnimationInProgress() || finiteAnimationSpec == null) {
            return;
        }
        setDisappearanceAnimationInProgress(true);
        AbstractC11117h.m24726d(this.coroutineScope, null, null, new C15801(finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    /* renamed from: animatePlacementDelta-ar5cAso, reason: not valid java name */
    public final void m27617animatePlacementDeltaar5cAso(long j10, boolean z10) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long jM33632minusqkQi6aY = IntOffset.m33632minusqkQi6aY(m27620getPlacementDeltanOccac(), j10);
        m27616setPlacementDeltagyyYBs(jM33632minusqkQi6aY);
        setPlacementAnimationInProgress(true);
        this.isRunningMovingAwayAnimation = z10;
        AbstractC11117h.m24726d(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, jM33632minusqkQi6aY, null), 3, null);
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            AbstractC11117h.m24726d(this.coroutineScope, null, null, new C15821(null), 3, null);
        }
    }

    public final FiniteAnimationSpec<Float> getFadeInSpec() {
        return this.fadeInSpec;
    }

    public final FiniteAnimationSpec<Float> getFadeOutSpec() {
        return this.fadeOutSpec;
    }

    /* renamed from: getFinalOffset-nOcc-ac, reason: not valid java name */
    public final long m27618getFinalOffsetnOccac() {
        return this.finalOffset;
    }

    public final GraphicsLayer getLayer() {
        return this.layer;
    }

    /* renamed from: getLookaheadOffset-nOcc-ac, reason: not valid java name */
    public final long m27619getLookaheadOffsetnOccac() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m27620getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta$delegate.getValue()).m33638unboximpl();
    }

    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name */
    public final long m27621getRawOffsetnOccac() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean) this.isAppearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationFinished() {
        return ((Boolean) this.isDisappearanceAnimationFinished$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationInProgress() {
        return ((Boolean) this.isDisappearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean) this.isPlacementAnimationInProgress$delegate.getValue()).booleanValue();
    }

    public final boolean isRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void release() {
        GraphicsContext graphicsContext;
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            AbstractC11117h.m24726d(this.coroutineScope, null, null, new C15831(null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            AbstractC11117h.m24726d(this.coroutineScope, null, null, new C15842(null), 3, null);
        }
        if (isDisappearanceAnimationInProgress()) {
            setDisappearanceAnimationInProgress(false);
            AbstractC11117h.m24726d(this.coroutineScope, null, null, new C15853(null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        m27616setPlacementDeltagyyYBs(IntOffset.Companion.m33640getZeronOccac());
        this.rawOffset = NotInitialized;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (graphicsContext = this.graphicsContext) != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }

    public final void setFadeInSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final void setFadeOutSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }

    /* renamed from: setFinalOffset--gyyYBs, reason: not valid java name */
    public final void m27622setFinalOffsetgyyYBs(long j10) {
        this.finalOffset = j10;
    }

    /* renamed from: setLookaheadOffset--gyyYBs, reason: not valid java name */
    public final void m27623setLookaheadOffsetgyyYBs(long j10) {
        this.lookaheadOffset = j10;
    }

    public final void setPlacementSpec(FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m27624setRawOffsetgyyYBs(long j10) {
        this.rawOffset = j10;
    }

    public /* synthetic */ LazyLayoutItemAnimation(InterfaceC11122i0 interfaceC11122i0, GraphicsContext graphicsContext, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC11122i0, (i10 & 2) != 0 ? null : graphicsContext, (i10 & 4) != 0 ? new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27625invoke() {
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27625invoke();
                return C10786q.f26013a;
            }
        } : interfaceC9529a);
    }
}
