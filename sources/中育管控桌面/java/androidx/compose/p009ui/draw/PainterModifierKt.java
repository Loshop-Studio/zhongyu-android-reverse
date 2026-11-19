package androidx.compose.p009ui.draw;

import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, m7880d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class PainterModifierKt {
    public static final Modifier paint(Modifier modifier, Painter painter, boolean z6, Alignment alignment, ContentScale contentScale, float f6, ColorFilter colorFilter) {
        return modifier.then(new PainterElement(painter, z6, alignment, contentScale, f6, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z6, Alignment alignment, ContentScale contentScale, float f6, ColorFilter colorFilter, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z6 = true;
        }
        boolean z7 = z6;
        if ((i6 & 4) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i6 & 8) != 0) {
            contentScale = ContentScale.INSTANCE.getInside();
        }
        ContentScale contentScale2 = contentScale;
        if ((i6 & 16) != 0) {
            f6 = 1.0f;
        }
        float f7 = f6;
        if ((i6 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z7, alignment2, contentScale2, f7, colorFilter);
    }
}
