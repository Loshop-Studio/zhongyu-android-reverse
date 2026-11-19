package androidx.compose.foundation;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusEventModifierNode;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.InterfaceC5910f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J@\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010$\u001a\u00020!*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010(\u001a\u00020\u0005*\u00020%2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u0005*\u00020%2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010)J#\u0010,\u001a\u00020\u0005*\u00020%2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010)J#\u0010-\u001a\u00020\u0005*\u00020%2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010)J\u0013\u0010/\u001a\u00020\u0011*\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0002¢\u0006\u0004\b1\u0010\u0013J\u0010\u00102\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b2\u00103R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00104R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00104R\u001c\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u00105R+\u0010=\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010A\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R+\u0010I\u001a\u00020B2\u0006\u00106\u001a\u00020B8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR+\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010D\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR1\u0010\b\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bU\u0010D\u001a\u0004\bV\u0010:\"\u0004\bW\u0010<R \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001b\u0010`\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010:R\u0014\u0010c\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, m5110d2 = {"Landroidx/compose/foundation/MarqueeModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "", "iterations", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "velocity", "<init>", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/e;)V", "Ld6/s;", "onAttach", "()V", "onDetach", "update-lWfNwf4", "(IIIILandroidx/compose/foundation/MarqueeSpacing;F)V", "update", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "restartAnimation", "runAnimation", "(Lh6/c;)Ljava/lang/Object;", "I", "F", "<set-?>", "contentWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "getContentWidth", "()I", "setContentWidth", "(I)V", "contentWidth", "containerWidth$delegate", "getContainerWidth", "setContainerWidth", "containerWidth", "", "hasFocus$delegate", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus", "Lkotlinx/coroutines/w0;", "animationJob", "Lkotlinx/coroutines/w0;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "marqueeLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "spacing$delegate", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "setSpacing", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "animationMode$delegate", "getAnimationMode-ZbEOnfQ", "setAnimationMode-97h66l8", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/animation/core/Animatable;", "spacingPx$delegate", "Landroidx/compose/runtime/State;", "getSpacingPx", "spacingPx", "getDirection", "()F", "direction", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,535:1\n78#2:536\n107#2,2:537\n78#2:539\n107#2,2:540\n85#3:542\n113#3,2:543\n85#3:545\n113#3,2:546\n85#3:548\n113#3,2:549\n85#3:551\n61#4:552\n61#4:562\n70#5:553\n80#5:556\n70#5:563\n22#6:554\n22#6:564\n30#7:555\n202#8,5:557\n207#8,3:565\n249#8,9:568\n119#8,8:577\n119#8,8:585\n259#8,4:593\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n*L\n211#1:536\n211#1:537,2\n212#1:539\n212#1:540,2\n213#1:542\n213#1:543,2\n216#1:545\n216#1:546,2\n217#1:548\n217#1:549,2\n228#1:551\n343#1:552\n349#1:562\n343#1:553\n345#1:556\n349#1:563\n343#1:554\n349#1:564\n345#1:555\n349#1:557,5\n349#1:565,3\n349#1:568,9\n359#1:577,8\n366#1:585,8\n349#1:593,4\n*E\n"})
/* loaded from: classes.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {

    @Nullable
    private InterfaceC6013w0 animationJob;

    /* renamed from: animationMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animationMode;

    /* renamed from: containerWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState containerWidth;

    /* renamed from: contentWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState contentWidth;
    private int delayMillis;

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState hasFocus;
    private int initialDelayMillis;
    private int iterations;

    @Nullable
    private GraphicsLayer marqueeLayer;

    @NotNull
    private final Animatable<Float, AnimationVector1D> offset;

    /* renamed from: spacing$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState spacing;

    /* renamed from: spacingPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final State spacingPx;
    private float velocity;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", m5303f = "BasicMarquee.kt", m5304i = {}, m5305l = {379, 380}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1 */
    public static final class C07791 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6013w0 $oldJob;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07791(InterfaceC6013w0 interfaceC6013w0, MarqueeModifierNode marqueeModifierNode, InterfaceC5631c<? super C07791> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$oldJob = interfaceC6013w0;
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C07791(this.$oldJob, this.this$0, interfaceC5631c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            if (r5.runAnimation(r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.AbstractC5774b.m5119b(r5)
                goto L37
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                kotlin.AbstractC5774b.m5119b(r5)
                goto L2c
            L1c:
                kotlin.AbstractC5774b.m5119b(r5)
                kotlinx.coroutines.w0 r5 = r4.$oldJob
                if (r5 == 0) goto L2c
                r4.label = r3
                java.lang.Object r5 = r5.mo5456e(r4)
                if (r5 != r0) goto L2c
                goto L36
            L2c:
                androidx.compose.foundation.MarqueeModifierNode r5 = r4.this$0
                r4.label = r2
                java.lang.Object r5 = androidx.compose.foundation.MarqueeModifierNode.access$runAnimation(r5, r4)
                if (r5 != r0) goto L37
            L36:
                return r0
            L37:
                d6.s r5 = p045d6.C5443s.f8405a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.C07791.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C07791) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", m5303f = "BasicMarquee.kt", m5304i = {}, m5305l = {TypedValues.CycleType.TYPE_VISIBILITY}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2 */
    public static final class C07802 extends SuspendLambda implements InterfaceC6473e {
        int label;

        @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "contentWithSpacingWidth", "Ld6/s;", "<anonymous>", "(F)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", m5303f = "BasicMarquee.kt", m5304i = {0, 0}, m5305l = {TypedValues.CycleType.TYPE_PATH_ROTATE, 418, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m5306m = "invokeSuspend", m5307n = {"contentWithSpacingWidth", "spec"}, m5308s = {"L$0", "L$1"})
        /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MarqueeModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MarqueeModifierNode marqueeModifierNode, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = marqueeModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC5631c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(Float f, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass2) create(f, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00be A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
                /*
                    r21 = this;
                    r5 = r21
                    kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r0 = r5.label
                    d6.s r9 = p045d6.C5443s.f8405a
                    r10 = 4
                    r11 = 3
                    r1 = 2
                    r2 = 1
                    r12 = 0
                    r13 = 0
                    if (r0 == 0) goto L47
                    if (r0 == r2) goto L36
                    if (r0 == r1) goto L2e
                    if (r0 == r11) goto L29
                    if (r0 == r10) goto L20
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L20:
                    java.lang.Object r0 = r5.L$0
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.AbstractC5774b.m5119b(r22)
                    goto Ld7
                L29:
                    kotlin.AbstractC5774b.m5119b(r22)
                    goto Lbe
                L2e:
                    kotlin.AbstractC5774b.m5119b(r22)     // Catch: java.lang.Throwable -> L33
                    goto Laa
                L33:
                    r0 = move-exception
                    goto Lbf
                L36:
                    java.lang.Object r0 = r5.L$1
                    androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                    java.lang.Object r2 = r5.L$0
                    java.lang.Float r2 = (java.lang.Float) r2
                    kotlin.AbstractC5774b.m5119b(r22)
                    r20 = r2
                    r2 = r0
                    r0 = r20
                    goto L90
                L47:
                    kotlin.AbstractC5774b.m5119b(r22)
                    java.lang.Object r0 = r5.L$0
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 != 0) goto L51
                    return r9
                L51:
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r14 = androidx.compose.foundation.MarqueeModifierNode.access$getIterations$p(r3)
                    float r15 = r0.floatValue()
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r16 = androidx.compose.foundation.MarqueeModifierNode.access$getInitialDelayMillis$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r17 = androidx.compose.foundation.MarqueeModifierNode.access$getDelayMillis$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    float r18 = androidx.compose.foundation.MarqueeModifierNode.access$getVelocity$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    androidx.compose.ui.unit.Density r19 = androidx.compose.p011ui.node.DelegatableNodeKt.requireDensity(r3)
                    androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m6759access$createMarqueeAnimationSpecZ4HSEVQ(r14, r15, r16, r17, r18, r19)
                    androidx.compose.foundation.MarqueeModifierNode r4 = r5.this$0
                    androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r4)
                    java.lang.Float r6 = new java.lang.Float
                    r6.<init>(r13)
                    r5.L$0 = r0
                    r5.L$1 = r3
                    r5.label = r2
                    java.lang.Object r2 = r4.snapTo(r6, r5)
                    if (r2 != r8) goto L8f
                    goto Ld6
                L8f:
                    r2 = r3
                L90:
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0     // Catch: java.lang.Throwable -> L33
                    androidx.compose.animation.core.Animatable r3 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r3)     // Catch: java.lang.Throwable -> L33
                    r5.L$0 = r12     // Catch: java.lang.Throwable -> L33
                    r5.L$1 = r12     // Catch: java.lang.Throwable -> L33
                    r5.label = r1     // Catch: java.lang.Throwable -> L33
                    r1 = r0
                    r0 = r3
                    r3 = 0
                    r4 = 0
                    r6 = 12
                    r7 = 0
                    java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
                    if (r0 != r8) goto Laa
                    goto Ld6
                Laa:
                    androidx.compose.foundation.MarqueeModifierNode r0 = r5.this$0
                    androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r0)
                    java.lang.Float r1 = new java.lang.Float
                    r1.<init>(r13)
                    r5.label = r11
                    java.lang.Object r0 = r0.snapTo(r1, r5)
                    if (r0 != r8) goto Lbe
                    goto Ld6
                Lbe:
                    return r9
                Lbf:
                    androidx.compose.foundation.MarqueeModifierNode r1 = r5.this$0
                    androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r1)
                    java.lang.Float r2 = new java.lang.Float
                    r2.<init>(r13)
                    r5.L$0 = r0
                    r5.L$1 = r12
                    r5.label = r10
                    java.lang.Object r1 = r1.snapTo(r2, r5)
                    if (r1 != r8) goto Ld7
                Ld6:
                    return r8
                Ld7:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.C07802.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C07802(InterfaceC5631c<? super C07802> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return MarqueeModifierNode.this.new C07802(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final MarqueeModifierNode marqueeModifierNode = MarqueeModifierNode.this;
                InterfaceC5910f interfaceC5910fSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC6469a() { // from class: androidx.compose.foundation.MarqueeModifierNode.runAnimation.2.1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public final Float invoke() {
                        if (marqueeModifierNode.getContentWidth() <= marqueeModifierNode.getContainerWidth()) {
                            return null;
                        }
                        if (!MarqueeAnimationMode.m6833equalsimpl0(marqueeModifierNode.m6844getAnimationModeZbEOnfQ(), MarqueeAnimationMode.INSTANCE.m6838getWhileFocusedZbEOnfQ()) || marqueeModifierNode.getHasFocus()) {
                            return Float.valueOf(marqueeModifierNode.getContentWidth() + marqueeModifierNode.getSpacingPx());
                        }
                        return null;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(MarqueeModifierNode.this, null);
                this.label = 1;
                if (AbstractC5914h.m5552h(interfaceC5910fSnapshotFlow, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C07802) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public /* synthetic */ MarqueeModifierNode(int i, int i8, int i9, int i10, MarqueeSpacing marqueeSpacing, float f, AbstractC5824e abstractC5824e) {
        this(i, i8, i9, i10, marqueeSpacing, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerWidth() {
        return this.containerWidth.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentWidth() {
        return this.contentWidth.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDirection() {
        float fSignum = Math.signum(this.velocity);
        int i = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        int i8 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i8 = -1;
        }
        return fSignum * i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx.getValue()).intValue();
    }

    private final void restartAnimation() {
        InterfaceC6013w0 interfaceC6013w0 = this.animationJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        if (getIsAttached()) {
            this.animationJob = AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C07791(interfaceC6013w0, this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5626F;
        int i = this.iterations;
        C5443s c5443s = C5443s.f8405a;
        return (i > 0 && (objM5626F = AbstractC6014x.m5626F(FixedMotionDurationScale.INSTANCE, new C07802(null), interfaceC5631c)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM5626F : c5443s;
    }

    private final void setContainerWidth(int i) {
        this.containerWidth.setIntValue(i);
    }

    private final void setContentWidth(int i) {
        this.contentWidth.setIntValue(i);
    }

    private final void setHasFocus(boolean z8) {
        this.hasFocus.setValue(Boolean.valueOf(z8));
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull final ContentDrawScope contentDrawScope) {
        float fFloatValue = this.offset.getValue().floatValue() * getDirection();
        boolean z8 = getDirection() != 1.0f ? this.offset.getValue().floatValue() < ((float) getContainerWidth()) : this.offset.getValue().floatValue() < ((float) getContentWidth());
        boolean z9 = getDirection() != 1.0f ? this.offset.getValue().floatValue() > ((float) getSpacingPx()) : this.offset.getValue().floatValue() > ((float) ((getContentWidth() + getSpacingPx()) - getContainerWidth()));
        float contentWidth = getDirection() == 1.0f ? getContentWidth() + getSpacingPx() : (-getContentWidth()) - getSpacingPx();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() & 4294967295L));
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            contentDrawScope.mo11234recordJVtK1S4(graphicsLayer, IntSize.m13471constructorimpl((getContentWidth() << 32) | (AbstractC6600a.m6241q(fIntBitsToFloat) & 4294967295L)), new InterfaceC6471c() { // from class: androidx.compose.foundation.MarqueeModifierNode$draw$1$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DrawScope) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(DrawScope drawScope) {
                    contentDrawScope.drawContent();
                }
            });
        }
        float containerWidth = fFloatValue + getContainerWidth();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & contentDrawScope.mo11233getSizeNHjbRc()));
        int iM10671getIntersectrtfAjoo = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11157clipRectN_I0leg(fFloatValue, 0.0f, containerWidth, fIntBitsToFloat2, iM10671getIntersectrtfAjoo);
            GraphicsLayer graphicsLayer2 = this.marqueeLayer;
            if (graphicsLayer2 != null) {
                if (z8) {
                    GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer2);
                }
                if (z9) {
                    contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer2);
                        contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
                    } finally {
                    }
                }
            } else {
                if (z8) {
                    contentDrawScope.drawContent();
                }
                if (z9) {
                    contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
                    try {
                        contentDrawScope.drawContent();
                        contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
                    } finally {
                    }
                }
            }
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        } catch (Throwable th) {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m6844getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode.getValue()).getValue();
    }

    @NotNull
    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing.getValue();
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m13275constrainWidthK40F9xA(j7, placeableMo12033measureBRTryo0.getWidth()));
        setContentWidth(placeableMo12033measureBRTryo0.getWidth());
        return MeasureScope.layout$default(measureScope, getContainerWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.foundation.MarqueeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo12033measureBRTryo0, AbstractC6600a.m6241q((-((Number) this.offset.getValue()).floatValue()) * this.getDirection()), 0, 0.0f, (InterfaceC6471c) null, 12, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        GraphicsContext graphicsContextRequireGraphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        if (graphicsLayer != null) {
            graphicsContextRequireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.marqueeLayer = graphicsContextRequireGraphicsContext.createGraphicsLayer();
        restartAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        InterfaceC6013w0 interfaceC6013w0 = this.animationJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.animationJob = null;
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
            this.marqueeLayer = null;
        }
    }

    @Override // androidx.compose.p011ui.focus.FocusEventModifierNode
    public void onFocusEvent(@NotNull FocusState focusState) {
        setHasFocus(focusState.getHasFocus());
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m6845setAnimationMode97h66l8(int i) {
        this.animationMode.setValue(MarqueeAnimationMode.m6830boximpl(i));
    }

    public final void setSpacing(@NotNull MarqueeSpacing marqueeSpacing) {
        this.spacing.setValue(marqueeSpacing);
    }

    /* renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m6846updatelWfNwf4(int iterations, int animationMode, int delayMillis, int initialDelayMillis, @NotNull MarqueeSpacing spacing, float velocity) {
        setSpacing(spacing);
        m6845setAnimationMode97h66l8(animationMode);
        if (this.iterations == iterations && this.delayMillis == delayMillis && this.initialDelayMillis == initialDelayMillis && C2331Dp.m13310equalsimpl0(this.velocity, velocity)) {
            return;
        }
        this.iterations = iterations;
        this.delayMillis = delayMillis;
        this.initialDelayMillis = initialDelayMillis;
        this.velocity = velocity;
        restartAnimation();
    }

    private MarqueeModifierNode(int i, int i8, int i9, int i10, final MarqueeSpacing marqueeSpacing, float f) {
        this.iterations = i;
        this.delayMillis = i9;
        this.initialDelayMillis = i10;
        this.velocity = f;
        this.contentWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.spacing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(marqueeSpacing, null, 2, null);
        this.animationMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m6830boximpl(i8), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx = SnapshotStateKt.derivedStateOf(new InterfaceC6469a() { // from class: androidx.compose.foundation.MarqueeModifierNode$spacingPx$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Integer invoke() {
                MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
                MarqueeModifierNode marqueeModifierNode = this;
                return Integer.valueOf(marqueeSpacing2.calculateSpacing(DelegatableNodeKt.requireDensity(marqueeModifierNode), marqueeModifierNode.getContentWidth(), marqueeModifierNode.getContainerWidth()));
            }
        });
    }
}
