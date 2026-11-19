package coil3.request;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m7880d2 = {"Lcoil3/request/CachePolicy;", "", "", "readEnabled", "writeEnabled", "<init>", "(Ljava/lang/String;IZZ)V", "a", "Z", "b", "()Z", "c", "d", "e", "f", "coil-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class CachePolicy {

    /* renamed from: c */
    public static final CachePolicy f1893c = new CachePolicy("ENABLED", 0, true, true);

    /* renamed from: d */
    public static final CachePolicy f1894d = new CachePolicy("READ_ONLY", 1, true, false);

    /* renamed from: e */
    public static final CachePolicy f1895e = new CachePolicy("WRITE_ONLY", 2, false, true);

    /* renamed from: f */
    public static final CachePolicy f1896f = new CachePolicy("DISABLED", 3, false, false);

    /* renamed from: g */
    public static final /* synthetic */ CachePolicy[] f1897g;

    /* renamed from: h */
    public static final /* synthetic */ EnumEntries f1898h;

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean readEnabled;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean writeEnabled;

    static {
        CachePolicy[] cachePolicyArrM2001a = m2001a();
        f1897g = cachePolicyArrM2001a;
        f1898h = EnumEntriesKt.enumEntries(cachePolicyArrM2001a);
    }

    public CachePolicy(String str, int i6, boolean z6, boolean z7) {
        this.readEnabled = z6;
        this.writeEnabled = z7;
    }

    /* renamed from: a */
    public static final /* synthetic */ CachePolicy[] m2001a() {
        return new CachePolicy[]{f1893c, f1894d, f1895e, f1896f};
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) f1897g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
