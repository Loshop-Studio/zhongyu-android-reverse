package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.layout.LookaheadScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BoundsTransformDeferredAnimation {
    public static final int $stable = 8;
    private long additionalOffset;
    private Animatable<Rect, AnimationVector4D> animatable;
    private final MutableState animatedValue$delegate;
    private long currentPosition;
    private long currentSize;
    private List<LayoutCoordinates> directManipulationParents;
    private boolean isPending;
    private long targetOffset;
    private long targetSize;

    @InterfaceC11829d(m26210c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", m26211f = "AnimateBoundsModifier.kt", m26212l = {428}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1 */
    public static final class C10531 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Animatable<Rect, AnimationVector4D> $anim;
        final /* synthetic */ BoundsTransform $boundsTransform;
        final /* synthetic */ Rect $target;
        int label;
        final /* synthetic */ BoundsTransformDeferredAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10531(Animatable<Rect, AnimationVector4D> animatable, Rect rect, BoundsTransform boundsTransform, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, InterfaceC11588c<? super C10531> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$anim = animatable;
            this.$target = rect;
            this.$boundsTransform = boundsTransform;
            this.this$0 = boundsTransformDeferredAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C10531(this.$anim, this.$target, this.$boundsTransform, this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Animatable<Rect, AnimationVector4D> animatable = this.$anim;
                Rect rect = this.$target;
                BoundsTransform boundsTransform = this.$boundsTransform;
                Rect currentBounds = this.this$0.getCurrentBounds();
                AbstractC9979u.m20291d(currentBounds);
                FiniteAnimationSpec<Rect> finiteAnimationSpecTransform = boundsTransform.transform(currentBounds, this.$target);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, rect, finiteAnimationSpecTransform, null, null, this, 12, null) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C10531) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public BoundsTransformDeferredAnimation() {
        Size.Companion companion = Size.Companion;
        this.targetSize = companion.m30714getUnspecifiedNHjbRc();
        Offset.Companion companion2 = Offset.Companion;
        this.targetOffset = companion2.m30652getUnspecifiedF1C5BW0();
        this.currentPosition = companion2.m30652getUnspecifiedF1C5BW0();
        this.currentSize = companion.m30714getUnspecifiedNHjbRc();
        this.animatedValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.additionalOffset = companion2.m30653getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.p014ui.geometry.Rect animate(sd.InterfaceC11122i0 r14, androidx.compose.animation.BoundsTransform r15) {
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
            androidx.compose.ui.geometry.Rect r6 = androidx.compose.p014ui.geometry.RectKt.m30677Recttz77jQw(r0, r2)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> r0 = r13.animatable
            if (r0 != 0) goto L30
            androidx.compose.animation.core.Animatable r5 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p014ui.geometry.Rect.Companion
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
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.f23479f
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
            sd.AbstractC11109f.m24706d(r7, r8, r9, r10, r11, r12)
            goto L51
        L50:
            r15 = r13
        L51:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> r14 = r15.animatable
            if (r14 == 0) goto L5f
            java.lang.Object r14 = r14.getValue()
            androidx.compose.ui.geometry.Rect r14 = (androidx.compose.p014ui.geometry.Rect) r14
            if (r14 != 0) goto L5e
            goto L5f
        L5e:
            return r14
        L5f:
            androidx.compose.ui.geometry.Rect$Companion r14 = androidx.compose.p014ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r14 = r14.getZero()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.BoundsTransformDeferredAnimation.animate(sd.i0, androidx.compose.animation.BoundsTransform):androidx.compose.ui.geometry.Rect");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect getAnimatedValue() {
        return (Rect) this.animatedValue$delegate.getValue();
    }

    private final void setAnimatedValue(Rect rect) {
        this.animatedValue$delegate.setValue(rect);
    }

    /* renamed from: updateTargetOffset-k-4lQ0M, reason: not valid java name */
    private final void m26776updateTargetOffsetk4lQ0M(long j10) {
        if ((this.targetOffset & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats && !IntOffset.m33628equalsimpl0(IntOffsetKt.m33646roundk4lQ0M(j10), IntOffsetKt.m33646roundk4lQ0M(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = j10;
        if ((this.currentPosition & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentPosition = j10;
        }
    }

    public final Rect getCurrentBounds() {
        long j10 = this.currentSize;
        long j11 = this.currentPosition;
        if ((9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats || j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return null;
        }
        return RectKt.m30677Recttz77jQw(j11, j10);
    }

    /* renamed from: getCurrentSize-NH-jbRc, reason: not valid java name */
    public final long m26777getCurrentSizeNHjbRc() {
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
    public final void m26778setCurrentSizeuvyYCjk(long j10) {
        this.currentSize = j10;
    }

    /* renamed from: updateCurrentBounds-tz77jQw, reason: not valid java name */
    public final void m26779updateCurrentBoundstz77jQw(long j10, long j11) {
        this.currentPosition = j10;
        this.currentSize = j11;
    }

    public final void updateTargetOffsetAndAnimate(LookaheadScope lookaheadScope, Placeable.PlacementScope placementScope, InterfaceC11122i0 interfaceC11122i0, boolean z10, boolean z11, BoundsTransform boundsTransform) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            LayoutCoordinates lookaheadScopeCoordinates = lookaheadScope.getLookaheadScopeCoordinates(placementScope);
            long jM30653getZeroF1C5BW0 = Offset.Companion.m30653getZeroF1C5BW0();
            if (!z11 && z10) {
                List<LayoutCoordinates> arrayList = this.directManipulationParents;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                int i10 = 0;
                LayoutCoordinates parentCoordinates = coordinates;
                while (!AbstractC9979u.m20289b(lookaheadScope.toLookaheadCoordinates(parentCoordinates), lookaheadScopeCoordinates)) {
                    if (parentCoordinates.getIntroducesMotionFrameOfReference()) {
                        if (arrayList.size() == i10) {
                            arrayList.add(parentCoordinates);
                            jM30653getZeroF1C5BW0 = Offset.m30642plusMKHz9U(jM30653getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(parentCoordinates));
                        } else if (!AbstractC9979u.m20289b(arrayList.get(i10), parentCoordinates)) {
                            long jM30641minusMKHz9U = Offset.m30641minusMKHz9U(jM30653getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(arrayList.get(i10)));
                            arrayList.set(i10, parentCoordinates);
                            jM30653getZeroF1C5BW0 = Offset.m30642plusMKHz9U(jM30641minusMKHz9U, LayoutCoordinatesKt.positionInParent(parentCoordinates));
                        }
                        i10++;
                    }
                    parentCoordinates = parentCoordinates.getParentCoordinates();
                    if (parentCoordinates == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i10 <= size) {
                    while (true) {
                        jM30653getZeroF1C5BW0 = Offset.m30641minusMKHz9U(jM30653getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i10) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = arrayList;
            }
            this.additionalOffset = Offset.m30642plusMKHz9U(this.additionalOffset, jM30653getZeroF1C5BW0);
            m26776updateTargetOffsetk4lQ0M(Offset.m30642plusMKHz9U(LookaheadScope.m32257localLookaheadPositionOfauaQtc$default(lookaheadScope, lookaheadScopeCoordinates, coordinates, 0L, z11, 2, null), this.additionalOffset));
            setAnimatedValue(animate(interfaceC11122i0, boundsTransform).m30674translatek4lQ0M(Offset.m30629constructorimpl(this.additionalOffset ^ (-9223372034707292160L))));
        }
    }

    /* renamed from: updateTargetSize-uvyYCjk, reason: not valid java name */
    public final void m26780updateTargetSizeuvyYCjk(long j10) {
        if (this.targetSize != InlineClassHelperKt.UnspecifiedPackedFloats && !IntSize.m33670equalsimpl0(IntSizeKt.m33680roundToIntSizeuvyYCjk(j10), IntSizeKt.m33680roundToIntSizeuvyYCjk(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = j10;
        if (this.currentSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentSize = j10;
        }
    }
}
