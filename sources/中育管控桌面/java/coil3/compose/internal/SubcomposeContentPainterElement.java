package coil3.compose.internal;

import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.node.DrawModifierNodeKt;
import androidx.compose.p009ui.node.LayoutModifierNodeKt;
import androidx.compose.p009ui.node.ModifierNodeElement;
import androidx.compose.p009ui.node.SemanticsModifierNodeKt;
import androidx.compose.p009ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m7880d2 = {"Lcoil3/compose/internal/SubcomposeContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcoil3/compose/internal/SubcomposeContentPainterNode;", "a", "()Lcoil3/compose/internal/SubcomposeContentPainterNode;", "node", "", "b", "(Lcoil3/compose/internal/SubcomposeContentPainterNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "c", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "d", "F", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "e", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "f", "Z", "clipToBounds", "g", "Ljava/lang/String;", "contentDescription", "coil-compose-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubcomposeContentPainterElement extends ModifierNodeElement<SubcomposeContentPainterNode> {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final Painter painter;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final Alignment alignment;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final ContentScale contentScale;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final float alpha;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final ColorFilter colorFilter;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean clipToBounds;

    /* renamed from: g, reason: from kotlin metadata and from toString */
    public final String contentDescription;

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SubcomposeContentPainterNode getNode() {
        return new SubcomposeContentPainterNode(this.painter, this.alignment, this.contentScale, this.alpha, this.colorFilter, this.clipToBounds, this.contentDescription);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void update(SubcomposeContentPainterNode node) {
        boolean zM13723equalsimpl0 = Size.m13723equalsimpl0(node.getPainter().getIntrinsicSize(), this.painter.getIntrinsicSize());
        node.setPainter(this.painter);
        node.setAlignment(this.alignment);
        node.setContentScale(this.contentScale);
        node.setAlpha(this.alpha);
        node.setColorFilter(this.colorFilter);
        node.m1778e(this.clipToBounds);
        if (!Intrinsics.areEqual(node.getContentDescription(), this.contentDescription)) {
            node.m1780g(this.contentDescription);
            SemanticsModifierNodeKt.invalidateSemantics(node);
        }
        if (!zM13723equalsimpl0) {
            LayoutModifierNodeKt.invalidateMeasurement(node);
        }
        DrawModifierNodeKt.invalidateDraw(node);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubcomposeContentPainterElement)) {
            return false;
        }
        SubcomposeContentPainterElement subcomposeContentPainterElement = (SubcomposeContentPainterElement) other;
        return Intrinsics.areEqual(this.painter, subcomposeContentPainterElement.painter) && Intrinsics.areEqual(this.alignment, subcomposeContentPainterElement.alignment) && Intrinsics.areEqual(this.contentScale, subcomposeContentPainterElement.contentScale) && Float.compare(this.alpha, subcomposeContentPainterElement.alpha) == 0 && Intrinsics.areEqual(this.colorFilter, subcomposeContentPainterElement.colorFilter) && this.clipToBounds == subcomposeContentPainterElement.clipToBounds && Intrinsics.areEqual(this.contentDescription, subcomposeContentPainterElement.contentDescription);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((this.painter.hashCode() * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        int iHashCode2 = (((iHashCode + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31) + Boolean.hashCode(this.clipToBounds)) * 31;
        String str = this.contentDescription;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("painter", this.painter);
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
        inspectorInfo.getProperties().set("clipToBounds", Boolean.valueOf(this.clipToBounds));
        inspectorInfo.getProperties().set("contentDescription", this.contentDescription);
    }

    public String toString() {
        return "SubcomposeContentPainterElement(painter=" + this.painter + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ", clipToBounds=" + this.clipToBounds + ", contentDescription=" + this.contentDescription + ")";
    }
}
