package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Landroidx/compose/foundation/layout/Direction;", "", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "Both", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class Direction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction Vertical = new Direction("Vertical", 0);
    public static final Direction Horizontal = new Direction("Horizontal", 1);
    public static final Direction Both = new Direction("Both", 2);

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{Vertical, Horizontal, Both};
    }

    static {
        Direction[] directionArr$values = $values();
        $VALUES = directionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(directionArr$values);
    }

    private Direction(String str, int i10) {
    }

    public static EnumEntries<Direction> getEntries() {
        return $ENTRIES;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
