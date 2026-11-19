package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RectKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.layout.LookaheadScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\bJ \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010 \u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010!R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010'R(\u0010,\u001a\u00020\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\bR/\u00107\u001a\u0004\u0018\u00010\u000e2\b\u00100\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010<\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010'R\u0013\u0010>\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b=\u00104R\u0011\u0010?\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010B\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bA\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, m5110d2 = {"Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Ld6/s;", "updateTargetOffset-k-4lQ0M", "(J)V", "updateTargetOffset", "Lkotlinx/coroutines/v;", "coroutineScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Landroidx/compose/ui/geometry/Rect;", "animate", "(Lkotlinx/coroutines/v;Landroidx/compose/animation/BoundsTransform;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Size;", "size", "updateTargetSize-uvyYCjk", "updateTargetSize", RequestParameters.POSITION, "updateCurrentBounds-tz77jQw", "(JJ)V", "updateCurrentBounds", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "", "directManipulationParentsDirty", "includeMotionFrameOfReference", "updateTargetOffsetAndAnimate", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/layout/Placeable$PlacementScope;Lkotlinx/coroutines/v;ZZLandroidx/compose/animation/BoundsTransform;)V", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "animatable", "Landroidx/compose/animation/core/Animatable;", "targetSize", "J", "targetOffset", "isPending", "Z", "currentPosition", "currentSize", "getCurrentSize-NH-jbRc", "()J", "setCurrentSize-uvyYCjk", "<set-?>", "animatedValue$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimatedValue", "()Landroidx/compose/ui/geometry/Rect;", "setAnimatedValue", "(Landroidx/compose/ui/geometry/Rect;)V", "animatedValue", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "directManipulationParents", "Ljava/util/List;", "additionalOffset", "getCurrentBounds", "currentBounds", "isIdle", "()Z", "getValue", "value", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,444:1\n148#2:445\n153#2:446\n148#2:450\n148#2:456\n273#3:447\n278#3:448\n273#3:449\n273#3:455\n85#4:451\n113#4,2:452\n150#5:454\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n*L\n295#1:445\n301#1:446\n329#1:450\n414#1:456\n311#1:447\n316#1:448\n329#1:449\n414#1:455\n344#1:451\n344#1:452,2\n405#1:454\n*E\n"})
/* loaded from: classes.dex */
public final class BoundsTransformDeferredAnimation {
    public static final int $stable = 8;
    private long additionalOffset;

    @Nullable
    private Animatable<Rect, AnimationVector4D> animatable;

