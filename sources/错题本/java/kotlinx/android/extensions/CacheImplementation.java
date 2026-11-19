package kotlinx.android.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p031c7.C3235a;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "Companion", "c7/a", "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", "kotlin-android-extensions-runtime"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class CacheImplementation {

    @NotNull
    public static final C3235a Companion;
    public static final CacheImplementation HASH_MAP;
    public static final CacheImplementation NO_CACHE;
    public static final CacheImplementation SPARSE_ARRAY;

    /* renamed from: a */
    public static final CacheImplementation f9270a;

    /* renamed from: b */
    public static final /* synthetic */ CacheImplementation[] f9271b;

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC5748a f9272c;

    static {
        CacheImplementation cacheImplementation = new CacheImplementation("SPARSE_ARRAY", 0);
        SPARSE_ARRAY = cacheImplementation;
        CacheImplementation cacheImplementation2 = new CacheImplementation("HASH_MAP", 1);
        HASH_MAP = cacheImplementation2;
        CacheImplementation cacheImplementation3 = new CacheImplementation("NO_CACHE", 2);
        NO_CACHE = cacheImplementation3;
        CacheImplementation[] cacheImplementationArr = {cacheImplementation, cacheImplementation2, cacheImplementation3};
        f9271b = cacheImplementationArr;
        f9272c = AbstractC5817a.m5310a(cacheImplementationArr);
        Companion = new C3235a();
        f9270a = cacheImplementation2;
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9272c;
    }

    public static CacheImplementation valueOf(String str) {
        return (CacheImplementation) Enum.valueOf(CacheImplementation.class, str);
    }

    public static CacheImplementation[] values() {
        return (CacheImplementation[]) f9271b.clone();
    }
}
