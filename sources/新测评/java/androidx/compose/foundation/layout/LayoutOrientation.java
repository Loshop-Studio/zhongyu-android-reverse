package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13558d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "(Ljava/lang/String;I)V", "Horizontal", "Vertical", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class LayoutOrientation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LayoutOrientation[] $VALUES;
    public static final LayoutOrientation Horizontal = new LayoutOrientation("Horizontal", 0);
    public static final LayoutOrientation Vertical = new LayoutOrientation("Vertical", 1);

    private static final /* synthetic */ LayoutOrientation[] $values() {
        return new LayoutOrientation[]{Horizontal, Vertical};
    }

    static {
        LayoutOrientation[] layoutOrientationArr$values = $values();
        $VALUES = layoutOrientationArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(layoutOrientationArr$values);
    }

    private LayoutOrientation(String str, int i10) {
    }

    public static EnumEntries<LayoutOrientation> getEntries() {
        return $ENTRIES;
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) $VALUES.clone();
    }
}
