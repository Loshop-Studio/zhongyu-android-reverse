package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m7880d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "", "(Ljava/lang/String;I)V", "Start", "End", "Inner", "NotByUser", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class TextDeleteType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextDeleteType[] $VALUES;
    public static final TextDeleteType Start = new TextDeleteType("Start", 0);
    public static final TextDeleteType End = new TextDeleteType("End", 1);
    public static final TextDeleteType Inner = new TextDeleteType("Inner", 2);
    public static final TextDeleteType NotByUser = new TextDeleteType("NotByUser", 3);

    private static final /* synthetic */ TextDeleteType[] $values() {
        return new TextDeleteType[]{Start, End, Inner, NotByUser};
    }

    static {
        TextDeleteType[] textDeleteTypeArr$values = $values();
        $VALUES = textDeleteTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(textDeleteTypeArr$values);
    }

    private TextDeleteType(String str, int i6) {
    }

    public static EnumEntries<TextDeleteType> getEntries() {
        return $ENTRIES;
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) $VALUES.clone();
    }
}
