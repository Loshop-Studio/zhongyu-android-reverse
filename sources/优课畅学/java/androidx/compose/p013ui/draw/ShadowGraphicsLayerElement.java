package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;
    private final Shape shape;
    private final long spotColor;

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, Shape shape, boolean z10, long j10, long j11, AbstractC9126n abstractC9126n) {
        this(f10, shape, z10, j10, j11);
    }

    /* renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m23895copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f10, Shape shape, boolean z10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = shadowGraphicsLayerElement.elevation;
        }
        if ((i10 & 2) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        if ((i10 & 4) != 0) {
            z10 = shadowGraphicsLayerElement.clip;
        }
        if ((i10 & 8) != 0) {
            j10 = shadowGraphicsLayerElement.ambientColor;
        }
        if ((i10 & 16) != 0) {
            j11 = shadowGraphicsLayerElement.spotColor;
        }
        long j12 = j11;
        boolean z11 = z10;
        return shadowGraphicsLayerElement.m23899copygNMxBKI(f10, shape, z11, j10, j12);
    }

    private final InterfaceC10570l createBlock() {
        return new InterfaceC10570l() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement.createBlock.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo20497toPx0680j_4(ShadowGraphicsLayerElement.this.m23901getElevationD9Ej5fM()));
                graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
                graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
                graphicsLayerScope.mo24465setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m23900getAmbientColor0d7_KjU());
                graphicsLayerScope.mo24467setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m23902getSpotColor0d7_KjU());
            }
        };
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m23896component1D9Ej5fM() {
        return this.elevation;
    }

    public final Shape component2() {
        return this.shape;
    }

    public final boolean component3() {
        return this.clip;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m23897component40d7_KjU() {
        return this.ambientColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m23898component50d7_KjU() {
        return this.spotColor;
    }

    /* renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m23899copygNMxBKI(float f10, Shape shape, boolean z10, long j10, long j11) {
        return new ShadowGraphicsLayerElement(f10, shape, z10, j10, j11, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return C3156Dp.m26904equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && AbstractC9133u.m16128b(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m24277equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m24277equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m23900getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m23901getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m23902getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C3156Dp.m26905hashCodeimpl(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + Color.m24283hashCodeimpl(this.ambientColor)) * 31) + Color.m24283hashCodeimpl(this.spotColor);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", C3156Dp.m26897boximpl(this.elevation));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("ambientColor", Color.m24266boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m24266boximpl(this.spotColor));
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) C3156Dp.m26910toStringimpl(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) Color.m24284toStringimpl(this.ambientColor)) + ", spotColor=" + ((Object) Color.m24284toStringimpl(this.spotColor)) + ')';
    }

    private ShadowGraphicsLayerElement(float f10, Shape shape, boolean z10, long j10, long j11) {
        this.elevation = f10;
        this.shape = shape;
        this.clip = z10;
        this.ambientColor = j10;
        this.spotColor = j11;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(createBlock());
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }
}
