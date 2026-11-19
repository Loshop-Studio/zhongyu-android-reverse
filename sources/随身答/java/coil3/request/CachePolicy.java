package coil3.request;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m13413d2 = {"Lcoil3/request/CachePolicy;", "", "", "readEnabled", "writeEnabled", "<init>", "(Ljava/lang/String;IZZ)V", "a", "Z", "c", "()Z", "b", "g", "d", "e", "f", "coil-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CachePolicy {

    /* renamed from: c */
    public static final CachePolicy f3097c = new CachePolicy("ENABLED", 0, true, true);

    /* renamed from: d */
    public static final CachePolicy f3098d = new CachePolicy("READ_ONLY", 1, true, false);

    /* renamed from: e */
    public static final CachePolicy f3099e = new CachePolicy("WRITE_ONLY", 2, false, true);

    /* renamed from: f */
    public static final CachePolicy f3100f = new CachePolicy("DISABLED", 3, false, false);

    /* renamed from: g */
    public static final /* synthetic */ CachePolicy[] f3101g;

    /* renamed from: h */
    public static final /* synthetic */ EnumEntries f3102h;

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean readEnabled;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean writeEnabled;

    static {
        CachePolicy[] cachePolicyArrM2895a = m2895a();
        f3101g = cachePolicyArrM2895a;
        f3102h = EnumEntriesKt.enumEntries(cachePolicyArrM2895a);
    }

    public CachePolicy(String str, int i9, boolean z9, boolean z10) {
        this.readEnabled = z9;
        this.writeEnabled = z10;
    }

    /* renamed from: a */
    public static final /* synthetic */ CachePolicy[] m2895a() {
        return new CachePolicy[]{f3097c, f3098d, f3099e, f3100f};
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) f3101g.clone();
    }

    /* renamed from: c, reason: from getter */
    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
