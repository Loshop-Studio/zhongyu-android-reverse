package androidx.compose.foundation.text.selection;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class DownResolution {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ DownResolution[] $VALUES;

    /* renamed from: Up */
    public static final DownResolution f1193Up = new DownResolution("Up", 0);
    public static final DownResolution Drag = new DownResolution("Drag", 1);
    public static final DownResolution Timeout = new DownResolution("Timeout", 2);
    public static final DownResolution Cancel = new DownResolution("Cancel", 3);

    private static final /* synthetic */ DownResolution[] $values() {
        return new DownResolution[]{f1193Up, Drag, Timeout, Cancel};
    }

    static {
        DownResolution[] downResolutionArr$values = $values();
        $VALUES = downResolutionArr$values;
        $ENTRIES = AbstractC9108a.m16085a(downResolutionArr$values);
    }

    private DownResolution(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) $VALUES.clone();
    }
}
