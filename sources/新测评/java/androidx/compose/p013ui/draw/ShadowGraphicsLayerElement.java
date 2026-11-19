package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0016\u0010\u0018\u001a\u00020\u0004HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0016\u0010\u001c\u001a\u00020\nHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000eJ\u0016\u0010\u001e\u001a\u00020\nHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000eJE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u0002H\u0016J\u0019\u0010$\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0002\b(H\u0002J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\u0002H\u0016J\f\u00102\u001a\u00020'*\u000203H\u0016R\u0019\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, m13558d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "(FLandroidx/compose/ui/graphics/Shape;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAmbientColor-0d7_KjU", "()J", "J", "getClip", "()Z", "getElevation-D9Ej5fM", "()F", "F", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getSpotColor-0d7_KjU", "component1", "component1-D9Ej5fM", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-gNMxBKI", "(FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "create", "createBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "equals", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;
    private final Shape shape;
    private final long spotColor;

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, Shape shape, boolean z9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, shape, z9, j10, j11);
    }

    /* renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m20602copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f10, Shape shape, boolean z9, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = shadowGraphicsLayerElement.elevation;
        }
        if ((i10 & 2) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        if ((i10 & 4) != 0) {
            z9 = shadowGraphicsLayerElement.clip;
        }
        if ((i10 & 8) != 0) {
            j10 = shadowGraphicsLayerElement.ambientColor;
        }
        if ((i10 & 16) != 0) {
            j11 = shadowGraphicsLayerElement.spotColor;
        }
        long j12 = j11;
        boolean z10 = z9;
        return shadowGraphicsLayerElement.m20606copygNMxBKI(f10, shape, z10, j10, j12);
    }

    private final Function1<GraphicsLayerScope, Unit> createBlock() {
        return new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement.createBlock.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo17332toPx0680j_4(ShadowGraphicsLayerElement.this.m20608getElevationD9Ej5fM()));
                graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
                graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
                graphicsLayerScope.mo21165setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m20607getAmbientColor0d7_KjU());
                graphicsLayerScope.mo21167setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m20609getSpotColor0d7_KjU());
            }
        };
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: component2, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    /* renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m20606copygNMxBKI(float elevation, Shape shape, boolean clip, long ambientColor, long spotColor) {
        return new ShadowGraphicsLayerElement(elevation, shape, clip, ambientColor, spotColor, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return C3127Dp.m23566equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && Intrinsics.areEqual(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m20977equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m20977equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m20607getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m20608getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m20609getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C3127Dp.m23567hashCodeimpl(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + Color.m20983hashCodeimpl(this.ambientColor)) * 31) + Color.m20983hashCodeimpl(this.spotColor);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", C3127Dp.m23559boximpl(this.elevation));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("ambientColor", Color.m20966boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m20966boximpl(this.spotColor));
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) C3127Dp.m23572toStringimpl(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) Color.m20984toStringimpl(this.ambientColor)) + ", spotColor=" + ((Object) Color.m20984toStringimpl(this.spotColor)) + ')';
    }

    private ShadowGraphicsLayerElement(float f10, Shape shape, boolean z9, long j10, long j11) {
        this.elevation = f10;
        this.shape = shape;
        this.clip = z9;
        this.ambientColor = j10;
        this.spotColor = j11;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* renamed from: create */
    public BlockGraphicsLayerModifier getNode() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier node) {
        node.setLayerBlock(createBlock());
        node.invalidateLayerBlock();
    }
}
