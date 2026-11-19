package androidx.compose.foundation.text;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HandleState {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ HandleState[] $VALUES;
    public static final HandleState None = new HandleState("None", 0);
    public static final HandleState Selection = new HandleState("Selection", 1);
    public static final HandleState Cursor = new HandleState("Cursor", 2);

    private static final /* synthetic */ HandleState[] $values() {
        return new HandleState[]{None, Selection, Cursor};
    }

    static {
        HandleState[] handleStateArr$values = $values();
        $VALUES = handleStateArr$values;
        $ENTRIES = AbstractC9953a.m20230a(handleStateArr$values);
    }

    private HandleState(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) $VALUES.clone();
    }
}
