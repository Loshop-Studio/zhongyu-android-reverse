package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p014ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p014ui.layout.ApproachMeasureScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.modifier.ModifierLocalMap;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.AbstractC10776g;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private GraphicsLayer layer;
    private final ModifierLocalMap providedValues;
    private SharedElementInternalState state;

    public SharedBoundsNode(SharedElementInternalState sharedElementInternalState) {
        this.state = sharedElementInternalState;
        this.layer = sharedElementInternalState.getLayer();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(AbstractC10776g.m22975a(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState));
    }

    private final MeasureResult approachPlace(MeasureScope measureScope, final Placeable placeable) {
        if (!getSharedElement().getFoundMatch()) {
            return MeasureScope.layout$default(measureScope, placeable.getWidth(), placeable.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.animation.SharedBoundsNode.approachPlace.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        SharedBoundsNode.this.updateCurrentBounds(coordinates);
                    }
                    Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        long jMo26817calculateSizeJyjRU_E = this.state.getPlaceHolderSize().mo26817calculateSizeJyjRU_E(requireLookaheadLayoutCoordinates().mo32237getSizeYbymL2g(), IntSize.m33667constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L)));
        return MeasureScope.layout$default(measureScope, (int) (jMo26817calculateSizeJyjRU_E >> 32), (int) (jMo26817calculateSizeJyjRU_E & 4294967295L), null, new InterfaceC9540l() { // from class: androidx.compose.animation.SharedBoundsNode.approachPlace.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                long jM30672getTopLeftF1C5BW0;
                LayoutCoordinates coordinates;
                if (SharedBoundsNode.this.getSharedElement().getTargetBounds() != null) {
                    BoundsAnimation boundsAnimation = SharedBoundsNode.this.getBoundsAnimation();
                    Rect currentBounds = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                    AbstractC9979u.m20291d(currentBounds);
                    Rect targetBounds = SharedBoundsNode.this.getSharedElement().getTargetBounds();
                    AbstractC9979u.m20291d(targetBounds);
                    boundsAnimation.animate(currentBounds, targetBounds);
                }
                Rect value = SharedBoundsNode.this.getBoundsAnimation().getValue();
                LayoutCoordinates coordinates2 = placementScope.getCoordinates();
                Offset offsetM30626boximpl = coordinates2 != null ? Offset.m30626boximpl(SharedBoundsNode.this.getRootCoords().mo32238localPositionOfR5De75A(coordinates2, Offset.Companion.m30653getZeroF1C5BW0())) : null;
                if (value != null) {
                    if (SharedBoundsNode.this.getBoundsAnimation().getTarget()) {
                        SharedBoundsNode.this.getSharedElement().setCurrentBounds(value);
                    }
                    jM30672getTopLeftF1C5BW0 = value.m30672getTopLeftF1C5BW0();
                } else {
                    if (SharedBoundsNode.this.getBoundsAnimation().getTarget() && (coordinates = placementScope.getCoordinates()) != null) {
                        SharedBoundsNode.this.updateCurrentBounds(coordinates);
                    }
                    Rect currentBounds2 = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                    AbstractC9979u.m20291d(currentBounds2);
                    jM30672getTopLeftF1C5BW0 = currentBounds2.m30672getTopLeftF1C5BW0();
                }
                long jM30641minusMKHz9U = offsetM30626boximpl != null ? Offset.m30641minusMKHz9U(jM30672getTopLeftF1C5BW0, offsetM30626boximpl.m30647unboximpl()) : Offset.Companion.m30653getZeroF1C5BW0();
                Placeable.PlacementScope.place$default(placementScope, placeable, Math.round(Float.intBitsToFloat((int) (jM30641minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (jM30641minusMKHz9U & 4294967295L))), 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoundsAnimation getBoundsAnimation() {
        return this.state.getBoundsAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getRootCoords() {
        return getSharedElement().getScope().getRoot$animation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getRootLookaheadCoords() {
        return getSharedElement().getScope().getLookaheadRoot$animation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement getSharedElement() {
        return this.state.getSharedElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates requireLookaheadLayoutCoordinates() {
        return this.state.getSharedElement().getScope().toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(this));
    }

    private final void setLayer(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.layer;
            if (graphicsLayer2 != null) {
                DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer2);
            }
        } else {
            this.state.setLayer(graphicsLayer);
        }
        this.layer = graphicsLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentBounds(LayoutCoordinates layoutCoordinates) {
        SharedElement sharedElement = getSharedElement();
        long jMo32238localPositionOfR5De75A = getRootCoords().mo32238localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m30653getZeroF1C5BW0());
        float fMo32237getSizeYbymL2g = (int) (layoutCoordinates.mo32237getSizeYbymL2g() >> 32);
        float fMo32237getSizeYbymL2g2 = (int) (layoutCoordinates.mo32237getSizeYbymL2g() & 4294967295L);
        sharedElement.setCurrentBounds(RectKt.m30677Recttz77jQw(jMo32238localPositionOfR5De75A, Size.m30697constructorimpl((Float.floatToRawIntBits(fMo32237getSizeYbymL2g) << 32) | (Float.floatToRawIntBits(fMo32237getSizeYbymL2g2) & 4294967295L))));
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo26774approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
        if (getSharedElement().getFoundMatch()) {
            Rect value = getBoundsAnimation().getValue();
            if (value == null) {
                value = getSharedElement().getCurrentBounds();
            }
            if (value != null) {
                long jM33680roundToIntSizeuvyYCjk = IntSizeKt.m33680roundToIntSizeuvyYCjk(value.m30670getSizeNHjbRc());
                int i10 = (int) (jM33680roundToIntSizeuvyYCjk >> 32);
                int i11 = (int) (jM33680roundToIntSizeuvyYCjk & 4294967295L);
                if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + getBoundsAnimation().getValue() + ", current bounds: " + getSharedElement().getCurrentBounds()).toString());
                }
                j10 = Constraints.Companion.m33464fixedJhjzzOo(AbstractC10410o.m21752e(i10, 0), AbstractC10410o.m21752e(i11, 0));
            }
        }
        return approachPlace(approachMeasureScope, measurable.mo32229measureBRTryo0(j10));
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(final ContentDrawScope contentDrawScope) {
        this.state.setFirstFrameDrawn$animation_release(true);
        SharedElementInternalState sharedElementInternalState = this.state;
        SharedTransitionScope.OverlayClip overlayClip = sharedElementInternalState.getOverlayClip();
        SharedTransitionScope.SharedContentState userState = this.state.getUserState();
        Rect currentBounds = getSharedElement().getCurrentBounds();
        AbstractC9979u.m20291d(currentBounds);
        sharedElementInternalState.setClipPathInOverlay$animation_release(overlayClip.getClipPath(userState, currentBounds, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer layer = this.state.getLayer();
        if (layer != null) {
            DrawScope.m31427recordJVtK1S4$default(contentDrawScope, layer, 0L, new InterfaceC9540l() { // from class: androidx.compose.animation.SharedBoundsNode.draw.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DrawScope) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(DrawScope drawScope) {
                    contentDrawScope.drawContent();
                }
            }, 1, null);
            if (this.state.getShouldRenderInPlace()) {
                GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + getSharedElement().getKey() + ",target: " + this.state.getBoundsAnimation().getTarget() + ", is attached: " + isAttached()).toString());
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final SharedElementInternalState getState() {
        return this.state;
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo26775isMeasurementApproachInProgressozmzZPI(long j10) {
        return getSharedElement().getFoundMatch() && this.state.getSharedElement().getScope().isTransitionActive();
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode, androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        float width = placeableMo32229measureBRTryo0.getWidth();
        float height = placeableMo32229measureBRTryo0.getHeight();
        final long jM30697constructorimpl = Size.m30697constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Offset offsetM30626boximpl;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                if (coordinates != null) {
                    SharedBoundsNode sharedBoundsNode = this;
                    long j11 = jM30697constructorimpl;
                    long jMo32238localPositionOfR5De75A = sharedBoundsNode.getRootLookaheadCoords().mo32238localPositionOfR5De75A(coordinates, Offset.Companion.m30653getZeroF1C5BW0());
                    if (sharedBoundsNode.getSharedElement().getCurrentBounds() == null) {
                        sharedBoundsNode.getSharedElement().setCurrentBounds(RectKt.m30677Recttz77jQw(jMo32238localPositionOfR5De75A, j11));
                    }
                    offsetM30626boximpl = Offset.m30626boximpl(jMo32238localPositionOfR5De75A);
                } else {
                    offsetM30626boximpl = null;
                }
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
                if (offsetM30626boximpl != null) {
                    SharedBoundsNode sharedBoundsNode2 = this;
                    sharedBoundsNode2.getSharedElement().m26813onLookaheadResultv_w8tDc(sharedBoundsNode2.getState(), jM30697constructorimpl, offsetM30626boximpl.m30647unboximpl());
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.state);
        this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.state.setLookaheadCoords(new InterfaceC9529a() { // from class: androidx.compose.animation.SharedBoundsNode.onAttach.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final LayoutCoordinates invoke() {
                return SharedBoundsNode.this.requireLookaheadLayoutCoordinates();
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        setLayer(null);
        this.state.setParentState(null);
        this.state.setLookaheadCoords(new InterfaceC9529a() { // from class: androidx.compose.animation.SharedBoundsNode.onDetach.1
            @Override // p181hd.InterfaceC9529a
            public final Void invoke() {
                return null;
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
        }
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
    }

    public final void setState$animation_release(SharedElementInternalState sharedElementInternalState) {
        if (AbstractC9979u.m20289b(sharedElementInternalState, this.state)) {
            return;
        }
        this.state = sharedElementInternalState;
        if (isAttached()) {
            provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState);
            this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
            this.state.setLayer(this.layer);
            this.state.setLookaheadCoords(new InterfaceC9529a() { // from class: androidx.compose.animation.SharedBoundsNode$state$1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LayoutCoordinates invoke() {
                    return this.this$0.requireLookaheadLayoutCoordinates();
                }
            });
        }
    }
}
