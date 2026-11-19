package androidx.compose.material3;

import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5910f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {"Lkotlinx/coroutines/flow/f;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "progress", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1", m5303f = "NavigationDrawer.android.kt", m5304i = {}, m5305l = {60, 86, 86, 86}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceGrow;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceShrink;
    final /* synthetic */ Ref$FloatRef $maxScaleYDistance;
    final /* synthetic */ InterfaceC6009v $scope;
    /* synthetic */ Object L$0;
    int label;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2", m5303f = "NavigationDrawer.android.kt", m5304i = {}, m5305l = {77}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 */
    public static final class C17532 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17532(DrawerPredictiveBackState drawerPredictiveBackState, InterfaceC5631c<? super C17532> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$drawerPredictiveBackState = drawerPredictiveBackState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            return new C17532(this.$drawerPredictiveBackState, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C17532 c17532;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                float scaleXDistance = this.$drawerPredictiveBackState.getScaleXDistance();
                final DrawerPredictiveBackState drawerPredictiveBackState = this.$drawerPredictiveBackState;
                InterfaceC6473e interfaceC6473e = new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.2.1.2.1
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return C5443s.f8405a;
                    }

                    public final void invoke(float f, float f7) {
                        drawerPredictiveBackState.setScaleXDistance(f);
                    }
                };
                this.label = 1;
                c17532 = this;
                if (SuspendAnimationKt.animate$default(scaleXDistance, 0.0f, 0.0f, null, interfaceC6473e, c17532, 12, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                c17532 = this;
            }
            c17532.$drawerPredictiveBackState.clear();
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C17532) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, InterfaceC6009v interfaceC6009v, DrawerState drawerState, boolean z8, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3, InterfaceC5631c<? super NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$drawerPredictiveBackState = drawerPredictiveBackState;
        this.$scope = interfaceC6009v;
        this.$drawerState = drawerState;
        this.$isRtl = z8;
        this.$maxScaleXDistanceGrow = ref$FloatRef;
        this.$maxScaleXDistanceShrink = ref$FloatRef2;
        this.$maxScaleYDistance = ref$FloatRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(this.$drawerPredictiveBackState, this.$scope, this.$drawerState, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, interfaceC5631c);
        navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.L$0 = obj;
        return navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r14.close(r13) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r14.close(r13) != r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r13.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L2f
            if (r0 == r5) goto L28
            if (r0 == r4) goto L24
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1b
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            java.lang.Object r0 = r13.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.AbstractC5774b.m5119b(r14)
            goto Lb5
        L24:
            kotlin.AbstractC5774b.m5119b(r14)
            goto L91
        L28:
            kotlin.AbstractC5774b.m5119b(r14)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            goto L4e
        L2c:
            r0 = move-exception
            r14 = r0
            goto L94
        L2f:
            kotlin.AbstractC5774b.m5119b(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.flow.f r14 = (kotlinx.coroutines.flow.InterfaceC5910f) r14
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$1 r7 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$1     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            androidx.compose.material3.DrawerPredictiveBackState r8 = r13.$drawerPredictiveBackState     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            boolean r9 = r13.$isRtl     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            kotlin.jvm.internal.Ref$FloatRef r10 = r13.$maxScaleXDistanceGrow     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            kotlin.jvm.internal.Ref$FloatRef r11 = r13.$maxScaleXDistanceShrink     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            kotlin.jvm.internal.Ref$FloatRef r12 = r13.$maxScaleYDistance     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            r7.<init>()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            r13.label = r5     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            java.lang.Object r14 = r14.collect(r7, r13)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L6d
            if (r14 != r1) goto L4e
            goto Lb4
        L4e:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto L62
            kotlinx.coroutines.v r14 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r0 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r2 = r13.$drawerPredictiveBackState
            r0.<init>(r2, r6)
            kotlinx.coroutines.AbstractC6014x.m5651v(r14, r6, r6, r0, r3)
        L62:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.label = r4
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto L91
            goto Lb4
        L6d:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState     // Catch: java.lang.Throwable -> L2c
            r14.clear()     // Catch: java.lang.Throwable -> L2c
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto L86
            kotlinx.coroutines.v r14 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r0 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r2 = r13.$drawerPredictiveBackState
            r0.<init>(r2, r6)
            kotlinx.coroutines.AbstractC6014x.m5651v(r14, r6, r6, r0, r3)
        L86:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.label = r3
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto L91
            goto Lb4
        L91:
            d6.s r14 = p045d6.C5443s.f8405a
            return r14
        L94:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto La8
            kotlinx.coroutines.v r14 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r4 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r5 = r13.$drawerPredictiveBackState
            r4.<init>(r5, r6)
            kotlinx.coroutines.AbstractC6014x.m5651v(r14, r6, r6, r4, r3)
        La8:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.L$0 = r0
            r13.label = r2
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull InterfaceC5910f interfaceC5910f, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1) create(interfaceC5910f, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
