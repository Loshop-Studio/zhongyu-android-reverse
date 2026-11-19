package androidx.compose.p014ui.state;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ToggleableState {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ ToggleableState[] $VALUES;

    /* renamed from: On */
    public static final ToggleableState f1281On = new ToggleableState("On", 0);
    public static final ToggleableState Off = new ToggleableState("Off", 1);
    public static final ToggleableState Indeterminate = new ToggleableState("Indeterminate", 2);

    private static final /* synthetic */ ToggleableState[] $values() {
        return new ToggleableState[]{f1281On, Off, Indeterminate};
    }

    static {
        ToggleableState[] toggleableStateArr$values = $values();
        $VALUES = toggleableStateArr$values;
        $ENTRIES = AbstractC9953a.m20230a(toggleableStateArr$values);
    }

    private ToggleableState(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) $VALUES.clone();
    }
}
