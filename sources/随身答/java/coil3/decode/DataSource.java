package coil3.decode;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13413d2 = {"Lcoil3/decode/DataSource;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "coil-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DataSource {

    /* renamed from: a */
    public static final DataSource f2864a = new DataSource("MEMORY_CACHE", 0);

    /* renamed from: b */
    public static final DataSource f2865b = new DataSource("MEMORY", 1);

    /* renamed from: c */
    public static final DataSource f2866c = new DataSource("DISK", 2);

    /* renamed from: d */
    public static final DataSource f2867d = new DataSource("NETWORK", 3);

    /* renamed from: e */
    public static final /* synthetic */ DataSource[] f2868e;

    /* renamed from: f */
    public static final /* synthetic */ EnumEntries f2869f;

    static {
        DataSource[] dataSourceArrM2695a = m2695a();
        f2868e = dataSourceArrM2695a;
        f2869f = EnumEntriesKt.enumEntries(dataSourceArrM2695a);
    }

    public DataSource(String str, int i9) {
    }

    /* renamed from: a */
    public static final /* synthetic */ DataSource[] m2695a() {
        return new DataSource[]{f2864a, f2865b, f2866c, f2867d};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f2868e.clone();
    }
}
