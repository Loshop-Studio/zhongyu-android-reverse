package coil3.decode;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DataSource {

    /* renamed from: c */
    public static final DataSource f3610c = new DataSource("MEMORY_CACHE", 0);

    /* renamed from: d */
    public static final DataSource f3611d = new DataSource("MEMORY", 1);

    /* renamed from: e */
    public static final DataSource f3612e = new DataSource("DISK", 2);

    /* renamed from: f */
    public static final DataSource f3613f = new DataSource("NETWORK", 3);

    /* renamed from: g */
    public static final /* synthetic */ DataSource[] f3614g;

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC11943a f3615h;

    static {
        DataSource[] dataSourceArrM3064a = m3064a();
        f3614g = dataSourceArrM3064a;
        f3615h = AbstractC9953a.m20230a(dataSourceArrM3064a);
    }

    public DataSource(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ DataSource[] m3064a() {
        return new DataSource[]{f3610c, f3611d, f3612e, f3613f};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f3614g.clone();
    }
}
