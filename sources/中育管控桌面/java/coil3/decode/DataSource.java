package coil3.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m7880d2 = {"Lcoil3/decode/DataSource;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "coil-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class DataSource {

    /* renamed from: a */
    public static final DataSource f1619a = new DataSource("MEMORY_CACHE", 0);

    /* renamed from: b */
    public static final DataSource f1620b = new DataSource("MEMORY", 1);

    /* renamed from: c */
    public static final DataSource f1621c = new DataSource("DISK", 2);

    /* renamed from: d */
    public static final DataSource f1622d = new DataSource("NETWORK", 3);

    /* renamed from: e */
    public static final /* synthetic */ DataSource[] f1623e;

    /* renamed from: f */
    public static final /* synthetic */ EnumEntries f1624f;

    static {
        DataSource[] dataSourceArrM1797a = m1797a();
        f1623e = dataSourceArrM1797a;
        f1624f = EnumEntriesKt.enumEntries(dataSourceArrM1797a);
    }

    public DataSource(String str, int i6) {
    }

    /* renamed from: a */
    public static final /* synthetic */ DataSource[] m1797a() {
        return new DataSource[]{f1619a, f1620b, f1621c, f1622d};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f1623e.clone();
    }
}
