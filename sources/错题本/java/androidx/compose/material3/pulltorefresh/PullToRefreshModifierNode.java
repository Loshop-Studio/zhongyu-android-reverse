package androidx.compose.material3.pulltorefresh;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010 \u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0011J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0018\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b-\u0010,R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b\u0005\u0010/\"\u0004\b0\u00101R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010.\u001a\u0004\b7\u0010/\"\u0004\b8\u00101R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010*\"\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR+\u0010J\u001a\u00020%2\u0006\u0010E\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010*\"\u0004\bI\u0010AR+\u0010N\u001a\u00020%2\u0006\u0010E\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010G\u001a\u0004\bL\u0010*\"\u0004\bM\u0010AR\u0014\u0010P\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010*R\u0014\u0010T\u001a\u00020Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, m5110d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "isRefreshing", "Lkotlin/Function0;", "Ld6/s;", "onRefresh", "enabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/unit/Dp;", "threshold", "<init>", "(ZLr6/a;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;FLkotlin/jvm/internal/e;)V", "onAttach", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLh6/c;)Ljava/lang/Object;", "onPreFling", "update", "consumeAvailableOffset-MK-Hz9U", "(J)J", "consumeAvailableOffset", "", "velocity", "onRelease", "(FLh6/c;)Ljava/lang/Object;", "calculateVerticalOffset", "()F", "animateToThreshold", "(Lh6/c;)Ljava/lang/Object;", "animateToHidden", "Z", "()Z", "setRefreshing", "(Z)V", "Lr6/a;", "getOnRefresh", "()Lr6/a;", "setOnRefresh", "(Lr6/a;)V", "getEnabled", "setEnabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "getState", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "setState", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;)V", "F", "getThreshold-D9Ej5fM", "setThreshold-0680j_4", "(F)V", "Landroidx/compose/ui/node/DelegatableNode;", "nestedScrollNode", "Landroidx/compose/ui/node/DelegatableNode;", "<set-?>", "verticalOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getVerticalOffset", "setVerticalOffset", "verticalOffset", "distancePulled$delegate", "getDistancePulled", "setDistancePulled", "distancePulled", "getAdjustedDistancePulled", "adjustedDistancePulled", "", "getThresholdPx", "()I", "thresholdPx", "getProgress", "progress", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,678:1\n76#2:679\n109#2,2:680\n76#2:682\n109#2,2:683\n1#3:685\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode\n*L\n271#1:679\n271#1:680,2\n272#1:682\n272#1:683,2\n*E\n"})
/* loaded from: classes.dex */
public final class PullToRefreshModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {
    public static final int $stable = 8;

