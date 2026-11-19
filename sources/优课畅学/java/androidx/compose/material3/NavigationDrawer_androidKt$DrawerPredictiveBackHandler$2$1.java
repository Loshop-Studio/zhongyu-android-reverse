package androidx.compose.material3;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.databinding.library.baseAdapters.C3721BR;
import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1", m17801f = "NavigationDrawer.android.kt", m17802l = {C3721BR.webViewControlViewModel, 86, 86, 86}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceGrow;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceShrink;
    final /* synthetic */ Ref$FloatRef $maxScaleYDistance;
    final /* synthetic */ InterfaceC8822b0 $scope;
    /* synthetic */ Object L$0;
    int label;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2", m17801f = "NavigationDrawer.android.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 */
    public static final class C22432 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22432(DrawerPredictiveBackState drawerPredictiveBackState, InterfaceC9324c<? super C22432> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$drawerPredictiveBackState = drawerPredictiveBackState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C22432(this.$drawerPredictiveBackState, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C22432) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C22432 c22432;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                float scaleXDistance = this.$drawerPredictiveBackState.getScaleXDistance();
                final DrawerPredictiveBackState drawerPredictiveBackState = this.$drawerPredictiveBackState;
                InterfaceC10574p interfaceC10574p = new InterfaceC10574p() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.2.1.2.1
                    {
                        super(2);
                    }

                    @Override // p300x7.InterfaceC10574p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return C8736p.f16368a;
                    }

                    public final void invoke(float f10, float f11) {
                        drawerPredictiveBackState.setScaleXDistance(f10);
                    }
                };
                this.label = 1;
                c22432 = this;
                if (SuspendAnimationKt.animate$default(scaleXDistance, 0.0f, 0.0f, null, interfaceC10574p, c22432, 12, null) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                c22432 = this;
            }
            c22432.$drawerPredictiveBackState.clear();
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, InterfaceC8822b0 interfaceC8822b0, DrawerState drawerState, boolean z10, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3, InterfaceC9324c<? super NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$drawerPredictiveBackState = drawerPredictiveBackState;
        this.$scope = interfaceC8822b0;
        this.$drawerState = drawerState;
        this.$isRtl = z10;
        this.$maxScaleXDistanceGrow = ref$FloatRef;
        this.$maxScaleXDistanceShrink = ref$FloatRef2;
        this.$maxScaleYDistance = ref$FloatRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(this.$drawerPredictiveBackState, this.$scope, this.$drawerState, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, interfaceC9324c);
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r14)
            goto Lc4
        L26:
            kotlin.AbstractC9079b.m15926b(r14)
            goto L9c
        L2b:
            kotlin.AbstractC9079b.m15926b(r14)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L74
            goto L51
        L2f:
            r0 = move-exception
            r14 = r0
            goto L9f
        L32:
            kotlin.AbstractC9079b.m15926b(r14)
            java.lang.Object r14 = r13.L$0
            l8.c r14 = (p169l8.InterfaceC9266c) r14
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
            i8.b0 r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            p135i8.AbstractC8833f.m14845d(r7, r8, r9, r10, r11, r12)
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
            i8.b0 r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            p135i8.AbstractC8833f.m14845d(r7, r8, r9, r10, r11, r12)
        L91:
            androidx.compose.material3.DrawerState r14 = r13.$drawerState
            r13.label = r3
            java.lang.Object r14 = r14.close(r13)
            if (r14 != r1) goto L9c
            goto Lc3
        L9c:
            h7.p r14 = p123h7.C8736p.f16368a
            return r14
        L9f:
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            boolean r14 = r14.getSwipeEdgeMatchesDrawer()
            if (r14 == 0) goto Lb7
            i8.b0 r7 = r13.$scope
            androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2 r10 = new androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2
            androidx.compose.material3.DrawerPredictiveBackState r14 = r13.$drawerPredictiveBackState
            r10.<init>(r14, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            p135i8.AbstractC8833f.m14845d(r7, r8, r9, r10, r11, r12)
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

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9266c interfaceC9266c, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1) create(interfaceC9266c, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
