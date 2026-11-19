package kotlin;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LazyThreadSafetyMode {

    /* renamed from: c */
    public static final LazyThreadSafetyMode f23256c = new LazyThreadSafetyMode("SYNCHRONIZED", 0);

    /* renamed from: d */
    public static final LazyThreadSafetyMode f23257d = new LazyThreadSafetyMode("PUBLICATION", 1);

    /* renamed from: e */
    public static final LazyThreadSafetyMode f23258e = new LazyThreadSafetyMode("NONE", 2);

    /* renamed from: f */
    public static final /* synthetic */ LazyThreadSafetyMode[] f23259f;

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC11943a f23260g;

    static {
        LazyThreadSafetyMode[] lazyThreadSafetyModeArrM20046a = m20046a();
        f23259f = lazyThreadSafetyModeArrM20046a;
        f23260g = AbstractC9953a.m20230a(lazyThreadSafetyModeArrM20046a);
    }

    public LazyThreadSafetyMode(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ LazyThreadSafetyMode[] m20046a() {
        return new LazyThreadSafetyMode[]{f23256c, f23257d, f23258e};
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f23259f.clone();
    }
}
