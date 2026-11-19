package androidx.compose.p014ui.unit;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LayoutDirection {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ LayoutDirection[] $VALUES;
    public static final LayoutDirection Ltr = new LayoutDirection("Ltr", 0);
    public static final LayoutDirection Rtl = new LayoutDirection("Rtl", 1);

    private static final /* synthetic */ LayoutDirection[] $values() {
        return new LayoutDirection[]{Ltr, Rtl};
    }

    static {
        LayoutDirection[] layoutDirectionArr$values = $values();
        $VALUES = layoutDirectionArr$values;
        $ENTRIES = AbstractC9953a.m20230a(layoutDirectionArr$values);
    }

    private LayoutDirection(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) $VALUES.clone();
    }
}
