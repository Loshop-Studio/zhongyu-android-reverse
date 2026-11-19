package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Landroidx/compose/foundation/text/selection/Direction;", "", "(Ljava/lang/String;I)V", "BEFORE", "ON", "AFTER", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class Direction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction BEFORE = new Direction("BEFORE", 0);

    /* renamed from: ON */
    public static final Direction f1295ON = new Direction("ON", 1);
    public static final Direction AFTER = new Direction("AFTER", 2);

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{BEFORE, f1295ON, AFTER};
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
