package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DurationUnit {

    /* renamed from: d */
    public static final DurationUnit f23456d = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: e */
    public static final DurationUnit f23457e = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: f */
    public static final DurationUnit f23458f = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: g */
    public static final DurationUnit f23459g = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: h */
    public static final DurationUnit f23460h = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: i */
    public static final DurationUnit f23461i = new DurationUnit("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: j */
    public static final DurationUnit f23462j = new DurationUnit("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: k */
    public static final /* synthetic */ DurationUnit[] f23463k;

    /* renamed from: l */
    public static final /* synthetic */ InterfaceC11943a f23464l;

    /* renamed from: c */
    public final TimeUnit f23465c;

    static {
        DurationUnit[] durationUnitArrM20351a = m20351a();
        f23463k = durationUnitArrM20351a;
        f23464l = AbstractC9953a.m20230a(durationUnitArrM20351a);
    }

    public DurationUnit(String str, int i10, TimeUnit timeUnit) {
        this.f23465c = timeUnit;
    }

    /* renamed from: a */
    public static final /* synthetic */ DurationUnit[] m20351a() {
        return new DurationUnit[]{f23456d, f23457e, f23458f, f23459g, f23460h, f23461i, f23462j};
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) f23463k.clone();
    }

    /* renamed from: c */
    public final TimeUnit m20352c() {
        return this.f23465c;
    }
}
