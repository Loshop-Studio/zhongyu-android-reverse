package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.node.MotionReferencePlacementDelegate;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.AbstractC8323h;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize;
    private int width;
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.Companion.m27038getZeronOccac();

    public Placeable() {
        long j10 = 0;
        this.measuredSize = IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    private final void onMeasuredSizeChanged() {
        this.width = AbstractC8323h.m13518m((int) (this.measuredSize >> 32), Constraints.m26854getMinWidthimpl(this.measurementConstraints), Constraints.m26852getMaxWidthimpl(this.measurementConstraints));
        this.height = AbstractC8323h.m13518m((int) (this.measuredSize & 4294967295L), Constraints.m26853getMinHeightimpl(this.measurementConstraints), Constraints.m26851getMaxHeightimpl(this.measurementConstraints));
        int i10 = this.width;
        long j10 = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m27021constructorimpl((((i10 - ((int) (j10 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j10 & 4294967295L))) / 2)));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m25685getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.p013ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    public final long m25686getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.p013ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    public final long m25687getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo25688placeAtf8xVGno(long j10, float f10, GraphicsLayer graphicsLayer) {
        mo25628placeAtf8xVGno(j10, f10, (InterfaceC10570l) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo25628placeAtf8xVGno(long j10, float f10, InterfaceC10570l interfaceC10570l);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m25689setMeasuredSizeozmzZPI(long j10) {
        if (IntSize.m27068equalsimpl0(this.measuredSize, j10)) {
            return;
        }
        this.measuredSize = j10;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m25690setMeasurementConstraintsBRTryo0(long j10) {
        if (Constraints.m26845equalsimpl0(this.measurementConstraints, j10)) {
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
        public static /* synthetic */ void m25691place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m25697place70tqf50(placeable, j10, f10);
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
        public static /* synthetic */ void m25692placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m25702placeRelative70tqf50(placeable, j10, f10);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, InterfaceC10570l interfaceC10570l, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                interfaceC10570l = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i10, i11, f11, interfaceC10570l);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m25693placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                interfaceC10570l = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m25703placeRelativeWithLayeraW9wM(placeable, j10, f11, interfaceC10570l);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f10, InterfaceC10570l interfaceC10570l, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                interfaceC10570l = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i10, i11, f11, interfaceC10570l);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m25695placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                interfaceC10570l = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m25705placeWithLayeraW9wM(placeable, j10, f11, interfaceC10570l);
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
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((i11 & 4294967295L) | (i10 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, (InterfaceC10570l) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m25697place70tqf50(Placeable placeable, long j10, float f10) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, (InterfaceC10570l) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m25699placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j10, float f10, InterfaceC10570l interfaceC10570l) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, interfaceC10570l);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m25701placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j10, float f10, InterfaceC10570l interfaceC10570l) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, interfaceC10570l);
                return;
            }
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((IntOffset.m27028getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m27027getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, interfaceC10570l);
        }

        public final void placeRelative(Placeable placeable, int i10, int i11, float f10) {
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((i10 << 32) | (i11 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, (InterfaceC10570l) null);
            } else {
                long jM27021constructorimpl2 = IntOffset.m27021constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m27027getXimpl(jM27021constructorimpl)) << 32) | (IntOffset.m27028getYimpl(jM27021constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl2, placeable.apparentToRealOffset), f10, (InterfaceC10570l) null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m25702placeRelative70tqf50(Placeable placeable, long j10, float f10) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, (InterfaceC10570l) null);
                return;
            }
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((IntOffset.m27028getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m27027getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, (InterfaceC10570l) null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i10, int i11, float f10, InterfaceC10570l interfaceC10570l) {
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((i10 << 32) | (i11 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, interfaceC10570l);
            } else {
                long jM27021constructorimpl2 = IntOffset.m27021constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m27027getXimpl(jM27021constructorimpl)) << 32) | (IntOffset.m27028getYimpl(jM27021constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl2, placeable.apparentToRealOffset), f10, interfaceC10570l);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m25703placeRelativeWithLayeraW9wM(Placeable placeable, long j10, float f10, InterfaceC10570l interfaceC10570l) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, interfaceC10570l);
                return;
            }
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((IntOffset.m27028getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m27027getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, interfaceC10570l);
        }

        public final void placeWithLayer(Placeable placeable, int i10, int i11, float f10, InterfaceC10570l interfaceC10570l) {
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((i11 & 4294967295L) | (i10 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, interfaceC10570l);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m25705placeWithLayeraW9wM(Placeable placeable, long j10, float f10, InterfaceC10570l interfaceC10570l) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25628placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, interfaceC10570l);
        }

        public final void withMotionFrameOfReferencePlacement(InterfaceC10570l interfaceC10570l) {
            this.motionFrameOfReferencePlacement = true;
            interfaceC10570l.invoke(this);
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
        public static /* synthetic */ void m25694placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, GraphicsLayer graphicsLayer, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.m25704placeRelativeWithLayeraW9wM(placeable, j10, graphicsLayer, f10);
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
        public static /* synthetic */ void m25696placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, GraphicsLayer graphicsLayer, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.m25706placeWithLayeraW9wM(placeable, j10, graphicsLayer, f10);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m25698placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j10, float f10, GraphicsLayer graphicsLayer) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m25706placeWithLayeraW9wM(Placeable placeable, long j10, GraphicsLayer graphicsLayer, float f10) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        public final void placeWithLayer(Placeable placeable, int i10, int i11, GraphicsLayer graphicsLayer, float f10) {
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((i11 & 4294967295L) | (i10 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m25700placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j10, float f10, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, graphicsLayer);
                return;
            }
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((IntOffset.m27028getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m27027getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m25704placeRelativeWithLayeraW9wM(Placeable placeable, long j10, GraphicsLayer graphicsLayer, float f10) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(j10, placeable.apparentToRealOffset), f10, graphicsLayer);
                return;
            }
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((IntOffset.m27028getYimpl(j10) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m27027getXimpl(j10)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i10, int i11, GraphicsLayer graphicsLayer, float f10) {
            long jM27021constructorimpl = IntOffset.m27021constructorimpl((i10 << 32) | (i11 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
            } else {
                long jM27021constructorimpl2 = IntOffset.m27021constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m27027getXimpl(jM27021constructorimpl)) << 32) | (IntOffset.m27028getYimpl(jM27021constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo25688placeAtf8xVGno(IntOffset.m27031plusqkQi6aY(jM27021constructorimpl2, placeable.apparentToRealOffset), f10, graphicsLayer);
            }
        }
    }
}
