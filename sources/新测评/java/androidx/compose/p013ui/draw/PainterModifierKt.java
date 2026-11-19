package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.layout.ContentScale;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, m13558d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class PainterModifierKt {
    public static final Modifier paint(Modifier modifier, Painter painter, boolean z9, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter) {
        return modifier.then(new PainterElement(painter, z9, alignment, contentScale, f10, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z9, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        boolean z10 = z9;
        if ((i10 & 4) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i10 & 8) != 0) {
            contentScale = ContentScale.INSTANCE.getInside();
        }
        ContentScale contentScale2 = contentScale;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z10, alignment2, contentScale2, f11, colorFilter);
    }
}
