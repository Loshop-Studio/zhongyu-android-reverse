package androidx.compose.foundation.text;

import androidx.compose.p012ui.input.pointer.PointerIcon;
import androidx.compose.p012ui.input.pointer.PointerIcon_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m13413d2 = {"handwritingPointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getHandwritingPointerIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "textPointerIcon", "getTextPointerIcon", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextPointerIcon_androidKt {
    private static final PointerIcon textPointerIcon = PointerIcon_androidKt.PointerIcon(PointerIconCompat.TYPE_TEXT);
    private static final PointerIcon handwritingPointerIcon = PointerIcon_androidKt.PointerIcon(1022);

    public static final PointerIcon getHandwritingPointerIcon() {
        return handwritingPointerIcon;
    }

    public static final PointerIcon getTextPointerIcon() {
        return textPointerIcon;
    }
}
