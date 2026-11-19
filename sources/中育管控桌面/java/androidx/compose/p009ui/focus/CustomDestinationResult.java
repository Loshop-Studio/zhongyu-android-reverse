package androidx.compose.p009ui.focus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m7880d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "(Ljava/lang/String;I)V", "None", "Cancelled", "Redirected", "RedirectCancelled", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class CustomDestinationResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CustomDestinationResult[] $VALUES;
    public static final CustomDestinationResult None = new CustomDestinationResult("None", 0);
    public static final CustomDestinationResult Cancelled = new CustomDestinationResult("Cancelled", 1);
    public static final CustomDestinationResult Redirected = new CustomDestinationResult("Redirected", 2);
    public static final CustomDestinationResult RedirectCancelled = new CustomDestinationResult("RedirectCancelled", 3);

    private static final /* synthetic */ CustomDestinationResult[] $values() {
        return new CustomDestinationResult[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    static {
        CustomDestinationResult[] customDestinationResultArr$values = $values();
        $VALUES = customDestinationResultArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(customDestinationResultArr$values);
    }

    private CustomDestinationResult(String str, int i6) {
    }

    public static EnumEntries<CustomDestinationResult> getEntries() {
        return $ENTRIES;
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) $VALUES.clone();
    }
}
