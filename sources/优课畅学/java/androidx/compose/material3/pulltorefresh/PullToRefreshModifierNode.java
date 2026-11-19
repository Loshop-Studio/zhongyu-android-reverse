package androidx.compose.material3.pulltorefresh;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PullToRefreshModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {
    public static final int $stable = 8;
    private final MutableFloatState distancePulled$delegate;
    private boolean enabled;
    private boolean isRefreshing;
    private DelegatableNode nestedScrollNode;
    private InterfaceC10559a onRefresh;
    private PullToRefreshState state;
    private float threshold;
    private final MutableFloatState verticalOffset$delegate;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m17801f = "PullToRefresh.kt", m17802l = {TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_OLD}, m17803m = "animateToHidden")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 */
    public static final class C25041 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C25041(InterfaceC9324c<? super C25041> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToHidden(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m17801f = "PullToRefresh.kt", m17802l = {TbsListener.ErrorCode.INFO_CODE_BASE}, m17803m = "animateToThreshold")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 */
    public static final class C25051 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C25051(InterfaceC9324c<? super C25051> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToThreshold(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", m17801f = "PullToRefresh.kt", m17802l = {287, 289}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1 */
    public static final class C25061 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C25061(InterfaceC9324c<? super C25061> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return PullToRefreshModifierNode.this.new C25061(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C25061) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
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
                kotlin.AbstractC9079b.m15926b(r5)
                goto L47
            L1b:
                kotlin.AbstractC9079b.m15926b(r5)
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
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25061.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m17801f = "PullToRefresh.kt", m17802l = {359, 362}, m17803m = "onRelease")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 */
    public static final class C25071 extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C25071(InterfaceC9324c<? super C25071> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.onRelease(0.0f, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", m17801f = "PullToRefresh.kt", m17802l = {333, 335}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1 */
    public static final class C25081 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C25081(InterfaceC9324c<? super C25081> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return PullToRefreshModifierNode.this.new C25081(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C25081) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
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
                kotlin.AbstractC9079b.m15926b(r5)
                goto L3c
            L1b:
                kotlin.AbstractC9079b.m15926b(r5)
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
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25081.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ PullToRefreshModifierNode(boolean z10, InterfaceC10559a interfaceC10559a, boolean z11, PullToRefreshState pullToRefreshState, float f10, AbstractC9126n abstractC9126n) {
        this(z10, interfaceC10559a, z11, pullToRefreshState, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToHidden(p179m7.InterfaceC9324c<? super p123h7.C8736p> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25041
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25041) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC9079b.m15926b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r5)
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
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToHidden(m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToThreshold(p179m7.InterfaceC9324c<? super p123h7.C8736p> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25051
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25051) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC9079b.m15926b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r5)
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
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToThreshold(m7.c):java.lang.Object");
    }

    private final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() <= getThresholdPx()) {
            return getAdjustedDistancePulled();
        }
        float fM13517l = AbstractC8323h.m13517l(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThresholdPx() + (getThresholdPx() * (fM13517l - (((float) Math.pow(fM13517l, 2)) / 4)));
    }

    /* renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    private final long m23013consumeAvailableOffsetMKHz9U(long j10) {
        float distancePulled;
        if (this.isRefreshing) {
            distancePulled = 0.0f;
        } else {
            float fM13509d = AbstractC8323h.m13509d(getDistancePulled() + Offset.m24036getYimpl(j10), 0.0f);
            distancePulled = fM13509d - getDistancePulled();
            setDistancePulled(fM13509d);
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
        return ((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity())).mo20491roundToPx0680j_4(this.threshold);
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
    public final java.lang.Object onRelease(float r7, p179m7.InterfaceC9324c<? super java.lang.Float> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25071
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C25071) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r8)
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
            kotlin.AbstractC9079b.m15926b(r8)
            goto L6c
        L45:
            kotlin.AbstractC9079b.m15926b(r8)
            boolean r8 = r6.isRefreshing
            if (r8 == 0) goto L51
            java.lang.Float r7 = p201o7.AbstractC9536a.m17797b(r5)
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
            x7.a r8 = r0.onRefresh
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
            java.lang.Float r7 = p201o7.AbstractC9536a.m17797b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.onRelease(float, m7.c):java.lang.Object");
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

    public final InterfaceC10559a getOnRefresh() {
        return this.onRefresh;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m23014getThresholdD9Ej5fM() {
        return this.threshold;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        delegate(this.nestedScrollNode);
        AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C25061(null), 3, null);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo20628onPostScrollDzOQY0M(long j10, long j11, int i10) {
        if (this.state.isAnimating()) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        if (!this.enabled) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m25382equalsimpl0(i10, NestedScrollSource.Companion.m25394getUserInputWNlRxjI())) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        long jM23013consumeAvailableOffsetMKHz9U = m23013consumeAvailableOffsetMKHz9U(j11);
        AbstractC8839h.m14861d(getCoroutineScope(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3, null);
        return jM23013consumeAvailableOffsetMKHz9U;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo20933onPreFlingQWom1Mo(long r5, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.unit.Velocity> r7) throws java.lang.Throwable {
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.F$0
            kotlin.AbstractC9079b.m15926b(r7)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.AbstractC9079b.m15926b(r7)
            float r5 = androidx.compose.p013ui.unit.Velocity.m27138getYimpl(r5)
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
            long r5 = androidx.compose.p013ui.unit.VelocityKt.Velocity(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p013ui.unit.Velocity.m27128boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.mo20933onPreFlingQWom1Mo(long, m7.c):java.lang.Object");
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo20934onPreScrollOzD1aCk(long j10, int i10) {
        return this.state.isAnimating() ? Offset.Companion.m24051getZeroF1C5BW0() : !this.enabled ? Offset.Companion.m24051getZeroF1C5BW0() : (!NestedScrollSource.m25382equalsimpl0(i10, NestedScrollSource.Companion.m25394getUserInputWNlRxjI()) || Offset.m24036getYimpl(j10) >= 0.0f) ? Offset.Companion.m24051getZeroF1C5BW0() : m23013consumeAvailableOffsetMKHz9U(j10);
    }

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public final void setOnRefresh(InterfaceC10559a interfaceC10559a) {
        this.onRefresh = interfaceC10559a;
    }

    public final void setRefreshing(boolean z10) {
        this.isRefreshing = z10;
    }

    public final void setState(PullToRefreshState pullToRefreshState) {
        this.state = pullToRefreshState;
    }

    /* renamed from: setThreshold-0680j_4, reason: not valid java name */
    public final void m23015setThreshold0680j_4(float f10) {
        this.threshold = f10;
    }

    public final void update() {
        AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C25081(null), 3, null);
    }

    private PullToRefreshModifierNode(boolean z10, InterfaceC10559a interfaceC10559a, boolean z11, PullToRefreshState pullToRefreshState, float f10) {
        this.isRefreshing = z10;
        this.onRefresh = interfaceC10559a;
        this.enabled = z11;
        this.state = pullToRefreshState;
        this.threshold = f10;
        this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.verticalOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }
}
