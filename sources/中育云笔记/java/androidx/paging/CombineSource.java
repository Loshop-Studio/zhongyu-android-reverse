package androidx.paging;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CombineSource {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ CombineSource[] $VALUES;
    public static final CombineSource INITIAL = new CombineSource("INITIAL", 0);
    public static final CombineSource RECEIVER = new CombineSource("RECEIVER", 1);
    public static final CombineSource OTHER = new CombineSource("OTHER", 2);

    private static final /* synthetic */ CombineSource[] $values() {
        return new CombineSource[]{INITIAL, RECEIVER, OTHER};
    }

    static {
        CombineSource[] combineSourceArr$values = $values();
        $VALUES = combineSourceArr$values;
        $ENTRIES = AbstractC9953a.m20230a(combineSourceArr$values);
    }

    private CombineSource(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static CombineSource valueOf(String str) {
        return (CombineSource) Enum.valueOf(CombineSource.class, str);
    }

    public static CombineSource[] values() {
        return (CombineSource[]) $VALUES.clone();
    }
}
