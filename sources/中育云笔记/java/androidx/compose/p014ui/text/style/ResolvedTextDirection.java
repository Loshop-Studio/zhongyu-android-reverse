package androidx.compose.p014ui.text.style;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ResolvedTextDirection {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ ResolvedTextDirection[] $VALUES;
    public static final ResolvedTextDirection Ltr = new ResolvedTextDirection("Ltr", 0);
    public static final ResolvedTextDirection Rtl = new ResolvedTextDirection("Rtl", 1);

    private static final /* synthetic */ ResolvedTextDirection[] $values() {
        return new ResolvedTextDirection[]{Ltr, Rtl};
    }

    static {
        ResolvedTextDirection[] resolvedTextDirectionArr$values = $values();
        $VALUES = resolvedTextDirectionArr$values;
        $ENTRIES = AbstractC9953a.m20230a(resolvedTextDirectionArr$values);
    }

    private ResolvedTextDirection(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static ResolvedTextDirection valueOf(String str) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, str);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) $VALUES.clone();
    }
}
