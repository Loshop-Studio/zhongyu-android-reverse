package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p013ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p013ui.layout.ApproachMeasureScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.modifier.ModifierLocalMap;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020\u0016H\u0002J&\u0010-\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0014\u00106\u001a\u00020.*\u0002072\u0006\u00108\u001a\u000209H\u0002J\f\u0010:\u001a\u00020)*\u00020;H\u0016J&\u0010<\u001a\u00020.*\u0002072\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\f\u0010?\u001a\u00020)*\u00020\u0016H\u0002R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m13558d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "state", "Landroidx/compose/animation/SharedElementInternalState;", "(Landroidx/compose/animation/SharedElementInternalState;)V", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "value", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "rootCoords", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getRootCoords", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "rootLookaheadCoords", "getRootLookaheadCoords", "sharedElement", "Landroidx/compose/animation/SharedElement;", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "getState", "()Landroidx/compose/animation/SharedElementInternalState;", "setState$animation_release", "isMeasurementApproachInProgress", "", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "onAttach", "", "onDetach", "onReset", "requireLookaheadLayoutCoordinates", "approachMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachPlace", "Landroidx/compose/ui/layout/MeasureScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "measure", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "updateCurrentBounds", "animation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,276:1\n1#2:277\n33#3:278\n33#3:300\n53#4,3:279\n80#4:283\n85#4:286\n90#4:289\n85#4:292\n90#4:295\n85#4:297\n90#4:299\n53#4,3:301\n30#5:282\n61#6:284\n54#6:285\n63#6:287\n59#6:288\n61#6:290\n54#6:291\n63#6:293\n59#6:294\n54#6:296\n59#6:298\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n*L\n146#1:278\n241#1:300\n146#1:279,3\n175#1:283\n173#1:286\n172#1:289\n224#1:292\n224#1:295\n241#1:297\n241#1:299\n241#1:301,3\n175#1:282\n173#1:284\n173#1:285\n172#1:287\n172#1:288\n224#1:290\n224#1:291\n224#1:293\n224#1:294\n241#1:296\n241#1:298\n*E\n"})
/* loaded from: classes.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private GraphicsLayer layer;
    private final ModifierLocalMap providedValues;
    private SharedElementInternalState state;

    public SharedBoundsNode(SharedElementInternalState sharedElementInternalState) {
        this.state = sharedElementInternalState;
        this.layer = sharedElementInternalState.getLayer();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.m13565to(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState));
    }

    private final MeasureResult approachPlace(MeasureScope measureScope, final Placeable placeable) {
        if (!getSharedElement().getFoundMatch()) {
            return MeasureScope.layout$default(measureScope, placeable.getWidth(), placeable.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode.approachPlace.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        SharedBoundsNode.this.updateCurrentBounds(coordinates);
                    }
                    Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        long jMo17063calculateSizeJyjRU_E = this.state.getPlaceHolderSize().mo17063calculateSizeJyjRU_E(requireLookaheadLayoutCoordinates().mo22332getSizeYbymL2g(), IntSize.m23727constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L)));
        return MeasureScope.layout$default(measureScope, (int) (jMo17063calculateSizeJyjRU_E >> 32), (int) (jMo17063calculateSizeJyjRU_E & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode.approachPlace.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                long jM20770getTopLeftF1C5BW0;
                LayoutCoordinates coordinates;
                if (SharedBoundsNode.this.getSharedElement().getTargetBounds() != null) {
                    BoundsAnimation boundsAnimation = SharedBoundsNode.this.getBoundsAnimation();
                    Rect currentBounds = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                    Intrinsics.checkNotNull(currentBounds);
                    Rect targetBounds = SharedBoundsNode.this.getSharedElement().getTargetBounds();
                    Intrinsics.checkNotNull(targetBounds);
                    boundsAnimation.animate(currentBounds, targetBounds);
                }
                Rect value = SharedBoundsNode.this.getBoundsAnimation().getValue();
                LayoutCoordinates coordinates2 = placementScope.getCoordinates();
                Offset offsetM20724boximpl = coordinates2 != null ? Offset.m20724boximpl(SharedBoundsNode.this.getRootCoords().mo22333localPositionOfR5De75A(coordinates2, Offset.INSTANCE.m20751getZeroF1C5BW0())) : null;
                if (value != null) {
                    if (SharedBoundsNode.this.getBoundsAnimation().getTarget()) {
                        SharedBoundsNode.this.getSharedElement().setCurrentBounds(value);
                    }
                    jM20770getTopLeftF1C5BW0 = value.m20770getTopLeftF1C5BW0();
                } else {
                    if (SharedBoundsNode.this.getBoundsAnimation().getTarget() && (coordinates = placementScope.getCoordinates()) != null) {
                        SharedBoundsNode.this.updateCurrentBounds(coordinates);
                    }
                    Rect currentBounds2 = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                    Intrinsics.checkNotNull(currentBounds2);
                    jM20770getTopLeftF1C5BW0 = currentBounds2.m20770getTopLeftF1C5BW0();
                }
                long jM20739minusMKHz9U = offsetM20724boximpl != null ? Offset.m20739minusMKHz9U(jM20770getTopLeftF1C5BW0, offsetM20724boximpl.m20745unboximpl()) : Offset.INSTANCE.m20751getZeroF1C5BW0();
                Placeable.PlacementScope.place$default(placementScope, placeable, Math.round(Float.intBitsToFloat((int) (jM20739minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (jM20739minusMKHz9U & 4294967295L))), 0.0f, 4, null);
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
        long jMo22333localPositionOfR5De75A = getRootCoords().mo22333localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m20751getZeroF1C5BW0());
        float fMo22332getSizeYbymL2g = (int) (layoutCoordinates.mo22332getSizeYbymL2g() >> 32);
        float fMo22332getSizeYbymL2g2 = (int) (layoutCoordinates.mo22332getSizeYbymL2g() & 4294967295L);
        sharedElement.setCurrentBounds(RectKt.m20775Recttz77jQw(jMo22333localPositionOfR5De75A, Size.m20795constructorimpl((Float.floatToRawIntBits(fMo22332getSizeYbymL2g) << 32) | (Float.floatToRawIntBits(fMo22332getSizeYbymL2g2) & 4294967295L))));
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo17021approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
        if (getSharedElement().getFoundMatch()) {
            Rect value = getBoundsAnimation().getValue();
            if (value == null) {
                value = getSharedElement().getCurrentBounds();
            }
            if (value != null) {
                long jM23740roundToIntSizeuvyYCjk = IntSizeKt.m23740roundToIntSizeuvyYCjk(value.m20768getSizeNHjbRc());
                int i10 = (int) (jM23740roundToIntSizeuvyYCjk >> 32);
                int i11 = (int) (jM23740roundToIntSizeuvyYCjk & 4294967295L);
                if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + getBoundsAnimation().getValue() + ", current bounds: " + getSharedElement().getCurrentBounds()).toString());
                }
                j10 = Constraints.INSTANCE.m23524fixedJhjzzOo(RangesKt.coerceAtLeast(i10, 0), RangesKt.coerceAtLeast(i11, 0));
            }
        }
        return approachPlace(approachMeasureScope, measurable.mo22324measureBRTryo0(j10));
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(final ContentDrawScope contentDrawScope) {
        this.state.setFirstFrameDrawn$animation_release(true);
        SharedElementInternalState sharedElementInternalState = this.state;
        SharedTransitionScope.OverlayClip overlayClip = sharedElementInternalState.getOverlayClip();
        SharedTransitionScope.SharedContentState userState = this.state.getUserState();
        Rect currentBounds = getSharedElement().getCurrentBounds();
        Intrinsics.checkNotNull(currentBounds);
        sharedElementInternalState.setClipPathInOverlay$animation_release(overlayClip.getClipPath(userState, currentBounds, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer layer = this.state.getLayer();
        if (layer != null) {
            DrawScope.m21525recordJVtK1S4$default(contentDrawScope, layer, 0L, new Function1<DrawScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode.draw.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    contentDrawScope.drawContent();
                }
            }, 1, null);
            if (this.state.getShouldRenderInPlace()) {
                GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + getSharedElement().getKey() + ",target: " + this.state.getBoundsAnimation().getTarget() + ", is attached: " + getIsAttached()).toString());
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final SharedElementInternalState getState() {
        return this.state;
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo17022isMeasurementApproachInProgressozmzZPI(long lookaheadSize) {
        return getSharedElement().getFoundMatch() && this.state.getSharedElement().getScope().isTransitionActive();
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode, androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17016measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(j10);
        float width = placeableMo22324measureBRTryo0.getWidth();
        float height = placeableMo22324measureBRTryo0.getHeight();
        final long jM20795constructorimpl = Size.m20795constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        return MeasureScope.layout$default(measureScope, placeableMo22324measureBRTryo0.getWidth(), placeableMo22324measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Offset offsetM20724boximpl;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                if (coordinates != null) {
                    SharedBoundsNode sharedBoundsNode = this;
                    long j11 = jM20795constructorimpl;
                    long jMo22333localPositionOfR5De75A = sharedBoundsNode.getRootLookaheadCoords().mo22333localPositionOfR5De75A(coordinates, Offset.INSTANCE.m20751getZeroF1C5BW0());
                    if (sharedBoundsNode.getSharedElement().getCurrentBounds() == null) {
                        sharedBoundsNode.getSharedElement().setCurrentBounds(RectKt.m20775Recttz77jQw(jMo22333localPositionOfR5De75A, j11));
                    }
                    offsetM20724boximpl = Offset.m20724boximpl(jMo22333localPositionOfR5De75A);
                } else {
                    offsetM20724boximpl = null;
                }
                Placeable.PlacementScope.place$default(placementScope, placeableMo22324measureBRTryo0, 0, 0, 0.0f, 4, null);
                if (offsetM20724boximpl != null) {
                    SharedBoundsNode sharedBoundsNode2 = this;
                    sharedBoundsNode2.getSharedElement().m17060onLookaheadResultv_w8tDc(sharedBoundsNode2.getState(), jM20795constructorimpl, offsetM20724boximpl.m20745unboximpl());
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
        this.state.setLookaheadCoords(new Function0<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode.onAttach.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
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
        this.state.setLookaheadCoords(new Function0() { // from class: androidx.compose.animation.SharedBoundsNode.onDetach.1
            @Override // kotlin.jvm.functions.Function0
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
        if (Intrinsics.areEqual(sharedElementInternalState, this.state)) {
            return;
        }
        this.state = sharedElementInternalState;
        if (getIsAttached()) {
            provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState);
            this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
            this.state.setLayer(this.layer);
            this.state.setLookaheadCoords(new Function0<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode$state$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LayoutCoordinates invoke() {
                    return this.this$0.requireLookaheadLayoutCoordinates();
                }
            });
        }
    }
}
