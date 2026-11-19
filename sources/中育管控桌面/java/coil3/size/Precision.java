package coil3.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7880d2 = {"Lcoil3/size/Precision;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coil-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class Precision {

    /* renamed from: a */
    public static final Precision f1915a = new Precision("EXACT", 0);

    /* renamed from: b */
    public static final Precision f1916b = new Precision("INEXACT", 1);

    /* renamed from: c */
    public static final /* synthetic */ Precision[] f1917c;

    /* renamed from: d */
    public static final /* synthetic */ EnumEntries f1918d;

    static {
        Precision[] precisionArrM2012a = m2012a();
        f1917c = precisionArrM2012a;
        f1918d = EnumEntriesKt.enumEntries(precisionArrM2012a);
    }

    public Precision(String str, int i6) {
    }

    /* renamed from: a */
    public static final /* synthetic */ Precision[] m2012a() {
        return new Precision[]{f1915a, f1916b};
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) f1917c.clone();
    }
}
