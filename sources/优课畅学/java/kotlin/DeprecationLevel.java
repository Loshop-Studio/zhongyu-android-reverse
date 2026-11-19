package kotlin;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DeprecationLevel {

    /* renamed from: a */
    public static final DeprecationLevel f17337a = new DeprecationLevel("WARNING", 0);

    /* renamed from: b */
    public static final DeprecationLevel f17338b = new DeprecationLevel("ERROR", 1);

    /* renamed from: c */
    public static final DeprecationLevel f17339c = new DeprecationLevel("HIDDEN", 2);

    /* renamed from: d */
    public static final /* synthetic */ DeprecationLevel[] f17340d;

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC9760a f17341e;

    static {
        DeprecationLevel[] deprecationLevelArrM15900a = m15900a();
        f17340d = deprecationLevelArrM15900a;
        f17341e = AbstractC9108a.m16085a(deprecationLevelArrM15900a);
    }

    public DeprecationLevel(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ DeprecationLevel[] m15900a() {
        return new DeprecationLevel[]{f17337a, f17338b, f17339c};
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f17340d.clone();
    }
}
