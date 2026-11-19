package kotlin.reflect;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class KVisibility {

    /* renamed from: a */
    public static final KVisibility f17505a = new KVisibility("PUBLIC", 0);

    /* renamed from: b */
    public static final KVisibility f17506b = new KVisibility("PROTECTED", 1);

    /* renamed from: c */
    public static final KVisibility f17507c = new KVisibility("INTERNAL", 2);

    /* renamed from: d */
    public static final KVisibility f17508d = new KVisibility("PRIVATE", 3);

    /* renamed from: e */
    public static final /* synthetic */ KVisibility[] f17509e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC9760a f17510f;

    static {
        KVisibility[] kVisibilityArrM16174a = m16174a();
        f17509e = kVisibilityArrM16174a;
        f17510f = AbstractC9108a.m16085a(kVisibilityArrM16174a);
    }

    public KVisibility(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ KVisibility[] m16174a() {
        return new KVisibility[]{f17505a, f17506b, f17507c, f17508d};
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f17509e.clone();
    }
}
