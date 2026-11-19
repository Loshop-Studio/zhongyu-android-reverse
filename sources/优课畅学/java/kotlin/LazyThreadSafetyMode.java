package kotlin;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LazyThreadSafetyMode {

    /* renamed from: a */
    public static final LazyThreadSafetyMode f17343a = new LazyThreadSafetyMode("SYNCHRONIZED", 0);

    /* renamed from: b */
    public static final LazyThreadSafetyMode f17344b = new LazyThreadSafetyMode("PUBLICATION", 1);

    /* renamed from: c */
    public static final LazyThreadSafetyMode f17345c = new LazyThreadSafetyMode("NONE", 2);

    /* renamed from: d */
    public static final /* synthetic */ LazyThreadSafetyMode[] f17346d;

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC9760a f17347e;

    static {
        LazyThreadSafetyMode[] lazyThreadSafetyModeArrM15901a = m15901a();
        f17346d = lazyThreadSafetyModeArrM15901a;
        f17347e = AbstractC9108a.m16085a(lazyThreadSafetyModeArrM15901a);
    }

    public LazyThreadSafetyMode(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ LazyThreadSafetyMode[] m15901a() {
        return new LazyThreadSafetyMode[]{f17343a, f17344b, f17345c};
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f17346d.clone();
    }
}
