package coil3.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13558d2 = {"Lcoil3/decode/DataSource;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "coil-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class DataSource {

    /* renamed from: a */
    public static final DataSource f2935a = new DataSource("MEMORY_CACHE", 0);

    /* renamed from: b */
    public static final DataSource f2936b = new DataSource("MEMORY", 1);

    /* renamed from: c */
    public static final DataSource f2937c = new DataSource("DISK", 2);

    /* renamed from: d */
    public static final DataSource f2938d = new DataSource("NETWORK", 3);

    /* renamed from: e */
    public static final /* synthetic */ DataSource[] f2939e;

    /* renamed from: f */
    public static final /* synthetic */ EnumEntries f2940f;

    static {
        DataSource[] dataSourceArrM2970a = m2970a();
        f2939e = dataSourceArrM2970a;
        f2940f = EnumEntriesKt.enumEntries(dataSourceArrM2970a);
    }

    public DataSource(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ DataSource[] m2970a() {
        return new DataSource[]{f2935a, f2936b, f2937c, f2938d};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f2939e.clone();
    }
}
