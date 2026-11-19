package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7880d2 = {"Landroidx/compose/foundation/MutatePriority;", "", "(Ljava/lang/String;I)V", "Default", "UserInput", "PreventUserInput", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class MutatePriority {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MutatePriority[] $VALUES;
    public static final MutatePriority Default = new MutatePriority("Default", 0);
    public static final MutatePriority UserInput = new MutatePriority("UserInput", 1);
    public static final MutatePriority PreventUserInput = new MutatePriority("PreventUserInput", 2);

    private static final /* synthetic */ MutatePriority[] $values() {
        return new MutatePriority[]{Default, UserInput, PreventUserInput};
    }

    static {
        MutatePriority[] mutatePriorityArr$values = $values();
        $VALUES = mutatePriorityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mutatePriorityArr$values);
    }

    private MutatePriority(String str, int i6) {
    }

    public static EnumEntries<MutatePriority> getEntries() {
        return $ENTRIES;
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) $VALUES.clone();
    }
}
