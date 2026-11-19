package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DurationUnit {

    /* renamed from: b */
    public static final DurationUnit f17527b = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: c */
    public static final DurationUnit f17528c = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: d */
    public static final DurationUnit f17529d = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: e */
    public static final DurationUnit f17530e = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: f */
    public static final DurationUnit f17531f = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: g */
    public static final DurationUnit f17532g = new DurationUnit("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: h */
    public static final DurationUnit f17533h = new DurationUnit("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: i */
    public static final /* synthetic */ DurationUnit[] f17534i;

    /* renamed from: j */
    public static final /* synthetic */ InterfaceC9760a f17535j;

    /* renamed from: a */
    public final TimeUnit f17536a;

    static {
        DurationUnit[] durationUnitArrM16191a = m16191a();
        f17534i = durationUnitArrM16191a;
        f17535j = AbstractC9108a.m16085a(durationUnitArrM16191a);
    }

    public DurationUnit(String str, int i10, TimeUnit timeUnit) {
        this.f17536a = timeUnit;
    }

    /* renamed from: a */
    public static final /* synthetic */ DurationUnit[] m16191a() {
        return new DurationUnit[]{f17527b, f17528c, f17529d, f17530e, f17531f, f17532g, f17533h};
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) f17534i.clone();
    }

    /* renamed from: b */
    public final TimeUnit m16192b() {
        return this.f17536a;
    }
}
