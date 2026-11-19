package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.painter.Painter;
import androidx.compose.p014ui.layout.ContentScale;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class PainterElement extends ModifierNodeElement<PainterNode> {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public PainterElement(Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z10;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f10;
        this.colorFilter = colorFilter;
    }

    public static /* synthetic */ PainterElement copy$default(PainterElement painterElement, Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            painter = painterElement.painter;
        }
        if ((i10 & 2) != 0) {
            z10 = painterElement.sizeToIntrinsics;
        }
        if ((i10 & 4) != 0) {
            alignment = painterElement.alignment;
        }
        if ((i10 & 8) != 0) {
            contentScale = painterElement.contentScale;
        }
        if ((i10 & 16) != 0) {
            f10 = painterElement.alpha;
        }
        if ((i10 & 32) != 0) {
            colorFilter = painterElement.colorFilter;
        }
        float f11 = f10;
        ColorFilter colorFilter2 = colorFilter;
        return painterElement.copy(painter, z10, alignment, contentScale, f11, colorFilter2);
    }

    public final Painter component1() {
        return this.painter;
    }

    public final boolean component2() {
        return this.sizeToIntrinsics;
    }

    public final Alignment component3() {
        return this.alignment;
    }

    public final ContentScale component4() {
        return this.contentScale;
    }

    public final float component5() {
        return this.alpha;
    }

    public final ColorFilter component6() {
        return this.colorFilter;
    }

    public final PainterElement copy(Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter) {
        return new PainterElement(painter, z10, alignment, contentScale, f10, colorFilter);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return AbstractC9979u.m20289b(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && AbstractC9979u.m20289b(this.alignment, painterElement.alignment) && AbstractC9979u.m20289b(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && AbstractC9979u.m20289b(this.colorFilter, painterElement.colorFilter);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return iHashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.painter);
        inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.valueOf(this.sizeToIntrinsics));
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public PainterNode create() {
        return new PainterNode(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(PainterNode painterNode) {
        boolean sizeToIntrinsics = painterNode.getSizeToIntrinsics();
        boolean z10 = this.sizeToIntrinsics;
        boolean z11 = sizeToIntrinsics != z10 || (z10 && !Size.m30702equalsimpl0(painterNode.getPainter().mo31549getIntrinsicSizeNHjbRc(), this.painter.mo31549getIntrinsicSizeNHjbRc()));
        painterNode.setPainter(this.painter);
        painterNode.setSizeToIntrinsics(this.sizeToIntrinsics);
        painterNode.setAlignment(this.alignment);
        painterNode.setContentScale(this.contentScale);
        painterNode.setAlpha(this.alpha);
        painterNode.setColorFilter(this.colorFilter);
        if (z11) {
            LayoutModifierNodeKt.invalidateMeasurement(painterNode);
        }
        DrawModifierNodeKt.invalidateDraw(painterNode);
    }
}
