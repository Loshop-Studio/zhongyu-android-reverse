package androidx.compose.material3;

import androidx.compose.animation.core.SuspendAnimationKt;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1", m26211f = "NavigationDrawer.android.kt", m26212l = {60, PatchStatus.CODE_LOAD_ILLEGAL_ACCESS, PatchStatus.CODE_LOAD_ILLEGAL_ACCESS, PatchStatus.CODE_LOAD_ILLEGAL_ACCESS}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceGrow;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceShrink;
    final /* synthetic */ Ref$FloatRef $maxScaleYDistance;
    final /* synthetic */ InterfaceC11122i0 $scope;
    /* synthetic */ Object L$0;
    int label;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2", m26211f = "NavigationDrawer.android.kt", m26212l = {77}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 */
    public static final class C22732 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22732(DrawerPredictiveBackState drawerPredictiveBackState, InterfaceC11588c<? super C22732> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$drawerPredictiveBackState = drawerPredictiveBackState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C22732(this.$drawerPredictiveBackState, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C22732 c22732;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                float scaleXDistance = this.$drawerPredictiveBackState.getScaleXDistance();
                final DrawerPredictiveBackState drawerPredictiveBackState = this.$drawerPredictiveBackState;
                InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.2.1.2.1
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return C10786q.f26013a;
                    }

                    public final void invoke(float f10, float f11) {
                        drawerPredictiveBackState.setScaleXDistance(f10);
                    }
                };
                this.label = 1;
                c22732 = this;
                if (SuspendAnimationKt.animate$default(scaleXDistance, 0.0f, 0.0f, null, interfaceC9544p, c22732, 12, null) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                c22732 = this;
            }
            c22732.$drawerPredictiveBackState.clear();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C22732) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, InterfaceC11122i0 interfaceC11122i0, DrawerState drawerState, boolean z10, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3, InterfaceC11588c<? super NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$drawerPredictiveBackState = drawerPredictiveBackState;
        this.$scope = interfaceC11122i0;
        this.$drawerState = drawerState;
        this.$isRtl = z10;
        this.$maxScaleXDistanceGrow = ref$FloatRef;
        this.$maxScaleXDistanceShrink = ref$FloatRef2;
        this.$maxScaleYDistance = ref$FloatRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(this.$drawerPredictiveBackState, this.$scope, this.$drawerState, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, interfaceC11588c);
        navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.L$0 = obj;
        return navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r14.close(r13) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r14.close(r13) != r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r0 = r13.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L32
            if (r0 == r5) goto L2b
            if (r0 == r4) goto L26
            if (r0 == r3) goto L26
            if (r0 == r2) goto L1d
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            java.lang.Object r0 = r13.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.AbstractC9924b.m20071b(r14)
            goto Lc4
        L26:
            kotlin.AbstractC9924b.m20071b(r14)
            goto L9c
        L2b:
            kotlin.AbstractC9924b.m20071b(r14)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            goto L51
        L2f:
            r0 = move-exception
            r14 = r0
            goto L9f
        L32:
            kotlin.AbstractC9924b.m20071b(r14)
            java.lang.Object r14 = r13.L$0
            vd.c r14 = (p379vd.InterfaceC11594c) r14
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$1 r7 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$1     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            androidx.compose.material3.DrawerPredictiveBackState r8 = r13.$drawerPredictiveBackState     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            boolean r9 = r13.$isRtl     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            kotlin.jvm.internal.Ref$FloatRef r10 = r13.$maxScaleXDistanceGrow     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            kotlin.jvm.internal.Ref$FloatRef r11 = r13.$maxScaleXDistanceShrink     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            kotlin.jvm.internal.Ref$FloatRef r12 = r13.$maxScaleYDistance     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            r7.<init>()     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            r13.label = r5     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            java.lang.Object r14 = r14.collect(r7, r13)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            if (r14 != r1) goto L51
            goto Lc3
        L51:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto L69
            sd.i0 r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            sd.AbstractC11109f.m24706d(r7, r8, r9, r10, r11, r12)
        L69:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.label = r4
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto L9c
            goto Lc3
        L74:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState     // Catch: java.lang.Throwable -> L2f
            r14.clear()     // Catch: java.lang.Throwable -> L2f
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto L91
            sd.i0 r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            sd.AbstractC11109f.m24706d(r7, r8, r9, r10, r11, r12)
        L91:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.label = r3
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto L9c
            goto Lc3
        L9c:
            qc.q r14 = p309qc.C10786q.f26013a
            return r14
        L9f:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto Lb7
            sd.i0 r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            sd.AbstractC11109f.m24706d(r7, r8, r9, r10, r11, r12)
        Lb7:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.L$0 = r0
            r13.label = r2
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11594c interfaceC11594c, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1) create(interfaceC11594c, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
