package androidx.compose.foundation.layout;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IntrinsicSize {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ IntrinsicSize[] $VALUES;
    public static final IntrinsicSize Min = new IntrinsicSize("Min", 0);
    public static final IntrinsicSize Max = new IntrinsicSize("Max", 1);

    private static final /* synthetic */ IntrinsicSize[] $values() {
        return new IntrinsicSize[]{Min, Max};
    }

    static {
        IntrinsicSize[] intrinsicSizeArr$values = $values();
        $VALUES = intrinsicSizeArr$values;
        $ENTRIES = AbstractC9953a.m20230a(intrinsicSizeArr$values);
    }

    private IntrinsicSize(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) $VALUES.clone();
    }
}
