package androidx.compose.material3.pulltorefresh;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PullToRefreshModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {
    public static final int $stable = 8;
    private final MutableFloatState distancePulled$delegate;
    private boolean enabled;
    private boolean isRefreshing;
    private DelegatableNode nestedScrollNode;
    private InterfaceC9529a onRefresh;
    private PullToRefreshState state;
    private float threshold;
    private final MutableFloatState verticalOffset$delegate;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m26211f = "PullToRefresh.kt", m26212l = {406}, m26213m = "animateToHidden")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 */
    public static final class C25341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C25341(InterfaceC11588c<? super C25341> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToHidden(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m26211f = "PullToRefresh.kt", m26212l = {400}, m26213m = "animateToThreshold")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 */
    public static final class C25351 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C25351(InterfaceC11588c<? super C25351> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToThreshold(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", m26211f = "PullToRefresh.kt", m26212l = {287, 289}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1 */
    public static final class C25361 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C25361(InterfaceC11588c<? super C25361> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return PullToRefreshModifierNode.this.new C25361(interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r5.snapTo(1.0f, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r5.snapTo(0.0f, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.AbstractC9924b.m20071b(r5)
                goto L47
            L1b:
                kotlin.AbstractC9924b.m20071b(r5)
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                boolean r5 = r5.isRefreshing()
                if (r5 == 0) goto L37
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r5.getState()
                r4.label = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                java.lang.Object r5 = r5.snapTo(r1, r4)
                if (r5 != r0) goto L47
                goto L46
            L37:
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r5.getState()
                r4.label = r2
                r1 = 0
                java.lang.Object r5 = r5.snapTo(r1, r4)
                if (r5 != r0) goto L47
            L46:
                return r0
            L47:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25361.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C25361) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m26211f = "PullToRefresh.kt", m26212l = {359, 362}, m26213m = "onRelease")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 */
    public static final class C25371 extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C25371(InterfaceC11588c<? super C25371> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.onRelease(0.0f, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", m26211f = "PullToRefresh.kt", m26212l = {333, 335}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1 */
    public static final class C25381 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C25381(InterfaceC11588c<? super C25381> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return PullToRefreshModifierNode.this.new C25381(interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.animateToHidden(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r5.animateToThreshold(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.AbstractC9924b.m20071b(r5)
                goto L3c
            L1b:
                kotlin.AbstractC9924b.m20071b(r5)
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                boolean r5 = r5.isRefreshing()
                if (r5 != 0) goto L31
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                r4.label = r3
                java.lang.Object r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.access$animateToHidden(r5, r4)
                if (r5 != r0) goto L3c
                goto L3b
            L31:
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                r4.label = r2
                java.lang.Object r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.access$animateToThreshold(r5, r4)
                if (r5 != r0) goto L3c
            L3b:
                return r0
            L3c:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25381.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C25381) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public /* synthetic */ PullToRefreshModifierNode(boolean z10, InterfaceC9529a interfaceC9529a, boolean z11, PullToRefreshState pullToRefreshState, float f10, AbstractC9972n abstractC9972n) {
        this(z10, interfaceC9529a, z11, pullToRefreshState, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToHidden(vc.InterfaceC11588c<? super p309qc.C10786q> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25341
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC9924b.m20071b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.state
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.animateToHidden(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            r5 = 0
            r0.setDistancePulled(r5)
            r0.setVerticalOffset(r5)
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToHidden(vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToThreshold(vc.InterfaceC11588c<? super p309qc.C10786q> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25351
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC9924b.m20071b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.state
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.animateToThreshold(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            int r5 = r0.getThresholdPx()
            float r5 = (float) r5
            r0.setDistancePulled(r5)
            int r5 = r0.getThresholdPx()
            float r5 = (float) r5
            r0.setVerticalOffset(r5)
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToThreshold(vc.c):java.lang.Object");
    }

    private final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() <= getThresholdPx()) {
            return getAdjustedDistancePulled();
        }
        float fM21760m = AbstractC10410o.m21760m(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThresholdPx() + (getThresholdPx() * (fM21760m - (((float) Math.pow(fM21760m, 2)) / 4)));
    }

    /* renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    private final long m29615consumeAvailableOffsetMKHz9U(long j10) {
        float distancePulled;
        if (this.isRefreshing) {
            distancePulled = 0.0f;
        } else {
            float fM21751d = AbstractC10410o.m21751d(getDistancePulled() + Offset.m30638getYimpl(j10), 0.0f);
            distancePulled = fM21751d - getDistancePulled();
            setDistancePulled(fM21751d);
            setVerticalOffset(calculateVerticalOffset());
        }
        return OffsetKt.Offset(0.0f, distancePulled);
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled() * 0.5f;
    }

    private final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    private final float getProgress() {
        return getAdjustedDistancePulled() / getThresholdPx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getThresholdPx() {
        return ((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity())).mo27093roundToPx0680j_4(this.threshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getVerticalOffset() {
        return this.verticalOffset$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRelease(float r7, vc.InterfaceC11588c<? super java.lang.Float> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25371
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            float r7 = r0.F$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto L80
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            float r7 = r0.F$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto L6c
        L45:
            kotlin.AbstractC9924b.m20071b(r8)
            boolean r8 = r6.isRefreshing
            if (r8 == 0) goto L51
            java.lang.Float r7 = p409xc.AbstractC11826a.m26207b(r5)
            return r7
        L51:
            float r8 = r6.getAdjustedDistancePulled()
            int r2 = r6.getThresholdPx()
            float r2 = (float) r2
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L72
            r0.L$0 = r6
            r0.F$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.animateToThreshold(r0)
            if (r8 != r1) goto L6b
            goto L7e
        L6b:
            r0 = r6
        L6c:
            hd.a r8 = r0.onRefresh
            r8.invoke()
            goto L80
        L72:
            r0.L$0 = r6
            r0.F$0 = r7
            r0.label = r3
            java.lang.Object r8 = r6.animateToHidden(r0)
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r0 = r6
        L80:
            float r8 = r0.getDistancePulled()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L8a
        L88:
            r7 = r5
            goto L8f
        L8a:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L8f
            goto L88
        L8f:
            r0.setDistancePulled(r5)
            java.lang.Float r7 = p409xc.AbstractC11826a.m26207b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.onRelease(float, vc.c):java.lang.Object");
    }

    private final void setDistancePulled(float f10) {
        this.distancePulled$delegate.setFloatValue(f10);
    }

    private final void setVerticalOffset(float f10) {
        this.verticalOffset$delegate.setFloatValue(f10);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final InterfaceC9529a getOnRefresh() {
        return this.onRefresh;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m29616getThresholdD9Ej5fM() {
        return this.threshold;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        delegate(this.nestedScrollNode);
        AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C25361(null), 3, null);
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo27230onPostScrollDzOQY0M(long j10, long j11, int i10) {
        if (this.state.isAnimating()) {
            return Offset.Companion.m30653getZeroF1C5BW0();
        }
        if (!this.enabled) {
            return Offset.Companion.m30653getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m31984equalsimpl0(i10, NestedScrollSource.Companion.m31996getUserInputWNlRxjI())) {
            return Offset.Companion.m30653getZeroF1C5BW0();
        }
        long jM29615consumeAvailableOffsetMKHz9U = m29615consumeAvailableOffsetMKHz9U(j11);
        AbstractC11117h.m24726d(getCoroutineScope(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3, null);
        return jM29615consumeAvailableOffsetMKHz9U;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo27535onPreFlingQWom1Mo(long r5, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.F$0
            kotlin.AbstractC9924b.m20071b(r7)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.AbstractC9924b.m20071b(r7)
            float r5 = androidx.compose.p014ui.unit.Velocity.m33740getYimpl(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r4.onRelease(r5, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            r5 = r6
        L47:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.p014ui.unit.VelocityKt.Velocity(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p014ui.unit.Velocity.m33730boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.mo27535onPreFlingQWom1Mo(long, vc.c):java.lang.Object");
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo27536onPreScrollOzD1aCk(long j10, int i10) {
        return this.state.isAnimating() ? Offset.Companion.m30653getZeroF1C5BW0() : !this.enabled ? Offset.Companion.m30653getZeroF1C5BW0() : (!NestedScrollSource.m31984equalsimpl0(i10, NestedScrollSource.Companion.m31996getUserInputWNlRxjI()) || Offset.m30638getYimpl(j10) >= 0.0f) ? Offset.Companion.m30653getZeroF1C5BW0() : m29615consumeAvailableOffsetMKHz9U(j10);
    }

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public final void setOnRefresh(InterfaceC9529a interfaceC9529a) {
        this.onRefresh = interfaceC9529a;
    }

    public final void setRefreshing(boolean z10) {
        this.isRefreshing = z10;
    }

    public final void setState(PullToRefreshState pullToRefreshState) {
        this.state = pullToRefreshState;
    }

    /* renamed from: setThreshold-0680j_4, reason: not valid java name */
    public final void m29617setThreshold0680j_4(float f10) {
        this.threshold = f10;
    }

    public final void update() {
        AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C25381(null), 3, null);
    }

    private PullToRefreshModifierNode(boolean z10, InterfaceC9529a interfaceC9529a, boolean z11, PullToRefreshState pullToRefreshState, float f10) {
        this.isRefreshing = z10;
        this.onRefresh = interfaceC9529a;
        this.enabled = z11;
        this.state = pullToRefreshState;
        this.threshold = f10;
        this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.verticalOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }
}
