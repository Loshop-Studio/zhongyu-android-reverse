package androidx.compose.p013ui.platform;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13558d2 = {"Landroidx/compose/ui/platform/TextToolbarStatus;", "", "(Ljava/lang/String;I)V", "Shown", "Hidden", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class TextToolbarStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextToolbarStatus[] $VALUES;
    public static final TextToolbarStatus Shown = new TextToolbarStatus("Shown", 0);
    public static final TextToolbarStatus Hidden = new TextToolbarStatus("Hidden", 1);

    private static final /* synthetic */ TextToolbarStatus[] $values() {
        return new TextToolbarStatus[]{Shown, Hidden};
    }

    static {
        TextToolbarStatus[] textToolbarStatusArr$values = $values();
        $VALUES = textToolbarStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(textToolbarStatusArr$values);
    }

    private TextToolbarStatus(String str, int i10) {
    }

    public static EnumEntries<TextToolbarStatus> getEntries() {
        return $ENTRIES;
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) $VALUES.clone();
    }
}
