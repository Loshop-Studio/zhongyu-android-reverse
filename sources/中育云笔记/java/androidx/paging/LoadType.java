package androidx.paging;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LoadType {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ LoadType[] $VALUES;
    public static final LoadType REFRESH = new LoadType("REFRESH", 0);
    public static final LoadType PREPEND = new LoadType("PREPEND", 1);
    public static final LoadType APPEND = new LoadType("APPEND", 2);

    private static final /* synthetic */ LoadType[] $values() {
        return new LoadType[]{REFRESH, PREPEND, APPEND};
    }

    static {
        LoadType[] loadTypeArr$values = $values();
        $VALUES = loadTypeArr$values;
        $ENTRIES = AbstractC9953a.m20230a(loadTypeArr$values);
    }

    private LoadType(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static LoadType valueOf(String str) {
        return (LoadType) Enum.valueOf(LoadType.class, str);
    }

    public static LoadType[] values() {
        return (LoadType[]) $VALUES.clone();
    }
}
