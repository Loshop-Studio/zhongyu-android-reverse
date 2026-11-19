package androidx.paging;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TerminalSeparatorType {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ TerminalSeparatorType[] $VALUES;
    public static final TerminalSeparatorType FULLY_COMPLETE = new TerminalSeparatorType("FULLY_COMPLETE", 0);
    public static final TerminalSeparatorType SOURCE_COMPLETE = new TerminalSeparatorType("SOURCE_COMPLETE", 1);

    private static final /* synthetic */ TerminalSeparatorType[] $values() {
        return new TerminalSeparatorType[]{FULLY_COMPLETE, SOURCE_COMPLETE};
    }

    static {
        TerminalSeparatorType[] terminalSeparatorTypeArr$values = $values();
        $VALUES = terminalSeparatorTypeArr$values;
        $ENTRIES = AbstractC9953a.m20230a(terminalSeparatorTypeArr$values);
    }

    private TerminalSeparatorType(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static TerminalSeparatorType valueOf(String str) {
        return (TerminalSeparatorType) Enum.valueOf(TerminalSeparatorType.class, str);
    }

    public static TerminalSeparatorType[] values() {
        return (TerminalSeparatorType[]) $VALUES.clone();
    }
}
