package coil3.decode;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"Lcoil3/decode/DataSource;", "", "MEMORY_CACHE", "MEMORY", "DISK", "NETWORK", "coil-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class DataSource {
    public static final DataSource DISK;
    public static final DataSource MEMORY;
    public static final DataSource MEMORY_CACHE;
    public static final DataSource NETWORK;

    /* renamed from: a */
    public static final /* synthetic */ DataSource[] f1888a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f1889b;

    static {
        DataSource dataSource = new DataSource("MEMORY_CACHE", 0);
        MEMORY_CACHE = dataSource;
        DataSource dataSource2 = new DataSource("MEMORY", 1);
        MEMORY = dataSource2;
        DataSource dataSource3 = new DataSource("DISK", 2);
        DISK = dataSource3;
        DataSource dataSource4 = new DataSource("NETWORK", 3);
        NETWORK = dataSource4;
        DataSource[] dataSourceArr = {dataSource, dataSource2, dataSource3, dataSource4};
        f1888a = dataSourceArr;
        f1889b = AbstractC5817a.m5310a(dataSourceArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f1889b;
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) f1888a.clone();
    }
}
