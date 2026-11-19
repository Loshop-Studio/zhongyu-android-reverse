package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.InterfaceC5876e;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m5303f = "AnimateAsState.kt", m5304i = {0}, m5305l = {418}, m5306m = "invokeSuspend", m5307n = {"$this$LaunchedEffect"}, m5308s = {"L$0"})
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ InterfaceC5876e $channel;
    final /* synthetic */ State<InterfaceC6471c> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", m5303f = "AnimateAsState.kt", m5304i = {}, m5305l = {427}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 */
    public static final class C06811 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<InterfaceC6471c> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06811(T t8, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends InterfaceC6471c> state2, InterfaceC5631c<? super C06811> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$newTarget = t8;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C06811(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C06811 c06811;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                if (AbstractC5830k.m5325b(this.$newTarget, this.$animatable.getTargetValue())) {
                    return C5443s.f8405a;
                }
                Animatable<T, V> animatable = this.$animatable;
                T t8 = this.$newTarget;
                AnimationSpec animationSpecAnimateValueAsState$lambda$6 = AnimateAsStateKt.animateValueAsState$lambda$6(this.$animSpec$delegate);
                this.label = 1;
                c06811 = this;
                if (Animatable.animateTo$default(animatable, t8, animationSpecAnimateValueAsState$lambda$6, null, null, c06811, 12, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                c06811 = this;
            }
            InterfaceC6471c interfaceC6471cAnimateValueAsState$lambda$4 = AnimateAsStateKt.animateValueAsState$lambda$4(c06811.$listener$delegate);
            if (interfaceC6471cAnimateValueAsState$lambda$4 != null) {
                interfaceC6471cAnimateValueAsState$lambda$4.invoke(c06811.$animatable.getValue());
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C06811) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3$1(InterfaceC5876e interfaceC5876e, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends InterfaceC6471c> state2, InterfaceC5631c<? super AnimateAsStateKt$animateValueAsState$3$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$channel = interfaceC5876e;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC5631c);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:12:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r11.L$1
            kotlinx.coroutines.channels.a r1 = (kotlinx.coroutines.channels.C5872a) r1
            java.lang.Object r3 = r11.L$0
            kotlinx.coroutines.v r3 = (kotlinx.coroutines.InterfaceC6009v) r3
            kotlin.AbstractC5774b.m5119b(r12)
            goto L38
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            kotlin.AbstractC5774b.m5119b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.v r12 = (kotlinx.coroutines.InterfaceC6009v) r12
            kotlinx.coroutines.channels.e r1 = r11.$channel
            kotlinx.coroutines.channels.a r1 = r1.iterator()
            r3 = r12
        L2b:
            r11.L$0 = r3
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = r1.m5466b(r11)
            if (r12 != r0) goto L38
            return r0
        L38:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L65
            java.lang.Object r12 = r1.m5467c()
            kotlinx.coroutines.channels.e r4 = r11.$channel
            java.lang.Object r4 = r4.mo5487j()
            java.lang.Object r4 = kotlinx.coroutines.channels.C5879h.m5504a(r4)
            if (r4 != 0) goto L52
            r6 = r12
            goto L53
        L52:
            r6 = r4
        L53:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r5 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.animation.core.Animatable<T, V> r7 = r11.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r8 = r11.$animSpec$delegate
            androidx.compose.runtime.State<r6.c> r9 = r11.$listener$delegate
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 3
            r4 = 0
            kotlinx.coroutines.AbstractC6014x.m5651v(r3, r4, r4, r5, r12)
            goto L2b
        L65:
            d6.s r12 = p045d6.C5443s.f8405a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
