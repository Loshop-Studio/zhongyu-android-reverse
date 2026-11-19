package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p012ui.geometry.InlineClassHelperKt;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.geometry.RectKt;
import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.layout.LayoutCoordinates;
import androidx.compose.p012ui.layout.LayoutCoordinatesKt;
import androidx.compose.p012ui.layout.LookaheadScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntOffsetKt;
import androidx.compose.p012ui.unit.IntSize;
import androidx.compose.p012ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J \u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001aJ6\u00104\u001a\u00020,2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010'\u001a\u00020(2\u0006\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*J\u0018\u0010;\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0014\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\"\u0010\u0015\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u000e\u0010!\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010#\u001a\u00020\u0016X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010$\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, m13413d2 = {"Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "", "()V", "additionalOffset", "Landroidx/compose/ui/geometry/Offset;", "J", "animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "<set-?>", "animatedValue", "getAnimatedValue", "()Landroidx/compose/ui/geometry/Rect;", "setAnimatedValue", "(Landroidx/compose/ui/geometry/Rect;)V", "animatedValue$delegate", "Landroidx/compose/runtime/MutableState;", "currentBounds", "getCurrentBounds", "currentPosition", "currentSize", "Landroidx/compose/ui/geometry/Size;", "getCurrentSize-NH-jbRc", "()J", "setCurrentSize-uvyYCjk", "(J)V", "directManipulationParents", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isIdle", "", "()Z", "isPending", "targetOffset", "targetSize", "value", "getValue", "animate", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "updateCurrentBounds", "", RequestParameters.POSITION, "size", "updateCurrentBounds-tz77jQw", "(JJ)V", "updateTargetOffset", TypedValues.CycleType.S_WAVE_OFFSET, "updateTargetOffset-k-4lQ0M", "updateTargetOffsetAndAnimate", "lookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "directManipulationParentsDirty", "includeMotionFrameOfReference", "updateTargetSize", "updateTargetSize-uvyYCjk", "animation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,444:1\n148#2:445\n153#2:446\n148#2:450\n148#2:456\n273#3:447\n278#3:448\n273#3:449\n273#3:455\n85#4:451\n113#4,2:452\n150#5:454\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n*L\n295#1:445\n301#1:446\n329#1:450\n414#1:456\n311#1:447\n316#1:448\n329#1:449\n414#1:455\n344#1:451\n344#1:452,2\n405#1:454\n*E\n"})
/* loaded from: classes.dex */
public final class BoundsTransformDeferredAnimation {
    public static final int $stable = 8;
    private long additionalOffset;
    private Animatable<Rect, AnimationVector4D> animatable;

