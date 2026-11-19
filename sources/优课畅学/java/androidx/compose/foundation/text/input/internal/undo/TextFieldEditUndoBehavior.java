package androidx.compose.foundation.text.input.internal.undo;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TextFieldEditUndoBehavior {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ TextFieldEditUndoBehavior[] $VALUES;
    public static final TextFieldEditUndoBehavior MergeIfPossible = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
    public static final TextFieldEditUndoBehavior ClearHistory = new TextFieldEditUndoBehavior("ClearHistory", 1);
    public static final TextFieldEditUndoBehavior NeverMerge = new TextFieldEditUndoBehavior("NeverMerge", 2);

    private static final /* synthetic */ TextFieldEditUndoBehavior[] $values() {
        return new TextFieldEditUndoBehavior[]{MergeIfPossible, ClearHistory, NeverMerge};
    }

    static {
        TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr$values = $values();
        $VALUES = textFieldEditUndoBehaviorArr$values;
        $ENTRIES = AbstractC9108a.m16085a(textFieldEditUndoBehaviorArr$values);
    }

    private TextFieldEditUndoBehavior(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) $VALUES.clone();
    }
}
