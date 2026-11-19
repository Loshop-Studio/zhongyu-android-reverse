package androidx.compose.foundation.text.selection;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Direction {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction BEFORE = new Direction("BEFORE", 0);

    /* renamed from: ON */
    public static final Direction f1122ON = new Direction("ON", 1);
    public static final Direction AFTER = new Direction("AFTER", 2);

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{BEFORE, f1122ON, AFTER};
    }

    static {
        Direction[] directionArr$values = $values();
        $VALUES = directionArr$values;
        $ENTRIES = AbstractC9953a.m20230a(directionArr$values);
    }

    private Direction(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
