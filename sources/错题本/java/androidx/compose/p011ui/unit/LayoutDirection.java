package androidx.compose.p011ui.unit;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/ui/unit/LayoutDirection;", "", "(Ljava/lang/String;I)V", "Ltr", "Rtl", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LayoutDirection {
    private static final /* synthetic */ InterfaceC5748a $ENTRIES;
    private static final /* synthetic */ LayoutDirection[] $VALUES;
    public static final LayoutDirection Ltr = new LayoutDirection("Ltr", 0);
    public static final LayoutDirection Rtl = new LayoutDirection("Rtl", 1);

    private static final /* synthetic */ LayoutDirection[] $values() {
        return new LayoutDirection[]{Ltr, Rtl};
    }

    static {
        LayoutDirection[] layoutDirectionArr$values = $values();
        $VALUES = layoutDirectionArr$values;
        $ENTRIES = AbstractC5817a.m5310a(layoutDirectionArr$values);
    }

    private LayoutDirection(String str, int i) {
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return $ENTRIES;
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) $VALUES.clone();
    }
}
