package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.node.MotionReferencePlacementDelegate;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize;
    private int width;
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.Companion.m33640getZeronOccac();

    public Placeable() {
        long j10 = 0;
        this.measuredSize = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    private final void onMeasuredSizeChanged() {
        this.width = AbstractC10410o.m21761n((int) (this.measuredSize >> 32), Constraints.m33456getMinWidthimpl(this.measurementConstraints), Constraints.m33454getMaxWidthimpl(this.measurementConstraints));
        this.height = AbstractC10410o.m21761n((int) (this.measuredSize & 4294967295L), Constraints.m33455getMinHeightimpl(this.measurementConstraints), Constraints.m33453getMaxHeightimpl(this.measurementConstraints));
        int i10 = this.width;
        long j10 = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m33623constructorimpl((((i10 - ((int) (j10 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j10 & 4294967295L))) / 2)));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m32287getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.p014ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    public final long m32288getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.p014ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    public final long m32289getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo32290placeAtf8xVGno(long j10, float f10, GraphicsLayer graphicsLayer) {
        mo32230placeAtf8xVGno(j10, f10, (InterfaceC9540l) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo32230placeAtf8xVGno(long j10, float f10, InterfaceC9540l interfaceC9540l);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m32291setMeasuredSizeozmzZPI(long j10) {
        if (IntSize.m33670equalsimpl0(this.measuredSize, j10)) {
            return;
        }
        this.measuredSize = j10;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m32292setMeasurementConstraintsBRTryo0(long j10) {
        if (Constraints.m33447equalsimpl0(this.measurementConstraints, j10)) {
            return;
        }
        this.measurementConstraints = j10;
        onMeasuredSizeChanged();
    }

    @StabilityInferred(parameters = 0)
    @PlacementScopeMarker
    public static abstract class PlacementScope {
        public static final int $stable = 8;
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.place(placeable, i10, i11, f10);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m32293place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m32299place70tqf50(placeable, j10, f10);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.placeRelative(placeable, i10, i11, f10);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m32294placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m32304placeRelative70tqf50(placeable, j10, f10);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, InterfaceC9540l interfaceC9540l, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                interfaceC9540l = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i10, i11, f11, interfaceC9540l);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m32295placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                interfaceC9540l = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m32305placeRelativeWithLayeraW9wM(placeable, j10, f11, interfaceC9540l);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, InterfaceC9540l interfaceC9540l, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                interfaceC9540l = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i10, i11, f11, interfaceC9540l);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m32297placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                interfaceC9540l = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m32307placeWithLayeraW9wM(placeable, j10, f11, interfaceC9540l);
        }

        public float current(Ruler ruler, float f10) {
            return f10;
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i10, int i11, float f10) {
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((i11 & 4294967295L) | (i10 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, (InterfaceC9540l) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m32299place70tqf50(Placeable placeable, long j10, float f10) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, (InterfaceC9540l) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m32301placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j10, float f10, InterfaceC9540l interfaceC9540l) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, interfaceC9540l);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m32303placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j10, float f10, InterfaceC9540l interfaceC9540l) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, interfaceC9540l);
                return;
            }
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((IntOffset.m33630getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m33629getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, interfaceC9540l);
        }

        public final void placeRelative(Placeable placeable, int i10, int i11, float f10) {
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((i10 << 32) | (i11 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, (InterfaceC9540l) null);
            } else {
                long jM33623constructorimpl2 = IntOffset.m33623constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m33629getXimpl(jM33623constructorimpl)) << 32) | (IntOffset.m33630getYimpl(jM33623constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl2, placeable.apparentToRealOffset), f10, (InterfaceC9540l) null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m32304placeRelative70tqf50(Placeable placeable, long j10, float f10) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, (InterfaceC9540l) null);
                return;
            }
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((IntOffset.m33630getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m33629getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, (InterfaceC9540l) null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i10, int i11, float f10, InterfaceC9540l interfaceC9540l) {
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((i10 << 32) | (i11 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, interfaceC9540l);
            } else {
                long jM33623constructorimpl2 = IntOffset.m33623constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m33629getXimpl(jM33623constructorimpl)) << 32) | (IntOffset.m33630getYimpl(jM33623constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl2, placeable.apparentToRealOffset), f10, interfaceC9540l);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m32305placeRelativeWithLayeraW9wM(Placeable placeable, long j10, float f10, InterfaceC9540l interfaceC9540l) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, interfaceC9540l);
                return;
            }
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((IntOffset.m33630getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m33629getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, interfaceC9540l);
        }

        public final void placeWithLayer(Placeable placeable, int i10, int i11, float f10, InterfaceC9540l interfaceC9540l) {
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((i11 & 4294967295L) | (i10 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, interfaceC9540l);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m32307placeWithLayeraW9wM(Placeable placeable, long j10, float f10, InterfaceC9540l interfaceC9540l) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32230placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, interfaceC9540l);
        }

        public final void withMotionFrameOfReferencePlacement(InterfaceC9540l interfaceC9540l) {
            this.motionFrameOfReferencePlacement = true;
            interfaceC9540l.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, GraphicsLayer graphicsLayer, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 8) != 0) {
                f10 = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i10, i11, graphicsLayer, f10);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m32296placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, GraphicsLayer graphicsLayer, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.m32306placeRelativeWithLayeraW9wM(placeable, j10, graphicsLayer, f10);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, GraphicsLayer graphicsLayer, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 8) != 0) {
                f10 = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i10, i11, graphicsLayer, f10);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m32298placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, GraphicsLayer graphicsLayer, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.m32308placeWithLayeraW9wM(placeable, j10, graphicsLayer, f10);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m32300placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j10, float f10, GraphicsLayer graphicsLayer) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m32308placeWithLayeraW9wM(Placeable placeable, long j10, GraphicsLayer graphicsLayer, float f10) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        public final void placeWithLayer(Placeable placeable, int i10, int i11, GraphicsLayer graphicsLayer, float f10) {
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((i11 & 4294967295L) | (i10 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m32302placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j10, float f10, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, graphicsLayer);
                return;
            }
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((IntOffset.m33630getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m33629getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m32306placeRelativeWithLayeraW9wM(Placeable placeable, long j10, GraphicsLayer graphicsLayer, float f10) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, graphicsLayer);
                return;
            }
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((IntOffset.m33630getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m33629getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i10, int i11, GraphicsLayer graphicsLayer, float f10) {
            long jM33623constructorimpl = IntOffset.m33623constructorimpl((i10 << 32) | (i11 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
            } else {
                long jM33623constructorimpl2 = IntOffset.m33623constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m33629getXimpl(jM33623constructorimpl)) << 32) | (IntOffset.m33630getYimpl(jM33623constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo32290placeAtf8xVGno(IntOffset.m33633plusqkQi6aY(jM33623constructorimpl2, placeable.apparentToRealOffset), f10, graphicsLayer);
            }
        }
    }
}
