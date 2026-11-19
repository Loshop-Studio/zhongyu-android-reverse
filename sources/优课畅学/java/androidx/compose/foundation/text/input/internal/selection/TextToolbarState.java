package androidx.compose.foundation.text.input.internal.selection;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TextToolbarState {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ TextToolbarState[] $VALUES;
    public static final TextToolbarState None = new TextToolbarState("None", 0);
    public static final TextToolbarState Cursor = new TextToolbarState("Cursor", 1);
    public static final TextToolbarState Selection = new TextToolbarState("Selection", 2);

    private static final /* synthetic */ TextToolbarState[] $values() {
        return new TextToolbarState[]{None, Cursor, Selection};
    }

    static {
        TextToolbarState[] textToolbarStateArr$values = $values();
        $VALUES = textToolbarStateArr$values;
        $ENTRIES = AbstractC9108a.m16085a(textToolbarStateArr$values);
    }

    private TextToolbarState(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) $VALUES.clone();
    }
}
