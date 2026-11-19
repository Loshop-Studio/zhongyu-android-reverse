package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7880d2 = {"Landroidx/compose/foundation/text/HandleState;", "", "(Ljava/lang/String;I)V", "None", "Selection", "Cursor", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class HandleState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
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
        $ENTRIES = EnumEntriesKt.enumEntries(handleStateArr$values);
    }

    private HandleState(String str, int i6) {
    }

    public static EnumEntries<HandleState> getEntries() {
        return $ENTRIES;
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) $VALUES.clone();
    }
}
