package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RectKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p011ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p011ui.layout.ApproachMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.modifier.ModifierLocalMap;
import androidx.compose.p011ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p011ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J&\u0010\u001f\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J&\u0010)\u001a\u00020\u000f*\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010+\u001a\u00020\u0012*\u00020*H\u0016¢\u0006\u0004\b+\u0010,R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00058\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\bR(\u00103\u001a\u0004\u0018\u0001022\b\u0010-\u001a\u0004\u0018\u0001028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u000bR\u0014\u0010?\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u000bR\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, m5110d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/animation/SharedElementInternalState;", "state", "<init>", "(Landroidx/compose/animation/SharedElementInternalState;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/ui/layout/MeasureResult;", "approachPlace", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/ui/layout/MeasureResult;", "Ld6/s;", "updateCurrentBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "onAttach", "()V", "onDetach", "onReset", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "isMeasurementApproachInProgress", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "value", "Landroidx/compose/animation/SharedElementInternalState;", "getState", "()Landroidx/compose/animation/SharedElementInternalState;", "setState$animation_release", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "getRootCoords", "rootCoords", "getRootLookaheadCoords", "rootLookaheadCoords", "Landroidx/compose/animation/BoundsAnimation;", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "Landroidx/compose/animation/SharedElement;", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "sharedElement", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,276:1\n1#2:277\n33#3:278\n33#3:300\n53#4,3:279\n80#4:283\n85#4:286\n90#4:289\n85#4:292\n90#4:295\n85#4:297\n90#4:299\n53#4,3:301\n30#5:282\n61#6:284\n54#6:285\n63#6:287\n59#6:288\n61#6:290\n54#6:291\n63#6:293\n59#6:294\n54#6:296\n59#6:298\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n*L\n146#1:278\n241#1:300\n146#1:279,3\n175#1:283\n173#1:286\n172#1:289\n224#1:292\n224#1:295\n241#1:297\n241#1:299\n241#1:301,3\n175#1:282\n173#1:284\n173#1:285\n172#1:287\n172#1:288\n224#1:290\n224#1:291\n224#1:293\n224#1:294\n241#1:296\n241#1:298\n*E\n"})
/* loaded from: classes.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;

    @Nullable
    private GraphicsLayer layer;

    @NotNull
    private final ModifierLocalMap providedValues;

    @NotNull
    private SharedElementInternalState state;

    public SharedBoundsNode(@NotNull SharedElementInternalState sharedElementInternalState) {
        this.state = sharedElementInternalState;
        this.layer = sharedElementInternalState.getLayer();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(new Pair(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState));
    }

    private final MeasureResult approachPlace(MeasureScope measureScope, final Placeable placeable) {
        if (!getSharedElement().getFoundMatch()) {
            return MeasureScope.layout$default(measureScope, placeable.getWidth(), placeable.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.animation.SharedBoundsNode.approachPlace.1
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
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        SharedBoundsNode.this.updateCurrentBounds(coordinates);
                    }
                    Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        long jMo6621calculateSizeJyjRU_E = this.state.getPlaceHolderSize().mo6621calculateSizeJyjRU_E(requireLookaheadLayoutCoordinates().mo12041getSizeYbymL2g(), IntSize.m13471constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L)));
        return MeasureScope.layout$default(measureScope, (int) (jMo6621calculateSizeJyjRU_E >> 32), (int) (jMo6621calculateSizeJyjRU_E & 4294967295L), null, new InterfaceC6471c() { // from class: androidx.compose.animation.SharedBoundsNode.approachPlace.2
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
                long jM10476getTopLeftF1C5BW0;
                LayoutCoordinates coordinates;
                if (SharedBoundsNode.this.getSharedElement().getTargetBounds() != null) {
                    BoundsAnimation boundsAnimation = SharedBoundsNode.this.getBoundsAnimation();
                    Rect currentBounds = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                    AbstractC5830k.m5327d(currentBounds);
                    Rect targetBounds = SharedBoundsNode.this.getSharedElement().getTargetBounds();
                    AbstractC5830k.m5327d(targetBounds);
                    boundsAnimation.animate(currentBounds, targetBounds);
                }
                Rect value = SharedBoundsNode.this.getBoundsAnimation().getValue();
                LayoutCoordinates coordinates2 = placementScope.getCoordinates();
                Offset offsetM10430boximpl = coordinates2 != null ? Offset.m10430boximpl(SharedBoundsNode.this.getRootCoords().mo12042localPositionOfR5De75A(coordinates2, Offset.INSTANCE.m10457getZeroF1C5BW0())) : null;
                if (value != null) {
                    if (SharedBoundsNode.this.getBoundsAnimation().getTarget()) {
                        SharedBoundsNode.this.getSharedElement().setCurrentBounds(value);
                    }
                    jM10476getTopLeftF1C5BW0 = value.m10476getTopLeftF1C5BW0();
                } else {
                    if (SharedBoundsNode.this.getBoundsAnimation().getTarget() && (coordinates = placementScope.getCoordinates()) != null) {
                        SharedBoundsNode.this.updateCurrentBounds(coordinates);
                    }
                    Rect currentBounds2 = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                    AbstractC5830k.m5327d(currentBounds2);
                    jM10476getTopLeftF1C5BW0 = currentBounds2.m10476getTopLeftF1C5BW0();
                }
                long jM10445minusMKHz9U = offsetM10430boximpl != null ? Offset.m10445minusMKHz9U(jM10476getTopLeftF1C5BW0, offsetM10430boximpl.m10451unboximpl()) : Offset.INSTANCE.m10457getZeroF1C5BW0();
                Placeable.PlacementScope.place$default(placementScope, placeable, Math.round(Float.intBitsToFloat((int) (jM10445minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (jM10445minusMKHz9U & 4294967295L))), 0.0f, 4, null);
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
        long jMo12042localPositionOfR5De75A = getRootCoords().mo12042localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m10457getZeroF1C5BW0());
        float fMo12041getSizeYbymL2g = (int) (layoutCoordinates.mo12041getSizeYbymL2g() >> 32);
        float fMo12041getSizeYbymL2g2 = (int) (layoutCoordinates.mo12041getSizeYbymL2g() & 4294967295L);
        sharedElement.setCurrentBounds(RectKt.m10481Recttz77jQw(jMo12042localPositionOfR5De75A, Size.m10501constructorimpl((Float.floatToRawIntBits(fMo12041getSizeYbymL2g) << 32) | (Float.floatToRawIntBits(fMo12041getSizeYbymL2g2) & 4294967295L))));
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode
    @NotNull
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo6578approachMeasure3p2s80s(@NotNull ApproachMeasureScope approachMeasureScope, @NotNull Measurable measurable, long j7) {
        if (getSharedElement().getFoundMatch()) {
            Rect value = getBoundsAnimation().getValue();
            if (value == null) {
                value = getSharedElement().getCurrentBounds();
            }
            if (value != null) {
                long jM13484roundToIntSizeuvyYCjk = IntSizeKt.m13484roundToIntSizeuvyYCjk(value.m10474getSizeNHjbRc());
                int i = (int) (jM13484roundToIntSizeuvyYCjk >> 32);
                int i8 = (int) (jM13484roundToIntSizeuvyYCjk & 4294967295L);
                if (i == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + getBoundsAnimation().getValue() + ", current bounds: " + getSharedElement().getCurrentBounds()).toString());
                }
                Constraints.Companion companion = Constraints.INSTANCE;
                if (i < 0) {
                    i = 0;
                }
                if (i8 < 0) {
                    i8 = 0;
                }
                j7 = companion.m13268fixedJhjzzOo(i, i8);
            }
        }
        return approachPlace(approachMeasureScope, measurable.mo12033measureBRTryo0(j7));
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull final ContentDrawScope contentDrawScope) {
        this.state.setFirstFrameDrawn$animation_release(true);
        SharedElementInternalState sharedElementInternalState = this.state;
        SharedTransitionScope.OverlayClip overlayClip = sharedElementInternalState.getOverlayClip();
        SharedTransitionScope.SharedContentState userState = this.state.getUserState();
        Rect currentBounds = getSharedElement().getCurrentBounds();
        AbstractC5830k.m5327d(currentBounds);
        sharedElementInternalState.setClipPathInOverlay$animation_release(overlayClip.getClipPath(userState, currentBounds, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer layer = this.state.getLayer();
        if (layer != null) {
            DrawScope.m11231recordJVtK1S4$default(contentDrawScope, layer, 0L, new InterfaceC6471c() { // from class: androidx.compose.animation.SharedBoundsNode.draw.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
            }, 1, null);
            if (this.state.getShouldRenderInPlace()) {
                GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + getSharedElement().getKey() + ",target: " + this.state.getBoundsAnimation().getTarget() + ", is attached: " + getIsAttached()).toString());
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @NotNull
    public final SharedElementInternalState getState() {
        return this.state;
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo6579isMeasurementApproachInProgressozmzZPI(long lookaheadSize) {
        return getSharedElement().getFoundMatch() && this.state.getSharedElement().getScope().isTransitionActive();
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode, androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
        float width = placeableMo12033measureBRTryo0.getWidth();
        float height = placeableMo12033measureBRTryo0.getHeight();
        final long jM10501constructorimpl = Size.m10501constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
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
                Offset offsetM10430boximpl;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                if (coordinates != null) {
                    SharedBoundsNode sharedBoundsNode = this;
                    long j8 = jM10501constructorimpl;
                    long jMo12042localPositionOfR5De75A = sharedBoundsNode.getRootLookaheadCoords().mo12042localPositionOfR5De75A(coordinates, Offset.INSTANCE.m10457getZeroF1C5BW0());
                    if (sharedBoundsNode.getSharedElement().getCurrentBounds() == null) {
                        sharedBoundsNode.getSharedElement().setCurrentBounds(RectKt.m10481Recttz77jQw(jMo12042localPositionOfR5De75A, j8));
                    }
                    offsetM10430boximpl = Offset.m10430boximpl(jMo12042localPositionOfR5De75A);
                } else {
                    offsetM10430boximpl = null;
                }
                Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
                if (offsetM10430boximpl != null) {
                    SharedBoundsNode sharedBoundsNode2 = this;
                    sharedBoundsNode2.getSharedElement().m6617onLookaheadResultv_w8tDc(sharedBoundsNode2.getState(), jM10501constructorimpl, offsetM10430boximpl.m10451unboximpl());
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
        this.state.setLookaheadCoords(new InterfaceC6469a() { // from class: androidx.compose.animation.SharedBoundsNode.onAttach.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
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
        this.state.setLookaheadCoords(new InterfaceC6469a() { // from class: androidx.compose.animation.SharedBoundsNode.onDetach.1
            @Override // p152r6.InterfaceC6469a
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

    public final void setState$animation_release(@NotNull SharedElementInternalState sharedElementInternalState) {
        if (AbstractC5830k.m5325b(sharedElementInternalState, this.state)) {
            return;
        }
        this.state = sharedElementInternalState;
        if (getIsAttached()) {
            provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState);
            this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
            this.state.setLayer(this.layer);
            this.state.setLookaheadCoords(new InterfaceC6469a() { // from class: androidx.compose.animation.SharedBoundsNode$state$1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final LayoutCoordinates invoke() {
                    return this.this$0.requireLookaheadLayoutCoordinates();
                }
            });
        }
    }
}
