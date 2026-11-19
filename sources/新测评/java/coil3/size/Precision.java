package coil3.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Lcoil3/size/Precision;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coil-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class Precision {

    /* renamed from: a */
    public static final Precision f3231a = new Precision("EXACT", 0);

    /* renamed from: b */
    public static final Precision f3232b = new Precision("INEXACT", 1);

    /* renamed from: c */
    public static final /* synthetic */ Precision[] f3233c;

    /* renamed from: d */
    public static final /* synthetic */ EnumEntries f3234d;

    static {
        Precision[] precisionArrM3186a = m3186a();
        f3233c = precisionArrM3186a;
        f3234d = EnumEntriesKt.enumEntries(precisionArrM3186a);
    }

    public Precision(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ Precision[] m3186a() {
        return new Precision[]{f3231a, f3232b};
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) f3233c.clone();
    }
}
