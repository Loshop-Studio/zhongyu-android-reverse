package androidx.compose.foundation.text.selection;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CrossStatus {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ CrossStatus[] $VALUES;
    public static final CrossStatus CROSSED = new CrossStatus("CROSSED", 0);
    public static final CrossStatus NOT_CROSSED = new CrossStatus("NOT_CROSSED", 1);
    public static final CrossStatus COLLAPSED = new CrossStatus("COLLAPSED", 2);

    private static final /* synthetic */ CrossStatus[] $values() {
        return new CrossStatus[]{CROSSED, NOT_CROSSED, COLLAPSED};
    }

    static {
        CrossStatus[] crossStatusArr$values = $values();
        $VALUES = crossStatusArr$values;
        $ENTRIES = AbstractC9953a.m20230a(crossStatusArr$values);
    }

    private CrossStatus(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) $VALUES.clone();
    }
}
