package kotlin.coroutines.intrinsics;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CoroutineSingletons {

    /* renamed from: a */
    public static final CoroutineSingletons f17443a = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);

    /* renamed from: b */
    public static final CoroutineSingletons f17444b = new CoroutineSingletons("UNDECIDED", 1);

    /* renamed from: c */
    public static final CoroutineSingletons f17445c = new CoroutineSingletons("RESUMED", 2);

    /* renamed from: d */
    public static final /* synthetic */ CoroutineSingletons[] f17446d;

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC9760a f17447e;

    static {
        CoroutineSingletons[] coroutineSingletonsArrM16075a = m16075a();
        f17446d = coroutineSingletonsArrM16075a;
        f17447e = AbstractC9108a.m16085a(coroutineSingletonsArrM16075a);
    }

    public CoroutineSingletons(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ CoroutineSingletons[] m16075a() {
        return new CoroutineSingletons[]{f17443a, f17444b, f17445c};
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f17446d.clone();
    }
}