    /* renamed from: animatedValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animatedValue;
    private long currentPosition;
    private long currentSize;

    @Nullable
    private List<LayoutCoordinates> directManipulationParents;
    private boolean isPending;
    private long targetOffset;
    private long targetSize;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", m5303f = "AnimateBoundsModifier.kt", m5304i = {}, m5305l = {428}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1 */
    public static final class C06211 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ Animatable<Rect, AnimationVector4D> $anim;
        final /* synthetic */ BoundsTransform $boundsTransform;
        final /* synthetic */ Rect $target;
        int label;
        final /* synthetic */ BoundsTransformDeferredAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06211(Animatable<Rect, AnimationVector4D> animatable, Rect rect, BoundsTransform boundsTransform, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, InterfaceC5631c<? super C06211> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$anim = animatable;
            this.$target = rect;
            this.$boundsTransform = boundsTransform;
            this.this$0 = boundsTransformDeferredAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C06211(this.$anim, this.$target, this.$boundsTransform, this.this$0, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                Animatable<Rect, AnimationVector4D> animatable = this.$anim;
                Rect rect = this.$target;
                BoundsTransform boundsTransform = this.$boundsTransform;
                Rect currentBounds = this.this$0.getCurrentBounds();
                AbstractC5830k.m5327d(currentBounds);
                FiniteAnimationSpec<Rect> finiteAnimationSpecTransform = boundsTransform.transform(currentBounds, this.$target);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, rect, finiteAnimationSpecTransform, null, null, this, 12, null) == coroutineSingletons) {
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
            return ((C06211) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public BoundsTransformDeferredAnimation() {
        Size.Companion companion = Size.INSTANCE;
        this.targetSize = companion.m10518getUnspecifiedNHjbRc();
        Offset.Companion companion2 = Offset.INSTANCE;
        this.targetOffset = companion2.m10456getUnspecifiedF1C5BW0();
        this.currentPosition = companion2.m10456getUnspecifiedF1C5BW0();
        this.currentSize = companion.m10518getUnspecifiedNHjbRc();
        this.animatedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.additionalOffset = companion2.m10457getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.p011ui.geometry.Rect animate(kotlinx.coroutines.InterfaceC6009v r13, androidx.compose.animation.BoundsTransform r14) {
        /*
            r12 = this;
            long r0 = r12.targetOffset
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L4b
            long r2 = r12.targetSize
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L4b
            androidx.compose.ui.geometry.Rect r6 = androidx.compose.p011ui.geometry.RectKt.m10481Recttz77jQw(r0, r2)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> r0 = r12.animatable
            if (r0 != 0) goto L30
            androidx.compose.animation.core.Animatable r5 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p011ui.geometry.Rect.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r7 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(r0)
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = r5
        L30:
            r12.animatable = r0
            boolean r1 = r12.isPending
            if (r1 == 0) goto L4b
            r1 = 0
            r12.isPending = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1 r5 = new androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1
            r10 = 0
            r9 = r12
            r8 = r14
            r7 = r6
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14 = 1
            r0 = 0
            kotlinx.coroutines.AbstractC6014x.m5651v(r13, r0, r1, r5, r14)
            goto L4c
        L4b:
            r9 = r12
        L4c:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> r13 = r9.animatable
            if (r13 == 0) goto L5a
            java.lang.Object r13 = r13.getValue()
            androidx.compose.ui.geometry.Rect r13 = (androidx.compose.p011ui.geometry.Rect) r13
            if (r13 != 0) goto L59
            goto L5a
        L59:
            return r13
        L5a:
            androidx.compose.ui.geometry.Rect$Companion r13 = androidx.compose.p011ui.geometry.Rect.INSTANCE
            androidx.compose.ui.geometry.Rect r13 = r13.getZero()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.BoundsTransformDeferredAnimation.animate(kotlinx.coroutines.v, androidx.compose.animation.BoundsTransform):androidx.compose.ui.geometry.Rect");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect getAnimatedValue() {
        return (Rect) this.animatedValue.getValue();
    }

    private final void setAnimatedValue(Rect rect) {
        this.animatedValue.setValue(rect);
    }

    /* renamed from: updateTargetOffset-k-4lQ0M, reason: not valid java name */
    private final void m6580updateTargetOffsetk4lQ0M(long offset) {
        if ((this.targetOffset & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats && !IntOffset.m13432equalsimpl0(IntOffsetKt.m13450roundk4lQ0M(offset), IntOffsetKt.m13450roundk4lQ0M(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = offset;
        if ((this.currentPosition & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentPosition = offset;
        }
    }

    @Nullable
    public final Rect getCurrentBounds() {
        long j7 = this.currentSize;
        long j8 = this.currentPosition;
        if ((9223372034707292159L & j8) == InlineClassHelperKt.UnspecifiedPackedFloats || j7 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return null;
        }
        return RectKt.m10481Recttz77jQw(j8, j7);
    }

    /* renamed from: getCurrentSize-NH-jbRc, reason: not valid java name and from getter */
    public final long getCurrentSize() {
        return this.currentSize;
    }

    @Nullable
    public final Rect getValue() {
        if (isIdle()) {
            return null;
        }
        return getAnimatedValue();
    }

    public final boolean isIdle() {
        if (this.isPending) {
            return false;
        }
        Animatable<Rect, AnimationVector4D> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    /* renamed from: setCurrentSize-uvyYCjk, reason: not valid java name */
    public final void m6582setCurrentSizeuvyYCjk(long j7) {
        this.currentSize = j7;
    }

    /* renamed from: updateCurrentBounds-tz77jQw, reason: not valid java name */
    public final void m6583updateCurrentBoundstz77jQw(long position, long size) {
        this.currentPosition = position;
        this.currentSize = size;
    }

    public final void updateTargetOffsetAndAnimate(@NotNull LookaheadScope lookaheadScope, @NotNull Placeable.PlacementScope placementScope, @NotNull InterfaceC6009v coroutineScope, boolean directManipulationParentsDirty, boolean includeMotionFrameOfReference, @NotNull BoundsTransform boundsTransform) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            LayoutCoordinates lookaheadScopeCoordinates = lookaheadScope.getLookaheadScopeCoordinates(placementScope);
            long jM10457getZeroF1C5BW0 = Offset.INSTANCE.m10457getZeroF1C5BW0();
            if (!includeMotionFrameOfReference && directManipulationParentsDirty) {
                List<LayoutCoordinates> arrayList = this.directManipulationParents;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                int i = 0;
                LayoutCoordinates parentCoordinates = coordinates;
                while (!AbstractC5830k.m5325b(lookaheadScope.toLookaheadCoordinates(parentCoordinates), lookaheadScopeCoordinates)) {
                    if (parentCoordinates.getIntroducesMotionFrameOfReference()) {
                        if (arrayList.size() == i) {
                            arrayList.add(parentCoordinates);
                            jM10457getZeroF1C5BW0 = Offset.m10446plusMKHz9U(jM10457getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(parentCoordinates));
                        } else if (!AbstractC5830k.m5325b(arrayList.get(i), parentCoordinates)) {
                            long jM10445minusMKHz9U = Offset.m10445minusMKHz9U(jM10457getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(arrayList.get(i)));
                            arrayList.set(i, parentCoordinates);
                            jM10457getZeroF1C5BW0 = Offset.m10446plusMKHz9U(jM10445minusMKHz9U, LayoutCoordinatesKt.positionInParent(parentCoordinates));
                        }
                        i++;
                    }
                    parentCoordinates = parentCoordinates.getParentCoordinates();
                    if (parentCoordinates == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i <= size) {
                    while (true) {
                        jM10457getZeroF1C5BW0 = Offset.m10445minusMKHz9U(jM10457getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = arrayList;
            }
            this.additionalOffset = Offset.m10446plusMKHz9U(this.additionalOffset, jM10457getZeroF1C5BW0);
            m6580updateTargetOffsetk4lQ0M(Offset.m10446plusMKHz9U(LookaheadScope.m12061localLookaheadPositionOfauaQtc$default(lookaheadScope, lookaheadScopeCoordinates, coordinates, 0L, includeMotionFrameOfReference, 2, null), this.additionalOffset));
            setAnimatedValue(animate(coroutineScope, boundsTransform).m10478translatek4lQ0M(Offset.m10433constructorimpl(this.additionalOffset ^ (-9223372034707292160L))));
        }
    }

    /* renamed from: updateTargetSize-uvyYCjk, reason: not valid java name */
    public final void m6584updateTargetSizeuvyYCjk(long size) {
        if (this.targetSize != InlineClassHelperKt.UnspecifiedPackedFloats && !IntSize.m13474equalsimpl0(IntSizeKt.m13484roundToIntSizeuvyYCjk(size), IntSizeKt.m13484roundToIntSizeuvyYCjk(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = size;
        if (this.currentSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentSize = size;
        }
    }
}
