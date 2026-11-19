package coil3.compose.internal;

import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m7880d2 = {"Lcoil3/compose/internal/SubcomposeContentPainterNode;", "Lcoil3/compose/internal/AbstractContentPainterNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "clipToBounds", "", "contentDescription", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLjava/lang/String;)V", "h", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "coil-compose-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class SubcomposeContentPainterNode extends AbstractContentPainterNode {

    /* renamed from: h, reason: from kotlin metadata */
    public Painter painter;

    public SubcomposeContentPainterNode(Painter painter, Alignment alignment, ContentScale contentScale, float f6, ColorFilter colorFilter, boolean z6, String str) {
        super(alignment, contentScale, f6, colorFilter, z6, str, null);
        this.painter = painter;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode
    public Painter getPainter() {
        return this.painter;
    }

    public void setPainter(Painter painter) {
        this.painter = painter;
    }
}
