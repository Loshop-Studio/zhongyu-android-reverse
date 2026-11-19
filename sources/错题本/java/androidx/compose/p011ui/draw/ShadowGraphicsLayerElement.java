package androidx.compose.p011ui.draw;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0010*\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001e\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010%\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0016\u0010'\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010$JE\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\"R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010$R\u001d\u0010\u000b\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b=\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m5110d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Landroidx/compose/ui/unit/Dp;", "elevation", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/Color;", "ambientColor", "spotColor", "<init>", "(FLandroidx/compose/ui/graphics/Shape;ZJJLkotlin/jvm/internal/e;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "createBlock", "()Lr6/c;", "create", "()Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "node", "update", "(Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1-D9Ej5fM", "()F", "component1", "component2", "()Landroidx/compose/ui/graphics/Shape;", "component3", "()Z", "component4-0d7_KjU", "()J", "component4", "component5-0d7_KjU", "component5", "copy-gNMxBKI", "(FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getElevation-D9Ej5fM", "Landroidx/compose/ui/graphics/Shape;", "getShape", "Z", "getClip", "J", "getAmbientColor-0d7_KjU", "getSpotColor-0d7_KjU", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;

    @NotNull
    private final Shape shape;
    private final long spotColor;

    public /* synthetic */ ShadowGraphicsLayerElement(float f, Shape shape, boolean z8, long j7, long j8, AbstractC5824e abstractC5824e) {
        this(f, shape, z8, j7, j8);
    }

    /* renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m10301copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f, Shape shape, boolean z8, long j7, long j8, int i, Object obj) {
        if ((i & 1) != 0) {
            f = shadowGraphicsLayerElement.elevation;
        }
        if ((i & 2) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        if ((i & 4) != 0) {
            z8 = shadowGraphicsLayerElement.clip;
        }
        if ((i & 8) != 0) {
            j7 = shadowGraphicsLayerElement.ambientColor;
        }
        if ((i & 16) != 0) {
            j8 = shadowGraphicsLayerElement.spotColor;
        }
        long j9 = j8;
        boolean z9 = z8;
        return shadowGraphicsLayerElement.m10305copygNMxBKI(f, shape, z9, j7, j9);
    }

    private final InterfaceC6471c createBlock() {
        return new InterfaceC6471c() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement.createBlock.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo6903toPx0680j_4(ShadowGraphicsLayerElement.this.m10307getElevationD9Ej5fM()));
                graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
                graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
                graphicsLayerScope.mo10871setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m10306getAmbientColor0d7_KjU());
                graphicsLayerScope.mo10873setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m10308getSpotColor0d7_KjU());
            }
        };
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    @NotNull
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

    @NotNull
    /* renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m10305copygNMxBKI(float elevation, @NotNull Shape shape, boolean clip, long ambientColor, long spotColor) {
        return new ShadowGraphicsLayerElement(elevation, shape, clip, ambientColor, spotColor, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return C2331Dp.m13310equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && AbstractC5830k.m5325b(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m10683equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m10683equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m10306getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m10307getElevationD9Ej5fM() {
        return this.elevation;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m10308getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return Color.m10689hashCodeimpl(this.spotColor) + AbstractC0584a.m904e(this.ambientColor, AbstractC0584a.m908i(this.clip, (this.shape.hashCode() + (C2331Dp.m13311hashCodeimpl(this.elevation) * 31)) * 31, 31), 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        AbstractC0584a.m909j(this.elevation, inspectorInfo.getProperties(), "elevation", inspectorInfo).set("shape", this.shape);
        AbstractC0584a.m910k(this.clip, inspectorInfo.getProperties(), "clip", inspectorInfo).set("ambientColor", Color.m10672boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m10672boximpl(this.spotColor));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        AbstractC0584a.m922w(sb, ", shape=", this.elevation);
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", ambientColor=");
        AbstractC0584a.m919t(this.ambientColor, ", spotColor=", sb);
        sb.append((Object) Color.m10690toStringimpl(this.spotColor));
        sb.append(')');
        return sb.toString();
    }

    private ShadowGraphicsLayerElement(float f, Shape shape, boolean z8, long j7, long j8) {
        this.elevation = f;
        this.shape = shape;
        this.clip = z8;
        this.ambientColor = j7;
        this.spotColor = j8;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public BlockGraphicsLayerModifier getNode() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull BlockGraphicsLayerModifier node) {
        node.setLayerBlock(createBlock());
        node.invalidateLayerBlock();
    }
}
