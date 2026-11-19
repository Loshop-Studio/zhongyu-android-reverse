package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.painter.Painter;
import androidx.compose.p014ui.layout.ContentScale;

/* loaded from: classes2.dex */
public final class PainterModifierKt {
    public static final Modifier paint(Modifier modifier, Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter) {
        return modifier.then(new PainterElement(painter, z10, alignment, contentScale, f10, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i10 & 8) != 0) {
            contentScale = ContentScale.Companion.getInside();
        }
        ContentScale contentScale2 = contentScale;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z11, alignment2, contentScale2, f11, colorFilter);
    }
}
