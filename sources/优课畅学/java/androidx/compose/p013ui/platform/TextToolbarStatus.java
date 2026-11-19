package androidx.compose.p013ui.platform;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class TextToolbarStatus {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ TextToolbarStatus[] $VALUES;
    public static final TextToolbarStatus Shown = new TextToolbarStatus("Shown", 0);
    public static final TextToolbarStatus Hidden = new TextToolbarStatus("Hidden", 1);

    private static final /* synthetic */ TextToolbarStatus[] $values() {
        return new TextToolbarStatus[]{Shown, Hidden};
    }

    static {
        TextToolbarStatus[] textToolbarStatusArr$values = $values();
        $VALUES = textToolbarStatusArr$values;
        $ENTRIES = AbstractC9108a.m16085a(textToolbarStatusArr$values);
    }

    private TextToolbarStatus(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) $VALUES.clone();
    }
}
