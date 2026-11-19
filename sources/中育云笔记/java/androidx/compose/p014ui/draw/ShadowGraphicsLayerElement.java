package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;
    private final Shape shape;
    private final long spotColor;

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, Shape shape, boolean z10, long j10, long j11, AbstractC9972n abstractC9972n) {
        this(f10, shape, z10, j10, j11);
    }

    /* renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m30497copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f10, Shape shape, boolean z10, long j10, long j11, int i10, Object obj) {
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
        return shadowGraphicsLayerElement.m30501copygNMxBKI(f10, shape, z11, j10, j12);
    }

    private final InterfaceC9540l createBlock() {
        return new InterfaceC9540l() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement.createBlock.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo27099toPx0680j_4(ShadowGraphicsLayerElement.this.m30503getElevationD9Ej5fM()));
                graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
                graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
                graphicsLayerScope.mo31067setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m30502getAmbientColor0d7_KjU());
                graphicsLayerScope.mo31069setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m30504getSpotColor0d7_KjU());
            }
        };
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m30498component1D9Ej5fM() {
        return this.elevation;
    }

    public final Shape component2() {
        return this.shape;
    }

    public final boolean component3() {
        return this.clip;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m30499component40d7_KjU() {
        return this.ambientColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m30500component50d7_KjU() {
        return this.spotColor;
    }

    /* renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m30501copygNMxBKI(float f10, Shape shape, boolean z10, long j10, long j11) {
        return new ShadowGraphicsLayerElement(f10, shape, z10, j10, j11, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return C3186Dp.m33506equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && AbstractC9979u.m20289b(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m30879equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m30879equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m30502getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m30503getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m30504getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C3186Dp.m33507hashCodeimpl(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + Color.m30885hashCodeimpl(this.ambientColor)) * 31) + Color.m30885hashCodeimpl(this.spotColor);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", C3186Dp.m33499boximpl(this.elevation));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("ambientColor", Color.m30868boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m30868boximpl(this.spotColor));
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) C3186Dp.m33512toStringimpl(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) Color.m30886toStringimpl(this.ambientColor)) + ", spotColor=" + ((Object) Color.m30886toStringimpl(this.spotColor)) + ')';
    }

    private ShadowGraphicsLayerElement(float f10, Shape shape, boolean z10, long j10, long j11) {
        this.elevation = f10;
        this.shape = shape;
        this.clip = z10;
        this.ambientColor = j10;
        this.spotColor = j11;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(createBlock());
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }
}
