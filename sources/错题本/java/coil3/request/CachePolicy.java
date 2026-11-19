package coil3.request;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m5110d2 = {"Lcoil3/request/CachePolicy;", "", "", "readEnabled", "Z", "getReadEnabled", "()Z", "writeEnabled", "getWriteEnabled", "ENABLED", "READ_ONLY", "WRITE_ONLY", "DISABLED", "coil-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CachePolicy {
    public static final CachePolicy DISABLED;
    public static final CachePolicy ENABLED;
    public static final CachePolicy READ_ONLY;
    public static final CachePolicy WRITE_ONLY;

    /* renamed from: a */
    public static final /* synthetic */ CachePolicy[] f2050a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f2051b;
    private final boolean readEnabled;
    private final boolean writeEnabled;

    static {
        CachePolicy cachePolicy = new CachePolicy("ENABLED", 0, true, true);
        ENABLED = cachePolicy;
        CachePolicy cachePolicy2 = new CachePolicy("READ_ONLY", 1, true, false);
        READ_ONLY = cachePolicy2;
        CachePolicy cachePolicy3 = new CachePolicy("WRITE_ONLY", 2, false, true);
        WRITE_ONLY = cachePolicy3;
        CachePolicy cachePolicy4 = new CachePolicy("DISABLED", 3, false, false);
        DISABLED = cachePolicy4;
        CachePolicy[] cachePolicyArr = {cachePolicy, cachePolicy2, cachePolicy3, cachePolicy4};
        f2050a = cachePolicyArr;
        f2051b = AbstractC5817a.m5310a(cachePolicyArr);
    }

    public CachePolicy(String str, int i, boolean z8, boolean z9) {
        this.readEnabled = z8;
        this.writeEnabled = z9;
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f2051b;
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) f2050a.clone();
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
