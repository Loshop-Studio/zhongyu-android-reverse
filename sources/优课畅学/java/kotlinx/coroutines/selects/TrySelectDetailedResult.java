package kotlinx.coroutines.selects;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TrySelectDetailedResult {

    /* renamed from: a */
    public static final TrySelectDetailedResult f18160a = new TrySelectDetailedResult("SUCCESSFUL", 0);

    /* renamed from: b */
    public static final TrySelectDetailedResult f18161b = new TrySelectDetailedResult("REREGISTER", 1);

    /* renamed from: c */
    public static final TrySelectDetailedResult f18162c = new TrySelectDetailedResult("CANCELLED", 2);

    /* renamed from: d */
    public static final TrySelectDetailedResult f18163d = new TrySelectDetailedResult("ALREADY_SELECTED", 3);

    /* renamed from: e */
    public static final /* synthetic */ TrySelectDetailedResult[] f18164e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC9760a f18165f;

    static {
        TrySelectDetailedResult[] trySelectDetailedResultArrM16872a = m16872a();
        f18164e = trySelectDetailedResultArrM16872a;
        f18165f = AbstractC9108a.m16085a(trySelectDetailedResultArrM16872a);
    }

    public TrySelectDetailedResult(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ TrySelectDetailedResult[] m16872a() {
        return new TrySelectDetailedResult[]{f18160a, f18161b, f18162c, f18163d};
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) f18164e.clone();
    }
}
