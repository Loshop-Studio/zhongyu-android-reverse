package androidx.compose.foundation.layout;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "(Ljava/lang/String;I)V", "Horizontal", "Vertical", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LayoutOrientation {
    private static final /* synthetic */ InterfaceC5748a $ENTRIES;
    private static final /* synthetic */ LayoutOrientation[] $VALUES;
    public static final LayoutOrientation Horizontal = new LayoutOrientation("Horizontal", 0);
    public static final LayoutOrientation Vertical = new LayoutOrientation("Vertical", 1);

    private static final /* synthetic */ LayoutOrientation[] $values() {
        return new LayoutOrientation[]{Horizontal, Vertical};
    }

    static {
        LayoutOrientation[] layoutOrientationArr$values = $values();
        $VALUES = layoutOrientationArr$values;
        $ENTRIES = AbstractC5817a.m5310a(layoutOrientationArr$values);
    }

    private LayoutOrientation(String str, int i) {
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return $ENTRIES;
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) $VALUES.clone();
    }
}