    /* renamed from: distancePulled$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState distancePulled;
    private boolean enabled;
    private boolean isRefreshing;

    @NotNull
    private DelegatableNode nestedScrollNode;

    @NotNull
    private InterfaceC6469a onRefresh;

    @NotNull
    private PullToRefreshState state;
    private float threshold;

    /* renamed from: verticalOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState verticalOffset;

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m5303f = "PullToRefresh.kt", m5304i = {0}, m5305l = {406}, m5306m = "animateToHidden", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 */
    public static final class C19751 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19751(InterfaceC5631c<? super C19751> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToHidden(this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m5303f = "PullToRefresh.kt", m5304i = {0}, m5305l = {400}, m5306m = "animateToThreshold", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 */
    public static final class C19761 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19761(InterfaceC5631c<? super C19761> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToThreshold(this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", m5303f = "PullToRefresh.kt", m5304i = {}, m5305l = {287, 289}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1 */
    public static final class C19771 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C19771(InterfaceC5631c<? super C19771> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            return PullToRefreshModifierNode.this.new C19771(interfaceC5631c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r5.snapTo(1.0f, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (r5.snapTo(0.0f, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                kotlin.AbstractC5774b.m5119b(r5)
                goto L45
            L19:
                kotlin.AbstractC5774b.m5119b(r5)
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                boolean r5 = r5.getIsRefreshing()
                if (r5 == 0) goto L35
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r5.getState()
                r4.label = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                java.lang.Object r5 = r5.snapTo(r1, r4)
                if (r5 != r0) goto L45
                goto L44
            L35:
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r5.getState()
                r4.label = r2
                r1 = 0
                java.lang.Object r5 = r5.snapTo(r1, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                d6.s r5 = p045d6.C5443s.f8405a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C19771.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C19771) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m5303f = "PullToRefresh.kt", m5304i = {0, 0, 1, 1}, m5305l = {359, 362}, m5306m = "onRelease", m5307n = {"this", "velocity", "this", "velocity"}, m5308s = {"L$0", "F$0", "L$0", "F$0"})
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 */
    public static final class C19781 extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19781(InterfaceC5631c<? super C19781> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.onRelease(0.0f, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", m5303f = "PullToRefresh.kt", m5304i = {}, m5305l = {333, 335}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1 */
    public static final class C19791 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C19791(InterfaceC5631c<? super C19791> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            return PullToRefreshModifierNode.this.new C19791(interfaceC5631c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r5.animateToHidden(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r5.animateToThreshold(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                kotlin.AbstractC5774b.m5119b(r5)
                goto L3a
            L19:
                kotlin.AbstractC5774b.m5119b(r5)
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                boolean r5 = r5.getIsRefreshing()
                if (r5 != 0) goto L2f
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                r4.label = r3
                java.lang.Object r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.access$animateToHidden(r5, r4)
                if (r5 != r0) goto L3a
                goto L39
            L2f:
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                r4.label = r2
                java.lang.Object r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.access$animateToThreshold(r5, r4)
                if (r5 != r0) goto L3a
            L39:
                return r0
            L3a:
                d6.s r5 = p045d6.C5443s.f8405a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C19791.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C19791) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public /* synthetic */ PullToRefreshModifierNode(boolean z8, InterfaceC6469a interfaceC6469a, boolean z9, PullToRefreshState pullToRefreshState, float f, AbstractC5824e abstractC5824e) {
        this(z8, interfaceC6469a, z9, pullToRefreshState, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToHidden(p075h6.InterfaceC5631c<? super p045d6.C5443s> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C19751
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C19751) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC5774b.m5119b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.AbstractC5774b.m5119b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.state
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.animateToHidden(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            r5 = 0
            r0.setDistancePulled(r5)
            r0.setVerticalOffset(r5)
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToHidden(h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToThreshold(p075h6.InterfaceC5631c<? super p045d6.C5443s> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C19761
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C19761) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC5774b.m5119b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.AbstractC5774b.m5119b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.state
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.animateToThreshold(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            int r5 = r0.getThresholdPx()
            float r5 = (float) r5
            r0.setDistancePulled(r5)
            int r5 = r0.getThresholdPx()
            float r5 = (float) r5
            r0.setVerticalOffset(r5)
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToThreshold(h6.c):java.lang.Object");
    }

    private final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() <= getThresholdPx()) {
            return getAdjustedDistancePulled();
        }
        float fM5273l = AbstractC5806u.m5273l(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThresholdPx() + (getThresholdPx() * (fM5273l - (((float) Math.pow(fM5273l, 2)) / 4)));
    }

    /* renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    private final long m9419consumeAvailableOffsetMKHz9U(long available) {
        float distancePulled;
        if (this.isRefreshing) {
            distancePulled = 0.0f;
        } else {
            float fM10442getYimpl = Offset.m10442getYimpl(available) + getDistancePulled();
            if (fM10442getYimpl < 0.0f) {
                fM10442getYimpl = 0.0f;
            }
            distancePulled = fM10442getYimpl - getDistancePulled();
            setDistancePulled(fM10442getYimpl);
            setVerticalOffset(calculateVerticalOffset());
        }
        return OffsetKt.Offset(0.0f, distancePulled);
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled() * 0.5f;
    }

    private final float getDistancePulled() {
        return this.distancePulled.getFloatValue();
    }

    private final float getProgress() {
        return getAdjustedDistancePulled() / getThresholdPx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getThresholdPx() {
        return ((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity())).mo6897roundToPx0680j_4(this.threshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getVerticalOffset() {
        return this.verticalOffset.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRelease(float r7, p075h6.InterfaceC5631c<? super java.lang.Float> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C19781
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C19781) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            float r7 = r0.F$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC5774b.m5119b(r8)
            goto L7f
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            float r7 = r0.F$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r0
            kotlin.AbstractC5774b.m5119b(r8)
            goto L6b
        L43:
            kotlin.AbstractC5774b.m5119b(r8)
            boolean r8 = r6.isRefreshing
            if (r8 == 0) goto L50
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r5)
            return r7
        L50:
            float r8 = r6.getAdjustedDistancePulled()
            int r2 = r6.getThresholdPx()
            float r2 = (float) r2
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L71
            r0.L$0 = r6
            r0.F$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.animateToThreshold(r0)
            if (r8 != r1) goto L6a
            goto L7d
        L6a:
            r0 = r6
        L6b:
            r6.a r8 = r0.onRefresh
            r8.invoke()
            goto L7f
        L71:
            r0.L$0 = r6
            r0.F$0 = r7
            r0.label = r3
            java.lang.Object r8 = r6.animateToHidden(r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r0 = r6
        L7f:
            float r8 = r0.getDistancePulled()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L89
        L87:
            r7 = r5
            goto L8e
        L89:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L8e
            goto L87
        L8e:
            r0.setDistancePulled(r5)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.onRelease(float, h6.c):java.lang.Object");
    }

    private final void setDistancePulled(float f) {
        this.distancePulled.setFloatValue(f);
    }

    private final void setVerticalOffset(float f) {
        this.verticalOffset.setFloatValue(f);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final InterfaceC6469a getOnRefresh() {
        return this.onRefresh;
    }

    @NotNull
    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name and from getter */
    public final float getThreshold() {
        return this.threshold;
    }

    /* renamed from: isRefreshing, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        delegate(this.nestedScrollNode);
        AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C19771(null), 3);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.state.isAnimating()) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        if (!this.enabled) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m11788equalsimpl0(source, NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI())) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        long jM9419consumeAvailableOffsetMKHz9U = m9419consumeAvailableOffsetMKHz9U(available);
        AbstractC6014x.m5651v(getCoroutineScope(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3);
        return jM9419consumeAvailableOffsetMKHz9U;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7339onPreFlingQWom1Mo(long r5, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r7) {
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            float r5 = r0.F$0
            kotlin.AbstractC5774b.m5119b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.AbstractC5774b.m5119b(r7)
            float r5 = androidx.compose.p011ui.unit.Velocity.m13544getYimpl(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r4.onRelease(r5, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            r5 = r6
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.p011ui.unit.VelocityKt.Velocity(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.mo7339onPreFlingQWom1Mo(long, h6.c):java.lang.Object");
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7340onPreScrollOzD1aCk(long available, int source) {
        return this.state.isAnimating() ? Offset.INSTANCE.m10457getZeroF1C5BW0() : !this.enabled ? Offset.INSTANCE.m10457getZeroF1C5BW0() : (!NestedScrollSource.m11788equalsimpl0(source, NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI()) || Offset.m10442getYimpl(available) >= 0.0f) ? Offset.INSTANCE.m10457getZeroF1C5BW0() : m9419consumeAvailableOffsetMKHz9U(available);
    }

    public final void setEnabled(boolean z8) {
        this.enabled = z8;
    }

    public final void setOnRefresh(@NotNull InterfaceC6469a interfaceC6469a) {
        this.onRefresh = interfaceC6469a;
    }

    public final void setRefreshing(boolean z8) {
        this.isRefreshing = z8;
    }

    public final void setState(@NotNull PullToRefreshState pullToRefreshState) {
        this.state = pullToRefreshState;
    }

    /* renamed from: setThreshold-0680j_4, reason: not valid java name */
    public final void m9421setThreshold0680j_4(float f) {
        this.threshold = f;
    }

    public final void update() {
        AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C19791(null), 3);
    }

    private PullToRefreshModifierNode(boolean z8, InterfaceC6469a interfaceC6469a, boolean z9, PullToRefreshState pullToRefreshState, float f) {
        this.isRefreshing = z8;
        this.onRefresh = interfaceC6469a;
        this.enabled = z9;
        this.state = pullToRefreshState;
        this.threshold = f;
        this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.verticalOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }
}
