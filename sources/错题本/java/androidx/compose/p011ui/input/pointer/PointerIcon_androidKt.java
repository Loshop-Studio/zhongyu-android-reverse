package androidx.compose.p011ui.input.pointer;

import android.view.PointerIcon;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003¨\u0006\u000f"}, m5110d2 = {"pointerIconCrosshair", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getPointerIconCrosshair", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconDefault", "getPointerIconDefault", "pointerIconHand", "getPointerIconHand", "pointerIconText", "getPointerIconText", "PointerIcon", "pointerIcon", "Landroid/view/PointerIcon;", "pointerIconType", "", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PointerIcon_androidKt {

    @NotNull
    private static final PointerIcon pointerIconDefault = new AndroidPointerIconType(1000);

    @NotNull
    private static final PointerIcon pointerIconCrosshair = new AndroidPointerIconType(PointerIconCompat.TYPE_CROSSHAIR);

    @NotNull
    private static final PointerIcon pointerIconText = new AndroidPointerIconType(PointerIconCompat.TYPE_TEXT);

    @NotNull
    private static final PointerIcon pointerIconHand = new AndroidPointerIconType(PointerIconCompat.TYPE_HAND);

    @NotNull
    public static final PointerIcon PointerIcon(@NotNull PointerIcon pointerIcon) {
        return new AndroidPointerIcon(pointerIcon);
    }

    @NotNull
    public static final PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    @NotNull
    public static final PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    @NotNull
    public static final PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }

    @NotNull
    public static final PointerIcon getPointerIconText() {
        return pointerIconText;
    }

    @NotNull
    public static final PointerIcon PointerIcon(int i) {
        return new AndroidPointerIconType(i);
    }
}
