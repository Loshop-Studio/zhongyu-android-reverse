package coil3.size;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13413d2 = {"Lcoil3/size/Precision;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coil-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class Precision {

    /* renamed from: a */
    public static final Precision f3119a = new Precision("EXACT", 0);

    /* renamed from: b */
    public static final Precision f3120b = new Precision("INEXACT", 1);

    /* renamed from: c */
    public static final /* synthetic */ Precision[] f3121c;

    /* renamed from: d */
    public static final /* synthetic */ EnumEntries f3122d;

    static {
        Precision[] precisionArrM2906a = m2906a();
        f3121c = precisionArrM2906a;
        f3122d = EnumEntriesKt.enumEntries(precisionArrM2906a);
    }

    public Precision(String str, int i9) {
    }

    /* renamed from: a */
    public static final /* synthetic */ Precision[] m2906a() {
        return new Precision[]{f3119a, f3120b};
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) f3121c.clone();
    }
}
