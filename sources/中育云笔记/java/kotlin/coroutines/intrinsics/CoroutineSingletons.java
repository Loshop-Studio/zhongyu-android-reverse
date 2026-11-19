package kotlin.coroutines.intrinsics;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CoroutineSingletons {

    /* renamed from: c */
    public static final CoroutineSingletons f23356c = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);

    /* renamed from: d */
    public static final CoroutineSingletons f23357d = new CoroutineSingletons("UNDECIDED", 1);

    /* renamed from: e */
    public static final CoroutineSingletons f23358e = new CoroutineSingletons("RESUMED", 2);

    /* renamed from: f */
    public static final /* synthetic */ CoroutineSingletons[] f23359f;

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC11943a f23360g;

    static {
        CoroutineSingletons[] coroutineSingletonsArrM20220a = m20220a();
        f23359f = coroutineSingletonsArrM20220a;
        f23360g = AbstractC9953a.m20230a(coroutineSingletonsArrM20220a);
    }

    public CoroutineSingletons(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ CoroutineSingletons[] m20220a() {
        return new CoroutineSingletons[]{f23356c, f23357d, f23358e};
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f23359f.clone();
    }
}
