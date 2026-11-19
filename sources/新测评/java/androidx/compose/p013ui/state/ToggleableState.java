package androidx.compose.p013ui.state;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Landroidx/compose/ui/state/ToggleableState;", "", "(Ljava/lang/String;I)V", "On", "Off", "Indeterminate", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class ToggleableState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ToggleableState[] $VALUES;

    /* renamed from: On */
    public static final ToggleableState f1454On = new ToggleableState("On", 0);
    public static final ToggleableState Off = new ToggleableState("Off", 1);
    public static final ToggleableState Indeterminate = new ToggleableState("Indeterminate", 2);

    private static final /* synthetic */ ToggleableState[] $values() {
        return new ToggleableState[]{f1454On, Off, Indeterminate};
    }

    static {
        ToggleableState[] toggleableStateArr$values = $values();
        $VALUES = toggleableStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(toggleableStateArr$values);
    }

    private ToggleableState(String str, int i10) {
    }

    public static EnumEntries<ToggleableState> getEntries() {
        return $ENTRIES;
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) $VALUES.clone();
    }
}
