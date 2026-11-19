package androidx.compose.foundation.text.input.internal;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WedgeAffinity {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ WedgeAffinity[] $VALUES;
    public static final WedgeAffinity Start = new WedgeAffinity("Start", 0);
    public static final WedgeAffinity End = new WedgeAffinity("End", 1);

    private static final /* synthetic */ WedgeAffinity[] $values() {
        return new WedgeAffinity[]{Start, End};
    }

    static {
        WedgeAffinity[] wedgeAffinityArr$values = $values();
        $VALUES = wedgeAffinityArr$values;
        $ENTRIES = AbstractC9953a.m20230a(wedgeAffinityArr$values);
    }

    private WedgeAffinity(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) $VALUES.clone();
    }
}