    /* renamed from: animatedValue$delegate, reason: from kotlin metadata */
    private final MutableState animatedValue;
    private long currentPosition;
    private long currentSize;
    private List<LayoutCoordinates> directManipulationParents;
    private boolean isPending;
    private long targetOffset;
    private long targetSize;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", m13451f = "AnimateBoundsModifier.kt", m13452i = {}, m13453l = {428}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1 */
    public static final class C09821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Rect, AnimationVector4D> $anim;
        final /* synthetic */ BoundsTransform $boundsTransform;
        final /* synthetic */ Rect $target;
        int label;
        final /* synthetic */ BoundsTransformDeferredAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09821(Animatable<Rect, AnimationVector4D> animatable, Rect rect, BoundsTransform boundsTransform, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, Continuation<? super C09821> continuation) {
            super(2, continuation);
            this.$anim = animatable;
            this.$target = rect;
            this.$boundsTransform = boundsTransform;
            this.this$0 = boundsTransformDeferredAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09821(this.$anim, this.$target, this.$boundsTransform, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Rect, AnimationVector4D> animatable = this.$anim;
                Rect rect = this.$target;
                BoundsTransform boundsTransform = this.$boundsTransform;
                Rect currentBounds = this.this$0.getCurrentBounds();
                Intrinsics.checkNotNull(currentBounds);
                FiniteAnimationSpec<Rect> finiteAnimationSpecTransform = boundsTransform.transform(currentBounds, this.$target);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, rect, finiteAnimationSpecTransform, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BoundsTransformDeferredAnimation() {
        Size.Companion companion = Size.INSTANCE;
        this.targetSize = companion.m21245getUnspecifiedNHjbRc();
        Offset.Companion companion2 = Offset.INSTANCE;
        this.targetOffset = companion2.m21183getUnspecifiedF1C5BW0();
        this.currentPosition = companion2.m21183getUnspecifiedF1C5BW0();
        this.currentSize = companion.m21245getUnspecifiedNHjbRc();
        this.animatedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.additionalOffset = companion2.m21184getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.p012ui.geometry.Rect animate(kotlinx.coroutines.CoroutineScope r14, androidx.compose.animation.BoundsTransform r15) {
        /*
            r13 = this;
            long r0 = r13.targetOffset
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L50
            long r2 = r13.targetSize
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L50
            androidx.compose.ui.geometry.Rect r6 = androidx.compose.p012ui.geometry.RectKt.m21208Recttz77jQw(r0, r2)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> r0 = r13.animatable
            if (r0 != 0) goto L30
            androidx.compose.animation.core.Animatable r5 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p012ui.geometry.Rect.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r7 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(r0)
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = r5
        L30:
            r13.animatable = r0
            boolean r1 = r13.isPending
            if (r1 == 0) goto L50
            r1 = 0
            r13.isPending = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1 r5 = new androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1
            r10 = 0
            r9 = r13
            r8 = r15
            r7 = r6
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r15 = r9
            r11 = 1
            r12 = 0
            r8 = 0
            r7 = r14
            r9 = r1
            r10 = r5
            kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
            goto L51
        L50:
            r15 = r13
        L51:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> r14 = r15.animatable
            if (r14 == 0) goto L5f
            java.lang.Object r14 = r14.getValue()
            androidx.compose.ui.geometry.Rect r14 = (androidx.compose.p012ui.geometry.Rect) r14
            if (r14 != 0) goto L5e
            goto L5f
        L5e:
            return r14
        L5f:
            androidx.compose.ui.geometry.Rect$Companion r14 = androidx.compose.p012ui.geometry.Rect.INSTANCE
            androidx.compose.ui.geometry.Rect r14 = r14.getZero()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.BoundsTransformDeferredAnimation.animate(kotlinx.coroutines.CoroutineScope, androidx.compose.animation.BoundsTransform):androidx.compose.ui.geometry.Rect");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect getAnimatedValue() {
        return (Rect) this.animatedValue.getValue();
    }

    private final void setAnimatedValue(Rect rect) {
        this.animatedValue.setValue(rect);
    }

    /* renamed from: updateTargetOffset-k-4lQ0M, reason: not valid java name */
    private final void m17456updateTargetOffsetk4lQ0M(long offset) {
        if ((this.targetOffset & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats && !IntOffset.m24121equalsimpl0(IntOffsetKt.m24139roundk4lQ0M(offset), IntOffsetKt.m24139roundk4lQ0M(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = offset;
        if ((this.currentPosition & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentPosition = offset;
        }
    }

    public final Rect getCurrentBounds() {
        long j9 = this.currentSize;
        long j10 = this.currentPosition;
        if ((9223372034707292159L & j10) == InlineClassHelperKt.UnspecifiedPackedFloats || j9 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return null;
        }
        return RectKt.m21208Recttz77jQw(j10, j9);
    }

    /* renamed from: getCurrentSize-NH-jbRc, reason: not valid java name and from getter */
    public final long getCurrentSize() {
        return this.currentSize;
    }

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
    public final void m17458setCurrentSizeuvyYCjk(long j9) {
        this.currentSize = j9;
    }

    /* renamed from: updateCurrentBounds-tz77jQw, reason: not valid java name */
    public final void m17459updateCurrentBoundstz77jQw(long position, long size) {
        this.currentPosition = position;
        this.currentSize = size;
    }

    public final void updateTargetOffsetAndAnimate(LookaheadScope lookaheadScope, Placeable.PlacementScope placementScope, CoroutineScope coroutineScope, boolean directManipulationParentsDirty, boolean includeMotionFrameOfReference, BoundsTransform boundsTransform) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            LayoutCoordinates lookaheadScopeCoordinates = lookaheadScope.getLookaheadScopeCoordinates(placementScope);
            long jM21184getZeroF1C5BW0 = Offset.INSTANCE.m21184getZeroF1C5BW0();
            if (!includeMotionFrameOfReference && directManipulationParentsDirty) {
                List<LayoutCoordinates> arrayList = this.directManipulationParents;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                int i9 = 0;
                LayoutCoordinates parentCoordinates = coordinates;
                while (!Intrinsics.areEqual(lookaheadScope.toLookaheadCoordinates(parentCoordinates), lookaheadScopeCoordinates)) {
                    if (parentCoordinates.getIntroducesMotionFrameOfReference()) {
                        if (arrayList.size() == i9) {
                            arrayList.add(parentCoordinates);
                            jM21184getZeroF1C5BW0 = Offset.m21173plusMKHz9U(jM21184getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(parentCoordinates));
                        } else if (!Intrinsics.areEqual(arrayList.get(i9), parentCoordinates)) {
                            long jM21172minusMKHz9U = Offset.m21172minusMKHz9U(jM21184getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(arrayList.get(i9)));
                            arrayList.set(i9, parentCoordinates);
                            jM21184getZeroF1C5BW0 = Offset.m21173plusMKHz9U(jM21172minusMKHz9U, LayoutCoordinatesKt.positionInParent(parentCoordinates));
                        }
                        i9++;
                    }
                    parentCoordinates = parentCoordinates.getParentCoordinates();
                    if (parentCoordinates == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i9 <= size) {
                    while (true) {
                        jM21184getZeroF1C5BW0 = Offset.m21172minusMKHz9U(jM21184getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i9) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = arrayList;
            }
            this.additionalOffset = Offset.m21173plusMKHz9U(this.additionalOffset, jM21184getZeroF1C5BW0);
            m17456updateTargetOffsetk4lQ0M(Offset.m21173plusMKHz9U(LookaheadScope.m22785localLookaheadPositionOfauaQtc$default(lookaheadScope, lookaheadScopeCoordinates, coordinates, 0L, includeMotionFrameOfReference, 2, null), this.additionalOffset));
            setAnimatedValue(animate(coroutineScope, boundsTransform).m21205translatek4lQ0M(Offset.m21160constructorimpl(this.additionalOffset ^ (-9223372034707292160L))));
        }
    }

    /* renamed from: updateTargetSize-uvyYCjk, reason: not valid java name */
    public final void m17460updateTargetSizeuvyYCjk(long size) {
        if (this.targetSize != InlineClassHelperKt.UnspecifiedPackedFloats && !IntSize.m24163equalsimpl0(IntSizeKt.m24173roundToIntSizeuvyYCjk(size), IntSizeKt.m24173roundToIntSizeuvyYCjk(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = size;
        if (this.currentSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentSize = size;
        }
    }
}
