package androidx.compose.foundation.text;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Handle {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ Handle[] $VALUES;
    public static final Handle Cursor = new Handle("Cursor", 0);
    public static final Handle SelectionStart = new Handle("SelectionStart", 1);
    public static final Handle SelectionEnd = new Handle("SelectionEnd", 2);

    private static final /* synthetic */ Handle[] $values() {
        return new Handle[]{Cursor, SelectionStart, SelectionEnd};
    }

    static {
        Handle[] handleArr$values = $values();
        $VALUES = handleArr$values;
        $ENTRIES = AbstractC9953a.m20230a(handleArr$values);
    }

    private Handle(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) $VALUES.clone();
    }
}
