package kotlinx.coroutines.selects;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TrySelectDetailedResult {

    /* renamed from: c */
    public static final TrySelectDetailedResult f24033c = new TrySelectDetailedResult("SUCCESSFUL", 0);

    /* renamed from: d */
    public static final TrySelectDetailedResult f24034d = new TrySelectDetailedResult("REREGISTER", 1);

    /* renamed from: e */
    public static final TrySelectDetailedResult f24035e = new TrySelectDetailedResult("CANCELLED", 2);

    /* renamed from: f */
    public static final TrySelectDetailedResult f24036f = new TrySelectDetailedResult("ALREADY_SELECTED", 3);

    /* renamed from: g */
    public static final /* synthetic */ TrySelectDetailedResult[] f24037g;

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC11943a f24038h;

    static {
        TrySelectDetailedResult[] trySelectDetailedResultArrM20996a = m20996a();
        f24037g = trySelectDetailedResultArrM20996a;
        f24038h = AbstractC9953a.m20230a(trySelectDetailedResultArrM20996a);
    }

    public TrySelectDetailedResult(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ TrySelectDetailedResult[] m20996a() {
        return new TrySelectDetailedResult[]{f24033c, f24034d, f24035e, f24036f};
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) f24037g.clone();
    }
}
