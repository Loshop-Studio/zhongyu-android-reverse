package androidx.compose.p009ui.unit;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m7880d2 = {"Landroidx/compose/ui/unit/LayoutDirection;", "", "(Ljava/lang/String;I)V", "Ltr", "Rtl", "ui-unit_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class LayoutDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LayoutDirection[] $VALUES;
    public static final LayoutDirection Ltr = new LayoutDirection("Ltr", 0);
    public static final LayoutDirection Rtl = new LayoutDirection("Rtl", 1);

    private static final /* synthetic */ LayoutDirection[] $values() {
        return new LayoutDirection[]{Ltr, Rtl};
    }

    static {
        LayoutDirection[] layoutDirectionArr$values = $values();
        $VALUES = layoutDirectionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(layoutDirectionArr$values);
    }

    private LayoutDirection(String str, int i6) {
    }

    public static EnumEntries<LayoutDirection> getEntries() {
        return $ENTRIES;
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) $VALUES.clone();
    }
}
