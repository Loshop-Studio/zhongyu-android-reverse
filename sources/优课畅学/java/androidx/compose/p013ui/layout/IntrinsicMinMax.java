package androidx.compose.p013ui.layout;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IntrinsicMinMax {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ IntrinsicMinMax[] $VALUES;
    public static final IntrinsicMinMax Min = new IntrinsicMinMax("Min", 0);
    public static final IntrinsicMinMax Max = new IntrinsicMinMax("Max", 1);

    private static final /* synthetic */ IntrinsicMinMax[] $values() {
        return new IntrinsicMinMax[]{Min, Max};
    }

    static {
        IntrinsicMinMax[] intrinsicMinMaxArr$values = $values();
        $VALUES = intrinsicMinMaxArr$values;
        $ENTRIES = AbstractC9108a.m16085a(intrinsicMinMaxArr$values);
    }

    private IntrinsicMinMax(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) $VALUES.clone();
    }
}
