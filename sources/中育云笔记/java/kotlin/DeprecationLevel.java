package kotlin;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DeprecationLevel {

    /* renamed from: c */
    public static final DeprecationLevel f23250c = new DeprecationLevel("WARNING", 0);

    /* renamed from: d */
    public static final DeprecationLevel f23251d = new DeprecationLevel("ERROR", 1);

    /* renamed from: e */
    public static final DeprecationLevel f23252e = new DeprecationLevel("HIDDEN", 2);

    /* renamed from: f */
    public static final /* synthetic */ DeprecationLevel[] f23253f;

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC11943a f23254g;

    static {
        DeprecationLevel[] deprecationLevelArrM20045a = m20045a();
        f23253f = deprecationLevelArrM20045a;
        f23254g = AbstractC9953a.m20230a(deprecationLevelArrM20045a);
    }

    public DeprecationLevel(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ DeprecationLevel[] m20045a() {
        return new DeprecationLevel[]{f23250c, f23251d, f23252e};
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f23253f.clone();
    }
}
