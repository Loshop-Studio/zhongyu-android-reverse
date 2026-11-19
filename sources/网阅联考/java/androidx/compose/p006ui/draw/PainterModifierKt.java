package androidx.compose.p006ui.draw;

import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.ColorFilter;
import androidx.compose.p006ui.graphics.painter.Painter;
import androidx.compose.p006ui.layout.ContentScale;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, m5175d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PainterModifierKt {
    public static final Modifier paint(Modifier modifier, Painter painter, boolean z3, Alignment alignment, ContentScale contentScale, float f4, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        return modifier.then(new PainterModifierNodeElement(painter, z3, alignment, contentScale, f4, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z3, Alignment alignment, ContentScale contentScale, float f4, ColorFilter colorFilter, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        boolean z4 = z3;
        if ((i4 & 4) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i4 & 8) != 0) {
            contentScale = ContentScale.INSTANCE.getInside();
        }
        ContentScale contentScale2 = contentScale;
        if ((i4 & 16) != 0) {
            f4 = 1.0f;
        }
        float f5 = f4;
        if ((i4 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z4, alignment2, contentScale2, f5, colorFilter);
    }
}
