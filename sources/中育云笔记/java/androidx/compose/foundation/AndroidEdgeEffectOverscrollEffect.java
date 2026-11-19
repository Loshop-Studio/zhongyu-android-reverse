package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerId;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;
    private final Density density;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private boolean invalidationEnabled;
    private final DelegatableNode node;
    private long pointerId;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private long pointerPosition;
    private final MutableState<C10786q> redrawSignal;
    private boolean scrollCycleInProgress;

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j10, PaddingValues paddingValues, AbstractC9972n abstractC9972n) {
        this(context, density, j10, paddingValues);
    }

    private final void animateToReleaseIfNeeded() {
        boolean z10;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            invalidateOverscroll$foundation_release();
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m26923pullBottomk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m26930displacementF1C5BW0$foundation_release() >> 32));
        int i10 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(orCreateBottomEffect, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) : Float.intBitsToFloat(i10);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m26924pullLeftk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m26930displacementF1C5BW0$foundation_release() & 4294967295L));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateLeftEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(orCreateLeftEffect, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i10);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m26925pullRightk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m26930displacementF1C5BW0$foundation_release() & 4294967295L));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(orCreateRightEffect, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i10);
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m26926pullTopk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m26930displacementF1C5BW0$foundation_release() >> 32));
        int i10 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateTopEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(orCreateTopEffect, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) : Float.intBitsToFloat(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m26927releaseOppositeOverscrollk4lQ0M(long r11) {
        /*
            r10 = this;
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isLeftAnimating()
            r1 = 32
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L2d
            long r4 = r11 >> r1
            int r0 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r5 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r5 = r5.getOrCreateLeftEffect()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.onReleaseWithOppositeDelta(r5, r0)
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isLeftAnimating()
            goto L2e
        L2d:
            r0 = r3
        L2e:
            androidx.compose.foundation.EdgeEffectWrapper r4 = r10.edgeEffectWrapper
            boolean r4 = r4.isRightAnimating()
            r5 = 1
            if (r4 == 0) goto L5f
            long r6 = r11 >> r1
            int r1 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5f
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r6 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r6 = r6.getOrCreateRightEffect()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.onReleaseWithOppositeDelta(r6, r1)
            if (r0 != 0) goto L5e
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isRightAnimating()
            if (r0 == 0) goto L5c
            goto L5e
        L5c:
            r0 = r3
            goto L5f
        L5e:
            r0 = r5
        L5f:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            boolean r1 = r1.isTopAnimating()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L94
            long r8 = r11 & r6
            int r1 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L94
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r8 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r8 = r8.getOrCreateTopEffect()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.onReleaseWithOppositeDelta(r8, r1)
            if (r0 != 0) goto L93
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isTopAnimating()
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = r3
            goto L94
        L93:
            r0 = r5
        L94:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            boolean r1 = r1.isBottomAnimating()
            if (r1 == 0) goto Lc2
            long r11 = r11 & r6
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto Lc2
            androidx.compose.foundation.EdgeEffectCompat r12 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r1 = r1.getOrCreateBottomEffect()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r12.onReleaseWithOppositeDelta(r1, r11)
            if (r0 != 0) goto Lc1
            androidx.compose.foundation.EdgeEffectWrapper r11 = r10.edgeEffectWrapper
            boolean r11 = r11.isBottomAnimating()
            if (r11 == 0) goto Lc0
            goto Lc1
        Lc0:
            return r3
        Lc1:
            return r5
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.m26927releaseOppositeOverscrollk4lQ0M(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r14.invoke(r12, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo26928applyToFlingBMRW4eQ(long r12, p181hd.InterfaceC9544p r14, vc.InterfaceC11588c<? super p309qc.C10786q> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo26928applyToFlingBMRW4eQ(long, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[PHI: r11
      0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[PHI: r14
      0x0132: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0162, B:56:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo26929applyToScrollRhakbz0(long r20, int r22, p181hd.InterfaceC9540l r23) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo26929applyToScrollRhakbz0(long, int, hd.l):long");
    }

    /* renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m26930displacementF1C5BW0$foundation_release() {
        long jM30716getCenteruvyYCjk = this.pointerPosition;
        if ((9223372034707292159L & jM30716getCenteruvyYCjk) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM30716getCenteruvyYCjk = SizeKt.m30716getCenteruvyYCjk(this.containerSize);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM30716getCenteruvyYCjk >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM30716getCenteruvyYCjk & 4294967295L)) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public DelegatableNode getNode() {
        return this.node;
    }

    public final MutableState<C10786q> getRedrawSignal$foundation_release() {
        return this.redrawSignal;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(C10786q.f26013a);
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z10) {
        this.invalidationEnabled = z10;
    }

    /* renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m26931updateSizeuvyYCjk$foundation_release(long j10) {
        boolean zM30702equalsimpl0 = Size.m30702equalsimpl0(this.containerSize, Size.Companion.m30715getZeroNHjbRc());
        boolean zM30702equalsimpl02 = Size.m30702equalsimpl0(j10, this.containerSize);
        this.containerSize = j10;
        if (!zM30702equalsimpl02) {
            this.edgeEffectWrapper.m27006updateSizeozmzZPI(IntSize.m33667constructorimpl((AbstractC9719c.m19282d(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (AbstractC9719c.m19282d(Float.intBitsToFloat((int) (j10 >> 32))) << 32)));
        }
        if (zM30702equalsimpl0 || zM30702equalsimpl02) {
            return;
        }
        animateToReleaseIfNeeded();
    }

    private AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j10, PaddingValues paddingValues) {
        this.density = density;
        this.pointerPosition = Offset.Companion.m30652getUnspecifiedF1C5BW0();
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m30932toArgb8_81llA(j10));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(C10786q.f26013a, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m30715getZeroNHjbRc();
        this.pointerId = PointerId.m32084constructorimpl(-1L);
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", m26211f = "AndroidOverscroll.android.kt", m26212l = {783, 787}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 */
            public static final class C11691 extends RestrictedSuspendLambda implements InterfaceC9544p {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11691(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, InterfaceC11588c<? super C11691> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = androidEdgeEffectOverscrollEffect;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    C11691 c11691 = new C11691(this.this$0, interfaceC11588c);
                    c11691.L$0 = obj;
                    return c11691;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C11691) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
                
                    if (r15 != r0) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005e -> B:18:0x0061). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 227
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.C11691.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C11691(this.this$0, null), interfaceC11588c);
                return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
            }
        });
        this.pointerInputNode = SuspendingPointerInputModifierNode;
        this.node = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper) : new GlowOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper, paddingValues);
    }
}
